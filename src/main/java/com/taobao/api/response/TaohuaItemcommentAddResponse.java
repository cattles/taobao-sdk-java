package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.itemcomment.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemcommentAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7583283876899216488L;

	/** 
	 * 发表评论成功标志
	 */
	@ApiField("add_comment_result")
	private String addCommentResult;

	public void setAddCommentResult(String addCommentResult) {
		this.addCommentResult = addCommentResult;
	}
	public String getAddCommentResult( ) {
		return this.addCommentResult;
	}

}
