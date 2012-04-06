package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 淘花商品数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItem extends TaobaoObject {

	private static final long serialVersionUID = 2471356328234156345L;

	/**
	 * 描述图书作者信息
	 */
	@ApiField("author")
	private String author;

	/**
	 * 商品描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 描述用户喜欢值
	 */
	@ApiField("favorite")
	private Long favorite;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 叶子类目的ID
	 */
	@ApiField("leaf_cate_id")
	private Long leafCateId;

	/**
	 * 叶子类目的名称
	 */
	@ApiField("leaf_cate_name")
	private String leafCateName;

	/**
	 * 商品图片链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 商品价格属性
	 */
	@ApiField("price")
	private String price;

	/**
	 * 描述出版日期
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * 描述商品出版社属性
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * 根类目ID
	 */
	@ApiField("root_cate_id")
	private Long rootCateId;

	/**
	 * 根类目名称
	 */
	@ApiField("root_cate_name")
	private String rootCateName;

	/**
	 * 文件大小，单位byte
	 */
	@ApiField("size")
	private String size;

	/**
	 * 从未上架 never_put_shelves,
上架put_shelves,
小二下架down_shevles,
删除delete,
用户下架down_shevles_by_seller
	 */
	@ApiField("status_name")
	private String statusName;

	/**
	 * 淘花商品的属性值对数据结构
	 */
	@ApiListField("taohua_item_pv_pairs")
	@ApiField("taohua_item_p_v_pair")
	private List<TaohuaItemPVPair> taohuaItemPvPairs;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

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

	public Long getFavorite() {
		return this.favorite;
	}
	public void setFavorite(Long favorite) {
		this.favorite = favorite;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLeafCateId() {
		return this.leafCateId;
	}
	public void setLeafCateId(Long leafCateId) {
		this.leafCateId = leafCateId;
	}

	public String getLeafCateName() {
		return this.leafCateName;
	}
	public void setLeafCateName(String leafCateName) {
		this.leafCateName = leafCateName;
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

	public String getRootCateName() {
		return this.rootCateName;
	}
	public void setRootCateName(String rootCateName) {
		this.rootCateName = rootCateName;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getStatusName() {
		return this.statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public List<TaohuaItemPVPair> getTaohuaItemPvPairs() {
		return this.taohuaItemPvPairs;
	}
	public void setTaohuaItemPvPairs(List<TaohuaItemPVPair> taohuaItemPvPairs) {
		this.taohuaItemPvPairs = taohuaItemPvPairs;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
