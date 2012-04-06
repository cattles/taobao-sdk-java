package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 采购单及子采购单信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class PurchaseOrder extends TaobaoObject {

	private static final long serialVersionUID = 7732221747445236968L;

	/**
	 * 支付宝交易号。
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 买家nick，供应商查询不会返回买家昵称，分销商查询才会返回。
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 物流发货时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consign_time")
	private Date consignTime;

	/**
	 * 采购单创建时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 分销商来源网站（taobao）。
	 */
	@ApiField("distributor_from")
	private String distributorFrom;

	/**
	 * 分销商实付金额。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("distributor_payment")
	private String distributorPayment;

	/**
	 * 分销商在来源网站的帐号名。
	 */
	@ApiField("distributor_username")
	private String distributorUsername;

	/**
	 * 分销流水号，分销平台产生的主键
	 */
	@ApiField("fenxiao_id")
	private Long fenxiaoId;

	/**
	 * 采购单编号。(淘宝交易编号)
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 采购单留言。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 交易修改时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 付款时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付方式：ALIPAY_SURETY（支付宝担保交易）、TRANSFER（转账汇款）、PREPAY（企业预存款）、SETTLEMENT（后期结算）
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 采购单邮费。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * 买家详细的信息。
	 */
	@ApiField("receiver")
	private Receiver receiver;

	/**
	 * 订单快照URL
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * 采购单交易状态。可选值：<br>
WAIT_BUYER_PAY(等待付款)<br>
WAIT_CONFIRM(付款信息待确认)<br>
WAIT_CONFIRM_WAIT_SEND_GOODS(付款信息待确认，待发货)<br>
WAIT_CONFIRM_SEND_GOODS(付款信息待确认，已发货)<br>
WAIT_CONFIRM_GOODS_CONFIRM(付款信息待确认，已收货)<br>
WAIT_SELLER_SEND_GOODS(已付款，待发货<br>
WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)<br>
CONFIRM_WAIT_SEND_GOODS(付款信息已确认，待发货)<br>
CONFIRM_SEND_GOODS(付款信息已确认，已发货)<br>
TRADE_FINISHED(交易成功)<br>
TRADE_CLOSED(交易关闭)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子订单的详细信息列表。
	 */
	@ApiListField("sub_purchase_orders")
	@ApiField("sub_purchase_order")
	private List<SubPurchaseOrder> subPurchaseOrders;

	/**
	 * 供应商来源网站, values: taobao, alibaba
	 */
	@ApiField("supplier_from")
	private String supplierFrom;

	/**
	 * 供应商备注
	 */
	@ApiField("supplier_memo")
	private String supplierMemo;

	/**
	 * 供应商在来源网站的帐号名。
	 */
	@ApiField("supplier_username")
	private String supplierUsername;

	/**
	 * 主订单ID （经销不显示）
	 */
	@ApiField("tc_order_id")
	private Long tcOrderId;

	/**
	 * 采购单总额（不含邮费,精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 分销方式：AGENT（代销）、DEALER（经销）
	 */
	@ApiField("trade_type")
	private String tradeType;

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

	public Date getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDistributorFrom() {
		return this.distributorFrom;
	}
	public void setDistributorFrom(String distributorFrom) {
		this.distributorFrom = distributorFrom;
	}

	public String getDistributorPayment() {
		return this.distributorPayment;
	}
	public void setDistributorPayment(String distributorPayment) {
		this.distributorPayment = distributorPayment;
	}

	public String getDistributorUsername() {
		return this.distributorUsername;
	}
	public void setDistributorUsername(String distributorUsername) {
		this.distributorUsername = distributorUsername;
	}

	public Long getFenxiaoId() {
		return this.fenxiaoId;
	}
	public void setFenxiaoId(Long fenxiaoId) {
		this.fenxiaoId = fenxiaoId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Receiver getReceiver() {
		return this.receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
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

	public List<SubPurchaseOrder> getSubPurchaseOrders() {
		return this.subPurchaseOrders;
	}
	public void setSubPurchaseOrders(List<SubPurchaseOrder> subPurchaseOrders) {
		this.subPurchaseOrders = subPurchaseOrders;
	}

	public String getSupplierFrom() {
		return this.supplierFrom;
	}
	public void setSupplierFrom(String supplierFrom) {
		this.supplierFrom = supplierFrom;
	}

	public String getSupplierMemo() {
		return this.supplierMemo;
	}
	public void setSupplierMemo(String supplierMemo) {
		this.supplierMemo = supplierMemo;
	}

	public String getSupplierUsername() {
		return this.supplierUsername;
	}
	public void setSupplierUsername(String supplierUsername) {
		this.supplierUsername = supplierUsername;
	}

	public Long getTcOrderId() {
		return this.tcOrderId;
	}
	public void setTcOrderId(Long tcOrderId) {
		this.tcOrderId = tcOrderId;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
