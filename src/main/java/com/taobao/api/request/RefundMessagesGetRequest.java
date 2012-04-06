package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundMessagesGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.refund.messages.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class RefundMessagesGetRequest implements TaobaoRequest<RefundMessagesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 需返回的字段列表。可选值：RefundMessage结构体中的所有字段，以半角逗号(,)分隔。
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
	* 退款单号
	 */
	private Long refundId;

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

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}
	public Long getRefundId() {
		return this.refundId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.refund.messages.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("refund_id", this.refundId);
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

	public Class<RefundMessagesGetResponse> getResponseClass() {
		return RefundMessagesGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkNotEmpty(refundId,"refundId");
	}
}
