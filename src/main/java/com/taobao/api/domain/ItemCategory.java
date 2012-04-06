package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品查询分类结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemCategory extends TaobaoObject {

	private static final long serialVersionUID = 7466916594576559351L;

	/**
	 * 分类ID
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 商品数量
	 */
	@ApiField("count")
	private Long count;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}
