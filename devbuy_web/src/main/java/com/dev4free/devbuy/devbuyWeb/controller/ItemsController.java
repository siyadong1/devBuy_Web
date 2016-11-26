package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.constant.TemplateContentRight;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.po.Items;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
import com.dev4free.devbuy.devbuyWeb.service.ClassificationService;
import com.dev4free.devbuy.devbuyWeb.service.ItemsService;
import com.dev4free.devbuy.devbuyWeb.utils.StringUtils;

/**
 * 
 * @author syd
 * @date:2016年11月18日
 * @project_name:devbuy_web
 * @description:关于商品相关的操作
 */

@Controller
@RequestMapping(value="/java/manageplatform")
public class ItemsController {
	
	
	@Autowired
	ItemsService itemsService;
	@Autowired
	ClassificationService classificatonService;
	
	/**
	 * 查询所有商品的信息
	 * @param httpSession
	 * @return
	 */
	@RequestMapping("/queryAllItems.action")
	public ModelAndView queryAllItems(HttpSession httpSession) {
	List<ItemsCustom> itemsCustoms = itemsService.queryAllItems();
	List<ClassificationCustom> classificationCustoms = classificatonService.queryAllClassification();
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("itemsCustoms",itemsCustoms);
	modelAndView.addObject("classificationCustoms",classificationCustoms);
	modelAndView.addObject("templateContentRight",TemplateContentRight.content_1_2_1);
	modelAndView.setViewName("html/content_1_2_1");
	return modelAndView;
	}
	

	
	
	
	/**
	 * 根据id查询商品信息
	 * @param itemsId
	 * @return
	 */
	@RequestMapping("/selectItemByItemId.action")
	public ModelAndView  selectItemByItemId(String itemsId){
		Items items = itemsService.selectItemsByPrimaryKey(itemsId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("items",items);
		modelAndView.setViewName("html/content_1_2_2");
		return modelAndView;
	}
	
	
	
	
	
	/**
	 * 根据ItemsCustom中的非空字段查询商品信息
	 * @param itemsCustom
	 * @return
	 */
	@RequestMapping("/selectItemSelective.action")
	public ModelAndView  selectItemByItemId(ItemsCustom itemsCustom){
		List<ItemsCustom> itemsCustoms;
		if (itemsCustom.getCategory().equals("10")) {
			 itemsCustoms = itemsService.queryAllItems();
		}else {
			 itemsCustoms = itemsService.selectSelective(itemsCustom);
		}
		List<ClassificationCustom> classificationCustoms = classificatonService.queryAllClassification();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsCustoms",itemsCustoms);
		modelAndView.addObject("classificationCustoms",classificationCustoms);
		modelAndView.addObject("templateContentRight",TemplateContentRight.content_1_2_1);
		modelAndView.setViewName("html/content_1_2_1");
		
		return modelAndView;
	}
	
		
	
	
	
	
	/**
	 * 根据id修改商品信息
	 * @param itemsId
	 * @return
	 */
	@RequestMapping("/updateItemByItemId.action")
	public @ResponseBody EntityResponse updateItemByItemId(ItemsCustom itemsCustom){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		if (itemsCustom == null) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEITEM_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEM_ERROR);
			return entityResponse;
		}
		itemsService.updateItemSelect(itemsCustom);
		return entityResponse;
	}
	
	
	
	
	
	
}
