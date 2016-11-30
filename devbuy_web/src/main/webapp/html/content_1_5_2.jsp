<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布推荐</title>
<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_5_2.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
	</head>
	<body>
		
		
		
			
		<div id="body">
			<div id="pusblishRecommend">
				<!--发布商品头部-->
				<div id="publishRecommendHeader">
					<c:if  test="${updateOrAdd == 'update' }" >
						<p>修改首页推荐</p>
					</c:if>
					<c:if  test="${updateOrAdd == 'add' }" >
						<p>添加首页推荐</p>
					</c:if>
				</div>
				<!--发布商品内容区域-->
				<form  encType="multipart/form-data"  name="updateAndAddRecommend"  >
					<table  cellpadding="10px">
						<tr>
							<td><input type="hidden"  name="itemsOldName" value="${recommendCustom.itemsCustom.itemsname }" /></td>
							<td><input type="hidden"  name="recommendOldName" value="${recommendCustom.rcName }" /></td>
							<td><input type="hidden"  name="itemsId" value="${recommendCustom.itemsId }" /></td>
							<td><input type="hidden"  name="rcId" value="${recommendCustom.rcId }" /></td>
						</tr>
						<tr>
							<td><p>推荐类别</p></td>
							<td><input type="text" value="${recommendCustom.rcCategory }"  name="rcCategory"    /></td>
						</tr>
						<tr>
							<td><p>推荐名称</p></td>
							<td><input type="text" value="${recommendCustom.rcName }"  name="rcName"   /></td>
						</tr>
						<tr>
							<td><p>商品名称</p></td>
							<td><input type="text" value="${recommendCustom.itemsCustom.itemsname }" name="itemsname"    /></td>
						</tr>

						
						<tr>
							<td><p>描述</p></td>
							<td><textarea   name="description"   >${recommendCustom.itemsCustom.description }</textarea></td>
						</tr>
						
						<tr>
							<td><p>所属类别</p></td>
							<td>
								<select id="selectContent_1_5_2_category" name="category"      >
								<c:forEach items="${classificationCustoms }"  var="classificationCustom" >
									<c:choose >
										 <c:when  test="${classificationCustom.category == categorySelected}" >
										  <option   value="${classificationCustom.category }"  selected="true" >${classificationCustom.cfName }</option>
										 </c:when>							
										 <c:otherwise>
										  <option   value="${classificationCustom.category }" >${classificationCustom.cfName }</option>
										 </c:otherwise>						
									</c:choose>
								</c:forEach>
								</select>
							</td>
						</tr>
						
						<tr>
							<td><p>是否显示</p></td>
							<td>
								<select id="selectContent_1_5_2_show"  name="rcShow">
								
									<c:choose >
										 <c:when  test="${recommendCustom.rcShow == '0'}" >
										  <option   value="0"  selected="true" >是</option>
										  <option   value="1" >否</option>
										 </c:when>							
										 <c:otherwise>
										 <option   value="0"  >是</option>
										  <option   value="1" selected="true" >否</option>
										 </c:otherwise>						
									</c:choose>
								
								
								</select>
							</td>
						</tr>
						<tr>
							<td><p>是否大图</p></td>
							<td>
								<select id="selectContent_1_5_2_isLarge"   name="rcIslarge" >
								
									<c:choose >
										 <c:when  test="${recommendCustom.rcIslarge == '0'}" >
										  <option   value="0"  selected="true" >是</option>
										  <option   value="1" >否</option>
										 </c:when>							
										 <c:otherwise>
										  <option   value="0"   >是</option>
										  <option   value="1"  selected="true" >否</option>
										 </c:otherwise>						
									</c:choose>
								
								</select>
							</td>
						</tr>
						
						<tr>
							<td><p>商品图片</p></td>
							<td><input type="file" name="recommendNewImage" /></td>
						</tr>

					</table>
											
						<tr>
							<td ><img src="${recommendCustom.rcUrl }" /></td>
						</tr>

				</form>
				
			<tr>
					<td >
						<c:if  test="${updateOrAdd == 'update' }" >
							<button  type="button"   onclick="confirmUpdateRecommendAndUpdateItems('${devbuy_web_path}')"   >确定修改 </button>
						</c:if>
						<c:if  test="${updateOrAdd == 'add' }" >
							<button  type="button"  onclick="confirmAddRecommendAndAddItems('${devbuy_web_path}')"    >确定添加 </button>
						</c:if>
					</td>
			</tr>
				
			</div>
			
			
			
			
			
		</div>
		
		
		
		
		
	</body>
</html>
