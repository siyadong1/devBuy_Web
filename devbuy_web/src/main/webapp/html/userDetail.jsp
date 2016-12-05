<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户详情</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/userDetail.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
		<script type="text/javascript" src="${devbuy_web_path}/js/userDetail.js" ></script>
	</head>
	<body>
		<div id="body">
			<div id="userInfo">
				<!--用户信息头部-->
				<div id="userInfoHeader">
					<p>用户详情</p>
				</div>
				<!--用户基本信息区域-->
				<form>
					<p class="userInfoSubtitle">基本信息</p>
					<table  cellpadding="10px">
						<tr>
							<td><p>用户名</p></td>
							<td><input type="text" value="${userCustoms.username}" /></td>
						</tr>
						<tr>
							<td><p>用户密码</p></td>
							<td><input type="text" value="${userCustoms.password}" /></td>
						</tr>
						<tr>
							<td><p>用户昵称</p></td>
							<td><input type="text" value="${userCustoms.nickname}" /></td>
						</tr>
						
						<tr>
							<td><p>注册时间</p></td>
							<td><input type="text" value="${userCustoms.regtime}" /></td>
						</tr>
						
						
						
						<tr>
							<td><p>钱包余额</p></td>
							<td><input type="text" value="${userCustoms.balance}"/></td>
						</tr>
						
						<tr>
							<td><p>用户头像</p></td>
							<td ><img src="${userCustoms.avatar}" /></td>
						</tr>
					</table>
											


				<p class="userInfoSubtitle">默认收货地址</p>
					<table  cellpadding="10px">
						<tr>
							<td><p>收货地址</p></td>
							<td><input type="text" value="${addressCustoms.province}${addressCustoms.city}${addressCustoms.detailAddress}" /></td>
						</tr>
						<tr>
							<td><p>联系人</p></td>
							<td><input type="text" value="${addressCustoms.consigneeName}" /></td>
						</tr>
						<tr>
							<td><p>联系电话</p></td>
							<td><input type="text" value="${addressCustoms.phoneNumber}" /></td>
						</tr>
						
						<tr>
							<td><p>其它地址</p></td>
							<td><button type="button"  onclick="goToAddress()">去查看</button></td>
						</tr>
					</table>
											


				<p class="userInfoSubtitle">查看订单</p>
					<table  cellpadding="10px">
						
						<tr>
							<td><p>所有订单</p></td>
							<td><button  type="button"   onclick="goToOrder('${devbuy_web_path}','${userCustoms.userId}')">去查看</button></td>
						</tr>
					</table>
											



				</form>
				
					<tr>
						<td >
							<button type="button" id="submitButton" onclick="confirmUserDetail('${devbuy_web_path}')"  >确定</button>
						</td>
					</tr>
				
			</div>
			
			
			
			
			
		</div>
		
		
		
		
		
	</body>
</html>
