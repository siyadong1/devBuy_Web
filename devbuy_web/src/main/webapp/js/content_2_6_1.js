


function hideDeleteOrderStatusDialog() {
			
	$("#deleteOrderStatus").hide();
	$("#maskLayer").hide();
}
	
function showDeleteOrderStatusDialog(){
	$("#deleteOrderStatus").show();
	$("#maskLayer").show();
}

function confirmHideAddOrderStatusDialog(devbuy_web_path){
	$("#deleteOrderStatus").hide();
	$("#maskLayer").hide();
	var url_path = "";
	if($("#updateOrAddOrderStatusFlag").attr("name") == "update"){
		url_path = devbuy_web_path + "/java/manageplatform/updateOrderStatus.action";
	}else{
		url_path = devbuy_web_path + "/java/manageplatform/addOrderStatus.action";
	}
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=updateOrderStatusAndAddOrderStatus]");  
     var options  = {    
    	 url:url_path,    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllOrderStatus.action")
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


function hideAddOrderStatusDialog() {
	$("#addOrderStatus").hide();
	$("#maskLayer").hide();
}
	
function showAddOrderStatusDialog(){
	$("#updateOrAddOrderStatusTitle").text("添加订单状态");
	$("#updateOrAddOrderStatusFlag").attr("name","add");
	$("#addOrderStatus").show();
	$("#maskLayer").show();
	$("#osName").val("");
	$("#osCode").val("");
	$("#osDescription").val("");
	$("#osId").val("");
}


function showEditOrderStatusDialog(devbuy_web_path,osName,osCode,osDescription,osId) {
	$("#updateOrAddOrderStatusTitle").text("编辑订单状态");
	$("#updateOrAddOrderStatusFlag").attr("name","update");
	$("#addOrderStatus").show();
	$("#maskLayer").show();
	$("#osName").val(osName);
	$("#osCode").val(osCode);
	$("#osDescription").val(osDescription);
	$("#osId").val(osId);
}
	


function confirmHideDeleteOrderStatusDialog(devbuy_web_path){
	$("#deleteOrderStatus").hide();
	$("#maskLayer").hide();

	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteOrderStatusIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteorderStatusByIds.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllOrderStatus.action")
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




