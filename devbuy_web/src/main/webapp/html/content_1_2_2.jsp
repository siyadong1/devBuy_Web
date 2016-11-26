<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布商品</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_2_2.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>  
	</head>
	<body>
		
		
		
			
		<div id="body">
			<div id="pusblishGoods">
				<!--发布商品头部-->
				<div id="publishGoodsHeader">
					<p>发布商品</p>
				</div>
				<!--发布商品内容区域-->
				<form name="updateGoods"  encType="multipart/form-data" method="post"    >
					<table  cellpadding="10px">
						<tr>
							<td><input type="hidden" value="${items.itemsId}"  name="itemsId" /></td>
							<td><input type="hidden" value="${items.itemsname }" name="oldName" ></td>
						</tr>
						<tr>
							<td><p>商品名称</p></td>
							<td><input type="text" value="${items.itemsname }" name="itemsname" /></td>
						</tr>
						<tr>
							<td><p>商品类别</p></td>
							<td>
								<select id="selectContent_1_2_2" name="category"  >
									<c:forEach items="${classificationCustoms }" var="classificationCustom" >
										<c:choose >
										 <c:when  test="${classificationCustom.category == categorySelected}" >
										  <option value="${classificationCustom.category }"  selected="true" >${classificationCustom.cfName }</option>
										 </c:when>							
										 <c:otherwise>
										  <option value="${classificationCustom.category }" >${classificationCustom.cfName }</option>
										 </c:otherwise>						
										</c:choose>
									</c:forEach>
								</select>
							</td>
						</tr>
						
						<tr>
							<td><p>商品描述</p></td>
							<td><textarea  name="description" >${items.description }</textarea></td>
						</tr>
						
						
						
						<tr>
							<td><p>原价</p></td>
							<td><input type="text" name="price"  value="${items.price }" /></td>
						</tr>
						
						<tr>
							<td><p>促销价</p></td>
							<td><input type="text" name="currentPrice"  value="${items.currentPrice }" /></td>
						</tr>
						
						
						<tr>
							<td><p>库存</p></td>
							<td><input type="text"  name="inventory"  value="${items.inventory }"   /></td>
						</tr>
						
						
						
						
						<tr>
							<td><p>销量</p></td>
							<td><input type="text"  name="salesVolume"   value="${items.salesVolume }"  /></td>
						</tr>
						
						
						
						<tr>
							<td><p>产地</p></td>
							<td><input type="text" name="area"     value="${items.area }"  /></td>
						</tr>
						
						
						
						<tr>
							<td><p>快递费</p></td>
							<td><input type="text"  name="expressFee"      value="${items.expressFee }"  /></td>
						</tr>
						
						
						
						
						<tr>
							<td><p>商品图片</p></td>
							<td><input type="file"  name="itemsNewImage"     /></td>
						</tr>

					</table>
											
						<tr>
							<td ><img src="${items.image }"   /></td>
						</tr>

				</form>
				
					<tr>
						<td >
							<button onclick="updateItems('${devbuy_web_path}')" >确定修改</button>
						</td>
					</tr>
				
			</div>
			
			
			
			
			
		</div>
		
		
		
		
		
	</body>
</html>
