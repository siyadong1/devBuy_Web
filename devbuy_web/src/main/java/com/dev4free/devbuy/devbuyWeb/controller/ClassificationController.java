package com.dev4free.devbuy.devbuyWeb.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dev4free.devbuy.devbuyWeb.constant.Constant;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;
import com.dev4free.devbuy.devbuyWeb.service.ClassificationService;
import com.dev4free.devbuy.devbuyWeb.utils.StringUtils;
import com.dev4free.devbuy.devbuyWeb.utils.TimeUtils;
import com.dev4free.devbuy.devbuyWeb.utils.UUIDUtils;

/**
 * 商品分类的Controller
 * @author syd
 * @date:2016年11月22日
 * @project_name:devbuy_web
 * @description:
 */



@Controller
@RequestMapping("/java/manageplatform")
public class ClassificationController {

	
	@Autowired
	ClassificationService classificationService;
	
	//LOGGER用于打印日志，一般在调试的时候打印DEBUG级别的日志
	private static final Logger LOGGER = Logger.getLogger(ClassificationController.class);
	
	/**
	 * 查询所有的商品类别
	 * @return
	 */
	@RequestMapping("/queryAllClassification.action")
	public ModelAndView queryAllClassification(){
		
		
		
		List<ClassificationCustom> classificationCustoms =  classificationService.queryAllClassification();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("classificationCustoms",classificationCustoms);
		modelAndView.setViewName("html/content_1_1_1");
		return modelAndView;
	}
	
	
	
	/**
	 * 根据id删除指定商品
	 * @param cfid
	 * @return
	 */
	@RequestMapping("/deleteClassification.action")
	public String deleteClassification(String cfId){
			classificationService.deleteClassificationById(cfId);
		return "html/content_1_1_1";
	}
	
	
	
	/**
	 * 根据id更新商品
	 * @param cfId
	 * @return
	 */
	@RequestMapping("/updateClassificationById.action")
	public @ResponseBody EntityResponse updateClassificationById(ClassificationCustom classificationCustom,MultipartFile cfUrlFile){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_ADDCLASSIFICATION_ERROR,ConstantResponse.COTENT_ADDCLASSIFICATION_ERROR);

		
		if (classificationCustom == null) {
			return entityResponse;
		}
		
		
		if (cfUrlFile != null) {
			
			//上传的头像的名称
			String classificationName = cfUrlFile.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String classificationNameNewName = simpleDateFormat.format(new Date()) + classificationName.substring(classificationName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_CLASSIFICATION + classificationNameNewName);
			
			
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			classificationCustom.setCfUrl(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_CLASSIFICATION + classificationNameNewName);
			try {
				cfUrlFile.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		classificationService.updateClassificationById(classificationCustom);
		entityResponse.setCode(ConstantResponse.CODE_NORMAL);
		entityResponse.setMessage(ConstantResponse.CONTENT_NORMAL);
		return entityResponse;
	}
	
	
	
	/**
	 * 新增商品的分类
	 * @param classificationCustom
	 * @param cfUrlFile
	 */
	@RequestMapping("/addClassification.action")
	public @ResponseBody EntityResponse addClassification(ClassificationCustom classificationCustom,MultipartFile cfUrlFile){
		
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_ADDCLASSIFICATION_ERROR,ConstantResponse.COTENT_ADDCLASSIFICATION_ERROR);
		

		if (classificationCustom != null && cfUrlFile != null  &&  !StringUtils.isEmpty(classificationCustom.getCfName())  &&  !StringUtils.isEmpty(classificationCustom.getCfDes()) ) {
			
			
			//判断商品类型名称是否已经存在
			ClassificationCustom classificationQuery = new ClassificationCustom();
			classificationQuery.setCfName(classificationCustom.getCfName());
			List<ClassificationCustom> classificationSelect =  classificationService.selectSelective(classificationCustom);	
			
			if (classificationSelect != null && classificationSelect.size() > 0) {
				
				entityResponse.setCode(ConstantResponse.CODE_ADDCLASSIFICATION_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_ADDCLASSIFICATION_EXIT);
				return entityResponse;
			}
			
			
			
			
			classificationCustom.setCfId(UUIDUtils.getId());
			classificationCustom.setCfCreatetime(TimeUtils.getNow());
			classificationCustom.setCategory(UUIDUtils.getId());
			//上传的头像的名称
			String classificationName = cfUrlFile.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String classificationNameNewName = simpleDateFormat.format(new Date()) + classificationName.substring(classificationName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_CLASSIFICATION + classificationNameNewName);
			
			
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			classificationCustom.setCfUrl(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_CLASSIFICATION + classificationNameNewName);
			try {
				cfUrlFile.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			classificationCustom.setCfUrl(uploadFile.toString());
			classificationService.insertSelective(classificationCustom);
			entityResponse.setCode(ConstantResponse.CODE_NORMAL);
			entityResponse.setMessage(ConstantResponse.CONTENT_NORMAL);
			return entityResponse;
		}else {
			
			return entityResponse;
		}
		
		
	}
	
	
	
	
	

	/**
	 * 根据id批量删除商品
	 * @param cfId
	 * @return
	 */
	@RequestMapping("/deleteClassificationByIds.action")
	public @ResponseBody EntityResponse deleteClassificationByIds(String[] cfIds){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);

		
		if (cfIds == null || cfIds.length == 0) {
			entityResponse.setCode(ConstantResponse.CODE_DELETECLASSIFICATION_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETECLASSIFICATION_ERROR);
			return entityResponse;
		}
		classificationService.deleteClassificationByIds(cfIds);
		return entityResponse;
	}
	
	
	
	
	
}
