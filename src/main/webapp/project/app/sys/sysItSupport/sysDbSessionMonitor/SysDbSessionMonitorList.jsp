<%/************************************************************************************************
* Description - SysDbSessionMonitor - Databse Session Monitor
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	String dataSourceNames[] = CommonUtil.split(ConfigUtil.getProperty("jdbc.multipleDatasource"), ConfigUtil.getProperty("delimiter.data"));
%>
<%/************************************************************************************************
* HTML
************************************************************************************************/%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="icon" type="image/png" href="<mc:cp key="imgIcon"/>/faviconPerci.png">
<title><mc:msg key="main.system.title"/></title>
<%/************************************************************************************************
* Stylesheet & Javascript
************************************************************************************************/%>
<%@ include file="/shared/page/incCssJs.jsp"%>
<style type="text/css">
</style>
<script type="text/javascript" src="<mc:cp key="viewPageJsName"/>"></script>
<script type="text/javascript">
</script>
</head>
<%/************************************************************************************************
* Page & Header
************************************************************************************************/%>
<body>
<form id="fmDefault" name="fmDefault" method="post" action="">
<div id="divHeaderHolder" class="ui-layout-north"><%@ include file="/project/common/include/header.jsp"%></div>
<div id="divBodyHolder" class="ui-layout-center">
<div id="divBodyLeft" class="ui-layout-west"><%@ include file="/project/common/include/bodyLeft.jsp"%></div>
<div id="divBodyCenter" class="ui-layout-center">
<div id="divFixedPanel">
<div id="divLocationPathArea"><%@ include file="/project/common/include/bodyLocationPathArea.jsp"%></div>
<%/************************************************************************************************
* Real Contents - fixed panel(tab, button, search, information)
************************************************************************************************/%>
<div id="divTabArea"></div>
<div id="divButtonArea" class="areaContainer">
	<div id="divButtonAreaLeft"></div>
	<div id="divButtonAreaRight">
		<ui:buttonGroup id="buttonGroup">
			<ui:button id="btnKillSessions" caption="Kill Sessions" iconClass="fa-chain-broken"/>
			<ui:button id="btnStartChecking" caption="Start Checking"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea" class="areaContainer">
	<table class="tblSearch">
		<caption><mc:msg key="page.com.searchCriteria"/></caption>
		<colgroup>
			<col width="5%"/>
			<col width="*"/>
		</colgroup>
		<tr>
			<th class="thSearch rt">Data Source</th>
			<td class="tdSearch">
				<ui:select name="dataSource" options="mandatory">
<%
				for (int i=1; i<dataSourceNames.length; i++) {
%>
					<option value="<%=dataSourceNames[i]%>"><%=dataSourceNames[i]%></option>
<%
				}
%>
				</ui:select>
			</td>
		</tr>
	</table>
</div>
<div id="divInformArea">
</div>
<%/************************************************************************************************
* End of fixed panel
************************************************************************************************/%>
<div class="breaker"></div>
</div>
<div id="divScrollablePanel">
<%/************************************************************************************************
* Real Contents - scrollable panel(data, paging)
************************************************************************************************/%>
<div id="divDataArea" class="areaContainer">
	<table id="tblGrid" class="tblGrid sort autosort">
		<colgroup>
			<col width="2%"/>
			<col width="4%"/>
			<col width="5%"/>
			<col width="9%"/>
			<col width="9%"/>
			<col width="14%"/>
			<col width="7%"/>
			<col width="*"/>
			<col width="9%"/>
			<col width="6%"/>
			<col width="9%"/>
		</colgroup>
		<thead>
			<tr>
				<th class="thGrid"><ui:icon id="icnCheck" useFor="checkGrid" title="Select To Kill"/></th>
				<th class="thGrid sortable:numeric">SID</th>
				<th class="thGrid sortable:numeric">Serial No</th>
				<th class="thGrid">SQL Id</th>
				<th class="thGrid">Command</th>
				<th class="thGrid sortable:alphanumeric">User Name</th>
				<th class="thGrid sortable:alphanumeric">OS User</th>
				<th class="thGrid sortable:alphanumeric">Machine</th>
				<th class="thGrid">Module</th>
				<th class="thGrid sortable:alphanumeric">Status</th>
				<th class="thGrid">Logon Time</th>
			</tr>
		</thead>
		<tbody id="tblGridBody">
			<tr>
				<td class="tdGrid Ct" colspan="11"><mc:msg key="I002"/></td>
			</tr>
		</tbody>
	</table>
</div>
<div id="divPagingArea" class="areaContainer"></div>
<%/************************************************************************************************
* Right & Footer
************************************************************************************************/%>
</div>
</div>
<div id="divBodyRight" class="ui-layout-east"><%@ include file="/project/common/include/bodyRight.jsp"%></div>
</div>
<div id="divFooterHolder" class="ui-layout-south"><%@ include file="/project/common/include/footer.jsp"%></div>
<%/************************************************************************************************
* Additional Elements
************************************************************************************************/%>
</form>
<%/************************************************************************************************
* Additional Form
************************************************************************************************/%>
<form id="fmHidden" name="fmHidden" method="post" action=""></form>
</body>
</html>