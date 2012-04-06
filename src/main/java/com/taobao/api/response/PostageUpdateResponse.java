package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Postage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.postage.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PostageUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6448913546243479241L;

	/** 
	 * 修改后的邮费模板信息
	 */
	@ApiField("postage")
	private Postage postage;

	public void setPostage(Postage postage) {
		this.postage = postage;
	}
	public Postage getPostage( ) {
		return this.postage;
	}

}
