package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HuabaoSpecialpostersGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.huabao.specialposters.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class HuabaoSpecialpostersGetRequest implements TaobaoRequest<HuabaoSpecialpostersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 频道Id
	 */
	private String channelIds;

	/** 
	* 返回的记录数，默认10条，最多20条，如果请求超过20或者小于等于10，则按10条返回 type为NEW时该参数无效,返回为指定频道的最新的一条记录
	 */
	private Long number;

	/** 
	* 类型可选：HOT(热门），RECOMMEND（推荐），NEW（最新）
	 */
	private String type;

	public void setChannelIds(String channelIds) {
		this.channelIds = channelIds;
	}
	public String getChannelIds() {
		return this.channelIds;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
	public Long getNumber() {
		return this.number;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.huabao.specialposters.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_ids", this.channelIds);
		txtParams.put("number", this.number);
		txtParams.put("type", this.type);
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

	public Class<HuabaoSpecialpostersGetResponse> getResponseClass() {
		return HuabaoSpecialpostersGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(channelIds,"channelIds");
		RequestCheckUtils.checkMaxListSize(channelIds,15,"channelIds");
		RequestCheckUtils.checkNotEmpty(type,"type");
	}
}
