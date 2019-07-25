<%/************************************************************************************************
* Description
* - 
************************************************************************************************/%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	SysUser sysUserHeaderPage = (SysUser)session.getAttribute("SysUser");
	String authGroupIdHeaderPage = sysUserHeaderPage.getAuthGroupId();

	String userNameHeaderPage = sysUserHeaderPage.getUserName();
	String userIdHeaderPage = sysUserHeaderPage.getUserId();
	String languageCodeHeaderPage = CommonUtil.upperCase((String)session.getAttribute("langCode"));
	String selectedHeaderMenuHeaderPage = (String)session.getAttribute("headerMenuId");

	DataSet dsThemeTypeHeaderPage = CommonCodeManager.getCodeDataSetByCodeType("USER_THEME_TYPE");
	DataSet dsMenuHeaderPage = MenuManager.getMenu(authGroupIdHeaderPage, "", "1", "1");
	DataSet dsQuickMenuHeaderPage = MenuManager.getQuickMenu();

	String quickMenuNameHeaderPage = dsQuickMenuHeaderPage.getValue("MENU_NAME_"+languageCodeHeaderPage);
	String quickMenuIconHeaderPage = dsQuickMenuHeaderPage.getValue("MENU_ICON");

	String dataSourceNamesHeaderPage[] = CommonUtil.split(ConfigUtil.getProperty("jdbc.multipleDatasource"), ConfigUtil.getProperty("delimiter.data"));
	String databaseHeaderPage = CommonUtil.nvl((String)session.getAttribute("DatabaseForAdminTool"), dataSourceNamesHeaderPage[0]);
	String personNumberHeaderPage = CommonUtil.nvl((String)session.getAttribute("PersonNumberForAdminTool"));
	String personInfoHeaderPage = "";
	if (CommonUtil.isNotBlank(personNumberHeaderPage)) {personInfoHeaderPage = (String)session.getAttribute("PersonFullNameForAdminTool")+" ("+personNumberHeaderPage+")";}
	String organisationIdHeaderPage = CommonUtil.nvl((String)session.getAttribute("OrganisationIdForAdminTool"));
	String organisationInfoHeaderPage = "";
	if (CommonUtil.isNotBlank(organisationIdHeaderPage)) {organisationInfoHeaderPage = (String)session.getAttribute("OrganisationNameForAdminTool")+" ("+organisationIdHeaderPage+")";}
	String assignmentHeaderPage = CommonUtil.nvl((String)session.getAttribute("AssignmentIdForAdminTool"));
	String assignmentInfoHeaderPage = "";
	if (CommonUtil.isNotBlank(organisationIdHeaderPage)) {assignmentInfoHeaderPage = (String)session.getAttribute("AssignmentNumberForAdminTool");}
%>
<%/************************************************************************************************
* Stylesheet & Javascript
************************************************************************************************/%>
<style type="text/css">
.sessionDesc {float:left;}
</style>
<script type="text/javascript">
var popupUserProfile, popupQuickMenu;
var authGroupIdHeaderPage = "<%=authGroupIdHeaderPage%>";

