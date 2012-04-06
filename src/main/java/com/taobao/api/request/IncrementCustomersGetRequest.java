package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.IncrementCustomersGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.increment.customers.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class IncrementCustomersGetRequest implements TaobaoRequest<IncrementCustomersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询用户的昵称。当为空时通过分页方式查询appkey开通的所有用户,最多填入20个昵称。
	 */
	private String nicks;

	/** 
	* 分页查询时，查询的页码。此参数只有nicks为空时起作用。
	 */
	private Long pageNo;

	/** 
	* 分布查询时，页的大小。此参数只有当nicks为空时起作用。
	 */
	private Long pageSize;

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}
	public String getNicks() {
		return this.nicks;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.increment.customers.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nicks", this.nicks);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
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

	public Class<IncrementCustomersGetResponse> getResponseClass() {
		return IncrementCustomersGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxListSize(nicks,20,"nicks");
		RequestCheckUtils.checkMinValue(pageNo,0L,"pageNo");
		RequestCheckUtils.checkMaxValue(pageSize,200L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,0L,"pageSize");
	}
}
