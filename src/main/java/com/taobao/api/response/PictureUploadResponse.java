package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Picture;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7185472836133244755L;

	/** 
	 * 当前上传的一张图片信息
	 */
	@ApiField("picture")
	private Picture picture;

	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public Picture getPicture( ) {
		return this.picture;
	}

}
