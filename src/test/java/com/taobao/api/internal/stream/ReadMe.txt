import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.taobao.api.internal.stream.connect.ConnectionLifeCycleListener;
import com.taobao.api.internal.stream.message.TopCometMessageListener;
/**
 * 
 * @author zhenzi
 * 2011-8-12 上午10:14:52
 */
public class TopCometStreamTest {
	private static final String url = "http://10.232.127.32:8080/topcomet/stream";
	private static final String appkey = "30387";
	private static final String secret = "ceb49ee627ec0d56ef4924a85f5a00eb";
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void testStream()throws Exception{
		Configuration conf = new Configuration(appkey,secret,null);
		
		conf.setMinThreads(2);//处理消息的线程池中线程最小个数
		conf.setMaxThreads(5);//处理消息的线程池中线程最大个数
		conf.setQueueSize(100);//处理消息的线程池中队列大小
		TopCometStream stream = new TopCometStreamFactory(conf).getInstance();
		stream.setConnectionListener(new ConnectionListener());
		stream.setMessageListener(new TopCometMessageListenerImpl());
		stream.start();
		System.out.println("client started...");
		Thread.sleep(24 * 60 * 60 * 1000);//24小时
	}
	class ConnectionListener implements ConnectionLifeCycleListener{
		public void onConnect() {
			System.out.println("connect success");
		}

		public void onDisconnect() {
			System.out.println("disconnect...");
		}

		public void onException(Throwable throwable) {
			System.out.println(throwable);
		}

		public void onConnectError(Exception e) {
			System.out.println("connection timeout:" + e);
		}

		public void onReadTimeout() {
			System.out.println("Read timeout");
		}

		public void onSysErrorException(Exception e) {
			System.out.println("SysErrorException:" + e);
		}

		public void onReconnect() {
			System.out.println("reconnect");
		}

		public void onMaxReadTimeoutException() {
			System.out.println("maxReadTimeoutException");
		}
		
	}
	class TopCometMessageListenerImpl implements TopCometMessageListener{

		public void onReceiveMsg(String message) {
			System.out.println("receive:" + message);
		}

		public void onConnectReachMaxTime() {
			System.out.println("reach max time");
		}

		public void onDiscardMsg(String message) {
			System.out.println("discardMsg:" + message);
		}

		public void onServerUpgrade(String message) {
			System.out.println("DeployMsg:" + message);
		}

		public void onServerRehash() {
			System.out.println("server rehash");
		}

		public void onServerKickOff() {
			System.out.println("server kickoff");
		}

		public void onOtherMsg(String message) {
			System.out.println("otherMsg:" + message);
		}

		public void onException(Exception ex) {
			System.out.println("exception:" + ex);
		}

		public void onConnectMsg(String message) {
			System.out.println("connection success message:" + message);	
		}

		public void onHeartBeat() {
			System.out.println("heart beat");
		}

		public void onClientKickOff() {
			System.out.println("client kick off");
		}
		
	}
}
