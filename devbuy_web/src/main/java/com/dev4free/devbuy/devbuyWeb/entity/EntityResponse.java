package com.dev4free.devbuy.devbuyWeb.entity;


/**
 * 返回给客户端的信息
 * @author syd
 * @date:2016年11月23日
 * @project_name:devbuy_web
 * @description:
 */
public class EntityResponse {

	
	
	
	public String code = "";
	public String message = "";
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public EntityResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	
	public EntityResponse() {
	}
	@Override
	public String toString() {
		return "EntityResponse [code=" + code + ", message=" + message + "]";
	}
	
	
	
}
