/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9802List.js
 *************************************************************************************************/
var popup = null;
var searchResultDataCount = 0;

$(function() {
	/*!
	 * event
	 */
	$("#btnSearch").click(function(event) {
		doSearch();
	});

	$("#btnClear").click(function(event) {
		commonJs.clearSearchCriteria();
	});

	$("#billingCode").blur(function() {
		if (commonJs.isEmpty($(this).val())) {
			$("#billingCodeId").val("");
		}
	});

	$("#billingOrgName").blur(function() {
		if (commonJs.isEmpty($(this).val())) {
			$("#billingOrgId").val("");
		}
	});

	$(document).keydown(function(event) {
		var code = event.keyCode || event.which, element = event.target;
	});

	$(document).keypress(function(event) {
		var code = event.keyCode || event.which, element = event.target;
		if (code == 13) {
			if ($(element).is("[name=asgId]")) {
				doSearch();
			}
		}
	});

	/*!
	 * context menus
	 */
	setActionButtonContextMenu = function() {
		var ctxMenu = [{
			name:sys.sys9802.caption.unlockPrt,
			img:"fa-unlock-alt",
			fun:function() {openPopup({mode:"UnlockPrt"});}
		}, {
			name:sys.sys9802.caption.updateWorkingState,
			img:"fa-map",
			fun:function() {openPopup({mode:"UpdateWorkingState"});}
		}];

		$("#btnAction").contextMenu(ctxMenu, {
			classPrefix:com.constants.ctxClassPrefixButton,
			effectDuration:300,
			effect:"slide",
			borderRadius:"bottom 4px",
			displayAround:"trigger",
			position:"bottom"
		});
	};

	/*!
	 * process
	 */
	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanel");

		if (commonJs.doValidate($("#fmDefault"))) {
			commonJs.doSearch({
				url:"/sys/9802/getList.do",
				dataType:"xml",
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

				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiRadio().setName("rdoForAction").setValue(ds.getValue(i, "ASSIGNMENT_ID"))));

				var uiAnc = new UiAnchor();
				uiAnc.setText(ds.getValue(i, "ASSIGNMENT_NUMBER")).setScript("getDetail('"+ds.getValue(i, "ASSIGNMENT_ID")+"')");
				gridTr.addChild(new UiGridTd().addClassName("Lt").addChild(uiAnc));

				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "PERSON_NAME"), 50)));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "ASSIGNMENT_START_DATE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "ASSIGNMENT_END_DATE")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "BILLING_ORGANISATION_NAME"), 70)));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "EU_ORGANISATION_NAME"), 50)));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "ASG_ACTIVE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "PREFERRED")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "WORKING_STATE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "HAS_PRT")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "HAS_WC")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "PAYMENT_METHOD")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "LAST_INVOICE_DATE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "LAST_PAID_DATE")));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:15").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));

		$("#tblGrid").fixedHeaderTable({
			attachTo:$("#divGridWrapper"),
			pagingArea:$("#divPagingArea"),
			isPageable:true,
			isFilter:false,
			filterColumn:[],
			totalResultRows:result.totalResultRows,
			script:"doSearch"
		});

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.boardAction);
		});

		commonJs.hideProcMessageOnElement("divScrollablePanel");
	};

	getDetail = function(assignmentId) {
		openPopup({mode:"Detail", assignmentId:assignmentId});
	};

	openPopup = function(param) {
		var url = "", header = com.header.popHeaderDetail, width = 0, height = 0;
		var val = commonJs.getCheckedValueFromRadio("rdoForAction");

		if (commonJs.isEmpty(val)) {
			commonJs.warn(com.message.I902);
			return;
		}

		if (param.mode == "Detail") {
			url = "/sys/9802/getDetail.do";
			width = 1200, height = 900;
		} else if (param.mode == "UnlockPrt") {
			url = "/sys/9802/getUnlockPrt.do";
			width = 1480, height = 500;
		} else if (param.mode == "UpdateWorkingState") {
			url = "/sys/9802/getUpdateWorkingState.do";
			width = 700, height = 400;
		}

		var popParam = {
			popupId:"Sys9802"+param.mode,
			url:url,
			paramData:{
				mode:param.mode,
				assignmentId:val
			},
			header:header,
			blind:true,
			width:width,
			height:height
		};

		popup = commonJs.openPopup(popParam);
	};

	exeExport = function(menuObject) {
		$("[name=fileType]").remove();
		$("[name=dataRange]").remove();

		if (searchResultDataCount <= 0) {
			commonJs.warn(com.message.I001);
			return;
		}

		commonJs.confirm({
			contents:com.message.Q003,
			buttons:[{
				caption:com.caption.yes,
				callback:function() {
					popup = commonJs.openPopup({
						popupId:"exportFile",
						url:"/sys/9802/exeExport.do",
						paramData:{
							fileType:menuObject.fileType,
							dataRange:menuObject.dataRange
						},
						header:"exportFile",
						blind:false,
						width:200,
						height:100
					});
					setTimeout(function() {popup.close();}, 3000);
				}
			}, {
				caption:com.caption.no,
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
		setActionButtonContextMenu();
		commonJs.setExportButtonContextMenu($("#btnExport"));

		commonJs.setAutoComplete($("#personNumber"), {
			method:"getPersonNumber",
			label:"full_name_with_person_number",
			value:"person_id",
			minLength:2,
			focus: function(event, ui) {
				$("#personId").val(ui.item.value);
				$("#personNumber").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#personNumber").val())) {
					$("#personId").val("");
					$("#personNumber").val("");
				}
			},
			select:function(event, ui) {
				$("#personId").val(ui.item.value);
				$("#personNumber").val(ui.item.label);
				doSearch();
				return false;
			}
		});

		commonJs.setAutoComplete($("#personName"), {
			method:"getPersonName",
			label:"full_name_with_person_number",
			value:"person_id",
			minLength:2,
			focus: function(event, ui) {
				$("#personId").val(ui.item.value);
				$("#personName").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#personName").val())) {
					$("#personId").val("");
					$("#personName").val("");
				}
			},
			select:function(event, ui) {
				$("#personId").val(ui.item.value);
				$("#personName").val(ui.item.label);
				doSearch();
				return false;
			}
		});

		commonJs.setAutoComplete($("#billingCode"), {
			method:"getBillingCodeByCode",
			label:"display_column",
			value:"billing_code_id",
			minLength:2,
			focus: function(event, ui) {
				$("#billingCodeId").val(ui.item.value);
				$("#billingCode").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#billingCode").val())) {
					$("#billingCodeId").val("");
					$("#billingCode").val("");
				}
			},
			select:function(event, ui) {
				$("#billingCodeId").val(ui.item.value);
				$("#billingCode").val(ui.item.label);
				doSearch();
				return false;
			}
		});

		commonJs.setAutoComplete($("#billingOrgName"), {
			method:"getBillingOrgByName",
			label:"org_name_with_org_id",
			value:"organisation_id",
			minLength:2,
			focus: function(event, ui) {
				$("#billingOrgId").val(ui.item.value);
				$("#billingOrgName").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#billingOrgName").val())) {
					$("#billingOrgId").val("");
					$("#billingOrgName").val("");
				}
			},
			select:function(event, ui) {
				$("#billingOrgId").val(ui.item.value);
				$("#billingOrgName").val(ui.item.label);
				doSearch();
				return false;
			}
		});

		doSearch();
	});
});