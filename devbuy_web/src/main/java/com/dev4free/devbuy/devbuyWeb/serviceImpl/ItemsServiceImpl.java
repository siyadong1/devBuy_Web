package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.ItemsMapper;
import com.dev4free.devbuy.devbuyWeb.po.Items;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
import com.dev4free.devbuy.devbuyWeb.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{

	
	@Autowired
	ItemsMapper itemsMapper;
	
	public List<ItemsCustom> queryAllItems() {
		// TODO Auto-generated method stub
		return itemsMapper.selectAllItems();
	}

	public void updateItemSelect(ItemsCustom itemsCustom) {
		// TODO Auto-generated method stub
		itemsMapper.updateByPrimaryKeySelective(itemsCustom);
	}

	public ItemsCustom selectItemsByPrimaryKey(String itemsId) {
		// TODO Auto-generated method stub
		return itemsMapper.selectByPrimaryKey(itemsId);
	}

	public List<ItemsCustom> selectSelective(ItemsCustom itemsCustom) {
		// TODO Auto-generated method stub
		return itemsMapper.selectSelective(itemsCustom);
	}

	public void insertItems(Items items) {
		// TODO Auto-generated method stub
		itemsMapper.insert(items);
		
	}




}
