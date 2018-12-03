/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9804List.js
 *************************************************************************************************/
jsconfig.put("useJqTooltip", false);
var popup = null;
var searchResultDataCount = 0;

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

	$("#icnFromDate").click(function(event) {
		commonJs.openCalendar(event, "fromDate");
	});

	$("#icnToDate").click(function(event) {
		commonJs.openCalendar(event, "toDate");
	});

	$("#icnCheck").click(function(event) {
		commonJs.toggleCheckboxes("chkForDel");
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;

			if ($(element).is("[name=fromDate]") || $(element).is("[name=toDate]")) {
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
			setTimeout(function() {
				commonJs.ajaxSubmit({
					url:"/sys/9804/getList.do",
					dataType:"json",
					formId:"fmDefault",
					success:function(data, textStatus) {
						var result = commonJs.parseAjaxResult(data, textStatus, "json");

						if (result.isSuccess == true || result.isSuccess == "true") {
							renderDataGridTable(result);
						}
					}
				});
			}, 200);
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

				var uiChk = new UiCheckbox();
				uiChk.setId("chkForDel").setName("chkForDel").setValue(ds.getValue(i, "invoiceNumber"));
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(uiChk));

				var uiAnc = new UiAnchor();
				uiAnc.setText(ds.getValue(i, "invoiceNumber")).setScript("getDetail('"+ds.getValue(i, "invoiceNumber")+"')");
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(uiAnc));

				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(i, "billableAmount"), "#,###.##")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "contractorPaidDate")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "customerPaidDate")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "dueDate")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "endDate")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "groupInvoiceNumber")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "invoiceDate")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "invoiceStatus")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(ds.getValue(i, "startDate")));

				var iconAction = new UiIcon();
				iconAction.setId("icnAction").setName("icnAction").addClassName("fa-tasks fa-lg").addAttribute("invoiceNumber:"+ds.getValue(i, "invoiceNumber")).setScript("doAction(this)");
				gridTr.addChild(new UiGridTd().addClassName("Ct").addChild(iconAction));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:12").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));

		$("#tblGrid").fixedHeaderTable({
			attachTo:$("#divDataArea"),
			pagingArea:$("#divPagingArea"),
			isPageable:false,
			isFilter:false,
			filterColumn:[],
			displayRowCount:true,
			totalResultRows:ds.getRowCnt(),
			script:"doSearch"
		});

		$("[name=icnAction]").each(function(index) {
			$(this).contextMenu(ctxMenu.commonAction);
		});

		commonJs.hideProcMessageOnElement("divScrollablePanel");
	};

	getDetail = function(articleId) {
		openPopup({mode:"Detail", articleId:articleId});
	};

	openPopup = function(param) {
		var url = "", header = "";
		var height = 510;

		if (param.mode == "Detail") {
			url = "/sys/9804/getDetail.do";
			header = com.header.popHeaderDetail;
		} else if (param.mode == "New" || param.mode == "Reply") {
			url = "/sys/9804/getInsert.do";
			header = com.header.popHeaderEdit;
		} else if (param.mode == "Edit") {
			url = "/sys/9804/getUpdate.do";
			header = com.header.popHeaderEdit;
			height = 634;
		}

		var popParam = {
			popupId:"notice"+param.mode,
			url:url,
			paramData:{
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

		commonJs.confirm({
			contents:com.message.Q002,
			buttons:[{
				caption:com.caption.yes,
				callback:function() {
					commonJs.ajaxSubmit({
						url:"/sys/9804/exeDelete.do",
						dataType:"json",
						formId:"fmDefault",
						success:function(data, textStatus) {
							var result = commonJs.parseAjaxResult(data, textStatus, "json");

							if (result.isSuccess == true || result.isSuccess == "true") {
								commonJs.openDialog({
									type:com.message.I000,
									contents:result.message,
									blind:true,
									width:300,
									buttons:[{
										caption:com.caption.ok,
										callback:function() {
											doSearch();
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
			}],
			blind:true
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

		ctxMenu.boardAction[0].fun = function() {getDetail(articleId);};
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

		commonJs.confirm({
			contents:com.message.Q003,
			buttons:[{
				caption:com.caption.yes,
				callback:function() {
					popup = commonJs.openPopup({
						popupId:"exportFile",
						url:"/sys/9804/exeExport.do",
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
		commonJs.setFieldDateMask("fromDate");
		commonJs.setFieldDateMask("toDate");
		commonJs.setExportButtonContextMenu($("#btnExport"));
		$("#searchWord").focus();
		doSearch();
	});
});