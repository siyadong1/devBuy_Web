			





function hideDeleteAllOrderDialog() {
	$("#deleteAllOrder").hide();
	$("#maskLayer").hide();
}
	
function showDeleteAllOrderDialog(){
	$("#deleteAllOrder").show();
	$("#maskLayer").show();
}

function showAllOrderDialog(){
	$("#templateContentRight").load("/devbuy_web/html/orderDetail.jsp #body");
}

