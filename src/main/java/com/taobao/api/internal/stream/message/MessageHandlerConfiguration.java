package com.taobao.api.internal.stream.message;
/**
 * 处理message的工厂类的配置信息
 * @author zhenzi
 * 2011-8-8 下午07:23:33
 */
public interface MessageHandlerConfiguration {
	public int getMinThreads();
	public int getMaxThreads();
	public int getQueueSize();
}
