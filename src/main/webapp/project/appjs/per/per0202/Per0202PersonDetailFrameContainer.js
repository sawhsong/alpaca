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
			actionString = "/per/0202/get"+action+".do"+"?personId="+personId;

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
		$("#tabCategory li:eq(0) a").trigger("click");
	});
});