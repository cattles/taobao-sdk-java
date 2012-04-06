package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaoCodeDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taocode.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaocodeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5816427739337589783L;

	/** 
	 * 淘代码详情
	 */
	@ApiField("tao_code_detail")
	private TaoCodeDetail taoCodeDetail;

	public void setTaoCodeDetail(TaoCodeDetail taoCodeDetail) {
		this.taoCodeDetail = taoCodeDetail;
	}
	public TaoCodeDetail getTaoCodeDetail( ) {
		return this.taoCodeDetail;
	}

}
