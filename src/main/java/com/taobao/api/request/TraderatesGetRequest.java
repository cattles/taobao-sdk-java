package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderatesGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.traderates.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TraderatesGetRequest implements TaobaoRequest<TraderatesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 评价结束时间。如果只输入结束时间，那么全部返回所有评价数据。
	 */
	private Date endDate;

	/** 
	* 需返回的字段列表。可选值：TradeRate 结构中的所有字段，多个字段之间用“,”分隔
	 */
	private String fields;

	/** 
	* 页码。取值范围:大于零的整数; 默认值:1
	 */
	private Long pageNo;

	/** 
	* 每页条数。取值范围:大于零的整数; 默认值:40;最大值:200
	 */
	private Long pageSize;

	/** 
	* 评价类型。可选值:get(得到),give(给出)
	 */
	private String rateType;

	/** 
	* 评价结果。可选值:good(好评),neutral(中评),bad(差评)
	 */
	private String result;

	/** 
	* 评价者角色。可选值:seller(卖家),buyer(买家)
	 */
	private String role;

	/** 
	* 评价开始时。如果只输入开始时间，那么能返回开始时间之后的评价数据。
	 */
	private Date startDate;

	/** 
	* 交易订单id，可以是父订单id号，也可以是子订单id号
	 */
	private Long tid;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
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

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getRateType() {
		return this.rateType;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult() {
		return this.result;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getRole() {
		return this.role;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid() {
		return this.tid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.traderates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("rate_type", this.rateType);
		txtParams.put("result", this.result);
		txtParams.put("role", this.role);
		txtParams.put("start_date", this.startDate);
		txtParams.put("tid", this.tid);
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

	public Class<TraderatesGetResponse> getResponseClass() {
		return TraderatesGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkNotEmpty(rateType,"rateType");
		RequestCheckUtils.checkNotEmpty(role,"role");
	}
}
