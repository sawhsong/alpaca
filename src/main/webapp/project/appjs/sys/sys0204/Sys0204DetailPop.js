/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0204DetailPop.js
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

		if (param.mode == "Update") {
			action = "/sys/0204/getUpdate.do";
			parent.popup.resizeTo(0, -24);
		} else if (param.mode == "Delete") {
			action = "/sys/0204/exeDelete.do";
		}

		if (param.mode == "Delete") {
			commonJs.doDelete({
				url:action,
				data:{
					countryCurrencyId:countryCurrencyId
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
					countryCurrencyId:countryCurrencyId
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