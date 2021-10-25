/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9802UnlockPrtPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#icnCheck").click(function(event) {
		commonJs.toggleCheckboxes("chkForAction");
	});

	$("#btnUnlock").click(function(event) {
		if (commonJs.getCountChecked("chkForAction") == 0) {
			commonJs.warn(com.message.I902);
			return;
		}

		commonJs.doDelete({
			url:"/sys/9802/doUnlockPrt.do",
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
		setTimeout(function() {
			$("#tblGrid").fixedHeaderTable({
				attachTo:$("#divDataArea")
			});

			$("#icnCheck").trigger("click");
			commonJs.bindToggleTrBackgoundWithCheckbox($("[name=chkForAction]"));
		}, 400);
	});
});