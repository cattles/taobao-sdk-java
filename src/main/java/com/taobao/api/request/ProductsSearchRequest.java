package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductsSearchResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.products.search request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class ProductsSearchRequest implements TaobaoRequest<ProductsSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 商品类目ID.调用taobao.itemcats.get获取.
	 */
	private Long cid;

	/** 
	* 需返回的字段列表.可选值:Product数据结构中的以下字段:product_id,name,pic_url,cid,props,price,tsc;多个字段之间用","分隔.新增字段status(product的当前状态)
	 */
	private String fields;

	/** 
	* 页码.传入值为1代表第一页,传入值为2代表第二页,依此类推.默认返回的数据是从第一页开始.
	 */
	private Long pageNo;

	/** 
	* 每页条数.每页返回最多返回100条,默认值为40.
	 */
	private Long pageSize;

	/** 
	* 属性,属性值的组合.格式:pid:vid;pid:vid;调用taobao.itemprops.get获取类目属性pid 
,再用taobao.itempropvalues.get取得vid.
	 */
	private String props;

	/** 
	* 搜索的关键词是用来搜索产品的title以及关键属性值的名称.如:"优衣库 1234",这种用来表示查询优衣库这个品牌下的货号为1234的产品;　注:q,cid和props至少传入一个
	 */
	private String q;

	/** 
	* 想要获取的产品的状态列表，支持多个状态并列获取，多个状态之间用","分隔，最多同时指定5种状态。例如，只获取小二确认的spu传入"3",只要商家确认的传入"0"，既要小二确认又要商家确认的传入"0,3"。目前只支持者两种类型的状态搜索，输入其他状态无效。
	 */
	private String status;

	/** 
	* 传入值为：3表示3C表示3C垂直市场产品，4表示鞋城垂直市场产品，8表示网游垂直市场产品。一次只能指定一种垂直市场类型
	 */
	private Long verticalMarket;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
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

	public void setProps(String props) {
		this.props = props;
	}
	public String getProps() {
		return this.props;
	}

	public void setQ(String q) {
		this.q = q;
	}
	public String getQ() {
		return this.q;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setVerticalMarket(Long verticalMarket) {
		this.verticalMarket = verticalMarket;
	}
	public Long getVerticalMarket() {
		return this.verticalMarket;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.products.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("props", this.props);
		txtParams.put("q", this.q);
		txtParams.put("status", this.status);
		txtParams.put("vertical_market", this.verticalMarket);
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

	public Class<ProductsSearchResponse> getResponseClass() {
		return ProductsSearchResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkMaxLength(status,20,"status");
		RequestCheckUtils.checkMinValue(verticalMarket,0L,"verticalMarket");
	}
}
