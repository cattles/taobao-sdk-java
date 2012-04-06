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
public class PosterPicture extends TaobaoObject {

	private static final long serialVersionUID = 8534997669832726982L;

	/**
	 * 创建时间。
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 相关说明。
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片ID。
	 */
	@ApiField("id")
	private String id;

	/**
	 * 修改时间。
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 画报ID。
	 */
	@ApiField("poster_id")
	private String posterId;

	/**
	 * 图片地址。
	 */
	@ApiField("url")
	private String url;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getPosterId() {
		return this.posterId;
	}
	public void setPosterId(String posterId) {
		this.posterId = posterId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
