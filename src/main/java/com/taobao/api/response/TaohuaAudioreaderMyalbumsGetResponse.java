package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderMyAlbum;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.myalbums.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioreaderMyalbumsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6839575982661243739L;

	/** 
	 * 我的有声书库专辑列表
	 */
	@ApiListField("my_audioreader_albums")
	@ApiField("taohua_audio_reader_my_album")
	private List<TaohuaAudioReaderMyAlbum> myAudioreaderAlbums;

	/** 
	 * 我的有声书库专辑数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMyAudioreaderAlbums(List<TaohuaAudioReaderMyAlbum> myAudioreaderAlbums) {
		this.myAudioreaderAlbums = myAudioreaderAlbums;
	}
	public List<TaohuaAudioReaderMyAlbum> getMyAudioreaderAlbums( ) {
		return this.myAudioreaderAlbums;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
