package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Constantinfo;

public interface ConstantinfoMapper {
    int deleteByPrimaryKey(String infoId);

    int insert(Constantinfo record);

    int insertSelective(Constantinfo record);

    Constantinfo selectByPrimaryKey(String infoId);

    int updateByPrimaryKeySelective(Constantinfo record);

    int updateByPrimaryKey(Constantinfo record);
}