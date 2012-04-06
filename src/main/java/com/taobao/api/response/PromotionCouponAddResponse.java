package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupon.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionCouponAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3721466981617954261L;

	/** 
	 * 优惠券的id
	 */
	@ApiField("coupon_id")
	private Long couponId;

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public Long getCouponId( ) {
		return this.couponId;
	}

}
