package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Refund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.refuse response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RefundRefuseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2761732228783941518L;

	/** 
	 * 拒绝退款成功后，会返回Refund数据结构中的refund_id, status, modified字段
	 */
	@ApiField("refund")
	private Refund refund;

	public void setRefund(Refund refund) {
		this.refund = refund;
	}
	public Refund getRefund( ) {
		return this.refund;
	}

}
