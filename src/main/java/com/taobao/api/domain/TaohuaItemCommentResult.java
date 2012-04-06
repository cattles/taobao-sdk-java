package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 淘花商品评论
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemCommentResult extends TaobaoObject {

	private static final long serialVersionUID = 2654479643442658276L;

	/**
	 * 淘花商品评论列表
	 */
	@ApiListField("taohua_item_comments")
	@ApiField("taohua_item_comment")
	private List<TaohuaItemComment> taohuaItemComments;

	/**
	 * 评论总数
	 */
	@ApiField("total_comment_num")
	private Long totalCommentNum;

	public List<TaohuaItemComment> getTaohuaItemComments() {
		return this.taohuaItemComments;
	}
	public void setTaohuaItemComments(List<TaohuaItemComment> taohuaItemComments) {
		this.taohuaItemComments = taohuaItemComments;
	}

	public Long getTotalCommentNum() {
		return this.totalCommentNum;
	}
	public void setTotalCommentNum(Long totalCommentNum) {
		this.totalCommentNum = totalCommentNum;
	}

}
