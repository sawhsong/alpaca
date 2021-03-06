/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0402DetailPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnEdit").click(function(event) {
		doProcessByButton({mode:"Update"});
	});

	$("#btnDelete").click(function(event) {
		if (deleteStatus == "disabled") {
			return;
		}
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

		if (param.mode == "Update") {
			action = "/sys/0402/getUpdate.do";
		} else if (param.mode == "Delete") {
			action = "/sys/0402/exeDelete.do";
		}

		if (param.mode == "Update") {
			parent.popup.resizeTo(0, 72);
		}

		if (param.mode == "Delete") {
			commonJs.doDelete({
				url:action,
				data:{
					paramValue:paramValue,
					menuId:menuId
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
					paramValue:paramValue,
					menuId:menuId
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