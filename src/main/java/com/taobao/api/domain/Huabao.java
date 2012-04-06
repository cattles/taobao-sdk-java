package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 画报数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Huabao extends TaobaoObject {

	private static final long serialVersionUID = 4843197948317548779L;

	/**
	 * 画报所属频道ID
	 */
	@ApiField("channel_id")
	private Long channelId;

	/**
	 * 画报封面地址
	 */
	@ApiField("cover_pic_url")
	private String coverPicUrl;

	/**
	 * 画报创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 画报点击数
	 */
	@ApiField("hits")
	private Long hits;

	/**
	 * 画报ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 画报修改时间
	 */
	@ApiField("modified_date")
	private Date modifiedDate;

	/**
	 * 画报标签
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 图片标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 画报短标题
	 */
	@ApiField("title_short")
	private String titleShort;

	/**
	 * 画报权重0-10
	 */
	@ApiField("weight")
	private Long weight;

	public Long getChannelId() {
		return this.channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getCoverPicUrl() {
		return this.coverPicUrl;
	}
	public void setCoverPicUrl(String coverPicUrl) {
		this.coverPicUrl = coverPicUrl;
	}

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getHits() {
		return this.hits;
	}
	public void setHits(Long hits) {
		this.hits = hits;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleShort() {
		return this.titleShort;
	}
	public void setTitleShort(String titleShort) {
		this.titleShort = titleShort;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
