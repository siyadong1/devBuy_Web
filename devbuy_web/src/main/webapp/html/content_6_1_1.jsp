<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>管理员列表</title>
		<link rel="stylesheet" href="../css/content_6_1_1.css" />
		<link rel="stylesheet" href="../css/common.css" />
		<link rel="stylesheet" href="../css/ui.css" />
		<script type="text/javascript" src="../js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除商品-->
			<div id="deleteManager" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除所选管理员</p>
				<button  onclick="hideDeleteManagerDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteManagerDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--添加管理员-->
			
				<div id="addManager" >
				<div><p>添加管理员</p></div>
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">账号</span></td>
							<td><input class="text16px" type="text" id="" placeholder="test1" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">密码</span></td>
							<td><input class="text16px" type="text" id="" placeholder="test1" /></td>
						</tr>

						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否是超级管理员</span></td>
							<td>
								<select>
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">父管理员</span></td>
							<td><input class="text16px" type="text" id="" placeholder="admin" /></td>
						</tr>
					</table>
				</form>
				<button   onclick="hideAddManagerDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   onclick="hideAddManagerDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
			</div>
			
			
			
			
			
			
			
			<!--查看详情-->
			
				<div id="editManagerDetail" >
				<div><p>查看详情</p></div>
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">账号</span></td>
							<td><input class="text16px" type="text" id="" placeholder="test1" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">密码</span></td>
							<td><input class="text16px" type="text" id="" placeholder="test1" /></td>
						</tr>

						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否是超级管理员</span></td>
							<td>
								<select>
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">父管理员</span></td>
							<td><input class="text16px" type="text" id="" placeholder="admin" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">子账号个数</span></td>
							<td><input class="text16px" type="text" id="" placeholder="3" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">注册时间</span></td>
							<td><input class="text16px" type="text" id="" placeholder="2016-09-22   17:04:23" /></td>
						</tr>
					</table>
				</form>
				<button   onclick="hideEditManagerDetailDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   onclick="hideEditManagerDetailDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
			</div>
			
			
			
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_6_1_1">
			<div id="ContentRightTitle_6_1_1">
				<button onclick="showDeleteManagerDialog()" class="contentButton" id="btnDeleteClass" >删除</button>
				<button onclick="showAddManagerDialog()"   class="contentButton">添加</button>
				<input type="text" placeholder="搜索管理员"></input>
				<img src="img/iv_search_query.png" />
			</div>
			
			
			<table>
				<tr>
					<td><input type="checkbox" />  <p id="ContentRightFirtst_1_2_1">全选</p></td>
					<td><p>管理员账号</p></td>
					<td><p>管理员密码</p></td>
					<td><p>描述</p></td>
					<td><p>是否是高级管理员</p></td>
					<td><p>创建子账号个数</p></td>
					<td><p>父管理员</p></td>
					<td><p>创建时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>admin</p></td>
					<td><p title="管理员密码">admin</p></td>
					<td><p>这是超级管理员</p></td>
					<td><p>是</p></td>
					<td><p>3</p></td>
					<td><p>admin</p></td>
					<td><p>2016-09-21   15:25:25</p></td>
					<td><button  onclick="showEditManagerDetailDialog()"  >编辑</button></td>
				</tr>
				
				
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>syd</p></td>
					<td><p title="管理员密码">123456</p></td>
					<td><p>测试</p></td>
					<td><p>否</p></td>
					<td><p>0</p></td>
					<td><p>admin</p></td>
					<td><p>2016-09-21   15:25:25</p></td>
					<td><button  onclick="showEditManagerDetailDialog()"  >编辑</button></td>
				</tr>
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
