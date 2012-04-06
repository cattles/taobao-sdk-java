package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmRuleGroupSetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.rule.group.set request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class CrmRuleGroupSetRequest implements TaobaoRequest<CrmRuleGroupSetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 需要添加到规则的分组
	 */
	private String addGroups;

	/** 
	* 需要删除的分组
	 */
	private String deleteGroups;

	/** 
	* 规则id
	 */
	private Long ruleId;

	public void setAddGroups(String addGroups) {
		this.addGroups = addGroups;
	}
	public String getAddGroups() {
		return this.addGroups;
	}

	public void setDeleteGroups(String deleteGroups) {
		this.deleteGroups = deleteGroups;
	}
	public String getDeleteGroups() {
		return this.deleteGroups;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRuleId() {
		return this.ruleId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.rule.group.set";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("add_groups", this.addGroups);
		txtParams.put("delete_groups", this.deleteGroups);
		txtParams.put("rule_id", this.ruleId);
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

	public Class<CrmRuleGroupSetResponse> getResponseClass() {
		return CrmRuleGroupSetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxListSize(addGroups,10,"addGroups");
		RequestCheckUtils.checkMaxListSize(deleteGroups,10,"deleteGroups");
		RequestCheckUtils.checkNotEmpty(ruleId,"ruleId");
		RequestCheckUtils.checkMinValue(ruleId,1L,"ruleId");
	}
}
