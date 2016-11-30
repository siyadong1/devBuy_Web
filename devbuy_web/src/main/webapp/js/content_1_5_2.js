
function confirmUpdateRecommendAndUpdateItems(devbuy_web_path){
	
	var index = layer.load(1, {
		shade: [0.1,'#fff'] //0.1透明度的白色背景
	}, {time: 10*1000});
	var form = $("form[name=updateAndAddRecommend]");  
	var options  = {    
			url:devbuy_web_path + '/java/manageplatform/updateRecommendAndUpdateItems.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllRecommend.action")
				} 
			},
			
			error:function(data)    
			{    
				layer.close(index);    
				layer.alert("连接服务器失败！", {icon: 2});
			}
			
			
			
	};    
	form.ajaxSubmit(options);  
}








function confirmAddRecommendAndAddItems(devbuy_web_path){
	
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		}, {time: 10*1000});
	 var form = $("form[name=updateAndAddRecommend]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/addRecommendAndAddItems.action',    
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
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllRecommend.action")
             } 
         },
     
         error:function(data)    
         {    
    	 	 layer.close(index);    
             layer.alert("连接服务器失败！", {icon: 2});
         }
 
     
     
     };    
     form.ajaxSubmit(options);  
}









