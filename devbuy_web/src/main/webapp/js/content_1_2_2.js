			




function updateItems(devbuy_web_path){
	
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=updateGoods]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/updateItemByItemId.action',    
         type:'post',    
         success:function(data)    
         {   
        	 layer.close(index);    
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{
            	 layer.msg('更新成功！',{time:1000}); 
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllItems.action")
             } 
         }  
     };    
     form.ajaxSubmit(options);  
}

