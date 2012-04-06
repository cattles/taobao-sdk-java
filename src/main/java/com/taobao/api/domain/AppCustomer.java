package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 开通增量消息服务的应用用户
 *
 * @author auto create
 * @since 1.0, null
 */
public class AppCustomer extends TaobaoObject {

	private static final long serialVersionUID = 1772416686479792411L;

	/**
	 * isv为用户开通增量消息服务的时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 开通用户的淘宝昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 应用用户开通增量消息服务的状态：有两个返回值valid_session和invalid_session。valid_session表示已开通且seesion有效；invalid_session已开通但session失效，此时，无法接收该用户的消息。
	 */
	@ApiField("status")
	private String status;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
