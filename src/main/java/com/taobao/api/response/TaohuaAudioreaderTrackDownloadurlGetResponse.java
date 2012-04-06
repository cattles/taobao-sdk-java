package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.track.downloadurl.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioreaderTrackDownloadurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4543635776662192393L;

	/** 
	 * 有声读物单曲下载地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
