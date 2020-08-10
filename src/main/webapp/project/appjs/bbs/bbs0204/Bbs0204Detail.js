/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Bbs0204Detail.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnEdit").click(function(event) {
		doProcessByButton({mode:"Update"});
	});

	$("#btnReply").click(function(event) {
		doProcessByButton({mode:"Reply"});
	});

	$("#btnDelete").click(function(event) {
		doProcessByButton({mode:"Delete"});
	});

	$("#btnBack").click(function(event) {
		history.go(-1);
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;
		}
	});

	/*!
	 * process
	 */
	setEditor = function() {
		$("#articleContents").ckeditor({
			height:500,
			toolbar:com.constants.toolbarDefault,
			readOnly:true
		});
	};

	exeDownload = function(repositoryPath, originalName, newName) {
		commonJs.doSimpleProcessForPage({
			action:"/download.do",
			data:{
				repositoryPath:repositoryPath,
				originalName:originalName,
				newName:newName
			}
		});
	};

	doProcessByButton = function(param) {
		var action = "";
		var params = {};

		if (param.mode == "Update") {
			action = "/bbs/0204/getUpdate.do";
		} else if (param.mode == "Reply") {
			action = "/bbs/0204/getInsert.do";
		} else if (param.mode == "Delete") {
			action = "/bbs/0204/exeDelete.do";
		}

		params = {
			form:"fmDefault",
			action:action,
			data:{
				mode:param.mode,
				articleId:articleId
			}
		};

		if (param.mode == "Delete") {
			commonJs.doDelete({
				url:action,
				data:{
					articleId:params.data.articleId
				},
				callback:function() {
					commonJs.doSimpleProcessForPage({
						action:"/bbs/0204/getDefault.do"
					});
				}
			});
		} else {
			commonJs.doSimpleProcessForPage(params);
		}
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setEditor();
	});
});