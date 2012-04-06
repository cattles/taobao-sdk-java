package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaOrdersGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taohua.orders.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaohuaOrdersGetRequest implements TaobaoRequest<TaohuaOrdersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 默认为当前时间， 日期格式精确到天数
	 */
	private String endDate;

	/** 
	* 分页获取订单列表信息，page_no代表的是第几页
	 */
	private Long pageNo;

	/** 
	* 分页获取订单列表信息，page_size代表每页显示多少条。  注意：每页显示条数。最小5条，最多30条，凡是超出范围的条数，都会被默认为10条。
	 */
	private Long pageSize;

	/** 
	* 系统默认为：当前时间-90天。  日期精确到日
	 */
	private String startDate;

	/** 
	* 查询的交易状态：
1.	全部 all
2.	等待买家付款 wait_pay
3.	交易成功 trade_suc
4.	交易关闭 trade_close
	 */
	private String tradeStatus;

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate() {
		return this.endDate;
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

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate() {
		return this.startDate;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.orders.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		txtParams.put("trade_status", this.tradeStatus);
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

	public Class<TaohuaOrdersGetResponse> getResponseClass() {
		return TaohuaOrdersGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxValue(pageSize,30L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,5L,"pageSize");
	}
}
