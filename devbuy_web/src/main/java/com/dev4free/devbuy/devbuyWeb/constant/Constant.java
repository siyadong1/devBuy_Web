package com.dev4free.devbuy.devbuyWeb.constant;

public class Constant {

	
	//存储当前账号
	public static String manager = "manager";
	//存储当前在线用户数
	public static String managerNo = "managerNo";
	/**
	 * 图片实际存放路径
	 */
	public static final String IMAGE_ROOT_REAL_PATH_WEB= "/usr/local/images/web/" ;
	/**
	 * 存放商品分类的图片的子路径
	 */
	public static final String IMAGE_CLASSIFICATION= "classification/" ;
	/**
	 * 存放商品分类的图片的子路径
	 */
	public static final String IMAGE_ITEMS= "items/" ;
	/**
	 * 存放商品Banner的图片的子路径
	 */
	public static final String IMAGE_BANNER= "banner/" ;
	/**
	 * 存放app的子路径
	 */
	public static final String IMAGE_APPVERSION= "appversion/" ;
	
	
	/**
	 * 存放商品推荐的图片的子路径
	 */
	public static final String IMAGE_RECOMMEND= "recommend/" ;
	
	/**
	 * 默认显示哪一个商品分类在用于content_1_2_1.jsp和content_1_2_2.jsp,content_1_3_1.jsp和content_1_3_2.jsp,content_1_5_1.jsp和content_1_5_2.jsp中
	 */
	public static final String 	CATEGORYSELECTED = "categorySelected";
	
	
	/**
	 * 定义订单状态
	 */
	public static final String ORDERS_STATE_WAIT_FOR_PAYMENT = "0";   //待支付
	public static final String ORDERS_STATE_WAIT_FOR_SHIPMENT = "1";  //待发货
	public static final String ORDERS_STATE_WAIT_FOR_RECEIVING = "2"; //待收货
	public static final String ORDERS_STATE_COMPLETED = "3";          //已完成
	public static final String ORDERS_STATE_CANCELED = "4";           //已取消
	public static final String ORDERS_STATE_ALL ="5";                //全部订单
	
	
	
}
