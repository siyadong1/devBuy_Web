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

import com.alibaba.druid.util.StringUtils;
import com.dev4free.devbuy.devbuyWeb.constant.Constant;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.constant.TemplateContentRight;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.mode.ResponseMode;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
import com.dev4free.devbuy.devbuyWeb.service.BannerService;
import com.dev4free.devbuy.devbuyWeb.service.ClassificationService;
import com.dev4free.devbuy.devbuyWeb.service.ItemsService;

/**
 * 
 * @author syd
 * @date:2016年11月28日
 * @project_name:devbuy_web
 * @description:首页Banner的相关操作
 */



@Controller
@RequestMapping(value="/java/manageplatform")
public class BannerController {

	
	
	@Autowired
	BannerService bannerService;
	
	@Autowired
	ClassificationService classificationService;

	@Autowired
	ItemsService itemsService;
	
	/**
	 * 查询所有Banner的信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/queryAllBanners.action")
	public ModelAndView queryAllBanners() {
	List<BannerCustom> bannerCustoms = bannerService.queryAllBanners();
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("bannerCustoms",bannerCustoms);
	modelAndView.setViewName("html/content_1_3_1");
	return modelAndView;
	}
	
	
	
	
	/**
	 * 根据id查询自定义的banner
	 * @param bnId
	 * @return
	 */
	@RequestMapping("/selectBannerCustomById.action")
	public ModelAndView selectBannerCustomById(String bnId){
		ModelAndView modelAndView = new ModelAndView();
		BannerCustom bannerCustom = bannerService.selectBannerCustomByPrimaryKey(bnId);
		List<ClassificationCustom> classificationCustoms = classificationService.queryAllClassification();
		modelAndView.addObject("classificationCustoms", classificationCustoms);
		modelAndView.addObject(Constant.CATEGORYSELECTED, bannerCustom.getItemsCustom().getCategory());
		modelAndView.addObject("bannerCustom",bannerCustom);
		modelAndView.addObject("updateOrAdd", "update");
		modelAndView.setViewName("html/content_1_3_2");
		return modelAndView;
	}
	
	
	
	
	
	/**
	 * 查询所有的商品类型，然后跳转到新增Banner页面
	 * @return
	 */
	@RequestMapping("/selectClassificationForAddBanner.action")
	public ModelAndView selectClassificationForAddBanner(){
		ModelAndView modelAndView = new ModelAndView();
		List<ClassificationCustom> classificationCustoms = classificationService.queryAllClassification();
		modelAndView.addObject("classificationCustoms", classificationCustoms);
		modelAndView.addObject("updateOrAdd", "add");
		modelAndView.setViewName("html/content_1_3_2");
		return modelAndView;
		
	}
	
	
	
	/**
	 * 更新banner同时更新banner对应的商品
	 * @param bannerCustom
	 * @return
	 */
	@RequestMapping("/updateBannerAndUpdateItems.action")
	public @ResponseBody EntityResponse updateBannerAndUpdateItems(BannerCustom bannerCustom,String bannerOldName,ItemsCustom itemsCustom,String itemsOldName,MultipartFile bannerNewImage){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);

		
		
//		判断banner是否为空
		if (bannerCustom == null|| itemsCustom == null) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
//		判断banner名称是否已经存在
		if (StringUtils.isEmpty(bannerCustom.getBnName())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEBANNERNAMEEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEBANNERNAMEEMPTY_ERROR);
			return entityResponse;
		}
		if (!bannerCustom.getBnName().equals(bannerOldName)) {
			BannerCustom bannerCustomQueryByName = new BannerCustom();
			bannerCustomQueryByName.setBnName(bannerCustom.getBnName());
			List<BannerCustom>  bannerCustoms = bannerService.selectSelective(bannerCustomQueryByName);
			if (bannerCustoms != null && bannerCustoms.size() > 0 ) {
				entityResponse.setCode(ConstantResponse.CODE_UPDATEBANNERNAMEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEBANNERNAMEXIT_ERROR);
				return entityResponse;
			}
		}
		
