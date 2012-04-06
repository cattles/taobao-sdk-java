package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Postage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.postage.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PostageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6253895194916334378L;

	/** 
	 * 运费模板
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
