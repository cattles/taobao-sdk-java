package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Activity;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.activity.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionActivityGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4371142642464134593L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activitys")
	@ApiField("activity")
	private List<Activity> activitys;

	public void setActivitys(List<Activity> activitys) {
		this.activitys = activitys;
	}
	public List<Activity> getActivitys( ) {
		return this.activitys;
	}

}
