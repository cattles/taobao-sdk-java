package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaobaokeItemDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.items.detail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeItemsDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3824982751795735545L;

	/** 
	 * 淘宝客商品对象列表
	 */
	@ApiListField("taobaoke_item_details")
	@ApiField("taobaoke_item_detail")
	private List<TaobaokeItemDetail> taobaokeItemDetails;

	/** 
	 * 搜索到符合条件的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setTaobaokeItemDetails(List<TaobaokeItemDetail> taobaokeItemDetails) {
		this.taobaokeItemDetails = taobaokeItemDetails;
	}
	public List<TaobaokeItemDetail> getTaobaokeItemDetails( ) {
		return this.taobaokeItemDetails;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
