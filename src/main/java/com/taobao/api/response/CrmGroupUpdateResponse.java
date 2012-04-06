package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGroupUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8372126997634614882L;

	/** 
	 * 分组修改是否成功
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
