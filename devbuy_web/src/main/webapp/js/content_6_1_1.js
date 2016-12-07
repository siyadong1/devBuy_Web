			





function hideDeleteManagerDialog() {
	
	$("#deleteManager").hide();
	$("#maskLayer").hide();
}


function confirmHideDeleteManagerDialog(devbuy_web_path) {
			
	$("#deleteManager").hide();
	$("#maskLayer").hide();
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteManagerByids]");  
   var options  = {    
       url:devbuy_web_path + '/java/manageplatform/deleteManagerByIds.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllManager.action");
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
	
function showDeleteManagerDialog(){
	$("#deleteManager").show();
	$("#maskLayer").show();
}

function showAddManagerDialog(){
	$("#addManager").show();
	$("#maskLayer").show();
}

function hideAddManagerDialog(){
	$("#addManager").hide();
	$("#maskLayer").hide();
}

function confirmHideAddManagerDialog(devbuy_web_path){
	$("#addManager").hide();
	$("#maskLayer").hide();
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=addManager]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/addManager.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllManager.action");
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

function showEditManagerDetailDialog(devbuy_web_path,managerId,name,password,description,supermanager,createTime){
	$("#editManagerDetail").show();
	$("#maskLayer").show();
	
	$("#editManagerDetailManagerId").val(managerId);
	$("#editManagerDetailOldName").val(name);
	$("#editManagerDetailName").val(name);
	$("#editManagerDetailPassword").val(password);
	$("#editManagerDetailDescription").val(description);
	if(supermanager == "0"){
		$("#editManagerDetailSupermanager").val("0");
	}else{
		$("#editManagerDetailSupermanager").val(supermanager);
	}
	$("#editManagerDetailCreateTime").val(createTime);
}

function hideEditManagerDetailDialog(){
	$("#editManagerDetail").hide();
	$("#maskLayer").hide();
}

function confirmHideEditManagerDetailDialog(devbuy_web_path){
	$("#editManagerDetail").hide();
	$("#maskLayer").hide();
	
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=editManagerDetail]");  
   var options  = {    
       url:devbuy_web_path + '/java/manageplatform/updateManager.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllManager.action");
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



