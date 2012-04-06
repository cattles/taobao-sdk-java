package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.meal.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionMealDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1642752734811119946L;

	/** 
	 * true：成功 false：失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 修改时间。
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}

}
