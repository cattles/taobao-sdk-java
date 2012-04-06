package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4797746377855138873L;

	/** 
	 * 被删除商品的相关信息
	 */
	@ApiField("item")
	private Item item;

	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem( ) {
		return this.item;
	}

}
