package com.taobao.api.internal.stream;

import java.util.Map;

import com.taobao.api.internal.stream.connect.HttpConnectionConfiguration;
import com.taobao.api.internal.stream.message.MessageHandlerConfiguration;
import com.taobao.api.internal.util.StringUtils;

/**
 * 初始化stream client需要的一些配置
 * @author zhenzi
 * 2011-8-8 下午05:45:14
 */
public final class Configuration implements HttpConnectionConfiguration,MessageHandlerConfiguration{
	private String connectUrl = "http://stream.api.taobao.com/stream";
	private int httpConnectionTimeout = 5;//默认连接超时时间5s
	/*
	 * 由于服务端会间隔1分钟会发送一个心跳包，所以超时间比1分钟稍多点，使用者最好不要修改这个参数
	 */
	private int httpReadTimeout = 60 + 30;//90s
	private int httpConnectRetryCount = 3;//默认重试3次
	private int httpConnectRetryInterval = 16;//16s
	private int sleepTimeOfServerInUpgrade = 5 * 60;//当服务端在发布的时候休眠的时间，默认5分钟，
	private Map<String,String> reqHeader;
	/*
	 * 因为服务端目前在30分钟后会断开连接，所以为了最低程度的降低消息丢失，在服务端断开之间客户端重连一次
	 */
	private int httpReconnectInterval = 30 * 60;
	
	
	private int minThreads = 100;
	private int maxThreads = 200;
	/*
	 * 假设每条消息为1k大小，队列里可以存大约50M的数据
	 */
	private int queueSize = 50000;
	
	
	private String appkey;
	private String secret;
	private String userid;
	
	public Configuration(String appkey,String secret,String userid){
		if(StringUtils.isEmpty(appkey) || StringUtils.isEmpty(secret)){
			throw new RuntimeException("appkey or secret is invalid");
		}
		this.appkey = appkey;
		this.secret = secret;
		this.userid = userid;
	}
	//-----------http connection config
	public void setHttpConnectionTimeout(int httpConnectionTimeout){
		this.httpConnectionTimeout = httpConnectionTimeout;
	}
	public int getHttpConnectionTimeout() {
		return httpConnectionTimeout;
	}
	public int getHttpReadTimeout() {
		return httpReadTimeout;
	}
	/**
	 * 由于服务端会间隔1分钟会发送一个心跳包，所以超时间比1分钟稍多点，使用者最好不要修改这个参数
	 * @param httpReadTimeout
	 */
	public void setHttpReadTimeout(int httpReadTimeout){
		this.httpReadTimeout = httpReadTimeout;
	}
	public void setHttpConnectRetryCount(int httpConnectRetryCount){
		this.httpConnectRetryCount = httpConnectRetryCount;
	}
	public int getHttpConnectRetryCount() {
		return httpConnectRetryCount;
	}
	/**
	 * 方便测试使用，生成环境请不要调用此方法
	 * @param connectUrl
	 */
	public void setConnectUrl(String connectUrl){
		this.connectUrl = connectUrl;
	}
	public String getConnectUrl() {
		return connectUrl;
	}
	public void setHttpConnectRetryInterval(int httpConnectRetryInterval){
		this.httpConnectRetryInterval = httpConnectRetryInterval;
	}
	public int getHttpConnectRetryInterval() {
		return httpConnectRetryInterval;
	}
	public void setSleepTimeOfServerInUpgrade(int sleepSecond){
		this.sleepTimeOfServerInUpgrade = sleepSecond;
	}
	public int getSleepTimeOfServerInUpgrade() {
		return sleepTimeOfServerInUpgrade;
	}
	/*
	 * 因为服务端目前在30分钟后会断开连接，所以为了最低程度的降低消息丢失，在服务端断开之间客户端重连一次(non-Javadoc)
	 */
	public void setHttpReconnectInterval(int httpReconnectInterval){
		this.httpReconnectInterval = httpReconnectInterval;
	}
	public int getHttpReconnectInterval() {
		return httpReconnectInterval;
	}
	public void setRequestHeader(Map<String,String> reqHeader){
		this.reqHeader = reqHeader;
	}
	public Map<String, String> getRequestHeader() {
		return reqHeader;
	}
	//------------------http connection config end-
	//------------------message factory config
	public void setMinThreads(int minThreads){
		this.minThreads = minThreads;
	}
	public int getMinThreads() {
		return minThreads;
	}
	public void setMaxThreads(int maxThreads){
		this.maxThreads = maxThreads;
	}
	public int getMaxThreads() {
		return maxThreads;
	}
	public void setQueueSize(int queueSize){
		this.queueSize = queueSize;
	}
	public int getQueueSize() {
		return queueSize;
	}
	//--------message factory config end
	public String getAppkey() {
		return appkey;
	}
	public String getSecret() {
		return secret;
	}
	public String getUserid() {
		return userid;
	}
	
}
