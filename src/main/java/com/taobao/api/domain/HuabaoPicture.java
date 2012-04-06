package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 画报图片结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class HuabaoPicture extends TaobaoObject {

	private static final long serialVersionUID = 4121683976637282936L;

	/**
	 * 图片创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 图片修改时间
	 */
	@ApiField("modified_date")
	private Date modifiedDate;

	/**
	 * 图片ID
	 */
	@ApiField("pic_id")
	private String picId;

	/**
	 * 图片说明
	 */
	@ApiField("pic_note")
	private String picNote;

	/**
	 * 图片URL
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 画报ID
	 */
	@ApiField("poster_id")
	private Long posterId;

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getPicId() {
		return this.picId;
	}
	public void setPicId(String picId) {
		this.picId = picId;
	}

	public String getPicNote() {
		return this.picNote;
	}
	public void setPicNote(String picNote) {
		this.picNote = picNote;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getPosterId() {
		return this.posterId;
	}
	public void setPosterId(Long posterId) {
		this.posterId = posterId;
	}

}
