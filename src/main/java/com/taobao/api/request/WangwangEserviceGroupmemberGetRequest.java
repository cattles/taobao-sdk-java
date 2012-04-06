package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceGroupmemberGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.wangwang.eservice.groupmember.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class WangwangEserviceGroupmemberGetRequest implements TaobaoRequest<WangwangEserviceGroupmemberGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 被查询用户组管理员ID：cntaobao+淘宝nick，例如cntaobaotest
	 */
	private String managerId;

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerId() {
		return this.managerId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.groupmember.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("manager_id", this.managerId);
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

	public Class<WangwangEserviceGroupmemberGetResponse> getResponseClass() {
		return WangwangEserviceGroupmemberGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(managerId,"managerId");
		RequestCheckUtils.checkMaxLength(managerId,128,"managerId");
	}
}
