package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.append response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGroupAppendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3419295722567885397L;

	/** 
	 * 异步任务请求成功，添加任务是否完成通过taobao.crm.grouptask.check检测
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
