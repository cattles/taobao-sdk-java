package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.itempayurl.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItempayurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4888863214524321699L;

	/** 
	 * 支付URL
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
