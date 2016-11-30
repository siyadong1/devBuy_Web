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
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.RecommendCustom;
import com.dev4free.devbuy.devbuyWeb.service.ClassificationService;
import com.dev4free.devbuy.devbuyWeb.service.ItemsService;
import com.dev4free.devbuy.devbuyWeb.service.RecommendService;

/**
 * 
 * @author syd
 * @date:2016年11月29日
 * @project_name:devbuy_web
 * @description:首页的推荐条目
 */





@Controller
@RequestMapping(value="/java/manageplatform")
public class RecommendController {

	
	
	@Autowired
	RecommendService recommendService;
	@Autowired
	ClassificationService classificationService;
	@Autowired
	ItemsService itemsService;
	
	/**
	 * 查询所有Recommend的信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/queryAllRecommend.action")
	public ModelAndView queryAllRecommend() {
	List<RecommendCustom> recommendCustoms = recommendService.queryAllRecommend();
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("recommendCustoms",recommendCustoms);
	modelAndView.setViewName("html/content_1_5_1");
	return modelAndView;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * 根据id查询自定义的Recommend
	 * @param rmId
	 * @return
	 */
	@RequestMapping("/selectRecommendCustomById.action")
	public ModelAndView selectRecommendCustomById(String rcId){
		ModelAndView modelAndView = new ModelAndView();
		RecommendCustom recommendCustom = recommendService.selectRecommendCustomByPrimaryKey(rcId);
		List<RecommendCustom> recommendCustoms = recommendService.queryAllRecommend();
		List<ClassificationCustom> classificationCustoms = classificationService.queryAllClassification();
		modelAndView.addObject("classificationCustoms", classificationCustoms);
		modelAndView.addObject(Constant.CATEGORYSELECTED, recommendCustom.getItemsCustom().getCategory());
		modelAndView.addObject("recommendCustom",recommendCustom);
		modelAndView.addObject("recommendCustoms",recommendCustoms);
		modelAndView.addObject("updateOrAdd", "update");
		modelAndView.setViewName("html/content_1_5_2");
		return modelAndView;
	}
	
		
	
	
	
	
	
	/**
	 * 查询所有的商品类型，然后跳转到新增Recommend页面
	 * @return
	 */
	@RequestMapping("/selectClassificationForAddRecommend.action")
	public ModelAndView selectClassificationForAddRecommend(){
		ModelAndView modelAndView = new ModelAndView();
		List<ClassificationCustom> classificationCustoms = classificationService.queryAllClassification();
		modelAndView.addObject("classificationCustoms", classificationCustoms);
		modelAndView.addObject("updateOrAdd", "add");
		modelAndView.setViewName("html/content_1_5_2");
		return modelAndView;
		
	}
	
	
	
	/**
	 * 更新Recommend同时更新Recommend对应的商品
	 * @param recommendCustom
	 * @param recommendOldName
	 * @param itemsCustom
	 * @param itemsOldName
	 * @param recommendNewImage
	 * @return
	 */
	@RequestMapping("/updateRecommendAndUpdateItems.action")
	public @ResponseBody EntityResponse updateRecommendAndUpdateItems(RecommendCustom recommendCustom,String recommendOldName,ItemsCustom itemsCustom,String itemsOldName,MultipartFile recommendNewImage){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		
		
		
		
//		判断recommend是否为空
		if (recommendCustom == null || itemsCustom == null) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		
		
		
		
//		判断推荐类别是否为空
		if (StringUtils.isEmpty(recommendCustom.getRcCategory())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATERECOMMENDCATEGORYEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATERECOMMENDCATEGORYEMPTY_ERROR);
			return entityResponse;
		}
		
		
		
//		判断推荐名称是否已经存在
		if (StringUtils.isEmpty(recommendCustom.getRcName())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATERECOMMENDNAMEEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATERECOMMENDNAMEEMPTY_ERROR);
			return entityResponse;
		}
		
		

		if (!recommendCustom.getRcName().equals(recommendOldName)) {
			RecommendCustom recommendCustomQueryByName = new RecommendCustom();
			recommendCustomQueryByName.setRcName(recommendCustom.getRcName());
			List<RecommendCustom>  recommendCustoms = recommendService.selectSelective(recommendCustomQueryByName);
			if (recommendCustoms != null && recommendCustoms.size() > 0 ) {
				entityResponse.setCode(ConstantResponse.CODE_UPDATERECOMMENDNAMEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_UPDATERECOMMENDNAMEXIT_ERROR);
				return entityResponse;
			}
		}
		
