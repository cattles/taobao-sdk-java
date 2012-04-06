package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Sku;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.sku.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemSkuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3597845614394886427L;

	/** 
	 * 商品Sku
	 */
	@ApiField("sku")
	private Sku sku;

	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Sku getSku( ) {
		return this.sku;
	}

}
