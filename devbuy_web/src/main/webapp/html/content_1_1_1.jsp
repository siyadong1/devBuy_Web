<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>类别列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_1_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除类别-->
			<div id="deleteCategory" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该类别</p>
				<button  onclick="hideDeleteCategoryDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteCategoryDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--新增类别-->
			
			<div id="addCategory" >
				<div><p>新增分类</p></div>
				
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">名称</span></td>
							<td><input class="text16px" type="text" id="" placeholder="图书" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">图标</span></td>
							<td><input type="file" class="text16px" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
					</table>
				</form>
				<button  onclick="hideAddCategoryDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button  onclick="hideAddCategoryDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
			<!--编辑类别-->
			
			<div id="editCategory" >
				<div><p>编辑类别</p></div>
				
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">名称</span></td>
							<td><input class="text16px" type="text" id="" placeholder="图书" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">图标</span></td>
							<td><input type="file" class="text16px" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
					</table>
				</form>
				<button  onclick="hideEditCategoryDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button  onclick="hideEditCategoryDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_1_1_1">
			<div id="ContentRightTitle_1_1_1">
				<button onclick="showDeleteCategoryDialog()" class="contentButton" id="btnDeleteClass" >删除类别</button>
				<button onclick="showAddCategoryDialog()"   class="contentButton">新增类别</button>
				<button onclick="showEditCategoryDialog()"  class="contentButton">编辑类别</button>
				<input type="text" placeholder="搜索类别"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>名称</p></td>
					<td><p>描述</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>图标</p></td>
					<td><p>查看子类别</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>图书</p></td>
					<td><p title="这是一个图书的类型的分类">这是一个…</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><img src="${devbuy_web_path}/img/iv_book.png"/></td>
					<td><button>查看子类别</button></td>
				</tr>
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>手机</p></td>
					<td><p title="这是一个手机的类型的分类">这是一部…</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><img src="${devbuy_web_path}/img/iv_phone.png"/></td>
					<td><button>查看子类别</button></td>
				</tr>
				
				
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>手机</p></td>
					<td><p title="这是一个手机的类型的分类">这是一部…</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><img src="${devbuy_web_path}/img/iv_phone.png"/></td>
					<td><button>查看子类别</button></td>
				</tr>
				
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
