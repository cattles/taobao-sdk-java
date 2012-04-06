package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.coupon.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PromotionCouponAddRequest implements TaobaoRequest<PromotionCouponAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 订单满多少元才能用这个优惠券，500就是满500元才能使用
	 */
	private Long condition;

	/** 
	* 优惠券的面额，必须是3，5，10，20，50，100
	 */
	private Long denominations;

	/** 
	* 优惠券的截止日期
	 */
	private Date endTime;

	public void setCondition(Long condition) {
		this.condition = condition;
	}
	public Long getCondition() {
		return this.condition;
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

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.coupon.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("condition", this.condition);
		txtParams.put("denominations", this.denominations);
		txtParams.put("end_time", this.endTime);
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

	public Class<PromotionCouponAddResponse> getResponseClass() {
		return PromotionCouponAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(denominations,"denominations");
		RequestCheckUtils.checkMaxValue(denominations,100L,"denominations");
		RequestCheckUtils.checkMinValue(denominations,3L,"denominations");
		RequestCheckUtils.checkNotEmpty(endTime,"endTime");
	}
}
