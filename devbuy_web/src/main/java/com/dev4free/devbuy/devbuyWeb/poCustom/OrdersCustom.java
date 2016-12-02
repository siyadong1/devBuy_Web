package com.dev4free.devbuy.devbuyWeb.poCustom;

import com.dev4free.devbuy.devbuyWeb.po.Address;
import com.dev4free.devbuy.devbuyWeb.po.Orders;
import com.dev4free.devbuy.devbuyWeb.po.User;

/**
 * 
 * @author syd
 * @date:2016年12月2日
 * @project_name:devbuy_web
 * @description:自定义的Orders
 */
public class OrdersCustom extends Orders{

	
	
	private User user;
	private Address address;
	private OrderDetailCustom orderDetailCustom;
	private String orderStateName;
	public String getOrderStateName() {
		return orderStateName;
	}
	public void setOrderStateName(String orderStateName) {
		this.orderStateName = orderStateName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public OrderDetailCustom getOrderDetailCustom() {
		return orderDetailCustom;
	}
	public void setOrderDetailCustom(OrderDetailCustom orderDetailCustom) {
		this.orderDetailCustom = orderDetailCustom;
	}
	@Override
	public String toString() {
		return "ordersId=" + getOrdersId();
	}
	
	
}
