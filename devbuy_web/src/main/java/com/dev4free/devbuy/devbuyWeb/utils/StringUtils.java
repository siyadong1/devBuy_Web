package com.dev4free.devbuy.devbuyWeb.utils;

public class StringUtils {

	
	/**
	 * return string == null ? "" : string;
	 * @param string
	 * @return
	 */
	public static String toString (String string){
		
		return string == null ? "" : string;
		
	}
	
	
	
	/**
	 * return string == "" || string == null ? true :false;
	 * @param string
	 * @return
	 */
	public static boolean isEmpty(String string){
		
		return string.equals("") || string == null ? true :false;
	}
	
	
}
