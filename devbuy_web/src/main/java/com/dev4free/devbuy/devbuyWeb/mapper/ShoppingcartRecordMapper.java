package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.ShoppingcartRecord;

public interface ShoppingcartRecordMapper {
    int deleteByPrimaryKey(String cartId);

    int insert(ShoppingcartRecord record);

    int insertSelective(ShoppingcartRecord record);

    ShoppingcartRecord selectByPrimaryKey(String cartId);

    int updateByPrimaryKeySelective(ShoppingcartRecord record);

    int updateByPrimaryKey(ShoppingcartRecord record);
}