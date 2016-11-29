			





function hideDeleteBannerGoodsDialog() {
			
	$("#deleteBannerGoods").hide();
	$("#maskLayer").hide();
}
	
function showDeleteBannerGoodsDialog(){
	$("#deleteBannerGoods").show();
	$("#maskLayer").show();
	
}


function confirmDeleteBannerGoodsDialog(devbuy_web_path){
	$("#deleteBannerGoods").hide();
	$("#maskLayer").hide();

	var index = layer.load(1, {
		  shade: [0.1,'#fff'] //0.1透明度的白色背景
		});
	 var form = $("form[name=deleteBannerIds]");  
     var options  = {    
         url:devbuy_web_path + '/java/manageplatform/deleteBannerByIds.action',    
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
					$("#templateContentRight").load(devbuy_web_path + "/java/manageplatform/queryAllBanners.action")
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





function hideAddBannerGoodsDialog() {
			
	$("#addBannerGoods").hide();
	$("#maskLayer").hide();
}
	
function showAddBannerGoodsDialog(devbuy_web_path){
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectClassificationForAddBanner.action");
}


function showEditBannerGoodsDialog(devbuy_web_path,bnId){
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectBannerCustomById.action?bnId=" + bnId);
}






