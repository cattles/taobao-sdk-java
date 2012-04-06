package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.NotifyTrade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.trades.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class IncrementTradesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6685797136844994896L;

	/** 
	 * 获取的交易通知消息体 ，具体字段见NotifyTrade数据结构
	 */
	@ApiListField("notify_trades")
	@ApiField("notify_trade")
	private List<NotifyTrade> notifyTrades;

	/** 
	 * 搜索到符合条件的结果总数。
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setNotifyTrades(List<NotifyTrade> notifyTrades) {
		this.notifyTrades = notifyTrades;
	}
	public List<NotifyTrade> getNotifyTrades( ) {
		return this.notifyTrades;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
