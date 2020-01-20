/**
 * PreviewPayslipFrameContainerPop.js
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
	setIframeSize = function() {
		$("#ifFrame").css("height", $("#divScrollablePanelPopup").height() - 6);
	};

	loadPage = function() {
		var str = "", actionString = "", paramString = "";
		if ("ICRCTI" == commonJs.upperCase(payrollType) || "ICNRCTI" == commonJs.upperCase(payrollType)) {
			str = ("RCTI" == commonJs.upperCase(taxInvoiceAcceptanceType)) ? "ICRCTI" : "ICRemittance";
		} else if ("STG" == commonJs.upperCase(payrollType) || "STNG" == commonJs.upperCase(payrollType)) {
			str = ("RCTI" == commonJs.upperCase(taxInvoiceAcceptanceType)) ? "STRCTI" : "STRemittance";
		} else if ("BCTI" == commonJs.upperCase(payrollType)) {
			str = ("BCTI" == commonJs.upperCase(taxInvoiceAcceptanceType)) ? "BCTI" : "ICRemittance";
		} else {
			str = "Remittance";
		}

		paramString = "paymentId="+paymentId+"&payrollType="+payrollType+"&taxInvoiceAcceptanceType="+taxInvoiceAcceptanceType;
		actionString = "/common/payment/get"+str+".do?"+paramString;
		setFrame(actionString);
	};

	setFrame = function(actionString) {
		$("#ifFrame").attr("src", "");
		setTimeout(function() {
			$("#ifFrame").attr("src", actionString);
		}, 30); // important
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setIframeSize();
		loadPage();
	});
});