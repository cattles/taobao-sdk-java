package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PostageAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.postage.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PostageAddRequest implements TaobaoRequest<PostageAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 默认EMS加价费用.精确到1位小数;单位:元。如:1.5
	 */
	private String emsIncrease;

	/** 
	* 默认EMS费用. 精确到1位小数;单位:元。如:200.5
	 */
	private String emsPrice;

	/** 
	* 默认快递加价费用.精确到1位小数;单位:元。如:1.5
<br>
<font color='red'>货到付款用户，为必选项</font>
	 */
	private String expressIncrease;

	/** 
	* 默认快递费用. 精确到1位小数;单位:元。如:200.5
<br>
<font color='red'>货到付款用户，为必选项</font>
	 */
	private String expressPrice;

	/** 
	* 邮费模板备注,不能超过200个字节
	 */
	private String memo;

	/** 
	* 邮费模板名称,不能超过50个字节
	 */
	private String name;

	/** 
	* 默认平邮加价费用. 精确到1位小数;单位:元。如:1.5
	 */
	private String postIncrease;

	/** 
	* 默认平邮费用. 注意:至少选择一组默认的邮费组,例如:post_price,post_increase . 精确到1位小数;单位:元。如:200.5
	 */
	private String postPrice;

	/** 
	* 邮费子项涉及的地区.结构: value1;value2;value3 如:110000;310000;320000,330000 就代表邮费子项涉及(北京;上海;江苏,浙江)四个地区. 可以用taobao.areas.get接口获取.或者参考：http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm
	 */
	private String postageModeDests;

	/** 
	* 运费方式加件费用.结构: value1;value2;value3 如: 1.5;2;4 .精确到1位小数;单位:元。如:1.5
	 */
	private String postageModeIncreases;

	/** 
	* 运费方式单价. 结构: value1;value2;value3 如: 11.2;14;6 .精确到1位小数;单位:元。如:200.5
	 */
	private String postageModePrices;

	/** 
	* 运费方式:平邮 (post),快递公司(express),EMS (ems) 结构:value1;value2;value3 如: post;express;ems 注意:在添加多个PostageMode时,字符串中使用 ";" 分号区分.postage_mode.type,postage_mode.dest,postage_mode.price,postage_mode.increase, 数量必须一致.
	 */
	private String postageModeTypes;

	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}
	public String getEmsIncrease() {
		return this.emsIncrease;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	public String getEmsPrice() {
		return this.emsPrice;
	}

	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}
	public String getExpressIncrease() {
		return this.expressIncrease;
	}

	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}
	public String getExpressPrice() {
		return this.expressPrice;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}
	public String getPostIncrease() {
		return this.postIncrease;
	}

	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}
	public String getPostPrice() {
		return this.postPrice;
	}

	public void setPostageModeDests(String postageModeDests) {
		this.postageModeDests = postageModeDests;
	}
	public String getPostageModeDests() {
		return this.postageModeDests;
	}

	public void setPostageModeIncreases(String postageModeIncreases) {
		this.postageModeIncreases = postageModeIncreases;
	}
	public String getPostageModeIncreases() {
		return this.postageModeIncreases;
	}

	public void setPostageModePrices(String postageModePrices) {
		this.postageModePrices = postageModePrices;
	}
	public String getPostageModePrices() {
		return this.postageModePrices;
	}

	public void setPostageModeTypes(String postageModeTypes) {
		this.postageModeTypes = postageModeTypes;
	}
	public String getPostageModeTypes() {
		return this.postageModeTypes;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.postage.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ems_increase", this.emsIncrease);
		txtParams.put("ems_price", this.emsPrice);
		txtParams.put("express_increase", this.expressIncrease);
		txtParams.put("express_price", this.expressPrice);
		txtParams.put("memo", this.memo);
		txtParams.put("name", this.name);
		txtParams.put("post_increase", this.postIncrease);
		txtParams.put("post_price", this.postPrice);
		txtParams.put("postage_mode_dests", this.postageModeDests);
		txtParams.put("postage_mode_increases", this.postageModeIncreases);
		txtParams.put("postage_mode_prices", this.postageModePrices);
		txtParams.put("postage_mode_types", this.postageModeTypes);
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

	public Class<PostageAddResponse> getResponseClass() {
		return PostageAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(name,"name");
	}
}
