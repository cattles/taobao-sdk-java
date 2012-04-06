package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ProductPropImg;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.propimg.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ProductPropimgUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8846152795935276556L;

	/** 
	 * 支持返回产品属性图片中的：url,id,created,modified
	 */
	@ApiField("product_prop_img")
	private ProductPropImg productPropImg;

	public void setProductPropImg(ProductPropImg productPropImg) {
		this.productPropImg = productPropImg;
	}
	public ProductPropImg getProductPropImg( ) {
		return this.productPropImg;
	}

}
