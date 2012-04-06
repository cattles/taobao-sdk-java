package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaSearchItems;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.items.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3544374995272464338L;

	/** 
	 * 商品搜索列表数据结构
	 */
	@ApiField("search_items_result")
	private TaohuaSearchItems searchItemsResult;

	public void setSearchItemsResult(TaohuaSearchItems searchItemsResult) {
		this.searchItemsResult = searchItemsResult;
	}
	public TaohuaSearchItems getSearchItemsResult( ) {
		return this.searchItemsResult;
	}

}
