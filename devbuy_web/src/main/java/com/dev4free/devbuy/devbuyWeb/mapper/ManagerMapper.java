package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Manager;
import com.dev4free.devbuy.devbuyWeb.poCustom.ManagerCustom;

public interface ManagerMapper {
    int deleteByPrimaryKey(String managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String managerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
    
    /**
     * 根据用户名和密码查找管理员
     * @param username
     * @param password
     * @return
     */
    ManagerCustom selectManagerByUsernameAndPassword(ManagerCustom managerCustom);
    
    
    
    
    /**
     * 查询所有的manager信息
     * @return
     */
    List<ManagerCustom> queryAllManager();
    
    
    
    
    /**
     * 根据非空字段查询manager
     * @param managerCustom
     * @return
     */
    List<ManagerCustom> selectSelective(ManagerCustom managerCustom);
    
    
    /**
     * 根据id批量的删除管理员
     * @param managerIds
     */
    void deleteManagerByIds(String[] managerIds);
    
    
}