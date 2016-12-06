package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Appversion;
import com.dev4free.devbuy.devbuyWeb.poCustom.AppversionCustom;

public interface AppversionMapper {
    int deleteByPrimaryKey(String appversionId);

    int insert(Appversion record);

    int insertSelective(Appversion record);

    Appversion selectByPrimaryKey(String appversionId);

    int updateByPrimaryKeySelective(Appversion record);

    int updateByPrimaryKey(Appversion record);
    
    
    
    
    /**
     * 查询所有的版本信息
     * @return
     */
    List<AppversionCustom>  queryAllAppversion();
    
    
    
    /**
     * 根据传入的非空字段筛选出appversion
     * @return
     */
    List<AppversionCustom> selectSelective(AppversionCustom appversionCustom);
    
    
    
    
    /**
     * 跟住app的主键id批量的删除appversion
     * @param appIds
     */
    void deleteAppversionByIds(String[] appIds);
    
    
}