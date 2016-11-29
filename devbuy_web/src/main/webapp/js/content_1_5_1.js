			





function hideDeleteRecommendDialog() {
			
	$("#deleteRecommend").hide();
	$("#maskLayer").hide();
}
	
function showDeleteRecommendDialog(){
	$("#deleteRecommend").show();
	$("#maskLayer").show();
}




function hideAddRecommendDialog() {
			
	$("#addRecommend").hide();
	$("#maskLayer").hide();
}
	
function showAddRecommendDialog(){
	$("#addRecommend").show();
	$("#maskLayer").show();
}




function showEditRecommendDialog(devbuy_web_path,rcId) {
	$("#templateContentRight").load( devbuy_web_path + "/java/manageplatform/selectRecommendCustomById.action?rcId=" + rcId);
}
	


