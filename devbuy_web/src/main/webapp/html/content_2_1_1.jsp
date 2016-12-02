<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>全部订单/类别列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_2_1_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
		<script type="text/javascript" src="${devbuy_web_path}/js/content_2_1_1.js" ></script>
	</head>
	<body>
		<div id="body">
			
			<!--删除商品-->
			<div id="deleteAllOrder" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该订单</p>
				<button  onclick="hideDeleteAllOrderDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="confirmHideDeleteAllOrderDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
				<!--模板内容区域右侧开始-->
		<div id="ContentRight_2_1_1">
			<div id="ContentRightTitle_2_1_1">
				<button onclick="showDeleteAllOrderDialog()" class="contentButton" id="btnDeleteClass" >删除</button>
				<input type="text" placeholder="搜索用户名/订单号"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			<form  name="deleteAllOrdersIds" >
			<table>
				<tr>
					<td><input type="checkbox"   id="ck_content_2_1_1"  />  <p id="ContentRightFirtst_2_1_1">全选</p></td>
					<td><p>订单号</p></td>
					<td><p>用户名</p></td>
					<td><p>购买商品</p></td>
					<td><p>促销价</p></td>
					<td><p>原价</p></td>
					<td><p>类型</p></td>
					<td><p>总金额</p></td>
					<td><p>创建时间</p></td>
					<td><p>操作</p></td>
				</tr>
				<c:forEach   items="${ordersCustoms }"   var="ordersCustom" >
					<tr>
						<td>  <input type="checkbox"  class="AllOrdersCK" name="ordersIds"  value="${ordersCustom.ordersId}"     /></td>
						<td><p title="${ordersCustom.ordersId }" >${ordersCustom.ordersId }</p></td>
						<c:choose>
							<c:when test="${ordersCustom.user.nickname != null && ordersCustom.user.nickname != ''}" >
							<td><p>${ordersCustom.user.nickname }</p></td>
							</c:when>
							<c:otherwise>
							<td><p>${ordersCustom.user.username }</p></td>
							</c:otherwise>
						</c:choose>

						<td><p>${ordersCustom.orderDetailCustom.itemsCustom.itemsname }</p></td>
						<td><p>${ordersCustom.orderDetailCustom.itemsCustom.currentPrice }</p></td>
						<td><p>${ordersCustom.orderDetailCustom.itemsCustom.price }</p></td>
						<td><p>${ordersCustom.orderStateName }</p></td>
						<td><p>${ordersCustom.sum }</p></td>
						<td><p>${ordersCustom.createTime }</p></td>
						<td><button  type="button"  onclick="showEditAllOrderDialog('${devbuy_web_path}','${ordersCustom.ordersId}')"  >查看详情</button></td>
					</tr>
				</c:forEach>
			</table>
		</form>
		</div>
		</div>
	</body>
	
	
		
	
	<script  type="text/javascript" >
	 $("#ck_content_2_1_1").change(function(){
		 
			if($("#ck_content_2_1_1").prop("checked")){
				  $(".AllOrdersCK").each(function(){
					   $(this).prop("checked",true);
					  });
			}else{
				 $(".AllOrdersCK").each(function(){
					 $(this).prop("checked",false);
					  });
			}
	 } );
	
	</script>
	
	
	
	
</html>
