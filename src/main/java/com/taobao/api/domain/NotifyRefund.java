package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 退款通知消息
 *
 * @author auto create
 * @since 1.0, null
 */
public class NotifyRefund extends TaobaoObject {

	private static final long serialVersionUID = 8471818795344251648L;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 商品修改时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 子订单退款交易编号
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 退款金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款编号
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 退款操作所对应的退款增量消息状态 
可选值： 
RefundSuccess（退款成功） 
RefundClosed（退款关闭） 
RefundCreated（退款创建） 
RefundSellerAgreeAgreement（卖家同意退款协议） 
RefundSellerRefuseAgreement（卖家拒绝退款协议） 
RefundBuyerModifyAgreement（买家修改退款协议） 
RefundBuyerReturnGoods（买家退货给卖家） 
RefundCreateMessage（发表留言） 
RefundBlockMessage（屏蔽留言） 
RefundTimeoutRemind（退款超时提醒）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 父订单退款交易编号
	 */
	@ApiField("tid")
	private Long tid;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
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

}
