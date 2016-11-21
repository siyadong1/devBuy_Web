package com.dev4free.devbuy.devbuyWeb.mode;

public class ResponseMode {
	
	
	public String code;
	public String message;
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
	public ResponseMode(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public ResponseMode() {
	}
	
	

}
