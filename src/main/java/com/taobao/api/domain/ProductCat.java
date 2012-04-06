package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 产品线
 *
 * @author auto create
 * @since 1.0, null
 */
public class ProductCat extends TaobaoObject {

	private static final long serialVersionUID = 7838911279337852961L;

	/**
	 * 产品线ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 产品线名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品数量
	 */
	@ApiField("product_num")
	private Long productNum;

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

	public Long getProductNum() {
		return this.productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}

}
