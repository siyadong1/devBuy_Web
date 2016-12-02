package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import org.aspectj.internal.lang.reflect.PointcutBasedPerClauseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.dev4free.devbuy.devbuyWeb.constant.Constant;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrderStatusCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrdersCustom;
import com.dev4free.devbuy.devbuyWeb.service.OrderStatusService;
import com.dev4free.devbuy.devbuyWeb.service.OrdersService;

/**
 * 
 * @author syd
 * @date:2016年12月2日
 * @project_name:devbuy_web
 * @description:对订单的相应操作，包括订单关联的订单详情，用户信息，收货地址等信息！
 */



@Controller
@RequestMapping(value="/java/manageplatform")
public class OrdersController {

	@Autowired
	OrdersService ordersService;
	
	@Autowired
	OrderStatusService orderStatusService;
	
	
	
	/**
	 * 查询所有的订单和订单相关联的信息
	 * @return
	 */
	@RequestMapping("/queryAllOrders")
	public ModelAndView queryAllOrders(){
		List<OrdersCustom> ordersCustoms = ordersService.queryAllOrders();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ordersCustoms",ordersCustoms);
		modelAndView.setViewName("html/content_2_1_1");
		return modelAndView;
	}
	
	
	
	
	
	
	
	/**
	 * 查询所有的订单状态，然后跳转到更新订单的页面
	 * @return
	 */
	@RequestMapping("/selectOrderStatusForUpdateOrders.action")
	public ModelAndView selectOrderStatusForUpdateOrders(String ordersId){
		ModelAndView modelAndView = new ModelAndView();
		OrdersCustom ordersCustom = ordersService.queryOrdersCustomByPrimary(ordersId);
		List<OrderStatusCustom> orderStatusCustoms = orderStatusService.queryAllOrderStatus();
		modelAndView.addObject("orderStatusCustoms", orderStatusCustoms);
		modelAndView.addObject("ordersCustom",ordersCustom);
		modelAndView.setViewName("html/orderDetail");
		return modelAndView;
	}
	
	
	
	
	
	/**
	 * 更新orders的state状态
	 * @param ordersCustom
	 * @return
	 */
	
	@RequestMapping("/updateOrdersStateByPrimaryKey")
	public @ResponseBody EntityResponse updateOrdersStateByPrimaryKey(OrdersCustom ordersCustom){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		//传入参数是否为空
		if (ordersCustom == null || StringUtils.isEmpty(ordersCustom.getOrdersId()) || StringUtils.isEmpty(ordersCustom.getState())) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		ordersService.updateOrdersSelectiveByPrimaryKey(ordersCustom);
		entityResponse.setMessage("更新成功！");
		return entityResponse;
	}
	
	
	
	
	
	
	/**
	 * 根据orders的id值批量的删除orders
	 * @param ordersIds
	 * @return
	 */
	@RequestMapping("/deleteOrdersByIds.action")
	public @ResponseBody EntityResponse deleteOrdersByIds(String[] ordersIds){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		//传入参数是否为空
		if (ordersIds == null || ordersIds.length < 1) {
			entityResponse.setCode(ConstantResponse.CODE_DELETEORDERSEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETEORDERSEMPTY_ERROR);
			return entityResponse;
		}
		
		ordersService.deleteOrdersByIds(ordersIds);
		entityResponse.setMessage("删除成功！");
		return entityResponse;
		
	}
	
	
	
	
	
	
	
	/**
	 * 根根据orders的非空字段对state进行查询
	 * @return
	 */
	@RequestMapping("/selectSelectiveOrders.action")
	public ModelAndView selectSelectiveOrders(OrdersCustom ordersCustom){
		
		List<OrdersCustom> ordersCustoms = ordersService.selectSelectiveOrders(ordersCustom);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ordersCustoms",ordersCustoms);
		
		if (ordersCustom.getState().equals(Constant.ORDERS_STATE_WAIT_FOR_PAYMENT)) {
			modelAndView.setViewName("html/content_2_2_1");
		}else if (ordersCustom.getState().equals(Constant.ORDERS_STATE_WAIT_FOR_SHIPMENT)){
			modelAndView.setViewName("html/content_2_3_1");
		}else if (ordersCustom.getState().equals(Constant.ORDERS_STATE_WAIT_FOR_RECEIVING)){
			modelAndView.setViewName("html/content_2_4_1");
		}else if (ordersCustom.getState().equals(Constant.ORDERS_STATE_CANCELED)){
			modelAndView.setViewName("html/content_2_5_1");
		}
		
		
		return modelAndView;
	}
	
	
	
	
}
