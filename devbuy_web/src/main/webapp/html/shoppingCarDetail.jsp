<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布商品</title>
	<link rel="stylesheet" href="${devbuy_web_path}/css/shoppingCarDetail.css" />	
	</head>
	<body>
		<div id="body">
			<div id="shoppingCarDetail">
				<!--发布商品头部-->
				<div id="shoppingCarDetailHeader">
					<p>购物车详情</p>
				</div>
				<!--发布商品内容区域-->
				<form>
					<table  cellpadding="10px">
						<tr>
							<td><p>订单编号</p></td>
							<td><input type="text" value="${shoppingcartRecordCustoms.cartId }"  /></td>
						</tr>
						<tr>
							<td><p>所属用户</p></td>
							<td><input type="text" value="${shoppingcartRecordCustoms.userCustom.username }" /></td>
						</tr>
						<tr>
							<td><p>商品名称</p></td>
							<td><input type="text"  value="${shoppingcartRecordCustoms.itemsCustom.itemsname }"/></td>
						</tr>
						<tr>
							<td><p>商品类别</p></td>
							<td>
						<input type="text"  value="${shoppingcartRecordCustoms.itemsCustom.cfName }"/>
							</td>
						</tr>
						<tr>
							<td><p>商品描述</p></td>
							<td><textarea>${shoppingcartRecordCustoms.itemsCustom.description}</textarea></td>
						</tr>
						<tr>
							<td><p>原价</p></td>
							<td><input type="text" value="${shoppingcartRecordCustoms.itemsCustom.price}"/></td>
						</tr>
						
						<tr>
							<td><p>促销价</p></td>
							<td><input type="text" value="${shoppingcartRecordCustoms.itemsCustom.currentPrice}"/></td>
						</tr>
						<tr>
							<td><p>库存</p></td>
							<td><input type="text"value="${shoppingcartRecordCustoms.itemsCustom.inventory}" /></td>
						</tr>
						<tr>
							<td><p>销量</p></td>
							<td><input type="text" value="${shoppingcartRecordCustoms.itemsCustom.salesVolume}" /></td>
						</tr>
						<tr>
							<td><p>产地</p></td>
							<td><input type="text" value="${shoppingcartRecordCustoms.itemsCustom.area}" /></td>
						</tr>
						<tr>
							<td><p>快递费</p></td>
							<td><input type="text" value="${shoppingcartRecordCustoms.itemsCustom.expressFee}" /></td>
						</tr>
						<tr>
							<td><p>商品图片</p></td>
						</tr>

					</table>
											
						<tr>
							<td ><img src="${shoppingcartRecordCustoms.itemsCustom.image}" /></td>
						</tr>

				</form>
				
					<tr>
						<td >
							<button  type="button"   onclick="goShoppingcartRecordHome('${devbuy_web_path}')" >确定</button>
						</td>
					</tr>
				
			</div>
		</div>
	</body>
	
	
	
	<script type="text/javascript" >
	
	function goShoppingcartRecordHome(devbuy_web_path){
		$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllShoppingcartRecord.action")
	}
	
	</script>
	
	
	
</html>
