<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>推荐列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_5_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/content_1_5_1.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>  
	</head>
	<body>

		<div id="body">
			
			<!--删除类别-->
			<div id="deleteRecommend" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该首页推荐</p>
				<button  onclick="hideDeleteRecommendDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteRecommendDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
			
				<!--模板内容区域右侧开始-->
				
		<div id="ContentRight_1_5_1">
			<div id="ContentRightTitle_1_5_1">
				<button onclick="showDeleteRecommendDialog()" class="contentButton" id="btnDeleteClass" >删除推荐</button>
				<button onclick="showAddRecommendDialog()"   class="contentButton">添加推荐</button>
			</div>
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>推荐标题</p></td>
					<td><p>推荐名称</p></td>
					<td><p>描述</p></td>
					<td><p>是否大图</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<c:forEach  items="${recommendCustoms }" var="recommendCustom" >
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>${recommendCustom.rcCategory }</p></td>
					<td><p>${recommendCustom.rcName }</p></td>
					<td><p title="${recommendCustom.itemsCustom.description }">${recommendCustom.itemsCustom.description }</p></td>
					<td><p>
					
					<c:choose>
					
					<c:when  test="${recommendCustom.rcIslarge == '0'}" >
					是
					</c:when>
					<c:otherwise>
					否					
					</c:otherwise>
					
					
					</c:choose>
					
					</p></td>
					<td><p>${recommendCustom.rcCreatetime }</p></td>
					<td><p>${recommendCustom.rcModifytime }</p></td>
					<td><button type="button" onclick="showEditRecommendDialog('${devbuy_web_path}','${recommendCustom.rcId}')" >编辑</button></td>
				</tr>
				</c:forEach>
			</table>
		</div>
		</div>


	</body>
</html>
