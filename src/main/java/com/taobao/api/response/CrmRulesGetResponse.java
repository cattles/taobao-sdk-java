package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.RuleData;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.rules.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmRulesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3836984565314479829L;

	/** 
	 * 规则列表
	 */
	@ApiListField("rule_list")
	@ApiField("rule_data")
	private List<RuleData> ruleList;

	/** 
	 * 记录的总条数
	 */
	@ApiField("total_result")
	private Long totalResult;

	public void setRuleList(List<RuleData> ruleList) {
		this.ruleList = ruleList;
	}
	public List<RuleData> getRuleList( ) {
		return this.ruleList;
	}

	public void setTotalResult(Long totalResult) {
		this.totalResult = totalResult;
	}
	public Long getTotalResult( ) {
		return this.totalResult;
	}

}