$(function() {
	$("#aLogo").click(function(event) {
		$("#hdnHeaderMenuId").val("");
		$("#hdnHeaderMenuName").val("");
		$("#hdnHeaderMenuUrl").val("");
		$("#hdnLeftMenuId").val("");
		$("#hdnLeftMenuName").val("");
		$("#hdnLeftMenuUrl").val("");

		commonJs.doSubmit({form:$("form:eq(0)"), action:"/index.do"});
	});

	$("#aFrameworkMenu").click(function() {
		$("#hdnHeaderMenuId").val("");
		$("#hdnHeaderMenuName").val("");
		$("#hdnHeaderMenuUrl").val("");
		$("#hdnLeftMenuId").val("");
		$("#hdnLeftMenuName").val("");
		$("#hdnLeftMenuUrl").val("");

		commonJs.doSubmit({form:$("form:eq(0)"), action:"/zebra/main/getDefault.do"});
	});

	$("#aQuickMenu").click(function() {
		$("#divQuickMenu").addClass("selected");
		$("#divQuickMenu").trigger("click");
	});

	$("#aDeleteSessionDesc").click(function() {
		commonJs.ajaxSubmit({
			url:"/login/removeSessionValuesForAdminTool",
			dataType:"json",
			data:{
			},
			success:function(data, textStatus) {
				var result = commonJs.parseAjaxResult(data, textStatus, "json");
				if (result.isSuccess == true || result.isSuccess == "true") {
					$("#divDbInfo").html("Database : <%=dataSourceNamesHeaderPage[0]%>");
					$("#divPersonInfo").html("");
					$("#divOrgInfo").html("");
					$("#divAssignmentInfo").html("");
				} else {
					commonJs.error(result.message);
				}
			}
		});
	});

	$("#aLoggedInUser").click(function() {
		$("#divLoggedInUser").addClass("selected");
		$("#divLoggedInUser").trigger("click");
	});

	doMainMenu = function(menuId, menuName, menuUrl) {
		if (menuUrl == "#") {
			menuUrl = "/index.do";
		}
		$("#hdnHeaderMenuId").val(menuId);
		$("#hdnHeaderMenuName").val(menuName);
		$("#hdnHeaderMenuUrl").val(menuUrl);
		$("#hdnLeftMenuId").val("");
		$("#hdnLeftMenuName").val("");
		$("#hdnLeftMenuUrl").val("");

		commonJs.doSubmit({form:$("form:eq(0)"), action:menuUrl});
	};

	setThemeSelectorContextMenu = function() {
		var theme = commonJs.getDataSetFromJavaDataSet("<%=dsThemeTypeHeaderPage.toStringForJs()%>");
		var themeMenu = [];

		for (var i=0; i<theme.getRowCnt(); i++) {
			themeMenu.push({
				name:theme.getValue(i, "DESCRIPTION_EN"),
				img:"<mc:cp key="imgIcon"/>/"+commonJs.lowerCase(theme.getValue(i, "COMMON_CODE"))+".png",
				themeId:theme.getValue(i, "COMMON_CODE"),
				fun:function() {
					var index = $(this).index();

					commonJs.doSubmit({
						data:{
							themeId:themeMenu[index].themeId
						},
						action:"/index.do"
					});
				}
			});
		}

		$("#aThemeSelector").contextMenu(themeMenu, {
			classPrefix:com.constants.ctxClassPrefixTheme,
			effectDuration:300,
			effect:"slide",
			borderRadius:"bottom 5px",
			displayAround:"trigger",
			position:"bottom",
			heightAdjust:5,
			horAdjust:-5,
			verAdjust:-3
		});
	};

	setQuickMenuContextMenu = function() {
		var quickMenu = commonJs.getDataSetFromJavaDataSet("<%=dsQuickMenuHeaderPage.toStringForJs()%>");
		var languageCode = jsconfig.get("langCode").toUpperCase();
		var ctxMenu = [];

		for (var i=0; i<quickMenu.getRowCnt(); i++) {
			if (quickMenu.getValue(i, "LEVEL") != "1") {
				ctxMenu.push({
					name:quickMenu.getValue(i, "MENU_NAME_"+languageCode),
					img:"<mc:cp key="imgThemeCom"/>/"+quickMenu.getValue(i, "MENU_ICON")+"_Black.png",
					menuId:quickMenu.getValue(i, "MENU_ID"),
					menuUrl:quickMenu.getValue(i, "MENU_URL"),
					fun:function() {
						var index = $(this).index();

// 						alert(ctxMenu[index].img);
						doQuickMenu(ctxMenu[index].name, ctxMenu[index].menuId, ctxMenu[index].menuUrl);
					}
				});
			}
		}

		$("#divQuickMenu").contextMenu(ctxMenu, {
			classPrefix:com.constants.ctxClassPrefixHeader,
			effectDuration:300,
			effect:"slide",
			borderRadius:"bottom 3px",
			displayAround:"trigger",
			position:"bottom",
			onClose:function() {
				$("#divQuickMenu").removeClass("selected");
			}
		});
	};

	setLoginUserContextMenu = function() {
		ctxMenu.loggedInUser[0].fun = function() {getMyProfile("<%=userIdHeaderPage%>");};
		ctxMenu.loggedInUser[1].fun = function() {logout();};
		$("#divLoggedInUser").contextMenu(ctxMenu.loggedInUser, {
			classPrefix:com.constants.ctxClassPrefixHeader,
			effectDuration:300,
			effect:"slide",
			borderRadius:"bottom 3px",
			displayAround:"trigger",
			position:"bottom",
			verAdjust:0,
			onClose:function() {
				$("#divLoggedInUser").removeClass("selected");
			}
		});
	};

	getMyProfile = function(userId) {
		popupUserProfile = commonJs.openPopup({
			popupId:"UserProfile",
			url:"/login/getUserProfile.do",
			paramData:{
				userId:userId
			},
			header:"User Profile Detail",
			blind:true,
			width:720,
			height:340
		});
	};

	doQuickMenu = function(menuName, menuId, menuUrl) {
		var width = 0, height = 0;

		if (menuId == "QM10") {
			width = 400, height = 230;
		} else if (menuId == "QM20") {
			width = 1800, height = 940;
		} else if (menuId == "QM30") {
			width = 1800, height = 940;
		}

		popupQuickMenu = commonJs.openPopup({
			popupId:menuId,
			url:menuUrl,
			paramData:{
				menuId:menuId
			},
			header:menuName,
			blind:true,
			width:width,
			height:height
		});
	};

	logout = function() {
		commonJs.doSubmit({form:$("form:eq(0)"), action:"/login/logout"});
	};

	$(window).load(function() {
		setThemeSelectorContextMenu();
		if (!commonJs.isEmpty(authGroupIdHeaderPage)) {
			setQuickMenuContextMenu();
		}
		setLoginUserContextMenu();
	});
});
</script>
<%/************************************************************************************************
* Real Contents
************************************************************************************************/%>
<div id="divHeaderLeft"></div>
<div id="divHeaderCenter">
	<div id="divGlobalMenuHeaderGroup">
		<div id="divGlobalMenuLeft">
			<div id="divLogoArea">
				<a id="aLogo"></a>
			</div>
		</div>
		<div id="divGlobalMenuRight">
			<div id="divGblMenuArea">
				<div id="divUsingUserAs" class="headerGblMenus" style="color:#D92E24;cursor:default;">
					<div id="divDbInfo" class="sessionDesc"><%if (CommonUtil.isNotBlank(databaseHeaderPage)) {%>Database : <%=databaseHeaderPage%><%}%></div>
					<div id="divPersonInfo" class="sessionDesc"><%if (CommonUtil.isNotBlank(personInfoHeaderPage)) {%> / Person : <%=personInfoHeaderPage%><%}%></div>
					<div id="divOrgInfo" class="sessionDesc"><%if (CommonUtil.isNotBlank(organisationInfoHeaderPage)) {%> / Org : <%=organisationInfoHeaderPage%><%}%></div>
					<div id="divAssignmentInfo" class="sessionDesc"><%if (CommonUtil.isNotBlank(assignmentInfoHeaderPage)) {%> / Assignment : <%=assignmentInfoHeaderPage%><%}%></div>
				</div>
				<div class="divGblMenuBreak"></div>
				<div class="headerGblMenus" style="margin-top:-1px;"><a id="aDeleteSessionDesc" class="fa fa-trash fa-lg aEn" title="Delete all quick menu session values"></a></div>
				<div class="divGblMenuBreak"></div>
				<div id="divThemeSelector" class="headerGblMenus">
					<a id="aThemeSelector">${sessionScope.themeName}</a>
				</div>
