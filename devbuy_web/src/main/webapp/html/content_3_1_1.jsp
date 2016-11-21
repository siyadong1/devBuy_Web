<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>购物车列表</title>
		<link rel="stylesheet" href="../css/content_1_1_1.css" />
		<link rel="stylesheet" href="../css/common.css" />
		<link rel="stylesheet" href="../css/ui.css" />
		<script type="text/javascript" src="../js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除类别-->
			<div id="deleteShoppingCar" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该购物车</p>
				<button  onclick="hideDeleteShoppingCarDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteShoppingCarDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_1_1_1">
			<div id="ContentRightTitle_1_1_1">
				<button onclick="showDeleteShoppingCarDialog()" class="contentButton" id="btnDeleteClass" >删除购物车记录</button>
				<input type="text" placeholder="请输入查询的用户"></input>
				<img src="img/iv_search_query.png" />
			</div>
			
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>订单号</p></td>
					<td><p>所属买家</p></td>
					<td><p>总价格</p></td>
					<td><p>修改时间</p></td>
					<td><p>创建时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>9dks…</p></td>
					<td><p title="斯亚东">斯亚东</p></td>
					<td><p>52239</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><button onclick="showShoppingCarRecordDetail()" >查看详情</button></td>
				</tr>
				
				
				
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
