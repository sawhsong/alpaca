/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0408List.js
 *************************************************************************************************/
var popup = null;
var searchResultDataCount = 0;
var langCode = commonJs.upperCase(jsconfig.get("langCode"));
var delimiter = jsconfig.get("dataDelimiter");

$(function() {
	/*!
	 * event
	 */
	$("#btnSave").click(function(event) {
		if (!commonJs.doValidate("fmDefault")) {
			return;
		}

		commonJs.doSave({
			url:"/sys/0408/exeInsert.do",
			data:{},
			callback:function() {
				commonJs.doSimpleProcessForPage({
					action:"/sys/0408/getList.do"
				});
			}
		});
	});

	$("#icnCheck").click(function(event) {
		commonJs.toggleCheckboxes("chkToAssign");
	});

	$("[name=chkToAssign]").click(function(event) {
		var thisChecked = $(this).prop("checked"), thisMenuId = $(this).val(), thisValue = $(this).attr("paramValue");
		var thisValueItems = thisValue.split(delimiter);
		var thisLevel = thisValueItems[0];
		var thisPaths = thisValueItems[1].split("/");

		$("[name=chkToAssign]").each(function(index) {
			var val = $(this).attr("paramValue");
			var valItems = val.split(delimiter);
			var level = valItems[0];
			var paths = valItems[1].split("/");

			if (thisValue != val) {
				if (thisLevel == "1") {
					if (level > thisLevel && thisMenuId == paths[0]) {
						$(this).prop("checked", thisChecked);
					}
				}

				if (thisLevel == "2") {
					if (thisChecked) {
						if ((level > thisLevel && thisMenuId == paths[1]) || (level < thisLevel && thisPaths[0] == paths[0])) {
							$(this).prop("checked", thisChecked);
						}
					} else {
						if (level > thisLevel && thisMenuId == paths[1]) {
							$(this).prop("checked", thisChecked);
						}
					}
				}

				if (thisLevel == "3") {
					if (thisChecked) {
						if ((level == "1" && thisPaths[0] == paths[0]) || (level == "2" && thisPaths[1] == paths[1])) {
							$(this).prop("checked", thisChecked);
						}
					}
				}
			}
		});

		if (!thisChecked && thisLevel == "2") {
			if (!hasChildChecked(thisLevel, thisPaths[0])) {
				$("[name=chkToAssign]").each(function(index) {
					var val = $(this).attr("paramValue");
					var valItems = val.split(delimiter);
					var level = valItems[0];
					var paths = valItems[1].split("/");

					if (paths[0] == thisPaths[0]) {
						$(this).prop("checked", false);
						return false;
					}
				});
			}
		}

		if (!thisChecked && thisLevel == "3") {
			if (!hasChildChecked(thisLevel, thisPaths[1])) {
				$("[name=chkToAssign]").each(function(index) {
					var val = $(this).attr("paramValue");
					var valItems = val.split(delimiter);
					var level = valItems[0];
					var paths = valItems[1].split("/");

					if (paths[1] == thisPaths[1]) {
						$(this).prop("checked", false);
						return false;
					}
				});
			}

			if (!hasChildChecked(2, thisPaths[0])) {
				$("[name=chkToAssign]").each(function(index) {
					var val = $(this).attr("paramValue");
					var valItems = val.split(delimiter);
					var level = valItems[0];
					var paths = valItems[1].split("/");

					if (paths[0] == thisPaths[0]) {
						$(this).prop("checked", false);
						return false;
					}
				});
			}
		}

		$("[name=chkToAssign]").each(function(index) {
			if ($(this).is(":checked")) {
				$(this).parents("tr").addClass("checkedTr");
			} else {
				$(this).parents("tr").removeClass("checkedTr");
			}
		});
	});

	$("#authGroup").change(function() {
		$("#authGroupDesc").val($("#authGroup option:selected").attr("desc"));
		setCheckbox();
	});

	$(document).keypress(function(event) {
		if (event.which == 13) {
			var element = event.target;
		}
	});

	/*!
	 * process
	 */
	setCheckbox = function() {
		var selectedAuthGroup = $("#authGroup").val(), groupId = "";

		if (commonJs.isEmpty(selectedAuthGroup)) {
			$("[name=chkToAssign]").each(function(index) {
				$(this).prop("checked", false);
			});
			return;
		}

		$("[name=chkToAssign]").each(function(index) {
			groupId = $(this).attr("groupId");

			if (!commonJs.isEmpty(groupId) && groupId.indexOf(selectedAuthGroup) != -1) {
				$(this).prop("checked", true);
				$(this).addClass("checkedTr");
			} else {
				$(this).prop("checked", false);
				$(this).removeClass("checkedTr");
			}
		});
	};

	hasChildChecked = function(paramLevel, paramMenuId) {
		var rtn = false;

		$("[name=chkToAssign]:checked").each(function(index) {
			var val = $(this).attr("paramValue");
			var valItems = val.split(delimiter);
			var level = valItems[0];
			var paths = valItems[1].split("/");

			if (paramLevel == "2") {
				if (level > paramLevel && paths[0] == paramMenuId || level == paramLevel && paths[0] == paramMenuId) {
					rtn = true;
				}
			}

			if (paramLevel == "3") {
				if (level == paramLevel && paths[1] == paramMenuId) {
					rtn = true;
				}
			}
		});
		return rtn;
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		$("#tblGrid").fixedHeaderTable({
			attachTo:$("#divDataArea")
		});

		setCheckbox();
	});
});