package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Sku;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.sku.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemSkuAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4666225541759999627L;

	/** 
	 * sku
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
