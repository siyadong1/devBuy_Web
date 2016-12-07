package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

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


	public List<ManagerCustom> queryAllManager() {
		// TODO Auto-generated method stub
		return managerMapper.queryAllManager();
	}


	public void addManager(ManagerCustom managerCustom) {
		// TODO Auto-generated method stub
		managerMapper.insertSelective(managerCustom);
	}


	public List<ManagerCustom> selectSelective(ManagerCustom managerCustom) {
		// TODO Auto-generated method stub
		return managerMapper.selectSelective(managerCustom);
	}


	public void deleteManagerByIds(String[] managerIds) {
		// TODO Auto-generated method stub
		managerMapper.deleteManagerByIds(managerIds);
	}


	public void updateByPrimaryKeySelective(ManagerCustom managerCustom) {
		// TODO Auto-generated method stub
		managerMapper.updateByPrimaryKeySelective(managerCustom);
	}

}
