<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布商品</title>
		<link rel="stylesheet" href="../css/content_1_2_2.css" />
	</head>
	<body>
		
		
		
			
		<div id="body">
			<div id="pusblishGoods">
				<!--发布商品头部-->
				<div id="publishGoodsHeader">
					<p>发布商品</p>
				</div>
				<!--发布商品内容区域-->
				<form>
					<table  cellpadding="10px">
						<tr>
							<td><p>商品名称</p></td>
							<td><input type="text" value="${items.itemsname }" /></td>
						</tr>
						<tr>
							<td><p>商品类别</p></td>
							<td>
								<select id="selectContent_1_2_2">
									<option>图书</option>
									<option>手机</option>
									<option>品牌男装</option>
									<option>电器</option>
								</select>
							</td>
						</tr>
						
						<tr>
							<td><p>商品描述</p></td>
							<td><textarea>${items.description }</textarea></td>
						</tr>
						
						
						
						<tr>
							<td><p>原价</p></td>
							<td><input type="text"  value="${items.price }" /></td>
						</tr>
						
						<tr>
							<td><p>促销价</p></td>
							<td><input type="text"   value="${items.currentPrice }" /></td>
						</tr>
						
						
						<tr>
							<td><p>库存</p></td>
							<td><input type="text" value="${items.inventory }"   /></td>
						</tr>
						
						
						
						
						<tr>
							<td><p>销量</p></td>
							<td><input type="text" value="${items.salesVolume }"  /></td>
						</tr>
						
						
						
						<tr>
							<td><p>产地</p></td>
							<td><input type="text" value="${items.area }"  /></td>
						</tr>
						
						
						
						<tr>
							<td><p>快递费</p></td>
							<td><input type="text"  value="${items.expressFee }"  /></td>
						</tr>
						
						
						
						
						<tr>
							<td><p>商品图片</p></td>
							<td><input type="file"   /></td>
						</tr>

					</table>
											
						<tr>
							<td ><img src="${items.image }"   /></td>
						</tr>

				</form>
				
					<tr>
						<td >
							<input  type="submit" />
						</td>
					</tr>
				
			</div>
			
			
			
			
			
		</div>
		
		
		
		
		
	</body>
</html>
