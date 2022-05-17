/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202DocumentReceivedFrame.js
 *************************************************************************************************/
var searchResultDataCount = 0;
jsconfig.put("useJqTooltip", true);
jsconfig.put("scrollablePanelHeightAdjust", 50);
var gridAction = [{
	name:"Add File",
	img:"fa-plus",
	fun:function() {}
}, {
	name:"Edit File",
	img:"fa-edit",
	fun:function() {}
}, {
	name:"View File",
	img:"fa-search",
	fun:function() {}
}];

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

	$("#status").change(function(event) {
		doSearch();
	});

	showOpportunity = function(opportunityId) {
		alert(opportunityId);
	};

	showAssignment = function(assignmentId) {
		alert(assignmentId);
	};

	/*!
	 * process
	 */
	setGridTable = function(totalResultRows) {
		$("#tblGrid").freezeHeader({
			attachTo:$("#divDataArea"),
//			attachToHeight:618,
			pagingArea:$("#divPagingArea"),
			isPageable:true,
			totalResultRows:totalResultRows,
			script:"doSearch"
		});
	};

	doSearch = function() {
		commonJs.showProcMessageOnElement("divScrollablePanelFrame");

		if (commonJs.doValidate($("#fmDefault"))) {
			commonJs.doSearch({
				url:"/per/0202/getDocumentReceivedList.do",
				data:{personId:personId},
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

				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "DOCUMENT_NAME"), 40)).setAttribute("title:"+ds.getValue(i, "DOCUMENT_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "COPY_TO_ORG_NAME"), 38)).setAttribute("title:"+ds.getValue(i, "COPY_TO_ORG_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "RECEIVE_COMMENTS"), 46)).setAttribute("title:"+ds.getValue(i, "RECEIVE_COMMENTS")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(ds.getValue(i, "DOCUMENT_STATUS_MEANING"), 38)).setAttribute("title:"+ds.getValue(i, "DOCUMENT_STATUS_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "OPP_ASG_ID")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "EXPIRY_DATE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "IS_ACTIVE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "IS_AVAILABLE_ON_EO")));

				var iconAction = new UiIcon();
				iconAction.setId("icnAction").setName("icnAction").addClassName("fa-ellipsis-h fa-lg").addAttribute("documentId:"+ds.getValue(i, "DOCUMENT_ID")).setScript("doAction(this)");
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
			$(this).contextMenu(gridAction);
		});

		commonJs.hideProcMessageOnElement("divScrollablePanelFrame");
	};

	doAction = function(img) {
		var documentId = $(img).attr("documentId");

		gridAction[0].fun = function() {alert("Add File : "+documentId);};
		gridAction[1].fun = function() {alert("Edit File : "+documentId);};
		gridAction[2].fun = function() {alert("View File : "+documentId);};

		$(img).contextMenu(gridAction, {
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
		doSearch();
	});
});