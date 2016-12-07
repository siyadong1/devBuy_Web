			





function hideDeleteVersionDialog() {
			
	$("#deleteVersion").hide();
	$("#maskLayer").hide();
}
	
function showDeleteVersionDialog(){
	$("#deleteVersion").show();
	$("#maskLayer").show();
}

function showAddVersionDialog(){
	$("#addVersion").show();
	$("#maskLayer").show();
}

function hideAddVersionDialog(){
	$("#addVersion").hide();
	$("#maskLayer").hide();
}

function confirmHideAddVersionDialog(devbuy_web_path){
	$("#addVersion").hide();
	$("#maskLayer").hide();

	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=addVersion]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/insertAppversionSelective.action',    
         type:'post',    
         success:function(data)    
         {   
        	 layer.close(index);    
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{
            	 var message = data.message;  
            	 layer.msg(message,{time:1000}); 
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllAppversion.action");
             } 
         } ,
	     error:function(data)    
	     {    
		 	 layer.close(index);    
	         layer.alert("连接服务器失败！", {icon: 2});
	     }

     };    
     form.ajaxSubmit(options);  
	
	
	
	
	
	
}

function showEditVersionDetailDialog(devbuy_web_path,appversionId,appversionName,appversionVersionName,appversionVersionCode,appversionDescription,appversionShow,appversionCreatetime,appversionModifytime){
	$("#editVersion").show();
	$("#maskLayer").show();
	
	$("#editVersionAppversionId").val(appversionId);
	$("#editVersionOldAppversionName").val(appversionName);
	$("#editVersionOldAppversionVersionCode").val(appversionVersionCode);
	$("#editVersionOldAppversionVersionName").val(appversionVersionName);
	$("#editVersionAppversionName").val(appversionName);
	$("#editVersionAppversionVersionName").val(appversionVersionName);
	$("#editVersionAppversionVersionCode").val(appversionVersionCode);
	$("#editVersionAppversionDescription").val(appversionDescription);
	if(appversionShow == "0"){
		$("#editVersionAppversionShow").val("0");
	}else{
		$("#editVersionAppversionShow").val("1");
	}

	$("#editVersionAppversionCreatetime").val(appversionCreatetime);
	$("#editVersionAppversionModifytime").val(appversionModifytime);
	
	
	
}

function hideEditVersionDialog(){
	$("#editVersion").hide();
	$("#maskLayer").hide();
}


function confirmHideEditVersionDialog(devbuy_web_path){
	$("#editVersion").hide();
	$("#maskLayer").hide();
	
	

	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=editVersion]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/updateAppversionSelectiveByPrimaryKey.action',    
         type:'post',    
         success:function(data)    
         {   
        	 layer.close(index);    
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{
            	 var message = data.message;  
            	 layer.msg(message,{time:1000}); 
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllAppversion.action")
             } 
         } ,
	     error:function(data)    
	     {    
		 	 layer.close(index);    
	         layer.alert("连接服务器失败！", {icon: 2});
	     }

     };    
     form.ajaxSubmit(options);  
	
	
	
}







function confirmHideDeleteVersionDialog(devbuy_web_path){
	$("#deleteVersion").hide();
	$("#maskLayer").hide();

	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteAppversionIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteAppversionByIds.action',    
         type:'post',    
         success:function(data)    
         {   
        	 layer.close(index);    
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{
            	 var message = data.message;  
            	 layer.msg(message,{time:1000}); 
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllAppversion.action")
             } 
         } ,
	     error:function(data)    
	     {    
		 	 layer.close(index);    
	         layer.alert("连接服务器失败！", {icon: 2});
	     }

     };    
     form.ajaxSubmit(options);  
}








