package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SellerCat;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercats.list.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SellercatsListUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6496443936663263991L;

	/** 
	 * 返回sellercat数据结构中的：cid,modified
	 */
	@ApiField("seller_cat")
	private SellerCat sellerCat;

	public void setSellerCat(SellerCat sellerCat) {
		this.sellerCat = sellerCat;
	}
	public SellerCat getSellerCat( ) {
		return this.sellerCat;
	}

}
