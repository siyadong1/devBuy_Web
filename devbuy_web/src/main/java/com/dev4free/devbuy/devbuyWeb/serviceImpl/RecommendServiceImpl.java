package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.RecommendMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.RecommendCustom;
import com.dev4free.devbuy.devbuyWeb.service.RecommendService;


/**
 * 
 * @author syd
 * @date:2016年11月29日
 * @project_name:devbuy_web
 * @description:
 */
public class RecommendServiceImpl implements RecommendService{

	
	
	@Autowired
	RecommendMapper recommendMapper;
	
	
	
	public List<RecommendCustom> queryAllRecommend() {
		// TODO Auto-generated method stub
		return recommendMapper.queryAllRecommend();
	}



	public RecommendCustom selectRecommendCustomByPrimaryKey(String rmId) {
		// TODO Auto-generated method stub
		return recommendMapper.selectRecommendCustomByPrimaryKey(rmId);
	}
	
	
	
	

}
