/**************************************************************************************************
 * Framework Generated Javascript Source
 * - SysCountryCurrencyEditPop.js
 *************************************************************************************************/
$(function() {
	$("#btnSave").click(function(event) {
		if (!commonJs.doValidate("fmDefault")) {
			return;
		}

		commonJs.doSave({
			url:"/sys/sysBasicInfo/sysCountryCurrency/doSave.do",
			data:{countryCurrencyId:countryCurrencyId},
			onSuccess:function() {
				parent.popup.close();
				parent.doSearch();
			}
		});
	});

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
	setDetailData = function() {
		if (commonJs.isNotBlank(countryCurrencyId)) {
			commonJs.doSimpleProcess({
				url:"/sys/sysBasicInfo/sysCountryCurrency/getDetailData.do",
				data:{countryCurrencyId:countryCurrencyId},
				onSuccess:function(result) {
					var ds = result.dataSet;

					$("[name=currencyName]").val(ds.getValue(0, "CURRENCY_NAME"));
					$("[name=currencySymbol]").val(ds.getValue(0, "CURRENCY_SYMBOL"));
					$("[name=currencyAlphabeticCode]").val(ds.getValue(0, "CURRENCY_ALPHABETIC_CODE"));
					$("[name=currencyNumericCode]").val(ds.getValue(0, "CURRENCY_NUMERIC_CODE"));
					$("[name=countryName]").val(ds.getValue(0, "COUNTRY_NAME"));
					$("[name=countryLanguageCode]").val(ds.getValue(0, "COUNTRY_LANGUAGE_CODE"));
					$("[name=countryCode2]").val(ds.getValue(0, "COUNTRY_CODE_2"));
					$("[name=countryCode3]").val(ds.getValue(0, "COUNTRY_CODE_3"));
					$("[name=countryNumericCode]").val(ds.getValue(0, "COUNTRY_NUMERIC_CODE"));
				}
			});
		}

		setTimeout(() => commonJs.hideProcMessageOnElement("divScrollablePanelPopup"), 400);
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		commonJs.showProcMessageOnElement("divScrollablePanelPopup");

		setTimeout(function() {
			setDetailData();
		}, 200);
	});
});