<%
				if (CommonUtil.equals(userIdHeaderPage, "0") || CommonUtil.equals(userIdHeaderPage, "1")) {
%>
				<div class="divGblMenuBreak"></div>
				<div id="divFrameworkMenu" class="headerGblMenus">
					<a id="aFrameworkMenu">Framework Menu</a>
				</div>
<%
				}
%>
			</div>
		</div>
	</div>
	<div id="divMainMenuHeaderGroup">
		<div id="divMainMenuAreaLeft">
<%
		for (int i=0; i<dsMenuHeaderPage.getRowCnt(); i++) {
			if (CommonUtil.equals(dsMenuHeaderPage.getValue(i, "LEVEL"), "1") && !CommonUtil.equals(dsMenuHeaderPage.getValue(i, "MENU_ID"), "QM")) {
				String menuId = dsMenuHeaderPage.getValue(i, "MENU_ID");
				String menuName = dsMenuHeaderPage.getValue(i, "MENU_NAME_"+languageCodeHeaderPage);
				String menuUrl = dsMenuHeaderPage.getValue(i, "MENU_URL");
				String icon = dsMenuHeaderPage.getValue(i, "MENU_ICON");
				String selected = (CommonUtil.equals(menuId, selectedHeaderMenuHeaderPage)) ? "Selected" : "";
%>
				<div id="div<%=menuId%>" class="headerMainMenus<%=selected%>" onclick="doMainMenu('<%=menuId%>', '<%=menuName%>', '<%=menuUrl%>')">
					<a style="background:url(<mc:cp key="imgThemeCom"/>/<%=icon%>_<mc:cp key="headMainMenuIconColor"/>.png) no-repeat 0px 0px"><%=menuName%></a>
				</div>
<%
			}
		}
%>
		</div>
		<div id="divMainMenuAreaRight">
<%
		if (CommonUtil.isNotBlank(authGroupIdHeaderPage)) {
%>
			<div id="divQuickMenu" class="headerMainMenus">
				<a id="aQuickMenu" style="background:url(<mc:cp key="imgThemeCom"/>/<%=quickMenuIconHeaderPage%>_<mc:cp key="headMainMenuIconColor"/>.png) no-repeat 0px 50%;padding:4px 0px 4px 25px;">
					<%=quickMenuNameHeaderPage%>
				</a>
			</div>
<%
		}
%>
			<div id="divLoggedInUser" class="headerMainMenus">
				<a id="aLoggedInUser"><%=userNameHeaderPage%></a>
			</div>
		</div>
	</div>
</div>
<div id="divHeaderRight"></div>
<%/************************************************************************************************
* Additional Elements
************************************************************************************************/%>
<input type="hidden" id="hdnHeaderMenuId" name="hdnHeaderMenuId" value="${sessionScope.headerMenuId}"/>
<input type="hidden" id="hdnHeaderMenuName" name="hdnHeaderMenuName" value="${sessionScope.headerMenuName}"/>
<input type="hidden" id="hdnHeaderMenuUrl" name="hdnHeaderMenuUrl" value="${sessionScope.headerMenuUrl}"/>