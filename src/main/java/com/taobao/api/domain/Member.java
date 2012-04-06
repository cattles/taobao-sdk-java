package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家会员信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Member extends TaobaoObject {

	private static final long serialVersionUID = 8182498267716564575L;

	/**
	 * 买家数字ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 上次交易时间：会员在该卖家店铺最后的交易时间
	 */
	@ApiField("laste_time")
	private Date lasteTime;

	/**
	 * 买家会员级别 general：普通会员 senior ：高级会员 vip：VIP会员 king：至尊VIP
	 */
	@ApiField("member_grade")
	private String memberGrade;

	/**
	 * 状态：
normal：正常
deleted：删除
blacklist ：黑名单
	 */
	@ApiField("status")
	private String status;

	/**
	 * 总交易额用分表示
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

	/**
	 * 总交易量：会员在该卖家的交易笔数
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getLasteTime() {
		return this.lasteTime;
	}
	public void setLasteTime(Date lasteTime) {
		this.lasteTime = lasteTime;
	}

	public String getMemberGrade() {
		return this.memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Long getTradeCount() {
		return this.tradeCount;
	}
	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}

}
