package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 有声读物单曲信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioReaderTrack extends TaobaoObject {

	private static final long serialVersionUID = 1287188452775645149L;

	/**
	 * 单曲时长
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 单曲ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 单曲更新日期
	 */
	@ApiField("last_updated")
	private String lastUpdated;

	/**
	 * 单曲价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 单曲名称
	 */
	@ApiField("title")
	private String title;

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
