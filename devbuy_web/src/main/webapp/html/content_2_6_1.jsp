<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>订单状态</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_2_6_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/content_2_6_1.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>  
	</head>
	<body>
		

		<div id="body">
			
			<!--删除类别-->
			<div id="deleteOrderStatus" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该订单状态</p>
				<button  onclick="hideDeleteOrderStatusDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteOrderStatusDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			
						
			<!--添加商品-->
			<div id="addOrderStatus" >
				<div><p>添加订单状态</p></div>
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">商品名称</span></td>
							<td><input class="text16px" type="text" id="" placeholder="苹果6s" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
						<tr>
							<td><span class="text16px ">所属类别</span></td>
							<td>
								<select>
									<option>旅游</option>
									<option>图书</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">是否显示</span></td>
							<td>
								<select>
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">是否大图</span></td>
							<td>
								<select>
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">图标</span></td>
							<td><input type="file" class="text16px" /></td>
						</tr>
					</table>
				</form>
				<button   onclick="hideAddOrderStatusDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   onclick="hideAddOrderStatusDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
			</div>
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_2_6_1">
			<div id="ContentRightTitle_2_6_1">
				<button onclick="showDeleteOrderStatusDialog()" class="contentButton" id="btnDeleteClass" >删除订单状态</button>
				<button onclick="showAddOrderStatusDialog()"   class="contentButton">添加订单状态</button>
			</div>
			
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>名称</p></td>
					<td><p>所属类别</p></td>
					<td><p>描述</p></td>
					<td><p>是否大图</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>爱旅游</p></td>
					<td><p>旅游</p></td>
					<td><p title="喜欢旅游的...">喜欢旅游的...</p></td>
					<td><p>是</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><button  onclick="showEditOrderStatusDialog()" >编辑</button></td>
				</tr>
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>爱旅游</p></td>
					<td><p>旅游</p></td>
					<td><p title="喜欢旅游的...">喜欢旅游的...</p></td>
					<td><p>是</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><button  onclick="showEditOrderStatusDialog()" >编辑</button></td>
				</tr>
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>爱旅游</p></td>
					<td><p>旅游</p></td>
					<td><p title="喜欢旅游的...">喜欢旅游的...</p></td>
					<td><p>是</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><button  onclick="showEditOrderStatusDialog()" >编辑</button></td>
				</tr>
				
				
				
				
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
