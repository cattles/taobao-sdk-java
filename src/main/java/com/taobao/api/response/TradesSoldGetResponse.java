package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trades.sold.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradesSoldGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7811793677867511784L;

	/** 
	 * 搜索到的交易信息总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * 搜索到的交易信息列表，返回的Trade和Order中包含的具体信息为入参fields请求的字段信息
	 */
	@ApiListField("trades")
	@ApiField("trade")
	private List<Trade> trades;

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}
	public List<Trade> getTrades( ) {
		return this.trades;
	}

}
