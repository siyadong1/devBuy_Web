package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Items;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;

public interface ItemsService {

	/**
	 * 查询所有商品条目
	 * @return
	 */
	List<ItemsCustom> queryAllItems();
	
	
	
	
	/**
	 * 根据商品的id修改商品信息
	 */
	void updateItemSelect(ItemsCustom itemsCustom);
	
	
	
	/**
	 * 根据商品的id查询商品的信息
	 */
	Items selectItemsByPrimaryKey(String itemsId);
	
	
	
	
	
	/**
	 * 根据商品的非空字段选择商品
	 */
	List<ItemsCustom> selectSelective(ItemsCustom itemsCustom);
}
