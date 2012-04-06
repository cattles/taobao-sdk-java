package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaobaokeShop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.shops.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeShopsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8141575167579545983L;

	/** 
	 * 搜索结果列表
	 */
	@ApiListField("taobaoke_shops")
	@ApiField("taobaoke_shop")
	private List<TaobaokeShop> taobaokeShops;

	/** 
	 * 符合条件的店铺总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTaobaokeShops(List<TaobaokeShop> taobaokeShops) {
		this.taobaokeShops = taobaokeShops;
	}
	public List<TaobaokeShop> getTaobaokeShops( ) {
		return this.taobaokeShops;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
