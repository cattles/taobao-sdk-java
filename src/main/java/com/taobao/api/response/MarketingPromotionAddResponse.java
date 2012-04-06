package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Promotion;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.marketing.promotion.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MarketingPromotionAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2145543538185122818L;

	/** 
	 * 是否设置成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 返回设置成功的优惠策略信息，仅返回Promotion数据结构中的promotion_id,item_id,item_detail_url。
	 */
	@ApiListField("promotions")
	@ApiField("promotion")
	private List<Promotion> promotions;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}
	public List<Promotion> getPromotions( ) {
		return this.promotions;
	}

}
