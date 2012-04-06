package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分销产品
 *
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoSku extends TaobaoObject {

	private static final long serialVersionUID = 6623381431888268769L;

	/**
	 * 采购价格，单位：元
	 */
	@ApiField("cost_price")
	private String costPrice;

	/**
	 * SkuID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商家编码
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * sku的销售属性组合字符串。格式:pid:vid;pid:vid,如:1627207:3232483;1630696:3284570,表示:机身颜色:军绿色;手机套餐:一电一充。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 库存
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 市场价
	 */
	@ApiField("standard_price")
	private String standardPrice;

	public String getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getStandardPrice() {
		return this.standardPrice;
	}
	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

}
