package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.ShoppingcartRecordCustom;

/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:对购物车的操作
 */
public interface ShoppingcartRecordService {
	
	
	
	/**
	 * 查询所有的购物车列表项
	 * @return
	 */
	List<ShoppingcartRecordCustom> queryAllShoppingcartRecord();
	

	
	
	/**
	 * 根据主键查询自定义的购物车的详情
	 * @param shoppingcartRecordCustom
	 * @return
	 */
	ShoppingcartRecordCustom selectShoppingcartRecordCustomByPrimaryKey(String cartId);
	
	
	
	
	
	
	
	/**
	 * 根据主键id批量的删除购物车
	 * @param cartIds
	 */
	void deleteShoppingcartRecordByIds(String[] cartIds);
	
	
}
