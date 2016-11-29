package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev4free.devbuy.devbuyWeb.constant.Constant;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.RecommendCustom;
import com.dev4free.devbuy.devbuyWeb.service.ClassificationService;
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
	public ModelAndView selectRecommendCustomById(String rmId){
		ModelAndView modelAndView = new ModelAndView();
		RecommendCustom recommendCustom = recommendService.selectRecommendCustomByPrimaryKey(rmId);
		List<ClassificationCustom> classificationCustoms = classificationService.queryAllClassification();
		modelAndView.addObject("classificationCustoms", classificationCustoms);
		modelAndView.addObject(Constant.CATEGORYSELECTED, recommendCustom.getItemsCustom().getCategory());
		modelAndView.addObject("recommendCustom",recommendCustom);
		modelAndView.addObject("updateOrAdd", "update");
		modelAndView.setViewName("html/content_1_5_2");
		return modelAndView;
	}
	
		
	
	
}
