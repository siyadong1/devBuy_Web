package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Orderdetail;

public interface OrderdetailMapper {
    int deleteByPrimaryKey(String detailsId);

    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);

    Orderdetail selectByPrimaryKey(String detailsId);

    int updateByPrimaryKeySelective(Orderdetail record);

    int updateByPrimaryKey(Orderdetail record);
}