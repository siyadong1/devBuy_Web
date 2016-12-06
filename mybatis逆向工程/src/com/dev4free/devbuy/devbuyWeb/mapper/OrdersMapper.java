package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(String ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}