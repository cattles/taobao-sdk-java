package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘宝客商品
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeItem extends TaobaoObject {

	private static final long serialVersionUID = 5647246388319466321L;

	/**
	 * 推广点击url
	 */
	@ApiField("click_url")
	private String clickUrl;

	/**
	 * 淘宝客佣金
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * 累计成交量.注：返回的数据是30天内累计推广量
	 */
	@ApiField("commission_num")
	private String commissionNum;

	/**
	 * 淘宝客佣金比率，比如：1234.00代表12.34%
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * 累计总支出佣金量
	 */
	@ApiField("commission_volume")
	private String commissionVolume;

	/**
	 * 淘宝客商品id(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 商品所在地
	 */
	@ApiField("item_location")
	private String itemLocation;

	/**
	 * 淘宝客关键词搜索URL
	 */
	@ApiField("keyword_click_url")
	private String keywordClickUrl;

	/**
	 * 卖家昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 淘宝客商品数字id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 图片url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 商品价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 卖家信用等级
	 */
	@ApiField("seller_credit_score")
	private Long sellerCreditScore;

	/**
	 * 商品所在店铺的推广点击url
	 */
	@ApiField("shop_click_url")
	private String shopClickUrl;

	/**
	 * 淘宝客类目推广URL
	 */
	@ApiField("taobaoke_cat_click_url")
	private String taobaokeCatClickUrl;

	/**
	 * 商品title 宝贝名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 30天内交易量
	 */
	@ApiField("volume")
	private Long volume;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCommissionNum() {
		return this.commissionNum;
	}
	public void setCommissionNum(String commissionNum) {
		this.commissionNum = commissionNum;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getCommissionVolume() {
		return this.commissionVolume;
	}
	public void setCommissionVolume(String commissionVolume) {
		this.commissionVolume = commissionVolume;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getItemLocation() {
		return this.itemLocation;
	}
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}

	public String getKeywordClickUrl() {
		return this.keywordClickUrl;
	}
	public void setKeywordClickUrl(String keywordClickUrl) {
		this.keywordClickUrl = keywordClickUrl;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
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

	public Long getSellerCreditScore() {
		return this.sellerCreditScore;
	}
	public void setSellerCreditScore(Long sellerCreditScore) {
		this.sellerCreditScore = sellerCreditScore;
	}

	public String getShopClickUrl() {
		return this.shopClickUrl;
	}
	public void setShopClickUrl(String shopClickUrl) {
		this.shopClickUrl = shopClickUrl;
	}

	public String getTaobaokeCatClickUrl() {
		return this.taobaokeCatClickUrl;
	}
	public void setTaobaokeCatClickUrl(String taobaokeCatClickUrl) {
		this.taobaokeCatClickUrl = taobaokeCatClickUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
