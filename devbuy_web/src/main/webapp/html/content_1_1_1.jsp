<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>类别列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_1_1.css" /> 
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script>  
	</head>
	<body>
		

		<div id="body">
			
			<!--删除类别-->
			<div id="deleteCategory" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除该类别</p>
				<button  onclick="hideDeleteCategoryDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="confirmDeleteCategoryDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--新增类别-->
			
			<div id="addCategory" >
				<div><p>新增分类</p></div>
				
				<form  name="addCategory" encType="multipart/form-data" method="post" >
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">名称</span></td>
							<td><input class="text16px" type="text" id="" placeholder="请输入类别名" name="cfName" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">图标</span></td>
							<td><input type="file" class="text16px" name=cfUrlFile  /></td>
						</tr>
						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"  name="cfDes" placeholder="请输入该类别的描述信息"  ></textarea></td>
						</tr>
						
					</table>
				</form>
				<button  onclick="hideAddCategoryDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button  onclick="confirmHideAddCategoryDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
			<!--编辑类别-->
			
			<div id="editCategory" >
				<div><p>编辑类别</p></div>
				
				<form name="editCategory" action="${devbuy_web_path}/java/manageplatform/updateClassificationById.action" method="post" encType="multipart/form-data" >
					<table  cellspacing="16px">
						<tr>
							<td>
								<input type="hidden" name="cfId" id="editCategoryCfId"  />
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">名称</span></td>
							<td><input class="text16px" type="text" id="editCategoryName" name="cfName" readonly="readonly"  /></td>
						</tr>
						<tr>
							<td><span class="text16px ">图标</span></td>
							<td><input type="file" class="text16px"  id="editCategoryIcon"  name=cfUrlFile /></td>
						</tr>
						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea class="text16px"  id="editCategoryDesc" name="cfDes"  ></textarea></td>
						</tr>
					</table>
				</form>
				<button  onclick="hideEditCategoryDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button  onclick="confirmHideEditCategoryDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_1_1_1">
			<div id="ContentRightTitle_1_1_1">
				<button onclick="showDeleteCategoryDialog()" class="contentButton" id="btnDeleteClass" >删除类别</button>
				<button onclick="showAddCategoryDialog()"   class="contentButton">新增类别</button>
				<input type="text" placeholder="搜索类别"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			
				<form name="deleteCategoryIds" >
			<table>
				<tr>
					<td>  <input type="checkbox"  id="ck_content_1_1_1" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>名称</p></td>
					<td><p>描述</p></td>
					<td><p>创建时间</p></td>
					<td><p>修改时间</p></td>
					<td><p>图标</p></td>
					<td><p>编辑类别</p></td>
				</tr>
					<c:forEach items="${classificationCustoms }"  var="classificationCustom">
				      <tr >
						<td><input   class="classificationCK"  type="checkbox"  name="cfIds" value="${classificationCustom.cfId}" /></td>
						<td><p>${classificationCustom.cfName }</p></td>
						<td><p title="这是一个手机的类型的分类">${classificationCustom.cfDes }</p></td>
						<td><p>${classificationCustom.cfCreatetime }</p></td>
						<td><p>${classificationCustom.cfModifytime }</p></td>
						<td><img src="${classificationCustom.cfUrl }"/></td>
						<td><button type="button" onclick="showEditCategoryDialog('${classificationCustom.cfName }','${classificationCustom.cfDes }','${classificationCustom.cfId }')">编辑</button></td>
				     </tr>
				</c:forEach>
			</table>
			</form>
		</div>
		</div>


	</body>
	
	
	
	<script  type="text/javascript" > 

		$(function() {
			
			
			
			
	$("#ck_content_1_1_1").change(
			
	function(){
		
		
		if($("#ck_content_1_1_1").prop("checked")){
			  $(".classificationCK").each(function(){
				   $(this).prop("checked",true);
				  });
		}else{
			 $(".classificationCK").each(function(){
				 $(this).prop("checked",false);
				  });
		}
		
	}
	
	);			
			
			
			
		});
	</script>
	
</html>
