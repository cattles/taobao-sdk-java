package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderTrack;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.mytracks.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioreaderMytracksGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7866586317329181547L;

	/** 
	 * 我的有声书库单曲列表
	 */
	@ApiListField("my_audioreader_tracks")
	@ApiField("taohua_audio_reader_track")
	private List<TaohuaAudioReaderTrack> myAudioreaderTracks;

	/** 
	 * 我的有声书库单曲数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMyAudioreaderTracks(List<TaohuaAudioReaderTrack> myAudioreaderTracks) {
		this.myAudioreaderTracks = myAudioreaderTracks;
	}
	public List<TaohuaAudioReaderTrack> getMyAudioreaderTracks( ) {
		return this.myAudioreaderTracks;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
