package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev4free.devbuy.devbuyWeb.constant.TemplateContentRight;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
import com.dev4free.devbuy.devbuyWeb.service.ItemsService;

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
	
	
	
	@RequestMapping("/queryAllItems.action")
	public ModelAndView queryAllItems(HttpSession httpSession) {
	List<ItemsCustom> itemsCustoms = itemsService.queryAllItems();
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("itemsCustoms",itemsCustoms);
	modelAndView.addObject("templateContentRight",TemplateContentRight.content_1_2_1);
	
	
	
	modelAndView.setViewName("home");
	return modelAndView;
	}
	

}
