package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.NotifyItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class IncrementItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6473216899956662358L;

	/** 
	 * null
	 */
	@ApiListField("notify_items")
	@ApiField("notify_item")
	private List<NotifyItem> notifyItems;

	/** 
	 * 搜索到符合条件的结果总数。
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setNotifyItems(List<NotifyItem> notifyItems) {
		this.notifyItems = notifyItems;
	}
	public List<NotifyItem> getNotifyItems( ) {
		return this.notifyItems;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
