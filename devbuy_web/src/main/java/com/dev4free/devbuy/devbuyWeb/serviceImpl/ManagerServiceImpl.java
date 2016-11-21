package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.ManagerMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.ManagerCustom;
import com.dev4free.devbuy.devbuyWeb.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {

	
	@Autowired
	ManagerMapper managerMapper;
	
	
	/**
	 * 根据用户名和密码查找管理员
	 */
	public ManagerCustom findManagerByUsernameAndPassword(String name, String password) {
		ManagerCustom managerCustom = new ManagerCustom();
		managerCustom.setName(name);
		managerCustom.setPassword(password);
		return managerMapper.selectManagerByUsernameAndPassword(managerCustom);
	}

}
