package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.fenxiao.product.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class FenxiaoProductAddRequest implements TaobaoRequest<FenxiaoProductAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 警戒库存必须是0到29999。
	 */
	private Long alarmNumber;

	/** 
	* 所属类目id，参考Taobao.itemcats.get，不支持成人等类目，输入成人类目id保存提示类目属性错误。
	 */
	private Long categoryId;

	/** 
	* 所在地：市，例：“杭州”
	 */
	private String city;

	/** 
	* 采购价格，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String costPrice;

	/** 
	* 产品描述，长度为5到25000字符。
	 */
	private String desc;

	/** 
	* 折扣ID
	 */
	private Long discountId;

	/** 
	* 是否有保修，可选值：false（否）、true（是），默认false。
	 */
	private String haveGuarantee;

	/** 
	* 是否有发票，可选值：false（否）、true（是），默认false。
	 */
	private String haveInvoice;

	/** 
	* 产品名称，长度不超过60个字节。
	 */
	private String name;

	/** 
	* 商家编码，长度不能超过60个字节。
	 */
	private String outerId;

	/** 
	* ems费用，单位：元。例：“10.56”。 大小为0.00元到999999元之间。
	 */
	private String postageEms;

	/** 
	* 快递费用，单位：元。例：“10.56”。 大小为0.01元到999999元之间。
	 */
	private String postageFast;

	/** 
	* 运费模板ID，参考taobao.postages.get。
	 */
	private Long postageId;

	/** 
	* 平邮费用，单位：元。例：“10.56”。 大小为0.01元到999999元之间。
	 */
	private String postageOrdinary;

	/** 
	* 运费类型，可选值：seller（供应商承担运费）、buyer（分销商承担运费）,默认seller。
	 */
	private String postageType;

	/** 
	* 产品线ID
	 */
	private Long productcatId;

	/** 
	* 所在地：省，例：“浙江”
	 */
	private String prov;

	/** 
	* 产品库存必须是1到999999。
	 */
	private Long quantity;

	/** 
	* 最高零售价，单位：元。例：“10.56”。必须在0.01元到10000000元之间，最高零售价必须大于最低零售价。
	 */
	private String retailPriceHigh;

	/** 
	* 最低零售价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String retailPriceLow;

	/** 
	* 标准价格，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String standardPrice;

	/** 
	* 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）、ALL（代销和经销都做）
	 */
	private String tradeType;

	public void setAlarmNumber(Long alarmNumber) {
		this.alarmNumber = alarmNumber;
	}
	public Long getAlarmNumber() {
		return this.alarmNumber;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	public String getCostPrice() {
		return this.costPrice;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public Long getDiscountId() {
		return this.discountId;
	}

	public void setHaveGuarantee(String haveGuarantee) {
		this.haveGuarantee = haveGuarantee;
	}
	public String getHaveGuarantee() {
		return this.haveGuarantee;
	}

	public void setHaveInvoice(String haveInvoice) {
		this.haveInvoice = haveInvoice;
	}
	public String getHaveInvoice() {
		return this.haveInvoice;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public void setPostageEms(String postageEms) {
		this.postageEms = postageEms;
	}
	public String getPostageEms() {
		return this.postageEms;
	}

	public void setPostageFast(String postageFast) {
		this.postageFast = postageFast;
	}
	public String getPostageFast() {
		return this.postageFast;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}
	public Long getPostageId() {
		return this.postageId;
	}

	public void setPostageOrdinary(String postageOrdinary) {
		this.postageOrdinary = postageOrdinary;
	}
	public String getPostageOrdinary() {
		return this.postageOrdinary;
	}

	public void setPostageType(String postageType) {
		this.postageType = postageType;
	}
	public String getPostageType() {
		return this.postageType;
	}

	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}
	public Long getProductcatId() {
		return this.productcatId;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getProv() {
		return this.prov;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity() {
		return this.quantity;
	}

	public void setRetailPriceHigh(String retailPriceHigh) {
		this.retailPriceHigh = retailPriceHigh;
	}
	public String getRetailPriceHigh() {
		return this.retailPriceHigh;
	}

	public void setRetailPriceLow(String retailPriceLow) {
		this.retailPriceLow = retailPriceLow;
	}
	public String getRetailPriceLow() {
		return this.retailPriceLow;
	}

	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}
	public String getStandardPrice() {
		return this.standardPrice;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType() {
		return this.tradeType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alarm_number", this.alarmNumber);
		txtParams.put("category_id", this.categoryId);
		txtParams.put("city", this.city);
		txtParams.put("cost_price", this.costPrice);
		txtParams.put("desc", this.desc);
		txtParams.put("discount_id", this.discountId);
		txtParams.put("have_guarantee", this.haveGuarantee);
		txtParams.put("have_invoice", this.haveInvoice);
		txtParams.put("name", this.name);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("postage_ems", this.postageEms);
		txtParams.put("postage_fast", this.postageFast);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("postage_ordinary", this.postageOrdinary);
		txtParams.put("postage_type", this.postageType);
		txtParams.put("productcat_id", this.productcatId);
		txtParams.put("prov", this.prov);
		txtParams.put("quantity", this.quantity);
		txtParams.put("retail_price_high", this.retailPriceHigh);
		txtParams.put("retail_price_low", this.retailPriceLow);
		txtParams.put("standard_price", this.standardPrice);
		txtParams.put("trade_type", this.tradeType);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<FenxiaoProductAddResponse> getResponseClass() {
		return FenxiaoProductAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(alarmNumber,"alarmNumber");
		RequestCheckUtils.checkNotEmpty(categoryId,"categoryId");
		RequestCheckUtils.checkNotEmpty(city,"city");
		RequestCheckUtils.checkNotEmpty(costPrice,"costPrice");
		RequestCheckUtils.checkNotEmpty(desc,"desc");
		RequestCheckUtils.checkNotEmpty(haveGuarantee,"haveGuarantee");
		RequestCheckUtils.checkNotEmpty(haveInvoice,"haveInvoice");
		RequestCheckUtils.checkNotEmpty(name,"name");
		RequestCheckUtils.checkNotEmpty(postageType,"postageType");
		RequestCheckUtils.checkNotEmpty(productcatId,"productcatId");
		RequestCheckUtils.checkNotEmpty(prov,"prov");
		RequestCheckUtils.checkNotEmpty(quantity,"quantity");
		RequestCheckUtils.checkNotEmpty(retailPriceHigh,"retailPriceHigh");
		RequestCheckUtils.checkNotEmpty(retailPriceLow,"retailPriceLow");
		RequestCheckUtils.checkNotEmpty(standardPrice,"standardPrice");
	}
}
