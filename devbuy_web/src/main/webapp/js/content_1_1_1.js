			


function showDeleteCategoryDialog(){
	$("#deleteCategory").show();
	$("#maskLayer").show();
}

function hideDeleteCategoryDialog() {
	$("#deleteCategory").hide();
	$("#maskLayer").hide();
}

function confirmDeleteCategoryDialog(devbuy_web_path){
	$("#deleteCategory").hide();
	$("#maskLayer").hide();
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteCategoryIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteClassificationByIds.action',    
         type:'post',    
         success:function(data)    
         {   
        	 layer.close(index);    
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{  
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllClassification.action");
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

	




function showAddCategoryDialog(){
	$("#addCategory").show();
	$("#maskLayer").show();
}



function hideAddCategoryDialog() {
			
	$("#addCategory").hide();
	$("#maskLayer").hide();
}
	

function confirmHideAddCategoryDialog(devbuy_web_path){
	$("#addCategory").hide();
	$("#maskLayer").hide();
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=addCategory]");  
     var options  = {   
         url:devbuy_web_path + '/java/manageplatform/addClassification.action',    
         type:'post',  
         success:function(data)    
         {  
        	 layer.close(index);    
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{  
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllClassification.action");
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






function showEditCategoryDialog(cfName,cfDes,cfId){
	$("#editCategory").show();
	$("#maskLayer").show();
	$("#editCategoryName").val(cfName);
	$("#editCategoryDesc").val(cfDes);
	$("#editCategoryCfId").val(cfId);
}



function hideEditCategoryDialog() {
			
	$("#editCategory").hide();
	$("#maskLayer").hide();
}


function confirmHideEditCategoryDialog(devbuy_web_path){
	$("#editCategory").hide();
	$("#maskLayer").hide();
	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=editCategory]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/updateClassificationById.action',    
         type:'post',    
         success:function(data)    
         {   
        	 layer.close(index);    
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{  
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllClassification.action");
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


