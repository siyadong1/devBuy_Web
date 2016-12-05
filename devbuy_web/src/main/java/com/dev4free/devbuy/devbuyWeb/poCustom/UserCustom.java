package com.dev4free.devbuy.devbuyWeb.poCustom;

import com.dev4free.devbuy.devbuyWeb.po.Address;
import com.dev4free.devbuy.devbuyWeb.po.User;
import com.dev4free.devbuy.devbuyWeb.po.Wallet;
import com.mysql.jdbc.BalanceStrategy;


/**
 * 
 * @author syd
 * @date:2016年12月2日
 * @project_name:devbuy_web
 * @description:自定义的User表
 */
public class UserCustom extends User {
	
	private String balance;
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance() {
		return balance;
	}
}
