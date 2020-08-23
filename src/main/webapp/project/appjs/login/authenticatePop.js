/**
 * authenticatePop.js
 */
var popup = null;

$(function() {
	/*!
	 * event
	 */
	$("#btnSubmitCode").click(function(event) {
		var code = "";

		if (!commonJs.doValidate("fmDefault")) {
			return;
		}

		code = getTOTPCode();
		if (code != $("#authenticationCode").val()) {
			commonJs.error("Authentication code is not correct!<br/>Please try again!");
			$("#authenticationCode").val("");
			$("#authenticationCode").focus();
			return;
		}

		commonJs.openDialog({
			type:com.message.I000,
			contents:com.message.I903+" "+userName+"!",
			blind:true,
			draggable:false,
			width:350,
			buttons:[{
				caption:com.caption.ok,
				callback:function() {
					parent.commonJs.doSubmit({
						formId:"fmDefault",
						action:defaultStartUrl
					});
				}
			}]
		});
	});

	$(document).keypress(function(event) {
		var code = event.keyCode || event.which, element = event.target;
		if (code == 13) {
			if ($(element).is("[name=authenticationCode]")) {
				$("#btnSubmitCode").trigger("click");
				event.preventDefault();
			}
		}
	});

	/*!
	 * process
	 */
	getTOTPCode = function() {
		var code = "";
		commonJs.doSimpleProcess({
			url:"/login/getTOTPCode.do",
			noForm:true,
			onSuccess:function(result) {
				var ds = result.dataSet;
				code = ds.getValue(0, "code");
			}
		});
		return code;
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setTimeout(function() {
			$("[name=authenticationCode]").focus();
		}, 400);
	});
});