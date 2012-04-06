package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersIncrementGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.members.increment.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class CrmMembersIncrementGetRequest implements TaobaoRequest<CrmMembersIncrementGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 显示第几页的会员，如果输入的页码大于总共的页码数，例如总共10页，但是current_page的值为11，则返回空白页，最小页数为1
	 */
	private Long currentPage;

	/** 
	* 最迟修改日期，如果不填写此字段，默认为当前时间
	 */
	private Date endModify;

	/** 
	* 会员等级，1：普通客户，2：高级会员，3：高级会员 ，4：至尊vip
	 */
	private Long grade;

	/** 
	* 每页显示的会员数，page_size的值不能超过100，最小值要大于1
	 */
	private Long pageSize;

	/** 
	* 最早修改日期
	 */
	private Date startModify;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setEndModify(Date endModify) {
		this.endModify = endModify;
	}
	public Date getEndModify() {
		return this.endModify;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartModify(Date startModify) {
		this.startModify = startModify;
	}
	public Date getStartModify() {
		return this.startModify;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.members.increment.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("current_page", this.currentPage);
		txtParams.put("end_modify", this.endModify);
		txtParams.put("grade", this.grade);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_modify", this.startModify);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<CrmMembersIncrementGetResponse> getResponseClass() {
		return CrmMembersIncrementGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(currentPage,"currentPage");
		RequestCheckUtils.checkMinValue(currentPage,1L,"currentPage");
		RequestCheckUtils.checkMaxValue(grade,4L,"grade");
		RequestCheckUtils.checkMinValue(grade,1L,"grade");
		RequestCheckUtils.checkMaxValue(pageSize,100L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,1L,"pageSize");
	}
}
