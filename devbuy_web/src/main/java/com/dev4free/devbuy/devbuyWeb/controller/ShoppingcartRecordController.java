package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ShoppingcartRecordCustom;
import com.dev4free.devbuy.devbuyWeb.service.ShoppingcartRecordService;

/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:对购物车的所有条目的操作
 */

@Controller
@RequestMapping(value="/java/manageplatform")
public class ShoppingcartRecordController {

	
	
	
	@Autowired
	ShoppingcartRecordService shoppingcartRecordService;
	
	
	
	
	@RequestMapping("/queryAllShoppingcartRecord.action")
	public ModelAndView queryAllShoppingcartRecord(){
		    List<ShoppingcartRecordCustom> shoppingcartRecordCustoms = shoppingcartRecordService.queryAllShoppingcartRecord();
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("shoppingcartRecordCustoms",shoppingcartRecordCustoms);
			modelAndView.setViewName("html/content_3_1_1");
			return modelAndView;
	}
	
	
	
	/**
	 * 根据主键id查询对于的购物车详情
	 * @param cartId
	 * @return
	 */
	@RequestMapping("/selectShoppingcartRecordCustomByPrimaryKey.action")
	public ModelAndView selectShoppingcartRecordCustomByPrimaryKey(String cartId){
		ShoppingcartRecordCustom shoppingcartRecordCustoms = shoppingcartRecordService.selectShoppingcartRecordCustomByPrimaryKey(cartId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("shoppingcartRecordCustoms",shoppingcartRecordCustoms);
		modelAndView.setViewName("html/shoppingCarDetail");
		return modelAndView;
	}
	
	
	
	
	/**
	 * 根据shoppingcartRecord的id。批量的删除shoppingcartRecord
	 * @param cartIds
	 */
	@RequestMapping("/deleteshoppingcartRecordByIds.action")
	public @ResponseBody EntityResponse deleteshoppingcartRecordByIds(String[] cartIds){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		if (cartIds == null || cartIds.length == 0) {
			entityResponse.setCode(ConstantResponse.CODE_DELETECLASSIFICATION_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETECLASSIFICATION_ERROR);
			return entityResponse;
		}
		shoppingcartRecordService.deleteShoppingcartRecordByIds(cartIds);
		entityResponse.setMessage("删除成功！");
		return entityResponse;
	}
	
	
	
	
}
