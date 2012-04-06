package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 图片链接
 *
 * @author auto create
 * @since 1.0, null
 */
public class PicUrl extends TaobaoObject {

	private static final long serialVersionUID = 4426214428328291885L;

	/**
	 * 图片链接地址
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
