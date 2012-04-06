package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemsListGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5354766928327279514L;

	/** 
	 * 获取的商品 具体字段根据权限和设定的fields决定
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}

}
