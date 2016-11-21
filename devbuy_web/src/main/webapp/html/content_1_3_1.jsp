<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>轮播列表</title>
		<link rel="stylesheet" href="../css/content_1_3_1.css" />
		<link rel="stylesheet" href="../css/common.css" />
		<link rel="stylesheet" href="../css/ui.css" />
		<script type="text/javascript" src="../js/content_1_3_1.js" ></script>
		<script type="text/javascript" src="../js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除商品-->
			<div id="deleteBannerGoods" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该广告栏</p>
				<button  onclick="hideDeleteBannerGoodsDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteBannerGoodsDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--添加商品-->
			
			<div id="addBannerGoods" >
				<div><p>添加广告栏</p></div>
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">商品名称</span></td>
							<td><input class="text16px" type="text" id="" placeholder="苹果6s" /></td>
						</tr>

						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否显示</span></td>
							<td>
								<select>
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">图标</span></td>
							<td><input type="file" class="text16px" /></td>
						</tr>
					</table>
				</form>
				<button   onclick="hideAddBannerGoodsDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   onclick="hideAddBannerGoodsDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
			</div>
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_1_3_1">
			<div id="ContentRightTitle_1_3_1">
				<button onclick="showDeleteBannerGoodsDialog()" class="contentButton" id="btnDeleteClass" >删除商品</button>
				<button onclick="showAddBannerGoodsDialog()"   class="contentButton">添加商品</button>
			</div>
			
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_3_1">全选</p></td>
					<td><p>名称</p></td>
					<td><p>所属类别</p></td>
					<td><p>商品描述</p></td>
					<td><p>是否显示</p></td>
					<td><p>编辑</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>iPhone7</p></td>
					<td><p>手机</p></td>
					<td><p title="这是一部由苹果 ...">这是一部…</p></td>
					<td><p>是</p></td>
					<td><button  onclick="showEditBannerGoodsDialog()">编辑</button></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>围城</p></td>
					<td><p>图书</p></td>
					<td><p title="这是一部经典的...">这是一部经典的...</p></td>
					<td><p>是</p></td>
					<td><button  onclick="showEditBannerGoodsDialog()">编辑</button></td>
				</tr>
				
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
