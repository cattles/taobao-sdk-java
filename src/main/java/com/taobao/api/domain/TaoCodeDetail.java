package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘代码详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaoCodeDetail extends TaobaoObject {

	private static final long serialVersionUID = 8695898574534368162L;

	/**
	 * 跳转URL，当type=9时才有值
	 */
	@ApiField("direct_url")
	private String directUrl;

	/**
	 * 宝贝一级类目编号
	 */
	@ApiField("item_category")
	private String itemCategory;

	/**
	 * 宝贝数字ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 宝贝关键词
	 */
	@ApiField("item_keywords")
	private String itemKeywords;

	/**
	 * 宝贝状态，0,1：正常，-1：卖家删除，-2：卖家下架，-3：小二下架，-4：小二删除，-5：从未上架，-9：CC
	 */
	@ApiField("item_status")
	private Long itemStatus;

	/**
	 * 淘代码是否过期，true：过期，false：未过期。
	 */
	@ApiField("overdue")
	private Boolean overdue;

	/**
	 * 店铺类目编号
	 */
	@ApiField("shop_category")
	private Long shopCategory;

	/**
	 * 店铺编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 淘代码状态，0：删除， 1：下线， 2：上线。
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 淘代码
	 */
	@ApiField("tao_code")
	private String taoCode;

	/**
	 * 淘代码类型，1：宝贝淘代码，2：店铺淘代码，9：其他淘代码。
	 */
	@ApiField("type")
	private Long type;

	public String getDirectUrl() {
		return this.directUrl;
	}
	public void setDirectUrl(String directUrl) {
		this.directUrl = directUrl;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemKeywords() {
		return this.itemKeywords;
	}
	public void setItemKeywords(String itemKeywords) {
		this.itemKeywords = itemKeywords;
	}

	public Long getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(Long itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Boolean getOverdue() {
		return this.overdue;
	}
	public void setOverdue(Boolean overdue) {
		this.overdue = overdue;
	}

	public Long getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(Long shopCategory) {
		this.shopCategory = shopCategory;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTaoCode() {
		return this.taoCode;
	}
	public void setTaoCode(String taoCode) {
		this.taoCode = taoCode;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
