package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Address;
import com.dev4free.devbuy.devbuyWeb.poCustom.AddressCustom;

public interface AddressMapper {
    int deleteByPrimaryKey(String addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
    
    
    /**
     * 根据非空字段查询address这张表
     * @param addressCustom
     * @return
     */
    List<AddressCustom> selcetSelective(AddressCustom addressCustom);
    
}