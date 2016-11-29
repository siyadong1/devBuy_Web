package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.RecommendCustom;

/**
 * 
 * @author syd
 * @date:2016年11月29日
 * @project_name:devbuy_web
 * @description:推荐条目的相关操作
 */
public interface RecommendService {

	
	
	/**
	 * 查询所有的推荐商品并且关联查询Items表
	 * @return
	 */
	List<RecommendCustom> queryAllRecommend();
	
	
	
	
	/**
	 * 根据Recommend的主键查询自定义的Recommend
	 * @param rcId
	 * @return
	 */
	RecommendCustom selectRecommendCustomByPrimaryKey(String rmId);
	
}
