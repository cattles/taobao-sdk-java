package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AppCustomer;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.customer.permit response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class IncrementCustomerPermitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8851816187495194157L;

	/** 
	 * 当订阅成功后，返回的订阅情况。具体内容见AppCustomer数据结构。
	 */
	@ApiField("app_customer")
	private AppCustomer appCustomer;

	public void setAppCustomer(AppCustomer appCustomer) {
		this.appCustomer = appCustomer;
	}
	public AppCustomer getAppCustomer( ) {
		return this.appCustomer;
	}

}
