package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 运费模板结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Postage extends TaobaoObject {

	private static final long serialVersionUID = 5844421568218167846L;

	/**
	 * 创建日期
	 */
	@ApiField("created")
	private Date created;

	/**
	 * EMS加件费用
	 */
	@ApiField("ems_increase")
	private String emsIncrease;

	/**
	 * EMS收费
	 */
	@ApiField("ems_price")
	private String emsPrice;

	/**
	 * 快递加件费用
	 */
	@ApiField("express_increase")
	private String expressIncrease;

	/**
	 * 快递收费
	 */
	@ApiField("express_price")
	private String expressPrice;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 最后修改日期
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 运费模板名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 平邮加件收费
	 */
	@ApiField("post_increase")
	private String postIncrease;

	/**
	 * 平邮收费
	 */
	@ApiField("post_price")
	private String postPrice;

	/**
	 * 运费模板ID
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 运费方式模板收费方式。如果需要获取邮费子模板的相关数据，请设置为postage_mode.id,postage_mode.type,postage_mode.dests,postage_mode.price等形式
	 */
	@ApiListField("postage_modes")
	@ApiField("postage_mode")
	private List<PostageMode> postageModes;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEmsIncrease() {
		return this.emsIncrease;
	}
	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}

	public String getEmsPrice() {
		return this.emsPrice;
	}
	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}

	public String getExpressIncrease() {
		return this.expressIncrease;
	}
	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}

	public String getExpressPrice() {
		return this.expressPrice;
	}
	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPostIncrease() {
		return this.postIncrease;
	}
	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}

	public String getPostPrice() {
		return this.postPrice;
	}
	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public List<PostageMode> getPostageModes() {
		return this.postageModes;
	}
	public void setPostageModes(List<PostageMode> postageModes) {
		this.postageModes = postageModes;
	}

}
