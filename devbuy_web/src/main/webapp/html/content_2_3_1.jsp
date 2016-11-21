<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>代发货/订单列表</title>
		<link rel="stylesheet" href="../css/content_2_1_1.css" />
		<link rel="stylesheet" href="../css/common.css" />
		<link rel="stylesheet" href="../css/ui.css" />
		<script type="text/javascript" src="../js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除商品-->
			<div id="deleteAllOrder" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该订单</p>
				<button  onclick="hideDeleteAllOrderDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteAllOrderDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_2_1_1">
			<div id="ContentRightTitle_2_1_1">
				<button onclick="showDeleteAllOrderDialog()" class="contentButton" id="btnDeleteClass" >删除</button>
				<input type="text" placeholder="搜索用户名/订单号"></input>
				<img src="img/iv_search_query.png" />
			</div>
			
			
			<table>
				<tr>
					<td><input type="checkbox" />  <p id="ContentRightFirtst_2_1_1">全选</p></td>
					<td><p>用户名</p></td>
					<td><p>订单号</p></td>
					<td><p>所属类别</p></td>
					<td><p>促销价</p></td>
					<td><p>原价</p></td>
					<td><p>类型</p></td>
					<td><p>产地</p></td>
					<td><p>修改时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>斯帅</p></td>
					<td><p title="df38a…">df38a…</p></td>
					<td><p>图书</p></td>
					<td><p>66</p></td>
					<td><p>88</p></td>
					<td><p>代付款</p></td>
					<td><p>杭州</p></td>
					<td><p>2016-09-21   15:25:25</p></td>
					<td><button  onclick="showAllOrderDialog()"  >查看详情</button></td>
				</tr>
				
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>张帅</p></td>
					<td><p title="df38a…">df38a…</p></td>
					<td><p>图书</p></td>
					<td><p>66</p></td>
					<td><p>88</p></td>
					<td><p>代付款</p></td>
					<td><p>杭州</p></td>
					<td><p>2016-09-21   15:25:25</p></td>
					<td><button  onclick="showAllOrderDialog()"  >查看详情</button></td>
				</tr>
				
				
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>耍帅</p></td>
					<td><p title="df38a…">df38a…</p></td>
					<td><p>图书</p></td>
					<td><p>66</p></td>
					<td><p>88</p></td>
					<td><p>代付款</p></td>
					<td><p>杭州</p></td>
					<td><p>2016-09-21   15:25:25</p></td>
					<td><button  onclick="showAllOrderDialog()"  >查看详情</button></td>
				</tr>
				
				
				
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
