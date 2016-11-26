			


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
	 var form = $("form[name=deleteCategoryIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteClassificationByIds.action',    
         type:'post',    
         success:function(data)    
         {   
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{  
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllClassification.action");
             } 
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
	 var form = $("form[name=addCategory]");  
     var options  = {   
         url:devbuy_web_path + '/java/manageplatform/addClassification.action',    
         type:'post',  
         success:function(data)    
         {  
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{  
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllClassification.action");
             } 
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
	 var form = $("form[name=editCategory]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/updateClassificationById.action',    
         type:'post',    
         success:function(data)    
         {   
             if(data.code != "000000"){  
                 var message = data.message;  
                 layer.alert(message, {icon: 2});
             }else{  
            	 $("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllClassification.action");
             } 
         }  
     };    
     form.ajaxSubmit(options);  
}


