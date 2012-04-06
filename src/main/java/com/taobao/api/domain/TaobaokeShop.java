package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘宝客店铺
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeShop extends TaobaoObject {

	private static final long serialVersionUID = 4413433936595213295L;

	/**
	 * 店铺内商品总数
	 */
	@ApiField("auction_count")
	private Long auctionCount;

	/**
	 * 店铺推广URL
	 */
	@ApiField("click_url")
	private String clickUrl;

	/**
	 * 淘宝客店铺佣金比率
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * 店铺掌柜信用等级
	 */
	@ApiField("seller_credit")
	private String sellerCredit;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_title")
	private String shopTitle;

	/**
	 * 店铺类型 B=商城卖家 C=普通卖家
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 累计推广量
	 */
	@ApiField("total_auction")
	private String totalAuction;

	/**
	 * 店铺用户id
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getAuctionCount() {
		return this.auctionCount;
	}
	public void setAuctionCount(Long auctionCount) {
		this.auctionCount = auctionCount;
	}

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getSellerCredit() {
		return this.sellerCredit;
	}
	public void setSellerCredit(String sellerCredit) {
		this.sellerCredit = sellerCredit;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getTotalAuction() {
		return this.totalAuction;
	}
	public void setTotalAuction(String totalAuction) {
		this.totalAuction = totalAuction;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
