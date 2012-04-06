package com.taobao.api;

import java.util.Map;

/**
 * TOP请求接口。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface TaobaoRequest<T extends TaobaoResponse> {

	/**
	 * 获取TOP的API名称。
	 * 
	 * @return API名称
	 */
	public String getApiMethodName();

	/**
	 * 获取所有的Key-Value形式的文本请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数值</li>
	 * </ul>
	 * 
	 * @return 文本请求参数集合
	 */
	public Map<String, String> getTextParams();

	/**
	 * @return 指定或默认的时间戳
	 */
	public Long getTimestamp();

	/**
	 * 设置时间戳，如果不设置,发送请求时将使用当时的时间。
	 * 
	 * @param timestamp 时间戳
	 */
	public void setTimestamp(Long timestamp);

	public Class<T> getResponseClass();

	public void check() throws ApiRuleException;
}
