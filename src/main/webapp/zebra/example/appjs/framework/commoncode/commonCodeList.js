/**
 * commonCodeList.js
 */
var popup = null;
var searchResultDataCount = 0;
var dateFormat = jsconfig.get("dateFormatJs");
var langCode = jsconfig.get("langCode").toUpperCase();

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

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;

			if ($(element).is("[name=commonCodeType]")) {
				doSearch();
			}
		}
	});

	/*!
	 * process
	 */
	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanel");

		if (commonJs.doValidate($("#fmDefault"))) {
			commonJs.doSearch({
				url:"/zebra/framework/commoncode/getList.do",
				data:{},
				callback:renderDataGridTable
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
				var defaultYn = dataSet.getValue(i, "DEFAULT_YN");
				var className = "chkEn", disabledStr = "";
				var uiGridTr = new UiGridTr();

				if ("Y" == defaultYn) {
					className = "chkDis";
					disabledStr = "disabled";
				}

				var uiIcon = new UiIcon();
				uiIcon.setId("icnAction").setName("icnAction").addClassName("fa-ellipsis-h fa-lg").addAttribute("codeType:"+dataSet.getValue(i, "CODE_TYPE"))
					.addAttribute("defaultYn:"+defaultYn).setScript("doAction(this)");
				uiGridTr.addChild(new UiGridTd().addClassName("Ct").addChild(uiIcon));

				var uiChk = new UiCheckbox();
				uiChk.setId("chkForDel").setName("chkForDel").removeClassName("chkEn").addClassName(className).setValue(dataSet.getValue(i, "CODE_TYPE")).setOptions(disabledStr);
				uiGridTr.addChild(new UiGridTd().addClassName("Ct").addChild(uiChk));

				var uiAnc = new UiAnchor();
				uiAnc.setText(dataSet.getValue(i, "CODE_TYPE")).setScript("getDetail('"+dataSet.getValue(i, "CODE_TYPE")+"')");
				uiGridTr.addChild(new UiGridTd().addClassName("Lt").addChild(uiAnc));

				uiGridTr.addChild(new UiGridTd().addClassName("Lt").setText(dataSet.getValue(i, "DESCRIPTION_"+langCode)));
				uiGridTr.addChild(new UiGridTd().addClassName("Lt").setText(dataSet.getValue(i, "PROGRAM_CONSTANTS")));
				uiGridTr.addChild(new UiGridTd().addClassName("Ct").setText(dataSet.getValue(i, "USE_YN")));
				uiGridTr.addChild(new UiGridTd().addClassName("Ct").setText(defaultYn));
				uiGridTr.addChild(new UiGridTd().addClassName("Ct").setText(commonJs.getDateTimeMask(dataSet.getValue(i, "INSERT_DATE"), dateFormat)));
				uiGridTr.addChild(new UiGridTd().addClassName("Ct").setText(commonJs.getDateTimeMask(dataSet.getValue(i, "UPDATE_DATE"), dateFormat)));

				html += uiGridTr.toHtmlString();
			}
		} else {
			var uiGridTr = new UiGridTr();

			uiGridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:9").setText(com.message.I001));
			html += uiGridTr.toHtmlString();
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

	getDetail = function(codeType) {
		openPopup({mode:"Detail", codeType:codeType});
	};

	openPopup = function(param) {
		var url = "", header = "";
		var height = 900;

		if (param.mode == "Detail") {
			url = "/zebra/framework/commoncode/getDetail.do";
			header = framework.header.popHeaderDetail;
		} else if (param.mode == "New") {
			url = "/zebra/framework/commoncode/getInsert.do";
			header = framework.header.popHeaderEdit;
		} else if (param.mode == "Edit") {
			url = "/zebra/framework/commoncode/getUpdate.do";
			header = framework.header.popHeaderEdit;
			height = 754;
		}

		var popParam = {
			popupId:"commonCode"+param.mode,
			url:url,
			data:{
				mode:param.mode,
				codeType:commonJs.nvl(param.codeType, "")
			},
			header:header,
			blind:true,
			width:1700,
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
			url:"/zebra/framework/commoncode/exeDelete.do",
			callback:doSearch
		});
	};

	doAction = function(img) {
		var codeType = $(img).attr("codeType");
		var defaultYn = $(img).attr("defaultYn");

		$("input:checkbox[name=chkForDel]").each(function(index) {
			if (!$(this).is(":disabled") && $(this).val() == codeType) {
				$(this).prop("checked", true);
			} else {
				$(this).prop("checked", false);
			}
		});

		if (defaultYn == "Y") {
			ctxMenu.commonAction[2].disable = true;
		} else {
			ctxMenu.commonAction[2].disable = false;
		}

		ctxMenu.commonAction[0].fun = function() {getDetail(codeType);};
		ctxMenu.commonAction[1].fun = function() {openPopup({mode:"Edit", codeType:codeType});};
		ctxMenu.commonAction[2].fun = function() {doDelete();};

		$(img).contextMenu(ctxMenu.commonAction, {
			classPrefix:com.constants.ctxClassPrefixGrid,
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0,
			verAdjust:2,
			containment:$("#divScrollablePanel")
		});
	};

	exeExport = function(menuObject) {
		if (searchResultDataCount <= 0) {
			commonJs.warn(com.message.I001);
			return;
		}

		commonJs.doExport({
			url:"/zebra/framework/commoncode/exeExport.do",
			data:commonJs.serialiseObject($("#divSearchCriteriaArea")),
			menuObject:menuObject
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		commonJs.setAutoComplete($("#commonCodeType"), {
			url:"/zebra/common/autoCompletion/",
			method:"getCommonCodeType",
			label:"description"+langCode,
			value:"code_type",
			select:function(event, ui) {
				doSearch();
			}
		});

		commonJs.setExportButtonContextMenu($("#btnExport"));

		doSearch();
	});
});