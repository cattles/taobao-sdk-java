package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeReceivetimeDelayResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.trade.receivetime.delay request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TradeReceivetimeDelayRequest implements TaobaoRequest<TradeReceivetimeDelayResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 延长收货的天数，可选值为：3, 5, 7, 10。
	 */
	private Long days;

	/** 
	* 主订单号
	 */
	private Long tid;

	public void setDays(Long days) {
		this.days = days;
	}
	public Long getDays() {
		return this.days;
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
		return "taobao.trade.receivetime.delay";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("days", this.days);
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

	public Class<TradeReceivetimeDelayResponse> getResponseClass() {
		return TradeReceivetimeDelayResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(days,"days");
		RequestCheckUtils.checkMaxValue(days,10L,"days");
		RequestCheckUtils.checkMinValue(days,3L,"days");
		RequestCheckUtils.checkNotEmpty(tid,"tid");
	}
}
