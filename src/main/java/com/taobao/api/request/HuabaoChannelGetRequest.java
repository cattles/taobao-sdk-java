package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HuabaoChannelGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.huabao.channel.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class HuabaoChannelGetRequest implements TaobaoRequest<HuabaoChannelGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 频道Id
	 */
	private Long channelId;

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public Long getChannelId() {
		return this.channelId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.huabao.channel.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_id", this.channelId);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<HuabaoChannelGetResponse> getResponseClass() {
		return HuabaoChannelGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(channelId,"channelId");
	}
}
