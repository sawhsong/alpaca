/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202EditOpportunityPop.js
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
		commonJs.showProcMessageOnElement("divPersonDetails");
		commonJs.showProcMessageOnElement("divOpportunityDetails");
		commonJs.showProcMessageOnElement("divAsgTermWc");
		commonJs.showProcMessageOnElement("divDocuments");

		setTimeout(function() {
			commonJs.hideProcMessageOnElement("divPersonDetails");
			commonJs.hideProcMessageOnElement("divOpportunityDetails");
			commonJs.hideProcMessageOnElement("divAsgTermWc");
			commonJs.hideProcMessageOnElement("divDocuments");
		}, 800);
	};

	getOpportunityDocuments = function() {
		commonJs.showProcMessageOnElement("divDocuments");

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
		$("#tbodyDocuments").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "DOCUMENT_ID")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").addChild(new UiAnchor().setText(ds.getValue(i, "DOCUMENT_NAME")).setScript("getDetail('"+ds.getValue(i, "DOCUMENT_ID")+"')")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "DESCRIPTION")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "ASSIGNED_TO_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "DUE_DATE_FORMAT")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "FOLLOW_UP_DATE_FORMAT")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "STATUS_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "STATUS_DETAIL_MEANING")));
				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "SENT_BY_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "SENT_DATE_FORMAT")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "RECEIVED_DATE_FORMAT")));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:11").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tbodyDocuments").append($(html));
//		$("#tblDocuments").fixedHeaderTable({
//			attachTo:$("#divGridHolderDocuments"),
//			attachToHeight:300,
//			isPageable:false
//		});

		commonJs.hideProcMessageOnElement("divDocuments");
	};

	getDetail = function(documentId) {
		commonJs.alert("Detail : "+documentId);
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
			getOpportunityDocuments();
		}, 200);
	});
});