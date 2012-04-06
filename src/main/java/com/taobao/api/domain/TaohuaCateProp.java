package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘花类目属性结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaCateProp extends TaobaoObject {

	private static final long serialVersionUID = 2192787993639231571L;

	/**
	 * 属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 属性结构
	 */
	@ApiField("prop_id")
	private Long propId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPropId() {
		return this.propId;
	}
	public void setPropId(Long propId) {
		this.propId = propId;
	}

}
