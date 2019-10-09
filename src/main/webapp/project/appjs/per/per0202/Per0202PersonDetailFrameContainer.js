/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202List.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#tabCategoryPersonDetail li a").click(function() {
		var index = $(this).parent().index(),
			action = commonJs.replace(commonJs.replace($(this).text(), " ", ""), "/", ""),
			actionString = "/per/0202/get"+action+".do"+"?personId="+personId;

		$("#divTabAreaAssignments").css("display", "none");

		if (action == "Document") {
			$("#divTabAreaDocument").css("display", "block");
		} else {
			$("#divTabAreaDocument").css("display", "none");
		}

		if (action == "ECMS" || action == "EBO") {
			$("#divTabAreaEcmsEbo").css("display", "block");
		} else {
			$("#divTabAreaEcmsEbo").css("display", "none");
		}

		if (action == "Portal") {
			$("#divTabAreaPortal").css("display", "block");
		} else {
			$("#divTabAreaPortal").css("display", "none");
		}

		$("#if"+action).attr("src", "");
		setTimeout(function() {
			$("#if"+action).attr("src", actionString);
		}, 200); // important
	});

	$("#tabCategoryEcmsEbo li a").click(function() {
		var index = $(this).parent().index(),
			action = commonJs.replace(commonJs.replace($(this).text(), " ", ""), "/", ""),
			actionString = "/per/0202/get"+action+".do"+"?personId="+personId;

		if (action == "Assignments") {
			$("#divTabAreaAssignments").css("display", "block");
		} else {
			$("#divTabAreaAssignments").css("display", "none");
		}

		$("#if"+action).attr("src", "");
		setTimeout(function() {
			$("#if"+action).attr("src", actionString);
		}, 200); // important
	});

	/*!
	 * process
	 */
	setAllIframeSize = function() {
		$("iframe").each(function(index) {
			$(this).css("height", $("#divScrollablePanel").height());
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setAllIframeSize();
		$("#tabCategoryPersonDetail li:eq(0) a").trigger("click");
	});
});