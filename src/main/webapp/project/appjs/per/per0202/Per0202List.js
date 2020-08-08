/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202List.js
 *************************************************************************************************/
jsconfig.put("useJqTooltip", false);
var popupLookup = null;
var searchResultDataCount = 0;
jsconfig.put("scrollablePanelHeightAdjust", -30);

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

	$("#icnEmpOrgSearch").click(function(event) {
		popupLookup = commonJs.openPopup({
			popupId:"EmpOrgLookup",
			url:"/common/lookup/getDefault.do",
			data:{
				lookupType:"EmploymentOrg",
				keyFieldId:"empOrgId",
				valueFieldId:"empOrgName",
				popupName:"parent.popupLookup",
				docTypeToSetValue:"page",
				lookupValue:$("#empOrgName").val()
			},
			header:per.per0202.header.popEmpOrgLookup,
			width:880,
			height:680
		});
	});

	$("#icnCheck").click(function(event) {
		commonJs.toggleCheckboxes("chkForDel");
	});

	$("#empOrgName").blur(function() {
		if (commonJs.isEmpty($(this).val())) {
			$("#empOrgId").val("");
		}
	});

	$(document).keydown(function(event) {
		var code = event.keyCode || event.which, element = event.target;

		if (code == 13) {
		}

		if (code == 9) {
			if ($(element).is("[name=empOrgName]") && !commonJs.isEmpty($("#empOrgName").val())) {
				$("#icnEmpOrgSearch").trigger("click");
			}
		}
	});

	/*!
	 * process
	 */
	setGridTable = function(totalResultRows) {
		$("#tblGrid").fixedHeaderTable({
			attachTo:$("#divDataArea"),
			pagingArea:$("#divPagingArea"),
			isPageable:true,
			totalResultRows:totalResultRows,
			script:"doSearch"
		});
	};

	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanel");

		if (commonJs.doValidate($("#fmDefault"))) {
			commonJs.doSearch({
				url:"/per/0202/getList.do",
				callback:renderGridData
			});
		}
	};

	renderGridData = function(result) {
		var ds = result.dataSet, html = "";

		searchResultDataCount = ds.getRowCnt();
		$("#tblGridBody").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiCheckbox().setName("chkForDel").setValue(ds.getValue(i, "PERSON_ID"))));
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiAnchor().setText(ds.getValue(i, "PERSON_NUMBER")).setScript("getPersonDetail('"+ds.getValue(i, "PERSON_ID")+"')")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "SURNAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "FIRST_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "PERSON_TYPE"), 50)));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "EMPLOYMENT_ORG_NAME"), 50)));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "PAYSLIP_EMAIL")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "MOBILE")));

				var iconAction = new UiIcon();
				iconAction.setId("icnAction").setName("icnAction").addClassName("fa-tasks fa-lg").addAttribute("personId:"+ds.getValue(i, "PERSON_ID")).setScript("doAction(this)");
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(iconAction));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:9").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));
		setGridTable(result.totalResultRows);

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.boardAction);
		});

		commonJs.hideProcMessageOnElement("divScrollablePanel");
	};

	getPersonDetail = function(personId) {
		commonJs.doSubmit({
			action:"/per/0202/getPersonDetailFrameContainer.do",
			data:{personId:personId}
		});
	};

	openPopup = function(param) {
		var url = "", header = "";
		var height = 510;

		if (param.mode == "Detail") {
			url = "/per/0202/getPersonDetailFrameContainer.do";
			header = com.header.popHeaderDetail;
		} else if (param.mode == "New" || param.mode == "Reply") {
			url = "/per/0202/getInsert.do";
			header = com.header.popHeaderEdit;
		} else if (param.mode == "Edit") {
			url = "/per/0202/getUpdate.do";
			header = com.header.popHeaderEdit;
			height = 634;
		}

		var popParam = {
			popupId:"notice"+param.mode,
			url:url,
			data:{
				mode:param.mode,
				articleId:commonJs.nvl(param.articleId, "")
			},
			header:header,
			blind:true,
			width:800,
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
			url:"/per/0202/exeDelete.do",
			callback:doSearch
		});
	};

	doAction = function(img) {
		var articleId = $(img).attr("articleId");

		$("input:checkbox[name=chkForDel]").each(function(index) {
			if (!$(this).is(":disabled") && $(this).val() == articleId) {
				$(this).prop("checked", true);
			} else {
				$(this).prop("checked", false);
			}
		});

		ctxMenu.boardAction[0].fun = function() {getPersonDetail(articleId);};
		ctxMenu.boardAction[1].fun = function() {openPopup({mode:"Edit", articleId:articleId});};
		ctxMenu.boardAction[2].fun = function() {openPopup({mode:"Reply", articleId:articleId});};
		ctxMenu.boardAction[3].fun = function() {doDelete();};

		$(img).contextMenu(ctxMenu.boardAction, {
			classPrefix:com.constants.ctxClassPrefixGrid,
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0,
			verAdjust:2
		});
	};

	exeExport = function(menuObject) {
		$("[name=fileType]").remove();
		$("[name=dataRange]").remove();

		if (searchResultDataCount <= 0) {
			commonJs.warn(com.message.I001);
			return;
		}

		commonJs.doExport({
			url:"/per/0202/exeExport.do",
			data:commonJs.serialiseObject($("#divSearchCriteriaArea")),
			menuObject:menuObject
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		commonJs.setExportButtonContextMenu($("#btnExport"));

		commonJs.setAutoComplete($("#personNumber"), {
			method:"getPersonNumber",
			label:"full_name_with_person_number",
			value:"person_number",
			minLength:3,
			focus: function(event, ui) {
				$("#personNumber").val(ui.item.value);
				return false;
			},
			select:function(event, ui) {
				$("#personNumber").val(ui.item.value);
				doSearch();
				return false;
			}
		});

		commonJs.setAutoComplete($("#name"), {
			method:"getPersonName",
			label:"full_name_with_person_number",
			value:"full_name",
			minLength:3,
			focus: function(event, ui) {
				$("#name").val(ui.item.value);
				return false;
			},
			select:function(event, ui) {
				$("#name").val(ui.item.value);
				doSearch();
				return false;
			}
		});

		commonJs.setAutoComplete($("#empOrgName"), {
			method:"getOrgByNameOrId",
			label:"org_name_with_org_id",
			value:"organisation_id",
			minLength:2,
			focus: function(event, ui) {
				$("#empOrgId").val(ui.item.value);
				$("#orgName").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#empOrgName").val())) {
					$("#empOrgId").val("");
					$("#empOrgName").val("");
				}
			},
			select:function(event, ui) {
				$("#empOrgId").val(ui.item.value);
				$("#empOrgName").val(ui.item.label);
				doSearch();
				return false;
			}
		});

		if (commonJs.isSearchCriteriaSelected()) {
			doSearch();
		}
	});
});