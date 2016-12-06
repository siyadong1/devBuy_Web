<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>版本列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_6_2_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
		<script type="text/javascript" src="${devbuy_web_path}/js/content_6_2_1.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除版本-->
			<div id="deleteVersion" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除所选版本</p>
				<button  onclick="hideDeleteVersionDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="confirmHideDeleteVersionDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--新增版本-->
			
			<div id="addVersion" >
				<div><p>新增版本</p></div>
				
				<form  name="addVersion" encType="multipart/form-data" >
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">版本名称</span></td>
							<td><input class="text16px" type="text" name="appversionName" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本名</span></td>
							<td><input class="text16px" type="text" id="" name="appversionVersionName"  /></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本号</span></td>
							<td><input class="text16px" type="text" id="" name="appversionVersionCode"  /></td>
						</tr>
						<tr>
							<td><span class="text16px ">上传版本</span></td>
							<td><input type="file" class="text16px" name="appversionFile" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否显示</span></td>
							<td>
								<select name="appversionShow">
									<option value="0">是</option>
									<option value="1">否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">版本说明</span></td>
							<td><textarea class="text16px" name="appversionDescription"  ></textarea></td>
						</tr>
					</table>
				</form>
				<button   type="button"  onclick="hideAddVersionDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   type="button"  onclick="confirmHideAddVersionDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
			<!--编辑版本-->
			
						
			<div id="editVersion"   >
				<div><p>编辑版本</p></div>
				
				<form  name="editVersion" encType="multipart/form-data" >
					<table  cellspacing="16px">
						<tr>
							<td><input type="hidden" id="editVersionAppversionId" name="appversionId"/></td>
							<td><input type="hidden" id="editVersionOldAppversionName" name="oldAppversionName"/></td>
							<td><input type="hidden" id="editVersionOldAppversionVersionCode" name="oldAppversionVersionCode"/></td>
							<td><input type="hidden" id="editVersionOldAppversionVersionName" name="oldAppversionVersionName"/></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本名称</span></td>
							<td><input class="text16px" type="text" id="editVersionAppversionName" name="appversionName"/></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本名</span></td>
							<td><input class="text16px" type="text" id="editVersionAppversionVersionName" name="appversionVersionName"  /></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本号</span></td>
							<td><input class="text16px" type="text" id="editVersionAppversionVersionCode" name="appversionVersionCode"  /></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否显示</span></td>
							<td>
								<select name="appversionShow" id="editVersionAppversionShow"  >
									<option value="0" >是</option>
									<option value="1" >否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px" >创建时间</span></td>
							<td><input class="text16px" type="text" id="editVersionAppversionCreatetime" name="appversionCreatetime"  /></td>
						</tr>
						
						<tr>
							<td><span class="text16px ">修改时间</span></td>
							<td><input class="text16px" type="text" id="editVersionAppversionModifytime" name="appversionModifytime"  /></td>
						</tr>
						
						<tr>
							<td><span class="text16px ">版本说明</span></td>
							<td><textarea class="text16px"  id="editVersionAppversionDescription"    name="appversionDescription" ></textarea></td>
						</tr>
						
					</table>
				</form>
				<button  onclick="hideEditVersionDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button  onclick="confirmHideEditVersionDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_6_2_1">
			<div id="ContentRightTitle_6_2_1">
				<button onclick="showDeleteVersionDialog()" class="contentButton" id="btnDeleteClass" >删除</button>
				<button onclick="showAddVersionDialog()"   class="contentButton">新增</button>
				<input type="text" placeholder="搜索版本"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			
			<form name="deleteAppversionIds"   >
			<table>
				<tr>
					<td>  <input type="checkbox" id="ck_content_6_2_1"     />  <p id="ContentRightFirtst_6_2_1">全选</p></td>
					<td><p>版本名称</p></td>
					<td><p>版本名</p></td>
					<td><p>版本号</p></td>
					<td><p>更新说明</p></td>
					<td><p>是否使用</p></td>
					<td><p>创建时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				<c:forEach   items="${appversionCustoms }"  var="appversionCustom"   >
				<tr>
					<td>  <input type="checkbox"    class="appversionCK" name="appIds"  value="${appversionCustom.appversionId}"   /></td>
					<td><p>${appversionCustom.appversionName }</p></td>
					<td><p>${appversionCustom.appversionVersionName }</p></td>
					<td><p title="${appversionCustom.appversionDescription }">${appversionCustom.appversionVersionCode }</p></td>
					<td><p>${appversionCustom.appversionDescription }</p></td>
					<c:choose>
						<c:when test="${appversionCustom.appversionShow == '0' }" >
								<td><p>是</p></td>
						</c:when>
						<c:otherwise>
								<td><p>否</p></td>
						</c:otherwise>
					</c:choose>
					<td><p>${appversionCustom.appversionCreatetime }</p></td>
					<td><button   type="button" onclick="showEditVersionDetailDialog('${devbuy_web_path}','${appversionCustom.appversionId }','${appversionCustom.appversionName }','${appversionCustom.appversionVersionName }','${appversionCustom.appversionVersionCode }','${appversionCustom.appversionDescription }','${appversionCustom.appversionShow }','${appversionCustom.appversionCreatetime }','${appversionCustom.appversionModifytime }')" >查看详情</button></td>
				</tr>
				</c:forEach>
			</table>
			
			</form>
		</div>
		</div>
	</body>
	
	
	
	
		
	
	
	<script  type="text/javascript" >
	
	
	 $("#ck_content_6_2_1").change(function(){
		 
			if($("#ck_content_6_2_1").prop("checked")){
				  $(".appversionCK").each(function(){
					   $(this).prop("checked",true);
					  });
			}else{
				 $(".appversionCK").each(function(){
					 $(this).prop("checked",false);
					  });
			}
	 } );
	
	</script>
	
	
	
	
	
</html>
