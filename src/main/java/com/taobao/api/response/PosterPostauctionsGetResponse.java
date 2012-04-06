package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.HuabaoAuctionInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.poster.postauctions.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PosterPostauctionsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4175546225278735798L;

	/** 
	 * 返回画报商品列表
	 */
	@ApiListField("posterauctions")
	@ApiField("huabao_auction_info")
	private List<HuabaoAuctionInfo> posterauctions;

	public void setPosterauctions(List<HuabaoAuctionInfo> posterauctions) {
		this.posterauctions = posterauctions;
	}
	public List<HuabaoAuctionInfo> getPosterauctions( ) {
		return this.posterauctions;
	}

}
