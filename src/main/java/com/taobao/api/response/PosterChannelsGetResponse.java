package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.HuabaoChannel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.poster.channels.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PosterChannelsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7598534878928145456L;

	/** 
	 * 返回频道列表
	 */
	@ApiListField("channels")
	@ApiField("huabao_channel")
	private List<HuabaoChannel> channels;

	public void setChannels(List<HuabaoChannel> channels) {
		this.channels = channels;
	}
	public List<HuabaoChannel> getChannels( ) {
		return this.channels;
	}

}
