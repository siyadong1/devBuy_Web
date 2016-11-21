<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>类别列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_2_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除商品-->
			<div id="deleteGoods" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该商品</p>
				<button  onclick="hideDeleteGoodsDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteGoodsDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--添加商品-->
			
			
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_1_2_1">
			<div id="ContentRightTitle_1_2_1">
				<button onclick="showDeleteGoodsDialog()" class="contentButton" id="btnDeleteClass" >删除商品</button>
				<button onclick="showAddGoodsDialog()"   class="contentButton">添加商品</button>
				<select class="contentButton" name="cars">
					<option value="volvo">全部</option>
					<option value="saab">图书</option>
					<option value="fiat">手机</option>
					<option value="audi">电器</option>
					</select>
				<input type="text" placeholder="搜索商品"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			
			<table>
				<tr>
					<td><input type="checkbox" />  <p id="ContentRightFirtst_1_2_1">全选</p></td>
					<td><p>名称</p></td>
					<td><p>所属类别</p></td>
					<td><p>促销价</p></td>
					<td><p>原价</p></td>
					<td><p>销量</p></td>
					<td><p>产地</p></td>
					<!-- <td><p>修改时间</p></td> -->
					<td><p>${param1 }</p></td>
					<td><p><%=request.getParameter("param1") %></p></td>
				</tr>
				

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
				
				
				
			</table>
		</div>
		</div>



	</body>
</html>
