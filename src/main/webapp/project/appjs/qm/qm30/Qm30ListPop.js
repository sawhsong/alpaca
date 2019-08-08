/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Qm30ListPop.js
 *************************************************************************************************/
var dateFormat = jsconfig.get("dateFormatJs");
jsconfig.put("scrollablePanelHeightAdjust", 0);

$(function() {
	/*!
	 * event
	 */
	$("#btnSave").click(function(event) {
		if (!commonJs.doValidate("fmDefault")) {
			return;
		}

		var val = commonJs.getCheckedValueFromRadio("rdoForSave");

		if (commonJs.isEmpty(val)) {
			commonJs.warn(com.message.I902);
			return;
		}

		doSave(val);
	});

	$("#btnSearch").click(function(event) {
		doSearch();
	});

	$("#btnClear").click(function(event) {
		commonJs.clearSearchCriteria();
	});

	$("#btnClose").click(function(event) {
		parent.popupQuickMenu.close();
	});

	$("#icnEmpOrgSearch").click(function(event) {
		popupLookup = commonJs.openPopup({
			popupId:"EmpOrgLookup",
			url:"/common/lookup/getDefault.do",
			paramData:{
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

	$("#empOrgName").blur(function() {
		if (commonJs.isEmpty($(this).val())) {
			$("#empOrgId").val("");
		}
	});

	$(document).keyup(function(event) {
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
			attachTo:$("#divGridWrapper"),
			pagingArea:$("#divPagingArea"),
			isPageable:true,
			totalResultRows:totalResultRows,
			script:"doSearch"
		});
	};

	doSave = function(keyValues) {
		commonJs.confirm({
			contents:com.message.Q001,
			buttons:[{
				caption:com.caption.yes,
				callback:function() {
					commonJs.ajaxSubmit({
						url:"/qm/30/exeSave",
						dataType:"json",
//						formId:"fmDefault",
						data:{
							keyValues:keyValues
						},
						success:function(data, textStatus) {
							var result = commonJs.parseAjaxResult(data, textStatus, "json");

							if (result.isSuccess == true || result.isSuccess == "true") {
								var ds = result.dataSet;
								commonJs.openDialog({
									type:com.message.I000,
									contents:result.message,
									blind:true,
									width:300,
									buttons:[{
										caption:com.caption.ok,
										callback:function() {
											commonJs.copyToClipboard(ds.getValue(0, "PERSON_NUMBER"));

											parent.$("#divPersonInfo").html("&nbsp;/&nbsp;Person : "+ds.getValue(0, "FULL_NAME")+" ("+ds.getValue(0, "PERSON_NUMBER")+")");
											parent.popupQuickMenu.close();
										}
									}]
								});
							} else {
								commonJs.error(result.message);
							}
						}
					});
				}
			}, {
				caption:com.caption.no,
				callback:function() {
				}
			}]
		});
	};

	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanelPopup");

		if (commonJs.doValidate($("#fmDefault"))) {
			setTimeout(function() {
				commonJs.ajaxSubmit({
					url:"/qm/30/getList",
					dataType:"html",
					formId:"fmDefault",
					success:function(data, textStatus) {
						var result = commonJs.parseAjaxResult(data, textStatus, "html");

						if (result.isSuccess == true || result.isSuccess == "true") {
							renderGridData(result);
						} else {
							commonJs.error(result.message);
						}
					}
				});
			}, 400);
		}
	};

	renderGridData = function(result) {
		var ds = result.dataSet, html = "";

		$("#tblGridBody").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiRadio().setName("rdoForSave").setValue(ds.getValue(i, "ORGANISATION_ID"))));
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiAnchor().setText(ds.getValue(i, "ORGANISATION_ID")).setScript("doSave('"+ds.getValue(i, "ORGANISATION_ID")+"')")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "ORGANISATION_NAME"), 50)));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "ORGANISATION_TYPE_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "RELATIONSHIP")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "ABN")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "ACN")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "STATE_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "COUNTRY")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "ADDRESS"), 50)));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "FIRST_CONTACT_DATE")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "CSC_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "CDM_CRM_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "CDM_CSM_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "CAD_CSD_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "CSA_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "CUSTOMER_CATEGORY_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "CUSTOMER_STREAM_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "TAX_INVOICE_ACCEPTANCE_MEANING")));

				var iconAction = new UiIcon();
				iconAction.setId("icnAction").setName("icnAction").addClassName("fa-tasks fa-lg").addAttribute("organisationId:"+ds.getValue(i, "ORGANISATION_ID")).setScript("doAction(this)");
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(iconAction));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:20").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));
		setGridTable(result.totalResultRows);

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.commonQmAction);
		});

		commonJs.hideProcMessageOnElement("divScrollablePanelPopup");
	};

	doAction = function(img) {
		var keyValues = $(img).attr("keyValues");

		$("input:radio[name=rdoForSave]").each(function(index) {
			if (!$(this).is(":disabled") && $(this).val() == keyValues) {
				$(this).prop("checked", true);
			} else {
				$(this).prop("checked", false);
			}
		});

		ctxMenu.commonQmAction[0].fun = function() {doSave(keyValues);};

		$(img).contextMenu(ctxMenu.commonQmAction, {
			classPrefix:com.constants.ctxClassPrefixGrid,
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0,
			verAdjust:2
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
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
			label:"full_name",
			value:"full_name",
			minLength:3,
			focus: function(event, ui) {
				$("#name").val(ui.item.label);
				return false;
			},
			select:function(event, ui) {
				$("#name").val(ui.item.label);
				doSearch();
				return false;
			}
		});

		commonJs.setAutoComplete($("#empOrgName"), {
			method:"getOrgName",
			label:"organisation_name",
			value:"organisation_id",
			minLength:2,
			focus: function(event, ui) {
				$("#empOrgId").val(ui.item.value);
				$("#empOrgName").val(ui.item.label);
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

		doSearch();
	});
});