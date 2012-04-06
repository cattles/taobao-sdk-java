package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupon.transfer response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionCouponTransferResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8374966727379761565L;

	/** 
	 * false代表失败，true代表成功
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
