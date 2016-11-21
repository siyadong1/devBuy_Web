package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;

public interface ItemsService {

	/**
	 * 查询所有商品条目
	 * @return
	 */
	List<ItemsCustom> queryAllItems();
	
}
