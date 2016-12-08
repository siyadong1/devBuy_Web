package com.dev4free.devbuy.devbuyWeb.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.dev4free.devbuy.devbuyWeb.constant.Constant;


/**
 * 
 * @author syd
 * @date:2016年12月8日
 * @project_name:devbuy_web
 * @description:监听HttpSession的创建和销毁来统计在线的人数
 */
public class MyHttpSessionListener implements HttpSessionListener{

	
	
	
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		int sessionNo = 1;
		if (se.getSession().getServletContext().getAttribute(Constant.managerNo) != null && (Integer)se.getSession().getServletContext().getAttribute(Constant.managerNo) >= 0) {
			sessionNo = (Integer)se.getSession().getServletContext().getAttribute(Constant.managerNo) + 1;
		}
		se.getSession().getServletContext().setAttribute(Constant.managerNo, sessionNo);
		
		
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		int sessionNo = 0;
		if (se.getSession().getServletContext().getAttribute(Constant.managerNo) != null && (Integer)se.getSession().getServletContext().getAttribute(Constant.managerNo) > 0) {
			sessionNo = (Integer)se.getSession().getServletContext().getAttribute(Constant.managerNo) - 1;
		}
		se.getSession().getServletContext().setAttribute(Constant.managerNo, sessionNo);
	

		
		
	}

}
