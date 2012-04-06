package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.marketing.promotion.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MarketingPromotionDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8215258644297739977L;

	/** 
	 * 是否成功；true表示操作成功，false表示操作失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
