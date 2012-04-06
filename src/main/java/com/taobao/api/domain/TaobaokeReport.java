package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 淘宝客报表
 *
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeReport extends TaobaoObject {

	private static final long serialVersionUID = 1799142252346224366L;

	/**
	 * 淘宝客报表成员列表
	 */
	@ApiListField("taobaoke_report_members")
	@ApiField("taobaoke_report_member")
	private List<TaobaokeReportMember> taobaokeReportMembers;

	/**
	 * 搜索到的结果的总条数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public List<TaobaokeReportMember> getTaobaokeReportMembers() {
		return this.taobaokeReportMembers;
	}
	public void setTaobaokeReportMembers(List<TaobaokeReportMember> taobaokeReportMembers) {
		this.taobaokeReportMembers = taobaokeReportMembers;
	}

	public Long getTotalResults() {
		return this.totalResults;
	}
	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}

}
