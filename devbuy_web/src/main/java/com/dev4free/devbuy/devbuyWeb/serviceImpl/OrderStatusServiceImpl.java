package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import com.dev4free.devbuy.devbuyWeb.mapper.OrderstatusMapper;
import com.dev4free.devbuy.devbuyWeb.po.Orderstatus;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrderStatusCustom;
import com.dev4free.devbuy.devbuyWeb.service.OrderStatusService;
import com.dev4free.devbuy.devbuyWeb.utils.TimeUtils;
import com.dev4free.devbuy.devbuyWeb.utils.UUIDUtils;


/**
 * 
 * @author syd
 * @date:2016年12月1日
 * @project_name:devbuy_web
 * @description:OrderStatusService的实现类
 */
public class OrderStatusServiceImpl implements OrderStatusService{

	
	
	
	@Autowired
	OrderstatusMapper orderstatusMapper;

	public List<OrderStatusCustom> queryAllOrderStatus() {
		// TODO Auto-generated method stub
		return orderstatusMapper.queryAllOrderStatus();
	}

	public List<OrderStatusCustom> selectSelective(OrderStatusCustom orderStatusCustom) {
		// TODO Auto-generated method stub
		return orderstatusMapper.selectSelective(orderStatusCustom);
	}

	public void insertSelective(OrderStatusCustom orderStatusCustom) {
		// TODO Auto-generated method stub
		orderStatusCustom.setOsId(UUIDUtils.getId());
		orderStatusCustom.setOsCreatetime(TimeUtils.getNow());
		orderstatusMapper.insertSelective(orderStatusCustom);
	}

	public void updateSelective(OrderStatusCustom OrderStatusCustom) {
		// TODO Auto-generated method stub
		OrderStatusCustom.setOsModifytime(TimeUtils.getNow());
		orderstatusMapper.updateByPrimaryKeySelective(OrderStatusCustom);
	}

	public void deleteOrderStatusByIds(String[] osIds) {
		// TODO Auto-generated method stub
		orderstatusMapper.deleteOrderStatusByIds(osIds);
	}


}
