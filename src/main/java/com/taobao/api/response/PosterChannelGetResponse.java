package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.HuabaoChannel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.poster.channel.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PosterChannelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6314212824528757516L;

	/** 
	 * 频道信息
	 */
	@ApiField("channel")
	private HuabaoChannel channel;

	public void setChannel(HuabaoChannel channel) {
		this.channel = channel;
	}
	public HuabaoChannel getChannel( ) {
		return this.channel;
	}

}
