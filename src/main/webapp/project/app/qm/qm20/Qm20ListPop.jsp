<%/************************************************************************************************
* Description - Qm20 - Find Person
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
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
			<ui:button id="btnSave" caption="qm.button.saveToSession" iconClass="fa-save"/>
			<ui:button id="btnSearch" caption="button.com.search" iconClass="fa-search"/>
			<ui:button id="btnClear" caption="button.com.clear" iconClass="fa-refresh"/>
			<ui:button id="btnClose" caption="button.com.close" iconClass="fa-times"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea" class="areaContainerPopup">
	<table class="tblSearch">
		<caption><mc:msg key="page.com.searchCriteria"/></caption>
		<colgroup>
			<col width="8%"/>
			<col width="19%"/>
			<col width="6%"/>
			<col width="19%"/>
			<col width="7%"/>
			<col width="19%"/>
			<col width="7%"/>
			<col width="*"/>
		</colgroup>
		<tr>
			<th class="thSearch rt">Person equals</th>
			<td class="tdSearch"><ui:hidden name="personId"/><ui:text name="personEquals" style="width:95%"/></td>
			<th class="thSearch rt">Person like</th>
			<td class="tdSearch"><ui:text name="personLike" style="width:95%"/></td>
			<th class="thSearch rt">Person Id like</th>
			<td class="tdSearch"><ui:text name="personIdLike" style="width:95%"/></td>
			<th class="thSearch rt"></th>
			<td class="tdSearch"></td>
		</tr>
		<tr>
			<th class="thSearch rt"><mc:msg key="qm.search.empOrg"/></th>
			<td class="tdSearch">
				<ui:hidden name="empOrgId"/>
				<ui:text name="empOrgName" className="hor" style="width:95%"/>
<%-- 				<ui:icon id="icnEmpOrgSearch" className="fa-search hor"/> --%>
			</td>
			<th class="thSearch rt"><mc:msg key="qm.search.personType"/></th>
			<td class="tdSearch"><ui:ccselect name="personType" codeType="PERSON_TYPES" isMultiple="true" attribute="data-size:20;data-width:291px"/></td>
			<th class="thSearch rt"><mc:msg key="qm.search.personEmail"/></th>
			<td class="tdSearch"><ui:text name="email" style="width:95%"/></td>
			<th class="thSearch rt"><mc:msg key="per0202.search.mobile"/></th>
			<td class="tdSearch"><ui:text name="mobile" style="width:100%"/></td>
		</tr>
	</table>
</div>
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
	<div id="divGridWrapper">
		<table id="tblGrid" class="tblGrid sort autosort" style="width:3400px">
			<colgroup>
				<col width="1%"/>
				<col width="3%"/>
				<col width="3%"/>
				<col width="7%"/>
				<col width="7%"/>
				<col width="4%"/>
				<col width="4%"/>
				<col width="9%"/>
				<col width="9%"/>
				<col width="4%"/>
				<col width="3%"/>
				<col width="10%"/>
				<col width="*"/>
				<col width="6%"/>
				<col width="11%"/>
				<col width="4%"/>
				<col width="4%"/>
				<col width="2%"/>
			</colgroup>
			<thead>
				<tr>
					<th class="thGrid"><ui:icon id="icnRdo" className="fa-dot-circle-o fa-lg" status="display"/></th>
					<th class="thGrid sortable:numeric"><mc:msg key="qm.grid.id"/></th>
					<th class="thGrid sortable:numeric"><mc:msg key="qm.grid.number"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.surname"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.firstName"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.mobile"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.userName"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.userEmail"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.payslipEmail"/></th>
					<th class="thGrid sortable:date"><mc:msg key="qm.grid.memberSince"/></th>
					<th class="thGrid sortable:date"><mc:msg key="qm.grid.dateOfBirth"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.personType"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.empOrg"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.securityRole"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.currBillingOrg"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.asgCount"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.paymentCount"/></th>
					<th class="thGrid"><mc:msg key="page.com.action"/></th>
				</tr>
			</thead>
			<tbody id="tblGridBody">
				<tr>
					<td class="tdGrid Ct" colspan="18"><mc:msg key="I002"/></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<div id="divPagingArea" class="areaContainerPopup"></div>
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