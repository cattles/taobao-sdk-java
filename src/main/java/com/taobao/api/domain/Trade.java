package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 交易结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Trade extends TaobaoObject {

	private static final long serialVersionUID = 8433343499724411994L;

	/**
	 * 卖家手工调整金额，精确到2位小数，单位：元。如：200.07，表示：200元7分。来源于订单价格修改，如果有多笔子订单的时候，这个为0，单笔的话则跟[order].adjust_fee一样
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * 买家的支付宝id号，在UIC中有记录，买家支付宝的唯一标示，不因为买家更换Email账号而改变。
	 */
	@ApiField("alipay_id")
	private Long alipayId;

	/**
	 * 支付宝交易号，如：2009112081173831
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 创建交易接口成功后，返回的支付url
	 */
	@ApiField("alipay_url")
	private String alipayUrl;

	/**
	 * 淘宝下单成功了,但由于某种错误支付宝订单没有创建时返回的信息。taobao.trade.add接口专用
	 */
	@ApiField("alipay_warn_msg")
	private String alipayWarnMsg;

	/**
	 * 交易中剩余的确认收货金额（这个金额会随着子订单确认收货而不断减少，交易成功后会变为零）。精确到2位小数;单位:元。如:200.07，表示:200 元7分
	 */
	@ApiField("available_confirm_fee")
	private String availableConfirmFee;

	/**
	 * 买家支付宝账号
	 */
	@ApiField("buyer_alipay_no")
	private String buyerAlipayNo;

	/**
	 * 买家下单的地区
	 */
	@ApiField("buyer_area")
	private String buyerArea;

	/**
	 * 买家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
	 */
	@ApiField("buyer_cod_fee")
	private String buyerCodFee;

	/**
	 * 买家邮件地址
	 */
	@ApiField("buyer_email")
	private String buyerEmail;

	/**
	 * 买家备注旗帜（与淘宝网上订单的买家备注旗帜对应，只有买家才能查看该字段）
	 */
	@ApiField("buyer_flag")
	private Long buyerFlag;

	/**
	 * 买家备注（与淘宝网上订单的买家备注对应，只有买家才能查看该字段）
	 */
	@ApiField("buyer_memo")
	private String buyerMemo;

	/**
	 * 买家留言
	 */
	@ApiField("buyer_message")
	private String buyerMessage;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 买家获得积分,返点的积分。格式:100;单位:个。返点的积分要交易成功之后才能获得。
	 */
	@ApiField("buyer_obtain_point_fee")
	private Long buyerObtainPointFee;

	/**
	 * 买家是否已评价。可选值:true(已评价),false(未评价)
	 */
	@ApiField("buyer_rate")
	private Boolean buyerRate;

	/**
	 * 货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分。卖家不承担服务费的订单：未发货的订单获取服务费为0，发货后就能获取到正确值。
	 */
	@ApiField("cod_fee")
	private String codFee;

	/**
	 * 货到付款物流状态。
初始状态 NEW_CREATED,
接单成功 CANCELED,
接单失败 REJECTED_BY_COMPANY,
接单超时 RECIEVE_TIMEOUT,
揽收成功 TAKEN_IN_SUCCESS,
揽收失败 TAKEN_IN_FAILED,
揽收超时 RECIEVE_TIMEOUT,
签收成功 SIGN_IN,
签收失败 REJECTED_BY_OTHER_SIDE,
订单等待发送给物流公司 WAITING_TO_BE_SENT,
用户取消物流订单 CANCELED
	 */
	@ApiField("cod_status")
	private String codStatus;

	/**
	 * 交易佣金。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("commission_fee")
	private String commissionFee;

	/**
	 * 卖家发货时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consign_time")
	private Date consignTime;

	/**
	 * 交易创建时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 系统优惠金额（如打折，VIP，满就送等），精确到2位小数，单位：元。如：200.07，表示：200元7分
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 交易结束时间。交易成功时间(更新交易状态为成功的同时更新)/确认收货时间或者交易关闭时间 。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 快递代收款。精确到2位小数;单位:元。如:212.07，表示:212元7分
	 */
	@ApiField("express_agency_fee")
	private String expressAgencyFee;

	/**
	 * 是否包含邮费。与available_confirm_fee同时使用。可选值:true(包含),false(不包含)
	 */
	@ApiField("has_post_fee")
	private Boolean hasPostFee;

	/**
	 * 商品字符串编号(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_name")
	private String invoiceName;

	/**
	 * 是否是3D淘宝交易
	 */
	@ApiField("is_3D")
	private Boolean is3D;

	/**
	 * 交易修改时间(用户对订单的任何修改都会更新此字段)。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 商品购买数量。取值范围：大于零的整数
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品数字编号
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 订单列表
	 */
	@ApiListField("orders")
	@ApiField("order")
	private List<Order> orders;

	/**
	 * 付款时间。格式:yyyy-MM-dd HH:mm:ss。订单的付款时间即为物流订单的创建时间。
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 商品图片绝对途径
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * 买家使用积分。格式:100;单位:个.
	 */
	@ApiField("point_fee")
	private Long pointFee;

	/**
	 * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * 商品价格。精确到2位小数；单位：元。如：200.07，表示：200元7分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 交易促销详细信息
	 */
	@ApiField("promotion")
	private String promotion;

	/**
	 * 优惠详情
	 */
	@ApiListField("promotion_details")
	@ApiField("promotion_detail")
	private List<PromotionDetail> promotionDetails;

	/**
	 * 买家实际使用积分（扣除部分退款使用的积分）。格式:100;单位:个
	 */
	@ApiField("real_point_fee")
	private Long realPointFee;

	/**
	 * 卖家实际收到的支付宝打款金额（由于子订单可以部分确认收货，这个金额会随着子订单的确认收货而不断增加，交易成功后等于买家实付款减去退款金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("received_payment")
	private String receivedPayment;

	/**
	 * 收货人的详细地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收货人的所在城市
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * 收货人的所在地区
	 */
	@ApiField("receiver_district")
	private String receiverDistrict;

	/**
	 * 收货人的手机号码
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收货人的姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人的电话号码
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 收货人的所在省份
	 */
	@ApiField("receiver_state")
	private String receiverState;

	/**
	 * 收货人的邮编
	 */
	@ApiField("receiver_zip")
	private String receiverZip;

	/**
	 * 卖家支付宝账号
	 */
	@ApiField("seller_alipay_no")
	private String sellerAlipayNo;

	/**
	 * 卖家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
	 */
	@ApiField("seller_cod_fee")
	private String sellerCodFee;

	/**
	 * 卖家邮件地址
	 */
	@ApiField("seller_email")
	private String sellerEmail;

	/**
	 * 卖家备注旗帜（与淘宝网上订单的卖家备注旗帜对应，只有卖家才能查看该字段）
	 */
	@ApiField("seller_flag")
	private Long sellerFlag;

	/**
	 * 卖家备注（与淘宝网上订单的卖家备注对应，只有卖家才能查看该字段）
	 */
	@ApiField("seller_memo")
	private String sellerMemo;

	/**
	 * 卖家手机
	 */
	@ApiField("seller_mobile")
	private String sellerMobile;

	/**
	 * 卖家姓名
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 卖家电话
	 */
	@ApiField("seller_phone")
	private String sellerPhone;

	/**
	 * 卖家是否已评价。可选值:true(已评价),false(未评价)
	 */
	@ApiField("seller_rate")
	private Boolean sellerRate;

	/**
	 * 创建交易时的物流方式（交易完成前，物流方式有可能改变，但系统里的这个字段一直不变）。可选值：ems, express, post, free, virtual。
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * 交易快照详细信息
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 交易快照地址
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * 交易状态。可选值:
    * TRADE_NO_CREATE_PAY(没有创建支付宝交易)
    * WAIT_BUYER_PAY(等待买家付款)
    * WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款)
    * WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货)
    * TRADE_BUYER_SIGNED(买家已签收,货到付款专用)
    * TRADE_FINISHED(交易成功)
    * TRADE_CLOSED(付款以后用户退款成功，交易自动关闭)
    * TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易编号 (父订单的交易编号)
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 超时到期时间。格式:yyyy-MM-dd HH:mm:ss。业务规则：
前提条件：只有在买家已付款，卖家已发货的情况下才有效
如果申请了退款，那么超时会落在子订单上；比如说3笔ABC，A申请了，那么返回的是BC的列表, 主定单不存在
如果没有申请过退款，那么超时会挂在主定单上；比如ABC，返回主定单，ABC的超时和主定单相同
	 */
	@ApiField("timeout_action_time")
	private Date timeoutActionTime;

	/**
	 * 交易标题，以店铺名作为此标题的值。注:taobao.trades.get接口返回的Trade中的title是商品名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品金额（商品价格乘以数量的总金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 交易来源。
WAP(手机);HITAO(嗨淘);TOP(TOP平台);TAOBAO(普通淘宝);JHS(聚划算)
	 */
	@ApiField("trade_from")
	private String tradeFrom;

	/**
	 * 交易备注，通过taobao.trade.add接口创建
	 */
	@ApiField("trade_memo")
	private String tradeMemo;

	/**
	 * 交易类型列表，同时查询多种交易类型可用逗号分隔。默认同时查询guarantee_trade, auto_delivery, ec, cod的4种交易类型的数据 
可选值 
fixed(一口价) 
auction(拍卖) 
guarantee_trade(一口价、拍卖) 
auto_delivery(自动发货) 
independent_simple_trade(旺店入门版交易) 
independent_shop_trade(旺店标准版交易) 
ec(直冲) 
cod(货到付款) 
fenxiao(分销) 
game_equipment(游戏装备) 
shopex_trade(ShopEX交易) 
netcn_trade(万网交易) 
external_trade(统一外部交易)
	 */
	@ApiField("type")
	private String type;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public Long getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(Long alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getAlipayUrl() {
		return this.alipayUrl;
	}
	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public String getAlipayWarnMsg() {
		return this.alipayWarnMsg;
	}
	public void setAlipayWarnMsg(String alipayWarnMsg) {
		this.alipayWarnMsg = alipayWarnMsg;
	}

	public String getAvailableConfirmFee() {
		return this.availableConfirmFee;
	}
	public void setAvailableConfirmFee(String availableConfirmFee) {
		this.availableConfirmFee = availableConfirmFee;
	}

	public String getBuyerAlipayNo() {
		return this.buyerAlipayNo;
	}
	public void setBuyerAlipayNo(String buyerAlipayNo) {
		this.buyerAlipayNo = buyerAlipayNo;
	}

	public String getBuyerArea() {
		return this.buyerArea;
	}
	public void setBuyerArea(String buyerArea) {
		this.buyerArea = buyerArea;
	}

	public String getBuyerCodFee() {
		return this.buyerCodFee;
	}
	public void setBuyerCodFee(String buyerCodFee) {
		this.buyerCodFee = buyerCodFee;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public Long getBuyerFlag() {
		return this.buyerFlag;
	}
	public void setBuyerFlag(Long buyerFlag) {
		this.buyerFlag = buyerFlag;
	}

	public String getBuyerMemo() {
		return this.buyerMemo;
	}
	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}
	public void setBuyerObtainPointFee(Long buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public String getCodFee() {
		return this.codFee;
	}
	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getCodStatus() {
		return this.codStatus;
	}
	public void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}
	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
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

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExpressAgencyFee() {
		return this.expressAgencyFee;
	}
	public void setExpressAgencyFee(String expressAgencyFee) {
		this.expressAgencyFee = expressAgencyFee;
	}

	public Boolean getHasPostFee() {
		return this.hasPostFee;
	}
	public void setHasPostFee(Boolean hasPostFee) {
		this.hasPostFee = hasPostFee;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getInvoiceName() {
		return this.invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
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

	public List<Order> getOrders() {
		return this.orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
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

	public Long getPointFee() {
		return this.pointFee;
	}
	public void setPointFee(Long pointFee) {
		this.pointFee = pointFee;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPromotion() {
		return this.promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public List<PromotionDetail> getPromotionDetails() {
		return this.promotionDetails;
	}
	public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public Long getRealPointFee() {
		return this.realPointFee;
	}
	public void setRealPointFee(Long realPointFee) {
		this.realPointFee = realPointFee;
	}

	public String getReceivedPayment() {
		return this.receivedPayment;
	}
	public void setReceivedPayment(String receivedPayment) {
		this.receivedPayment = receivedPayment;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverState() {
		return this.receiverState;
	}
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getSellerAlipayNo() {
		return this.sellerAlipayNo;
	}
	public void setSellerAlipayNo(String sellerAlipayNo) {
		this.sellerAlipayNo = sellerAlipayNo;
	}

	public String getSellerCodFee() {
		return this.sellerCodFee;
	}
	public void setSellerCodFee(String sellerCodFee) {
		this.sellerCodFee = sellerCodFee;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public Long getSellerFlag() {
		return this.sellerFlag;
	}
	public void setSellerFlag(Long sellerFlag) {
		this.sellerFlag = sellerFlag;
	}

	public String getSellerMemo() {
		return this.sellerMemo;
	}
	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
	}

	public String getSellerMobile() {
		return this.sellerMobile;
	}
	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
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

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
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

	public String getTradeFrom() {
		return this.tradeFrom;
	}
	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

	public String getTradeMemo() {
		return this.tradeMemo;
	}
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
