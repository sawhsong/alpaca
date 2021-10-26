/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9808List.js
 *************************************************************************************************/
var popupDetail = null;
var popupInfo = null;
var searchResultDataCount = 0;

$(function() {
	/*!
	 * event
	 */
	$("#btnGenerate").click(function(event) {
		if (commonJs.getCountChecked("chkForGenerate") == 0) {
			commonJs.warn(com.message.I902);
			return;
		}

		popupInfo = commonJs.openPopup({
			popupId:"GeneratorInfo",
			url:"/sys/9808/getGeneratorInfo.do",
			header:"Source Code Generator",
			data:{dataSource:$("#dataSource").val()},
			blind:true,
			width:1000,
			height:500
		});
	});

	$("#btnSearch").click(function(event) {
		doSearch();
	});

	$("#dataSource").change(function(event) {
		doSearch();
	});

	$("#btnClear").click(function(event) {
		commonJs.clearSearchCriteria();
	});

	$("#icnCheck").click(function(event) {
		commonJs.toggleCheckboxes("chkForGenerate");
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;

			if ($(element).is("[name=tableName]")) {
				doSearch();
				event.preventDefault();
			}
		}
	});

	/*!
	 * process
	 */
	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanel");

		commonJs.doSearch({
			url:"/sys/9808/getList.do",
			dataType:"json",
			callback:renderDataGridTable
		});
	};

	renderDataGridTable = function(result) {
		var ds = result.dataSet;
		var html = "";

		searchResultDataCount = ds.getRowCnt();

		$("#tblGridBody").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiCheckbox().setName("chkForGenerate").setValue(ds.getValue(i, "TABLE_NAME"))));
				gridTr.addChild(new UiGridTd().addClassName("Lt").addChild(new UiAnchor().setText(ds.getValue(i, "TABLE_NAME")).setScript("getDetail('"+ds.getValue(i, "TABLE_NAME")+"')")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "COMMENTS")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiIcon().setName("icnAction").addClassName("fa-ellipsis-h fa-lg").addAttribute("tableName:"+ds.getValue(i, "TABLE_NAME")).setScript("doAction(this)")));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:4").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));

		$("#tblGrid").fixedHeaderTable({
			attachTo:$("#divDataArea"),
			pagingArea:$("#divPagingArea"),
			isPageable:false,
			displayRowCount:true,
			totalResultRows:result.totalResultRows,
			script:"doSearch"
		});

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.dtoGeneratorAction);
		});

		commonJs.bindToggleTrBackgoundWithCheckbox($("[name=chkForGenerate]"));
		commonJs.hideProcMessageOnElement("divScrollablePanel");
	};

	getDetail = function(tableName) {
		popupDetail = commonJs.openPopup({
			popupId:"TableDetail",
			url:"/sys/9808/getDetail.do",
			data:{
				tableName:tableName,
				dataSource:$("#dataSource").val()
			},
			header:"Table Details",
			width:1500,
			height:900
		});
	};

	doAction = function(img) {
		var tableName = $(img).attr("tableName");
		var dataSource = $("#dataSource").val();

		$("input:checkbox[name=chkForGenerate]").each(function(index) {
			if (!$(this).is(":disabled") && $(this).val() == tableName) {
				if (!$(this).is(":checked")) {
					$(this).click();
				}
			} else {
				if ($(this).is(":checked")) {
					$(this).click();
				}
			}
		});

		ctxMenu.dtoGeneratorAction[0].fun = function() {getDetail(tableName);};
		ctxMenu.dtoGeneratorAction[1].fun = function() {$("#btnGenerate").trigger("click");};

		$(img).contextMenu(ctxMenu.dtoGeneratorAction, {
			classPrefix:com.constants.ctxClassPrefixGrid,
			displayAround:"trigger",
			position:"bottom",
			horAdjust:0,
			verAdjust:2,
			containment:$("#divScrollablePanel")
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
	});
});