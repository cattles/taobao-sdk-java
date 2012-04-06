package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.customer.stop response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class IncrementCustomerStopResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7715276932111353848L;

	/** 
	 * 关闭增量消息是否成功
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
