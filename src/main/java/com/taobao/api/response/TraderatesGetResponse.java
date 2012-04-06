package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TradeRate;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderates.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TraderatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8231821756825564937L;

	/** 
	 * 搜索到的评价总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * 评价列表。返回的TradeRate包含的具体信息为入参fields请求的字段信息
	 */
	@ApiListField("trade_rates")
	@ApiField("trade_rate")
	private List<TradeRate> tradeRates;

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setTradeRates(List<TradeRate> tradeRates) {
		this.tradeRates = tradeRates;
	}
	public List<TradeRate> getTradeRates( ) {
		return this.tradeRates;
	}

}
