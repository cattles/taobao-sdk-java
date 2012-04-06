package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.members.group.batchadd response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMembersGroupBatchaddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3196219773434142316L;

	/** 
	 * 添加操作是否成功
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
