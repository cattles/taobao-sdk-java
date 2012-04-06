package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家设置的等级优惠信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class GradePromotion extends TaobaoObject {

	private static final long serialVersionUID = 5811831226341212176L;

	/**
	 * 买家会员级别    1：普通会员 2：高级会员 3：VIP会员 4：至尊VIP
	 */
	@ApiField("cur_grade")
	private String curGrade;

	/**
	 * 普通会员 、高级会员、VIP会员、至尊VIP
	 */
	@ApiField("cur_grade_name")
	private String curGradeName;

	/**
	 * 会员级别折扣率没有小数，990代表9.9折
	 */
	@ApiField("discount")
	private Long discount;

	/**
	 * 升级到下一个级别的需要的交易额，单位：分
	 */
	@ApiField("next_upgrade_amount")
	private Long nextUpgradeAmount;

	/**
	 * 升级到下一个级别的需要的交易量
	 */
	@ApiField("next_upgrade_count")
	private Long nextUpgradeCount;

	public String getCurGrade() {
		return this.curGrade;
	}
	public void setCurGrade(String curGrade) {
		this.curGrade = curGrade;
	}

	public String getCurGradeName() {
		return this.curGradeName;
	}
	public void setCurGradeName(String curGradeName) {
		this.curGradeName = curGradeName;
	}

	public Long getDiscount() {
		return this.discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public Long getNextUpgradeAmount() {
		return this.nextUpgradeAmount;
	}
	public void setNextUpgradeAmount(Long nextUpgradeAmount) {
		this.nextUpgradeAmount = nextUpgradeAmount;
	}

	public Long getNextUpgradeCount() {
		return this.nextUpgradeCount;
	}
	public void setNextUpgradeCount(Long nextUpgradeCount) {
		this.nextUpgradeCount = nextUpgradeCount;
	}

}
