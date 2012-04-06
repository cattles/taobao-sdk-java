package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasSubscribeGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.vas.subscribe.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class VasSubscribeGetRequest implements TaobaoRequest<VasSubscribeGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码
	 */
	private String articleCode;

	/** 
	* 淘宝会员名
	 */
	private String nick;

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getArticleCode() {
		return this.articleCode;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.vas.subscribe.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("article_code", this.articleCode);
		txtParams.put("nick", this.nick);
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

	public Class<VasSubscribeGetResponse> getResponseClass() {
		return VasSubscribeGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(articleCode,"articleCode");
		RequestCheckUtils.checkNotEmpty(nick,"nick");
	}
}
