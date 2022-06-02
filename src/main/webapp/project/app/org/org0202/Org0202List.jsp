<%/************************************************************************************************
* Description - Org0202 - Organisation Profile
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	HpOrganisationD hpOrganisationD = (HpOrganisationD)session.getAttribute("HpOrganisationDQuickSearch");
	String organisationId = "", organisationNameToDisplay = "";
	if (hpOrganisationD != null) {
		organisationId = CommonUtil.toStringForId(hpOrganisationD.getOrganisationId());
		organisationNameToDisplay = hpOrganisationD.getOrganisationName()+" ("+organisationId+")";
	}
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
			<ui:button id="btnNew" caption="button.com.new" iconClass="fa-plus-square"/>
			<ui:button id="btnDelete" caption="button.com.delete" iconClass="fa-trash"/>
			<ui:button id="btnSearch" caption="button.com.search" iconClass="fa-search"/>
			<ui:button id="btnClear" caption="button.com.clear" iconClass="fa-refresh"/>
			<ui:button id="btnExport" caption="button.com.export" iconClass="fa-download"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea" class="areaContainer">
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
			<td class="tdSearch"><ui:hidden name="orgId" value="<%=organisationId%>"/><ui:text name="orgEquals" value="<%=organisationNameToDisplay%>" style="width:95%"/></td>
			<th class="thSearch rt">Organisation like</th>
			<td class="tdSearch"><ui:text name="orgLike" style="width:95%"/></td>
			<th class="thSearch rt">Organisation Type</th>
			<td class="tdSearch"><ui:ccselect name="orgType" caption="==Select==" codeType="ORGANISATION_TYPES"/></td>
			<th class="thSearch rt">State</th>
			<td class="tdSearch"><ui:ccselect name="orgState" caption="==Select==" codeType="STATES"/></td>
		</tr>
		<tr>
			<th class="thSearch rt">Customer Support Consultant</th>
			<td class="tdSearch"><ui:hidden name="cscId"/><ui:text name="cscName" className="hor" style="width:95%"/></td>
			<th class="thSearch rt">Customer Relationship Manager</th>
			<td class="tdSearch"><ui:hidden name="crmId"/><ui:text name="crmName" className="hor" style="width:95%"/></td>
			<th class="thSearch rt">Country</th>
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
<div id="divScrollablePanel">
<%/************************************************************************************************
* Real Contents - scrollable panel(data, paging)
************************************************************************************************/%>
<div id="divDataArea" class="areaContainer">
	<div id="divGridWrapper">
		<table id="tblGrid" class="tblGrid sort autosort" style="width:4000px">
			<colgroup>
				<col width="1%"/>
				<col width="2%"/>
				<col width="*"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="3%"/>
				<col width="3%"/>
				<col width="5%"/>
				<col width="4%"/>
				<col width="10%"/>
				<col width="4%"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="6%"/>
				<col width="5%"/>
				<col width="5%"/>
				<col width="6%"/>
			</colgroup>
			<thead>
				<tr>
					<th class="thGrid"><ui:icon id="icnCheck" useFor="checkGrid"/></th>
					<th class="thGrid sortable:numeric">Id</th>
					<th class="thGrid sortable:alphanumeric">Organisation Name</th>
					<th class="thGrid">Type</th>
					<th class="thGrid">Relationship</th>
					<th class="thGrid">ABN</th>
					<th class="thGrid">ACN</th>
					<th class="thGrid">State</th>
					<th class="thGrid">Country</th>
					<th class="thGrid">Address</th>
					<th class="thGrid">First Contact Date</th>
					<th class="thGrid">Customer Support Consultant</th>
					<th class="thGrid">Customer Relationship Manager</th>
					<th class="thGrid">Customer Support Manager</th>
					<th class="thGrid">Customer Account Director</th>
					<th class="thGrid">Customer Support Admin.</th>
					<th class="thGrid">Customer Category</th>
					<th class="thGrid">Customer Stream</th>
					<th class="thGrid">Invoice Acceptance Type</th>
				</tr>
			</thead>
			<tbody id="tblGridBody">
				<tr>
					<td class="tdGrid Ct" colspan="19"><mc:msg key="I002"/></td>
				</tr>
			</tbody>
		</table>
	</div>
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