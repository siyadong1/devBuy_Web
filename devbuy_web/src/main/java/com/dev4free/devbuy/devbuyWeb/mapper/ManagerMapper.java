package com.dev4free.devbuy.devbuyWeb.mapper;

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
}