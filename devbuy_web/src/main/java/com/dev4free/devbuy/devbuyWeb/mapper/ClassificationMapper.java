package com.dev4free.devbuy.devbuyWeb.mapper;


import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Classification;
import com.dev4free.devbuy.devbuyWeb.poCustom.ClassificationCustom;

public interface ClassificationMapper {
    int deleteByPrimaryKey(String cfId);

    int insert(Classification record);

    int insertSelective(Classification record);

    ClassificationCustom selectByPrimaryKey(String cfId);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
    
    
    /**
     * 选择所有的商品类别
     * @return
     */
    List<ClassificationCustom> selectAllClassioncation();
    
    
    /**
     * 以非空参数为选择所有的商品类别
     * @return
     */
    List<ClassificationCustom> selectSelective(ClassificationCustom classificationCustom);
    
    
    /**
     * 根据商品类别的id批量的删除商品分类
     * @param cfIds
     */
    void deleteClassificationByIds(String[] cfIds);
}