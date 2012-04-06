package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.UserTag;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.marketing.tag.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MarketingTagAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5636367681165943253L;

	/** 
	 * 是否设置成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 人群标签
	 */
	@ApiField("user_tag")
	private UserTag userTag;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setUserTag(UserTag userTag) {
		this.userTag = userTag;
	}
	public UserTag getUserTag( ) {
		return this.userTag;
	}

}
