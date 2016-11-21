package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Banner;

public interface BannerMapper {
    int deleteByPrimaryKey(String bnId);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(String bnId);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}