package com.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ItemCat;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.itemcats.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemcatsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6713569333655953331L;

	/** 
	 * 增量类目信息,根据fields传入的参数返回相应的结果
	 */
	@ApiListField("item_cats")
	@ApiField("item_cat")
	private List<ItemCat> itemCats;

	/** 
	 * 最近修改时间(如果取增量，会返回该字段)。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("last_modified")
	private Date lastModified;

	public void setItemCats(List<ItemCat> itemCats) {
		this.itemCats = itemCats;
	}
	public List<ItemCat> getItemCats( ) {
		return this.itemCats;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	public Date getLastModified( ) {
		return this.lastModified;
	}

}
