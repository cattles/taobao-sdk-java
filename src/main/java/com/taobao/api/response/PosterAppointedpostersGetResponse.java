package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Huabao;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.poster.appointedposters.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PosterAppointedpostersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1386818922728616153L;

	/** 
	 * 画报列表
	 */
	@ApiListField("appointedposters")
	@ApiField("huabao")
	private List<Huabao> appointedposters;

	public void setAppointedposters(List<Huabao> appointedposters) {
		this.appointedposters = appointedposters;
	}
	public List<Huabao> getAppointedposters( ) {
		return this.appointedposters;
	}

}
