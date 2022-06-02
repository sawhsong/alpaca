/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Bbs0202List.js
 *************************************************************************************************/
jsconfig.put("useJqTooltip", false);
var popup = null;
var searchResultDataCount = 0;
var attchedFileContextMenu = [];

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

	$("#icnFromDate").click(function(event) {
		commonJs.openCalendar(event, "fromDate");
	});

	$("#icnToDate").click(function(event) {
		commonJs.openCalendar(event, "toDate");
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;

			if ($(element).is("[name=searchWord]") || $(element).is("[name=fromDate]") || $(element).is("[name=toDate]")) {
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
				url:"/bbs/0202/getList.do",
				onSuccess:renderDataGridTable
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
				var space = "", iLength = 200;
				var iLevel = parseInt(dataSet.getValue(i, "LEVEL")) - 1;
				var gridTr = new UiGridTr();

				gridTr.setClassName("noBorderHor");

				if (iLevel > 0) {
					for (var j=0; j<iLevel; j++) {
						space += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
						iLength -= - 2;
					}
					space += "<i class=\"fa fa-comments\"></i>";
				} else {
					space += "<i class=\"fa fa-comment\"></i>";
				}

				var uiAnc = new UiAnchor();
				uiAnc.setText(commonJs.abbreviate(dataSet.getValue(i, "ARTICLE_SUBJECT"), iLength)).setScript("getDetail('"+dataSet.getValue(i, "ARTICLE_ID")+"')");
				gridTr.addChild(new UiGridTd().addClassName("Lt").addTextBeforeChild(space+"&nbsp;&nbsp;").addChild(uiAnc));

				var gridTd = new UiGridTd();
				gridTd.addClassName("Ct");
				if (dataSet.getValue(i, "FILE_CNT") > 0) {
					var iconAttachFile = new UiIcon();
					iconAttachFile.setName("icnAttachedFile").addClassName("glyphicon-paperclip").addAttribute("articleId:"+dataSet.getValue(i, "ARTICLE_ID")).setScript("getAttachedFile(this)");
					gridTd.addChild(iconAttachFile);
				}
				gridTr.addChild(gridTd);

				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(dataSet.getValue(i, "WRITER_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(dataSet.getValue(i, "INSERT_DATE")));
				gridTr.addChild(new UiGridTd().addClassName("Ct").setText(dataSet.getValue(i, "UPDATE_DATE")));
				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(dataSet.getValue(i, "HIT_CNT"), "#,###")));

				html += gridTr.toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:6").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tblGridBody").append($(html));

		$("#tblGrid").freezeHeader({
			attachTo:$("#divDataArea"),
			pagingArea:$("#divPagingArea"),
			isPageable:true,
			totalResultRows:result.totalResultRows,
			script:"doSearch"
		});

		$("[name=icnAttachedFile]").each(function(index) {
			$(this).contextMenu(attchedFileContextMenu);
		});

		commonJs.hideProcMessageOnElement("divScrollablePanel");
	};

	getDetail = function(articleId) {
		openPopup({mode:"Detail", articleId:articleId});
	};

	openPopup = function(param) {
		var popParam = {
			popupId:"notice"+param.mode,
			url:"/bbs/0202/getDetail.do",
			data:{
				mode:param.mode,
				articleId:commonJs.nvl(param.articleId, "")
			},
			header:com.header.popHeaderDetail,
			blind:true,
			width:800,
			height:524
		};

		popup = commonJs.openPopup(popParam);
	};

	getAttachedFile = function(img) {
		commonJs.doSimpleProcess({
			url:"/bbs/0202/getAttachedFile.do",
			data:{articleId:$(img).attr("articleId")},
			onSuccess:function(result) {
				var dataSet = result.dataSet;
				attchedFileContextMenu = [];

				for (var i=0; i<dataSet.getRowCnt(); i++) {
					var repositoryPath = dataSet.getValue(i, "REPOSITORY_PATH");
					var originalName = dataSet.getValue(i, "ORIGINAL_NAME");
					var newName = dataSet.getValue(i, "NEW_NAME");
					var fileIcon = dataSet.getValue(i, "FILE_ICON");
					var fileSize = (dataSet.getValue(i, "FILE_SIZE")/1024)+1;

					attchedFileContextMenu.push({
						name:originalName+" ("+commonJs.getNumberMask(fileSize, "0,0")+") KB",
						title:originalName,
						img:fileIcon,
						repositoryPath:repositoryPath,
						originalName:originalName,
						newName:newName,
						fun:function() {
							var index = $(this).index();

							downloadFile({
								repositoryPath:attchedFileContextMenu[index].repositoryPath,
								originalName:attchedFileContextMenu[index].originalName,
								newName:attchedFileContextMenu[index].newName
							});
						}
					});
				}

				$(img).contextMenu(attchedFileContextMenu, {
					classPrefix:com.constants.ctxClassPrefixGrid,
					displayAround:"trigger",
					position:"bottom",
					horAdjust:0,
					verAdjust:2
				});
			}
		});
	};

	downloadFile = function(param) {
		commonJs.doSimpleProcessForPage({
			action:"/download.do",
			data:{
				repositoryPath:param.repositoryPath,
				originalName:param.originalName,
				newName:param.newName
			}
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		commonJs.setFieldDateMask("fromDate");
		commonJs.setFieldDateMask("toDate");
		doSearch();
	});
});