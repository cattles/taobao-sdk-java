package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FavoriteSearchResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.favorite.search request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class FavoriteSearchRequest implements TaobaoRequest<FavoriteSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ITEM表示宝贝，SHOP表示商铺，collect_type只能为这两者之一
	 */
	private String collectType;

	/** 
	* 页码。取值范围:大于零的整数; 默认值:1。一页20条记录。
	 */
	private Long pageNo;

	/** 
	* 用户昵称
	 */
	private String userNick;

	public void setCollectType(String collectType) {
		this.collectType = collectType;
	}
	public String getCollectType() {
		return this.collectType;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserNick() {
		return this.userNick;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.favorite.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("collect_type", this.collectType);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("user_nick", this.userNick);
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

	public Class<FavoriteSearchResponse> getResponseClass() {
		return FavoriteSearchResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(collectType,"collectType");
		RequestCheckUtils.checkMaxLength(collectType,4,"collectType");
		RequestCheckUtils.checkNotEmpty(pageNo,"pageNo");
		RequestCheckUtils.checkMaxValue(pageNo,100L,"pageNo");
		RequestCheckUtils.checkMinValue(pageNo,1L,"pageNo");
		RequestCheckUtils.checkNotEmpty(userNick,"userNick");
		RequestCheckUtils.checkMaxLength(userNick,32,"userNick");
	}
}
