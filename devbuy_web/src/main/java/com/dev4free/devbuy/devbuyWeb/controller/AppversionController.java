package com.dev4free.devbuy.devbuyWeb.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
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
import com.dev4free.devbuy.devbuyWeb.poCustom.AppversionCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.service.AppversionService;
import com.dev4free.devbuy.devbuyWeb.utils.TimeUtils;
import com.dev4free.devbuy.devbuyWeb.utils.UUIDUtils;

/**
 * 
 * @author syd
 * @date:2016年12月6日
 * @project_name:devbuy_web
 * @description:关于版本信息的controller
 */


@Controller
@RequestMapping(value="/java/manageplatform")
public class AppversionController {

	
	@Autowired
	AppversionService appversionService;
	
	
	@RequestMapping("/queryAllAppversion.action")
	public ModelAndView queryAllAppversion(){
		List<AppversionCustom> appversionCustoms = appversionService.queryAllAppversion();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("appversionCustoms",appversionCustoms);
		modelAndView.setViewName("html/content_6_2_1");
		return modelAndView;
	}
	
	
	
	
	/**
	 * 
	 * @param appversionCustom
	 * @param appversionFile
	 * @return
	 */
	@RequestMapping("/insertAppversionSelective.action")
	public @ResponseBody EntityResponse insertAppversionSelective(AppversionCustom appversionCustom,MultipartFile appversionFile){
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		//检测非空参数
		if (appversionCustom == null || appversionFile == null 
				|| StringUtils.isEmpty(appversionCustom.getAppversionName()) || StringUtils.isEmpty(appversionCustom.getAppversionVersionCode()) 
				|| StringUtils.isEmpty(appversionCustom.getAppversionVersionName())) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		//检测版本名称是否存在
		AppversionCustom appversionCustomSelect = new AppversionCustom();
		appversionCustomSelect.setAppversionName(appversionCustom.getAppversionName());
		List<AppversionCustom> appversionCustoms = appversionService.selectSelective(appversionCustomSelect);
		if (appversionCustoms != null && appversionCustoms.size() > 0) {
			entityResponse.setCode(ConstantResponse.CODE_ADDAPPVERSIONNAME_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_ADDAPPVERSIONNAME_ERROR);
			return entityResponse;
		}
		//检测版本名是否存在
		appversionCustomSelect = new AppversionCustom();
		appversionCustomSelect.setAppversionVersionName(appversionCustom.getAppversionVersionName());
		appversionCustoms = appversionService.selectSelective(appversionCustomSelect);
		if (appversionCustoms != null && appversionCustoms.size() > 0) {
			entityResponse.setCode(ConstantResponse.CODE_ADDAPPVERSIONVERSIONNAME_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_ADDAPPVERSIONVERSIONNAME_ERROR);
			return entityResponse;
		}
		//检测版本号是否存在
		appversionCustomSelect = new AppversionCustom();
		appversionCustomSelect.setAppversionVersionCode(appversionCustom.getAppversionVersionCode());
		appversionCustoms = appversionService.selectSelective(appversionCustomSelect);
		if (appversionCustoms != null && appversionCustoms.size() > 0) {
			entityResponse.setCode(ConstantResponse.CODE_ADDAPPVERSIONVERSIONCODE_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_ADDAPPVERSIONVERSIONCODE_ERROR);
			return entityResponse;
		}
		//处理上传的文件
		if (appversionFile != null) {
			//上传的商品图片的名称
			String appFileName = appversionFile.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String appFileNewName = "devBuy_" + simpleDateFormat.format(new Date()) + "_vn" + appversionCustom.getAppversionVersionName() + "_vc" + appversionCustom.getAppversionVersionCode() + appFileName.substring(appFileName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_APPVERSION + appFileNewName);
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			appversionCustom.setAppversionUrl(Constant.IMAGE_ROOT_MAPPING_PATH_WEB + Constant.IMAGE_APPVERSION + appFileNewName);
			try {
				appversionFile.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		appversionCustom.setAppversionId(UUIDUtils.getId());
		appversionCustom.setAppversionCreatetime(TimeUtils.getNow());
		appversionService.insertSelective(appversionCustom);
		entityResponse.setMessage("新增成功！");
		return entityResponse;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param appversionCustom
	 * @param appversionFile
	 * @param oldAppversionName
	 * @param oldAppversionVersionName
	 * @param oldAppversionVersionCode
	 * @return 根据主键更新appversion这张表
	 */
	@RequestMapping("/updateAppversionSelectiveByPrimaryKey.action")
	public @ResponseBody EntityResponse updateAppversionSelectiveByPrimaryKey(AppversionCustom appversionCustom,MultipartFile appversionFile
			,String oldAppversionName,String oldAppversionVersionName,String oldAppversionVersionCode){
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
		
		
		//检测非空参数
		if (appversionCustom == null 
				|| StringUtils.isEmpty(appversionCustom.getAppversionName()) 
				|| StringUtils.isEmpty(appversionCustom.getAppversionVersionCode()) 
				|| StringUtils.isEmpty(appversionCustom.getAppversionVersionName())
				|| StringUtils.isEmpty(oldAppversionName)
				|| StringUtils.isEmpty(oldAppversionVersionCode)
				|| StringUtils.isEmpty(oldAppversionVersionName)
				) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		
		AppversionCustom appversionCustomSelect = new AppversionCustom();
		List<AppversionCustom> appversionCustoms;
		
		
		//检测版本名称是否存在
		if (!oldAppversionName.equals(appversionCustom.getAppversionName())) {
			appversionCustomSelect.setAppversionName(appversionCustom.getAppversionName());
			appversionCustoms = appversionService.selectSelective(appversionCustomSelect);
			if (appversionCustoms != null && appversionCustoms.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_ADDAPPVERSIONNAME_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_ADDAPPVERSIONNAME_ERROR);
				return entityResponse;
			}	
		}

		//检测版本名是否存在
		if (!oldAppversionVersionName.equals(appversionCustom.getAppversionVersionName())) {
			appversionCustomSelect = new AppversionCustom();
			appversionCustomSelect.setAppversionVersionName(appversionCustom.getAppversionVersionName());
		    appversionCustoms = appversionService.selectSelective(appversionCustomSelect);
			if (appversionCustoms != null && appversionCustoms.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_ADDAPPVERSIONVERSIONNAME_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_ADDAPPVERSIONVERSIONNAME_ERROR);
				return entityResponse;
			}	
		}

		//检测版本号是否存在
		if (!oldAppversionVersionCode.equals(appversionCustom.getAppversionVersionCode())) {
			appversionCustomSelect = new AppversionCustom();
			appversionCustomSelect.setAppversionVersionCode(appversionCustom.getAppversionVersionCode());
		    appversionCustoms = appversionService.selectSelective(appversionCustomSelect);
			if (appversionCustoms != null && appversionCustoms.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_ADDAPPVERSIONVERSIONCODE_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_ADDAPPVERSIONVERSIONCODE_ERROR);
				return entityResponse;
			}
		}

		
		
		//处理上传的文件
		if (appversionFile != null) {
			//上传的商品图片的名称
			String appFileName = appversionFile.getOriginalFilename();
			//存入数据库中头像的名称
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String appFileNewName = "devBuy_" + simpleDateFormat.format(new Date()) + "_vn" + appversionCustom.getAppversionVersionName() + "_vc" + appversionCustom.getAppversionVersionCode() + appFileName.substring(appFileName.lastIndexOf("."));
			//上传头像的路径。这里将图片存储在本地服务器  /usr/local/images/avatar/
			File uploadFile = new File(Constant.IMAGE_ROOT_REAL_PATH_WEB + Constant.IMAGE_APPVERSION + appFileNewName);
			if (!uploadFile.exists()) {
				uploadFile.mkdirs();
			}
			appversionCustom.setAppversionUrl(Constant.IMAGE_ROOT_MAPPING_PATH_WEB + Constant.IMAGE_APPVERSION + appFileNewName);
			try {
				appversionFile.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		appversionCustom.setAppversionModifytime(TimeUtils.getNow());
		appversionService.updateAppversionSelectiveByPrimaryKey(appversionCustom);
		entityResponse.setMessage("更新成功！");
		return entityResponse;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 根据appversion的id。批量的删除appversion
	 * @param appIds
	 */
	@RequestMapping("/deleteAppversionByIds.action")
	public @ResponseBody EntityResponse deleteAppversionByIds(String[] appIds){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);

		
		if (appIds == null || appIds.length == 0) {
			entityResponse.setCode(ConstantResponse.CODE_DELETECLASSIFICATION_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETECLASSIFICATION_ERROR);
			return entityResponse;
		}
		appversionService.deleteAppversionByIds(appIds);
		entityResponse.setMessage("删除成功！");
		return entityResponse;
	}
	
	
	
	
	
	
	
	
	
}
