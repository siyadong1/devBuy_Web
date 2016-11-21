package com.dev4free.devbuy.devbuyWeb.mapper;

import com.dev4free.devbuy.devbuyWeb.po.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(String addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}