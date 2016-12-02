package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrderStatusCustom;
import com.dev4free.devbuy.devbuyWeb.service.OrderStatusService;

/**
 * 
 * @author syd
 * @date:2016年12月1日
 * @project_name:devbuy_web
 * @description:处理订单状态的Controller
 * 0待支付 1待发货 2待收货 3已完成 4已取消 5全部订单
 */


@Controller
@RequestMapping(value="/java/manageplatform")
public class OrderStatusController {

	
	@Autowired
	OrderStatusService orderStatusService;
	
	
	
	
	/**
	 *  查询所有的订单状态
	 * @return
	 */
	@RequestMapping("/queryAllOrderStatus.action")
	public ModelAndView queryAllOrderStatus(){
			List<OrderStatusCustom> orderStatusCustoms = orderStatusService.queryAllOrderStatus();
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("orderStatusCustoms",orderStatusCustoms);
			modelAndView.setViewName("html/content_2_6_1");
			return modelAndView;
	}
	
	
	
	
	
	
	
	

	
	
	
	/**
	 * 
	 * @param orderStatusCustom
	 * @return 新增orderStatus
	 */
	
	@RequestMapping("/addOrderStatus.action")
	public @ResponseBody EntityResponse addOrderStatus(OrderStatusCustom orderStatusCustom,Model model){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		//传入参数为空
		if (orderStatusCustom == null || StringUtils.isEmpty(orderStatusCustom.getOsName()) || StringUtils.isEmpty(orderStatusCustom.getOsCode())) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		//状态名是否已经存在
		OrderStatusCustom orderStatusCustomQueryByName = new OrderStatusCustom();
		orderStatusCustomQueryByName.setOsName(orderStatusCustom.getOsName());
		List<OrderStatusCustom> orderStatusCustomsResultByName = orderStatusService.selectSelective(orderStatusCustomQueryByName);
		
		if (orderStatusCustomsResultByName != null && orderStatusCustomsResultByName.size() > 0) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEORDERSTATUSNAMEEXIT_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEORDERSTATUSNAMEEXIT_ERROR);
			return entityResponse;
		}
		
		
		
		//状态码是否已经存在
		OrderStatusCustom orderStatusCustomQueryByCode = new OrderStatusCustom();
		orderStatusCustomQueryByCode.setOsCode(orderStatusCustom.getOsCode());
		List<OrderStatusCustom> orderStatusCustomsResultByCode = orderStatusService.selectSelective(orderStatusCustomQueryByCode);
		
		if (orderStatusCustomsResultByCode != null && orderStatusCustomsResultByCode.size() > 0) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEORDERSTATUSCODEEXIT_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEORDERSTATUSCODEEXIT_ERROR);
			return entityResponse;
		}
		
		
		//新增orderStatus
		orderStatusService.insertSelective(orderStatusCustom);
		entityResponse.setMessage("新增成功！");
		return entityResponse;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param orderStatusCustom
	 * @return 更新orderStatus
	 */
	
	@RequestMapping("/updateOrderStatus.action")
	public @ResponseBody EntityResponse updateOrderStatus(OrderStatusCustom orderStatusCustom,String osOldName,String osOldCode,Model model){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		//传入参数为空
		if (orderStatusCustom == null || StringUtils.isEmpty(orderStatusCustom.getOsName()) || StringUtils.isEmpty(orderStatusCustom.getOsCode())) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		//状态名是否已经存在
		if (!orderStatusCustom.getOsName().equals(osOldName)) {
			OrderStatusCustom orderStatusCustomQueryByName = new OrderStatusCustom();
			orderStatusCustomQueryByName.setOsName(orderStatusCustom.getOsName());
			List<OrderStatusCustom> orderStatusCustomsResultByName = orderStatusService.selectSelective(orderStatusCustomQueryByName);
			if (orderStatusCustomsResultByName != null && orderStatusCustomsResultByName.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_UPDATEORDERSTATUSNAMEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEORDERSTATUSNAMEEXIT_ERROR);
				return entityResponse;
			}
		}

		
		
		//状态码是否已经存在
		if (!orderStatusCustom.getOsCode().equals(osOldCode)) {
			OrderStatusCustom orderStatusCustomQueryByCode = new OrderStatusCustom();
			orderStatusCustomQueryByCode.setOsCode(orderStatusCustom.getOsCode());
			List<OrderStatusCustom> orderStatusCustomsResultByCode = orderStatusService.selectSelective(orderStatusCustomQueryByCode);
			
			if (orderStatusCustomsResultByCode != null && orderStatusCustomsResultByCode.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_UPDATEORDERSTATUSCODEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEORDERSTATUSCODEEXIT_ERROR);
				return entityResponse;
			}	
		}

		
		
		//更新orderStatus
		orderStatusService.updateSelective(orderStatusCustom);
		entityResponse.setMessage("更新成功！");
		return entityResponse;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 根据orderStatus的id。批量的删除orderStatus
	 * @param bnIds
	 */
	@RequestMapping("/deleteorderStatusByIds.action")
	public @ResponseBody EntityResponse deleteorderStatusByIds(String[] osIds){
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		if (osIds == null || osIds.length == 0) {
			entityResponse.setCode(ConstantResponse.CODE_DELETECLASSIFICATION_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETECLASSIFICATION_ERROR);
			return entityResponse;
		}
		orderStatusService.deleteOrderStatusByIds(osIds);
		entityResponse.setMessage("删除成功！");
		return entityResponse;
	}
	
	
	
	
	
	
	
	
	
	
}
