package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FavoriteAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.favorite.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class FavoriteAddRequest implements TaobaoRequest<FavoriteAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ITEM表示宝贝，SHOP表示店铺，只能传入这两者之一
	 */
	private String collectType;

	/** 
	* 如果收藏的是商品，就传num_iid，如果是店铺，就传入sid
	 */
	private Long itemNumid;

	/** 
	* 该收藏是否公开
	 */
	private Boolean shared;

	public void setCollectType(String collectType) {
		this.collectType = collectType;
	}
	public String getCollectType() {
		return this.collectType;
	}

	public void setItemNumid(Long itemNumid) {
		this.itemNumid = itemNumid;
	}
	public Long getItemNumid() {
		return this.itemNumid;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}
	public Boolean getShared() {
		return this.shared;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.favorite.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("collect_type", this.collectType);
		txtParams.put("item_numid", this.itemNumid);
		txtParams.put("shared", this.shared);
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

	public Class<FavoriteAddResponse> getResponseClass() {
		return FavoriteAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(collectType,"collectType");
		RequestCheckUtils.checkNotEmpty(itemNumid,"itemNumid");
		RequestCheckUtils.checkMinValue(itemNumid,1L,"itemNumid");
	}
}
