package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Huabao;
import com.taobao.api.domain.HuabaoPicture;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.poster.posterdetail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PosterPosterdetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8195425371487391789L;

	/** 
	 * 根据ID获取画报
	 */
	@ApiField("poster")
	private Huabao poster;

	/** 
	 * 根据画报ID获取画报图片
	 */
	@ApiListField("poster_pics")
	@ApiField("huabao_picture")
	private List<HuabaoPicture> posterPics;

	public void setPoster(Huabao poster) {
		this.poster = poster;
	}
	public Huabao getPoster( ) {
		return this.poster;
	}

	public void setPosterPics(List<HuabaoPicture> posterPics) {
		this.posterPics = posterPics;
	}
	public List<HuabaoPicture> getPosterPics( ) {
		return this.posterPics;
	}

}
