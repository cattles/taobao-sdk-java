package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 规则相关信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class RuleData extends TaobaoObject {

	private static final long serialVersionUID = 2647547997273696521L;

	/**
	 * 交易结束时间
	 */
	@ApiField("end_trade_time")
	private Date endTradeTime;

	/**
	 * 会员等级
	 */
	@ApiField("grade")
	private Long grade;

	/**
	 * 分组信息，包括分组id与分组名称
	 */
	@ApiListField("grouplist")
	@ApiField("group_domain")
	private List<GroupDomain> grouplist;

	/**
	 * 最大平均客单价
	 */
	@ApiField("max_avg_price")
	private String maxAvgPrice;

	/**
	 * 最大交易关闭次数
	 */
	@ApiField("max_close_trade_count")
	private Long maxCloseTradeCount;

	/**
	 * 最大宝贝件数
	 */
	@ApiField("max_item_count")
	private Long maxItemCount;

	/**
	 * 最大交易额
	 */
	@ApiField("max_trade_amount")
	private String maxTradeAmount;

	/**
	 * 最大交易笔数
	 */
	@ApiField("max_trade_count")
	private Long maxTradeCount;

	/**
	 * 最小平均客单价
	 */
	@ApiField("min_avg_price")
	private String minAvgPrice;

	/**
	 * 最小交易关闭次数
	 */
	@ApiField("min_close_trade_count")
	private Long minCloseTradeCount;

	/**
	 * 最少宝贝件数
	 */
	@ApiField("min_item_count")
	private Long minItemCount;

	/**
	 * 最小交易额
	 */
	@ApiField("min_trade_amount")
	private String minTradeAmount;

	/**
	 * 最小交易笔数
	 */
	@ApiField("min_trade_count")
	private Long minTradeCount;

	/**
	 * 省份的代码，北京=1,天津=2,河北省=3,山西省=4,内蒙古自治区=5,辽宁省=6,吉林省=7,黑龙江省=8,上海=9,江苏省=10,浙江省=11,安徽省=12,福建省=13,江西省=14,山东省=15,河南省=16,湖北省=17,湖南省=18, 广东省=19,广西壮族自治区=20,海南省=21,重庆=22,四川省=23,贵州省=24,云南省=25,西藏自治区26,陕西省=27,甘肃省=28,青海省=29,宁夏回族自治区=30,新疆维吾尔自治区=31,台湾省=32,香港特别行政区=33,澳门特别行政区=34,海外=35
	 */
	@ApiField("province")
	private Long province;

	/**
	 * 客户关系来源
	 */
	@ApiField("relation_source")
	private Long relationSource;

	/**
	 * 规则ID
	 */
	@ApiField("rule_id")
	private Long ruleId;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 卖家ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * 交易的开始时间
	 */
	@ApiField("start_trade_time")
	private Date startTradeTime;

	public Date getEndTradeTime() {
		return this.endTradeTime;
	}
	public void setEndTradeTime(Date endTradeTime) {
		this.endTradeTime = endTradeTime;
	}

	public Long getGrade() {
		return this.grade;
	}
	public void setGrade(Long grade) {
		this.grade = grade;
	}

	public List<GroupDomain> getGrouplist() {
		return this.grouplist;
	}
	public void setGrouplist(List<GroupDomain> grouplist) {
		this.grouplist = grouplist;
	}

	public String getMaxAvgPrice() {
		return this.maxAvgPrice;
	}
	public void setMaxAvgPrice(String maxAvgPrice) {
		this.maxAvgPrice = maxAvgPrice;
	}

	public Long getMaxCloseTradeCount() {
		return this.maxCloseTradeCount;
	}
	public void setMaxCloseTradeCount(Long maxCloseTradeCount) {
		this.maxCloseTradeCount = maxCloseTradeCount;
	}

	public Long getMaxItemCount() {
		return this.maxItemCount;
	}
	public void setMaxItemCount(Long maxItemCount) {
		this.maxItemCount = maxItemCount;
	}

	public String getMaxTradeAmount() {
		return this.maxTradeAmount;
	}
	public void setMaxTradeAmount(String maxTradeAmount) {
		this.maxTradeAmount = maxTradeAmount;
	}

	public Long getMaxTradeCount() {
		return this.maxTradeCount;
	}
	public void setMaxTradeCount(Long maxTradeCount) {
		this.maxTradeCount = maxTradeCount;
	}

	public String getMinAvgPrice() {
		return this.minAvgPrice;
	}
	public void setMinAvgPrice(String minAvgPrice) {
		this.minAvgPrice = minAvgPrice;
	}

	public Long getMinCloseTradeCount() {
		return this.minCloseTradeCount;
	}
	public void setMinCloseTradeCount(Long minCloseTradeCount) {
		this.minCloseTradeCount = minCloseTradeCount;
	}

	public Long getMinItemCount() {
		return this.minItemCount;
	}
	public void setMinItemCount(Long minItemCount) {
		this.minItemCount = minItemCount;
	}

	public String getMinTradeAmount() {
		return this.minTradeAmount;
	}
	public void setMinTradeAmount(String minTradeAmount) {
		this.minTradeAmount = minTradeAmount;
	}

	public Long getMinTradeCount() {
		return this.minTradeCount;
	}
	public void setMinTradeCount(Long minTradeCount) {
		this.minTradeCount = minTradeCount;
	}

	public Long getProvince() {
		return this.province;
	}
	public void setProvince(Long province) {
		this.province = province;
	}

	public Long getRelationSource() {
		return this.relationSource;
	}
	public void setRelationSource(Long relationSource) {
		this.relationSource = relationSource;
	}

	public Long getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Date getStartTradeTime() {
		return this.startTradeTime;
	}
	public void setStartTradeTime(Date startTradeTime) {
		this.startTradeTime = startTradeTime;
	}

}
