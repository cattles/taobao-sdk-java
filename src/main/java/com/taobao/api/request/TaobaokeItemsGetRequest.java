package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeItemsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taobaoke.items.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaobaokeItemsGetRequest implements TaobaoRequest<TaobaokeItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 商品所在地
	 */
	private String area;

	/** 
	* 是否自动发货
	 */
	private String autoSend;

	/** 
	* 是否支持抵价券，设置为true表示该商品支持抵价券，设置为false或不设置表示不判断这个属性
	 */
	private String cashCoupon;

	/** 
	* 是否支持货到付款，设置为true表示该商品是支持货到付款，设置为false或不设置表示不判断这个属性
	 */
	private String cashOndelivery;

	/** 
	* 商品所属分类id
	 */
	private Long cid;

	/** 
	* 最高累计推广佣金选项
	 */
	private String endCommissionNum;

	/** 
	* 最高佣金比率选项，如：2345表示23.45%。注：要起始佣金比率和最高佣金比率一起设置才有效。
	 */
	private String endCommissionRate;

	/** 
	* 可选值和start_credit一样.start_credit的值一定要小于或等于end_credit的值。注：end_credit与start_credit一起使用才生效
	 */
	private String endCredit;

	/** 
	* 最高价格
	 */
	private String endPrice;

	/** 
	* 累计推广量范围结束
	 */
	private String endTotalnum;

	/** 
	* 需返回的字段列表.可选值:num_iid,title,nick,pic_url,price,click_url,commission,commission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume
;字段之间用","分隔
	 */
	private String fields;

	/** 
	* 是否查询消保卖家
	 */
	private String guarantee;

	/** 
	* 标识一个应用是否来在无线或者手机应用,如果是true则会使用其他规则加密点击串.如果不穿值,则默认是false.
	 */
	private Boolean isMobile;

	/** 
	* 商品标题中包含的关键字. 注意:查询时keyword,cid至少选择其中一个参数
	 */
	private String keyword;

	/** 
	* 是否商城的商品，设置为true表示该商品是属于淘宝商城的商品，设置为false或不设置表示不判断这个属性
	 */
	private String mallItem;

	/** 
	* 淘宝用户昵称，注：指的是淘宝的会员登录名.如果昵称错误,那么客户就收不到佣金.每个淘宝昵称都对应于一个pid，在这里输入要结算佣金的淘宝昵称，当推广的商品成功后，佣金会打入此输入的淘宝昵称的账户。具体的信息可以登入阿里妈妈的网站查看.
<font color="red">注意nick和pid至少需要传递一个,如果2个都传了,将以pid为准</font>
	 */
	private String nick;

	/** 
	* 是否30天维修，设置为true表示该商品是支持30天维修，设置为false或不设置表示不判断这个属性
	 */
	private String onemonthRepair;

	/** 
	* 自定义输入串.格式:英文和数字组成;长度不能大于12个字符,区分不同的推广渠道,如:bbs,表示bbs为推广渠道;blog,表示blog为推广渠道.
	 */
	private String outerCode;

	/** 
	* 是否海外商品，设置为true表示该商品是属于海外商品，默认为false
	 */
	private String overseasItem;

	/** 
	* 结果页数.1~99
	 */
	private Long pageNo;

	/** 
	* 每页返回结果数.最大每页40
	 */
	private Long pageSize;

	/** 
	* 用户的pid,必须是mm_xxxx_0_0这种格式中间的"xxxx".
<font color="red">注意nick和pid至少需要传递一个,如果2个都传了,将以pid为准,且pid的最大长度是20</font>
	 */
	private String pid;

	/** 
	* 是否如实描述(即:先行赔付)商品，设置为true表示该商品是如实描述的商品，设置为false或不设置表示不判断这个属性
	 */
	private String realDescribe;

	/** 
	* 是否支持7天退换，设置为true表示该商品支持7天退换，设置为false或不设置表示不判断这个属性
	 */
	private String sevendaysReturn;

	/** 
	* 默认排序:default

price_desc(价格从高到低) 
price_asc(价格从低到高) 
credit_desc(信用等级从高到低) 
commissionRate_desc(佣金比率从高到低) 
commissionRate_asc(佣金比率从低到高) 
commissionNum_desc(成交量成高到低) 
commissionNum_asc(成交量从低到高) 
commissionVolume_desc(总支出佣金从高到低) 
commissionVolume_asc(总支出佣金从低到高) 
delistTime_desc(商品下架时间从高到低) 
delistTime_asc(商品下架时间从低到高)
	 */
	private String sort;

	/** 
	* 起始累计推广量佣金.注：返回的数据是30天内累计推广量，具该字段要与最高累计推广量一起使用才生效
	 */
	private String startCommissionNum;

	/** 
	* 起始佣金比率选项，如：1234表示12.34%
	 */
	private String startCommissionRate;

	/** 
	* 卖家信用:

1heart(一心) 
2heart (两心) 
3heart(三心) 
4heart(四心) 
5heart(五心) 
1diamond(一钻) 
2diamond(两钻) 
3diamond(三钻) 
4diamond(四钻) 
5diamond(五钻) 
1crown(一冠) 
2crown(两冠) 
3crown(三冠) 
4crown(四冠) 
5crown(五冠) 
1goldencrown(一黄冠) 
2goldencrown(二黄冠) 
3goldencrown(三黄冠) 
4goldencrown(四黄冠) 
5goldencrown(五黄冠)
	 */
	private String startCredit;

	/** 
	* 起始价格.传入价格参数时,需注意起始价格和最高价格必须一起传入,并且 start_price <= end_price
	 */
	private String startPrice;

	/** 
	* 累计推广量范围开始
	 */
	private String startTotalnum;

	/** 
	* 是否支持VIP卡，设置为true表示该商品支持VIP卡，设置为false或不设置表示不判断这个属性
	 */
	private String vipCard;

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return this.area;
	}

	public void setAutoSend(String autoSend) {
		this.autoSend = autoSend;
	}
	public String getAutoSend() {
		return this.autoSend;
	}

	public void setCashCoupon(String cashCoupon) {
		this.cashCoupon = cashCoupon;
	}
	public String getCashCoupon() {
		return this.cashCoupon;
	}

	public void setCashOndelivery(String cashOndelivery) {
		this.cashOndelivery = cashOndelivery;
	}
	public String getCashOndelivery() {
		return this.cashOndelivery;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setEndCommissionNum(String endCommissionNum) {
		this.endCommissionNum = endCommissionNum;
	}
	public String getEndCommissionNum() {
		return this.endCommissionNum;
	}

	public void setEndCommissionRate(String endCommissionRate) {
		this.endCommissionRate = endCommissionRate;
	}
	public String getEndCommissionRate() {
		return this.endCommissionRate;
	}

	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}
	public String getEndCredit() {
		return this.endCredit;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getEndPrice() {
		return this.endPrice;
	}

	public void setEndTotalnum(String endTotalnum) {
		this.endTotalnum = endTotalnum;
	}
	public String getEndTotalnum() {
		return this.endTotalnum;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}
	public String getGuarantee() {
		return this.guarantee;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
	}
	public Boolean getIsMobile() {
		return this.isMobile;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKeyword() {
		return this.keyword;
	}

	public void setMallItem(String mallItem) {
		this.mallItem = mallItem;
	}
	public String getMallItem() {
		return this.mallItem;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOnemonthRepair(String onemonthRepair) {
		this.onemonthRepair = onemonthRepair;
	}
	public String getOnemonthRepair() {
		return this.onemonthRepair;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode() {
		return this.outerCode;
	}

	public void setOverseasItem(String overseasItem) {
		this.overseasItem = overseasItem;
	}
	public String getOverseasItem() {
		return this.overseasItem;
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

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid() {
		return this.pid;
	}

	public void setRealDescribe(String realDescribe) {
		this.realDescribe = realDescribe;
	}
	public String getRealDescribe() {
		return this.realDescribe;
	}

	public void setSevendaysReturn(String sevendaysReturn) {
		this.sevendaysReturn = sevendaysReturn;
	}
	public String getSevendaysReturn() {
		return this.sevendaysReturn;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSort() {
		return this.sort;
	}

	public void setStartCommissionNum(String startCommissionNum) {
		this.startCommissionNum = startCommissionNum;
	}
	public String getStartCommissionNum() {
		return this.startCommissionNum;
	}

	public void setStartCommissionRate(String startCommissionRate) {
		this.startCommissionRate = startCommissionRate;
	}
	public String getStartCommissionRate() {
		return this.startCommissionRate;
	}

	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}
	public String getStartCredit() {
		return this.startCredit;
	}

	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getStartPrice() {
		return this.startPrice;
	}

	public void setStartTotalnum(String startTotalnum) {
		this.startTotalnum = startTotalnum;
	}
	public String getStartTotalnum() {
		return this.startTotalnum;
	}

	public void setVipCard(String vipCard) {
		this.vipCard = vipCard;
	}
	public String getVipCard() {
		return this.vipCard;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("area", this.area);
		txtParams.put("auto_send", this.autoSend);
		txtParams.put("cash_coupon", this.cashCoupon);
		txtParams.put("cash_ondelivery", this.cashOndelivery);
		txtParams.put("cid", this.cid);
		txtParams.put("end_commissionNum", this.endCommissionNum);
		txtParams.put("end_commissionRate", this.endCommissionRate);
		txtParams.put("end_credit", this.endCredit);
		txtParams.put("end_price", this.endPrice);
		txtParams.put("end_totalnum", this.endTotalnum);
		txtParams.put("fields", this.fields);
		txtParams.put("guarantee", this.guarantee);
		txtParams.put("is_mobile", this.isMobile);
		txtParams.put("keyword", this.keyword);
		txtParams.put("mall_item", this.mallItem);
		txtParams.put("nick", this.nick);
		txtParams.put("onemonth_repair", this.onemonthRepair);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("overseas_item", this.overseasItem);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pid", this.pid);
		txtParams.put("real_describe", this.realDescribe);
		txtParams.put("sevendays_return", this.sevendaysReturn);
		txtParams.put("sort", this.sort);
		txtParams.put("start_commissionNum", this.startCommissionNum);
		txtParams.put("start_commissionRate", this.startCommissionRate);
		txtParams.put("start_credit", this.startCredit);
		txtParams.put("start_price", this.startPrice);
		txtParams.put("start_totalnum", this.startTotalnum);
		txtParams.put("vip_card", this.vipCard);
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

	public Class<TaobaokeItemsGetResponse> getResponseClass() {
		return TaobaokeItemsGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxValue(cid,2147483647L,"cid");
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkMaxValue(pageNo,1000000L,"pageNo");
		RequestCheckUtils.checkMaxValue(pageSize,400L,"pageSize");
		RequestCheckUtils.checkMaxLength(pid,20,"pid");
	}
}
