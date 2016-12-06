package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Orderstatus;

public interface OrderstatusMapper {
    int deleteByPrimaryKey(String osId);

    int insert(Orderstatus record);

    int insertSelective(Orderstatus record);

    Orderstatus selectByPrimaryKey(String osId);

    int updateByPrimaryKeySelective(Orderstatus record);

    int updateByPrimaryKey(Orderstatus record);
}