//		判断商品名称是否已经存在
		
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
		

		if (recommendNewImage != null) {
			
			//上传的商品图片的名称
			String recommendImgName = recommendNewImage.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String recommendImgNewName = simpleDateFormat.format(new Date()) + recommendImgName.substring(recommendImgName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_RECOMMEND + recommendImgNewName);
			
			
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			recommendCustom.setRcUrl(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_RECOMMEND + recommendImgNewName);
			try {
				recommendNewImage.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
//		更新banner同时更新商品
		
		recommendService.updateRecommenAndupdateItems(recommendCustom, itemsCustom);
		entityResponse.setMessage("更新成功！");
		return entityResponse;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 添加Recommend同时添加Recommend对应的商品
	 * @param recommendCustom
	 * @param recommendOldName
	 * @param itemsCustom
	 * @param itemsOldName
	 * @param recommendNewImage
	 * @return
	 */
	@RequestMapping("/addRecommendAndAddItems.action")
	public @ResponseBody EntityResponse addRecommendAndAddItems(RecommendCustom recommendCustom,String recommendOldName,ItemsCustom itemsCustom,String itemsOldName,MultipartFile recommendNewImage){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		
		
		
		
//		判断recommend是否为空
		if (recommendCustom == null || itemsCustom == null) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		
		
		
		
//		判断推荐类别是否为空
		if (StringUtils.isEmpty(recommendCustom.getRcCategory())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATERECOMMENDCATEGORYEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATERECOMMENDCATEGORYEMPTY_ERROR);
			return entityResponse;
		}
		
		
		
//		判断推荐名称是否已经存在
		if (StringUtils.isEmpty(recommendCustom.getRcName())) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATERECOMMENDNAMEEMPTY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATERECOMMENDNAMEEMPTY_ERROR);
			return entityResponse;
		}
		
		

		if (!recommendCustom.getRcName().equals(recommendOldName)) {
			RecommendCustom recommendCustomQueryByName = new RecommendCustom();
			recommendCustomQueryByName.setRcName(recommendCustom.getRcName());
			List<RecommendCustom>  recommendCustoms = recommendService.selectSelective(recommendCustomQueryByName);
			if (recommendCustoms != null && recommendCustoms.size() > 0 ) {
				entityResponse.setCode(ConstantResponse.CODE_UPDATERECOMMENDNAMEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_UPDATERECOMMENDNAMEXIT_ERROR);
				return entityResponse;
			}
		}
		
//		判断商品名称是否已经存在
		
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
		

		if (recommendNewImage != null) {
			
			//上传的商品图片的名称
			String recommendImgName = recommendNewImage.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String recommendImgNewName = simpleDateFormat.format(new Date()) + recommendImgName.substring(recommendImgName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_RECOMMEND + recommendImgNewName);
			
			
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			recommendCustom.setRcUrl(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_RECOMMEND + recommendImgNewName);
			try {
				recommendNewImage.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
//		更新banner同时更新商品
		
		recommendService.insertRecommendAndInsertItems(recommendCustom, itemsCustom);
		entityResponse.setMessage("添加成功！");
		return entityResponse;
		
	}
	
	
	
	
	
	
	/**
	 * 根据recommend的id。批量的删除recommend
	 * @param rcIds
	 */
	@RequestMapping("/deleteRecommendByIds.action")
	public @ResponseBody EntityResponse deleteRecommendByIds(String[] rcIds){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);

		
		if (rcIds == null || rcIds.length == 0) {
			entityResponse.setCode(ConstantResponse.CODE_DELETECLASSIFICATION_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETECLASSIFICATION_ERROR);
			return entityResponse;
		}
		recommendService.deleteRecommendByIds(rcIds);
		entityResponse.setMessage("删除成功！");
		return entityResponse;
	}
	
	
	
	
	
	
}
