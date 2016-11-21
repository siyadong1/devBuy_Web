package com.dev4free.devbuy.devbuyWeb.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev4free.devbuy.devbuyWeb.constant.Constant;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.mode.ResponseMode;
import com.dev4free.devbuy.devbuyWeb.poCustom.ManagerCustom;
import com.dev4free.devbuy.devbuyWeb.service.ManagerService;

/**
 * 
 * @author syd
 * @date:2016年11月15日
 * @project_name:devbuy_web
 * @description:管理员的相关方法
 */


@Controller
@RequestMapping(value="/java/manageplatform")
public class ManagerController {

	
	@Autowired
	ManagerService managerService;
	
	@RequestMapping("/login.action")
	public ModelAndView login(HttpSession httpSession,String name,String password){
		ManagerCustom managerCustom = managerService.findManagerByUsernameAndPassword(name, password);
		ModelAndView modelAndView = new ModelAndView();
		if (managerCustom == null) {
			ResponseMode responseMode = new ResponseMode(ConstantResponse.CODE_LOGIN_NOMANAGER,ConstantResponse.CONTENT_LOGIN_NOMANAGER);
			modelAndView.addObject("responseMode",responseMode);
			modelAndView.setViewName("index");
		}else {
			httpSession.setAttribute(Constant.manager, managerCustom.getName());
			int managerNo = 1;
			if (httpSession.getAttribute(Constant.managerNo) != null) {
				managerNo = Integer.parseInt(httpSession.getAttribute(Constant.managerNo).toString()) + 1;
			}
			httpSession.setAttribute(Constant.managerNo,managerNo);
			modelAndView.addObject("managerCustom", managerCustom);
			modelAndView.setViewName("home");
		}

		return modelAndView;
	}
	
	
	@RequestMapping("/logout.action")
	public String logout(HttpSession httpSession,Model model){
		
		int managerNo = 0;
		if (httpSession.getAttribute(Constant.managerNo) != null) {
			managerNo = Integer.parseInt(httpSession.getAttribute(Constant.managerNo).toString()) - 1;
		}
		model.addAttribute("manager",httpSession.getAttribute(Constant.manager));
		httpSession.setAttribute(Constant.managerNo,managerNo);
		return "index";
	}
	
	
}
