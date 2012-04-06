package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.CouponDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupondetail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionCoupondetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3363271955724775854L;

	/** 
	 * 优惠券详细信息
	 */
	@ApiListField("coupon_details")
	@ApiField("coupon_detail")
	private List<CouponDetail> couponDetails;

	/** 
	 * 查询数量总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setCouponDetails(List<CouponDetail> couponDetails) {
		this.couponDetails = couponDetails;
	}
	public List<CouponDetail> getCouponDetails( ) {
		return this.couponDetails;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
