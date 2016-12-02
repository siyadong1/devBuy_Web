package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Orderstatus;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrderStatusCustom;

public interface OrderstatusMapper {
    int deleteByPrimaryKey(String osId);

    int insert(Orderstatus record);

    int insertSelective(Orderstatus record);

    Orderstatus selectByPrimaryKey(String osId);

    int updateByPrimaryKeySelective(Orderstatus record);

    int updateByPrimaryKey(Orderstatus record);
    
    
    /**
     * 查询所有的订单状态
     * @return
     */
    List<OrderStatusCustom> queryAllOrderStatus();
    
    
    /**
     * 根据传入的orderStatusCustom非空字段查询orderStatusCustom
     * @param orderStatusCustom
     * @return
     */
    List<OrderStatusCustom> selectSelective(OrderStatusCustom orderStatusCustom);
    
    
    
    /**
     * 根据orderstatus的id批量的删除orderstatus
     * @param osIds
     */
    void deleteOrderStatusByIds(String[] osIds);
    
    
}