			





function hideDeleteShoppingCarDialog() {
			
	$("#deleteShoppingCar").hide();
	$("#maskLayer").hide();
}
	
function showDeleteShoppingCarDialog(){
	$("#deleteShoppingCar").show();
	$("#maskLayer").show();
}






function showShoppingCarRecordDetail(){
		$("#templateContentRight").load("./html/shoppingCarDetail.html #body");
}


