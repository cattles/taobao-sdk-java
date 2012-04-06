package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaItemcommentAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taohua.itemcomment.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaohuaItemcommentAddRequest implements TaobaoRequest<TaohuaItemcommentAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 对商品的评论内容
	 */
	private String comment;

	/** 
	* 商品ID
	 */
	private Long itemId;

	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment() {
		return this.comment;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.itemcomment.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("comment", this.comment);
		txtParams.put("item_id", this.itemId);
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

	public Class<TaohuaItemcommentAddResponse> getResponseClass() {
		return TaohuaItemcommentAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(comment,"comment");
		RequestCheckUtils.checkMaxLength(comment,4000,"comment");
		RequestCheckUtils.checkNotEmpty(itemId,"itemId");
	}
}
