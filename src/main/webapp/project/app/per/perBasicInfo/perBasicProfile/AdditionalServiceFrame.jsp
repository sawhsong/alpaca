<%/************************************************************************************************
* Description - PerBasicProfile - Person Profile (Old Type)
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	DataSet dsRequest = paramEntity.getRequestDataSet();
	HpPersonD person = (HpPersonD)session.getAttribute("HpPersonDQuickSearch");
	String personId = dsRequest.getValue("personId");
%>
<%/************************************************************************************************
* HTML
************************************************************************************************/%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="icon" type="image/png" href="<mc:cp key="imgIcon"/>/faviconPerci.png">
<%/************************************************************************************************
* Stylesheet & Javascript
************************************************************************************************/%>
<%@ include file="/shared/page/incCssJs.jsp"%>
<style type="text/css">
</style>
<script type="text/javascript" src="<mc:cp key="viewPageJsName"/>"></script>
<script type="text/javascript">
var personId = "<%=personId%>";
</script>
</head>
<%/************************************************************************************************
* Page & Header
************************************************************************************************/%>
<body class="bodyFrame">
<form id="fmDefault" name="fmDefault" method="post" action="">
<div id="divFrameWindowHolder">
<div id="divFixedPanelFrame">
<%/************************************************************************************************
* Real Contents - fixed panel(tab, button, search, information)
************************************************************************************************/%>
<div id="divTabArea"></div>
<div id="divButtonArea" class="areaContainerFrame">
	<div id="divButtonAreaLeft"></div>
	<div id="divButtonAreaRight">
		<ui:buttonGroup id="buttonGroup">
			<ui:button id="btnAdd" caption="button.com.add"/>
			<ui:button id="btnDelete" caption="button.com.delete"/>
			<ui:button id="btnSearch" caption="button.com.search"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea"></div>
<div id="divInformArea" class="areaContainerFrame">
	<div id="divPersonHeader" class="alert alert-info personInfoHeader"><%=person.getFullName()%> (<%=person.getPersonNumber()%>) <%=person.getPersonType()%></div>
</div>
<%/************************************************************************************************
* End of fixed panel
************************************************************************************************/%>
<div class="breaker"></div>
</div>
<div id="divScrollablePanelFrame">
<%/************************************************************************************************
* Real Contents - scrollable panel(data, paging)
************************************************************************************************/%>
<div id="divDataArea" class="areaContainerFrame">
	<table id="tblGrid" class="tblGrid sort autosort">
		<colgroup>
			<col width="2%"></col>
			<col width="2%"></col>
			<col width="22%"></col>
			<col width="7%"></col>
			<col width="22%"></col>
			<col width="*"></col>
			<col width="7%"></col>
		</colgroup>
		<thead>
			<tr>
				<th class="thGrid"><ui:icon useFor="actionHeaderGrid"/></th>
				<th class="thGrid"><ui:icon id="icnCheck" useFor="checkGrid"/></th>
				<th class="thGrid">Service Provider</th>
				<th class="thGrid">Referral Date</th>
				<th class="thGrid">Entity Employee</th>
				<th class="thGrid">Comments</th>
				<th class="thGrid">Created Date</th>
			</tr>
		</thead>
		<tbody id="tblGridBody">
			<tr>
				<td class="tdGrid Ct" colspan="7"><mc:msg key="I002"/></td>
			</tr>
		</tbody>
	</table>
</div>
<div id="divPagingArea" class="areaContainerFrame"></div>
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