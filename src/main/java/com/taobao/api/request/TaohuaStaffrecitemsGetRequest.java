package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaStaffrecitemsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taohua.staffrecitems.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaohuaStaffrecitemsGetRequest implements TaobaoRequest<TaohuaStaffrecitemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 推荐的商品类型:
1. free:获取推荐的免费商品
2. charges:获取推荐的收费商品
	 */
	private String itemType;

	/** 
	* 当前页数，大于0的整数，默认值1，代表第一页
	 */
	private Long pageNo;

	/** 
	* 每页显示最大条数，要求：大于0的整数。默认为5，代表每页显示5条
	 */
	private Long pageSize;

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType() {
		return this.itemType;
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
		return "taobao.taohua.staffrecitems.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_type", this.itemType);
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

	public Class<TaohuaStaffrecitemsGetResponse> getResponseClass() {
		return TaohuaStaffrecitemsGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(itemType,"itemType");
	}
}
