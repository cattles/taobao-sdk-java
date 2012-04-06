package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaobaokeItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.items.convert response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeItemsConvertResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8588876415583151179L;

	/** 
	 * 淘宝客商品对象列表
	 */
	@ApiListField("taobaoke_items")
	@ApiField("taobaoke_item")
	private List<TaobaokeItem> taobaokeItems;

	/** 
	 * 返回的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTaobaokeItems(List<TaobaokeItem> taobaokeItems) {
		this.taobaokeItems = taobaokeItems;
	}
	public List<TaobaokeItem> getTaobaokeItems( ) {
		return this.taobaokeItems;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
