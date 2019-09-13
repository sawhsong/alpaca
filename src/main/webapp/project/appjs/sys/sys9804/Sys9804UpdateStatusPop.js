/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9804UpdateStatusPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnSave").click(function(event) {
		commonJs.doSave({
			url:"/sys/9804/doUpdateStatus.do",
			data:{invoiceId:invoiceId},
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