<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>管理员列表</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_6_1_1.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
		<script type="text/javascript" src="${devbuy_web_path}/js/content_6_1_1.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除商品-->
			<div id="deleteManager" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除所选管理员</p>
				<button  onclick="hideDeleteManagerDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="confirmHideDeleteManagerDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--添加管理员-->
			
				<div id="addManager" >
				<div><p>添加管理员</p></div>
				<form name="addManager">
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">账号</span></td>
							<td>
							<input class="text16px" type="text" id="" placeholder="张三"  name="name"  />
							<input  type="hidden"   name="currentManager"  value="${manager}" ></input>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">密码</span></td>
							<td><input class="text16px" type="text" id="" placeholder="123456" name="password"/></td>
						</tr>

						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea  name="description" class="text16px"></textarea></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否是超级管理员</span></td>
							<td>
								<select  name="supermanager" >
								<c:if test="${manager == 'admin'}">
									<option  value="0" >是</option>
								</c:if>
									<option  value="1">否</option>
								</select>
							</td>
						</tr>
					</table>
				</form>
				<button   onclick="hideAddManagerDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   onclick="confirmHideAddManagerDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
			</div>
			
			
			
			
			
			
			
			<!--查看详情-->
			
				<div id="editManagerDetail" >
				<div><p>查看详情</p></div>
				<form name="editManagerDetail">
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">账号</span></td>
							<td>
							<input class="text16px" type="text" id="editManagerDetailName" name="name" />
							<input type="hidden"  id="editManagerDetailManagerId"  name="managerId"  ></input>
							<input type="hidden"  id="editManagerDetailOldName"  name="oldName"  ></input>
							<input type="hidden"  value="${manager}"  name="currentManager"  ></input>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">密码</span></td>
							<td><input class="text16px" type="text" id="editManagerDetailPassword" name="password"  /></td>
						</tr>

						<tr>
							<td><span class="text16px ">描述</span></td>
							<td><textarea   id="editManagerDetailDescription" name="description"   class="text16px"></textarea></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否是超级管理员</span></td>
							<td>
								<select id="editManagerDetailSupermanager" name="supermanager"   >
									<option value="0" >是</option>
									<option value="1" >否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">注册时间</span></td>
							<td><input class="text16px" type="text" id="editManagerDetailCreateTime" name="createTime" /></td>
						</tr>
					</table>
				</form>
				<button   type="button"   onclick="hideEditManagerDetailDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button   type="button" onclick="confirmHideEditManagerDetailDialog('${devbuy_web_path}')" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>	
			</div>
			
			
			
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_6_1_1">
			<div id="ContentRightTitle_6_1_1">
				<button onclick="showDeleteManagerDialog()" class="contentButton" id="btnDeleteClass" >删除</button>
				<button onclick="showAddManagerDialog()"   class="contentButton">添加</button>
				<input type="text" placeholder="搜索管理员"></input>
				<img src="${devbuy_web_path}/img/iv_search_query.png" />
			</div>
			
			<form name="deleteManagerByids">
			<table>
				<tr>
					<td>
					<input type="checkbox"  id="ck_content_6_1_1"    /> 
					<input type="hidden" name="currentManager"   value="${manager}"  ></input> 
					<p id="ContentRightFirtst_6_1_1">全选</p></td>
					<td><p>管理员账号</p></td>
					<td><p>管理员密码</p></td>
					<td><p>描述</p></td>
					<td><p>高级管理员</p></td>
					<td><p>创建时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				<c:forEach items="${managerCustoms }"  var="managerCustom" >
				<tr>
					<td>  <input type="checkbox"  class="managerCK" name="managerIds"  value="${managerCustom.managerId}"     /></td>
					<td><p>${managerCustom.name }</p></td>
					<td><p title="{managerCustom.description }">${managerCustom.password }</p></td>
					<td><p>${managerCustom.description }</p></td>
					<c:choose>
						<c:when  test="${managerCustom.supermanager == '0'}">
						<td><p>是</p></td>
						</c:when>
						<c:otherwise>
						<td><p>否</p></td>
						</c:otherwise>
					</c:choose>
					
					<td><p>${managerCustom.createTime }</p></td>
					<td><button  type="button"  onclick="showEditManagerDetailDialog('${devbuy_web_path}','${managerCustom.managerId }'
					,'${managerCustom.name }','${managerCustom.password }','${managerCustom.description }','${managerCustom.supermanager }','${managerCustom.createTime }')"  >编辑</button></td>
				</tr>
				</c:forEach>
			</table>
			</form>
		</div>
		</div>
	</body>
	
	
	
	
	
		
	<script  type="text/javascript" >
	 $("#ck_content_6_1_1").change(function(){
		 
			if($("#ck_content_6_1_1").prop("checked")){
				  $(".managerCK").each(function(){
					   $(this).prop("checked",true);
					  });
			}else{
				 $(".managerCK").each(function(){
					 $(this).prop("checked",false);
					  });
			}
	 } );
	</script>
	
	
	
	
</html>
