package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 物流跟踪信息的一条
 *
 * @author auto create
 * @since 1.0, null
 */
public class TransitStepInfo extends TaobaoObject {

	private static final long serialVersionUID = 4855587147922696711L;

	/**
	 * 状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 状态发生的时间
	 */
	@ApiField("status_time")
	private String statusTime;

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getStatusTime() {
		return this.statusTime;
	}
	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

}
