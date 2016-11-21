<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>版本列表</title>
		<link rel="stylesheet" href="../css/content_6_2_1.css" />
		<link rel="stylesheet" href="../css/common.css" />
		<link rel="stylesheet" href="../css/ui.css" />
		<script type="text/javascript" src="../js/jquery-2.1.1.min.js" ></script>
	</head>
	<body>
		

		<div id="body">
			
			<!--删除版本-->
			<div id="deleteVersion" >
				<p style="margin-left: 244px; margin-top: 16px; color: #178EE0; font-size: 18px; font-family: '微软雅黑';"  >确定删除所选版本</p>
				<button  onclick="hideDeleteVersionDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 50px;">取消</button>
				<button  onclick="hideDeleteVersionDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 50px;" >确定</button>
			</div>
		
			
			<!--新增版本-->
			
			<div id="addVersion" >
				<div><p>新增版本</p></div>
				
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">版本名称</span></td>
							<td><input class="text16px" type="text" id="" value="1.0.1" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本号</span></td>
							<td><input class="text16px" type="text" id="" value="1" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">上传版本</span></td>
							<td><input type="file" class="text16px" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否显示</span></td>
							<td>
								<select>
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">创建时间</span></td>
							<td><input class="text16px" type="text" id="" value="2016-09-22   17：26：23" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">修改时间</span></td>
							<td><input class="text16px" type="text" id="" value="2016-09-22   17：26：23" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本说明</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
					</table>
				</form>
				<button  onclick="hideAddVersionDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button  onclick="hideAddVersionDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
			<!--编辑版本-->
			
						
			<div id="editVersion" >
				<div><p>编辑版本</p></div>
				
				<form>
					<table  cellspacing="16px">
						<tr>
							<td><span class="text16px ">版本名称</span></td>
							<td><input class="text16px" type="text" id="" value="1.0.1" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本号</span></td>
							<td><input class="text16px" type="text" id="" value="1" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">是否显示</span></td>
							<td>
								<select>
									<option>是</option>
									<option>否</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span class="text16px ">创建时间</span></td>
							<td><input class="text16px" type="text" id="" value="2016-09-22   17：26：23" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">修改时间</span></td>
							<td><input class="text16px" type="text" id="" value="2016-09-22   17：26：23" /></td>
						</tr>
						<tr>
							<td><span class="text16px ">版本说明</span></td>
							<td><textarea class="text16px"></textarea></td>
						</tr>
					</table>
				</form>
				<button  onclick="hideEditVersionDialog()" class="redButton" style="position: absolute; right: 16px; bottom: 16px;">取消</button>
				<button  onclick="hideEditVersionDialog()" class="blueButton"  style="position: absolute; right: 95px; bottom: 16px;" >确定</button>
				
			</div>
			
			
			
			
			
				<!--模板内容区域右侧开始-->
				
				
				
				
				
				
				
		<div id="ContentRight_6_2_1">
			<div id="ContentRightTitle_6_2_1">
				<button onclick="showDeleteVersionDialog()" class="contentButton" id="btnDeleteClass" >删除</button>
				<button onclick="showAddVersionDialog()"   class="contentButton">新增</button>
				<input type="text" placeholder="搜索版本"></input>
				<img src="img/iv_search_query.png" />
			</div>
			
			
			<table>
				<tr>
					<td>  <input type="checkbox" />  <p id="ContentRightFirtst_1_1_1">全选</p></td>
					<td><p>版本名称</p></td>
					<td><p>版本号</p></td>
					<td><p>版本更新说明</p></td>
					<td><p>是否使用</p></td>
					<td><p>创建时间</p></td>
					<td><p>操作</p></td>
				</tr>
				
				
				<tr>
					<td>  <input type="checkbox" /></td>
					<td><p>1.0.1</p></td>
					<td><p title="1">1</p></td>
					<td><p>devBuy的第一个...</p></td>
					<td><p>是</p></td>
					<td><p>2016-09-22   17:13:23</p></td>
					<td><button  onclick="showEditVersionDetailDialog()" >查看详情</button></td>
				</tr>
				
				
				
				
			</table>
		</div>
		</div>


	</body>
</html>
