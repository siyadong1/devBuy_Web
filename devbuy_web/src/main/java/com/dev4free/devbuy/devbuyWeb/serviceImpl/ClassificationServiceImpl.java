package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.ClassificationMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;
import com.dev4free.devbuy.devbuyWeb.service.ClassificationService;
import com.dev4free.devbuy.devbuyWeb.utils.TimeUtils;

public class ClassificationServiceImpl implements ClassificationService {

	
	@Autowired
	ClassificationMapper classificationMapper;
	
	public List<ClassificationCustom> queryAllClassification() {
		return classificationMapper.selectAllClassioncation();
	}

	public void deleteClassificationById(String cfid) {
		
		classificationMapper.deleteByPrimaryKey(cfid);
		
	}

	public void updateClassificationById(ClassificationCustom classificationCustom) {
		classificationCustom.setCfModifytime(TimeUtils.getNow());
		classificationMapper.updateByPrimaryKeySelective(classificationCustom);
		
	}


	public void insertSelective(ClassificationCustom classificationCustom) {
		classificationMapper.insertSelective(classificationCustom);
		
	}

	public List<ClassificationCustom> selectSelective(ClassificationCustom classificationCustom) {
		return classificationMapper.selectSelective(classificationCustom);
	}

	public void deleteClassificationByIds(String[] cfIds) {
		 classificationMapper.deleteClassificationByIds(cfIds);
	}





}
