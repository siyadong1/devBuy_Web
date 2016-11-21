<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>导航列表</title>
		<link rel="stylesheet" href="../css/content_1_4_1.css" />
		<link rel="stylesheet" href="../css/common.css" />
		<link rel="stylesheet" href="../css/ui.css" />
		<script type="text/javascript" src="../js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除类别-->
			<div id="deleteNavigator" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该首页导航</p>
				<button  onclick="hideDeleteNavigatorDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteNavigatorDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			
						
			<!--添加商品-->
			<div id="addNavigator" >
				<div><p>添加首页导航</p></div>
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
							<td><span class="text16px ">是否显示</span></td>
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
				<button   onclick="hideAddNavigatorDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   onclick="hideAddNavigatorDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
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
					<td><p>所属类别</p></td>
					<td><p>描述</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>图书</p></td>
					<td><p>电器</p></td>
					<td><p title="这是一个图书的类型的分类">这是一本图书</p></td>
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
