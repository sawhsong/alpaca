/**************************************************************************************************
 * Framework Generated Javascript Source
 * - Per0202List.js
 *************************************************************************************************/
$(function() {
	/*!
	 * event
	 */
	$("#tabCategory li a").click(function() {
		var index = $(this).parent().index(),
			action = commonJs.replace(commonJs.replace($(this).text(), " ", ""), "/", ""),
			actionString = "/per/0202/get"+action+".do";

		$("#if"+action).attr("src", actionString);
	});

	/*!
	 * process
	 */
	setIframeSize = function() {
		$("iframe").each(function(index) {
			$(this).css("height", $("#divScrollablePanel").height());
		});
	};

	/*!
	 * load event (document / window)
	 */
	$(window).load(function() {
		setIframeSize();
		$("#tabCategory li:eq(0) a").trigger("click");
	});
});