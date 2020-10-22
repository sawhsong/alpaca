/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202PersonalFrame.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#icnDateOfBirth").click(function(event) {
		commonJs.openCalendar(event, "dateOfBirth");
	});

	$("#icnFirstContact").click(function(event) {
		commonJs.openCalendar(event, "firstContact");
	});

	$("#employmentCompanyOrgName").blur(function() {
		if (commonJs.isEmpty($(this).val())) {
			$("#employmentCompanyOrgId").val("");
		}
	});

	$("#referralName").blur(function() {
		if (commonJs.isEmpty($(this).val())) {
			$("#referralId").val("");
		}
	});

	$("#referralOrganisationName").blur(function() {
		if (commonJs.isEmpty($(this).val())) {
			$("#referralOrganisationId").val("");
		}
	});

	$("#btnDownloadComms").click(function() {
		var val = commonJs.htmlToString($("#commsHistory").html());
		val = commonJs.replace(val, "<strong>", "");
		val = commonJs.replace(val, "</strong>", "");
		commonJs.downloadContentAsFile("CommunicationHistory.txt", val);
	});

	/*!
	 * process
	 */
	setEditor = function() {
//		$("#personalComment").ckeditor({
//			height:246,
//			toolbar:com.constants.toolbarSimple
//		});
	};

	setWrapperSize = function() {
//commonJs.printLog({message:"divFrameWindowHolder : "+$("#divFrameWindowHolder").height()});
//commonJs.printLog({message:"divFixedPanelFrame : "+$("#divFixedPanelFrame").height()});
//commonJs.printLog({message:"divScrollablePanelFrame : "+$("#divScrollablePanelFrame").height()});
		$("#divDataArea").height(722); // divFrameWindowHolder - divFixedPanelFrame - additional height
		$("#divFrameDataAreaWrapper").height($("#divScrollablePanelFrame").height());
	};

	setFieldPersonDetailValues = function(ds) {
		var personType = ds.getValue(0, "PERSON_TYPE").toUpperCase().split(",");

		try {
			$("#personNumber").val(ds.getValue(0, "PERSON_NUMBER"));
			commonJs.setRadioValue("prefix", ds.getValue(0, "PREFIX"));
			$("#surname").val(ds.getValue(0, "SURNAME"));
			$("#firstName").val(ds.getValue(0, "FIRST_NAME"));
			$("#middleName").val(ds.getValue(0, "MIDDLE_NAME"));
			$("#preferredName").val(ds.getValue(0, "PREFERRED_NAME"));
			$("#dateOfBirth").val(ds.getValue(0, "DATE_OF_BIRTH"));
			$("#firstContact").val(ds.getValue(0, "FIRST_CONTACT"));
			commonJs.setRadioValue("maritalStatus", ds.getValue(0, "MARITAL_STATUS"));
			commonJs.setRadioValue("gender", ds.getValue(0, "GENDER"));
			$("#employmentCompanyOrgId").val(ds.getValue(0, "EMPLOYMENT_COMPANY_ORG_ID"));
			$("#employmentCompanyOrgName").val(ds.getValue(0, "EMPLOYMENT_COMPANY_ORG_NAME"));
			$("#title").val(ds.getValue(0, "TITLE"));
			$("#referralId").val(ds.getValue(0, "REFERRAL_ID"));
			$("#referralName").val(ds.getValue(0, "REFERRAL_NAME"));
			$("#referralOrganisationId").val(ds.getValue(0, "REFERRAL_ORGANISATION_ID"));
			$("#referralOrganisationName").val(ds.getValue(0, "REFERRAL_ORGANISATION_NAME"));
		} catch(e) {}

		setTimeout(function() {
			setPersonType(personType);
		}, 500);
	};

	setPersonType = function(personType) {
		$("#personType").selectpicker("val", personType);
		$("#personType").selectpicker("refresh");
	};

	setPersonalCommentFieldValues = function(ds) {
//		$("#personalComment").val(ds.getValue(0, "DESCRIPTION"));
		$("#personalComment").html(commonJs.stringToHtml(ds.getValue(0, "DESCRIPTION")));
	};

	setCommsHistoryFieldValues = function(ds) {
		var html = "";

//		for (var i=0; i<ds.getRowCnt(); i++) {
//			html += commonJs.htmlToString(ds.getValue(i, "CON_DATE"))+"\n";
//			html += "------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
//			html += commonJs.htmlToString(ds.getValue(i, "COMMENTS"))+"\n";
//			html += "------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n";
//		}
//
//		$("#commsHistory").val(html);

		for (var i=0; i<ds.getRowCnt(); i++) {
			html += "<strong>"+commonJs.stringToHtml(ds.getValue(i, "CON_DATE"))+"</strong>"+"<br/>";
			html += "------------------------------------------------------------------------------------------------------------------------------------------------------------------------<br/>";
			html += commonJs.stringToHtml(ds.getValue(i, "COMMENTS"))+"<br/>";
			html += "------------------------------------------------------------------------------------------------------------------------------------------------------------------------<br/><br/>";
		}
		$("#commsHistory").html(html);
	};

	getPersonDetail = function() {
		commonJs.showProcMessageOnElement("divPersonDetails");

		commonJs.doSimpleProcess({
			url:"/per/0202/getPersonDetail.do",
			noForm:true,
			data:{personId:personId},
			callback:function(result) {
				var ds = result.dataSet;
				setFieldPersonDetailValues(ds);
			}
		});

		setTimeout(function() {
			commonJs.hideProcMessageOnElement("divPersonDetails");
		}, 1000);
	};

	getPersonalComment = function() {
		commonJs.showProcMessageOnElement("divPersonalComment");

		commonJs.doSimpleProcess({
			url:"/per/0202/getPersonalComment.do",
			dataType:"html",
			noForm:true,
			data:{personId:personId},
			callback:function(result) {
				var ds = result.dataSet;
				setPersonalCommentFieldValues(ds);
			}
		});

		setTimeout(function() {
			commonJs.hideProcMessageOnElement("divPersonalComment");
		}, 1000);
	};

	getCommsHistory = function() {
		commonJs.showProcMessageOnElement("divCommsHistory");

		commonJs.doSimpleProcess({
			url:"/per/0202/getCommsHistory.do",
			noForm:true,
			dataType:"html",
			data:{personId:personId},
			callback:function(result) {
				var ds = result.dataSet;
				setCommsHistoryFieldValues(ds);
			}
		});

		setTimeout(function() {
			commonJs.hideProcMessageOnElement("divCommsHistory");
		}, 1000);
	};

	/*
	 * ! load event (document / window)
	 */
	$(window).load(function() {
		commonJs.setAccordion({
			containerClass:"accordion",
			multipleExpand:true,
			expandAll:true
		});

		commonJs.setFieldDateMask("dateOfBirth");
		commonJs.setFieldDateMask("firstContact");
		setEditor();

		commonJs.setAutoComplete($("#employmentCompanyOrgName"), {
			method:"getOrgByNameOrId",
			label:"org_name_with_org_id",
			value:"organisation_id",
			minLength:2,
			focus: function(event, ui) {
				$("#employmentCompanyOrgId").val(ui.item.value);
				$("#employmentCompanyOrgName").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#employmentCompanyOrgName").val())) {
					$("#employmentCompanyOrgId").val("");
					$("#employmentCompanyOrgName").val("");
				}
			},
			select:function(event, ui) {
				$("#employmentCompanyOrgId").val(ui.item.value);
				$("#employmentCompanyOrgName").val(ui.item.label);
				return false;
			}
		});

		commonJs.setAutoComplete($("#referralName"), {
			method:"getPersonByNameOrPersonNumber",
			label:"full_name_with_person_number",
			value:"person_id",
			minLength:2,
			focus: function(event, ui) {
				$("#referralId").val(ui.item.value);
				$("#referralName").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#referralName").val())) {
					$("#referralId").val("");
					$("#referralName").val("");
				}
			},
			select:function(event, ui) {
				$("#referralId").val(ui.item.value);
				$("#referralName").val(ui.item.label);
				return false;
			}
		});

		commonJs.setAutoComplete($("#referralOrganisationName"), {
			method:"getOrgByNameOrId",
			label:"org_name_with_org_id",
			value:"organisation_id",
			minLength:2,
			focus: function(event, ui) {
				$("#referralOrganisationId").val(ui.item.value);
				$("#referralOrganisationName").val(ui.item.label);
				return false;
			},
			change:function(event, ui) {
				if (commonJs.isEmpty($("#referralOrganisationName").val())) {
					$("#referralOrganisationId").val("");
					$("#referralOrganisationName").val("");
				}
			},
			select:function(event, ui) {
				$("#referralOrganisationId").val(ui.item.value);
				$("#referralOrganisationName").val(ui.item.label);
				return false;
			}
		});

		setWrapperSize();

		setTimeout(function() {
			getPersonDetail();
			getPersonalComment();
			getCommsHistory();
		}, 400);
	});
});