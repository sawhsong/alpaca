<%/************************************************************************************************
* Description - Per0202 - Person Profile
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
#divPersonHeader {padding:8px;margin-bottom:0px;font-weight:bold;}
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
			<ui:button id="btnNew" caption="New Document" iconClass="fa-plus"/>
			<ui:button id="btnSearch" caption="button.com.search" iconClass="fa-search"/>
			<ui:button id="btnClear" caption="button.com.clear" iconClass="fa-refresh"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divInformArea" class="areaContainerFrame">
	<div id="divPersonHeader" class="alert alert-info"><%=person.getFullName()%> (<%=person.getPersonNumber()%>) <%=person.getPersonType()%></div>
</div>
<div id="divSearchCriteriaArea" class="areaContainerFrame">
	<div class="panel panel-default">
		<div class="panel-body">
			<table class="tblDefault withPadding">
				<colgroup>
					<col width="5%"/>
					<col width="*"/>
				</colgroup>
				<tr>
					<th class="thDefault rt">Status</th>
					<td class="tdDefault">
						<ui:select id="status" name="status">
							<ui:seloption value="Y" text="Active"/>
							<ui:seloption value="N" text="Inactive"/>
							<ui:seloption value="" text="All"/>
						</ui:select>
					</td>
				</tr>
			</table>
		</div>
	</div>
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
			<col width="17%"/>
			<col width="17%"/>
			<col width="*"/>
			<col width="16%"/>
			<col width="11%"/>
			<col width="5%"/>
			<col width="4%"/>
			<col width="7%"/>
			<col width="4%"/>
		</colgroup>
		<thead>
			<tr>
				<th class="thGrid">Document Name</th>
				<th class="thGrid">Copy To Organisation</th>
				<th class="thGrid">Description</th>
				<th class="thGrid">Received</th>
				<th class="thGrid">Opportunity / Assignment</th>
				<th class="thGrid">Expiry Date</th>
				<th class="thGrid">Acive</th>
				<th class="thGrid">Available on EO</th>
				<th class="thGrid"><mc:msg key="page.com.action"/></th>
			</tr>
		</thead>
		<tbody id="tblGridBody">
			<tr>
				<td class="tdGrid Ct" colspan="9"><mc:msg key="I002"/></td>
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