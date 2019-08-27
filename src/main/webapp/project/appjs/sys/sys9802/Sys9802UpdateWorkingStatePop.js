/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9802UpdateWorkingStatePop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnEdit").click(function(event) {
		commonJs.doSave({
			url:"/sys/9802/doUpdateWorkingState.do",
			data:{assignmentId:assignmentId},
			callback:function() {
				parent.popup.close();
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