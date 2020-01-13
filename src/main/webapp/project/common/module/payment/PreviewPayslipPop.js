/**
 * PreviewPayslipPop.js
 */
$(function() {
	/*!
	 * event
	 */
	$("#btnClose").click(function(event) {
		parent.parent.popup.close();
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
		commonJs.showProcMessageOnElement("divScrollablePanelPopup");

		commonJs.doSearch({
			url:"/common/lookup/getEsEmployeeLookup.do",
			callback:renderDataGridTable
		});
	};

	renderDataGridTable = function(result) {
		var ds = result.dataSet, html = "";

		$("#tblGridBody").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(new UiAnchor().setText(ds.getValue(i, "PERSON_NUMBER")).setScript("setValue('"+ds.getValue(i, "PERSON_ID")+"', '"+ds.getValue(i, "FULL_NAME")+"')")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").addChild(new UiAnchor().setText(commonJs.abbreviate(ds.getValue(i, "FULL_NAME"), 60)).setScript("setValue('"+ds.getValue(i, "PERSON_ID")+"', '"+ds.getValue(i, "FULL_NAME")+"')")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "TITLE")));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:3").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));
		setGridTable(result.totalResultRows);

		commonJs.hideProcMessageOnElement("divScrollablePanelPopup");
	};

	setValue = function(id, name) {
		var keyField, valueField;

		if (docTypeToSetValue == "page") {
			keyField = parent.$("#"+keyFieldId);
			valueField = parent.$("#"+valueFieldId);
		}

		$(keyField).val(id);
		$(valueField).val(name);

		popupObject.close();
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
//		doSearch();
	});
});