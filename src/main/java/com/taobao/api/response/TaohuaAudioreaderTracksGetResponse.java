package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderTrack;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.tracks.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioreaderTracksGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7849439358125469942L;

	/** 
	 * 有声读物单曲列表
	 */
	@ApiListField("audioreader_tracks")
	@ApiField("taohua_audio_reader_track")
	private List<TaohuaAudioReaderTrack> audioreaderTracks;

	/** 
	 * 专辑内的单曲总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAudioreaderTracks(List<TaohuaAudioReaderTrack> audioreaderTracks) {
		this.audioreaderTracks = audioreaderTracks;
	}
	public List<TaohuaAudioReaderTrack> getAudioreaderTracks( ) {
		return this.audioreaderTracks;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
