package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaItemCommentResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.itemcomments.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemcommentsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3828918541657695516L;

	/** 
	 * 淘花商品评论
	 */
	@ApiField("taohua_comments_result")
	private TaohuaItemCommentResult taohuaCommentsResult;

	public void setTaohuaCommentsResult(TaohuaItemCommentResult taohuaCommentsResult) {
		this.taohuaCommentsResult = taohuaCommentsResult;
	}
	public TaohuaItemCommentResult getTaohuaCommentsResult( ) {
		return this.taohuaCommentsResult;
	}

}
