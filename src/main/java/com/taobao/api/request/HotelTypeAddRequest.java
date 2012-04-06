package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelTypeAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.hotel.type.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class HotelTypeAddRequest implements TaobaoRequest<HotelTypeAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 酒店id。必须为数字
	 */
	private Long hid;

	/** 
	* 房型名称。长度不能超过30
	 */
	private String name;

	public void setHid(Long hid) {
		this.hid = hid;
	}
	public Long getHid() {
		return this.hid;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.type.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("hid", this.hid);
		txtParams.put("name", this.name);
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

	public Class<HotelTypeAddResponse> getResponseClass() {
		return HotelTypeAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(hid,"hid");
		RequestCheckUtils.checkMinValue(hid,0L,"hid");
		RequestCheckUtils.checkNotEmpty(name,"name");
		RequestCheckUtils.checkMaxLength(name,30,"name");
	}
}
