/**
 * freeBoardInsert.js
 */
$(function() {
	/*!
	 * event
	 */
	$("#btnSave").click(function(event) {
		if (commonJs.doValidate("fmDefault")) {
			commonJs.doSaveWithFileForPage({
				action:"/zebra/board/freeboard/exeInsert.do",
				data:{articleId:articleId}
			});
		}
	});

	$("#btnBack").click(function(event) {
		history.go(-1);
	});

	$("#btnAddFile").click(function(event) {
		commonJs.addFileSelectObject({
			appendToId:"divAttachedFile",
			rowBreak:false
		});
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
			height:450,
			toolbar:com.constants.toolbarDefault
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setEditor();
	});
});