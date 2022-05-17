/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202OpportunityDetailPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnClose").click(function(event) {
		parent.popup.close();
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;
		}
	});

	/*!
	 * process
	 */
	setBlind = function() {
		commonJs.showProcMessageOnElement("divOppAsgDetails");
		commonJs.showProcMessageOnElement("divOpportunityDocument");

		setTimeout(function() {
			commonJs.hideProcMessageOnElement("divOppAsgDetails");
			commonJs.hideProcMessageOnElement("divOpportunityDocument");
		}, 1000);
	};

	getOpportunityDocuments = function() {
		commonJs.showProcMessageOnElement("divGridHolderOpportunityDocument");

		commonJs.doSimpleProcess({
			url:"/per/0202/getOpportunityDocuments.do",
			noForm:true,
			data:{opportunityId:opportunityId},
			callback:function(result) {
				var ds = result.dataSet;
				renderOpportunityDocumentTable(ds);
			}
		});
	};
	renderOpportunityDocumentTable = function(ds) {
		var html = "";

		searchResultDataCount = ds.getRowCnt();
		$("#tbodyOpportunityDocument").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "DOCUMENT_ID")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "DOCUMENT_TYPE_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "DOCUMENT_SUB_TYPE_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "DESCRIPTION")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(commonJs.abbreviate(commonJs.htmlToString(ds.getValue(i, "DOCUMENT_FILE_NAME")), 80)));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "UPLOADED_DATE_FORMAT")));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:6").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tbodyOpportunityDocument").append($(html));
		$("#tblOpportunityDocument").freezeHeader({
			attachTo:$("#divGridHolderOpportunityDocument"),
			attachToHeight:390,
			isPageable:false
		});

		commonJs.hideProcMessageOnElement("divGridHolderOpportunityDocument");
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		commonJs.setAccordion({
			containerClass:"accordion",
			multipleExpand:true,
			expandAll:true,
			icons:null
		});

		setTimeout(function() {
			setBlind();
		}, 100);

		setTimeout(function() {
			getOpportunityDocuments();
		}, 400);
	});
});