package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.recommend.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemRecommendAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2656279512347938365L;

	/** 
	 * 被推荐的商品的信息
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
