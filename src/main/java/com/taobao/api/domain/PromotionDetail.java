package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 交易的优惠信息详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class PromotionDetail extends TaobaoObject {

	private static final long serialVersionUID = 8638185514332247913L;

	/**
	 * 优惠金额（免运费、限时打折时为空）,单位：元
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 满就送商品时，所送商品的名称
	 */
	@ApiField("gift_item_name")
	private String giftItemName;

	/**
	 * 交易的主订单或子订单号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 优惠信息的名称
	 */
	@ApiField("promotion_name")
	private String promotionName;

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getGiftItemName() {
		return this.giftItemName;
	}
	public void setGiftItemName(String giftItemName) {
		this.giftItemName = giftItemName;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

}
