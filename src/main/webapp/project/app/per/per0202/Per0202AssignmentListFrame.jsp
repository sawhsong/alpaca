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
			<ui:button id="btnSearch" caption="button.com.search" iconClass="fa-search"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea"></div>
<div id="divInformArea" class="areaContainerFrame">
	<div id="divPersonHeader" class="alert alert-info"><%=person.getFullName()%> (<%=person.getPersonNumber()%>) <%=person.getPersonType()%></div>
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
	<div id="divGridWrapper">
		<table id="tblGrid" class="tblGrid sort autosort" style="width:3000px">
			<colgroup>
				<col width="2%"/>
				<col width="3%"/>
				<col width="10%"/>
				<col width="12%"/>
				<col width="3%"/>
				<col width="4%"/>
				<col width="4%"/>
				<col width="4%"/>
				<col width="*"/>
				<col width="14%"/>
				<col width="3%"/>
				<col width="3%"/>
				<col width="4%"/>
				<col width="4%"/>
				<col width="7%"/>
				<col width="8%"/>
			</colgroup>
			<thead>
				<tr>
					<th class="thGrid"><ui:icon className="fa-magic fa-lg"/></th>
					<th class="thGrid sortable:alphanumeric">Asg Id</th>
					<th class="thGrid sortable:alphanumeric">Asg Number</th>
					<th class="thGrid sortable:alphanumeric">Person Name</th>
					<th class="thGrid">Is Active</th>
					<th class="thGrid">Is Preferred</th>
					<th class="thGrid sortable:date">Asg Start Date</th>
					<th class="thGrid sortable:date">Asg End Date</th>
					<th class="thGrid sortable:alphanumeric">Billing Org</th>
					<th class="thGrid sortable:alphanumeric">End User Org</th>
					<th class="thGrid">Has PRT</th>
					<th class="thGrid">Has WC</th>
					<th class="thGrid">Last Invoice</th>
					<th class="thGrid">Last Paid</th>
					<th class="thGrid">Working State</th>
					<th class="thGrid">Payment Method</th>
				</tr>
			</thead>
			<tbody id="tblGridBody">
				<tr>
					<td class="tdGrid Ct" colspan="16"><mc:msg key="I002"/></td>
				</tr>
			</tbody>
		</table>
	</div>
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