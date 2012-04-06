package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 优惠券详细信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class CouponDetail extends TaobaoObject {

	private static final long serialVersionUID = 5526286185974985913L;

	/**
	 * 买家的昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 优惠券的发放渠道：渠道有rewardforgifts：满就送，marketingMessage：营销消息，activityofget：活动领取，createActivity：创建活动，ISV
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 目前优惠券编号
	 */
	@ApiField("coupon_number")
	private Long couponNumber;

	/**
	 * 优惠券使用情况Unused：未使用using：使用中used：已使用
	 */
	@ApiField("state")
	private String state;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getCouponNumber() {
		return this.couponNumber;
	}
	public void setCouponNumber(Long couponNumber) {
		this.couponNumber = couponNumber;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
