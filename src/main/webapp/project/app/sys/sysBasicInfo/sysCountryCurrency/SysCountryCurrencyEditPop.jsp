<%/************************************************************************************************
* Description - SysCountryCurrency - Country / Currency
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity pe = (ParamEntity)request.getAttribute("paramEntity");
	DataSet dsRequest = (DataSet)pe.getRequestDataSet();
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
var countryCurrencyId = "<%=dsRequest.getValue("countryCurrencyId")%>";
</script>
</head>
<%/************************************************************************************************
* Page & Header
************************************************************************************************/%>
<body>
<form id="fmDefault" name="fmDefault" method="post" action="">
<div id="divPopupWindowHolder">
<div id="divFixedPanelPopup">
<div id="divLocationPathArea"><%@ include file="/project/common/include/bodyLocationPathArea.jsp"%></div>
<%/************************************************************************************************
* Real Contents - fixed panel(tab, button, search, information)
************************************************************************************************/%>
<div id="divTabArea"></div>
<div id="divButtonArea" class="areaContainerPopup">
	<div id="divButtonAreaLeft"></div>
	<div id="divButtonAreaRight">
		<ui:buttonGroup id="buttonGroup">
			<ui:button id="btnSave" caption="button.com.save" iconClass="fa-save"/>
			<ui:button id="btnClose" caption="button.com.close" iconClass="fa-times"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea"></div>
<div id="divInformArea"></div>
<%/************************************************************************************************
* End of fixed panel
************************************************************************************************/%>
<div class="breaker"></div>
</div>
<div id="divScrollablePanelPopup">
<%/************************************************************************************************
* Real Contents - scrollable panel(data, paging)
************************************************************************************************/%>
<div id="divDataArea" class="areaContainerPopup">
	<table class="tblEdit">
		<caption class="captionEdit">Currency Info</caption>
		<colgroup>
			<col width="15%"/>
			<col width="35%"/>
			<col width="15%"/>
			<col width="35%"/>
		</colgroup>
		<tr>
			<th class="thEdit Rt mandatory">Currency Name</th>
			<td class="tdEdit"><ui:text name="currencyName" checkName="Currency Name" options="mandatory"/></td>
			<th class="thEdit Rt">Currency Symbol</th>
			<td class="tdEdit"><ui:text name="currencySymbol" maxlength="10" checkName="Currency Symbol"/></td>
		</tr>
		<tr>
			<th class="thEdit Rt mandatory">Alphabetic Code</th>
			<td class="tdEdit"><ui:text name="currencyAlphabeticCode" maxlength="5" style="text-transform:uppercase;" checkName="Alphabetic Code" options="mandatory"/></td>
			<th class="thEdit Rt">Numeric Code</th>
			<td class="tdEdit"><ui:text name="currencyNumericCode" maxlength="5" checkName="Numeric Code"/></td>
		</tr>
	</table>
	<div class="horGap10"></div>
	<table class="tblEdit">
		<caption class="captionEdit">Country Info</caption>
		<colgroup>
			<col width="15%"/>
			<col width="35%"/>
			<col width="15%"/>
			<col width="35%"/>
		</colgroup>
		<tr>
			<th class="thEdit Rt mandatory">Country Name</th>
			<td class="tdEdit"><ui:text name="countryName" checkName="Country Name" options="mandatory"/></td>
			<th class="thEdit Rt">Language Code</th>
			<td class="tdEdit"><ui:text name="countryLanguageCode" maxlength="5" checkName="Language Code"/></td>
		</tr>
		<tr>
			<th class="thEdit Rt">Country Code 2</th>
			<td class="tdEdit"><ui:text name="countryCode2" maxlength="5" style="text-transform:uppercase;" checkName="Country Code 2"/></td>
			<th class="thEdit Rt">Country Code 3</th>
			<td class="tdEdit"><ui:text name="countryCode3" maxlength="5" style="text-transform:uppercase;" checkName="Country Code 3"/></td>
		</tr>
		<tr>
			<th class="thEdit Rt">Numeric Code</th>
			<td class="tdEdit"><ui:text name="countryNumericCode" maxlength="5" checkName="Country Numeric Code"/></td>
			<th class="thEdit Rt"></th>
			<td class="tdEdit"></td>
		</tr>
	</table>
</div>
<div id="divPagingArea"></div>
<%/************************************************************************************************
* Right & Footer
************************************************************************************************/%>
</div>
</div>
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