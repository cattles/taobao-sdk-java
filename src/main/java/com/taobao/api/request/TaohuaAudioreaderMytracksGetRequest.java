package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaAudioreaderMytracksGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taohua.audioreader.mytracks.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaohuaAudioreaderMytracksGetRequest implements TaobaoRequest<TaohuaAudioreaderMytracksGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 当前页码
	 */
	private Long pageNo;

	/** 
	* 每页个数
	 */
	private Long pageSize;

	/** 
	* 购买专辑的序列ID
	 */
	private Long serialId;

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

	public void setSerialId(Long serialId) {
		this.serialId = serialId;
	}
	public Long getSerialId() {
		return this.serialId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.audioreader.mytracks.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("serial_id", this.serialId);
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

	public Class<TaohuaAudioreaderMytracksGetResponse> getResponseClass() {
		return TaohuaAudioreaderMytracksGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxValue(pageNo,100L,"pageNo");
		RequestCheckUtils.checkMinValue(pageNo,1L,"pageNo");
		RequestCheckUtils.checkMaxValue(pageSize,100L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,1L,"pageSize");
		RequestCheckUtils.checkNotEmpty(serialId,"serialId");
	}
}
