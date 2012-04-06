package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 画报频道数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class HuabaoChannel extends TaobaoObject {

	private static final long serialVersionUID = 7443591993373518958L;

	/**
	 * 频道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 淘宝频道连接
	 */
	@ApiField("channel_url")
	private String channelUrl;

	/**
	 * 频道描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 画报频道ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 频道英文名称
	 */
	@ApiField("name_en")
	private String nameEn;

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelUrl() {
		return this.channelUrl;
	}
	public void setChannelUrl(String channelUrl) {
		this.channelUrl = channelUrl;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNameEn() {
		return this.nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

}
