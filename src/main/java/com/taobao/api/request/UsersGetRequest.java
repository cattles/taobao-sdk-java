package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UsersGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.users.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class UsersGetRequest implements TaobaoRequest<UsersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询字段：User数据结构的公开信息字段列表，以半角逗号(,)分隔
	 */
	private String fields;

	/** 
	* 用户昵称，多个以半角逗号(,)分隔，最多40个
	 */
	private String nicks;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}
	public String getNicks() {
		return this.nicks;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.users.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nicks", this.nicks);
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

	public Class<UsersGetResponse> getResponseClass() {
		return UsersGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkNotEmpty(nicks,"nicks");
	}
}
