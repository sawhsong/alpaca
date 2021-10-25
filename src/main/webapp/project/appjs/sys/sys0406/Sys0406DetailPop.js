/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0406DetailPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnEdit").click(function(event) {
		doProcessByButton({mode:"Update"});
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
		var action = "";
		var params = {};

		if (param.mode == "Update") {
			action = "/sys/0406/getUpdate.do";
		} else if (param.mode == "Delete") {
			action = "/sys/0406/exeDelete.do";
		}

		if (param.mode == "Update") {
			parent.popup.resizeTo(0, 178);
		}

		if (param.mode == "Delete") {
			commonJs.doDelete({
				url:action,
				data:{
					userId:userId
				},
				callback:function() {
					parent.popup.close();
					parent.doSearch();
				}
			});
		} else {
			commonJs.doSimpleProcessForPage({
				action:action,
				data:{
					mode:param.mode,
					userId:userId
				}
			});
		}
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
	});
});