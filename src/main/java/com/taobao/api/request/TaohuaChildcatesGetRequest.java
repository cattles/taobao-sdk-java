package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaChildcatesGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taohua.childcates.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaohuaChildcatesGetRequest implements TaobaoRequest<TaohuaChildcatesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 通过类目ID获取它的子类目列表
	 */
	private Long cateId;

	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}
	public Long getCateId() {
		return this.cateId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.childcates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cate_id", this.cateId);
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

	public Class<TaohuaChildcatesGetResponse> getResponseClass() {
		return TaohuaChildcatesGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
	}
}
