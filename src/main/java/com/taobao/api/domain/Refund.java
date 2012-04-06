package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 退款结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Refund extends TaobaoObject {

	private static final long serialVersionUID = 1171771267366583873L;

	/**
	 * 卖家收货地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 物流公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 退款申请时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 退款说明
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 退货时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("good_return_time")
	private Date goodReturnTime;

	/**
	 * 货物状态。可选值
BUYER_NOT_RECEIVED (买家未收到货) 
BUYER_RECEIVED (买家已收到货) 
BUYER_RETURNED_GOODS (买家已退货)
	 */
	@ApiField("good_status")
	private String goodStatus;

	/**
	 * 买家是否需要退货。可选值:true(是),false(否)
	 */
	@ApiField("has_good_return")
	private Boolean hasGoodReturn;

	/**
	 * 申请退款的商品字符串编号(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 更新时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 商品购买数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 申请退款的商品数字编号
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 子订单号。如果是单笔交易oid会等于tid
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 退款对应的订单交易状态。
可选值
TRADE_NO_CREATE_PAY(没有创建支付宝交易) 
WAIT_BUYER_PAY(等待买家付款) 
WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) 
WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) 
TRADE_BUYER_SIGNED(买家已签收,货到付款专用) 
TRADE_FINISHED(交易成功) 
TRADE_CLOSED(交易关闭) 
TRADE_CLOSED_BY_TAOBAO(交易被淘宝关闭) 
ALL_WAIT_PAY(包含：WAIT_BUYER_PAY、TRADE_NO_CREATE_PAY) 
ALL_CLOSED(包含：TRADE_CLOSED、TRADE_CLOSED_BY_TAOBAO) 
取自"http://open.taobao.com/dev/index.php/%E4%BA%A4%E6%98%93%E7%8A%B6%E6%80%81"
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付给卖家的金额(交易总金额-退还给买家的金额)。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 退款原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 退还金额(退还给买家的金额)。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款单号
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * 退款超时结构RefundRemindTimeout
	 */
	@ApiField("refund_remind_timeout")
	private RefundRemindTimeout refundRemindTimeout;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 物流方式.可选值:free(卖家包邮),post(平邮),express(快递),ems(EMS).
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * 退货运单号
	 */
	@ApiField("sid")
	private String sid;

	/**
	 * 退款状态。
可选值
WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) 
WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) 
WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) 
SELLER_REFUSE_BUYER(卖家拒绝退款) 
CLOSED(退款关闭) 
SUCCESS(退款成功)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 淘宝交易单号
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 交易总金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getGoodReturnTime() {
		return this.goodReturnTime;
	}
	public void setGoodReturnTime(Date goodReturnTime) {
		this.goodReturnTime = goodReturnTime;
	}

	public String getGoodStatus() {
		return this.goodStatus;
	}
	public void setGoodStatus(String goodStatus) {
		this.goodStatus = goodStatus;
	}

	public Boolean getHasGoodReturn() {
		return this.hasGoodReturn;
	}
	public void setHasGoodReturn(Boolean hasGoodReturn) {
		this.hasGoodReturn = hasGoodReturn;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
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

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public RefundRemindTimeout getRefundRemindTimeout() {
		return this.refundRemindTimeout;
	}
	public void setRefundRemindTimeout(RefundRemindTimeout refundRemindTimeout) {
		this.refundRemindTimeout = refundRemindTimeout;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
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
