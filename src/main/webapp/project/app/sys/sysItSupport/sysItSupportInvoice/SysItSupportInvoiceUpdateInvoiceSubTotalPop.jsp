<%/************************************************************************************************
* Description - SysItSupportInvoice - Invoice
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	DataSet requestDataSet = (DataSet)paramEntity.getRequestDataSet();
	HpInvoice invoice = (HpInvoice)paramEntity.getObject("invoice");
	String mode = requestDataSet.getValue("mode");
	double gstAmount = invoice.getGstAmount();
	double invoiceAmount = invoice.getInvoiceAmount();
	double subTotal = (invoiceAmount - gstAmount);
	String dateFormat = ConfigUtil.getProperty("format.date.java");
	String numberFormat = "#,##0.#####";
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
var invoiceId = "<%=requestDataSet.getValue("invoiceId")%>";
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
			<ui:button id="btnSave" caption="button.com.save"/>
			<ui:button id="btnClose" caption="button.com.close"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea"></div>
<div id="divInformArea" class="areaContainerPopup">
	<table class="tblInform">
		<caption class="captionInform">Invoice Information</caption>
		<colgroup>
			<col width="18%"/>
			<col width="20%"/>
			<col width="25%"/>
			<col width="*"/>
		</colgroup>
		<tr>
			<th class="thInform Rt">Invoice Id</th>
			<td class="tdInform"><%=CommonUtil.getNumberMask(invoice.getInvoiceId(), "####")%></td>
			<th class="thInform Rt">Invoice Date</th>
			<td class="tdInform"><%=CommonUtil.toString(invoice.getInvoiceDate(), dateFormat)%></td>
		</tr>
	</table>
</div>
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
		<caption class="captionDefault">GST Amount</caption>
		<colgroup>
			<col width="25%"/>
			<col width="25%"/>
			<col width="25%"/>
			<col width="*"/>
		</colgroup>
		<tr>
			<th class="thEdit Ct">From</th>
			<th class="thEdit Ct mandatory">To</th>
			<th class="thEdit Ct">Invoice Amount</th>
			<th class="thEdit Ct">Total</th>
		</tr>
		<tr>
			<td class="tdEdit Ct"><ui:text name="gstAmountFrom" value="<%=CommonUtil.getNumberMask(gstAmount, numberFormat)%>" className="ct" status="display"/></td>
			<td class="tdEdit Ct"><ui:text name="gstAmountTo" className="ct" options="mandatory" option="numeric"/></td>
			<td class="tdEdit Ct"><ui:text name="invoiceAmount" value="<%=CommonUtil.getNumberMask(invoiceAmount, numberFormat)%>" className="ct" status="display"/></td>
			<td class="tdEdit Ct"><ui:text name="total" value="<%=CommonUtil.getNumberMask(subTotal, numberFormat)%>" className="ct" status="display"/></td>
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