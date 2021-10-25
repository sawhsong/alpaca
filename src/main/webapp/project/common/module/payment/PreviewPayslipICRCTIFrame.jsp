<%/************************************************************************************************
* Description - PreviewPayslipRemittanceFrame - ICRCTI
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	DataSet dsRequest = (DataSet)paramEntity.getRequestDataSet();
	DataSet payslipMaster = (DataSet)paramEntity.getObject("payslipMaster");
	String orgLogoImgPath = ConfigUtil.getProperty("path.image.orgLogo");
	String orgLogoName = orgLogoImgPath+"/"+payslipMaster.getValue("LOGO_NAME");
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
.areaContainerFramePayslipPreview {margin:0px 0px 0px 0px;padding:0px 0px 0px 0px;}
.payslipPreviewSection {padding:4px 4px;border:1px solid #DDDDDD;}
</style>
<script type="text/javascript" src="<mc:cp key="viewPageJsName"/>"></script>
<script type="text/javascript">
var personId = "<%=dsRequest.getValue("personId")%>";
var paymentId = "<%=dsRequest.getValue("paymentId")%>";
var assignmentId = "<%=dsRequest.getValue("assignmentId")%>";
var paymentDate = "<%=payslipMaster.getValue("PAYMENT_DATE_FORMAT")%>";
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
<div id="divButtonArea">
	<div id="divButtonAreaLeft"></div>
	<div id="divButtonAreaRight"></div>
</div>
<div id="divSearchCriteriaArea"></div>
<div id="divInformArea"></div>
<%/************************************************************************************************
* End of fixed panel
************************************************************************************************/%>
<div class="breaker"></div>
</div>
<div id="divScrollablePanelFrame">
<%/************************************************************************************************
* Real Contents - scrollable panel(data, paging)
************************************************************************************************/%>
<div id="divDataArea" class="areaContainerFramePayslipPreview">
	<div style="font-weight:bold;font-size:16px;text-align:center;padding:4px 8px 10px 8px;">Recipient Created Tax Invoice</div>
	<div class="payslipPreviewSection">
		<div style="float:left;width:49%;"><img id="imgOrgLogo" src="<%=orgLogoName%>"/></div>
		<div style="float:right;width:50%">
			<table class="tblDefault withPadding">
				<colgroup>
					<col width="38%"/>
					<col width="*"/>
				</colgroup>
				<tr>
					<th class="thDefault Rt">Date</th>
					<td class="tdDefault"><%=payslipMaster.getValue("PAYMENT_CREATION_DATE_FORMAT")%></td>
				</tr>
				<tr>
					<th class="thDefault Rt">Invoice Number</th>
					<td class="tdDefault"><%=payslipMaster.getValue("PAYMENT_ID")%></td>
				</tr>
			</table>
		</div>
		<div class="breaker"></div>
	</div>
	<div class="verGap2"></div>
	<div class="payslipPreviewSection">
		<table class="tblDefault withPadding">
			<colgroup>
				<col width="10%"/>
				<col width="40%"/>
				<col width="10%"/>
				<col width="*"/>
			</colgroup>
			<tr>
				<th class="thDefault" colspan="2">From - Recipient</th>
				<th class="thDefault" colspan="2">To - Supplier</th>
			</tr>
			<tr>
				<th class="thDefault Rt">Name</th>
				<td class="tdDefault"><%=payslipMaster.getValue("RECIPIENT_ORG_NAME")%></td>
				<th class="thDefault Rt">Name</th>
				<td class="tdDefault"><%=payslipMaster.getValue("SUPPLIER_ORG_NAME")%></td>
			</tr>
			<tr>
				<th class="thDefault Rt">ABN</th>
				<td class="tdDefault"><%=payslipMaster.getValue("RECIPIENT_ORG_ABN")%></td>
				<th class="thDefault Rt">ABN</th>
				<td class="tdDefault"><%=payslipMaster.getValue("SUPPLIER_ORG_ABN")%></td>
			</tr>
			<tr>
				<th class="thDefault Rt"></th>
				<td class="tdDefault"></td>
				<th class="thDefault Rt">Consultant</th>
				<td class="tdDefault"><%=payslipMaster.getValue("PERSON_NAME_NUMBER")%></td>
			</tr>
			<tr>
				<th class="thDefault" colspan="2">Supplies Made by Supplier to Recipient</th>
				<th class="thDefault Rt">Period</th>
				<td class="tdDefault"><%=payslipMaster.getValue("PERIOD_START_FORMAT")%> - <%=payslipMaster.getValue("PERIOD_END_FORMAT")%></td>
			</tr>
		</table>
	</div>
	<div id="divEarning">
		<div class="verGap2"></div>
		<table id="tblEarning" class="tblGrid sort autosort">
			<colgroup>
				<col width="*"></col>
				<col width="14%"></col>
				<col width="14%"></col>
				<col width="14%"></col>
			</colgroup>
			<thead>
				<tr class="noStripe">
					<th class="thGrid">Description of taxable supplies</th>
					<th class="thGrid">Units</th>
					<th class="thGrid">Rate</th>
					<th class="thGrid">Amount</th>
				</tr>
			</thead>
			<tbody id="tbodyEarning">
				<tr class="noStripe">
					<td class="tdGrid Ct" colspan="4"><mc:msg key="I001"/></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div id="divICRCTIValues">
		<div class="verGap2"></div>
		<table id="tblICRCTIValues" class="tblDefault withPadding">
			<colgroup>
				<col width="*"></col>
				<col width="14%"></col>
			</colgroup>
			<tr>
				<th class="thDefault Rt">Deductions</th>
				<td class="tdDefault Rt" id="tdDeductions"></td>
			</tr>
			<tr>
				<th class="thDefault Rt">Sub-Total (Excludes GST)</th>
				<td class="tdDefault Rt" id="tdSubTotal"></td>
			</tr>
			<tr>
				<th class="thDefault Rt">GST</th>
				<td class="tdDefault Rt" id="tdGST"></td>
			</tr>
			<tr>
				<th class="thDefault Rt">Total (Includes GST)</th>
				<td class="tdDefault Rt" id="tdTotal"></td>
			</tr>
		</table>
	</div>
	<div class="verGap20"></div>
	The GST shown will form part of the total GST payable by the supplier on the business activity statement (BAS) for the relevant tax period.
	<div class="verGap20"></div>
	<div style="font-weight:bold;font-size:12px;border:0px;">Written Agreement</div>
	<div class="verGap6"></div>
	The recipient and the supplier declare that this agreement relates to the above supplies.
	<br/>
	The recipient will issue tax invoices in respect of these supplies.
	<br/>
	The supplier will not issue tax invoices in respect of these supplies.
	<br/>
	The supplier acknowledges that it is registered for GST and that it will notify the recipient if it ceases to be registered.
	<br/>
	<br/>
	* The recipient acknowledges that it is registered for GST and that it will notify the supplier if it ceases to be registered. Acceptance of this recipient created tax invoice (RCTI) constitues acceptance of the terms of this written agreement. Both parties to this supply agree that they are parties to an RCTI agreement as outlined in GSTS 2000/10. The supplier agrees to notify the recipient if the supplier does not wish to accept the proposed agreement.
	<br/>
	<br/>
	* This sentence will not apply if the supplier is not registered for GST.
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