package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.itemdetail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaItemdetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8543947646754544578L;

	/** 
	 * 淘花商品数据结构
	 */
	@ApiField("taohua_item_detail")
	private TaohuaItem taohuaItemDetail;

	public void setTaohuaItemDetail(TaohuaItem taohuaItemDetail) {
		this.taohuaItemDetail = taohuaItemDetail;
	}
	public TaohuaItem getTaohuaItemDetail( ) {
		return this.taohuaItemDetail;
	}

}
