package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Recommend;
import com.dev4free.devbuy.devbuyWeb.poCustom.RecommendCustom;

public interface RecommendMapper {
    int deleteByPrimaryKey(String rcId);

    int insert(Recommend record);

    int insertSelective(Recommend record);

    Recommend selectByPrimaryKey(String rcId);

    int updateByPrimaryKeySelective(Recommend record);

    int updateByPrimaryKey(Recommend record);
    
    
  
  
  
  
    
    
    /**
     * 查询RecommendCustom
     * @return
     */
    List<RecommendCustom> queryAllRecommend();
    
    
    /**
     * 根据主键查询自定义的Recommend
     * @param rmId
     * @return
     */
    RecommendCustom selectRecommendCustomByPrimaryKey(String rmId);
    
    
    
    
    
    /**
     * 根据非空字段查询Recommend信息
     * @param recommendCustom
     * @return
     */
    List<RecommendCustom> selectSelective(RecommendCustom recommendCustom);
    
    
    
    
    
    /**
     * 根据recommend的id。批量删除recommend
     * @param rcids
     */
    void deleteRecommendByIds(String[] rcids);
    
    
}