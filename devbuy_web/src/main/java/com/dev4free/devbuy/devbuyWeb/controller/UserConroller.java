package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.poCustom.AddressCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.UserCustom;
import com.dev4free.devbuy.devbuyWeb.service.AddressService;
import com.dev4free.devbuy.devbuyWeb.service.UserService;

/**
 * 
 * @author syd
 * @date:2016年12月5日
 * @project_name:devbuy_web
 * @description:关于用户这张表的操作
 */
@Controller
@RequestMapping(value="/java/manageplatform")
public class UserConroller {

	
	
	
	@Autowired
	UserService userService;
	
	@Autowired
	AddressService addressService;
	
	
	/**
	 * 查询所有的用户信息
	 * @return
	 */
	 @RequestMapping("/queryAllUsers.action")
	public ModelAndView queryAllUsers(){
		List<UserCustom> userCustoms = userService.queryAllUsers();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userCustoms",userCustoms);
		modelAndView.setViewName("html/content_4_1_1");
		return modelAndView;
	}
	 
	 
	 
	 
	 
		
		/**
		 * 根据user的id。批量的删除user
		 * @param userIds
		 */
		@RequestMapping("/deleteUserByIds.action")
		public @ResponseBody EntityResponse deleteUserByIds(String[] userIds){
			
			EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL,ConstantResponse.CONTENT_NORMAL);
			
			if (userIds == null || userIds.length == 0) {
				entityResponse.setCode(ConstantResponse.CODE_DELETECLASSIFICATION_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_DELETECLASSIFICATION_ERROR);
				return entityResponse;
			}
			userService.deleteUserByIds(userIds);
			entityResponse.setMessage("删除成功！");
			return entityResponse;
		}
		
		
		
		
		/**
		 * 查询用户详情包括用户的默认收货地址
		 * @param userId
		 * @return
		 */
		@RequestMapping("/queryUserDetail.action")
		public ModelAndView queryUserDetail(String userId){
			UserCustom userCustoms = userService.queryUsersByPrimarykey(userId);
			AddressCustom addressCustom = new AddressCustom();
			addressCustom.setDefaultAddress("0");
			addressCustom.setUserId(userId);
			List<AddressCustom> addressCustoms = addressService.selcetSelective(addressCustom);
			ModelAndView modelAndView = new ModelAndView();
			if (addressCustoms != null && addressCustoms.size() > 0) {
				modelAndView.addObject("addressCustoms",addressCustoms.get(0));
			}
			modelAndView.addObject("userCustoms",userCustoms);
			modelAndView.setViewName("html/userDetail");
			return modelAndView;
		}
	
}
