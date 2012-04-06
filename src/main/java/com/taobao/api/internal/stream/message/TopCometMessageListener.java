package com.taobao.api.internal.stream.message;
/**
 * 
 * @author zhenzi
 * 2011-8-8 下午05:49:48
 */
public interface TopCometMessageListener {
	/**
	 * 连接成功的消息
	 * @param message
	 */
	public void onConnectMsg(String message);
	/**
	 * 心跳包，没有任何信息
	 */
	public void onHeartBeat();
	/**
	 * 正常的接收到业务类型的消息
	 * @param message
	 */
	public void onReceiveMsg(String message);
	/**
	 * 连接到达最大时间
	 */
	public void onConnectReachMaxTime();
	/**
	 * 服务端告知客户端丢弃消息的时间
	 * @param message
	 */
	public void onDiscardMsg(String message);
	/**
	 * 服务端在升级
	 * @param message 包括了服务端升级需要的时间
	 */
	public void onServerUpgrade(String message);
	/**
	 * 服务端负责不均衡，断开所有客户端连接
	 */
	public void onServerRehash();
	/**
	 * 消息量太大，isv接收太慢，服务端主动断开客户端
	 */
	public void onServerKickOff();
	/**
	 * 由于客户端使用相同的参数发起了另外一个请求，服务端把前一个连接断开
	 */
	public void onClientKickOff();
	public void onOtherMsg(String message);//其他由于某种原因不能被解析的信息
	public void onException(Exception ex);
}
