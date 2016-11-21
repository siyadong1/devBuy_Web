			





function hideDeleteAllOrderDialog() {
	$("#deleteAllOrder").hide();
	$("#maskLayer").hide();
}
	
function showDeleteAllOrderDialog(){
	$("#deleteAllOrder").show();
	$("#maskLayer").show();
}

function showAllOrderDialog(){
	$("#templateContentRight").load("./html/orderDetail.html #body");
}

