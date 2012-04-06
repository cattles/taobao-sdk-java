package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMembergradeSetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.promotion.membergrade.set request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PromotionMembergradeSetRequest implements TaobaoRequest<PromotionMembergradeSetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 买家数字ID
	 */
	private Long buyerId;

	/** 
	* 买家会员级别 general：普通会员 senior ：高级会员 vip：VIP会员 king：至尊VIP
	 */
	private String grade;

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}
	public Long getBuyerId() {
		return this.buyerId;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return this.grade;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.membergrade.set";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_id", this.buyerId);
		txtParams.put("grade", this.grade);
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

	public Class<PromotionMembergradeSetResponse> getResponseClass() {
		return PromotionMembergradeSetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(buyerId,"buyerId");
		RequestCheckUtils.checkNotEmpty(grade,"grade");
	}
}
