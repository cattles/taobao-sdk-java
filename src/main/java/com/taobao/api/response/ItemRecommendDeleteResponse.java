package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.recommend.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemRecommendDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8898426685332459546L;

	/** 
	 * 被取消橱窗推荐的商品信息
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
