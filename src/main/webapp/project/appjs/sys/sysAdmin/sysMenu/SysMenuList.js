/**************************************************************************************************
 * Framework Generated Javascript Source
 * - SysMenuList.js
 *************************************************************************************************/
jsconfig.put("scrollablePanelHeightAdjust", 20);

var popup = null;
var searchResultDataCount = 0;
var langCode = commonJs.upperCase(jsconfig.get("langCode"));
var delimiter = jsconfig.get("dataDelimiter");

$(function() {
	/*!
	 * event
	 */
	$("#btnNew").click(function(event) {
		getEdit("", "");
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
		getSortOrder();
	});

	$("#searchMenu").change(function() {
		doSearch();
	});

	$("[name=chkForDel]").click(function(event) {
		var thisChecked = $(this).prop("checked"), thisMenuId = $(this).val(), thisValue = $(this).attr("paramValue");
		var thisValueItems = thisValue.split(delimiter);
		var thisLevel = thisValueItems[0];
		var thisPaths = thisValueItems[1].split("/");

		$("[name=chkForDel]").each(function(index) {
			var val = $(this).attr("paramValue");
			var valItems = val.split(delimiter);
			var level = valItems[0];
			var paths = valItems[1].split("/");

			if (thisValue != val) {
				if (thisLevel == "1") {
					if (level > thisLevel && thisMenuId == paths[0]) {
						$(this).prop("checked", thisChecked);
					}
				}

				if (thisLevel == "2") {
					if (thisChecked) {
						if ((level > thisLevel && thisMenuId == paths[1]) || (level < thisLevel && thisPaths[0] == paths[0])) {
							$(this).prop("checked", thisChecked);
						}
					} else {
						if (level > thisLevel && thisMenuId == paths[1]) {
							$(this).prop("checked", thisChecked);
						}
					}
				}

				if (thisLevel == "3") {
					if (thisChecked) {
						if ((level == "1" && thisPaths[0] == paths[0]) || (level == "2" && thisPaths[1] == paths[1])) {
							$(this).prop("checked", thisChecked);
						}
					}
				}
			}
		});

		if (!thisChecked && thisLevel == "2") {
			if (!hasChildChecked(thisLevel, thisPaths[0])) {
				$("[name=chkForDel]").each(function(index) {
					var val = $(this).attr("paramValue");
					var valItems = val.split(delimiter);
					var level = valItems[0];
					var paths = valItems[1].split("/");

					if (paths[0] == thisPaths[0]) {
						$(this).prop("checked", false);
						return false;
					}
				});
			}
		}

		if (!thisChecked && thisLevel == "3") {
			if (!hasChildChecked(thisLevel, thisPaths[1])) {
				$("[name=chkForDel]").each(function(index) {
					var val = $(this).attr("paramValue");
					var valItems = val.split(delimiter);
					var level = valItems[0];
					var paths = valItems[1].split("/");

					if (paths[1] == thisPaths[1]) {
						$(this).prop("checked", false);
						return false;
					}
				});
			}

			if (!hasChildChecked(2, thisPaths[0])) {
				$("[name=chkForDel]").each(function(index) {
					var val = $(this).attr("paramValue");
					var valItems = val.split(delimiter);
					var level = valItems[0];
					var paths = valItems[1].split("/");

					if (paths[0] == thisPaths[0]) {
						$(this).prop("checked", false);
						return false;
					}
				});
			}
		}

		$("[name=chkForDel]").each(function(index) {
			if ($(this).is(":checked")) {
				$(this).parents("tr").addClass("checkedTr");
			} else {
				$(this).parents("tr").removeClass("checkedTr");
			}
		});
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
	setCheckbox = function() {
		var selectedAuthGroup = $("#authGroup").val(), groupId = "";

		if (commonJs.isEmpty(selectedAuthGroup)) {
			$("[name=chkForDel]").each(function(index) {
				$(this).prop("chkForDel", false);
			});
			return;
		}

		$("[name=chkForDel]").each(function(index) {
			groupId = $(this).attr("groupId");

			if (!commonJs.isEmpty(groupId) && groupId.indexOf(selectedAuthGroup) != -1) {
				$(this).prop("checked", true);
				$(this).addClass("checkedTr");
			} else {
				$(this).prop("checked", false);
				$(this).removeClass("checkedTr");
			}
		});
	};

	hasChildChecked = function(paramLevel, paramMenuId) {
		var rtn = false;

		$("[name=chkForDel]:checked").each(function(index) {
			var val = $(this).attr("paramValue");
			var valItems = val.split(delimiter);
			var level = valItems[0];
			var paths = valItems[1].split("/");

			if (paramLevel == "2") {
				if (level > paramLevel && paths[0] == paramMenuId || level == paramLevel && paths[0] == paramMenuId) {
					rtn = true;
				}
			}

			if (paramLevel == "3") {
				if (level == paramLevel && paths[1] == paramMenuId) {
					rtn = true;
				}
			}
		});
		return rtn;
	};

	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanel");

		if (commonJs.doValidate($("#fmDefault"))) {
			commonJs.doSearch({
				url:"/sys/sysAdmin/sysMenu/getList.do",
				data:{},
				onSuccess:renderDataGridTable
			});
		}
	};

	renderDataGridTable = function(result) {
		var dataSet = result.dataSet;
		var html = "";

		searchResultDataCount = dataSet.getRowCnt();
		$("#tblGridBody").html("");

		if (dataSet.getRowCnt() > 0) {
			for (var i=0; i<dataSet.getRowCnt(); i++) {
				var gridTr = new UiGridTr();
				var menuPath = dataSet.getValue(i, "PATH");
				var menuId = dataSet.getValue(i, "MENU_ID");
				var menuName = dataSet.getValue(i, "MENU_NAME_"+langCode);
				var deletable = dataSet.getValue(i, "DELETABLE");
				var className = "chkEn", disabledStr = "";
				var space = "", style = "", paramValue = "";
				var iLevel = parseInt(dataSet.getValue(i, "MENU_LEVEL")) - 1;

				style = (iLevel == 0 || iLevel == 1) ? "font-weight:bold;" : "";
				for (var j=0; j<iLevel; j++) {
					space += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				}

				if (!commonJs.toBoolean(deletable)) {
					className = "chkDis";
					disabledStr = "disabled";
				}

				paramValue = dataSet.getValue(i, "MENU_LEVEL")+delimiter+menuPath+delimiter+deletable;

				var iconAction = new UiIcon();
				iconAction.setId("icnAction").setName("icnAction").addClassName("fa-ellipsis-h fa-lg").addAttribute("menuId:"+menuId).addAttribute("paramValue:"+paramValue).setScript("doAction(this)");
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(iconAction));

				var uiChk = new UiCheckbox();
				uiChk.setId("chkForDel").setName("chkForDel").setValue(menuId).addAttribute("paramValue:"+paramValue).addOptions(disabledStr);
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(uiChk));

				var uiAnc = new UiAnchor();
				uiAnc.setText(menuId).setScript("getEdit('"+menuId+"', '"+paramValue+"')");
				gridTr.addChild(new UiGridTd().addClassName("Lt").setStyle(style).addTextBeforeChild(space).addChild(uiAnc));

				gridTr.addChild(new UiGridTd().addClassName("Lt").setStyle(style).setText(menuName));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(dataSet.getValue(i, "MENU_URL")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(dataSet.getValue(i, "SORT_ORDER")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(dataSet.getValue(i, "DESCRIPTION")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(dataSet.getValue(i, "IS_ACTIVE")));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:8").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));

		$("#tblGrid").freezeHeader({
			attachTo:$("#divDataArea"),
			pagingArea:$("#divPagingArea"),
			isPageable:false,
			totalResultRows:result.totalResultRows,
			script:"doSearch"
		});

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.commonSimpleAction);
		});

		commonJs.bindToggleTrBackgoundWithCheckbox($("[name=chkForDel]"));
		commonJs.hideProcMessageOnElement("divScrollablePanel");
	};

	getEdit = function(menuId, paramValue) {
		popup = commonJs.openPopup({
			popupId:"commonCodeEdit",
			url:"/sys/sysAdmin/sysMenu/getEdit.do",
			data:{
				menuId:menuId,
				paramValue:paramValue
			},
			header:com.header.popHeaderEdit,
			blind:true,
			width:900,
			height:410
		});
	};

	getSortOrder = function() {
		popup = commonJs.openPopup({
			popupId:"commonCodeEdit",
			url:"/sys/sysAdmin/sysMenu/getUpdateSortOrder.do",
			data:{},
			header:"Edit Sort Order",
			blind:true,
			width:900,
			height:730
		});
	};

	doDelete = function() {
		if (commonJs.getCountChecked("chkForDel") == 0) {
			commonJs.warn(com.message.I902);
			return;
		}

		commonJs.doDelete({
			url:"/sys/sysAdmin/sysMenu/doDelete.do",
			onSuccess:doSearch
		});
	};

	doAction = function(img) {
		var menuId = $(img).attr("menuId"), paramValue = $(img).attr("paramValue");
		var paramValues = paramValue.split(delimiter);
		var deletable = paramValues[2];

		$("input:checkbox[name=chkForDel]").each(function(index) {
			if (!$(this).is(":disabled") && $(this).val() == menuId) {
				if (!$(this).is(":checked")) {
					$(this).click();
				}
			} else {
				if ($(this).is(":checked")) {
					$(this).click();
				}
			}
		});

		if (deletable == "true") {
			ctxMenu.commonSimpleAction[1].disable = false;
		} else {
			ctxMenu.commonSimpleAction[1].disable = true;
		}

		ctxMenu.commonSimpleAction[0].fun = function() {getEdit(menuId, paramValue);};
		ctxMenu.commonSimpleAction[1].fun = function() {doDelete();};

		$(img).contextMenu(ctxMenu.commonSimpleAction, {
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
			url:"/sys/sysAdmin/sysMenu/doExport.do",
			data:commonJs.serialiseObject($("#divSearchCriteriaArea")),
			menuObject:menuObject
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		commonJs.setExportButtonContextMenu($("#btnExport"));
		doSearch();
	});
});