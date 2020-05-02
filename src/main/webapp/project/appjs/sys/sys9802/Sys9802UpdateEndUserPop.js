/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9802UpdateEndUserPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnEdit").click(function(event) {
		commonJs.doSave({
			url:"/sys/9802/doUpdateEndUser.do",
			data:{assignmentId:assignmentId},
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
		commonJs.setAutoComplete($("#endUserToName"), {
			method:"getOrgByNameOrId",
			label:"org_name_with_org_id",
			value:"organisation_id",
			minLength:2,
			focus: function(event, ui) {
				$("#endUserToId").val(ui.item.value);
				$("#endUserToName").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#endUserToName").val())) {
					$("#endUserToId").val("");
					$("#endUserToName").val("");
				}
			},
			select:function(event, ui) {
				$("#endUserToId").val(ui.item.value);
				$("#endUserToName").val(ui.item.label);
				return false;
			}
		});
	});
});