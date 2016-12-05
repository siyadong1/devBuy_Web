<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>在线用户</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_4_1_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
		<script type="text/javascript" src="${devbuy_web_path}/js/content_4_1_1.js" ></script>
	</head>
	<body>
		<div id="body">
			
			<!--强制下线-->
			<div id="deleteUserList" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除所选用户</p>
				<button  onclick="hideDeleteUserListDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="confirmHideDeleteUserListDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
				<!--模板内容区域右侧开始-->
				
		<div id="ContentRight_4_1_1">
			<div id="ContentRightTitle_4_1_1">
				<button onclick="showDeleteUserListDialog()" class="contentButton" id="btnDeleteClass" >删除用户</button>
				<input type="text" placeholder="搜索用户"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			
			<form name="deleteUserByIds" >
			<table>
				<tr>
					<td>  <input type="checkbox"  id="ck_content_4_1_1"    />  <p id="ContentRightFirtst_4_1_1">全选</p></td>
					<td><p>用户手机</p></td>
					<td><p>用户昵称</p></td>
					<td><p>用户性别</p></td>
					<td><p>账号余额</p></td>
					<td><p>用户头像</p></td>
					<td><p>注册时间</p></td>
					<td><p>操作</p></td>
				</tr>
				<c:forEach  items="${userCustoms }"  var="userCustom" >
					<tr>
					<td><input type="checkbox"   class="userCK" name="userIds"  value="${userCustom.userId}"     /></td>
					<td><p>${userCustom.username }</p></td>
					<td><p>${userCustom.nickname }</p></td>
					<td><p title="${userCustom.gender }">${userCustom.gender }</p></td>
					<td><p>${userCustom.balance }</p></td>
					<td><img src="${userCustom.avatar }" /></td>
					<td><p>${userCustom.regtime }</p></td>
					<td><button   type="button"   onclick="showUserDetailDialog('${devbuy_web_path}','${userCustom.userId }')" >编辑</button></td>
				</tr>
				</c:forEach>
			</table>
			</form>
		</div>
		</div>
	</body>
	
	
	
	
		
	
	<script  type="text/javascript" >
	
	
	 $("#ck_content_4_1_1").change(function(){
		 
			if($("#ck_content_4_1_1").prop("checked")){
				  $(".userCK").each(function(){
					   $(this).prop("checked",true);
					  });
			}else{
				 $(".userCK").each(function(){
					 $(this).prop("checked",false);
					  });
			}
	 } );
	
	</script>
	
	
</html>
