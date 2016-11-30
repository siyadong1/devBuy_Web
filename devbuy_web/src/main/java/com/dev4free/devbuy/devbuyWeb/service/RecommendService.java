package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
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
	
	
	
	
	
	/**
	 * 新增recommendCustom
	 * @param recommendCustom
	 */
	void insertRecommend(RecommendCustom recommendCustom);
	
	
	
	
	
	
	
	
	/**
	 * 根据Recommend的非空字段进行筛选
	 * @param recommendCustom
	 * @return
	 */
	List<RecommendCustom> selectSelective(RecommendCustom recommendCustom);
	
	
	
	
	
	
	/**
	 * 新增recommend并且新增recommend对于的商品信息
	 * @param recommendCustom
	 * @param itemsCustom
	 */
	void updateRecommenAndupdateItems(RecommendCustom recommendCustom,ItemsCustom itemsCustom);
	
	
	
	
	
	/**
	 * 新增Recommend并且新增Recommend对于的商品信息
	 * @param recommendCustom
	 * @param itemsCustom
	 */
	void insertRecommendAndInsertItems(RecommendCustom recommendCustom,ItemsCustom itemsCustom);
	
	
	
	
	/**
	 * 根据Recommend的id。批量的删除Recommend
	 * @param rcIds
	 */
	void deleteRecommendByIds(String[] rcIds);
	
}
