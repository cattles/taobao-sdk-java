package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.activity.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionActivityDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1129399126968628591L;

	/** 
	 * true成功，false失败
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
