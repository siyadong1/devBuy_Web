package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.ShoppingcartRecord;
import com.dev4free.devbuy.devbuyWeb.poCustom.ShoppingcartRecordCustom;

public interface ShoppingcartRecordMapper {
    int deleteByPrimaryKey(String cartId);

    int insert(ShoppingcartRecord record);

    int insertSelective(ShoppingcartRecord record);

    ShoppingcartRecord selectByPrimaryKey(String cartId);

    int updateByPrimaryKeySelective(ShoppingcartRecord record);

    int updateByPrimaryKey(ShoppingcartRecord record);
    
    
    
    
    /**
     * 查询所有的购物车列表
     * @return
     */
    List<ShoppingcartRecordCustom> queryAllShoppingcartRecord();
    
    
    
    
    
    /**
     * 根据主键查询自定义的购物车
     * @param shoppingcartRecordCustom
     * @return
     */
    ShoppingcartRecordCustom selectShoppingcartRecordCustomByPrimaryKey(String cartId);
    
    
    
    
    
    /**
     * 根据shoppingcartRecord的id。批量删除shoppingcartRecord
     * @param cartIds
     */
    void deleteShoppingcartRecordByIds(String[] cartIds);
    
    
    
    
}