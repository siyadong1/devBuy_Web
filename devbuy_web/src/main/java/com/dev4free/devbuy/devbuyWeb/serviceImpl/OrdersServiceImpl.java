package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.OrdersMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrdersCustom;
import com.dev4free.devbuy.devbuyWeb.service.OrdersService;



/**
 * 
 * @author syd
 * @date:2016年12月2日
 * @project_name:devbuy_web
 * @description:
 */
public class OrdersServiceImpl implements OrdersService {

	
	
	
	@Autowired
	OrdersMapper ordersMapper;
	
	
	
	public List<OrdersCustom> queryAllOrders() {
		// TODO Auto-generated method stub
		return ordersMapper.queryAllOrders();
	}



	public OrdersCustom queryOrdersCustomByPrimary(String ordersid) {
		// TODO Auto-generated method stub
		return ordersMapper.queryOrdersCustomByPrimary(ordersid);
	}



	public void updateOrdersSelectiveByPrimaryKey(OrdersCustom ordersCustom) {
		// TODO Auto-generated method stub
		ordersMapper.updateByPrimaryKeySelective(ordersCustom);
	}



	public void deleteOrdersByIds(String[] ordersIds) {
		// TODO Auto-generated method stub
		ordersMapper.deleteOrdersByIds(ordersIds);
	}



	public List<OrdersCustom> selectSelectiveOrders(OrdersCustom ordersCustom) {
		// TODO Auto-generated method stub
		return ordersMapper.selectSelectiveOrders(ordersCustom);
	}

}
