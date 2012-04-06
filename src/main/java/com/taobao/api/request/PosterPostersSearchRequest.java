package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PosterPostersSearchResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.poster.posters.search request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class PosterPostersSearchRequest implements TaobaoRequest<PosterPostersSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 频道id列表
	 */
	private String channelIds;

	/** 
	* 结束时间
	 */
	private Date endDate;

	/** 
	* 关键词出现在标题，短标题，标签中
	 */
	private String keyWord;

	/** 
	* 当前页
	 */
	private Long pageNo;

	/** 
	* 每页显示画报数 小于10或者大于20，默认设置为10
	 */
	private Long pageSize;

	/** 
	* 开始时间
	 */
	private Date startDate;

	public void setChannelIds(String channelIds) {
		this.channelIds = channelIds;
	}
	public String getChannelIds() {
		return this.channelIds;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getKeyWord() {
		return this.keyWord;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.poster.posters.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel_ids", this.channelIds);
		txtParams.put("end_date", this.endDate);
		txtParams.put("key_word", this.keyWord);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<PosterPostersSearchResponse> getResponseClass() {
		return PosterPostersSearchResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxListSize(channelIds,20,"channelIds");
		RequestCheckUtils.checkMaxLength(channelIds,100,"channelIds");
		RequestCheckUtils.checkNotEmpty(pageNo,"pageNo");
		RequestCheckUtils.checkNotEmpty(pageSize,"pageSize");
	}
}
