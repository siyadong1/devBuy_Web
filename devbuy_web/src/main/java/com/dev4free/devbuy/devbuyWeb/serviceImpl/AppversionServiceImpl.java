package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.AppversionMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.AppversionCustom;
import com.dev4free.devbuy.devbuyWeb.service.AppversionService;


/**
 * 
 * @author syd
 * @date:2016年12月6日
 * @project_name:devbuy_web
 * @description:appVersion的实现类
 */
public class AppversionServiceImpl implements AppversionService {

	
	@Autowired
	AppversionMapper appversionMapper;
	
	
	public List<AppversionCustom> queryAllAppversion() {
		// TODO Auto-generated method stub
		return appversionMapper.queryAllAppversion();
	}


	public void insertSelective(AppversionCustom appversionCustom) {
		// TODO Auto-generated method stub
		appversionMapper.insertSelective(appversionCustom);
	}


	public List<AppversionCustom> selectSelective(AppversionCustom appversionCustom) {
		// TODO Auto-generated method stub
		return appversionMapper.selectSelective(appversionCustom);
	}


	public void deleteAppversionByIds(String[] appIds) {
		// TODO Auto-generated method stub
		appversionMapper.deleteAppversionByIds(appIds);
	}


	public void updateAppversionSelectiveByPrimaryKey(AppversionCustom appversionCustom) {
		// TODO Auto-generated method stub
		appversionMapper.updateByPrimaryKeySelective(appversionCustom);
	}

}
