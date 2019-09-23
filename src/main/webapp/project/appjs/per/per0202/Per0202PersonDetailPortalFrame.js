/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202List.js
 *************************************************************************************************/
jsconfig.put("scrollablePanelHeightAdjust", -26);

$(function() {
	/*!
	 * event
	 */

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

				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiCheckbox().setId("chkForDel").setName("chkForDel").setValue(ds.getValue(i, "PERSON_ID"))));
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
			method:"getOrgByName",
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

		doSearch();
	});
});