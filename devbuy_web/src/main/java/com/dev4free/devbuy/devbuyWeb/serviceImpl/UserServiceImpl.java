package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.UserMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.UserCustom;
import com.dev4free.devbuy.devbuyWeb.service.UserService;


/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:
 */
public class UserServiceImpl implements UserService{

	
	
	@Autowired
	UserMapper userMapper;
	
	
	public List<UserCustom> queryAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.queryAllUsers();
	}


	public void deleteUserByIds(String[] userIds) {
		// TODO Auto-generated method stub
		userMapper.deleteUserByIds(userIds);
	}


	public UserCustom queryUsersByPrimarykey(String userId) {
		// TODO Auto-generated method stub
		return userMapper.queryUsersByPrimarykey(userId);
	}

}
