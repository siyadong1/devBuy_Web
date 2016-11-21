<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
	<head>
		<meta charset="UTF-8">
		<title>商品列表</title>
		
		<script type="text/javascript" src="js/jquery-2.1.1.min.js" ></script>
			<link rel="stylesheet" href="css/test.css" />
			<link rel="stylesheet" href="css/common.css" />
			<link rel="stylesheet" href="css/ui.css" /> />
	</head>
	<body>
	
	<div id="div1">
		
				<c:forEach  items="${itemsCustoms }" var="item" >				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>${item.itemsname} </p></td>
					<td><p title="${item.description}">手机</p></td>
					<td><p>${item.currentPrice}</p></td>
					<td><p>${item.price}</p></td>
					<td><p>${item.inventory}</p></td>
					<td><p>${item.itemsname}</p></td>
					<td><p>${item.itemsname}</p></td>
					<td><button  onclick="showAddGoodsDialog()"   >编辑</button></td>
				</tr>
				</c:forEach>
				
	</div>

	</body>
</html>
