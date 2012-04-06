package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 买家持有优惠券信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class BuyerCouponDetail extends TaobaoObject {

	private static final long serialVersionUID = 1395767454366198255L;

	/**
	 * 优惠券使用条件，订单满多少分才能用这个优惠券，501就是满501分能使用。注意：返回的是“分”，不是“元”
	 */
	@ApiField("condition")
	private Long condition;

	/**
	 * 优惠券编号
	 */
	@ApiField("coupon_number")
	private Long couponNumber;

	/**
	 * 优惠券的面值，返回的是“分”，不是“元”，500代表500分相当于5元
	 */
	@ApiField("denomination")
	private Long denomination;

	/**
	 * 优惠券有效期
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 已转送状态下，收到优惠券的淘宝昵称
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 优惠券来源，卖家或赠送人的淘宝昵称
	 */
	@ApiField("source")
	private String source;

	/**
	 * unused：未使用，using：使用中,used,已经使用，overdue：已经过期，transfered：已经转发
	 */
	@ApiField("status")
	private String status;

	public Long getCondition() {
		return this.condition;
	}
	public void setCondition(Long condition) {
		this.condition = condition;
	}

	public Long getCouponNumber() {
		return this.couponNumber;
	}
	public void setCouponNumber(Long couponNumber) {
		this.couponNumber = couponNumber;
	}

	public Long getDenomination() {
		return this.denomination;
	}
	public void setDenomination(Long denomination) {
		this.denomination = denomination;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
