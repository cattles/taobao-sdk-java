package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaPreviewurlGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taohua.previewurl.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaohuaPreviewurlGetRequest implements TaobaoRequest<TaohuaPreviewurlGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 用来区分要预览的文档类型,目前支持两种
pre_epub 预览epub文档
pre_pdf  预览pdf文档
	 */
	private String fileType;

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 文件位置
	 */
	private String position;

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosition() {
		return this.position;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.previewurl.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("file_type", this.fileType);
		txtParams.put("item_id", this.itemId);
		txtParams.put("position", this.position);
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

	public Class<TaohuaPreviewurlGetResponse> getResponseClass() {
		return TaohuaPreviewurlGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fileType,"fileType");
		RequestCheckUtils.checkNotEmpty(itemId,"itemId");
		RequestCheckUtils.checkNotEmpty(position,"position");
	}
}
