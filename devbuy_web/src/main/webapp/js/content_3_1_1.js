			





function confirmHideDeleteShoppingCarDialog(devbuy_web_path) {
	$("#deleteShoppingCar").hide();
	$("#maskLayer").hide();
	
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteShoppingcartRecordIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteshoppingcartRecordByIds.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllShoppingcartRecord.action")
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
	

function hideDeleteShoppingCarDialog(){
	$("#deleteShoppingCar").hide();
	$("#maskLayer").hide();	
}

function showDeleteShoppingCarDialog(){
	$("#deleteShoppingCar").show();
	$("#maskLayer").show();
}



function showShoppingCarRecordDetail(devbuy_web_path,cartId){
	$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/selectShoppingcartRecordCustomByPrimaryKey.action?cartId=" + cartId)
}


