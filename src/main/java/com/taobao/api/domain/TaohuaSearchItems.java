package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 淘花商品列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaSearchItems extends TaobaoObject {

	private static final long serialVersionUID = 5783641726315228937L;

	/**
	 * 淘花类目路径数据结构
	 */
	@ApiListField("cate_paths")
	@ApiField("taohua_category")
	private List<TaohuaCategory> catePaths;

	/**
	 * 搜索引擎根据搜索条件中的上一级类目统计出的子类目列表
	 */
	@ApiListField("cate_stats")
	@ApiField("taohua_cate_stat")
	private List<TaohuaCateStat> cateStats;

	/**
	 * 淘花搜索商品对象列表数据结构
	 */
	@ApiListField("taohua_search_items")
	@ApiField("taohua_search_item")
	private List<TaohuaSearchItem> taohuaSearchItems;

	/**
	 * 搜索出来的商品总数
	 */
	@ApiField("total_item")
	private Long totalItem;

	public List<TaohuaCategory> getCatePaths() {
		return this.catePaths;
	}
	public void setCatePaths(List<TaohuaCategory> catePaths) {
		this.catePaths = catePaths;
	}

	public List<TaohuaCateStat> getCateStats() {
		return this.cateStats;
	}
	public void setCateStats(List<TaohuaCateStat> cateStats) {
		this.cateStats = cateStats;
	}

	public List<TaohuaSearchItem> getTaohuaSearchItems() {
		return this.taohuaSearchItems;
	}
	public void setTaohuaSearchItems(List<TaohuaSearchItem> taohuaSearchItems) {
		this.taohuaSearchItems = taohuaSearchItems;
	}

	public Long getTotalItem() {
		return this.totalItem;
	}
	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}

}
