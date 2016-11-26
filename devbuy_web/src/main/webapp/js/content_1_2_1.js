			





function hideDeleteGoodsDialog() {
			
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
	$("#templateContentRight").load(devbuy_web_path + "/html/content_1_2_2.jsp #body");

}



