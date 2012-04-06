package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.update.listing response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemUpdateListingResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5452545131855882851L;

	/** 
	 * 上架后返回的商品信息：返回的结果就是:num_iid和modified
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
