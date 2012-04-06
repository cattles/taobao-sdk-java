package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponBuyerSearchResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.coupon.buyer.search request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PromotionCouponBuyerSearchRequest implements TaobaoRequest<PromotionCouponBuyerSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询有效期晚于查询日期的所有优惠券
	 */
	private Date endTime;

	/** 
	* 第几页
	 */
	private Long pageNo;

	/** 
	* 每页条数
	 */
	private Long pageSize;

	/** 
	* 店铺的名称，就是卖家的昵称
	 */
	private String sellerNick;

	/** 
	* unused：未使用，using：使用中,used,已经使用，overdue：已经过期，transfered：已经转发
	 */
	private String status;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime() {
		return this.endTime;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.coupon.buyer.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("seller_nick", this.sellerNick);
		txtParams.put("status", this.status);
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

	public Class<PromotionCouponBuyerSearchResponse> getResponseClass() {
		return PromotionCouponBuyerSearchResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMinValue(pageNo,1L,"pageNo");
		RequestCheckUtils.checkMaxValue(pageSize,20L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,10L,"pageSize");
		RequestCheckUtils.checkNotEmpty(status,"status");
	}
}
