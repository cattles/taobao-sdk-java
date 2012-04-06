package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 指定商品评论
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemComment extends TaobaoObject {

	private static final long serialVersionUID = 6522347784744886955L;

	/**
	 * 商品评论的具体内容
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 评论发表时间
	 */
	@ApiField("comment_date")
	private Date commentDate;

	/**
	 * 评论人
	 */
	@ApiField("user_nick")
	private String userNick;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentDate() {
		return this.commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
