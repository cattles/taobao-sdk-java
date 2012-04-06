package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 有声读物专辑信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioReaderAlbum extends TaobaoObject {

	private static final long serialVersionUID = 5788442542831139675L;

	/**
	 * 播音员名称
	 */
	@ApiField("artist_name")
	private String artistName;

	/**
	 * 码流
	 */
	@ApiField("bit_rate")
	private String bitRate;

	/**
	 * 版权所属
	 */
	@ApiField("copyright")
	private String copyright;

	/**
	 * 专辑简介
	 */
	@ApiField("description")
	private String description;

	/**
	 * 时长
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 格式
	 */
	@ApiField("format")
	private String format;

	/**
	 * 专辑ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 专辑最后更新日期
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
	 * 专辑状态
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

	public String getArtistName() {
		return this.artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getBitRate() {
		return this.bitRate;
	}
	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}

	public String getCopyright() {
		return this.copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFormat() {
		return this.format;
	}
	public void setFormat(String format) {
		this.format = format;
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
