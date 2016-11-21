			





function hideDeleteGoodsDialog() {
			
	$("#deleteGoods").hide();
	$("#maskLayer").hide();
}
	
function showDeleteGoodsDialog(){
	$("#deleteGoods").show();
	$("#maskLayer").show();
}

function showAddGoodsDialog(){
	$("#templateContentRight").load("./html/content_1_2_2.html #body");
}

