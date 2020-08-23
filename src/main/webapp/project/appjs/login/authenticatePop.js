/**
 * authenticatePop.js
 */
var popup = null;

$(function() {
	/*!
	 * event
	 */
	$("#btnSubmitCode").click(function(event) {
		var isAuthenticated = false;

		if (!commonJs.doValidate("fmDefault")) {
			return;
		}

		if ("Y" == jsconfig.get("google2fa")) {
			isAuthenticated = doAuthentication("google2fa");
		} else if ("Y" == jsconfig.get("emailKey")) {
			isAuthenticated = doAuthentication("emailKey");
		}

		if (!isAuthenticated) {
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
	doAuthentication = function(mode) {
		var isAuthenticated;

		commonJs.doSimpleProcess({
			url:"/login/doAuthentication.do",
			data:{
				mode:mode,
				inputCode:$("#authenticationCode").val()
			},
			noForm:true,
			onSuccess:function(result) {
				var ds = result.dataSet;
				isAuthenticated = commonJs.toBoolean(ds.getValue(0, "isAuthenticated"));
			}
		});

		return isAuthenticated;
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