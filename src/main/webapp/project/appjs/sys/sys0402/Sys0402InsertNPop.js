/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Sys0402InsertPop.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#menuLevel").change(function(event) {
		var value = $(this).val();

		if (value == 2) {
			$("#divLevel1").css("display", "block");
			$("#divLevel2").css("display", "none");
		} else if (value == 3) {
			$("#divLevel1").css("display", "block");
			$("#divLevel2").css("display", "block");
		} else {
			$("#divLevel1").css("display", "none");
			$("#divLevel2").css("display", "none");
		}

		setLevel2Selectbox();
		setFieldValue();
	});

	$("#level1").change(function(event) {
		setLevel2Selectbox();
		setFieldValue();
	});

	$("#level2").change(function(event) {
		setFieldValue();
	});

	$("#menuId").blur(function(event) {
		var menuLevel = $("#menuLevel").val();
		var level1MenuId = $("#level1").val();
		var level2MenuId = $("#level2").val();

		if (menuLevel == 1) {
		} else if (menuLevel == 2) {
			$("#menuUrl").val("/"+level1MenuId.toLowerCase()+"/"+$(this).val());
		} else if (menuLevel == 3) {
			if (!commonJs.isEmpty(level2MenuId)) {
				$("#menuUrl").val("/"+level1MenuId.toLowerCase()+"/"+level2MenuId+"/"+$(this).val()+"/"+"getDefault.do");
			}
		}
	});

	$("#btnSave").click(function(event) {
		if (!commonJs.doValidate("fmDefault")) {return;}

		if (!doValidate()) {return;}

		commonJs.doSave({
			url:"/sys/0402/exeInsert.do",
			data:{},
			callback:function() {
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
	setLevel2Selectbox = function() {
		var level1MenuId = $("#level1").val();

		$("#level2 option").each(function(index) {
			$(this).remove();
		});

		for (var i=0; i<dsMenu2.getRowCnt(); i++) {
			var parentMenu = dsMenu2.getValue(i, "PARENT_MENU_ID");
			if (parentMenu == level1MenuId) {
				$("#level2").append(commonJs.getUiSelectOption({
					value:dsMenu2.getValue(i, "MENU_ID"),
					text:dsMenu2.getValue(i, "MENU_ID")
				}));
			}
		}

		$("#level2").selectpicker({container:"body"}).selectpicker("refresh");
	};

	setFieldValue = function() {
		var menuLevel = $("#menuLevel").val();
		var level1MenuId = $("#level1").val();
		var level2MenuId = $("#level2").val();
		var sortOrder = getSortOrder(menuLevel);

		$("#menuId").val("");
		$("#menuUrl").val("");
		$("#sortOrder").val("");

		if (menuLevel == 1) {
			$("#menuId").css({"text-transform":"uppercase"});
			$("#menuUrl").val("#");
			$("#sortOrder").val(sortOrder);
		} else if (menuLevel == 2) {
			$("#menuId").removeAttr("style");
			$("#menuUrl").val("/"+level1MenuId.toLowerCase()+"/");
			$("#sortOrder").val(sortOrder);
		} else if (menuLevel == 3) {
			if (!commonJs.isEmpty(level2MenuId)) {
				$("#menuUrl").val("/"+level1MenuId.toLowerCase()+"/"+level2MenuId+"/");
			}
			$("#menuId").removeAttr("style");
			$("#sortOrder").val(sortOrder);
		}
	};

	getSortOrder = function() {
		var menuLevel = $("#menuLevel").val();
		var level1MenuId = $("#level1").val();
		var level2MenuId = $("#level2").val();
		var sortOrder = 0;

		for (var i=0; i<dsMenu.getRowCnt(); i++) {
			if (menuLevel == 1) {
				if (menuLevel == dsMenu.getValue(i, "LEVEL")) {
					sortOrder = dsMenu.getValue(i, "SORT_ORDER");
				}
			} else if (menuLevel == 2) {
				if (menuLevel == dsMenu.getValue(i, "LEVEL") && level1MenuId == dsMenu.getValue(i, "ROOT")) {
					sortOrder = dsMenu.getValue(i, "SORT_ORDER");
				}
			} else if (menuLevel == 3) {
				if (menuLevel == dsMenu.getValue(i, "LEVEL") && level2MenuId == dsMenu.getValue(i, "PARENT_MENU_ID")) {
					sortOrder = dsMenu.getValue(i, "SORT_ORDER");
				}
			}
		}

		if (sortOrder == 0) {
			for (var i=0; i<dsMenu.getRowCnt(); i++) {
				if (menuLevel == 1) {
				} else if (menuLevel == 2) {
					if (dsMenu.getValue(i, "LEVEL") == "1" && level1MenuId == dsMenu.getValue(i, "MENU_ID")) {
						sortOrder = dsMenu.getValue(i, "SORT_ORDER");
					}
				} else if (menuLevel == 3) {
					if (dsMenu.getValue(i, "LEVEL") == "2" && level2MenuId == dsMenu.getValue(i, "MENU_ID")) {
						sortOrder = dsMenu.getValue(i, "SORT_ORDER");
					}
				}
			}
		}

		return sortOrder;
	};

	doValidate = function() {
		var menuLevel = $("#menuLevel").val();
		var menuUrl = $("#menuUrl").val();
		var sortOrder = $("#sortOrder").val();

		if (menuLevel == 1 && menuUrl != "#") {
			return commonJs.doValidatorMessage($("#menuUrl"), "notValid");
		}

		if (sortOrder.length != 6) {
			return commonJs.doValidatorMessage($("#sortOrder"), "notValid");
		}

		return true;
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setLevel2Selectbox();
		setFieldValue();
		parent.popup.setHeader("New / Edit by Name");
	});
});