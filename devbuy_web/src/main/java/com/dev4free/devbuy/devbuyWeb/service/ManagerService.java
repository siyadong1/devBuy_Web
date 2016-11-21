package com.dev4free.devbuy.devbuyWeb.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.ManagerMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.ManagerCustom;

public interface ManagerService {
	

	
	/**
	 * 根据用户名和密码查找管理员
	 * @param name
	 * @param password
	 * @return
	 */
	public ManagerCustom findManagerByUsernameAndPassword(String name,String password);
	
}
