package com.taobao.api.internal.stream.message;

import java.io.IOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.taobao.api.internal.stream.AbstractStreamImpl;
import com.taobao.api.internal.stream.StreamConstants;
import com.taobao.api.internal.stream.TopCometException;
import com.taobao.api.internal.stream.TopCometStreamImpl;
import com.taobao.api.internal.stream.connect.HttpResponse;
import com.taobao.api.internal.util.StringUtils;
/**
 * 
 * @author zhenzi
 * 2011-8-12 上午10:05:00
 */
public class MessageStreamImpl extends AbstractStreamImpl {
	private static final Logger logger = Logger.getLogger(MessageStreamImpl.class); 
	private TopCometMessageListener msgListener;
	
	private Pattern pattern = Pattern.compile("\\{\"packet\":\\{\"code\":(\\d+)(,\"msg\":(.+))?\\}\\}");
	private Condition controlCondition;
	private Lock lock;
	private TopCometStreamImpl cometStreamImpl;
	public MessageStreamImpl(StreamMsgConsumeFactory msgConsumeFactory,
			HttpResponse response,TopCometMessageListener msgListener, TopCometStreamImpl cometStreamImpl) {
		super(msgConsumeFactory, response);
		this.msgListener = msgListener;
		this.controlCondition = cometStreamImpl.getControlCondition();
		this.lock = cometStreamImpl.getLock();
		this.cometStreamImpl = cometStreamImpl;
	}
	public String parseLine(String msg) throws TopCometException, IOException {
		if(!StringUtils.isEmpty(msg)){
			try{
				Matcher matcher = pattern.matcher(msg);
				if (matcher.find()) {
					String code = matcher.group(1);
					if(StreamConstants.NEW_MESSAGE.equals(code)){
						return matcher.group(3);
					}else if(StreamConstants.HEAT_BEAT.equals(code)){
						msgListener.onHeartBeat();
					}else if(StreamConstants.CONNECT_REACH_MAX_TIME.equals(code)){
						msgListener.onConnectReachMaxTime();
						weakUp(code);
					}else if(StreamConstants.DISCARD_MESSAGE.equals(code)){
						msgListener.onDiscardMsg(matcher.group(3));
					}else if(StreamConstants.SERVER_DEPLOY.equals(code)){
						msgListener.onServerUpgrade(matcher.group(3));
						weakUp(code);
					}else if(StreamConstants.SERVER_REHASH.equals(code)){
						msgListener.onServerRehash();
						weakUp(code);
					}else if(StreamConstants.CLIENT_KICKOFF.equals(code)){
						msgListener.onClientKickOff();
						weakUp(code);
					}else if(StreamConstants.SERVER_KICKOFF.equals(code)){
						msgListener.onServerKickOff();
						weakUp(code);
					}else if(StreamConstants.CONNECT_SUCCESS.equals(code)){
						msgListener.onConnectMsg(matcher.group(3));
					}else {
						msgListener.onOtherMsg(matcher.group(3));
					}
				}
			}catch(Exception e){
				logger.error("Message is invalid:" + msg, e);
				msgListener.onException(e);
				return null;
			}
		}
		return null;
	}
	private void weakUp(String code){
		try{
			lock.lock();
			cometStreamImpl.setServerRespCode(code);
			controlCondition.signalAll();
		}catch(Exception e){
			//ignore
		}finally{
			lock.unlock();
		}
	}

	@Override
	public TopCometMessageListener getMessageListener() {
		return msgListener;
	}
	public void onException(Exception ex) {
		logger.error(ex, ex);
	}
	public void close() throws IOException {
		streamAlive = false;
		response.close();
	}
}
