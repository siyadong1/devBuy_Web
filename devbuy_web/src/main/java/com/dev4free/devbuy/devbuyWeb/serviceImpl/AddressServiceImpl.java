package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.AddressMapper;
import com.dev4free.devbuy.devbuyWeb.poCustom.AddressCustom;
import com.dev4free.devbuy.devbuyWeb.service.AddressService;


/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:
 */
public class AddressServiceImpl implements AddressService{

	
	@Autowired
	AddressMapper addressMapper;
	
	
	public List<AddressCustom> selcetSelective(AddressCustom addressCustom) {
		// TODO Auto-generated method stub
		return addressMapper.selcetSelective(addressCustom);
	}

}
