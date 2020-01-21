/**************************************************************************************************
 * Framework Generated Javascript Source
 * - PreviewPayslipRemittanceFrame.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */

	/*!
	 * process
	 */
	getEarnings = function() {
		if (isConsultingRevenue == "Y") {
			commonJs.showProcMessageOnElement("divEarning");

			commonJs.doSimpleProcess({
				url:"/common/payment/getEarnings.do",
				noForm:true,
				data:{paymentId:paymentId},
				callback:function(result) {
					var ds = result.dataSet;
					renderEarningGridTable(ds);
				}
			});
		} else {
			$("divEarning").hide();
		}
	};
	renderEarningGridTable = function(ds) {
		var html = "", isShowZero = ds.getValue(0, "SHOW_ZERO_Y_N");

		$("#tbodyEarning").html("");

		if (ds.getRowCnt() > 0) {
			var name = commonJs.nvl(ds.getValue(0, "ALTERNATE_NAME"), ds.getValue(0, "ELEMENT_REPORTING_NAME"));
			var gridTr = new UiGridTr();

			gridTr.addChild(new UiGridTd().addClassName("Lt").setText(name));
			gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(0, "UNITS"), "#,##0.00")));
			gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(0, "RATE"), "#,##0.00")));
			gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(0, "CALCULATED_AMOUNT"), "#,##0.00")));

			html += gridTr.addClassName("noStripe").toHtmlString();
		} else {
			var gridTr = new UiGridTr();

			gridTr.addClassName("noStripe").addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:4").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tbodyEarning").append($(html));

		commonJs.hideProcMessageOnElement("divEarning");
	};

	getDeductions = function() {
		if (isDeduction == "Y") {
			commonJs.showProcMessageOnElement("divDeduction");

			commonJs.doSimpleProcess({
				url:"/common/payment/getDeductions.do",
				noForm:true,
				data:{
					personId:personId,
					paymentId:paymentId,
					paymentDate:paymentDate
				},
				callback:function(result) {
					var ds = result.dataSet;
					renderDeductionGridTable(ds);
				}
			});
		} else {
			$("divDeduction").hide();
		}
	};
	renderDeductionGridTable = function(ds) {
		var html = "", isShowZero = "";

		$("#tbodyDeduction").html("");

		if (ds.getRowCnt() > 0) {
			isShowZero = ds.getValue(0, "SHOW_ZERO_Y_N");

			for (var i=0; i<ds.getRowCnt(); i++) {
				var name = commonJs.nvl(ds.getValue(i, "ALTERNATE_NAME"), ds.getValue(i, "ELEMENT_REPORTING_NAME"));
				var gridTr = new UiGridTr();
				var deductionAmt = commonJs.toNumber(ds.getValue(i, "CALCULATED_AMOUNT"));
				var ytdAmt = commonJs.toNumber(ds.getValue(i, "YTD_VALUE"));

				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(name));
				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(deductionAmt, "#,##0.00")));
				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask((deductionAmt + ytdAmt), "#,##0.00")));

				html += gridTr.addClassName("noStripe").toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addClassName("noStripe").addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:3").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tbodyDeduction").append($(html));

		commonJs.hideProcMessageOnElement("divDeduction");
	};

	getPayAdvice = function() {
		if (isDeduction == "Y") {
			commonJs.showProcMessageOnElement("divPayAdvice");

			commonJs.doSimpleProcess({
				url:"/common/payment/getPayAdvice.do",
				noForm:true,
				data:{
					personId:personId,
					paymentId:paymentId,
					paymentDate:paymentDate
				},
				callback:function(result) {
					var ds = result.dataSet;
					renderPayAdviceGridTable(ds);
				}
			});
		} else {
			$("divPayAdvice").hide();
		}
	};
	renderPayAdviceGridTable = function(ds) {
		var html = "";

		$("#tbodyPayAdvice").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "PAY_ADVICE_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(i, "THIS_PERIOD"), "#,##0.00")));
				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(i, "YTD"), "#,##0.00")));

				html += gridTr.addClassName("noStripe").toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addClassName("noStripe").addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:3").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tbodyPayAdvice").append($(html));

		commonJs.hideProcMessageOnElement("divPayAdvice");
	};

	getPaymentType = function() {
		if (isDeduction == "Y") {
			commonJs.showProcMessageOnElement("divPaymentType");

			commonJs.doSimpleProcess({
				url:"/common/payment/getPaymentType.do",
				noForm:true,
				data:{
					personId:personId,
					paymentId:paymentId,
					paymentDate:paymentDate
				},
				callback:function(result) {
					var ds = result.dataSet;
					renderPaymentTypeGridTable(ds);
				}
			});
		} else {
			$("divPaymentType").hide();
		}
	};
	renderPaymentTypeGridTable = function(ds) {
		var html = "";

		$("#tbodyPaymentType").html("");

		if (ds.getRowCnt() > 0) {
			for (var i=0; i<ds.getRowCnt(); i++) {
				var gridTr = new UiGridTr();

				gridTr.addChild(new UiGridTd().addClassName("Lt").setText(ds.getValue(i, "PAYMENT_TYPE_NAME")));
				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(i, "THIS_PERIOD"), "#,##0.00")));
				gridTr.addChild(new UiGridTd().addClassName("Rt").setText(commonJs.getNumberMask(ds.getValue(i, "YTD"), "#,##0.00")));

				html += gridTr.addClassName("noStripe").toHtmlString();
			}
		} else {
			var gridTr = new UiGridTr();

			gridTr.addClassName("noStripe").addChild(new UiGridTd().addClassName("Ct").setAttribute("colspan:3").setText(com.message.I001));
			html += gridTr.toHtmlString();
		}

		$("#tbodyPaymentType").append($(html));

		commonJs.hideProcMessageOnElement("divPaymentType");
	};

	/*
	 * ! load event (document / window)
	 */
	$(window).load(function() {
		setTimeout(function() {
			getEarnings();
			getDeductions();
			getPayAdvice();
			getPaymentType();
//			getBankingDetails();
//			getLeaveAccurals();
		}, 500);
	});
});