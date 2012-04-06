package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponTransferResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.coupon.transfer request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PromotionCouponTransferRequest implements TaobaoRequest<PromotionCouponTransferResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 优惠券编号
	 */
	private Long couponNumber;

	/** 
	* 要赠送的淘宝昵称
	 */
	private String receiveingBuyerName;

	public void setCouponNumber(Long couponNumber) {
		this.couponNumber = couponNumber;
	}
	public Long getCouponNumber() {
		return this.couponNumber;
	}

	public void setReceiveingBuyerName(String receiveingBuyerName) {
		this.receiveingBuyerName = receiveingBuyerName;
	}
	public String getReceiveingBuyerName() {
		return this.receiveingBuyerName;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.coupon.transfer";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("coupon_number", this.couponNumber);
		txtParams.put("receiveing_buyer_name", this.receiveingBuyerName);
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

	public Class<PromotionCouponTransferResponse> getResponseClass() {
		return PromotionCouponTransferResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(couponNumber,"couponNumber");
		RequestCheckUtils.checkMinValue(couponNumber,1L,"couponNumber");
		RequestCheckUtils.checkNotEmpty(receiveingBuyerName,"receiveingBuyerName");
	}
}
