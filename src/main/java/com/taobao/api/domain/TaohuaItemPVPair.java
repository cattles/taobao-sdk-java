package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 商品属性值配对数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemPVPair extends TaobaoObject {

	private static final long serialVersionUID = 1833361519699864978L;

	/**
	 * 淘花类目属性数据结构
	 */
	@ApiField("taohua_cate_prop")
	private TaohuaCateProp taohuaCateProp;

	/**
	 * 淘花类目属性值数据结构
	 */
	@ApiListField("taohua_cate_prop_values")
	@ApiField("taohua_cate_prop_value")
	private List<TaohuaCatePropValue> taohuaCatePropValues;

	public TaohuaCateProp getTaohuaCateProp() {
		return this.taohuaCateProp;
	}
	public void setTaohuaCateProp(TaohuaCateProp taohuaCateProp) {
		this.taohuaCateProp = taohuaCateProp;
	}

	public List<TaohuaCatePropValue> getTaohuaCatePropValues() {
		return this.taohuaCatePropValues;
	}
	public void setTaohuaCatePropValues(List<TaohuaCatePropValue> taohuaCatePropValues) {
		this.taohuaCatePropValues = taohuaCatePropValues;
	}

}
