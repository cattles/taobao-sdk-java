package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 查询揽送范围之内的物流公司信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsPartner extends TaobaoObject {

	private static final long serialVersionUID = 5539173191576334627L;

	/**
	 * 揽收说明信息
	 */
	@ApiField("cover_remark")
	private String coverRemark;

	/**
	 * 物流公司详细信息
	 */
	@ApiField("partner")
	private PartnerDetail partner;

	/**
	 * 不可送达的说明信息
	 */
	@ApiField("uncover_remark")
	private String uncoverRemark;

	public String getCoverRemark() {
		return this.coverRemark;
	}
	public void setCoverRemark(String coverRemark) {
		this.coverRemark = coverRemark;
	}

	public PartnerDetail getPartner() {
		return this.partner;
	}
	public void setPartner(PartnerDetail partner) {
		this.partner = partner;
	}

	public String getUncoverRemark() {
		return this.uncoverRemark;
	}
	public void setUncoverRemark(String uncoverRemark) {
		this.uncoverRemark = uncoverRemark;
	}

}
