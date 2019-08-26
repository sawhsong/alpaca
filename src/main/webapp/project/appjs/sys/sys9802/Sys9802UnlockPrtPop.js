/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9802UnlockPrtPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnUnlock").click(function(event) {
		if (commonJs.doValidate("fmDefault")) {
			commonJs.doDelete({
				url:"sys/9802/",
				callback:function() {
					parent.popup.close();
				}
			});
		}
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
		setTimeout(function() {
			$("#tblGrid").fixedHeaderTable({
				attachTo:$("#divDataArea")
			});
		}, 400);
	});
});