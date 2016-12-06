package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.AppversionCustom;

/**
 * 
 * @author syd
 * @date:2016年12月6日
 * @project_name:devbuy_web
 * @description:版本信息相关的服务
 */
public interface AppversionService {

	
	
	
	
	
	/**
	 * 查询所有的版本信息
	 * @return
	 */
	List<AppversionCustom> queryAllAppversion();
	
	
	
	/**
	 * 新增appversion的数据
	 * @param appversionCustom
	 */
	void insertSelective(AppversionCustom appversionCustom);
	
	
	
	
	/**
	 * 根据传入的非空字段筛选出appversion
	 * @param appversionCustom
	 * @return
	 */
	List<AppversionCustom> selectSelective(AppversionCustom appversionCustom);
	
	
	
	
	
	/**
	 * 跟组appversion的id批量的删除appversion
	 * @param appIds
	 */
	void deleteAppversionByIds(String[] appIds);
	
	
	
	
	
	/**
	 * 根据主键id更新appversion中传入的非空字段
	 * @param appversionCustom
	 */
	void updateAppversionSelectiveByPrimaryKey(AppversionCustom appversionCustom);
}
