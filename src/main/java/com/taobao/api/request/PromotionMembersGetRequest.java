package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMembersGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.members.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PromotionMembersGetRequest implements TaobaoRequest<PromotionMembersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 会员昵称
	 */
	private String buyerNick;

	/** 
	* 要查询第几页
	 */
	private Long currentPage;

	/** 
	* 买家会员级别 general：普通会员 senior ：高级会员 vip：VIP会员 king：至尊VIP
	 */
	private String grade;

	/** 
	* 最大交易额，用分表示
	 */
	private Long maxTradeAmoun;

	/** 
	* 最大交易量
	 */
	private Long maxTradeCount;

	/** 
	* 最小交易额，用分表示
	 */
	private Long minTradeAmount;

	/** 
	* 最小交易量
	 */
	private Long minTradeCount;

	/** 
	* 每页行数
	 */
	private Long pageSize;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return this.grade;
	}

	public void setMaxTradeAmoun(Long maxTradeAmoun) {
		this.maxTradeAmoun = maxTradeAmoun;
	}
	public Long getMaxTradeAmoun() {
		return this.maxTradeAmoun;
	}

	public void setMaxTradeCount(Long maxTradeCount) {
		this.maxTradeCount = maxTradeCount;
	}
	public Long getMaxTradeCount() {
		return this.maxTradeCount;
	}

	public void setMinTradeAmount(Long minTradeAmount) {
		this.minTradeAmount = minTradeAmount;
	}
	public Long getMinTradeAmount() {
		return this.minTradeAmount;
	}

	public void setMinTradeCount(Long minTradeCount) {
		this.minTradeCount = minTradeCount;
	}
	public Long getMinTradeCount() {
		return this.minTradeCount;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.members.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("current_page", this.currentPage);
		txtParams.put("grade", this.grade);
		txtParams.put("max_trade_amoun", this.maxTradeAmoun);
		txtParams.put("max_trade_count", this.maxTradeCount);
		txtParams.put("min_trade_amount", this.minTradeAmount);
		txtParams.put("min_trade_count", this.minTradeCount);
		txtParams.put("page_size", this.pageSize);
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

	public Class<PromotionMembersGetResponse> getResponseClass() {
		return PromotionMembersGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxLength(buyerNick,40,"buyerNick");
		RequestCheckUtils.checkNotEmpty(currentPage,"currentPage");
		RequestCheckUtils.checkMinValue(currentPage,1L,"currentPage");
		RequestCheckUtils.checkNotEmpty(pageSize,"pageSize");
		RequestCheckUtils.checkMaxValue(pageSize,40L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,1L,"pageSize");
	}
}
