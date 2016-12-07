package com.dev4free.devbuy.devbuyWeb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.dev4free.devbuy.devbuyWeb.constant.Constant;
import com.dev4free.devbuy.devbuyWeb.constant.ConstantResponse;
import com.dev4free.devbuy.devbuyWeb.entity.EntityResponse;
import com.dev4free.devbuy.devbuyWeb.mode.ResponseMode;
import com.dev4free.devbuy.devbuyWeb.poCustom.ManagerCustom;
import com.dev4free.devbuy.devbuyWeb.service.ManagerService;
import com.dev4free.devbuy.devbuyWeb.utils.TimeUtils;
import com.dev4free.devbuy.devbuyWeb.utils.UUIDUtils;

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
	
	
	
	
	
	
	
	
	/**
	 * 查询所有的manager信息
	 * @return
	 */
	@RequestMapping("/queryAllManager.action")
	public ModelAndView queryAllManager(){
		ModelAndView modelAndView = new ModelAndView();
		List<ManagerCustom>  managerCustoms =  managerService.queryAllManager();
		modelAndView.addObject("managerCustoms", managerCustoms);
		modelAndView.setViewName("html/content_6_1_1");
		return modelAndView;
	}
	
	
	
	/**
	 * 新增管理员
	 * @param managerCustom
	 * @return
	 */
	@RequestMapping("/addManager.action")
	public @ResponseBody EntityResponse addManager(ManagerCustom managerCustom,String currentManager){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL, ConstantResponse.CONTENT_NORMAL);
		
		
		
		//检测传入参数是否完整
		if (managerCustom == null || StringUtils.isEmpty(managerCustom.getName()) || StringUtils.isEmpty(managerCustom.getPassword()) || StringUtils.isEmpty(currentManager) ) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		
		List<ManagerCustom> managerCustoms ;
		ManagerCustom managerCustomSelective;
		
		
		//只有超级管理员才有新增用户的权限
		managerCustomSelective = new ManagerCustom();
		managerCustomSelective.setName(currentManager);
		managerCustoms = managerService.selectSelective(managerCustomSelective);
		if (managerCustoms != null && managerCustoms.size() > 0) {
			if (!managerCustoms.get(0).getSupermanager().equals("0")) {
				entityResponse.setCode(ConstantResponse.CODE_ADDMANAGERNOPRIORITY_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_ADDMANAGERNOPRIORITY_ERROR);
				return entityResponse;
			}
		}

		//检测用户名是否已经存在
		
		managerCustomSelective.setName(managerCustom.getName());
		managerCustoms = managerService.selectSelective(managerCustomSelective);
		if (managerCustoms != null && managerCustoms.size() > 0) {
			entityResponse.setCode(ConstantResponse.CODE_ADDMANAGERNAMEEXIT_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_ADDMANAGERNAMEEXIT_ERROR);
			return entityResponse;
		}
		//检测用户密码是否至少为6位数
		if (managerCustom.getPassword().trim().length() < 6 ) {
			entityResponse.setCode(ConstantResponse.CODE_ADDMANAGERPASSWORD_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_ADDMANAGERPASSWORD_ERROR);
			return entityResponse;
		}
		
		
		//新增管理员
		
		managerCustom.setManagerId(UUIDUtils.getId());
		managerCustom.setCreateTime(TimeUtils.getNow());
		managerService.addManager(managerCustom);
		
		entityResponse.setMessage("新增管理员成功！");
		return entityResponse;
	}
	
	
	
	/**
	 * 批量删除管理员
	 * @param managerIds
	 * @param currentManager
	 * @return
	 */
	@RequestMapping("/deleteManagerByIds.action")
	public @ResponseBody EntityResponse deleteManagerByIds(String[] managerIds,String currentManager){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL, ConstantResponse.CONTENT_NORMAL);
		
		
		//检测传入参数是否为空
		if (managerIds == null || managerIds.length < 1  ||StringUtils.isEmpty(currentManager)) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		
		
		//检测是否是admin在进行操作，只有admin才有删除权限
		if (!currentManager.equals("admin")) {
			entityResponse.setCode(ConstantResponse.CODE_DELETEMANAGERNOPRIORITY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_DELETEMANAGERNOPRIORITY_ERROR);
			return entityResponse;
		}
		
		
		//检测删除的管理员中是否包含admin，不能够删除admin这个账号
		ManagerCustom deleteManagerSelective = new ManagerCustom();
		deleteManagerSelective.setName("admin");
		List<ManagerCustom> managerCustoms = managerService.selectSelective(deleteManagerSelective);
		for (int i = 0; i < managerIds.length; i++) {
			if (managerIds[i].equals(managerCustoms.get(0).getManagerId())) {
				entityResponse.setCode(ConstantResponse.CODE_DELETEMANAGERDELETEADMIN_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_DELETEMANAGERDELETEADMIN_ERROR);
				return entityResponse;
			}
		}
		
		managerService.deleteManagerByIds(managerIds);
		entityResponse.setMessage("删除成功！");
		return entityResponse;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * 更新管理员
	 * @param managerCustom
	 * @return
	 */
	@RequestMapping("/updateManager.action")
	public @ResponseBody EntityResponse updateManager(ManagerCustom managerCustom,String oldName,String currentManager){
		
		EntityResponse entityResponse = new EntityResponse(ConstantResponse.CODE_NORMAL, ConstantResponse.CONTENT_NORMAL);
		//检测传入参数是否完整
		if (managerCustom == null || StringUtils.isEmpty(managerCustom.getName()) || StringUtils.isEmpty(managerCustom.getPassword()) || StringUtils.isEmpty(oldName)  ) {
			entityResponse.setCode(ConstantResponse.CODE_REQUESTPARAMETER_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_REQUESTPARAMETER_ERROR);
			return entityResponse;
		}
		List<ManagerCustom> managerCustoms ;
		ManagerCustom managerCustomSelective;
		
		
		
		
		
		//只有超级管理员才有更新用户的权限
		if (!currentManager.equals("admin")) {
			entityResponse.setCode(ConstantResponse.CODE_UPDATEMANAGERNOPRIORITY_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_UPDATEMANAGERNOPRIORITY_ERROR);
			return entityResponse;
		}

		
		
		
		
		//检测用户名是否已经存在
		if (!managerCustom.getName().equals(oldName)) {
			managerCustomSelective = new ManagerCustom();
			managerCustomSelective.setName(managerCustom.getName());
			managerCustoms = managerService.selectSelective(managerCustomSelective);
			if (managerCustoms != null && managerCustoms.size() > 0) {
				entityResponse.setCode(ConstantResponse.CODE_ADDMANAGERNAMEEXIT_ERROR);
				entityResponse.setMessage(ConstantResponse.CONTENT_ADDMANAGERNAMEEXIT_ERROR);
				return entityResponse;
			}
		}
		//检测用户密码是否至少为6位数
		if (managerCustom.getPassword().trim().length() < 6 ) {
			entityResponse.setCode(ConstantResponse.CODE_ADDMANAGERPASSWORD_ERROR);
			entityResponse.setMessage(ConstantResponse.CONTENT_ADDMANAGERPASSWORD_ERROR);
			return entityResponse;
		}
		
		
		//更新管理员
		managerService.updateByPrimaryKeySelective(managerCustom);
		entityResponse.setMessage("更新管理员成功！");
		return entityResponse;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
