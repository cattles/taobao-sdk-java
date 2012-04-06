package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 人群标签
 *
 * @author auto create
 * @since 1.0, null
 */
public class UserTag extends TaobaoObject {

	private static final long serialVersionUID = 2576314939675571855L;

	/**
	 * 创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 标签描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 标签ID
	 */
	@ApiField("tag_id")
	private Long tagId;

	/**
	 * 标签名称
	 */
	@ApiField("tag_name")
	private String tagName;

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTagId() {
		return this.tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
