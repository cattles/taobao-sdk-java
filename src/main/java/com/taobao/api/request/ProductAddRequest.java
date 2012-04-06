package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.product.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class ProductAddRequest implements TaobaoUploadRequest<ProductAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 非关键属性结构:pid:vid;pid:vid.非关键属性不包含关键属性、销售属性、用户自定义属性、商品属性;调用taobao.itemprops.get获取pid,调用taobao.itempropvalues.get获取vid.<br><font color=red>注:支持最大长度为512字节</font>
	 */
	private String binds;

	/** 
	* 商品类目ID.调用taobao.itemcats.get获取;注意:必须是叶子类目 id.
	 */
	private Long cid;

	/** 
	* 用户自定义属性,结构：pid1:value1;pid2:value2，如果有型号，系列,货号等用: 隔开 例如：“20000:优衣库:型号:001:632501:1234”，表示“品牌:优衣库:型号:001:货号:1234”
	 */
	private String customerProps;

	/** 
	* 产品描述.最大25000个字节
	 */
	private String desc;

	/** 
	* 产品主图片.最大1M,目前仅支持GIF,JPG.
	 */
	private FileItem image;

	/** 
	* 是不是主图
	 */
	private Boolean major;

	/** 
	* 上市时间。目前只支持鞋城类目传入此参数
	 */
	private Date marketTime;

	/** 
	* 产品名称,最大60个字节.
	 */
	private String name;

	/** 
	* 外部产品ID
	 */
	private String outerId;

	/** 
	* 产品市场价.精确到2位小数;单位为元.如：200.07
	 */
	private String price;

	/** 
	* 销售属性值别名。格式为pid1:vid1:alias1;pid1:vid2:alia2。只有少数销售属性值支持传入别名，比如颜色和尺寸
	 */
	private String propertyAlias;

	/** 
	* 关键属性 结构:pid:vid;pid:vid.调用taobao.itemprops.get获取pid,调用taobao.itempropvalues.get获取vid;如果碰到用户自定义属性,请用customer_props.
	 */
	private String props;

	/** 
	* 销售属性结构:pid:vid;pid:vid.调用taobao.itemprops.get获取is_sale_prop＝true的pid,调用taobao.itempropvalues.get获取vid.
	 */
	private String saleProps;

	public void setBinds(String binds) {
		this.binds = binds;
	}
	public String getBinds() {
		return this.binds;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setCustomerProps(String customerProps) {
		this.customerProps = customerProps;
	}
	public String getCustomerProps() {
		return this.customerProps;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}
	public FileItem getImage() {
		return this.image;
	}

	public void setMajor(Boolean major) {
		this.major = major;
	}
	public Boolean getMajor() {
		return this.major;
	}

	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;
	}
	public Date getMarketTime() {
		return this.marketTime;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return this.price;
	}

	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}
	public String getPropertyAlias() {
		return this.propertyAlias;
	}

	public void setProps(String props) {
		this.props = props;
	}
	public String getProps() {
		return this.props;
	}

	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}
	public String getSaleProps() {
		return this.saleProps;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.product.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("binds", this.binds);
		txtParams.put("cid", this.cid);
		txtParams.put("customer_props", this.customerProps);
		txtParams.put("desc", this.desc);
		txtParams.put("major", this.major);
		txtParams.put("market_time", this.marketTime);
		txtParams.put("name", this.name);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("price", this.price);
		txtParams.put("property_alias", this.propertyAlias);
		txtParams.put("props", this.props);
		txtParams.put("sale_props", this.saleProps);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

	public Class<ProductAddResponse> getResponseClass() {
		return ProductAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxLength(binds,512,"binds");
		RequestCheckUtils.checkNotEmpty(cid,"cid");
		RequestCheckUtils.checkNotEmpty(image,"image");
		RequestCheckUtils.checkMaxLength(image,1048576,"image");
		RequestCheckUtils.checkNotEmpty(name,"name");
		RequestCheckUtils.checkNotEmpty(price,"price");
	}
}
