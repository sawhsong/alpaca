/**************************************************************************************************
 * Framework Generated Javascript Source
 * - SysCommonCodeDetailPop.js
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

	$("#btnClose").click(function(event) {
		parent.popup.close();
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;
		}
	});

	/*!
	 * process
	 */
	doProcessByButton = function(param) {
		var articleId = "<%=sysBoard.getArticleId()%>";
		var actionString = "";
		var params = {};

		if (param.mode == "Update") {
			actionString = "/sys/sysBasicInfo/sysCommonCode/getUpdate.do";
		} else if (param.mode == "Reply") {
			actionString = "/sys/sysBasicInfo/sysCommonCode/getInsert.do";
		} else if (param.mode == "Delete") {
			actionString = "/sys/sysBasicInfo/sysCommonCode/exeDelete.do";
		}

		params = {
			form:"fmDefault",
			action:actionString,
			data:{
				mode:param.mode,
				articleId:articleId
			}
		};

		if (param.mode == "Update") {
			parent.popup.resizeTo(0, 130);
		}

		if (param.mode == "Delete") {
			commonJs.doDelete({
				url:actionString,
				data:{articleId:params.data.articleId},
				onSuccess:function() {
					parent.popup.close();
					parent.doSearch();
				}
			});
		} else {
			commonJs.doSubmit(params);
		}
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
	});
});