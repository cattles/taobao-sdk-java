package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.AppCustomer;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.customers.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class IncrementCustomersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8443722664653531693L;

	/** 
	 * 查询到的用户开通信息
	 */
	@ApiListField("app_customers")
	@ApiField("app_customer")
	private List<AppCustomer> appCustomers;

	/** 
	 * 查询到的开通增量服务的用户数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setAppCustomers(List<AppCustomer> appCustomers) {
		this.appCustomers = appCustomers;
	}
	public List<AppCustomer> getAppCustomers( ) {
		return this.appCustomers;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
