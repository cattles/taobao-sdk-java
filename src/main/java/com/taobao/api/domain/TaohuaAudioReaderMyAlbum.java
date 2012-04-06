package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 我购买的有声读物专辑
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioReaderMyAlbum extends TaobaoObject {

	private static final long serialVersionUID = 3642137817238717898L;

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
	 * 专辑内已购买的单曲总数
	 */
	@ApiField("my_track_count")
	private Long myTrackCount;

	/**
	 * 专辑封面图片url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 购买专辑的序列ID
	 */
	@ApiField("serial_id")
	private Long serialId;

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
	 * 专辑内的单曲总数
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

	public Long getMyTrackCount() {
		return this.myTrackCount;
	}
	public void setMyTrackCount(Long myTrackCount) {
		this.myTrackCount = myTrackCount;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getSerialId() {
		return this.serialId;
	}
	public void setSerialId(Long serialId) {
		this.serialId = serialId;
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
