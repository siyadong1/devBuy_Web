<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <title>devBuy后台管理系统</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="/devbuy_web/css/login.css" />
    <link rel="stylesheet" href="/devbuy_web/css/common.css" />
    
    

    
    <script type="text/javascript" src="/devbuy_web/js/jquery-2.1.1.min.js" ></script>
    <script type="text/javascript" src="/devbuy_web/js/layer/layer.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
	
	
	<script type="text/javascript">
		
		
	$(function(){
		
		
	$("#loginFooter").click(function(){
		
		window.open("http://www.miibeian.gov.cn/publish/query/indexFirst.action");
		
	});
		
	
	
	//进入首页
	$("#login").click(function(){
		
		if($("#username").val() == null || $("#username").val()==""){
			layer.alert('用户名不能为空！', {icon: 2});
			return false;
		}
		
		if($("#password").val() == null || $("#password").val()==""){
			layer.alert('密码不能为空！', {icon: 2});
			return false;
		}
		
		
		var index = layer.load(1, {
			  shade: [0.1,'#fff'] //0.1透明度的白色背景
			});
		
      return true;				
				
	});
	
	//重置用户名和密码
	$("#reset").click(function(){
		
		$("#username").val("");
		$("#password").val("");
		
	});
});
</script>
		
  	<script type="text/javascript">
  	
  		<c:if test="${not empty responseMode.message}" >
  		
  		layer.alert('${responseMode.message}',{icon: 2});
  		</c:if>
  	</script>
  
  </head>
  	

  	
  <body class="width1000">
    
    <div id="contain_border" class="centerCommon" >
    <div id="contain" class="centerCommon">
    	
    	
    	    	<div class="marginLeft16px floatLeft">
    	    		<img src="/devbuy_web/img/calabash.png" id="loginImg"/>
    	    	</div>
    	    	
    	    	
    	    	
    	    	<div class=" floatLeft marginLeft16px marginTop16px">
    	    		
    	    		
    	    		<form action="/devbuy_web/java/manageplatform/login.action" method="post">
    	    			
    	    			<h2 id="loginHeader" class="marginBottom16px">devBuy后台管理系统登录界面</h2>
    	    			<span class="text16px marginTop16px ">用户名：</span> <input  id="username"  name="name" type="text"  value="${manager}" placeholder="请输入用户名" class="text16px"/>
    	    			<br /><br />
    	    			<span class="text16px">密码：&nbsp;&nbsp;&nbsp;</span> <input id="password"  name="password"  type="text" placeholder="请输入登录密码" class="text16px"/>
    	    			<br />
    	    			
    	    			<input   id="reset"   type="button" class="blueButton floatRight marginTop16px hoverCursorPointer" id="reset" value="重置"/>
    	    			<input   id="login"   type="submit" class="redButton floatRight marginRight16px marginTop16px hoverCursorPointer" value="确定"/>
    	    			
    	    		</form>
    	    		
    	    	</div>
    	    	
    </div>
    </div>

    
    

    
    
        	
    	<div class=" positionFixed positionBottom16px positionLeft50 hoverCursorPointer" id="loginFooter">
    		<p class="text16px textCenter" >网站备案信息：蜀ICP备16009880号</p>
    		
    	</div>
    	

  </body>
  <script type="text/javascript">
  
  <c:set  var="devbuy_web_path"  value="/devbuy_web"  scope="session"  />
  	
  </script>
  
</html>
