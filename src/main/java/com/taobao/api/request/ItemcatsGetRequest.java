package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemcatsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.itemcats.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class ItemcatsGetRequest implements TaobaoRequest<ItemcatsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 商品所属类目ID列表，用半角逗号(,)分隔 例如:(18957,19562,) (cids、parent_cid至少传一个)
	 */
	private String cids;

	/** 
	* 需要返回的字段列表，见ItemCat，默认返回：cid,parent_cid,name,is_parent
	 */
	private String fields;

	/** 
	* 父商品类目 id，0表示根节点, 传输该参数返回所有子类目。 (cids、parent_cid至少传一个)
	 */
	private Long parentCid;

	public void setCids(String cids) {
		this.cids = cids;
	}
	public String getCids() {
		return this.cids;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}
	public Long getParentCid() {
		return this.parentCid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.itemcats.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cids", this.cids);
		txtParams.put("fields", this.fields);
		txtParams.put("parent_cid", this.parentCid);
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

	public Class<ItemcatsGetResponse> getResponseClass() {
		return ItemcatsGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxListSize(cids,1000,"cids");
	}
}
