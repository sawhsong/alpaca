/**************************************************************************************************
 * Framework Generated Javascript Source
 * - SysCountryCurrencyEditPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnSave").click(function(event) {
		if (commonJs.doValidate("fmDefault")) {
			commonJs.doSaveWithFile({
				url:"/sys/sysBasicInfo/sysCountryCurrency/exeInsert.do",
				data:{articleId:articleId},
				callback:function() {
					parent.popup.close();
					parent.doSearch();
				}
			});
		}
	});

	$("#btnClose").click(function(event) {
		parent.popup.close();
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

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
	});
});