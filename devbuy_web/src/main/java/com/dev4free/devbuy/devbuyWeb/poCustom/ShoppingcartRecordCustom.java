package com.dev4free.devbuy.devbuyWeb.poCustom;

import com.dev4free.devbuy.devbuyWeb.po.ShoppingcartRecord;


/**
 * 
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:自定义的购物车
 */
public class ShoppingcartRecordCustom extends ShoppingcartRecord {

	
	
	
	UserCustom userCustom;
	ItemsCustom itemsCustom;
	public UserCustom getUserCustom() {
		return userCustom;
	}
	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}
	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
	
	
	
	
	
	
}
