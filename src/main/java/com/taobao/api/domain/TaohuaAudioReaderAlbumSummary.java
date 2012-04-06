package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 有声读物专辑摘要
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioReaderAlbumSummary extends TaobaoObject {

	private static final long serialVersionUID = 6627864119464753342L;

	/**
	 * 版权所属
	 */
	@ApiField("copyright")
	private String copyright;

	/**
	 * 专辑ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 最后更新日期
	 */
	@ApiField("last_updated")
	private String lastUpdated;

	/**
	 * 专辑封面图片url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 专辑名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 集数
	 */
	@ApiField("track_count")
	private Long trackCount;

	public String getCopyright() {
		return this.copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getLastUpdated() {
		return this.lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTrackCount() {
		return this.trackCount;
	}
	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}

}
