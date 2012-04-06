package com.taobao.api.internal.stream.connect;

import java.util.Map;

/**
 * 建立http connection需要的一些配置
 * @author zhenzi
 * 2011-8-8 下午05:56:41
 */
public interface HttpConnectionConfiguration {
	public String getConnectUrl();
	/**
	 * 连接超时时间
	 * @return
	 */
	public int getHttpConnectionTimeout();
	/**
	 * http读取数据超时时间
	 * @return
	 */
	public int getHttpReadTimeout();
	/**
	 * 连接重试次数
	 * @return
	 */
	public int getHttpConnectRetryCount();
	/**
	 * 重试间隔的时间
	 * @return
	 */
	public int getHttpConnectRetryInterval();
	/**
	 * 返回服务端在升级的时候的休眠时间
	 * @return
	 */
	public int getSleepTimeOfServerInUpgrade();
	/**
	 * 对于一个连接重连间隔的时间
	 * @return
	 */
	public int getHttpReconnectInterval();
	
	public Map<String,String> getRequestHeader();
}
