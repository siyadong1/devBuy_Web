			




	
function goToOrder(devbuy_web,userId){
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
	$("#templateContentRight").load(devbuy_web + "/java/manageplatform/selectSelectiveOrders.action?userId=" + userId + "&tag=userOrder")
}

function goToAddress(devbuy_web,userId){
	$("#templateContentRight").load(devbuy_web + "/java/manageplatform/queryUserAddress.action?userId=" + userId)
}



function confirmUserDetail(devbuy_web){
	$("#templateContentRight").load(devbuy_web +  "/java/manageplatform/queryAllUsers.action")
}