//		判断商品名称是否已经存在
		
		if (itemsCustom == null) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;	
		}
		
		if (StringUtils.isEmpty(itemsCustom.getItemsname())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEITEMNAMEEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEMNAMEEMPTY_ERROR);
			return entityResponse;	
		}
		
		if (!itemsCustom.getItemsname().equals(itemsOldName)) {
			ItemsCustom itemsCustomQueryByName = new ItemsCustom();
			itemsCustomQueryByName.setItemsname(itemsCustom.getItemsname());
			List<ItemsCustom> itemsCustoms = itemsService.selectSelective(itemsCustomQueryByName);
			if (itemsCustoms != null && itemsCustoms.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_UPDATEITEMNAMEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEMNAMEEXIT_ERROR);
				return entityResponse;	
			}
				
		}

		
		
		
		
		//处理图片
		

		if (bannerNewImage != null) {
			
			//上传的商品图片的名称
			String bannerImgName = bannerNewImage.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String bannerImgNewName = simpleDateFormat.format(new Date()) + bannerImgName.substring(bannerImgName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_BANNER + bannerImgNewName);
			
			
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			bannerCustom.setBnUrl(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_BANNER + bannerImgNewName);
			try {
				bannerNewImage.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
//		更新banner同时更新商品
		
		bannerService.updateBannerAndupdateItems(bannerCustom, itemsCustom);
		entityResponse.setMessage("更新成功！");
		return entityResponse;
	}
	
	
	
	
	
	
	
	/**
	 * 新增Banner并且新增banner对于的商品
	 * @param bannerCustom
	 * @param itemsCustom
	 * @param bannerNewImage
	 * @return
	 */
	@RequestMapping("/addBannerAndAddItems.action")
	public @ResponseBody EntityResponse addBannerAndAddItems(BannerCustom bannerCustom,ItemsCustom itemsCustom,MultipartFile bannerNewImage){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
//		判断banner是否为空
		if (bannerCustom == null|| itemsCustom == null) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
//		判断banner名称是否已经存在
		if (StringUtils.isEmpty(bannerCustom.getBnName())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEBANNERNAMEEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEBANNERNAMEEMPTY_ERROR);
			return entityResponse;
		}
		BannerCustom bannerCustomQueryByName = new BannerCustom();
		bannerCustomQueryByName.setBnName(bannerCustom.getBnName());
		List<BannerCustom>  bannerCustoms = bannerService.selectSelective(bannerCustomQueryByName);
		if (bannerCustoms != null && bannerCustoms.size() > 0 ) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEBANNERNAMEEXIT_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEBANNERNAMEXIT_ERROR);
			return entityResponse;
		}
		
		
		
		
		
		
//		判断商品名称是否已经存在
		
		if (itemsCustom == null) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;	
		}
		
		if (StringUtils.isEmpty(itemsCustom.getItemsname())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEITEMNAMEEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEMNAMEEMPTY_ERROR);
			return entityResponse;	
		}
		
	
		ItemsCustom itemsCustomQueryByName = new ItemsCustom();
		itemsCustomQueryByName.setItemsname(itemsCustom.getItemsname());
		List<ItemsCustom> itemsCustoms = itemsService.selectSelectiveOnlyItems(itemsCustomQueryByName);
		if (itemsCustoms != null && itemsCustoms.size() > 0) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEITEMNAMEEXIT_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEITEMNAMEEXIT_ERROR);
			return entityResponse;	
		}
				
		

		
		//处理图片
		

		if (bannerNewImage != null) {
			
			//上传的商品图片的名称
			String bannerImgName = bannerNewImage.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String bannerImgNewName = simpleDateFormat.format(new Date()) + bannerImgName.substring(bannerImgName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_BANNER + bannerImgNewName);
			
			
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			bannerCustom.setBnUrl(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_BANNER + bannerImgNewName);
			try {
				bannerNewImage.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//添加banner并且添加banner对于的商品信息
		
		bannerService.insertBannerAndInsertItems(bannerCustom, itemsCustom);
		
		entityResponse.setMessage("添加成功！");
		return entityResponse;
	}
	
	
	
	
	
	/**
	 * 根据banner的id。批量的删除banner
	 * @param bnIds
	 */
	@RequestMapping("/deleteBannerByIds.action")
	public @ResponseBody EntityResponse deleteBannerByIds(String[] bnIds){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);

		
		if (bnIds == null || bnIds.length == 0) {
			entityResponse.setCode(ConstantResponse.CODE_DELETECLASSIFICATION_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETECLASSIFICATION_ERROR);
			return entityResponse;
		}
		bannerService.deleteBannerByIds(bnIds);
		entityResponse.setMessage("删除成功！");
		return entityResponse;
	}
	
	
	
	
}
