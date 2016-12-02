package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.mapper.OrderstatusMapper;
import com.dev4free.devbuy.devbuyWeb.po.Orderstatus;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrderStatusCustom;

/**
 * 
 * @author syd
 * @date:2016年12月1日
 * @project_name:devbuy_web
 * @description:处理订单状态的服务
 * 0待支付 1待发货 2待收货 3已完成 4已取消 5全部订单
 */
public interface  OrderStatusService {

	
	
	
	/**
	 * 查询所有的订单状态
	 * @return
	 */
	public List<OrderStatusCustom>  queryAllOrderStatus();
	
	
	
	
	
	/**
	 * 根据orderStatusCustom的非空字段筛选orderStatusCustom
	 * @param orderStatusCustom
	 * @return
	 */
	public List<OrderStatusCustom> selectSelective(OrderStatusCustom orderStatusCustom);
	
	
	
	
	
	/**
	 * 插入orderStatusCustome
	 * @param orderStatusCustom
	 */
	void insertSelective(OrderStatusCustom orderStatusCustom);
	
	
	
	
	
	/**
	 * 更新OrderStatus
	 * @param orderStatusCustom
	 */
	void updateSelective(OrderStatusCustom OrderStatusCustom);
	
		
	
	
	/**
	 * 根据OrderStatus的id批量的删除OrderStatus
	 * @param osIds
	 */
	void deleteOrderStatusByIds(String[] osIds);
	
	
}
