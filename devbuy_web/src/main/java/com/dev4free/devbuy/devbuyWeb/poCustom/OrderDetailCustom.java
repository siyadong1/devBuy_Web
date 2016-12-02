package com.dev4free.devbuy.devbuyWeb.poCustom;

import com.dev4free.devbuy.devbuyWeb.po.Orderdetail;


/**
 * 
 * @author syd
 * @date:2016年12月2日
 * @project_name:devbuy_web
 * @description:自定义的Orderdetail
 */
public class OrderDetailCustom extends Orderdetail {

	
	private ItemsCustom itemsCustom;

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

	
	
}
