package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.poCustom.AddressCustom;

/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:对于address这张表的操作
 */
public interface AddressService {

	
	
	/**
	 * 根据address的非空字段查询address这张表
	 * @param addressCustom
	 * @return
	 */
	List<AddressCustom> selcetSelective(AddressCustom addressCustom);
	
}
