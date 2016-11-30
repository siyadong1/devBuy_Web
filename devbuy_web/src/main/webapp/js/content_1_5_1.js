			





function hideDeleteRecommendDialog() {
			
	$("#deleteRecommend").hide();
	$("#maskLayer").hide();
}
	
function showDeleteRecommendDialog(){
	$("#deleteRecommend").show();
	$("#maskLayer").show();
}




function confirmHideDeleteRecommendDialog(devbuy_web_path){
	$("#deleteRecommend").hide();
	$("#maskLayer").hide();

	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteRecommendIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteRecommendByIds.action',    
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
         } ,
	     error:function(data)    
	     {    
		 	 layer.close(index);    
	         layer.alert("连接服务器失败！", {icon: 2});
	     }

     };    
     form.ajaxSubmit(options);  
	
	
	
}










function showAddRecommendDialog(devbuy_web_path){
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectClassificationForAddRecommend.action");
}




function showEditRecommendDialog(devbuy_web_path,rcId) {
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectRecommendCustomById.action?rcId=" + rcId);
}
	


