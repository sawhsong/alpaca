/**
 * commonCodeDetailPop.js
 */
$(function() {
	/*!
	 * event
	 */
	$("#btnEdit").click(function(event) {
		doProcessByButton({mode:"Update"});
	});

	$("#btnDelete").click(function(event) {
		if ($("#btnDelete").attr("disabled") == "disabled") {return;}
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
		var actionString = "";
		var params = {};

		if (param.mode == "Update") {
			actionString = "/zebra/framework/commoncode/getUpdate.do";
		} else if (param.mode == "Delete") {
			actionString = "/zebra/framework/commoncode/exeDelete.do";
		}

		params = {
			form:"fmDefault",
			action:actionString,
			data:{
				mode:param.mode,
				codeType:codeType
			}
		};

		if (param.mode == "Delete") {
			commonJs.doDelete({
				url:"/zebra/framework/commoncode/exeDelete.do",
				data:{codeType:params.data.codeType},
				callback:function() {
					parent.popup.close();
					parent.doSearch();
				}
			});
		} else {
			commonJs.doSimpleProcessForPage(params);
		}
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setTimeout(function() {
			$("#tblGrid").freezeHeader({
				attachTo:$("#divDataArea")
			});
		}, 500);
	});
});