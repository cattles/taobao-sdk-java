package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaobaokeShop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.shops.convert response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeShopsConvertResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5841183177843851762L;

	/** 
	 * 淘宝客店铺对象列表,不能返回shop_type,seller_credit,auction_coun,
total_auction
	 */
	@ApiListField("taobaoke_shops")
	@ApiField("taobaoke_shop")
	private List<TaobaokeShop> taobaokeShops;

	public void setTaobaokeShops(List<TaobaokeShop> taobaokeShops) {
		this.taobaokeShops = taobaokeShops;
	}
	public List<TaobaokeShop> getTaobaokeShops( ) {
		return this.taobaokeShops;
	}

}
