package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘花终端软件版本更新信息接口
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaUpdateInfo extends TaobaoObject {

	private static final long serialVersionUID = 1183527864183278478L;

	/**
	 * 提示消息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 最新下载地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 版本号
	 */
	@ApiField("version")
	private String version;

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
