package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘花类目对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaCategory extends TaobaoObject {

	private static final long serialVersionUID = 2177413319532665276L;

	/**
	 * 类目ID
	 */
	@ApiField("cate_id")
	private Long cateId;

	/**
	 * 类目层级
	 */
	@ApiField("cate_level")
	private Long cateLevel;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父类目ID
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * 排序值
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	public Long getCateId() {
		return this.cateId;
	}
	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}

	public Long getCateLevel() {
		return this.cateLevel;
	}
	public void setCateLevel(Long cateLevel) {
		this.cateLevel = cateLevel;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

}
