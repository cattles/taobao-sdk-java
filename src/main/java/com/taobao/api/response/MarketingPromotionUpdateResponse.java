package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Promotion;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.marketing.promotion.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MarketingPromotionUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8818487261623639755L;

	/** 
	 * 是否更新成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 更新的优惠对象
	 */
	@ApiField("promotion")
	private Promotion promotion;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	public Promotion getPromotion( ) {
		return this.promotion;
	}

}
