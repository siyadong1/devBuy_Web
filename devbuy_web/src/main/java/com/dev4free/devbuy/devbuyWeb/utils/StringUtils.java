package com.dev4free.devbuy.devbuyWeb.utils;

public class StringUtils {

	
	public static String toString (String string){
		
		return string == null ? "" : string;
		
	}
	
	
	
	public static boolean isEmpty(String string){
		
		return string == "" || string == null ? true :false;
	}
	
	
}
