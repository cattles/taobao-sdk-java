package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaAudioReaderAlbum;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.album.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioreaderAlbumGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1625332416985136624L;

	/** 
	 * 有声读物专辑
	 */
	@ApiField("audioreader_album")
	private TaohuaAudioReaderAlbum audioreaderAlbum;

	public void setAudioreaderAlbum(TaohuaAudioReaderAlbum audioreaderAlbum) {
		this.audioreaderAlbum = audioreaderAlbum;
	}
	public TaohuaAudioReaderAlbum getAudioreaderAlbum( ) {
		return this.audioreaderAlbum;
	}

}
