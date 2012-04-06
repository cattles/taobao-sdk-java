package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Hotel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotels.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6123796348716775363L;

	/** 
	 * 多个酒店结构
	 */
	@ApiListField("hotels")
	@ApiField("hotel")
	private List<Hotel> hotels;

	/** 
	 * 符合条件的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	public List<Hotel> getHotels( ) {
		return this.hotels;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
