package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.User;
import com.dev4free.devbuy.devbuyWeb.poCustom.UserCustom;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
    
    
    /**
     * 查询所有的自定义用户信息
     * @return
     */
    List<UserCustom> queryAllUsers();
    
    
    
    
    /**
     * 根据用户的id批量的删除用户信息
     * @param userIds
     */
    void deleteUserByIds(String[] userIds);
    
    
    
    
    
    /**
     * 根据user的id查询用户信息
     */
    UserCustom queryUsersByPrimarykey(String userId);
    
    
}