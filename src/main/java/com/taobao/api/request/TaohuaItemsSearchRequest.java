package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaohuaItemsSearchResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taohua.items.search request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaohuaItemsSearchRequest implements TaobaoRequest<TaohuaItemsSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 文件最小size,单位byte。
	 */
	private String beginSize;

	/** 
	* 类目id
	 */
	private Long cid;

	/** 
	* 文件最大size,单位byte。
	 */
	private String endSize;

	/** 
	* 按照文件类型来搜索
	 */
	private String fileType;

	/** 
	* 是否免费，如果为true则表示只搜索免费的商品。
	 */
	private Boolean free;

	/** 
	* 查询关键字,超过60好字符则自动截断为60个字符.  默认允许为null
	 */
	private String keywords;

	/** 
	* 分页搜索商品信息，page_no代表的是第几页
	 */
	private Long pageNo;

	/** 
	* 分页搜索商品信息，page_size代表：每页显示多少条数据。  目前最少5条，最多30条数据。
	 */
	private Long pageSize;

	/** 
	* 排序值:

1. 评分排序：ratescoredesc,
2. 价格升序: priceasc,
3. 价格降序: pricedesc,
4. 时间排序: shelvesdate,
5. 浏览排序：viewcount,
6. 销量升序：saleasc,
7. 默认排序：default,
	 */
	private String sort;

	public void setBeginSize(String beginSize) {
		this.beginSize = beginSize;
	}
	public String getBeginSize() {
		return this.beginSize;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setEndSize(String endSize) {
		this.endSize = endSize;
	}
	public String getEndSize() {
		return this.endSize;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}
	public Boolean getFree() {
		return this.free;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getKeywords() {
		return this.keywords;
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

	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSort() {
		return this.sort;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taohua.items.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("begin_size", this.beginSize);
		txtParams.put("cid", this.cid);
		txtParams.put("end_size", this.endSize);
		txtParams.put("file_type", this.fileType);
		txtParams.put("free", this.free);
		txtParams.put("keywords", this.keywords);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("sort", this.sort);
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

	public Class<TaohuaItemsSearchResponse> getResponseClass() {
		return TaohuaItemsSearchResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxValue(pageSize,30L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,5L,"pageSize");
	}
}
