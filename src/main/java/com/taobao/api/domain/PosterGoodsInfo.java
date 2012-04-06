package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 与对应画报相关联的商品的信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class PosterGoodsInfo extends TaobaoObject {

	private static final long serialVersionUID = 3784516253123769412L;

	/**
	 * 商品描述信息
	 */
	@ApiField("note")
	private String note;

	/**
	 * 商品id
	 */
	@ApiField("num_id")
	private Long numId;

	/**
	 * 图片id
	 */
	@ApiField("pic_id")
	private Long picId;

	/**
	 * 画报id
	 */
	@ApiField("poster_id")
	private Long posterId;

	/**
	 * 商品价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品短标题
	 */
	@ApiField("short_title")
	private String shortTitle;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 手机上相应购买地址
	 */
	@ApiField("url")
	private String url;

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public Long getNumId() {
		return this.numId;
	}
	public void setNumId(Long numId) {
		this.numId = numId;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getShortTitle() {
		return this.shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
