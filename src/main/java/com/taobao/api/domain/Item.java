package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * Item(商品)结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Item extends TaobaoObject {

	private static final long serialVersionUID = 2786357822528155215L;

	/**
	 * 售后服务ID,该字段紧在taobao.item.get接口中返回
	 */
	@ApiField("after_sale_id")
	private Long afterSaleId;

	/**
	 * 商品上传后的状态。onsale出售中，instock库中
	 */
	@ApiField("approve_status")
	private String approveStatus;

	/**
	 * 商城返点比例，为5的倍数，最低0.5%
	 */
	@ApiField("auction_point")
	private Long auctionPoint;

	/**
	 * 代充商品类型。只有少数类目下的商品可以标记上此字段，具体哪些类目可以上传可以通过taobao.itemcat.features.get获得。在代充商品的类目下，不传表示不标记商品类型（交易搜索中就不能通过标记搜到相关的交易了）。可选类型：
time_card(点卡软件代充)
fee_card(话费软件代充)
	 */
	@ApiField("auto_fill")
	private String autoFill;

	/**
	 * 商品所属的叶子类目 id
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 货到付款运费模板ID
	 */
	@ApiField("cod_postage_id")
	private Long codPostageId;

	/**
	 * Item的发布时间，目前仅供taobao.item.add和taobao.item.get可用
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 下架时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("delist_time")
	private Date delistTime;

	/**
	 * 商品描述, 字数要大于5个字符，小于25000个字符
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品url
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * ems费用,格式：5.00；单位：元；精确到：分
	 */
	@ApiField("ems_fee")
	private String emsFee;

	/**
	 * 快递费用,格式：5.00；单位：元；精确到：分
	 */
	@ApiField("express_fee")
	private String expressFee;

	/**
	 * 运费承担方式,seller（卖家承担），buyer(买家承担）
	 */
	@ApiField("freight_payer")
	private String freightPayer;

	/**
	 * 支持会员打折,true/false
	 */
	@ApiField("has_discount")
	private Boolean hasDiscount;

	/**
	 * 是否有发票,true/false
	 */
	@ApiField("has_invoice")
	private Boolean hasInvoice;

	/**
	 * 橱窗推荐,true/false
	 */
	@ApiField("has_showcase")
	private Boolean hasShowcase;

	/**
	 * 是否有保修,true/false
	 */
	@ApiField("has_warranty")
	private Boolean hasWarranty;

	/**
	 * 加价幅度。如果为0，代表系统代理幅度。
在竞拍中，为了超越上一个出价，会员需要在当前出价上增加金额，这个金额就是加价幅度。卖家在发布宝贝的时候可以自定义加价幅度，也可以让系统自动代理加价。系统自动代理加价的加价幅度随着当前出价金额的增加而增加，我们建议会员使用系统自动代理加价，并请买家在出价前看清楚加价幅度的具体金额。另外需要注意是，此功能只适用于拍卖的商品。
以下是系统自动代理加价幅度表：
当前价（加价幅度 ）
1-40（ 1 ）、41-100（ 2 ）、101-200（5 ）、201-500 （10）、501-1001（15）、001-2000（25）、2001-5000（50）、5001-10000（100）
10001以上         200
	 */
	@ApiField("increment")
	private String increment;

	/**
	 * 用户自行输入的类目属性ID串。结构："pid1,pid2,pid3"，如："20000"（表示品牌） 注：通常一个类目下用户可输入的关键属性不超过1个。
	 */
	@ApiField("input_pids")
	private String inputPids;

	/**
	 * 用户自行输入的子属性名和属性值，结构:"父属性值;一级子属性名;一级子属性值;二级子属性名;自定义输入值,....",如：“耐克;耐克系列;科比系列;科比系列;2K5”，input_str需要与input_pids一一对应，注：通常一个类目下用户可输入的关键属性不超过1个。所有属性别名加起来不能超过 3999字节。
	 */
	@ApiField("input_str")
	private String inputStr;

	/**
	 * 是否是3D淘宝的商品
	 */
	@ApiField("is_3D")
	private Boolean is3D;

	/**
	 * 是否在外部网店显示
	 */
	@ApiField("is_ex")
	private Boolean isEx;

	/**
	 * 非分销商品：0，代销：1，经销：2
	 */
	@ApiField("is_fenxiao")
	private Long isFenxiao;

	/**
	 * 是否24小时闪电发货
	 */
	@ApiField("is_lightning_consignment")
	private Boolean isLightningConsignment;

	/**
	 * 商品是否为先行赔付
taobao.items.search和taobao.items.vip.search专用
	 */
	@ApiField("is_prepay")
	private Boolean isPrepay;

	/**
	 * 是否在淘宝显示
	 */
	@ApiField("is_taobao")
	private Boolean isTaobao;

	/**
	 * 是否定时上架商品
	 */
	@ApiField("is_timing")
	private Boolean isTiming;

	/**
	 * 虚拟商品的状态字段
	 */
	@ApiField("is_virtual")
	private Boolean isVirtual;

	/**
	 * 商品图片列表(包括主图)。fields中只设置item_img可以返回ItemImg结构体中所有字段，如果设置为item_img.id、item_img.url、item_img.position等形式就只会返回相应的字段
	 */
	@ApiListField("item_imgs")
	@ApiField("item_img")
	private List<ItemImg> itemImgs;

	/**
	 * 上架时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("list_time")
	private Date listTime;

	/**
	 * 商品所在地
	 */
	@ApiField("location")
	private Location location;

	/**
	 * 商品修改时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 卖家昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 商品数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品数字id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 是否淘1站商品
	 */
	@ApiField("one_station")
	private Boolean oneStation;

	/**
	 * 商家外部编码(可与商家外部系统对接)
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 商品主图片地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 平邮费用,格式：5.00；单位：元；精确到：分
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * 宝贝所属的运费模板ID，如果没有返回则说明没有使用运费模板
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 商品价格，格式：5.00；单位：元；精确到：分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 宝贝所属产品的id(可能为空). 该字段可以通过taobao.products.search 得到
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 消保类型，多个类型以,分割。可取以下值：
2：假一赔三；4：7天无理由退换货；taobao.items.search和taobao.items.vip.search专用
	 */
	@ApiField("promoted_service")
	private String promotedService;

	/**
	 * 商品属性图片列表。fields中只设置prop_img可以返回PropImg结构体中所有字段，如果设置为prop_img.id、prop_img.url、prop_img.properties、prop_img.position等形式就只会返回相应的字段
	 */
	@ApiListField("prop_imgs")
	@ApiField("prop_img")
	private List<PropImg> propImgs;

	/**
	 * 属性值别名,比如颜色的自定义名称
	 */
	@ApiField("property_alias")
	private String propertyAlias;

	/**
	 * 商品属性 格式：pid:vid;pid:vid
	 */
	@ApiField("props")
	private String props;

	/**
	 * 商品属性名称。标识着props内容里面的pid和vid所对应的名称。格式为：pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2……(<strong>注：</strong><font color="red">属性名称中的冒号":"被转换为："#cln#";  
分号";"被转换为："#scln#"
</font>)
	 */
	@ApiField("props_name")
	private String propsName;

	/**
	 * 商品所属卖家的信用等级数，1表示1心，2表示2心……，只有调用商品搜索:taobao.items.get和taobao.items.search的时候才能返回
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 秒杀商品类型。打上秒杀标记的商品，用户只能下架并不能再上架，其他任何编辑或删除操作都不能进行。如果用户想取消秒杀标记，需要联系小二进行操作。如果秒杀结束需要自由编辑请联系活动负责人（小二）去掉秒杀标记。可选类型
web_only(只能通过web网络秒杀)
wap_only(只能通过wap网络秒杀)
web_and_wap(既能通过web秒杀也能通过wap秒杀)
	 */
	@ApiField("second_kill")
	private String secondKill;

	/**
	 * 是否承诺退换货服务!
	 */
	@ApiField("sell_promise")
	private Boolean sellPromise;

	/**
	 * 商品所属的店铺内卖家自定义类目列表
	 */
	@ApiField("seller_cids")
	private String sellerCids;

	/**
	 * <a href="http://open.taobao.com/dev/index.php/Sku">Sku</a>列表。fields中只设置sku可以返回Sku结构体中所有字段，如果设置为sku.sku_id、sku.properties、sku.quantity等形式就只会返回相应的字段
	 */
	@ApiListField("skus")
	@ApiField("sku")
	private List<Sku> skus;

	/**
	 * 商品新旧程度(全新:new，闲置:unused，二手：second)
	 */
	@ApiField("stuff_status")
	private String stuffStatus;

	/**
	 * 页面模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 商品标题,不能超过60字节
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品类型(fixed:一口价;auction:拍卖)注：取消团购
	 */
	@ApiField("type")
	private String type;

	/**
	 * 有效期,7或者14（默认是14天）
	 */
	@ApiField("valid_thru")
	private Long validThru;

	/**
	 * 商品视频列表(目前只支持单个视频关联)。fields中只设置video可以返回Video结构体中所有字段，如果设置为video.id、video.video_id、
video.url等形式就只会返回相应的字段
	 */
	@ApiListField("videos")
	@ApiField("video")
	private List<Video> videos;

	/**
	 * 商品是否违规，违规：true , 不违规：false
	 */
	@ApiField("violation")
	private Boolean violation;

	/**
	 * 对应搜索商品列表页的最近成交量,只有调用商品搜索:taobao.items.get和taobao.items.search的时候才能返回
	 */
	@ApiField("volume")
	private Long volume;

	/**
	 * 不带html标签的desc文本信息，该字段只在taobao.item.get接口中返回
	 */
	@ApiField("wap_desc")
	private String wapDesc;

	/**
	 * 适合wap应用的商品详情url ，该字段只在taobao.item.get接口中返回
	 */
	@ApiField("wap_detail_url")
	private String wapDetailUrl;

	/**
	 * 商品所属的商家的旺旺在线状况，
taobao.items.search和taobao.items.vip.search专用
	 */
	@ApiField("ww_status")
	private Boolean wwStatus;

	public Long getAfterSaleId() {
		return this.afterSaleId;
	}
	public void setAfterSaleId(Long afterSaleId) {
		this.afterSaleId = afterSaleId;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Long getAuctionPoint() {
		return this.auctionPoint;
	}
	public void setAuctionPoint(Long auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public String getAutoFill() {
		return this.autoFill;
	}
	public void setAutoFill(String autoFill) {
		this.autoFill = autoFill;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCodPostageId() {
		return this.codPostageId;
	}
	public void setCodPostageId(Long codPostageId) {
		this.codPostageId = codPostageId;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getDelistTime() {
		return this.delistTime;
	}
	public void setDelistTime(Date delistTime) {
		this.delistTime = delistTime;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getEmsFee() {
		return this.emsFee;
	}
	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}

	public String getExpressFee() {
		return this.expressFee;
	}
	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}
	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public Boolean getHasInvoice() {
		return this.hasInvoice;
	}
	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public Boolean getHasShowcase() {
		return this.hasShowcase;
	}
	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public Boolean getHasWarranty() {
		return this.hasWarranty;
	}
	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public String getIncrement() {
		return this.increment;
	}
	public void setIncrement(String increment) {
		this.increment = increment;
	}

	public String getInputPids() {
		return this.inputPids;
	}
	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}

	public String getInputStr() {
		return this.inputStr;
	}
	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public Boolean getIsEx() {
		return this.isEx;
	}
	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}

	public Long getIsFenxiao() {
		return this.isFenxiao;
	}
	public void setIsFenxiao(Long isFenxiao) {
		this.isFenxiao = isFenxiao;
	}

	public Boolean getIsLightningConsignment() {
		return this.isLightningConsignment;
	}
	public void setIsLightningConsignment(Boolean isLightningConsignment) {
		this.isLightningConsignment = isLightningConsignment;
	}

	public Boolean getIsPrepay() {
		return this.isPrepay;
	}
	public void setIsPrepay(Boolean isPrepay) {
		this.isPrepay = isPrepay;
	}

	public Boolean getIsTaobao() {
		return this.isTaobao;
	}
	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
	}

	public Boolean getIsTiming() {
		return this.isTiming;
	}
	public void setIsTiming(Boolean isTiming) {
		this.isTiming = isTiming;
	}

	public Boolean getIsVirtual() {
		return this.isVirtual;
	}
	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	public List<ItemImg> getItemImgs() {
		return this.itemImgs;
	}
	public void setItemImgs(List<ItemImg> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public Date getListTime() {
		return this.listTime;
	}
	public void setListTime(Date listTime) {
		this.listTime = listTime;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Boolean getOneStation() {
		return this.oneStation;
	}
	public void setOneStation(Boolean oneStation) {
		this.oneStation = oneStation;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getPromotedService() {
		return this.promotedService;
	}
	public void setPromotedService(String promotedService) {
		this.promotedService = promotedService;
	}

	public List<PropImg> getPropImgs() {
		return this.propImgs;
	}
	public void setPropImgs(List<PropImg> propImgs) {
		this.propImgs = propImgs;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getPropsName() {
		return this.propsName;
	}
	public void setPropsName(String propsName) {
		this.propsName = propsName;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getSecondKill() {
		return this.secondKill;
	}
	public void setSecondKill(String secondKill) {
		this.secondKill = secondKill;
	}

	public Boolean getSellPromise() {
		return this.sellPromise;
	}
	public void setSellPromise(Boolean sellPromise) {
		this.sellPromise = sellPromise;
	}

	public String getSellerCids() {
		return this.sellerCids;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public List<Sku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

	public String getStuffStatus() {
		return this.stuffStatus;
	}
	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getValidThru() {
		return this.validThru;
	}
	public void setValidThru(Long validThru) {
		this.validThru = validThru;
	}

	public List<Video> getVideos() {
		return this.videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public Boolean getViolation() {
		return this.violation;
	}
	public void setViolation(Boolean violation) {
		this.violation = violation;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public String getWapDesc() {
		return this.wapDesc;
	}
	public void setWapDesc(String wapDesc) {
		this.wapDesc = wapDesc;
	}

	public String getWapDetailUrl() {
		return this.wapDetailUrl;
	}
	public void setWapDetailUrl(String wapDetailUrl) {
		this.wapDetailUrl = wapDetailUrl;
	}

	public Boolean getWwStatus() {
		return this.wwStatus;
	}
	public void setWwStatus(Boolean wwStatus) {
		this.wwStatus = wwStatus;
	}

}
