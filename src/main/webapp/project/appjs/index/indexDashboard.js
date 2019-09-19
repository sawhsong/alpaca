/**
 * indexDashboard.js
 */
jsconfig.put("noWest", true);
$(function() {
	/*!
	 * event
	 */
	$("#tblGridNotice .aEn").click(function(event) {
		goMenu('BBS', 'Bulletin Board', '#', 'BBS0202', 'Announcement', '/bbs/0202/getDefault.do');
	});

	$("#tblGridFreeBoard .aEn").click(function(event) {
		goMenu('BBS', 'Bulletin Board', '#', 'BBS0204', 'Free Board', '/bbs/0204/getDefault.do');
	});

	$("#tblGridIncome .aEn").click(function(event) {
		goMenu('RKM', 'Record Keeping', '#', 'RKM0202', 'Sales Income', '/rkm/0202/getDefault.do');
	});

	$("#tblGridExpense .aEn").click(function(event) {
		goMenu('RKM', 'Record Keeping', '#', 'RKM0402', 'General Expense', '/rkm/0402/getDefault.do');
	});
	/*!
	 * process
	 */
	goMenu = function(headerMenuId, headerMenuName, headerMenuUrl, leftMenuId, leftMenuName, leftMenuUrl) {
		$("#hdnHeaderMenuId").val(headerMenuId);
		$("#hdnHeaderMenuName").val(headerMenuName);
		$("#hdnHeaderMenuUrl").val(headerMenuUrl);
		$("#hdnLeftMenuId").val(leftMenuId);
		$("#hdnLeftMenuName").val(leftMenuName);
		$("#hdnLeftMenuUrl").val(leftMenuUrl);

		commonJs.doSubmit({form:$("form:eq(0)"), action:leftMenuUrl});
	};

	doSearchNotice = function() {
		commonJs.showProcMessageOnElement("divNotice");
		commonJs.doSearch({
			url:"/index/getNoticeList.do",
			dataType:"xml",
			callback:function(result) {
				var ds = result.dataSet;
				var html = "";

				$("#tbodyGridNotice").html("");

				if (ds.getRowCnt() > 0) {
					for (var i=0; i<ds.getRowCnt(); i++) {
						var gridTr = new UiGridTr();

						gridTr.setClassName("noBorderAll noStripe");

						gridTr.addChild(new UiGridTd().addClassName("Lt").addChild(new UiAnchor().setText(ds.getValue(i, "ARTICLE_SUBJECT")).setScript("doSave('"+ds.getValue(i, "ARTICLE_ID")+"')")));
						gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "WRITER_NAME")));
						gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.nvl(ds.getValue(i, "UPDATE_DATE"), ds.getValue(i, "INSERT_DATE"))));

						html += gridTr.toHtmlString();
					}
				} else {
					var gridTr = new UiGridTr();

					gridTr.setClassName("noBorderAll noStripe");

					gridTr.addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:3").setText(com.message.I001));
					html += gridTr.toHtmlString();
				}

				$("#tbodyGridNotice").append($(html));

				commonJs.hideProcMessageOnElement("divNotice");
			}
		});
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

		doSearchNotice();
	});
});