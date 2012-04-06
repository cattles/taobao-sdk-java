package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PosterPostauctionsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.poster.postauctions.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PosterPostauctionsGetRequest implements TaobaoRequest<PosterPostauctionsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 画报ID
	 */
	private Long posterId;

	public void setPosterId(Long posterId) {
		this.posterId = posterId;
	}
	public Long getPosterId() {
		return this.posterId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.poster.postauctions.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("poster_id", this.posterId);
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

	public Class<PosterPostauctionsGetResponse> getResponseClass() {
		return PosterPostauctionsGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(posterId,"posterId");
		RequestCheckUtils.checkMaxValue(posterId,2147483646L,"posterId");
		RequestCheckUtils.checkMinValue(posterId,1L,"posterId");
	}
}
