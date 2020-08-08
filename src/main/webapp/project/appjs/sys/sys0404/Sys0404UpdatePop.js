/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0404UpdatePop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnSave").click(function(event) {
		if (!commonJs.doValidate("fmDefault")) {
			return;
		}

		commonJs.doSave({
			url:"/sys/0404/exeUpdate.do",
			data:{},
			callback:function() {
				parent.popup.close();
				parent.doSearch();
			}
		});
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

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
	});
});