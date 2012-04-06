package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.itemresurl.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemresurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8738632645961214962L;

	/** 
	 * 下载链接地址.
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
