package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import org.ietf.jgss.Oid;

import com.dev4free.devbuy.devbuyWeb.poCustom.UserCustom;

/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:关于用户这张表的操作
 */
public interface UserService {
	
	
	
	/**
	 * 查询所有的用户信息
	 * @return
	 */
	public List<UserCustom> queryAllUsers();
	
	
	
	/**
	 * 根据用户的id批量的删除用户信息
	 * @param userIds
	 */
	void deleteUserByIds(String[] userIds);
	
	
	
	/**
	 * 根据用户的id查找用户信息
	 * @param userId
	 * @return
	 */
	UserCustom queryUsersByPrimarykey(String userId);

}
