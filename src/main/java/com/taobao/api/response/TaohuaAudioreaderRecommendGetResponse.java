package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderAlbumSummary;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.recommend.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaohuaAudioreaderRecommendGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1598734154449866794L;

	/** 
	 * 有声读物专辑摘要列表
	 */
	@ApiListField("audioreader_summaries")
	@ApiField("taohua_audio_reader_album_summary")
	private List<TaohuaAudioReaderAlbumSummary> audioreaderSummaries;

	/** 
	 * 符合条件的专辑总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAudioreaderSummaries(List<TaohuaAudioReaderAlbumSummary> audioreaderSummaries) {
		this.audioreaderSummaries = audioreaderSummaries;
	}
	public List<TaohuaAudioReaderAlbumSummary> getAudioreaderSummaries( ) {
		return this.audioreaderSummaries;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
