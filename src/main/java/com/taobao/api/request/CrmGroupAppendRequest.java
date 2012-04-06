package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupAppendResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.group.append request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class CrmGroupAppendRequest implements TaobaoRequest<CrmGroupAppendResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 添加的来源分组
	 */
	private Long fromGroupId;

	/** 
	* 添加的目标分组
	 */
	private Long toGroupId;

	public void setFromGroupId(Long fromGroupId) {
		this.fromGroupId = fromGroupId;
	}
	public Long getFromGroupId() {
		return this.fromGroupId;
	}

	public void setToGroupId(Long toGroupId) {
		this.toGroupId = toGroupId;
	}
	public Long getToGroupId() {
		return this.toGroupId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.group.append";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("from_group_id", this.fromGroupId);
		txtParams.put("to_group_id", this.toGroupId);
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

	public Class<CrmGroupAppendResponse> getResponseClass() {
		return CrmGroupAppendResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fromGroupId,"fromGroupId");
		RequestCheckUtils.checkMinValue(fromGroupId,1L,"fromGroupId");
		RequestCheckUtils.checkNotEmpty(toGroupId,"toGroupId");
		RequestCheckUtils.checkMinValue(toGroupId,1L,"toGroupId");
	}
}
