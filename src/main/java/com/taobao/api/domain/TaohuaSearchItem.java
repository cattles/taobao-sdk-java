package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘花搜索商品对象数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaSearchItem extends TaobaoObject {

	private static final long serialVersionUID = 4393899688836949427L;

	/**
	 * 描述图书作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 商品描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 文档总页数
	 */
	@ApiField("doc_pages")
	private Long docPages;

	/**
	 * 描述用户对某一商品的喜欢程度，值越大，则表示越喜欢
	 */
	@ApiField("favorite")
	private Long favorite;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 商品图片链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 商品价格，单位：分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 描述图书出版日期
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * 描述商品的出版社信息
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * 根类目ID
	 */
	@ApiField("root_cate_id")
	private Long rootCateId;

	/**
	 * 销量
	 */
	@ApiField("sell_count")
	private Long sellCount;

	/**
	 * 淘花卖家的编号，注意：不是淘宝会员的编号。
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * 卖家的淘宝nick
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 商品所属店铺名称
	 */
	@ApiField("shop_title")
	private String shopTitle;

	/**
	 * 文件大小，单位:byte
	 */
	@ApiField("size")
	private String size;

	/**
	 * 文档后缀名
	 */
	@ApiField("suffix")
	private String suffix;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 二级类目的名称
	 */
	@ApiField("two_level_name")
	private String twoLevelName;

	/**
	 * 浏览量
	 */
	@ApiField("view_count")
	private Long viewCount;

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDocPages() {
		return this.docPages;
	}
	public void setDocPages(Long docPages) {
		this.docPages = docPages;
	}

	public Long getFavorite() {
		return this.favorite;
	}
	public void setFavorite(Long favorite) {
		this.favorite = favorite;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
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

	public String getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Long getRootCateId() {
		return this.rootCateId;
	}
	public void setRootCateId(Long rootCateId) {
		this.rootCateId = rootCateId;
	}

	public Long getSellCount() {
		return this.sellCount;
	}
	public void setSellCount(Long sellCount) {
		this.sellCount = sellCount;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getSuffix() {
		return this.suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTwoLevelName() {
		return this.twoLevelName;
	}
	public void setTwoLevelName(String twoLevelName) {
		this.twoLevelName = twoLevelName;
	}

	public Long getViewCount() {
		return this.viewCount;
	}
	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

}
