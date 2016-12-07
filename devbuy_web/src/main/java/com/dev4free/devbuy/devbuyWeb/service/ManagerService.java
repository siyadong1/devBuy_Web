package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

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
	
	
	
	
	
	/**
	 * 查询所有的manager信息
	 * @return
	 */
	List<ManagerCustom> queryAllManager();
	
	
	
	
	/**
	 * 新增manager
	 * @param managerCustom
	 */
	void addManager(ManagerCustom managerCustom);
	
	
	
	/**
	 * 根据非空字段查询manager
	 * @param managerCustom
	 */
	List<ManagerCustom> selectSelective(ManagerCustom managerCustom);
	
	
	
	
	
	
	/**
	 * 根据id批量的删除管理员
	 * @param managerIds
	 */
	void deleteManagerByIds(String[] managerIds);
	
	
	
	
	
	
	/**
	 * 根据主键更新manager
	 * @param managerCustom
	 */
	void updateByPrimaryKeySelective(ManagerCustom managerCustom);
	
	
}
