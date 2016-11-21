<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>在线用户</title>
		<link rel="stylesheet" href="../css/content_4_1_1.css" />
		<link rel="stylesheet" href="../css/common.css" />
		<link rel="stylesheet" href="../css/ui.css" />
		<script type="text/javascript" src="../js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--强制下线-->
			<div id="forceLogout" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定强制下线所选用户</p>
				<button  onclick="hideForceLogoutDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideForceLogoutDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_4_1_1">
			<div id="ContentRightTitle_4_1_1">
				<button onclick="showForceLogoutDialog()" class="contentButton" id="btnDeleteClass" >强制下线</button>
				<input type="text" placeholder="搜索用户"></input>
				<img src="img/iv_search_query.png" />
			</div>
			
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>用户手机</p></td>
					<td><p>用户昵称</p></td>
					<td><p>用户性别</p></td>
					<td><p>账号余额</p></td>
					<td><p>用户头像</p></td>
					<td><p>修改时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td><input type="checkbox" /></td>
					<td><p>15288888888</p></td>
					<td><p>隔壁老王</p></td>
					<td><p title="男">男</p></td>
					<td><p>10098</p></td>
					<td><img src="img/calabash.png" /></td>
					<td><p>2016-09-21  10:10:50</p></td>
					<td><button  onclick="showUserDetailDialog()" >编辑</button></td>
				</tr>
				
				
				
				
				
				<tr>
					<td><input type="checkbox" /></td>
					<td><p>15244444444</p></td>
					<td><p>隔壁老宋</p></td>
					<td><p title="女">女</p></td>
					<td><p>40242</p></td>
					<td><img src="img/calabash.png" /></td>
					<td><p>2016-09-22   14:50:23</p></td>
					<td><button  onclick="showUserDetailDialog()" >编辑</button></td>
				</tr>
				
				
				
				
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
