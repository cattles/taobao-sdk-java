package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.NotifyRefund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.refunds.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class IncrementRefundsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2172932599131694158L;

	/** 
	 * 获取的退款通知消息体 ，具体字段见NotifyRefund数据结构
	 */
	@ApiListField("notify_refunds")
	@ApiField("notify_refund")
	private List<NotifyRefund> notifyRefunds;

	/** 
	 * 搜索到符合条件的结果总数。
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setNotifyRefunds(List<NotifyRefund> notifyRefunds) {
		this.notifyRefunds = notifyRefunds;
	}
	public List<NotifyRefund> getNotifyRefunds( ) {
		return this.notifyRefunds;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
