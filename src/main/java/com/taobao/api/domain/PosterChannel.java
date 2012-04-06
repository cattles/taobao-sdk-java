package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 画报频道结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class PosterChannel extends TaobaoObject {

	private static final long serialVersionUID = 8725577913431481511L;

	/**
	 * 频道的中文名称。
	 */
	@ApiField("cn_name")
	private String cnName;

	/**
	 * 频道的说明。
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 频道ID号。
	 */
	@ApiField("id")
	private String id;

	/**
	 * 频道名称。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 淘宝频道链接地址。
	 */
	@ApiField("url")
	private String url;

	/**
	 * 手机画报对应频道页的链接
	 */
	@ApiField("wapurl")
	private String wapurl;

	public String getCnName() {
		return this.cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getWapurl() {
		return this.wapurl;
	}
	public void setWapurl(String wapurl) {
		this.wapurl = wapurl;
	}

}
