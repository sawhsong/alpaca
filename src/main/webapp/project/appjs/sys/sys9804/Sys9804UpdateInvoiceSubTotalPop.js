/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys9804UpdateInvoiceSubTotalPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#btnSave").click(function(event) {
		if (commonJs.doValidate($("#gstAmountTo"))) {
			commonJs.doSave({
				url:"/sys/9804/doUpdateInvoiceSubTotal.do",
				data:{invoiceId:invoiceId},
				callback:function() {
					parent.popup.close();
					parent.doSearch();
				}
			});
		}
	});

	$("#btnClose").click(function(event) {
		parent.popup.close();
	});

	$(document).keyup(function(event) {
		var element = event.target;

		if (!commonJs.doValidate($("#gstAmountTo"))) {
			return false;
		}

		onEditData($(element));
	});

	$("input:text").focus(function() {
		if ($(this).hasClass("txtEn")) {
			$(this).select();
		}
	});

	/*!
	 * process
	 */
	onEditData = function(jqObj) {
		var name = $(jqObj).attr("name");
		if (name == "gstAmountTo") {
			commonJs.doSimpleProcess({
				url:"/sys/9804/doCalculateAmount.do",
				data:{
					gstAmountTo:$("#gstAmountTo").val(),
					invoiceAmount:$("#invoiceAmount").val()
				},
				noForm:true,
				callback:function(result) {
					var ds = result.dataSet;
					$("#total").val(ds.getValue(0, "total"));
				}
			});
		}
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
	});
});