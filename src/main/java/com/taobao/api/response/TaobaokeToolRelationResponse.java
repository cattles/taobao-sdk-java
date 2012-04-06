package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.tool.relation response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeToolRelationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1818719745856895313L;

	/** 
	 * 返回true或false表示是否关联用户
	 */
	@ApiField("tools_user")
	private Boolean toolsUser;

	public void setToolsUser(Boolean toolsUser) {
		this.toolsUser = toolsUser;
	}
	public Boolean getToolsUser( ) {
		return this.toolsUser;
	}

}
