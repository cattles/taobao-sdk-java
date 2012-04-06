package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Task;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.topats.delivery.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TopatsDeliverySendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7887499228983918533L;

	/** 
	 * 创建任务信息。里面只包含task_id和created
	 */
	@ApiField("task")
	private Task task;

	public void setTask(Task task) {
		this.task = task;
	}
	public Task getTask( ) {
		return this.task;
	}

}
