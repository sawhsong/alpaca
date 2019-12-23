/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202AssignmentFrame.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#tabPrtWorkcover li a").click(function(event) {
		event.preventDefault();
		changeTabSelectionInFrame($(this), "PrtWorkcover");
	});

	$("#tabTsExpDeli li a").click(function(event) {
		event.preventDefault();
		changeTabSelectionInFrame($(this), "TsExpDeli");
	});

	/*!
	 * process
	 */
	setWrapperSize = function() {
		$("#divFrameDataAreaWrapper").height($("#divScrollablePanelFrame").height()-86);
	};

	changeTabSelectionInFrame = function(object, tabCategory, event) {
		var $parentUl = $(object).closest("ul");
		var $parentLi = $(object).closest("li");

		if ($parentLi.attr("class").indexOf("disabled") != -1) {return;}

		$parentUl.find("li").each(function(index) {
			var thisSelected = $(this).has($(object)).length;

			if (thisSelected <= 0) {
				if ($(this).attr("class").indexOf("disabled") != -1) {
				} else {
					$(this).removeClass("active");
					if ($("#div"+tabCategory+index).length > 0) {
						$("#div"+tabCategory+index).stop().animate({opacity:"hide"}, jsconfig.get("effectDuration"));
					}
				}
			}

			if (thisSelected > 0) {
				if ($(this).attr("class").indexOf("disabled") != -1) {
				} else {
					$(this).addClass("active");
					if ($("#div"+tabCategory+index).length > 0) {
						$("#div"+tabCategory+index).stop().delay(100).animate({opacity:"show"}, jsconfig.get("effectDuration"));
					}
				}
			}
		});
	};

	/*
	 * ! load event (document / window)
	 */
	$(window).load(function() {
		commonJs.setAccordion({
			containerClass:"accordion",
			multipleExpand:true,
			expandAll:true,
			icons:null
		});

		setWrapperSize();
	});
});