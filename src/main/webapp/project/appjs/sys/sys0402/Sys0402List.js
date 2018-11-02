/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0402List.js
 *************************************************************************************************/
var popup = null;
var searchResultDataCount = 0;
var attchedFileContextMenu = [];

$(function() {
	/*!
	 * event
	 */
	$("#btnNew").click(function(event) {
		openPopup({mode:"New"});
	});

	$("#btnDelete").click(function(event) {
		doDelete();
	});

	$("#btnSearch").click(function(event) {
		doSearch();
	});

	$("#btnClear").click(function(event) {
		commonJs.clearSearchCriteria();
	});

	$("#icnCheck").click(function(event) {
		commonJs.toggleCheckboxes("chkForDel");
	});

	$("#btnSetSort").click(function(event) {
		openPopup({mode:"SetSort"});
	});

	$("#searchMenu").change(function() {
		doSearch();
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;
		}
	});

	/*!
	 * context menus
	 */

	/*!
	 * process
	 */
	doSearch = function() {
		commonJs.doSubmit({action:"/sys/0402/getList.do"});
	};

	getDetail = function(paramValue) {
		openPopup({mode:"Detail", paramValue:paramValue});
	};

	openPopup = function(param) {
		var url = "", header = "";
		var width = 700, height = 0;

		if (param.mode == "Detail") {
			url = "/sys/0402/getDetail.do";
			header = com.header.popHeaderDetail;
			height = 296;
		} else if (param.mode == "New") {
			url = "/sys/0402/getInsert.do";
			header = com.header.popHeaderEdit;
			height = 384;
		} else if (param.mode == "Edit") {
			url = "/sys/0402/getUpdate.do";
			header = com.header.popHeaderEdit;
			height = 410;
		} else if (param.mode == "SetSort") {
			url = "/sys/0402/getUpdateSortOrder.do";
			header = sys.header.popHeaderSort;
			width = 900;
			height = 700;
		}

		var popParam = {
			popupId:"menu"+param.mode,
			url:url,
			paramData:{
				mode:param.mode,
				paramValue:param.paramValue
			},
			header:header,
			blind:true,
			width:width,
			height:height
		};

		popup = commonJs.openPopup(popParam);
	};

	doDelete = function() {
		if (commonJs.getCountChecked("chkForDel") == 0) {
			commonJs.warn(com.message.I902);
			return;
		}

		commonJs.confirm({
			contents:com.message.Q002,
			buttons:[{
				caption:"Yes",
				callback:function() {
					exeDelete();
				}
			}, {
				caption:"No",
				callback:function() {
				}
			}],
			blind:true
		});
	};

	exeDelete = function() {
		commonJs.ajaxSubmit({
			url:"/sys/0402/exeDelete.do",
			dataType:"json",
			formId:"fmDefault",
			success:function(data, textStatus) {
				var result = commonJs.parseAjaxResult(data, textStatus, "json");

				if (result.isSuccess == true || result.isSuccess == "true") {
					commonJs.openDialog({
						type:"information",
						contents:result.message,
						blind:true,
						buttons:[{
							caption:"Ok",
							callback:function() {
								doSearch();
							}
						}]
					});
				} else {
					commonJs.error(result.message);
				}
			}
		});
	};

	doAction = function(img) {
		var deletable = $(img).attr("deletable");
		var paramValue = $(img).attr("paramValue");

		$("input:checkbox[name=chkForDel]").each(function(index) {
			if (!$(this).is(":disabled") && $(this).val() == paramValue) {
				$(this).prop("checked", true);
			} else {
				$(this).prop("checked", false);
			}
		});

		if (deletable == "true") {
			ctxMenu.commonAction[2].disable = false;
		} else {
			ctxMenu.commonAction[2].disable = true;
		}

		ctxMenu.commonAction[0].fun = function() {getDetail(paramValue);};
		ctxMenu.commonAction[1].fun = function() {openPopup({mode:"Edit", paramValue:paramValue});};
		ctxMenu.commonAction[2].fun = function() {doDelete();};

		$(img).contextMenu(ctxMenu.commonAction, {
			classPrefix:"actionInGrid",
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0,
			verAdjust:2,
			containment:$("#divScrollablePanel")
		});
	};

	setExportButtonContextMenu = function() {
		ctxMenu.commonExport[0].fun = function() {exeExport(ctxMenu.commonExport[0]);};
		ctxMenu.commonExport[1].fun = function() {exeExport(ctxMenu.commonExport[1]);};
		ctxMenu.commonExport[2].fun = function() {exeExport(ctxMenu.commonExport[2]);};
		ctxMenu.commonExport[3].fun = function() {exeExport(ctxMenu.commonExport[3]);};
		ctxMenu.commonExport[4].fun = function() {exeExport(ctxMenu.commonExport[4]);};
		ctxMenu.commonExport[5].fun = function() {exeExport(ctxMenu.commonExport[5]);};

		$("#btnExport").contextMenu(ctxMenu.commonExport, {
			classPrefix:"actionButton",
			effectDuration:300,
			effect:"slide",
			borderRadius:"bottom 4px",
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0,
			verAdjust:0
		});
	};

	exeExport = function(menuObject) {
		$("[name=fileType]").remove();
		$("[name=dataRange]").remove();

		if (rowCnt <= 0) {
			commonJs.warn(com.message.I001);
			return;
		}

		commonJs.confirm({
			contents:com.message.Q003,
			buttons:[{
				caption:"Yes",
				callback:function() {
					commonJs.doSubmit({
						form:"fmDefault",
						action:"/sys/0402/exeExport.do",
						data:{
							fileType:menuObject.fileType,
							dataRange:menuObject.dataRange
						}
					});
				}
			}, {
				caption:"No",
				callback:function() {
				}
			}],
			blind:true
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		$("#tblGrid").fixedHeaderTable({
			baseDivElement:"divScrollablePanel",
			widthAdjust:33
		});

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.commonAction);
		});

		setExportButtonContextMenu();
	});
});