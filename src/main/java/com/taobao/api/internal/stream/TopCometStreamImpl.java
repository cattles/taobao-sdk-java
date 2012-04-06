package com.taobao.api.internal.stream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

import com.taobao.api.internal.stream.connect.ConnectionLifeCycleListener;
import com.taobao.api.internal.stream.connect.HttpClient;
import com.taobao.api.internal.stream.connect.HttpResponse;
import com.taobao.api.internal.stream.message.MessageStreamImpl;
import com.taobao.api.internal.stream.message.StreamMsgConsumeFactory;
import com.taobao.api.internal.stream.message.TopCometMessageListener;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * 
 * @author zhenzi 2011-8-9 上午09:59:31
 */
public class TopCometStreamImpl implements TopCometStream {
	private static final Logger logger = Logger
			.getLogger(TopCometStreamImpl.class);
	private ConnectionLifeCycleListener connectionListener;
	private TopCometMessageListener cometMessageListener;
	private Configuration conf;
	private HttpClient httpClient;
	private StreamMsgConsumeFactory msgConsumeFactory = null;
	/**
	 * 停掉
	 */
	private boolean stop = false;
	/*
	 * 各种状态
	 */
	private String serverRespCode;
	private ReentrantLock lock = new ReentrantLock();
	private Condition controlCondition = lock.newCondition();

	private int startConsumeThreadTimes = 0;
	private long lastStartConsumeThread = System.currentTimeMillis();

	private StreamImplementation currentStreamImpl;

	protected TopCometStreamImpl(Configuration conf) {
		this.conf = conf;
	}

	public void setConnectionListener(
			ConnectionLifeCycleListener connectionLifeCycleListener) {
		this.connectionListener = connectionLifeCycleListener;
	}

	public void setMessageListener(TopCometMessageListener cometMessageListener) {
		this.cometMessageListener = cometMessageListener;
	}

