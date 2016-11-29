			





function hideDeleteGoodsDialog() {
			
	$("#deleteGoods").hide();
	$("#maskLayer").hide();
}
	



function confirmHideDeleteGoodsDialog() {
			
	$("#deleteGoods").hide();
	$("#maskLayer").hide();
	
	
	
	
	
}
	




function showDeleteGoodsDialog(){
	$("#deleteGoods").show();
	$("#maskLayer").show();
}




function showEditGoodsDialog(devbuy_web_path,itemsId){
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectItemByItemId.action?itemsId=" + itemsId);
}


function showAddGoodsDialog(devbuy_web_path){
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectClassificationForAddGoods.action");

}








function confirmDeleteGoodsDialog(devbuy_web_path){
	$("#deleteGoods").hide();
	$("#maskLayer").hide();
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteItemsIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteItemsByIds.action',    
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
					$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/queryAllItems.action")
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

	






