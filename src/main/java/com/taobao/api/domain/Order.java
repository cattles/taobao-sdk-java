package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 订单结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Order extends TaobaoObject {

	private static final long serialVersionUID = 1395274212384849748L;

	/**
	 * 手工调整金额.格式为:1.01;单位:元;精确到小数点后两位.
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 买家是否已评价。可选值：true(已评价)，false(未评价)
	 */
	@ApiField("buyer_rate")
	private Boolean buyerRate;

	/**
	 * 交易商品对应的类目ID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 订单优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 商品的字符串编号(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 是否超卖
	 */
	@ApiField("is_oversold")
	private Boolean isOversold;

	/**
	 * 套餐ID
	 */
	@ApiField("item_meal_id")
	private Long itemMealId;

	/**
	 * 套餐的值。如：M8原装电池:便携支架:M8专用座充:莫凡保护袋
	 */
	@ApiField("item_meal_name")
	private String itemMealName;

	/**
	 * 订单修改时间，目前只有taobao.trade.ordersku.update会返回此字段。
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 购买数量。取值范围:大于零的整数
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品数字ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 子订单编号
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 商家外部编码(可与商家外部系统对接)。外部商家自己定义的商品Item的id，可以通过taobao.items.custom.get获取商品的Item的信息
	 */
	@ApiField("outer_iid")
	private String outerIid;

	/**
	 * 外部网店自己定义的Sku编号
	 */
	@ApiField("outer_sku_id")
	private String outerSkuId;

	/**
	 * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。计算公式如下：payment = price * num + adjust_fee - discount_fee + post_fee(邮费，单笔子订单时子订单实付金额包含邮费，多笔子订单时不包含邮费)；对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。建议使用退款前的实付金额减去退款单中的实际退款金额计算。
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 商品图片的绝对路径
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * 商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 最近退款ID
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) CLOSED(退款关闭) SUCCESS(退款成功)
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 卖家是否已评价。可选值：true(已评价)，false(未评价)
	 */
	@ApiField("seller_rate")
	private Boolean sellerRate;

	/**
	 * 卖家类型，可选值为：B（商城商家），C（普通卖家）
	 */
	@ApiField("seller_type")
	private String sellerType;

	/**
	 * 商品的最小库存单位Sku的id.可以通过taobao.item.sku.get获取详细的Sku信息
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
	 */
	@ApiField("sku_properties_name")
	private String skuPropertiesName;

	/**
	 * 订单快照详细信息
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 订单快照URL
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * 订单状态（请关注此状态，如果为TRADE_CLOSED_BY_TAOBAO状态，则不要对此订单进行发货，切记啊！）。可选值: 
<ul>
<li>TRADE_NO_CREATE_PAY(没有创建支付宝交易) 
<li>WAIT_BUYER_PAY(等待买家付款) 
<li>WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) 
<li>WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) 
<li>TRADE_BUYER_SIGNED(买家已签收,货到付款专用) 
<li>TRADE_FINISHED(交易成功) 
<li>TRADE_CLOSED(付款以后用户退款成功，交易自动关闭) 
<li>TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 订单超时到期时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("timeout_action_time")
	private Date timeoutActionTime;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 应付金额（商品价格 * 商品数量 + 手工调整金额 - 订单优惠金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Boolean getIsOversold() {
		return this.isOversold;
	}
	public void setIsOversold(Boolean isOversold) {
		this.isOversold = isOversold;
	}

	public Long getItemMealId() {
		return this.itemMealId;
	}
	public void setItemMealId(Long itemMealId) {
		this.itemMealId = itemMealId;
	}

	public String getItemMealName() {
		return this.itemMealName;
	}
	public void setItemMealName(String itemMealName) {
		this.itemMealName = itemMealName;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOuterIid() {
		return this.outerIid;
	}
	public void setOuterIid(String outerIid) {
		this.outerIid = outerIid;
	}

	public String getOuterSkuId() {
		return this.outerSkuId;
	}
	public void setOuterSkuId(String outerSkuId) {
		this.outerSkuId = outerSkuId;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuPropertiesName() {
		return this.skuPropertiesName;
	}
	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(Date timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