	public void start() {
		if (cometMessageListener == null) {
			throw new RuntimeException("Comet message listener must not null");
		}
		TaobaoHashMap param = new TaobaoHashMap();
		param.put(StreamConstants.PARAM_APPKEY, conf.getAppkey());
		if (!StringUtils.isEmpty(conf.getUserid())) {
			param.put(StreamConstants.PARAM_USERID, conf.getUserid());
		}
		String timestamp = String.valueOf(System.currentTimeMillis());
		param.put(StreamConstants.PARAM_TIMESTAMP, timestamp);
		RequestParametersHolder paramHolder = new RequestParametersHolder();
		paramHolder.setProtocalMustParams(param);
		String sign = null;
		try {
			sign = TaobaoUtils.signTopRequestNew(paramHolder, conf.getSecret(),
					false);
			if (StringUtils.isEmpty(sign)) {
				throw new RuntimeException("Get sign error");
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		param.put(StreamConstants.PARAM_SIGN, sign);
		httpClient = new HttpClient(conf, param);
		msgConsumeFactory = new StreamMsgConsumeFactory(conf.getMinThreads(),
				conf.getMaxThreads(), conf.getQueueSize());

		new Thread(new ControlThread(), "stream-control-thread").start();
	}

	public StreamImplementation getMsgStreamImpl()
			throws TopCometSysErrorException {
		HttpResponse response;
		try {
			response = httpClient.post();
		} catch (TopCometSysErrorException e) {
			if (connectionListener != null) {
				connectionListener.onConnectError(e);
			}
			throw e;
		}
		return currentStreamImpl = new MessageStreamImpl(msgConsumeFactory,
				response, cometMessageListener, this);
	}

	class ControlThread implements Runnable {
		private long lastCheckTime = 0;
		private static final String threadName = "top-stream-consume-thread";
		private boolean isClientReConnect = false;
		private boolean isStarted = false;
		private TopCometStreamConsume currentStreamConsume;
		public void run() {
			while (!stop) {
				try {
					if (StreamConstants.SERVER_DEPLOY.equals(serverRespCode)) {// 服务端在发布
						if (logger.isDebugEnabled()) {
							logger.debug("Server is upgrade sleep "
									+ conf.getSleepTimeOfServerInUpgrade()
									+ " seconds");
						}
						try {
							Thread.sleep(conf.getSleepTimeOfServerInUpgrade() * 1000);
						} catch (InterruptedException e) {
							// ignore;
						}
						startConsumeThread();
					} else if (StreamConstants.SERVER_REHASH
							.equals(serverRespCode)) {// 服务端主动断开了所有的连接
						startConsumeThread();
					} else if ((StreamConstants.CLIENT_KICKOFF
							.equals(serverRespCode) && !isClientReConnect)
							|| StreamConstants.SERVER_KICKOFF
									.equals(serverRespCode)) {// 被客户端的另外一个连接踢掉了,或者服务端踢掉了
						break;// 终止掉当前线程
					} else if (StreamConstants.CONNECT_REACH_MAX_TIME
							.equals(serverRespCode)) {// 连接到达最大时间
						startConsumeThread();
					} else if (StreamConstants.RECONNECT.equals(serverRespCode)){
						startConsumeThread();
					}else {// 第一次建立连接
						if (!isStarted) {
							startConsumeThread();
							isStarted = true;
						}
					}
					if (System.currentTimeMillis() - lastCheckTime < (conf.getHttpReconnectInterval() - 5 * 60) * 1000) {
						try {
							lock.lock();
							serverRespCode = null;
							controlCondition.await(5, TimeUnit.MINUTES);
						} catch (Exception e) {
							// ignore;
						} finally {
							lock.unlock();
						}
					} else {
						serverRespCode = StreamConstants.RECONNECT;
						currentStreamConsume.notify.set(false);
						isClientReConnect = true;
						if(connectionListener != null){
							connectionListener.onReconnect();
						}
					}
				} catch (Throwable e) {
					logger.error(e, e);
					logger.error("Occur some error,stop the stream consume");
					stop = true;
					try {
						lock.lock();
						controlCondition.signalAll();
					} catch (Exception ex) {
						// ignore
					} finally {
						lock.unlock();
					}
				}
			}
			if (currentStreamImpl != null) {
				try {
					currentStreamImpl.close();
				} catch (IOException e) {
					// ignore
				}
			}
			msgConsumeFactory.shutdown();
			logger.info("Stop stream consume");
		}
		
		private void startConsumeThread() {
			currentStreamConsume = new TopCometStreamConsume();
			Thread consumeThread = new Thread(currentStreamConsume,
					threadName);
//			consumeThread.setDaemon(true);
			consumeThread.start();
			lastCheckTime = lastStartConsumeThread = System.currentTimeMillis();
		}

	}

	class TopCometStreamConsume implements Runnable {
		private StreamImplementation stream;
		private boolean closed = false;
		protected AtomicBoolean notify = new AtomicBoolean(true);
		TopCometStreamConsume() {
		}

		public void run() {
			boolean connected = false;
			while (!closed) {
				try {
					if (!closed && null == stream) {
						if (logger.isDebugEnabled()) {
							logger.debug("Establishing connection.");
						}
						stream = getStream();
						connected = true;
						if (logger.isDebugEnabled()) {
							logger.info("Connection established.");
						}
						if (connectionListener != null) {
							try {
								connectionListener.onConnect();
							} catch (Exception e) {
								logger.warn(e.getMessage());
							}
						}
						// connection established successfully
						if (logger.isDebugEnabled()) {
							logger.debug("Receiving message stream.");
						}
						while (!closed) {
							try {
								stream.nextMsg();
							} catch (IOException e) {
								stream.onException(e);
								closed = true;
								if(connectionListener != null){
									connectionListener.onReadTimeout();
								}
								throw e;
							}
						}
					}
				} catch (Exception ex) {
					logger.error(ex.getMessage(), ex);
					if (stream != null) {
						try {
							stream.close();
						} catch (IOException e) {
							logger.error(e, e);
						}
					}
					stream = null;
					connected = false;
					closed = true;
					if (ex instanceof TopCometSysErrorException) {// 在连接的时候出现了系统错误，比如sign出错，丢失参数等
						stop = true;
						if (connectionListener != null) {
							connectionListener.onSysErrorException(ex);
						}
					} else {
						if(connectionListener != null){
							connectionListener.onException(ex);
						}
						/**
						 * 30分钟内发送了10次IOException
						 */
						if (System.currentTimeMillis() - lastStartConsumeThread <  30 * 60 * 1000) {//短时间内由于读取IOException连接了10次，则退出
							startConsumeThreadTimes++;
							if (startConsumeThreadTimes >= 10) {
								stop = true;
								if(connectionListener != null){
									connectionListener.onMaxReadTimeoutException();
								}
								logger.error("Occure too many exception,stop the system,please check");
							}
						} else {
							startConsumeThreadTimes = 0;
						}
						serverRespCode = StreamConstants.RECONNECT;
					}
					if(notify.get()){
						try {
							lock.lock();
							controlCondition.signalAll();
						} catch (Exception e) {
						} finally {
							lock.unlock();
						}
					}
					if (connectionListener != null) {
						try {
							connectionListener.onDisconnect();
						} catch (Exception e) {
							logger.warn(e.getMessage());
						}
					}
				}
			}
			if (this.stream != null && connected) {
				try {
					this.stream.close();
				} catch (Exception e) {
					logger.warn(e.getMessage(), e);
				} finally {
					if (connectionListener != null) {
						try {
							connectionListener.onDisconnect();
						} catch (Exception e) {
							logger.warn(e.getMessage());
						}
					}
				}
			}
		}

		StreamImplementation getStream() throws TopCometSysErrorException {
			return getMsgStreamImpl();
		}
	}

	public void stop() {
		stop = true;
		try {
			lock.lock();
			controlCondition.signalAll();
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}

	public ReentrantLock getLock() {
		return lock;
	}

	public Condition getControlCondition() {
		return controlCondition;
	}

	public void setServerRespCode(String serverRespCode) {
		this.serverRespCode = serverRespCode;
	}

}
