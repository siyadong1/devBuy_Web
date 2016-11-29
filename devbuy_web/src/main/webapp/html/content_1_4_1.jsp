<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>导航列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_4_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除类别-->
			<div id="deleteNavigator" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该首页导航</p>
				<button  onclick="hideDeleteNavigatorDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteNavigatorDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_1_4_1">
			<div id="ContentRightTitle_1_4_1">
				<button onclick="showDeleteNavigatorDialog()" class="contentButton" id="btnDeleteClass" >删除导航</button>
				<button onclick="showAddNavigatorDialog()"   class="contentButton">添加导航</button>
			</div>
			
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>名称</p></td>
					<td><p>描述</p></td>
					<td><p>图片</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>图书</p></td>
					<td><p title="这是一个图书的类型的分类">这是一本图书</p></td>
					<td><img  src="../img/iv_book.png"></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><button  onclick="showEditNavigatorDialog()" >编辑</button></td>
				</tr>
				
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>iPhone 7</p></td>
					<td><p>手机</p></td>
					<td><p title="这是一部手机">这是一部手机</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><button onclick="showEditNavigatorDialog()"   >编辑</button></td>
				</tr>
				
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
