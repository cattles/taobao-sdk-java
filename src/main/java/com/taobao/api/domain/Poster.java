package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 画报结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Poster extends TaobaoObject {

	private static final long serialVersionUID = 8332678777392779141L;

	/**
	 * 画报所属频道id。
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 封面路径。由逗号(',')分开，最多2个
	 */
	@ApiField("cover_urls")
	private String coverUrls;

	/**
	 * 创建时间。
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 画报的点击总数。
	 */
	@ApiField("hits")
	private Long hits;

	/**
	 * 画报ID。
	 */
	@ApiField("id")
	private String id;

	/**
	 * 修改时间。
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 图片短标题。
	 */
	@ApiField("short_title")
	private String shortTitle;

	/**
	 * 画报相关标签，由逗号(',')分开，最多5个。
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 图片标题。
	 */
	@ApiField("title")
	private String title;

	/**
	 * 权重。-1 至 10 。10为最高。
	 */
	@ApiField("weight")
	private Long weight;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCoverUrls() {
		return this.coverUrls;
	}
	public void setCoverUrls(String coverUrls) {
		this.coverUrls = coverUrls;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getHits() {
		return this.hits;
	}
	public void setHits(Long hits) {
		this.hits = hits;
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

	public String getShortTitle() {
		return this.shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
