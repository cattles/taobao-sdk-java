package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaCategory;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.childcates.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaChildcatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7491983667172849725L;

	/** 
	 * 淘花类目数据结构
	 */
	@ApiListField("taohua_categories")
	@ApiField("taohua_category")
	private List<TaohuaCategory> taohuaCategories;

	/** 
	 * 总类目数
	 */
	@ApiField("total_cates")
	private Long totalCates;

	public void setTaohuaCategories(List<TaohuaCategory> taohuaCategories) {
		this.taohuaCategories = taohuaCategories;
	}
	public List<TaohuaCategory> getTaohuaCategories( ) {
		return this.taohuaCategories;
	}

	public void setTotalCates(Long totalCates) {
		this.totalCates = totalCates;
	}
	public Long getTotalCates( ) {
		return this.totalCates;
	}

}
