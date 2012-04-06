package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Huabao;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.poster.posters.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PosterPostersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6876433214849472283L;

	/** 
	 * 画报列表
	 */
	@ApiListField("posters")
	@ApiField("huabao")
	private List<Huabao> posters;

	public void setPosters(List<Huabao> posters) {
		this.posters = posters;
	}
	public List<Huabao> getPosters( ) {
		return this.posters;
	}

}
