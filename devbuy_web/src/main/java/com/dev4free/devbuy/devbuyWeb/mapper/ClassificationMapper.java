package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Classification;

public interface ClassificationMapper {
    int deleteByPrimaryKey(String cfId);

    int insert(Classification record);

    int insertSelective(Classification record);

    Classification selectByPrimaryKey(String cfId);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}