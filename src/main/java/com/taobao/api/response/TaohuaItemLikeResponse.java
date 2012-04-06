package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.item.like response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemLikeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7454151459614967125L;

	/** 
	 * 成功返回success
	 */
	@ApiField("like_result")
	private String likeResult;

	public void setLikeResult(String likeResult) {
		this.likeResult = likeResult;
	}
	public String getLikeResult( ) {
		return this.likeResult;
	}

}
