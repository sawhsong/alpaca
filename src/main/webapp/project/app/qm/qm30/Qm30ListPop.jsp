<%/************************************************************************************************
* Description - Qm30 - Find Organisation
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
	<table class="tblSearch withPadding">
		<colgroup>
			<col width="12%"/>
			<col width="15%"/>
			<col width="13%"/>
			<col width="15%"/>
			<col width="10%"/>
			<col width="15%"/>
			<col width="8%"/>
			<col width="*"/>
		</colgroup>
		<tr>
			<th class="thSearch rt">Organisation equals</th>
			<td class="tdSearch"><ui:hidden name="orgId"/><ui:text name="orgEquals" style="width:95%"/></td>
			<th class="thSearch rt">Organisation like</th>
			<td class="tdSearch"><ui:text name="orgLike" style="width:95%"/></td>
			<th class="thSearch rt"><mc:msg key="qm.search.orgType"/></th>
			<td class="tdSearch"><ui:ccselect name="orgType" caption="==Select==" codeType="ORGANISATION_TYPES"/></td>
			<th class="thSearch rt"><mc:msg key="qm.search.orgState"/></th>
			<td class="tdSearch"><ui:ccselect name="orgState" caption="==Select==" codeType="STATES"/></td>
		</tr>
		<tr>
			<th class="thSearch rt"><mc:msg key="qm.search.csc"/></th>
			<td class="tdSearch">
				<ui:hidden name="cscId"/>
				<ui:text name="cscName" className="hor" style="width:95%"/>
<%-- 				<ui:icon id="icnCscSearch" className="fa-search hor"/> --%>
			</td>
			<th class="thSearch rt"><mc:msg key="qm.search.crm"/></th>
			<td class="tdSearch">
				<ui:hidden name="crmId"/>
				<ui:text name="crmName" className="hor" style="width:95%"/>
<%-- 				<ui:icon id="icnCrmSearch" className="fa-search hor"/> --%>
			</td>
			<th class="thSearch rt"><mc:msg key="qm.search.orgCountry"/></th>
			<td class="tdSearch"><ui:text name="orgCountryName" className="hor" style="width:95%"/></td>
			<th class="thSearch rt"></th>
			<td class="tdSearch"></td>
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
		<table id="tblGrid" class="tblGrid sort autosort" style="width:4000px">
			<colgroup>
				<col width="2%"/>
				<col width="2%"/>
				<col width="2%"/>
				<col width="*"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="3%"/>
				<col width="3%"/>
				<col width="5%"/>
				<col width="4%"/>
				<col width="10%"/>
				<col width="5%"/>
				<col width="6%"/>
				<col width="7%"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="5%"/>
				<col width="5%"/>
				<col width="6%"/>
			</colgroup>
			<thead>
				<tr>
					<th class="thGrid"><ui:icon useFor="actionHeaderGrid"/></th>
					<th class="thGrid"><ui:icon id="icnRdo" useFor="radioGrid" status="display"/></th>
					<th class="thGrid sortable:numeric"><mc:msg key="qm.grid.id"/></th>
					<th class="thGrid sortable:alphanumeric"><mc:msg key="qm.grid.orgName"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.orgType"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.orgRelationship"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.abn"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.acn"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.orgState"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.orgCountry"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.address"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.firstContactDate"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.cscName"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.crmName"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.csmName"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.cadName"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.csaName"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.orgCategory"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.orgStream"/></th>
					<th class="thGrid"><mc:msg key="qm.grid.orgInvoiceType"/></th>
				</tr>
			</thead>
			<tbody id="tblGridBody">
				<tr>
					<td class="tdGrid Ct" colspan="20"><mc:msg key="I002"/></td>
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