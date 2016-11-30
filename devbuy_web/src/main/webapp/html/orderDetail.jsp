<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布商品</title>
				<link rel="stylesheet" href="${devbuy_web_path}/css/orderDetail.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>  
	</head>
	<body>
		<div id="body">
			<div id="pusblishGoods">
				<!--发布商品头部-->
				<div id="publishGoodsHeader">
					<p>发布商品</p>
				</div>
				<!--发布商品内容区域-->
				<form>
					<table  cellpadding="10px">
						<tr>
							<td><p>订单编号</p></td>
							<td><input type="text"/></td>
						</tr>
						<tr>
							<td><p>所属用户</p></td>
							<td><input type="text"  /></td>
						</tr>
						<tr>
							<td><p>商品类别</p></td>
							<td>
								<select id="selectContent_1_2_2">
									<option>图书</option>
									<option>手机</option>
									<option>品牌男装</option>
									<option>电器</option>
								</select>
							</td>
						</tr>
						
						<tr>
							<td><p>商品描述</p></td>
							<td><textarea>这是一部IPhone6s</textarea></td>
						</tr>
						
						
						
						<tr>
							<td><p>原价</p></td>
							<td><input type="text" value="100"/></td>
						</tr>
						
						<tr>
							<td><p>促销价</p></td>
							<td><input type="text" value="80"/></td>
						</tr>
						
						
						<tr>
							<td><p>库存</p></td>
							<td><input type="text"value="120" /></td>
						</tr>
						
						
						
						
						<tr>
							<td><p>销量</p></td>
							<td><input type="text" value="1200" /></td>
						</tr>
						
						
						
						<tr>
							<td><p>产地</p></td>
							<td><input type="text" value="杭州" /></td>
						</tr>
						
						
						
						<tr>
							<td><p>快递费</p></td>
							<td><input type="text" value="2" /></td>
						</tr>
						
						
						
						<tr>
							<td><p>订单类型</p></td>
							<td><input type="text" value="代发货" /></td>
						</tr>
						
						
						
						<tr>
							<td><p>收货地址</p></td>
							<td><input type="text" value="成都市西源大道2006号" /></td>
						</tr>
						
						
						<tr>
							<td><p>联系人</p></td>
							<td><input type="text" value="经纪人老宋" /></td>
						</tr>
						
						<tr>
							<td><p>联系电话</p></td>
							<td><input type="text" value="15288888888" /></td>
						</tr>
						<tr>
							<td><p>商品图片</p></td>
							<td><input type="file" /></td>
						</tr>

					</table>
						<tr>
							<td ><img src="img/calabash.png" /></td>
						</tr>
				</form>
					<tr>
						<td >
							<button type="button">确定</button>
						</td>
					</tr>
			</div>
		</div>
		
	</body>
</html>
