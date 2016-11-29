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
	ItemsCustom selectItemsByPrimaryKey(String itemsId);
	
	
	
	
	
	/**
	 * 根据商品的非空字段选择商品还会关联classification这张表进行关联查询
	 */
	List<ItemsCustom> selectSelective(ItemsCustom itemsCustom);
	
	
	
	
	/**
	 * 新增商品信息
	 */
	void insertItems(Items items);
	
	
	
	
	
	/**
	 * 批量删除商品条目
	 */
	void deleteItemsByIds(String[] itemsIds);	
	
	
	
	
	/**
	 * 根据商品的非空字段选择商品,只对items这张表进行查询
	 * @param itemsCustom
	 * @return
	 */
	List<ItemsCustom> selectSelectiveOnlyItems(ItemsCustom itemsCustom);
	
}
