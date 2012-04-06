package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PosterAppointedpostersGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.poster.appointedposters.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PosterAppointedpostersGetRequest implements TaobaoRequest<PosterAppointedpostersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* HOT(热门），RECOMMEND（推荐）
	 */
	private String appointedType;

	/** 
	* 频道ID列表
	 */
	private String channelIds;

	/** 
	* 请求返回的记录数，默认10条，最多20条，如果请求超过20或者小于等于0，则按10条返回
	 */
	private Long reNum;

	public void setAppointedType(String appointedType) {
		this.appointedType = appointedType;
	}
	public String getAppointedType() {
		return this.appointedType;
	}

	public void setChannelIds(String channelIds) {
		this.channelIds = channelIds;
	}
	public String getChannelIds() {
		return this.channelIds;
	}

	public void setReNum(Long reNum) {
		this.reNum = reNum;
	}
	public Long getReNum() {
		return this.reNum;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.poster.appointedposters.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("appointed_type", this.appointedType);
		txtParams.put("channel_ids", this.channelIds);
		txtParams.put("re_num", this.reNum);
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

	public Class<PosterAppointedpostersGetResponse> getResponseClass() {
		return PosterAppointedpostersGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(appointedType,"appointedType");
		RequestCheckUtils.checkNotEmpty(channelIds,"channelIds");
		RequestCheckUtils.checkMaxListSize(channelIds,15,"channelIds");
	}
}
