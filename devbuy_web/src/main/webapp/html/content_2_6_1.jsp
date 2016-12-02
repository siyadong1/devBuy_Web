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
				<button  onclick="confirmHideDeleteOrderStatusDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			
						
			<!--添加订单状态-->
			<div id="addOrderStatus" >
				<div><p id="updateOrAddOrderStatusTitle">添加订单状态</p></div>
				<form  name="updateOrderStatusAndAddOrderStatus" >
					<table  cellspacing="16px">
						<tr>
							<td><input type="hidden"  name="osId" id="osId"   /></td>
							<td><input type="hidden"  name="add" id="updateOrAddOrderStatusFlag"   /></td>
						</tr>
						<tr>
							<td><span class="text16px ">状态名</span></td>
							<td><input class="text16px" type="text"  placeholder="请输入状态名称" name="osName" id="osName"   /></td>
						</tr>
						<tr>
							<td><span class="text16px ">状态码</span></td>
							<td><input class="text16px" type="text"  placeholder="请输入状态码"  name="osCode"  id="osCode" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea name="osDescription"  id="osDescription"  class="text16px"></textarea></td>
						</tr>
					</table>
				</form>
				<button   onclick="hideAddOrderStatusDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   onclick="confirmHideAddOrderStatusDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
			</div>
				<!--模板内容区域右侧开始-->
		<div id="ContentRight_2_6_1">
			<div id="ContentRightTitle_2_6_1">
				<button onclick="showDeleteOrderStatusDialog()" class="contentButton" id="btnDeleteClass" >删除订单状态</button>
				<button onclick="showAddOrderStatusDialog()"   class="contentButton">添加订单状态</button>
			</div>
			<form  name="deleteOrderStatusIds" >
			<table>
				<tr>
					<td>  <input type="checkbox"  id="ck_content_2_6_1"   />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>状态名称</p></td>
					<td><p>状态码</p></td>
					<td><p>描述</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>操作</p></td>
				</tr>
				<c:forEach  items="${orderStatusCustoms}"   var="orderStatusCustom" >
				<tr>
					<td>  <input type="checkbox" class="orderStatusCK"    name="osIds" value="${orderStatusCustom.osId }"     /></td>
					<td><p>${orderStatusCustom.osName }</p></td>
					<td><p>${orderStatusCustom.osCode }</p></td>
					<td><p title="${orderStatusCustom.osDescription }">${orderStatusCustom.osDescription }</p></td>
					<td><p>${orderStatusCustom.osCreatetime }</p></td>
					<td><p>${orderStatusCustom.osModifytime }</p></td>
					<td><button   type="button"   onclick="showEditOrderStatusDialog('${devbuy_web_path}','${orderStatusCustom.osName }','${orderStatusCustom.osCode }','${orderStatusCustom.osDescription }','${orderStatusCustom.osId }')" >编辑</button></td>
				</tr>
				</c:forEach>
			</table>
			</form>
		</div>
		</div>
	</body>
	
	
	
	
		
	
	<script  type="text/javascript" >
	
	
	 $("#ck_content_2_6_1").change(function(){
		 
			if($("#ck_content_2_6_1").prop("checked")){
				  $(".orderStatusCK").each(function(){
					   $(this).prop("checked",true);
					  });
			}else{
				 $(".orderStatusCK").each(function(){
					 $(this).prop("checked",false);
					  });
			}
	 } );
	
	</script>
	
	
	
	
</html>
