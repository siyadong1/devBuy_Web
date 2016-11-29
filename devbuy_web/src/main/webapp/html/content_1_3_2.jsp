<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布轮播</title>
		<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_3_2.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
		<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
		<script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js"></script> 
	</head>
	<body>
		
		
		
			
		<div id="body">
			<div id="pusblishBannerGoods">
				<!--发布商品头部-->
				<div id="publishBannerGoodsHeader">
					<c:if  test="${updateOrAdd == 'update' }" >
						<p>修改广告栏</p>
					</c:if>
					<c:if  test="${updateOrAdd == 'add' }" >
						<p>添加广告栏</p>
					</c:if>
				</div>
				<!--发布商品内容区域-->
				<form  encType="multipart/form-data"  name="updateAndAddBanner"  >
					<table  cellpadding="10px">
						<tr>
							<td><input type="hidden"  name="itemsOldName" value="${bannerCustom.itemsCustom.itemsname }" /></td>
							<td><input type="hidden"  name="bannerOldName" value="${bannerCustom.bnName }" /></td>
							<td><input type="hidden"  name="itemsId" value="${bannerCustom.itemsId }" /></td>
							<td><input type="hidden"  name="bnId" value="${bannerCustom.bnId }" /></td>
						</tr>
						
						<tr>
							<td><p>Banner名称</p></td>
							<td><input type="text"  name="bnName" value="${bannerCustom.bnName }" /></td>
						</tr>
						
						<tr>
							<td><p>商品名称</p></td>
							<td><input type="text"  name="itemsname"  value="${bannerCustom.itemsCustom.itemsname }" /></td>
						</tr>

						<tr>
							<td><p>描述</p></td>
							<td><textarea   name="description"  >${bannerCustom.itemsCustom.description }</textarea></td>
						</tr>
						<tr>
							<td><p>所属类别</p></td>
							<td>
							<select id="selectContent_1_3_2_classification" name="category"    >
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
								<select id="selectContent_1_3_2" name="bnShow"   >
								
								<c:choose>
									<c:when test="${bannerCustom.bnShow == '0' }" >
									<option selected="true" value="0" >是</option>
									<option    value="1">否</option>
									</c:when>
									<c:otherwise>
									<option value="0">是</option>
									<option selected="true" value="1"  >否</option>
									</c:otherwise>
								</c:choose>
							
								</select>
							</td>
						</tr>
						
						<tr>
							<td><p>商品图片</p></td>
							<td><input type="file"   name="bannerNewImage"/></td>
						</tr>

					</table>
											
						<tr>
							<td ><img src="${bannerCustom.bnUrl }" /></td>
						</tr>

				</form>
				
			<tr>
					<td >
					<c:if  test="${updateOrAdd == 'update' }" >
						<button  type="button"   onclick="confirmUpdateBannerAndUpdateItems('${devbuy_web_path}')"   >确定修改 </button>
					</c:if>
					<c:if  test="${updateOrAdd == 'add' }" >
						<button  type="button"  onclick="confirmAddBannerAndAddItems('${devbuy_web_path}')"    >确定添加 </button>
					</c:if>
					</td>
			</tr>
				
			</div>
			
			
			
			
			
		</div>
		
		
		
		
		
	</body>
</html>
