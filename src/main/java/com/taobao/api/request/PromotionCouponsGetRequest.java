package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.coupons.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PromotionCouponsGetRequest implements TaobaoRequest<PromotionCouponsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 优惠券的id，唯一标识这个优惠券
	 */
	private Long couponId;

	/** 
	* 优惠券的面额，必须是3，5，10，20，50,100
	 */
	private Long denominations;

	/** 
	* 优惠券的截止日期
	 */
	private Date endTime;

	/** 
	* 查询的页号，结果集是分页返回的，每页20条
	 */
	private Long pageNo;

	/** 
	* 每页条数
	 */
	private Long pageSize;

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public Long getCouponId() {
		return this.couponId;
	}

	public void setDenominations(Long denominations) {
		this.denominations = denominations;
	}
	public Long getDenominations() {
		return this.denominations;
	}

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

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.coupons.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("coupon_id", this.couponId);
		txtParams.put("denominations", this.denominations);
		txtParams.put("end_time", this.endTime);
		txtParams.put("page_no", this.pageNo);
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

	public Class<PromotionCouponsGetResponse> getResponseClass() {
		return PromotionCouponsGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxValue(denominations,100L,"denominations");
		RequestCheckUtils.checkMinValue(denominations,3L,"denominations");
		RequestCheckUtils.checkMinValue(pageNo,1L,"pageNo");
	}
}
