<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布商品</title>
				<link rel="stylesheet" href="${devbuy_web_path}/css/orderDetail.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>  
	</head>
	<body>
		<div id="body">
			<div id="updateOrderStatus">
				<!--发布商品头部-->
				<div id="updateOrderStatusHeader">
					<p>编辑订单</p>
				</div>
				<!--发布商品内容区域-->
				<form name="updateOrdersDetail"  >
					<table  cellpadding="10px">
						<tr>
							<td><p style="color:red">注意事项：</p></td>
							<td><p style="color:red" >只可修改订单类型！</p></td>
						</tr>
						<tr>
							<td><p>订单编号</p></td>
							<td><input type="text"  value="${ordersCustom.ordersId }"   readonly="true" name="ordersId" ></td>
						</tr>
						<tr>
							<td><p>所属用户</p></td>
								<c:choose>
									<c:when test="${ordersCustom.user.nickname != null && ordersCustom.user.nickname != ''}" >
									<td><input readonly="true"  type="text"  value="${ordersCustom.user.nickname }"  ></input></td>
									</c:when>
									<c:otherwise>
									<td><input readonly="true"  type="text" value="${ordersCustom.user.username }" ></input></td>
									</c:otherwise>
								</c:choose>
						</tr>
						<tr>
							<td><p>商品名称</p></td>
							<td><input type="text" readonly="true"  value="${ordersCustom.orderDetailCustom.itemsCustom.itemsname }"    /></td>
						</tr>
						
						<tr>
							<td><p>商品类别</p></td>
							<td><input type="text" readonly="true"  value="${ordersCustom.orderDetailCustom.itemsCustom.cfName }"    /></td>
						</tr>
						
						<tr>
							<td><p>商品描述</p></td>
							<td><textarea readonly="true"   >${ordersCustom.orderDetailCustom.itemsCustom.description }</textarea></td>
						</tr>
						
						
						
						<tr>
							<td><p>原价</p></td>
							<td><input readonly="true"    type="text" value="${ordersCustom.orderDetailCustom.itemsCustom.price }"/></td>
						</tr>
						
						<tr>
							<td><p>促销价</p></td>
							<td><input  readonly="true"   type="text" value="${ordersCustom.orderDetailCustom.itemsCustom.currentPrice }"/></td>
						</tr>
						
						
						<tr>
							<td><p>库存</p></td>
							<td><input readonly="true"    type="text"value="${ordersCustom.orderDetailCustom.itemsCustom.inventory }" /></td>
						</tr>
						
						
						
						
						<tr>
							<td><p>销量</p></td>
							<td><input  readonly="true"    type="text" value="${ordersCustom.orderDetailCustom.itemsNum }" /></td>
						</tr>
						
						
						
						<tr>
							<td><p>产地</p></td>
							<td><input  readonly="true"    type="text" value="${ordersCustom.orderDetailCustom.itemsCustom.area }" /></td>
						</tr>
						
						
						
						<tr>
							<td><p>快递费</p></td>
							<td><input  readonly="true"    type="text" value="${ordersCustom.orderDetailCustom.itemsCustom.expressFee }" /></td>
						</tr>
						
												
						
						<tr>
							<td><p>总数量</p></td>
							<td><input  readonly="true"    type="text" value="${ordersCustom.orderDetailCustom.itemsNum }" /></td>
						</tr>
						
												
						
						<tr>
							<td><p>总金额</p></td>
							<td><input  readonly="true"    type="text" value="${ordersCustom.sum }" /></td>
						</tr>
						
						
						<tr>
							<td><p style="color:red" >订单类型</p></td>
							<td>
								<select id="select_orderdetail" name="state"  >
									<c:forEach items="${orderStatusCustoms }" var="orderStatusCustom" >
										<c:choose >
										 <c:when  test="${orderStatusCustom.osCode == ordersCustom.state}" >
										  <option value="${orderStatusCustom.osCode}"  selected="true" >${orderStatusCustom.osName}</option>
										 </c:when>							
										 <c:otherwise>
										  <option value="${orderStatusCustom.osCode}" >${orderStatusCustom.osName}</option>
										 </c:otherwise>						
										</c:choose>
									</c:forEach>
								</select>
							</td>
						</tr>
						
						
						
						<tr>
							<td><p>收货地址</p></td>
							<td><input readonly="true"    type="text" value="${ordersCustom.address.province}${ordersCustom.address.city}${ordersCustom.address.detailAddress}" /></td>
						</tr>
						
						
						<tr>
							<td><p>联系人</p></td>
							<td><input readonly="true"    type="text" value="${ordersCustom.address.consigneeName }" /></td>
						</tr>
						
						<tr>
							<td><p>联系电话</p></td>
							<td><input readonly="true"    type="text" value="${ordersCustom.address.phoneNumber }" /></td>
						</tr>

					</table>
						<tr>
							<td ><img src="${ordersCustom.orderDetailCustom.itemsCustom.image} " /></td>
						</tr>
				</form>
					<tr>
						<td >
							<button type="button"  onclick="confirmUpdateOrders('${devbuy_web_path}')"  >确定修改</button>
						</td>
					</tr>
			</div>
		</div>
	</body>
	
	
	
	
	
	<script type="text/javascript">
	
	
	function confirmUpdateOrders(devbuy_web_path){
		var index = layer.load(1, {
			  shade: [0.1,'#fff'] //0.1透明度的白色背景
			});
		 var form = $("form[name=updateOrdersDetail]");  
	     var options  = {    
	         url:devbuy_web_path + '/java/manageplatform/updateOrdersStateByPrimaryKey.action',    
	         type:'post',    
	         success:function(data)    
	         {   
	        	 layer.close(index);    
	             if(data.code != "000000"){  
	                 var message = data.message;  
	                 layer.alert(message, {icon: 2});
	             }else{
	            	 var message = data.message;  
	            	 layer.msg(message,{time:1000}); 
						$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllOrders.action")
	             } 
	         } ,
		     error:function(data)    
		     {    
			 	 layer.close(index);    
		         layer.alert("连接服务器失败！", {icon: 2});
		     }

	     };    
	     form.ajaxSubmit(options);  
		
		
		
		
		
	}
	
	</script>
	
	
	
</html>
