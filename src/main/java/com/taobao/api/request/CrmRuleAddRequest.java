package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmRuleAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.rule.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class CrmRuleAddRequest implements TaobaoRequest<CrmRuleAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 会员等级，可选值为：1,2,3,4
	 */
	private Long grade;

	/** 
	* 规则应用分组集合，若分组上有任务，则该分组不能挂到该规则下
	 */
	private String groupIds;

	/** 
	* 最大平均客单价，单位为元
	 */
	private String maxAvgPrice;

	/** 
	* 最大交易关闭数
	 */
	private Long maxCloseTradeNum;

	/** 
	* 最大宝贝件数
	 */
	private Long maxItemNum;

	/** 
	* 最迟交易时间
	 */
	private Date maxLastTradeTime;

	/** 
	* 最大交易金额，单位为元
	 */
	private String maxTradeAmount;

	/** 
	* 最大交易数
	 */
	private Long maxTradeCount;

	/** 
	* 最小平均客单价，单位元
	 */
	private String minAvgPrice;

	/** 
	* 最少交易关闭数
	 */
	private Long minCloseTradeNum;

	/** 
	* 最少宝贝件数
	 */
	private Long minItemNum;

	/** 
	* 最早交易日期
	 */
	private Date minLastTradeTime;

	/** 
	* 最小交易金额,单位元。
	 */
	private String minTradeAmount;

	/** 
	* 最小交易次数
	 */
	private Long minTradeCount;

	/** 
	* 北京=1,天津=2,河北省=3,山西省=4,内蒙古自治区=5,辽宁省=6,吉林省=7,黑龙江省=8,上海=9,江苏省=10,浙江省=11,安徽省=12,福建省=13,江西省=14,山东省=15,河南省=16,湖北省=17,湖南省=18, 广东省=19,广西壮族自治区=20,海南省=21,重庆=22,四川省=23,贵州省=24,云南省=25,西藏自治区26,陕西省=27,甘肃省=28,青海省=29,宁夏回族自治区=30,新疆维吾尔自治区=31,台湾省=32,香港特别行政区=33,澳门特别行政区=34,海外=35
	 */
	private Long province;

	/** 
	* 客户关系来源,可选值为:1,2
	 */
	private Long relationSource;

	/** 
	* 规则名称
	 */
	private String ruleName;

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}
	public String getGroupIds() {
		return this.groupIds;
	}

	public void setMaxAvgPrice(String maxAvgPrice) {
		this.maxAvgPrice = maxAvgPrice;
	}
	public String getMaxAvgPrice() {
		return this.maxAvgPrice;
	}

	public void setMaxCloseTradeNum(Long maxCloseTradeNum) {
		this.maxCloseTradeNum = maxCloseTradeNum;
	}
	public Long getMaxCloseTradeNum() {
		return this.maxCloseTradeNum;
	}

	public void setMaxItemNum(Long maxItemNum) {
		this.maxItemNum = maxItemNum;
	}
	public Long getMaxItemNum() {
		return this.maxItemNum;
	}

	public void setMaxLastTradeTime(Date maxLastTradeTime) {
		this.maxLastTradeTime = maxLastTradeTime;
	}
	public Date getMaxLastTradeTime() {
		return this.maxLastTradeTime;
	}

	public void setMaxTradeAmount(String maxTradeAmount) {
		this.maxTradeAmount = maxTradeAmount;
	}
	public String getMaxTradeAmount() {
		return this.maxTradeAmount;
	}

	public void setMaxTradeCount(Long maxTradeCount) {
		this.maxTradeCount = maxTradeCount;
	}
	public Long getMaxTradeCount() {
		return this.maxTradeCount;
	}

	public void setMinAvgPrice(String minAvgPrice) {
		this.minAvgPrice = minAvgPrice;
	}
	public String getMinAvgPrice() {
		return this.minAvgPrice;
	}

	public void setMinCloseTradeNum(Long minCloseTradeNum) {
		this.minCloseTradeNum = minCloseTradeNum;
	}
	public Long getMinCloseTradeNum() {
		return this.minCloseTradeNum;
	}

	public void setMinItemNum(Long minItemNum) {
		this.minItemNum = minItemNum;
	}
	public Long getMinItemNum() {
		return this.minItemNum;
	}

	public void setMinLastTradeTime(Date minLastTradeTime) {
		this.minLastTradeTime = minLastTradeTime;
	}
	public Date getMinLastTradeTime() {
		return this.minLastTradeTime;
	}

	public void setMinTradeAmount(String minTradeAmount) {
		this.minTradeAmount = minTradeAmount;
	}
	public String getMinTradeAmount() {
		return this.minTradeAmount;
	}

	public void setMinTradeCount(Long minTradeCount) {
		this.minTradeCount = minTradeCount;
	}
	public Long getMinTradeCount() {
		return this.minTradeCount;
	}

	public void setProvince(Long province) {
		this.province = province;
	}
	public Long getProvince() {
		return this.province;
	}

	public void setRelationSource(Long relationSource) {
		this.relationSource = relationSource;
	}
	public Long getRelationSource() {
		return this.relationSource;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getRuleName() {
		return this.ruleName;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.rule.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("grade", this.grade);
		txtParams.put("group_ids", this.groupIds);
		txtParams.put("max_avg_price", this.maxAvgPrice);
		txtParams.put("max_close_trade_num", this.maxCloseTradeNum);
		txtParams.put("max_item_num", this.maxItemNum);
		txtParams.put("max_last_trade_time", this.maxLastTradeTime);
		txtParams.put("max_trade_amount", this.maxTradeAmount);
		txtParams.put("max_trade_count", this.maxTradeCount);
		txtParams.put("min_avg_price", this.minAvgPrice);
		txtParams.put("min_close_trade_num", this.minCloseTradeNum);
		txtParams.put("min_item_num", this.minItemNum);
		txtParams.put("min_last_trade_time", this.minLastTradeTime);
		txtParams.put("min_trade_amount", this.minTradeAmount);
		txtParams.put("min_trade_count", this.minTradeCount);
		txtParams.put("province", this.province);
		txtParams.put("relation_source", this.relationSource);
		txtParams.put("rule_name", this.ruleName);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<CrmRuleAddResponse> getResponseClass() {
		return CrmRuleAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxValue(grade,4L,"grade");
		RequestCheckUtils.checkMinValue(grade,1L,"grade");
		RequestCheckUtils.checkMaxListSize(groupIds,10,"groupIds");
		RequestCheckUtils.checkMaxLength(maxAvgPrice,7,"maxAvgPrice");
		RequestCheckUtils.checkMinValue(maxCloseTradeNum,0L,"maxCloseTradeNum");
		RequestCheckUtils.checkMinValue(maxItemNum,0L,"maxItemNum");
		RequestCheckUtils.checkMaxLength(maxTradeAmount,7,"maxTradeAmount");
		RequestCheckUtils.checkMinValue(maxTradeCount,0L,"maxTradeCount");
		RequestCheckUtils.checkMaxLength(minAvgPrice,7,"minAvgPrice");
		RequestCheckUtils.checkMinValue(minCloseTradeNum,0L,"minCloseTradeNum");
		RequestCheckUtils.checkMinValue(minItemNum,0L,"minItemNum");
		RequestCheckUtils.checkMaxLength(minTradeAmount,7,"minTradeAmount");
		RequestCheckUtils.checkMinValue(minTradeCount,0L,"minTradeCount");
		RequestCheckUtils.checkMaxValue(province,35L,"province");
		RequestCheckUtils.checkMinValue(province,1L,"province");
		RequestCheckUtils.checkMaxValue(relationSource,2L,"relationSource");
		RequestCheckUtils.checkMinValue(relationSource,1L,"relationSource");
		RequestCheckUtils.checkNotEmpty(ruleName,"ruleName");
		RequestCheckUtils.checkMaxLength(ruleName,15,"ruleName");
	}
}
