package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.rule.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmRuleAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1244629148996226915L;

	/** 
	 * 返回规则添加是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 新增的规则ID
	 */
	@ApiField("rule_id")
	private Long ruleId;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRuleId( ) {
		return this.ruleId;
	}

}
