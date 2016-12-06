<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>收货地址</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/userAddress.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
		<script type="text/javascript" src="${devbuy_web_path}/js/userAddress.js" ></script>
	</head>
	<body>
		<div id="body">
			<div id="userAddress">
				<!--用户信息头部-->
				<div id="userAddressHeader">
					<p>收货地址</p>
				</div>
				<!--用户基本信息区域-->
				<form>
					<p class="userAddressSubtitle">基本信息</p>
					<table  cellpadding="10px">
						<tr>
							<td><p>用户姓名</p></td>
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
											

				<c:forEach  items="${addressCustoms}"  var="addressCustom" >
				<c:if test="${addressCustom.defaultAddress == '0'}" >
				<p class="userAddressSubtitle">默认收货地址</p>
				</c:if>
				
				<c:if test="${addressCustom.defaultAddress != '0'}" >
				<p class="userAddressSubtitle">其它收货地址</p>
				</c:if>
				
					<table  cellpadding="10px">
						<tr>
							<td><p>省份</p></td>
							<td><input type="text" value="${addressCustom.province}" /></td>
						</tr>
						<tr>
							<td><p>城市</p></td>
							<td><input type="text" value="${addressCustom.city}" /></td>
						</tr>
						<tr>
							<td><p>收货地址</p></td>
							<td><input type="text" value="${addressCustom.detailAddress}" /></td>
						</tr>
						<tr>
							<td><p>联系人</p></td>
							<td><input type="text" value="${addressCustom.consigneeName}" /></td>
						</tr>
						<tr>
							<td><p>联系电话</p></td>
							<td><input type="text" value="${addressCustom.phoneNumber}" /></td>
						</tr>
					</table>
					</c:forEach>
				</form>
					<tr>
						<td>
							<button  type="button"    onclick="confirmUserAddress('${devbuy_web_path}')">确定</button>
						</td>
					</tr>
				
			</div>
			
			
			
			
			
		</div>
		
		
		
		
		
	</body>
</html>
