package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaobaokeItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.listurl.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaobaokeListurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3254314858652883564L;

	/** 
	 * 只返回keyword_click_url
	 */
	@ApiField("taobaoke_item")
	private TaobaokeItem taobaokeItem;

	public void setTaobaokeItem(TaobaokeItem taobaokeItem) {
		this.taobaokeItem = taobaokeItem;
	}
	public TaobaokeItem getTaobaokeItem( ) {
		return this.taobaokeItem;
	}

}
