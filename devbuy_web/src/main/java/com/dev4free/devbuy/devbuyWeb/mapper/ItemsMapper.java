package com.dev4free.devbuy.devbuyWeb.mapper;


import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Items;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;

public interface ItemsMapper {
    int deleteByPrimaryKey(String itemsId);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(String itemsId);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
    
    
    List<ItemsCustom> selectAllItems();
    
    
    
    /**
     * 根据传入的itemsCustom非空字段来进行筛选
     * @param itemsCustom
     * @return
     */
    List<ItemsCustom> selectSelective(ItemsCustom itemsCustom);
    
}