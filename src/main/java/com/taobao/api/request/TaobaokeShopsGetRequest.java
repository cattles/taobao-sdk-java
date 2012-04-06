package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaobaokeShopsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.taobaoke.shops.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class TaobaokeShopsGetRequest implements TaobaoRequest<TaobaokeShopsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 前台类目id
	 */
	private Long cid;

	/** 
	* 店铺商品数查询结束值
	 */
	private String endAuctioncount;

	/** 
	* 店铺佣金比例查询结束值
	 */
	private String endCommissionrate;

	/** 
	* 店铺掌柜信用等级查询结束
店铺的信用等级总共为20级 1-5:1heart-5heart;6-10:1diamond-5diamond;11-15:1crown-5crown;16-20:1goldencrown-5goldencrown
	 */
	private String endCredit;

	/** 
	* 店铺累计推广数查询结束值
	 */
	private String endTotalaction;

	/** 
	* 需要返回的字段，目前包括如下字段 user_id click_url shop_title commission_rate seller_credit shop_type auction_count total_auction
	 */
	private String fields;

	/** 
	* 店铺主题关键字查询
	 */
	private String keyword;

	/** 
	* 淘宝用户昵称，注：指的是淘宝的会员登录名.如果昵称错误,那么客户就收不到佣金.每个淘宝昵称都对应于一个pid，在这里输入要结算佣金的淘宝昵称，当推广的商品成功后，佣金会打入此输入的淘宝昵称的账户。具体的信息可以登入阿里妈妈的网站查看
	 */
	private String nick;

	/** 
	* 是否只显示商城店铺
	 */
	private Boolean onlyMall;

	/** 
	* 自定义输入串.格式:英文和数字组成;长度不能大于12个字符,区分不同的推广渠道,如:bbs,表示bbs为推广渠道;blog,表示blog为推广渠道.
	 */
	private String outerCode;

	/** 
	* 页码.结果页1~99
	 */
	private Long pageNo;

	/** 
	* 每页条数.最大每页40
	 */
	private Long pageSize;

	/** 
	* 淘客用户的pid,用于生成点击串.nick和pid都传入的话,以pid为准
	 */
	private Long pid;

	/** 
	* 店铺宝贝数查询开始值
	 */
	private String startAuctioncount;

	/** 
	* 店铺佣金比例查询开始值，注意佣金比例是x10000的整数.50表示0.5%
	 */
	private String startCommissionrate;

	/** 
	* 店铺掌柜信用等级起始
店铺的信用等级总共为20级 1-5:1heart-5heart;6-10:1diamond-5diamond;11-15:1crown-5crown;16-20:1goldencrown-5goldencrown
	 */
	private String startCredit;

	/** 
	* 店铺累计推广量开始值
	 */
	private String startTotalaction;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getCid() {
		return this.cid;
	}

	public void setEndAuctioncount(String endAuctioncount) {
		this.endAuctioncount = endAuctioncount;
	}
	public String getEndAuctioncount() {
		return this.endAuctioncount;
	}

	public void setEndCommissionrate(String endCommissionrate) {
		this.endCommissionrate = endCommissionrate;
	}
	public String getEndCommissionrate() {
		return this.endCommissionrate;
	}

	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}
	public String getEndCredit() {
		return this.endCredit;
	}

	public void setEndTotalaction(String endTotalaction) {
		this.endTotalaction = endTotalaction;
	}
	public String getEndTotalaction() {
		return this.endTotalaction;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKeyword() {
		return this.keyword;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOnlyMall(Boolean onlyMall) {
		this.onlyMall = onlyMall;
	}
	public Boolean getOnlyMall() {
		return this.onlyMall;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode() {
		return this.outerCode;
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

	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid() {
		return this.pid;
	}

	public void setStartAuctioncount(String startAuctioncount) {
		this.startAuctioncount = startAuctioncount;
	}
	public String getStartAuctioncount() {
		return this.startAuctioncount;
	}

	public void setStartCommissionrate(String startCommissionrate) {
		this.startCommissionrate = startCommissionrate;
	}
	public String getStartCommissionrate() {
		return this.startCommissionrate;
	}

	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}
	public String getStartCredit() {
		return this.startCredit;
	}

	public void setStartTotalaction(String startTotalaction) {
		this.startTotalaction = startTotalaction;
	}
	public String getStartTotalaction() {
		return this.startTotalaction;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.taobaoke.shops.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		txtParams.put("end_auctioncount", this.endAuctioncount);
		txtParams.put("end_commissionrate", this.endCommissionrate);
		txtParams.put("end_credit", this.endCredit);
		txtParams.put("end_totalaction", this.endTotalaction);
		txtParams.put("fields", this.fields);
		txtParams.put("keyword", this.keyword);
		txtParams.put("nick", this.nick);
		txtParams.put("only_mall", this.onlyMall);
		txtParams.put("outer_code", this.outerCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pid", this.pid);
		txtParams.put("start_auctioncount", this.startAuctioncount);
		txtParams.put("start_commissionrate", this.startCommissionrate);
		txtParams.put("start_credit", this.startCredit);
		txtParams.put("start_totalaction", this.startTotalaction);
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

	public Class<TaobaokeShopsGetResponse> getResponseClass() {
		return TaobaokeShopsGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
	}
}
