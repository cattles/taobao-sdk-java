package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘花订单对象数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaOrder extends TaobaoObject {

	private static final long serialVersionUID = 1469341745924326253L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 最后修改时间
	 */
	@ApiField("modified")
	private String modified;

	/**
	 * 订单编号
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * 1、wait_pay:等待买家付款、
2、timeout_close: 系统超时关闭、 　
3、pay_suc:交易成功、　　　　　　
4、uncreate_trade:没有创建外部交易（支付宝交易）、　 　　           
 　　　　　
5、micropay_trade_close: 交易被淘宝微支付关闭、　 　　           　　　　　　　6、alipay_trade_close:交易被支付宝关闭、　 　　
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 商品图片链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 商品价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getModified() {
		return this.modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
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

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
