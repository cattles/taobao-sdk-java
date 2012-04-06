package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WaitingTimesOnDay;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.avgwaittime.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceAvgwaittimeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1674432298262947178L;

	/** 
	 * 平均等待时长
	 */
	@ApiListField("waiting_time_list_on_days")
	@ApiField("waiting_times_on_day")
	private List<WaitingTimesOnDay> waitingTimeListOnDays;

	public void setWaitingTimeListOnDays(List<WaitingTimesOnDay> waitingTimeListOnDays) {
		this.waitingTimeListOnDays = waitingTimeListOnDays;
	}
	public List<WaitingTimesOnDay> getWaitingTimeListOnDays( ) {
		return this.waitingTimeListOnDays;
	}

}
