package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;

/**
 * 商品类别相关操作
 * @author syd
 * @date:2016年11月22日
 * @project_name:devbuy_web
 * @description:
 */
public interface ClassificationService {

	
	
	/**
	 * 查询所有的商品分类
	 * @return
	 */
	List<ClassificationCustom> queryAllClassification();
	
	
	
	/**
	 * 根据主键删除商品分类
	 */
	void deleteClassificationById(String cfid);
	
	
	
	/**
	 * 根据主键更新商品分类
	 */
	void updateClassificationById(ClassificationCustom classificationCustom);
	
	
	
	
	/**
	 * 新增商品分类
	 */
	void insertSelective(ClassificationCustom classificationCustom);
	
	
	
	/**
	 * 以非空参数为选择所有的商品类别
	 */
	
	List<ClassificationCustom> selectSelective(ClassificationCustom classificationCustom);
	
	
	
	/**
	 * 根据商品类别的id批量的删除商品类别
	 */
	
	void deleteClassificationByIds(String[] cfIds);
	
	
	
	
}
