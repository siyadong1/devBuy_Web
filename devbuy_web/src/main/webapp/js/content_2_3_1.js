			





function hideDeleteWaitShipmentOrderDialog() {
	$("#deleteWaitShipmentOrder").hide();
	$("#maskLayer").hide();
}
	
function showDeleteWaitShipmentOrderDialog(){
	$("#deleteWaitShipmentOrder").show();
	$("#maskLayer").show();
}

function showEditWaitShipmentOrderDialog(devbuy_web_path,ordersId){
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectOrderStatusForUpdateOrders.action?ordersId=" + ordersId);
}


function  confirmHideDeleteWaitShipmentOrderDialog(devbuy_web_path){
	
	$("#deleteWaitShipmentOrder").hide();
	$("#maskLayer").hide();

	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteWaitShipmentOrdersIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteOrdersByIds.action',    
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
					$("#templateContentRight").load("${devbuy_web_path}/java/manageplatform/queryAllOrders.action")
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

