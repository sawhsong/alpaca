/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0406List.js
 *************************************************************************************************/
jsconfig.put("useJqTooltip", false);
var popup = null;
var searchResultDataCount = 0;
var toDateFormat = jsconfig.get("dateFormatJs");

jsconfig.put("scrollablePanelHeightAdjust", 6);

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

	$("#authGroup").change(function() {
		doSearch();
	});

	$("#userType").change(function() {
		doSearch();
	});

	$("#userStatus").change(function() {
		doSearch();
	});

	$("#isActive").change(function() {
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
	setActionButtonContextMenu = function() {
		var ctxMenu = [{
			name:sys.sys0406.caption.auth,
			img:"fa-sitemap",
			fun:function() {openPopup({mode:"UpdateAuthGroup"});}
		}, {
			name:sys.sys0406.caption.type,
			img:"fa-users",
			fun:function() {openPopup({mode:"UpdateUserType"});}
		}, {
			name:sys.sys0406.caption.status,
			img:"fa-sliders",
			fun:function() {openPopup({mode:"UpdateUserStatus"});}
		}, {
			name:sys.sys0406.caption.active,
			img:"fa-adjust",
			fun:function() {openPopup({mode:"UpdateActiveStatus"});}
		}];

		$("#btnAction").contextMenu(ctxMenu, {
			classPrefix:com.constants.ctxClassPrefixButton,
			effectDuration:300,
			effect:"slide",
			borderRadius:"bottom 4px",
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0
		});
	};

	/*!
	 * process
	 */
	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanel");

		if (commonJs.doValidate($("#fmDefault"))) {
			commonJs.doSearch({
				url:"/sys/0406/getList.do",
				data:{},
				callback:renderDataGridTable
			});
		}
	};

	renderDataGridTable = function(result) {
		var ds = result.dataSet;
		var html = "";

		searchResultDataCount = ds.getRowCnt();
		$("#tblGridBody").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				var uiChk = new UiCheckbox();
				uiChk.setId("chkForDel").setName("chkForDel").setValue(ds.getValue(i, "USER_ID"));
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(uiChk));

				var uiAnc = new UiAnchor();
				uiAnc.setText(commonJs.abbreviate(ds.getValue(i, "USER_NAME"), 60)).setScript("getDetail('"+ds.getValue(i, "USER_ID")+"')");
				gridTr.addChild(new UiGridTd().addClassName("Lt").addChild(uiAnc));

				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "LOGIN_ID")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "AUTH_GROUP_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "USER_TYPE_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "USER_STATUS_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "EMAIL")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "IS_ACTIVE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "INSERT_DATE")));

				var iconAction = new UiIcon();
				iconAction.setId("icnAction").setName("icnAction").addClassName("fa-ellipsis-h fa-lg").addAttribute("userId:"+ds.getValue(i, "USER_ID")).setScript("doAction(this)");
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(iconAction));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:10").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));

		$("#tblGrid").fixedHeaderTable({
			attachTo:$("#divDataArea"),
			pagingArea:$("#divPagingArea"),
			isPageable:true,
			totalResultRows:result.totalResultRows,
			script:"doSearch"
		});

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.commonAction);
		});

		commonJs.bindToggleTrBackgoundWithCheckbox($("[name=chkForDel]"));
		commonJs.hideProcMessageOnElement("divScrollablePanel");
	};

	getDetail = function(userId) {
		openPopup({mode:"Detail", userId:userId});
	};

	openPopup = function(param) {
		var url = "", header = "", width = 960, height = 516;

		if (param.mode == "Detail") {
			url = "/sys/0406/getDetail.do";
			header = com.header.popHeaderDetail;
			height = 476;
		} else if (param.mode == "New") {
			url = "/sys/0406/getInsert.do";
			header = com.header.popHeaderEdit;
			height = 654;
		} else if (param.mode == "Edit") {
			url = "/sys/0406/getUpdate.do";
			header = com.header.popHeaderEdit;
			height = 654;
		} else if (param.mode == "UpdateAuthGroup") {
			url = "/sys/0406/getActionContextMenu.do";
			header = sys.sys0406.caption.auth;
			width = 350; height = 400;
		} else if (param.mode == "UpdateUserType") {
			url = "/sys/0406/getActionContextMenu.do";
			header = sys.sys0406.caption.type;
			width = 330; height = 186;
		} else if (param.mode == "UpdateUserStatus") {
			url = "/sys/0406/getActionContextMenu.do";
			header = sys.sys0406.caption.status;
			width = 330; height = 220;
		} else if (param.mode == "UpdateActiveStatus") {
			url = "/sys/0406/getActionContextMenu.do";
			header = sys.sys0406.caption.active;
			width = 330; height = 186;
		}

		if (url.indexOf("getActionContextMenu") != -1) {
			if (commonJs.getCountChecked("chkForDel") == 0) {
				commonJs.warn(com.message.I902);
				return;
			}
		}

		var popParam = {
			popupId:"user"+param.mode,
			url:url,
			data:{
				mode:param.mode,
				userId:commonJs.nvl(param.userId, "")
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

		commonJs.doDelete({
			url:"/sys/0406/exeDelete.do",
			callback:doSearch
		});
	};

	doAction = function(img) {
		var userId = $(img).attr("userId");

		$("input:checkbox[name=chkForDel]").each(function(index) {
			if (!$(this).is(":disabled") && $(this).val() == userId) {
				$(this).prop("checked", true);
			} else {
				$(this).prop("checked", false);
			}
		});

		ctxMenu.commonAction[0].fun = function() {getDetail(userId);};
		ctxMenu.commonAction[1].fun = function() {openPopup({mode:"Edit", userId:userId});};
		ctxMenu.commonAction[2].fun = function() {doDelete();};

		$(img).contextMenu(ctxMenu.commonAction, {
			classPrefix:com.constants.ctxClassPrefixGrid,
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0,
			verAdjust:2
		});
	};

	exeExport = function(menuObject) {
		if (searchResultDataCount <= 0) {
			commonJs.warn(com.message.I001);
			return;
		}

		commonJs.doExport({
			url:"/sys/0406/exeExport.do",
			data:commonJs.serialiseObject($("#divSearchCriteriaArea")),
			menuObject:menuObject
		});
	};

	exeActionContextMenu = function(param) {
		commonJs.doSimpleProcess({
			url:"/sys/0406/exeActionContextMenu.do",
			data:param,
			onSuccess:doSearch
		});
	};

	setAuthorityGroupSelectbox = function() {
		commonJs.doSearch({
			url:"/sys/0406/getAuthorityGroup.do",
			noForm:true,
			onSuccess:function(result) {
				var ds = result.dataSet;
				for (var i=0; i<ds.getRowCnt(); i++) {
					$("#authGroup").append(commonJs.getUiSelectOption({
						value:ds.getValue(i, "GROUP_ID"),
						text:ds.getValue(i, "GROUP_NAME")
					}));
				}

				$("#authGroup").selectpicker("refresh");
			}
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setActionButtonContextMenu();
		commonJs.setExportButtonContextMenu($("#btnExport"));

		commonJs.setAutoComplete($("#userName"), {
			method:"getUserName",
			label:"user_name",
			value:"user_name",
			focus: function(event, ui) {
				$("#userName").val(ui.item.label);
				return false;
			},
			select:function(event, ui) {
				doSearch();
			}
		});

		commonJs.setAutoComplete($("#loginId"), {
			method:"getLoginId",
			label:"login_id",
			value:"login_id",
			focus: function(event, ui) {
				$("#loginId").val(ui.item.label);
				return false;
			},
			select:function(event, ui) {
				doSearch();
			}
		});

		setAuthorityGroupSelectbox();
	});
});