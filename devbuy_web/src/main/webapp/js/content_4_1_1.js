			





function hideDeleteUserListDialog() {
	
	$("#deleteUserList").hide();
	$("#maskLayer").hide();
}




function confirmHideDeleteUserListDialog(devbuy_web_path) {
	$("#deleteUserList").hide();
	$("#maskLayer").hide();
	
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteUserByIds]");  
   var options  = {    
       url:devbuy_web_path + '/java/manageplatform/deleteUserByIds.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllUsers.action")
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
	





function showDeleteUserListDialog(){
	$("#deleteUserList").show();
	$("#maskLayer").show();
}






function showUserDetailDialog(devbuy_web_path,userId) {
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/queryUserDetail.action?userId=" + userId);
}

