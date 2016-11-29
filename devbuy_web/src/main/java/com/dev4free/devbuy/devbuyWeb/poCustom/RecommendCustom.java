package com.dev4free.devbuy.devbuyWeb.poCustom;

import com.dev4free.devbuy.devbuyWeb.po.Recommend;


/**
 * 对推荐栏目的自定义
 * @author syd
 * @date:2016年11月29日
 * @project_name:devbuy_web
 * @description:
 */
public class RecommendCustom extends Recommend {

	
	
	
	private ItemsCustom itemsCustom;
	
	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}
	
	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
	
	
	
}
