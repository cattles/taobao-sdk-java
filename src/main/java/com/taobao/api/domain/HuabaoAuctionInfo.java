package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 画报商品数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class HuabaoAuctionInfo extends TaobaoObject {

	private static final long serialVersionUID = 6287153711775765339L;

	/**
	 * 商品ID
	 */
	@ApiField("auction_id")
	private Long auctionId;

	/**
	 * 商品描述
	 */
	@ApiField("auction_note")
	private String auctionNote;

	/**
	 * 商品位置坐标,形式为："x:y",x坐标,y坐标
	 */
	@ApiField("auction_position")
	private String auctionPosition;

	/**
	 * 商品价格
	 */
	@ApiField("auction_price")
	private String auctionPrice;

	/**
	 * 商品短标题
	 */
	@ApiField("auction_short_title")
	private String auctionShortTitle;

	/**
	 * 商品标题
	 */
	@ApiField("auction_title")
	private String auctionTitle;

	/**
	 * 商品链接
	 */
	@ApiField("auction_url")
	private String auctionUrl;

	/**
	 * 商品图片ID
	 */
	@ApiField("pic_id")
	private Long picId;

	/**
	 * 画报ID
	 */
	@ApiField("poster_id")
	private Long posterId;

	public Long getAuctionId() {
		return this.auctionId;
	}
	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionNote() {
		return this.auctionNote;
	}
	public void setAuctionNote(String auctionNote) {
		this.auctionNote = auctionNote;
	}

	public String getAuctionPosition() {
		return this.auctionPosition;
	}
	public void setAuctionPosition(String auctionPosition) {
		this.auctionPosition = auctionPosition;
	}

	public String getAuctionPrice() {
		return this.auctionPrice;
	}
	public void setAuctionPrice(String auctionPrice) {
		this.auctionPrice = auctionPrice;
	}

	public String getAuctionShortTitle() {
		return this.auctionShortTitle;
	}
	public void setAuctionShortTitle(String auctionShortTitle) {
		this.auctionShortTitle = auctionShortTitle;
	}

	public String getAuctionTitle() {
		return this.auctionTitle;
	}
	public void setAuctionTitle(String auctionTitle) {
		this.auctionTitle = auctionTitle;
	}

	public String getAuctionUrl() {
		return this.auctionUrl;
	}
	public void setAuctionUrl(String auctionUrl) {
		this.auctionUrl = auctionUrl;
	}

	public Long getPicId() {
		return this.picId;
	}
	public void setPicId(Long picId) {
		this.picId = picId;
	}

	public Long getPosterId() {
		return this.posterId;
	}
	public void setPosterId(Long posterId) {
		this.posterId = posterId;
	}

}
