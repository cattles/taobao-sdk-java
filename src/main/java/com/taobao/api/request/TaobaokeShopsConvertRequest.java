package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeShopsConvertResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taobaoke.shops.convert request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaobaokeShopsConvertRequest implements TaobaoRequest<TaobaokeShopsConvertResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 需返回的字段列表.可选值:TaobaokeShop淘宝客商品结构体中的user_id,shop_title,click_url,commission_rate;字段之间用","分隔.
	 */
	private String fields;

	/** 
	* 推广者的淘宝会员昵称.注：这里指的是淘宝的登录会员名
	 */
	private String nick;

	/** 
	* 自定义输入串.格式:英文和数字组成;长度不能大于12个字符,区分不同的推广渠道,如:bbs,表示bbs为推广渠道;blog,表示blog为推广渠道.
	 */
	private String outerCode;

	/** 
	* 淘客用户的pid,用于生成点击串.nick和pid都传入的话,以pid为准
	 */
	private Long pid;

	/** 
	* 店铺id串.最大输入10个.格式如:"value1,value2,value3" 用" , "号分隔店铺id.
	 */
	private String sids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode() {
		return this.outerCode;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid() {
		return this.pid;
	}

	public void setSids(String sids) {
		this.sids = sids;
	}
	public String getSids() {
		return this.sids;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.shops.convert";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("pid", this.pid);
		txtParams.put("sids", this.sids);
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

	public Class<TaobaokeShopsConvertResponse> getResponseClass() {
		return TaobaokeShopsConvertResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkNotEmpty(sids,"sids");
		RequestCheckUtils.checkMaxListSize(sids,50,"sids");
	}
}
