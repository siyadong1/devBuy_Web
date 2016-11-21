			





function hideForceLogoutDialog() {
			
	$("#forceLogout").hide();
	$("#maskLayer").hide();
}
	
function showForceLogoutDialog(){
	$("#forceLogout").show();
	$("#maskLayer").show();
}






function showUserDetailDialog() {
		$("#templateContentRight").load("./html/userDetail.html #body");

}
	
function goToOrder(){
		$("#templateContentLeftDiv2").show();
	$("#templateContentHeaderTab2").addClass("templateContentHeaderTab");
	$("#templateContentLeftDiv1").hide();
	$("#templateContentLeftDiv3").hide();
	$("#templateContentLeftDiv4").hide();
	$("#templateContentLeftDiv5").hide();
	$("#templateContentLeftDiv6").hide();
	$("#templateContentHeaderTab2").addClass("templateContentHeaderTab");
	$("#templateContentHeaderTab3").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab4").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab5").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab6").removeClass("templateContentHeaderTab");
	$("#templateContentHeaderTab1").removeClass("templateContentHeaderTab");
		$("#templateContentRight").load("./html/content_2_1_1.html #body");
}

function goToAddress(){
	$("#templateContentRight").load("./html/userAddress.html #body");
	
}
