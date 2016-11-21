<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布导航</title>
		<link rel="stylesheet" href="../css/content_1_4_2.css" />
	</head>
	<body>
		
		
		
			
		<div id="body">
			<div id="pusblishNavigator">
				<!--发布商品头部-->
				<div id="publishNavigatorHeader">
					<p>添加首页导航</p>
				</div>
				<!--发布商品内容区域-->
				<form>
					<table  cellpadding="10px">
						<tr>
							<td><p>商品名称</p></td>
							<td><input type="text" placeholder="电脑" /></td>
						</tr>

						
						<tr>
							<td><p>描述</p></td>
							<td><textarea></textarea></td>
						</tr>
						
						<tr>
							<td><p>是否显示</p></td>
							<td>
								<select id="selectContent_1_4_2">
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						
						<tr>
							<td><p>商品图片</p></td>
							<td><input type="file" /></td>
						</tr>

					</table>
											
						<tr>
							<td ><img src="img/calabash.png" /></td>
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
