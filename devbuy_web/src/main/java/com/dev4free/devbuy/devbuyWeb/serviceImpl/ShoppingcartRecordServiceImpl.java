package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.ShoppingcartRecordMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.ShoppingcartRecordCustom;
import com.dev4free.devbuy.devbuyWeb.service.ShoppingcartRecordService;


/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:对购物车表的所有操作
 */
public class ShoppingcartRecordServiceImpl implements ShoppingcartRecordService {

	
	
	
	@Autowired 
	ShoppingcartRecordMapper shoppingcartRecordMapper;
	
	public List<ShoppingcartRecordCustom> queryAllShoppingcartRecord() {
		// TODO Auto-generated method stub
		return shoppingcartRecordMapper.queryAllShoppingcartRecord();
	}

	public ShoppingcartRecordCustom selectShoppingcartRecordCustomByPrimaryKey(String cartId) {
		// TODO Auto-generated method stub
		return shoppingcartRecordMapper.selectShoppingcartRecordCustomByPrimaryKey(cartId);
	}

	public void deleteShoppingcartRecordByIds(String[] cartIds) {
		// TODO Auto-generated method stub
		shoppingcartRecordMapper.deleteShoppingcartRecordByIds(cartIds);
	}


}
