package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 分销产品
 *
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProduct extends TaobaoObject {

	private static final long serialVersionUID = 2754132772114452691L;

	/**
	 * 警戒库存
	 */
	@ApiField("alarm_number")
	private Long alarmNumber;

	/**
	 * 所在地：市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 采购价格，单位：元。
	 */
	@ApiField("cost_price")
	private String costPrice;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 产品描述路径，通过http请求获取
	 */
	@ApiField("desc_path")
	private String descPath;

	/**
	 * 折扣ID（新增参数）
	 */
	@ApiField("discount_id")
	private Long discountId;

	/**
	 * 是否有保修，可选值：false（否）、true（是）
	 */
	@ApiField("have_guarantee")
	private Boolean haveGuarantee;

	/**
	 * 是否有发票，可选值：false（否）、true（是）
	 */
	@ApiField("have_invoice")
	private Boolean haveInvoice;

	/**
	 * 下载人数
	 */
	@ApiField("items_count")
	private Long itemsCount;

	/**
	 * 更新时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 产品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 累计采购次数
	 */
	@ApiField("orders_count")
	private Long ordersCount;

	/**
	 * 商家编码
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 产品图片路径
	 */
	@ApiField("pictures")
	private String pictures;

	/**
	 * 产品ID
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * ems费用，单位：元
	 */
	@ApiField("postage_ems")
	private String postageEms;

	/**
	 * 快递费用，单位：元
	 */
	@ApiField("postage_fast")
	private String postageFast;

	/**
	 * 运费模板ID
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 平邮费用，单位：元
	 */
	@ApiField("postage_ordinary")
	private String postageOrdinary;

	/**
	 * 运费类型，可选值：seller（供应商承担运费）、buyer（分销商承担运费）
	 */
	@ApiField("postage_type")
	private String postageType;

	/**
	 * 产品线ID
	 */
	@ApiField("productcat_id")
	private Long productcatId;

	/**
	 * 所在地：省
	 */
	@ApiField("prov")
	private String prov;

	/**
	 * 产品库存
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 最高零售价，单位：分。
	 */
	@ApiField("retail_price_high")
	private String retailPriceHigh;

	/**
	 * 最低零售价，单位：分。
	 */
	@ApiField("retail_price_low")
	private String retailPriceLow;

	/**
	 * sku列表
	 */
	@ApiListField("skus")
	@ApiField("fenxiao_sku")
	private List<FenxiaoSku> skus;

	/**
	 * 市场价格，单位：元。
	 */
	@ApiField("standard_price")
	private String standardPrice;

	/**
	 * 发布状态，可选值：up（上架）、down（下架）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）、ALL（代销和经销都做）
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 铺货时间
	 */
	@ApiField("upshelf_time")
	private Date upshelfTime;

	public Long getAlarmNumber() {
		return this.alarmNumber;
	}
	public void setAlarmNumber(Long alarmNumber) {
		this.alarmNumber = alarmNumber;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDescPath() {
		return this.descPath;
	}
	public void setDescPath(String descPath) {
		this.descPath = descPath;
	}

	public Long getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Boolean getHaveGuarantee() {
		return this.haveGuarantee;
	}
	public void setHaveGuarantee(Boolean haveGuarantee) {
		this.haveGuarantee = haveGuarantee;
	}

	public Boolean getHaveInvoice() {
		return this.haveInvoice;
	}
	public void setHaveInvoice(Boolean haveInvoice) {
		this.haveInvoice = haveInvoice;
	}

	public Long getItemsCount() {
		return this.itemsCount;
	}
	public void setItemsCount(Long itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOrdersCount() {
		return this.ordersCount;
	}
	public void setOrdersCount(Long ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPictures() {
		return this.pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPostageEms() {
		return this.postageEms;
	}
	public void setPostageEms(String postageEms) {
		this.postageEms = postageEms;
	}

	public String getPostageFast() {
		return this.postageFast;
	}
	public void setPostageFast(String postageFast) {
		this.postageFast = postageFast;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPostageOrdinary() {
		return this.postageOrdinary;
	}
	public void setPostageOrdinary(String postageOrdinary) {
		this.postageOrdinary = postageOrdinary;
	}

	public String getPostageType() {
		return this.postageType;
	}
	public void setPostageType(String postageType) {
		this.postageType = postageType;
	}

	public Long getProductcatId() {
		return this.productcatId;
	}
	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}

	public String getProv() {
		return this.prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRetailPriceHigh() {
		return this.retailPriceHigh;
	}
	public void setRetailPriceHigh(String retailPriceHigh) {
		this.retailPriceHigh = retailPriceHigh;
	}

	public String getRetailPriceLow() {
		return this.retailPriceLow;
	}
	public void setRetailPriceLow(String retailPriceLow) {
		this.retailPriceLow = retailPriceLow;
	}

	public List<FenxiaoSku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<FenxiaoSku> skus) {
		this.skus = skus;
	}

	public String getStandardPrice() {
		return this.standardPrice;
	}
	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public Date getUpshelfTime() {
		return this.upshelfTime;
	}
	public void setUpshelfTime(Date upshelfTime) {
		this.upshelfTime = upshelfTime;
	}

}
