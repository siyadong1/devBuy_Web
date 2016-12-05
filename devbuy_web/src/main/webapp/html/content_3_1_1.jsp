<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>购物车列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_3_1_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
		<script type="text/javascript" src="${devbuy_web_path}/js/content_3_1_1.js" ></script>
	</head>
	<body>
		<div id="body">
			<!--删除类别-->
			<div id="deleteShoppingCar" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该购物车</p>
				<button  onclick="hideDeleteShoppingCarDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="confirmHideDeleteShoppingCarDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
				<!--模板内容区域右侧开始-->
		<div id="ContentRight_3_1_1">
			<div id="ContentRightTitle_3_1_1">
				<button onclick="showDeleteShoppingCarDialog()" class="contentButton" id="btnDeleteClass" >删除购物车记录</button>
				<input type="text" placeholder="请输入查询的用户"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			
			<form name="deleteShoppingcartRecordIds"     >
			<table>
				<tr>
					<td>  <input type="checkbox" id="ck_content_3_1_1"   />  <p id="ContentRightFirtst_3_1_1">全选</p></td>
					<td><p>订单号</p></td>
					<td><p>所属买家</p></td>
					<td><p>商家昵称</p></td>
					<td><p>商品名称</p></td>
					<td><p>商品数</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<c:forEach items="${shoppingcartRecordCustoms }"  var="shoppingcartRecordCustom"  >
				<tr>
					<td>  <input type="checkbox"   class="shoppingcartRecordCK" name="cartIds"  value="${shoppingcartRecordCustom.cartId}"  /></td>
					<td><p>${shoppingcartRecordCustom.cartId }</p></td>
					<td><p title="${shoppingcartRecordCustom.userCustom.nickname }">${shoppingcartRecordCustom.userCustom.username }</p></td>
					<td><p>${shoppingcartRecordCustom.userCustom.nickname }</p></td>
					<td><p>${shoppingcartRecordCustom.itemsCustom.itemsname }</p></td>
					<td><p>${shoppingcartRecordCustom.itemsNum }</p></td>
					<td><button  type="button"  onclick="showShoppingCarRecordDetail('${devbuy_web_path}','${shoppingcartRecordCustom.cartId }')" >查看详情</button></td>
				</tr>
				</c:forEach>
			</table>
			</form>
		</div>
		</div>
	</body>
	
	
	
	
		
	
	<script  type="text/javascript" >
	
	
	 $("#ck_content_3_1_1").change(function(){
		 
			if($("#ck_content_3_1_1").prop("checked")){
				  $(".shoppingcartRecordCK").each(function(){
					   $(this).prop("checked",true);
					  });
			}else{
				 $(".shoppingcartRecordCK").each(function(){
					 $(this).prop("checked",false);
					  });
			}
	 } );
	
	</script>
	
	
	
	
	
</html>
