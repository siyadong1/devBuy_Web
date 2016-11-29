<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>轮播列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_3_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/content_1_3_1.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>  
	</head>
	<body>
		

		<div id="body">
			
			<!--删除商品-->
			<div id="deleteBannerGoods" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该广告栏</p>
				<button  onclick="hideDeleteBannerGoodsDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="confirmDeleteBannerGoodsDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
				<!--模板内容区域右侧开始-->
				
		<div id="ContentRight_1_3_1">
			<div id="ContentRightTitle_1_3_1">
				<button onclick="showDeleteBannerGoodsDialog()" class="contentButton" id="btnDeleteClass" >删除商品</button>
				<button onclick="showAddBannerGoodsDialog('${devbuy_web_path}')"   class="contentButton">添加商品</button>
			</div>
			
			
		
		<form name="deleteBannerIds" >
		
			<table>
				<tr>
					<td>  <input type="checkbox"  id="ck_content_1_3_1"    />  <p id="ContentRightFirtst_1_3_1">全选</p></td>
					<td><p>Banner名称</p></td>
					<td><p>所属类别</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>是否显示</p></td>
					<td><p>编辑</p></td>
				</tr>
				
				
				<c:forEach  items="${bannerCustoms }" var="bannerCustom">			
				<tr>
					<td>  <input type="checkbox"    class="bannerCK" name="bnIds"  value="${bannerCustom.bnId}" /></td>
					<td><p>${bannerCustom.bnName }</p></td>
					<td><p>${bannerCustom.itemsCustom.cfName }</p></td>
					<td><p>${bannerCustom.bnCreatetime }</p></td>
					<td><p>${bannerCustom.bnModifytime }</p></td>
					<td><p>
						<c:choose>
							<c:when test="${bannerCustom.bnShow == '0' }" >
							是
							</c:when>
							<c:otherwise>
							否
							</c:otherwise>
						</c:choose>
						</p>
					</td>
					<td><button type="button" onclick="showEditBannerGoodsDialog('${devbuy_web_path}','${bannerCustom.bnId}')">编辑</button></td>
				</tr>
				</c:forEach>	
				
			</table>
		
		
		</form>
		
		
		
		</div>
		</div>
	</body>
	
	
	
	
	
	<script  type="text/javascript" >
	
	
	 $("#ck_content_1_3_1").change(function(){
		 
			if($("#ck_content_1_3_1").prop("checked")){
				  $(".bannerCK").each(function(){
					   $(this).prop("checked",true);
					  });
			}else{
				 $(".bannerCK").each(function(){
					 $(this).prop("checked",false);
					  });
			}
	 } );
	
	</script>
	
	
	
	
</html>
