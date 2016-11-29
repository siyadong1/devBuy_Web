<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>devBuy后台管理系统模板</title>
	<link rel="stylesheet" href="${devbuy_web_path}/css/common.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_1_1.css" /> 
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_2_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_2_2.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_3_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_3_2.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_4_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_4_2.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_5_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_1_5_2.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_2_1_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_3_1_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_4_1_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_6_1_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/content_6_2_1.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/userDetail.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/home.css" />
	<link rel="stylesheet" href="${devbuy_web_path}/css/ui.css" />
	<script type="text/javascript" src="${devbuy_web_path}/js/content_1_1_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_1_2_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_1_2_2.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_1_3_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_1_3_2.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_1_4_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_1_5_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_2_1_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_3_1_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_4_1_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_6_1_1.js" ></script>
	<script type="text/javascript" src="${devbuy_web_path}/js/content_6_2_1.js" ></script>
    <script type="text/javascript" src="${devbuy_web_path}/js/jquery-2.1.1.min.js" ></script>
     <script type="text/javascript" src="${devbuy_web_path}/js/jquery-form.js" ></script>
         <script type="text/javascript" src="/devbuy_web/js/layer/layer.js"></script>
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<script type="text/javascript">
	

	
	$(function(){
		
		
	
		
		
	$("#templateFooterWebSiteInfo").click(function(){
		
		window.open("http://www.miibeian.gov.cn/publish/query/indexFirst.action");
		
	});
		
		/***************************内容区域头部的点击事情，切换Tab条目Start****************************/
		
	$("#templateContentHeaderTab1").click(function(){
	$("#templateContentLeftDiv1").show();
	$("#templateContentLeftDiv2").hide();
	$("#templateContentLeftDiv3").hide();
	$("#templateContentLeftDiv4").hide();
	$("#templateContentLeftDiv5").hide();
	$("#templateContentLeftDiv6").hide();
	$("#templateContentHeaderTab1").addClass("templateContentHeaderTab");
	$("#templateContentHeaderTab2").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab3").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab4").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab5").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab6").removeClass("templateContentHeaderTab");
	
	$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllClassification.action")
	
	});	
		
		
	$("#templateContentHeaderTab2").click(function(){
	$("#templateContentLeftDiv2").show();
	$("#templateContentHeaderTab2").addClass("templateContentHeaderTab");
	$("#templateContentLeftDiv1").hide();
	$("#templateContentLeftDiv3").hide();
	$("#templateContentLeftDiv4").hide();
	$("#templateContentLeftDiv5").hide();
	$("#templateContentLeftDiv6").hide();
	$("#templateContentHeaderTab2").addClass("templateContentHeaderTab");
	$("#templateContentHeaderTab1").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab3").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab4").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab5").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab6").removeClass("templateContentHeaderTab");
		$("#templateContentRight").load("${devbuy_web_path}/html/content_2_1_1.jsp #body");
		});		
		
		
	$("#templateContentHeaderTab3").click(function(){
	$("#templateContentLeftDiv3").show();
	$("#templateContentHeaderTab3").addClass("templateContentHeaderTab");
	$("#templateContentLeftDiv1").hide();
	$("#templateContentLeftDiv2").hide();
	$("#templateContentLeftDiv4").hide();
	$("#templateContentLeftDiv5").hide();
	$("#templateContentLeftDiv6").hide();
	$("#templateContentHeaderTab3").addClass("templateContentHeaderTab");
	$("#templateContentHeaderTab2").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab1").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab4").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab5").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab6").removeClass("templateContentHeaderTab");
		$("#templateContentRight").load("${devbuy_web_path}/html/content_3_1_1.jsp #body");
		});		
		
		
	$("#templateContentHeaderTab4").click(function(){
	$("#templateContentLeftDiv4").show();
	$("#templateContentHeaderTab4").addClass("templateContentHeaderTab");
	$("#templateContentLeftDiv1").hide();
	$("#templateContentLeftDiv2").hide();
	$("#templateContentLeftDiv3").hide();
	$("#templateContentLeftDiv5").hide();
	$("#templateContentLeftDiv6").hide();
	$("#templateContentHeaderTab4").addClass("templateContentHeaderTab");
	$("#templateContentHeaderTab2").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab3").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab1").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab5").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab6").removeClass("templateContentHeaderTab");
		$("#templateContentRight").load("${devbuy_web_path}/html/content_4_1_1.jsp #body");
		});		
		
		
	$("#templateContentHeaderTab5").click(function(){
	$("#templateContentLeftDiv5").show();
	$("#templateContentHeaderTab5").addClass("templateContentHeaderTab");
	$("#templateContentLeftDiv1").hide();
	$("#templateContentLeftDiv2").hide();
	$("#templateContentLeftDiv3").hide();
	$("#templateContentLeftDiv4").hide();
	$("#templateContentLeftDiv6").hide();
	$("#templateContentHeaderTab5").addClass("templateContentHeaderTab");
	$("#templateContentHeaderTab2").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab3").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab4").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab1").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab6").removeClass("templateContentHeaderTab");
		$("#templateContentRight").load("${devbuy_web_path}/html/content_5_1_1.jsp #body");
			});	
		
		
		
	$("#templateContentHeaderTab6").click(function(){
	$("#templateContentLeftDiv6").show();
	$("#templateContentHeaderTab6").addClass("templateContentHeaderTab");
	$("#templateContentLeftDiv1").hide();
	$("#templateContentLeftDiv2").hide();
	$("#templateContentLeftDiv3").hide();
	$("#templateContentLeftDiv4").hide();
	$("#templateContentLeftDiv5").hide();
	$("#templateContentHeaderTab6").addClass("templateContentHeaderTab");
	$("#templateContentHeaderTab2").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab3").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab4").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab5").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab1").removeClass("templateContentHeaderTab");
		$("#templateContentRight").load("${devbuy_web_path}/html/content_6_1_1.jsp #body");
		});		
		
	/***************************内容区域头部的点击事情，切换Tab条目End****************************/
	/***************************内容区域左侧的点击事情，切换内容区域IFrame的内容Start****************************/
	
	$("#templateContentLeftDiv1_1_1").click(function(){
		
		if($("#templateContentLeftDiv1_1_2").is(':hidden')){
			$("#templateContentLeftDiv1_1_2").show();
			$("#templateContentLeftDiv1_1_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv1_1_2").hide();
		    $("#templateContentLeftDiv1_1_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	$("#templateContentLeftDiv1_2_1").click(function(){
		
		if($("#templateContentLeftDiv1_2_2").is(':hidden')){
			$("#templateContentLeftDiv1_2_2").show();
			$("#templateContentLeftDiv1_2_3").show();
			$("#templateContentLeftDiv1_2_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv1_2_2").hide();
			$("#templateContentLeftDiv1_2_3").hide();
			$("#templateContentLeftDiv1_2_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
	
	$("#templateContentLeftDiv1_3_1").click(function(){
		
		if($("#templateContentLeftDiv1_3_2").is(':hidden')){
			$("#templateContentLeftDiv1_3_2").show();
			$("#templateContentLeftDiv1_3_3").show();
			$("#templateContentLeftDiv1_3_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv1_3_2").hide();
			$("#templateContentLeftDiv1_3_3").hide();
			$("#templateContentLeftDiv1_3_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
	
	
	
	
	$("#templateContentLeftDiv1_4_1").click(function(){
		
		if($("#templateContentLeftDiv1_4_2").is(':hidden')){
			$("#templateContentLeftDiv1_4_2").show();
			$("#templateContentLeftDiv1_4_3").show();
			$("#templateContentLeftDiv1_4_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv1_4_2").hide();
			$("#templateContentLeftDiv1_4_3").hide();
			$("#templateContentLeftDiv1_4_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
	
	
	
	$("#templateContentLeftDiv1_5_1").click(function(){
		
		if($("#templateContentLeftDiv1_5_2").is(':hidden')){
			$("#templateContentLeftDiv1_5_2").show();
			$("#templateContentLeftDiv1_5_3").show();
			$("#templateContentLeftDiv1_5_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv1_5_2").hide();
			$("#templateContentLeftDiv1_5_3").hide();
			$("#templateContentLeftDiv1_5_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
	
	
	
	$("#templateContentLeftDiv2_1_1").click(function(){
		
		if($("#templateContentLeftDiv2_1_2").is(':hidden')){
			$("#templateContentLeftDiv2_1_2").show();
			$("#templateContentLeftDiv2_1_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv2_1_2").hide();
			$("#templateContentLeftDiv2_1_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	$("#templateContentLeftDiv2_2_1").click(function(){
		
		if($("#templateContentLeftDiv2_2_2").is(':hidden')){
			$("#templateContentLeftDiv2_2_2").show();
			$("#templateContentLeftDiv2_2_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv2_2_2").hide();
			$("#templateContentLeftDiv2_2_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	$("#templateContentLeftDiv2_3_1").click(function(){
		
		if($("#templateContentLeftDiv2_3_2").is(':hidden')){
			$("#templateContentLeftDiv2_3_2").show();
			$("#templateContentLeftDiv2_3_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv2_3_2").hide();
			$("#templateContentLeftDiv2_3_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	$("#templateContentLeftDiv2_4_1").click(function(){
		
		if($("#templateContentLeftDiv2_4_2").is(':hidden')){
			$("#templateContentLeftDiv2_4_2").show();
			$("#templateContentLeftDiv2_4_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv2_4_2").hide();
			$("#templateContentLeftDiv2_4_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	$("#templateContentLeftDiv2_5_1").click(function(){
		
		if($("#templateContentLeftDiv2_5_2").is(':hidden')){
			$("#templateContentLeftDiv2_5_2").show();
			$("#templateContentLeftDiv2_5_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv2_5_2").hide();
			$("#templateContentLeftDiv2_5_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
	$("#templateContentLeftDiv3_1_1").click(function(){
		
		if($("#templateContentLeftDiv3_1_2").is(':hidden')){
			$("#templateContentLeftDiv3_1_2").show();
			$("#templateContentLeftDiv3_1_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv3_1_2").hide();
			$("#templateContentLeftDiv3_1_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
	
	$("#templateContentLeftDiv4_1_1").click(function(){
		
		if($("#templateContentLeftDiv4_1_2").is(':hidden')){
			$("#templateContentLeftDiv4_1_2").show();
			$("#templateContentLeftDiv4_1_3").show();
			$("#templateContentLeftDiv4_1_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv4_1_2").hide();
			$("#templateContentLeftDiv4_1_3").hide();
			$("#templateContentLeftDiv4_1_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
		
	
	
	
	$("#templateContentLeftDiv5_1_1").click(function(){
		
		if($("#templateContentLeftDiv5_1_2").is(':hidden')){
			$("#templateContentLeftDiv5_1_2").show();
			$("#templateContentLeftDiv5_1_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv5_1_2").hide();
			$("#templateContentLeftDiv5_1_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
		
	
	
	
	$("#templateContentLeftDiv6_1_1").click(function(){
		
		if($("#templateContentLeftDiv6_1_2").is(':hidden')){
			$("#templateContentLeftDiv6_1_2").show();
			$("#templateContentLeftDiv6_1_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv6_1_2").hide();
			$("#templateContentLeftDiv6_1_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
	
	
	
	
	
	
	
	
		
	
	
	
	$("#templateContentLeftDiv6_2_1").click(function(){
		
		if($("#templateContentLeftDiv6_2_2").is(':hidden')){
			$("#templateContentLeftDiv6_2_2").show();
			$("#templateContentLeftDiv6_2_1 > img").attr("src","${devbuy_web_path}/img/iv_open.png");
		}else{
			$("#templateContentLeftDiv6_2_2").hide();
			$("#templateContentLeftDiv6_2_1 > img").attr("src","${devbuy_web_path}/img/iv_close.png");
		}
		
	});
	
		var i1_length = 6;
		var i2_length = 10;
		var i3_length = 3;
		for (var i1 = 1; i1 <= i1_length; i1++) {
			for (var i2 = 1; i2 <= i2_length; i2++) {
				for (var i3 = 1; i3 <= i3_length; i3++) {
					var item = ".content_" + i1 + "_" + i2 + "_" + i3;
						$(item).click(function(){
							
							
							
							if($(this).attr("class") == "content_1_1_1"){
								$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllClassification.action")
							}
							
							
							if($(this).attr("class") == "content_1_2_1"){
								$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllItems.action")
							}
							
							
							if($(this).attr("class") == "content_1_2_2"){
								$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/selectClassificationForAddGoods.action");
							}
							
							
							if($(this).attr("class") == "content_1_3_1"){
								$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllBanners.action");
							}

							
							if($(this).attr("class") == "content_1_3_2"){
								$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/selectClassificationForAddBanner.action");
							}
							
							if($(this).attr("class") == "content_1_4_1"){
								$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllClassification.action")
							}
							
							if($(this).attr("class") == "content_1_5_1"){
								$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllRecommend.action")
							}
							
							if($(this).attr("class") == "content_1_5_2"){
								$("#templateContentRight").load("${devbuy_web_path}/html/content_1_5_2.jsp #body")
							}
							
					});
				}
			}
		}	
		

		$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllClassification.action")

		
		
		
		
		$("#logout").click(function() {
			
			
			window.location.href = "${devbuy_web_path}/java/manageplatform/logout.action"
			
		});
		
		
		
	
	/***************************内容区域左侧的点击事情，切换内容区域IFrame的内容End****************************/


});


		
		




</script>
		

		
		
	</head>

	<body >
			<div id="maskLayer" >
			</div>
	<div id="templateContainer"  class="width1200  centerMarginAuto">
		<!--模板头部开始-->
	<div  id="templateHeader" class="blueColor">
		<p id="templateHeaderTitle" class="marginLeft16px">devBuy后台管理系统V1.0</p>
		<div id="templateHeaderAdmin" >
			<p   id="loginManager" class="text16pxWhite">欢迎您! ${manager}</p>
			<br />
			<p class="text16pxWhite">当前在线人数${managerNo}人</p>
		</div>
		<div class="floatRight">
			<ul>
				<li>
					<img src="${devbuy_web_path}/img/iv_welcome.png"/>
					<p class="text16pxWhite marginTop16px">欢迎页</p>
				</li>
				<li class="marginLeft16px" id="logout">
					<img src="${devbuy_web_path}/img/iv_logout.png"/>
					<p class="text16pxWhite marginTop16px">退出登录</p>
				</li>
			</ul>
		</div>
	</div>
	<!--模板头部结束-->
	
	
	
	
	
	
	
		<!--模板内容区域开始-->
	<div  id="templateContent">
		
		
		
		
		<!--模板内容区域头部开始-->
		<div id="templateContentHeader">
			
			
			
			<ul>
				<li><a class="templateContentHeaderTab templateContentHeaderTabColor" id="templateContentHeaderTab1" href="#">商品管理</a></li>
				<li><a class="templateContentHeaderTabColor" id="templateContentHeaderTab2" href="#">订单管理</a></li>
				<li><a class="templateContentHeaderTabColor" id="templateContentHeaderTab3" href="#">购物车管理</a></li>
				<li><a class="templateContentHeaderTabColor" id="templateContentHeaderTab4" href="#">用户管理</a></li>
				<li><a class="templateContentHeaderTabColor" id="templateContentHeaderTab5" href="#">网站管理</a></li>
				<li><a class="templateContentHeaderTabColor" id="templateContentHeaderTab6" href="#">系统设置</a></li>
			</ul>
			
			
			
		</div>
		<!--模板内容区域头部结束-->
		<!--模板内容区域左侧开始-->
		<div id="templateContentLeft">
			<!--商品管理开始-->
			<div id="templateContentLeftDiv1">
			<ul>
				<li id="templateContentLeftDiv1_1_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" /><p>商品类别</p></li>
				<li  class="content_1_1_1"  id="templateContentLeftDiv1_1_2">
					<p>类别列表</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv1_2_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>商品查询</p>
				</li>
				<li class="content_1_2_1" id="templateContentLeftDiv1_2_2">
					<p>商品列表</p>
				</li>
				<li class="content_1_2_2" id="templateContentLeftDiv1_2_3">
					<p>发布商品</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv1_3_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>首页轮播</p>
				</li>
				<li class="content_1_3_1" id="templateContentLeftDiv1_3_2">
					<p>轮播列表</p>
				</li>
				<li  class="content_1_3_2" id="templateContentLeftDiv1_3_3">
					<p>发布轮播</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv1_4_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>首页导航</p>
				</li>
				<li class="content_1_4_1" id="templateContentLeftDiv1_4_2">
					<p>导航列表</p>
				</li>
<!-- 				<li class="content_1_4_2" id="templateContentLeftDiv1_4_3">
					<p>发布导航</p>
				</li> -->
			</ul>
			<ul>
				<li id="templateContentLeftDiv1_5_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>首页推荐</p>
				</li>
				<li class="content_1_5_1" id="templateContentLeftDiv1_5_2">
					<p>推荐列表</p>
				</li>
				<li class="content_1_5_2" id="templateContentLeftDiv1_5_3">
					<p>发布推荐</p>
				</li>
			</ul>
			</div>
			<!--商品管理结束-->
			
			
			
			<!--订单管理开始-->
			<div id="templateContentLeftDiv2">
			<ul>
				<li id="templateContentLeftDiv2_1_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>全部订单</p>
				</li>
				<li class="content_2_1_1"  id="templateContentLeftDiv2_1_2">
					<p>订单列表</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv2_2_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>代付款</p>
				</li>
				<li class="content_2_2_1" id="templateContentLeftDiv2_2_2">
					<p>订单列表</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv2_3_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>代发货</p>
				</li>
				<li  class="content_2_3_1" id="templateContentLeftDiv2_3_2">
					<p>订单列表</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv2_4_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>代收货</p>
				</li>
				<li  class="content_2_4_1"  id="templateContentLeftDiv2_4_2">
					<p>订单列表</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv2_5_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>取消</p>
				</li>
				<li  class="content_2_5_1" id="templateContentLeftDiv2_5_2">
					<p>订单列表</p>
				</li>
			</ul>
			</div>
			<!--订单管理结束-->
			
			
			
			
			
			<!--购物车管理开始-->
			<div id="templateContentLeftDiv3">
			<ul>
				<li id="templateContentLeftDiv3_1_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>购物车管理</p>
				</li>
				<li class="content_3_1_1" id="templateContentLeftDiv3_1_2">
					<p>购物车列表</p>
				</li>
			</ul>
			</div>
			<!--购物车管理结束-->
			
			
			
			
			
			<!--用户管理开始-->
			<div id="templateContentLeftDiv4">
			<ul>
				<li id="templateContentLeftDiv4_1_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>用户管理</p>
				</li>
				<li class="content_4_1_1" id="templateContentLeftDiv4_1_2">
					<p>在线用户</p>
				</li>
				<li class="content_4_1_2" id="templateContentLeftDiv4_1_3">
					<p>用户列表</p>
				</li>
			</ul>
			</div>
			<!--用户管理结束-->
			
			
			
			
			<!--网站管理开始-->
			<div id="templateContentLeftDiv5">
			<ul>
				<li id="templateContentLeftDiv5_1_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>网站管理</p>
				</li>
				<li class="content_5_1_1" id="templateContentLeftDiv5_1_2">
					<p>代开发</p>
				</li>
			</ul>
			</div>
			<!--网站管理结束-->
			
			
			
			
						
			
			<!--系统设置开始-->
			<div id="templateContentLeftDiv6">
			<ul>
				<li id="templateContentLeftDiv6_1_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>管理员管理</p>
				</li>
				<li  class="content_6_1_1" id="templateContentLeftDiv6_1_2">
					<p>管理员列表</p>
				</li>
			</ul>
			<ul>
				<li id="templateContentLeftDiv6_2_1">
					<img   src="${devbuy_web_path}/img/iv_open.png" />
					<p>版本控制</p>
				</li>
				<li class="content_6_2_1" id="templateContentLeftDiv6_2_2">
					<p>版本列表</p>
				</li>
			</ul>
			</div>
			<!--系统设置结束-->
			
			
			
			
			
		</div>
		<!--模板内容区域左侧结束-->
		<!--模板内容区域右侧开始-->
		<div id="templateContentRight">
			
			
			
			
		</div>
		<!--模板内容区域右侧结束-->
	</div>
		<!--模板内容区域结束-->
		
		
		

		
		
		<!--模板尾部区域开始-->
	<div id="templateFooter"  >
			<ul>
				<li><a  onclick="goToAboutUs()"  href="#">关于我们</a></li>
				<li><a  onclick="goToContactUs()" href="#">联系我们</a></li>
				<li><a  onclick="goToProjectRecruit()" href="#">项目招聘</a></li>
				<li><a  onclick="goToOtherLink()" href="#">其它链接</a></li>
			</ul>
			
			<p class= "hoverCursorPointer" id="templateFooterWebSiteInfo">网站备案信息：蜀ICP备16009880号</p>

		
		
	</div>	
		<!--模板尾部区域结束-->
	</div>
		
	
	
	
	
	
	
	
	<script type="text/javascript">
	
	
		function goToAboutUs(){
			window.location.href='aboutUs.html';
		}
		
		
	
	
		function goToContactUs(){
			window.location.href='contactUs.html';
		}
		
		
		
	
	
		function goToProjectRecruit(){
			window.location.href='projectRecruit.html';
		}
		
		
		
	
	
		function goToOtherLink(){
			window.location.href='otherLink.html';
		}
		
		
		
		
	</script>
			
	
	
	
	
	
	</body>
	
</html>
