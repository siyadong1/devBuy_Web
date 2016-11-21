package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Recommend;

public interface RecommendMapper {
    int deleteByPrimaryKey(String rcId);

    int insert(Recommend record);

    int insertSelective(Recommend record);

    Recommend selectByPrimaryKey(String rcId);

    int updateByPrimaryKeySelective(Recommend record);

    int updateByPrimaryKey(Recommend record);
}