package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Activity;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.activity.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionActivityAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1566299432335611597L;

	/** 
	 * 活动信息，包括活动id和链接,目前只返回activity_id,activity_url
	 */
	@ApiField("activity")
	private Activity activity;

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public Activity getActivity( ) {
		return this.activity;
	}

}
