package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.OrdersCustom;

/**
 * 
 * @author syd
 * @date:2016年12月2日
 * @project_name:devbuy_web
 * @description:
 */
public interface OrdersService {

	
	
	
	/**
	 * 查询所有的订单并且关联查询订单对于的用户，收货地址，商品详情信息！
	 * @return
	 */
	List<OrdersCustom> queryAllOrders();
	
	
	
	
	
	/**
	 * 根据ordercustom的主键查询自定义的ordercustom
	 * @param osId
	 * @return
	 */
	OrdersCustom queryOrdersCustomByPrimary(String ordersid);
	
	
	
	
	
	
	/**
	 * 根据primaryKey更新orders订单的state状态
	 * @param ordersCustom
	 */
	void updateOrdersSelectiveByPrimaryKey(OrdersCustom ordersCustom);
	
	
	
	/**
	 * 根据orders的id值批量的删除orders
	 * @param ordersIds
	 */
	void deleteOrdersByIds(String[] ordersIds);
	
	
	
	
	/**
	 * 根据orders的非空字段对state进行查询
	 * @param ordersCustom
	 * @return
	 */
	List<OrdersCustom> selectSelectiveOrders(OrdersCustom ordersCustom);
	
	
	
}
