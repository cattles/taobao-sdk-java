package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMealDeleteResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.meal.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PromotionMealDeleteRequest implements TaobaoRequest<PromotionMealDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 搭配套餐id。
	 */
	private Long mealId;

	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}
	public Long getMealId() {
		return this.mealId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.meal.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("meal_id", this.mealId);
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

	public Class<PromotionMealDeleteResponse> getResponseClass() {
		return PromotionMealDeleteResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(mealId,"mealId");
	}
}
