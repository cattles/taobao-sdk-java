package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.rule.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmRuleDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1152165471328896399L;

	/** 
	 * 删除是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
