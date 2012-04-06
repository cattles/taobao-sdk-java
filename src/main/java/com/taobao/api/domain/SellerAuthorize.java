package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 授权
 *
 * @author auto create
 * @since 1.0, null
 */
public class SellerAuthorize extends TaobaoObject {

	private static final long serialVersionUID = 5426227731529232389L;

	/**
	 * 品牌列表
	 */
	@ApiListField("brands")
	@ApiField("brand")
	private List<Brand> brands;

	/**
	 * 类目列表
	 */
	@ApiListField("item_cats")
	@ApiField("item_cat")
	private List<ItemCat> itemCats;

	public List<Brand> getBrands() {
		return this.brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public List<ItemCat> getItemCats() {
		return this.itemCats;
	}
	public void setItemCats(List<ItemCat> itemCats) {
		this.itemCats = itemCats;
	}

}
