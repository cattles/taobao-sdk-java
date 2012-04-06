package com.taobao.api.internal.stream.connect;

/**
 * 连接的生命周期的监听器
 * @author zhenzi
 * 2011-8-8 下午05:47:59
 */
public interface ConnectionLifeCycleListener {
	public void onConnect();
	public void onDisconnect();
	public void onException(Throwable throwable);
	
	//一下几种情况都可能需要通过增量api主动去获取出问题时段的消息
	/**
	 * 连接超时
	 * @param e
	 */
	public void onConnectError(Exception e);
	/**
	 * 读取超时
	 */
	public void onReadTimeout();
	/**
	 * 当系统在30分钟内超过10次timeout了,则调用这个方法,退出
	 */
	public void onMaxReadTimeoutException();
	/**
	 * 当出现系统级别，比如签名错误，丢失参数等异常时
	 * @param e
	 */
	public void onSysErrorException(Exception e);
	/**
	 * 客户端主动重连
	 */
	public void onReconnect();
	
}
