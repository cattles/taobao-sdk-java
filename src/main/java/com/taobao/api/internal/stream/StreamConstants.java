package com.taobao.api.internal.stream;

/**
 * 
 * @author zhenzi
 * 2011-8-9 下午01:58:09
 */
public final class StreamConstants {
	public static final String ERR_MSG_HEADER = "errmsg";
	public static final String PARAM_APPKEY = "app_key";
	public static final String PARAM_USERID = "user";
	public static final String PARAM_TIMESTAMP = "timestamp";
	public static final String PARAM_SIGN = "sign";
	
	
	//code
	public static final String CONNECT_SUCCESS = "200";//连接成功的code
	public static final String HEAT_BEAT = "201";//心跳
	public static final String NEW_MESSAGE = "202";//消息
	public static final String DISCARD_MESSAGE = "203";//当客户端断开连接后，服务端会记录下来丢弃消息的开始时间
	public static final String CONNECT_REACH_MAX_TIME = "101";//连接到达最大时间，服务端主动断开
	public static final String SERVER_DEPLOY = "102";//服务端在发布
	public static final String SERVER_REHASH = "103";//服务端负载不均衡了，断开所有的客户端重连
	public static final String CLIENT_KICKOFF = "104";//对于重复的连接，服务端用新的连接替换掉旧的连接
	public static final String SERVER_KICKOFF = "105";//由于消息量太大，而isv接收的速度太慢，服务端断开isv的连接
	
	
	public static final String RECONNECT = "500";//客户端主动重连,或者出现了异常需要重连
}
