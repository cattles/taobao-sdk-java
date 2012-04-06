package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressSearchResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.logistics.address.search request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class LogisticsAddressSearchRequest implements TaobaoRequest<LogisticsAddressSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 可选，参数列表如下：<br><font color='red'>
no_def:查询非默认地址<br>
get_def:查询默认取货地址<br>
cancel_def:查询默认退货地址<br>
缺省此参数时，查询所有当前用户的地址库
</font>
	 */
	private String rdef;

	public void setRdef(String rdef) {
		this.rdef = rdef;
	}
	public String getRdef() {
		return this.rdef;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("rdef", this.rdef);
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

	public Class<LogisticsAddressSearchResponse> getResponseClass() {
		return LogisticsAddressSearchResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
	}
}
