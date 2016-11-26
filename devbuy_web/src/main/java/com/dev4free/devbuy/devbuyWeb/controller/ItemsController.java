package com.dev4free.devbuy.devbuyWeb.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dev4free.devbuy.devbuyWeb.constant.Constant;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.constant.TemplateContentRight;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
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
	public ModelAndView queryAllItems() {
	List<ItemsCustom> itemsCustoms = itemsService.queryAllItems();
	List<ClassificationCustom> classificationCustoms = classificatonService.queryAllClassification();
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject(Constant.CATEGORYSELECTED, "10");
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
		List<ClassificationCustom> classificationCustoms = classificatonService.queryAllClassification();
		ItemsCustom items = itemsService.selectItemsByPrimaryKey(itemsId);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(Constant.CATEGORYSELECTED, items.getCategory());
		modelAndView.addObject("items",items);
		modelAndView.addObject("classificationCustoms", classificationCustoms);
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
		modelAndView.addObject(Constant.CATEGORYSELECTED, itemsCustom.getCategory());
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
	public @ResponseBody EntityResponse updateItemByItemId(ItemsCustom itemsCustom, String oldName,MultipartFile itemsNewImage){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		//是否选择了更新的商品
		if (itemsCustom == null || StringUtils.isEmpty(itemsCustom.getItemsId())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEITEM_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEM_ERROR);
			return entityResponse;
		}
		
		//商品更新的名称是否为空
		
		if (StringUtils.isEmpty(itemsCustom.getItemsname())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEITEMNAMEEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEMNAMEEMPTY_ERROR);
			return entityResponse;
		}
		
		//商品更新的名称是否已经存在
		if (!oldName.equals(itemsCustom.getItemsname())) {
			ItemsCustom itemsCustomOnlyName = new ItemsCustom();
			itemsCustomOnlyName.setItemsname(itemsCustom.getItemsname());
			List<ItemsCustom> customs = itemsService.selectSelective(itemsCustomOnlyName);
			if (customs != null && customs.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_UPDATEITEMNAMEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEMNAMEEXIT_ERROR);
				return entityResponse;
			}	
		}

		
		
		
		if (itemsNewImage != null) {
			
			//上传的商品图片的名称
			String classificationName = itemsNewImage.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String itemsNameNewName = simpleDateFormat.format(new Date()) + classificationName.substring(classificationName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_ITEMS + itemsNameNewName);
			
			
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			itemsCustom.setImage(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_ITEMS + itemsNameNewName);
			try {
				itemsNewImage.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		itemsService.updateItemSelect(itemsCustom);
		return entityResponse;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
