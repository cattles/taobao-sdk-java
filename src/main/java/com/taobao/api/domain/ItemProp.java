package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemProp extends TaobaoObject {

	private static final long serialVersionUID = 4378381662194493931L;

	/**
	 * 子属性的模板（卖家自行输入属性时需要用到）
	 */
	@ApiField("child_template")
	private String childTemplate;

	/**
	 * 是否允许别名。可选值：true（是），false（否）
	 */
	@ApiField("is_allow_alias")
	private Boolean isAllowAlias;

	/**
	 * 是否颜色属性。可选值:true(是),false(否)
	 */
	@ApiField("is_color_prop")
	private Boolean isColorProp;

	/**
	 * 是否枚举属性。可选值:true(是),false(否)。如果返回true，属性值是下拉框选择输入，如果返回false，属性值是用户自行手工输入。
	 */
	@ApiField("is_enum_prop")
	private Boolean isEnumProp;

	/**
	 * 在is_enum_prop是true的前提下，是否是卖家可以自行输入的属性（注：如果is_enum_prop返回false，该参数统一返回false）。可选值:true(是),false(否)。<b>对于品牌和型号属性（包括子属性）：如果用户是C卖家，则可自定义属性；如果是B卖家，则不可自定义属性，而必须要授权的属性。</b>
	 */
	@ApiField("is_input_prop")
	private Boolean isInputProp;

	/**
	 * 是否商品属性。可选值:true(是),false(否)
	 */
	@ApiField("is_item_prop")
	private Boolean isItemProp;

	/**
	 * 是否关键属性。可选值:true(是),false(否)
	 */
	@ApiField("is_key_prop")
	private Boolean isKeyProp;

	/**
	 * 是否销售属性。可选值:true(是),false(否)
	 */
	@ApiField("is_sale_prop")
	private Boolean isSaleProp;

	/**
	 * 发布产品或商品时是否可以多选。可选值:true(是),false(否)
	 */
	@ApiField("multi")
	private Boolean multi;

	/**
	 * 发布产品或商品时是否为必选属性。可选值:true(是),false(否)
	 */
	@ApiField("must")
	private Boolean must;

	/**
	 * 属性名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 上级属性ID
	 */
	@ApiField("parent_pid")
	private Long parentPid;

	/**
	 * 上级属性值ID
	 */
	@ApiField("parent_vid")
	private Long parentVid;

	/**
	 * 属性 ID 例：品牌的PID=20000
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * null
	 */
	@ApiListField("prop_values")
	@ApiField("prop_value")
	private List<PropValue> propValues;

	/**
	 * 排列序号。取值范围:大于零的整排列序号。取值范围:大于零的整数
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * 状态。可选值:normal(正常),deleted(删除)
	 */
	@ApiField("status")
	private String status;

	public String getChildTemplate() {
		return this.childTemplate;
	}
	public void setChildTemplate(String childTemplate) {
		this.childTemplate = childTemplate;
	}

	public Boolean getIsAllowAlias() {
		return this.isAllowAlias;
	}
	public void setIsAllowAlias(Boolean isAllowAlias) {
		this.isAllowAlias = isAllowAlias;
	}

	public Boolean getIsColorProp() {
		return this.isColorProp;
	}
	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}

	public Boolean getIsEnumProp() {
		return this.isEnumProp;
	}
	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}

	public Boolean getIsInputProp() {
		return this.isInputProp;
	}
	public void setIsInputProp(Boolean isInputProp) {
		this.isInputProp = isInputProp;
	}

	public Boolean getIsItemProp() {
		return this.isItemProp;
	}
	public void setIsItemProp(Boolean isItemProp) {
		this.isItemProp = isItemProp;
	}

	public Boolean getIsKeyProp() {
		return this.isKeyProp;
	}
	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}

	public Boolean getIsSaleProp() {
		return this.isSaleProp;
	}
	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}

	public Boolean getMulti() {
		return this.multi;
	}
	public void setMulti(Boolean multi) {
		this.multi = multi;
	}

	public Boolean getMust() {
		return this.must;
	}
	public void setMust(Boolean must) {
		this.must = must;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentPid() {
		return this.parentPid;
	}
	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}

	public Long getParentVid() {
		return this.parentVid;
	}
	public void setParentVid(Long parentVid) {
		this.parentVid = parentVid;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public List<PropValue> getPropValues() {
		return this.propValues;
	}
	public void setPropValues(List<PropValue> propValues) {
		this.propValues = propValues;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
