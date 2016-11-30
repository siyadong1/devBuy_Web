package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.ItemsMapper;
import com.dev4free.devbuy.devbuyWeb.mapper.RecommendMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.RecommendCustom;
import com.dev4free.devbuy.devbuyWeb.service.RecommendService;
import com.dev4free.devbuy.devbuyWeb.utils.TimeUtils;
import com.dev4free.devbuy.devbuyWeb.utils.UUIDUtils;


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
	@Autowired
	ItemsMapper itemsMapper;
	
	
	public List<RecommendCustom> queryAllRecommend() {
		// TODO Auto-generated method stub
		return recommendMapper.queryAllRecommend();
	}



	public RecommendCustom selectRecommendCustomByPrimaryKey(String rmId) {
		// TODO Auto-generated method stub
		return recommendMapper.selectRecommendCustomByPrimaryKey(rmId);
	}



	public void insertRecommend(RecommendCustom recommendCustom) {
		// TODO Auto-generated method stub
		recommendMapper.insert(recommendCustom);
	}



	public List<RecommendCustom> selectSelective(RecommendCustom recommendCustom) {
		// TODO Auto-generated method stub
		return recommendMapper.selectSelective(recommendCustom);
	}



	public void updateRecommenAndupdateItems(RecommendCustom recommendCustom, ItemsCustom itemsCustom) {
		// TODO Auto-generated method stub
		recommendCustom.setRcModifytime(TimeUtils.getNow());
		recommendMapper.updateByPrimaryKeySelective(recommendCustom);
		itemsCustom.setItemsId(recommendCustom.getItemsId());
		itemsMapper.updateByPrimaryKeySelective(itemsCustom);
	}



	public void deleteRecommendByIds(String[] rcIds) {
		// TODO Auto-generated method stub
		recommendMapper.deleteRecommendByIds(rcIds);
	}



	public void insertRecommendAndInsertItems(RecommendCustom recommendCustom, ItemsCustom itemsCustom) {
		String itemsId = UUIDUtils.getId();
		itemsCustom.setItemsId(itemsId);
		itemsMapper.insert(itemsCustom);
		recommendCustom.setItemsId(itemsId);
		recommendCustom.setRcId(UUIDUtils.getId());
		recommendCustom.setRcCreatetime(TimeUtils.getNow());
		recommendMapper.insert(recommendCustom);
		
	}


	
	
	

}
