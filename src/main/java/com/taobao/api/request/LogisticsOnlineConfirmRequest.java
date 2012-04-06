package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOnlineConfirmResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.logistics.online.confirm request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class LogisticsOnlineConfirmRequest implements TaobaoRequest<LogisticsOnlineConfirmResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 运单号.具体一个物流公司的真实运单号码。淘宝官方物流会校验，请谨慎传入；若company_code中传入的代码非淘宝官方物流合作公司，此处运单号不校验。<br>
	 */
	private String outSid;

	/** 
	* 淘宝交易ID
	 */
	private Long tid;

	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}
	public String getOutSid() {
		return this.outSid;
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
		return "taobao.logistics.online.confirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("out_sid", this.outSid);
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

	public Class<LogisticsOnlineConfirmResponse> getResponseClass() {
		return LogisticsOnlineConfirmResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(outSid,"outSid");
		RequestCheckUtils.checkNotEmpty(tid,"tid");
	}
}
