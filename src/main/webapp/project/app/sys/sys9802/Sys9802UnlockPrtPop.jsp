<%/************************************************************************************************
* Description - Sys9802 - Assignment
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	DataSet requestDataSet = (DataSet)paramEntity.getRequestDataSet();
	DataSet prtSetup = (DataSet)paramEntity.getObject("prtSetup");
	String mode = requestDataSet.getValue("mode");
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
var mode = "<%=mode%>";
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
			<ui:button id="btnUnlock" caption="sys9802.button.unlock" iconClass="fa-unlock-alt"/>
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
	<table id="tblGrid" class="tblGrid sort autosort">
		<colgroup>
			<col width="2%"/>
			<col width="3%"/>
			<col width="12%"/>
			<col width="6%"/>
			<col width="5%"/>
			<col width="4%"/>
			<col width="9%"/>
			<col width="9%"/>
			<col width="*"/>
			<col width="5%"/>
			<col width="10%"/>
			<col width="15%"/>
			<col width="5%"/>
		</colgroup>
		<thead id="tblGridHead">
			<tr>
				<th class="thGrid"><ui:icon id="icnCheck" className="fa-check-square-o fa-lg"/></th>
				<th class="thGrid">Asg Id</th>
				<th class="thGrid">Assignment Number</th>
				<th class="thGrid caution">Last Invoiced</th>
				<th class="thGrid caution">Last Paid</th>
				<th class="thGrid">PRT Id</th>
				<th class="thGrid">PRT Status</th>
				<th class="thGrid">PRT Working State</th>
				<th class="thGrid">PRT Organisation</th>
				<th class="thGrid">Percentage</th>
				<th class="thGrid">Created By</th>
				<th class="thGrid">PRT Scenario</th>
				<th class="thGrid">Created Date</th>
			</tr>
		</thead>
		<tbody id="tblGridBody">
<%
		if (prtSetup.getRowCnt() > 0) {
			for (int i=0; i<prtSetup.getRowCnt(); i++) {
%>
			<tr>
				<td class="tdGrid Ct"><input type="checkbox" id="" name="chkForAction" class="chkEn inTblGrid" value="<%=prtSetup.getValue(i, "ASSIGNMENT_ID")%>"/></td>
				<td class="tdGrid Ct"><%=prtSetup.getValue(i, "ASSIGNMENT_ID")%></td>
				<td class="tdGrid Lt"><%=prtSetup.getValue(i, "ASSIGNMENT_NUMBER")%></td>
				<td class="tdGrid Ct"><%=prtSetup.getValue(i, "LAST_INVOICE_DATE")%></td>
				<td class="tdGrid Ct"><%=prtSetup.getValue(i, "LAST_PAID_DATE")%></td>
				<td class="tdGrid Ct"><%=prtSetup.getValue(i, "PRT_ASSIGNMENT_SETUP_ID")%></td>
				<td class="tdGrid Lt"><%=prtSetup.getValue(i, "PRT_STATUS_MEANING")%></td>
				<td class="tdGrid Lt"><%=prtSetup.getValue(i, "PRT_WORKING_STATE_MEANING")%></td>
				<td class="tdGrid Lt"><%=prtSetup.getValue(i, "PRT_ORGANISATION")%></td>
				<td class="tdGrid Rt"><%=CommonUtil.getNumberMask(prtSetup.getValue(i, "PRT_PERCENTAGE"), "#,##0.00")%></td>
				<td class="tdGrid Lt"><%=prtSetup.getValue(i, "CREATED_BY_NAME")%></td>
				<td class="tdGrid Lt"><%=prtSetup.getValue(i, "PRT_SCENARIO")%></td>
				<td class="tdGrid Ct"><%=prtSetup.getValue(i, "CREATION_DATE")%></td>
			</tr>
<%
			}
		} else {
%>
			<tr>
				<td class="tdGrid Ct" colspan="13"><mc:msg key="I001"/></td>
			</tr>
<%
		}
%>
		</tbody>
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