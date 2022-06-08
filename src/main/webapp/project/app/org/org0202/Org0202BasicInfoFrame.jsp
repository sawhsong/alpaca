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
	DataSet dsRequest = (DataSet)paramEntity.getRequestDataSet();
	HpOrganisationD hpOrganisationD = (HpOrganisationD)paramEntity.getObject("hpOrganisationD");
	DataSet role = CommonCodeManager.getCodeDataSetByCodeType("ORGANISATION_ROLE");
	DataSet relationship = CommonCodeManager.getCodeDataSetByCodeType("ORGANISATION_RELATIONSHIP");
	DataSet product = CommonCodeManager.getCodeDataSetByCodeType("ORGANISATION_PRODUCT");
	String organisationId = dsRequest.getValue("organisationId");
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
#divOrganisationHeader {padding:8px;margin-bottom:0px;font-weight:bold;}
</style>
<script type="text/javascript" src="<mc:cp key="viewPageJsName"/>"></script>
<script type="text/javascript">
var organisationId = "<%=organisationId%>";
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
			<ui:button id="btnNew" caption="button.com.new" iconClass="fa-plus-square"/>
			<ui:button id="btnSave" caption="button.com.save" iconClass="fa-save"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea">
</div>
<div id="divInformArea" class="areaContainerFrame">
	<div id="divOrganisationHeader" class="alert alert-info"><%=hpOrganisationD.getOrganisationName()%> (<%=organisationId%>)</div>
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
	<div id="divFrameDataAreaWrapper">
		<div id="divLeft" class="accordion" style="width:33%;float:left">
			<div class="accordionGroup">
				<h3>Organisation Details</h3>
				<div id="divOrganisationDetails" class="accordionContents">
					<table id="tblOrganisationDetails" class="tblEdit">
						<colgroup>
							<col width="35%"/>
							<col width="65%"/>
						</colgroup>
						<tbody>
							<tr>
								<th class="thEdit rt mandatory">Organisation Id</th>
								<td class="tdEdit"><ui:text name="organisationId" status="disabled"/></td>
							</tr>
							<tr>
								<th class="thEdit rt mandatory">Organisation Name</th>
								<td class="tdEdit"><ui:text name="organisationName" options="mandatory" checkName="Organisation Name"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Role</th>
								<td class="tdEdit"><%=role.getAsHtmlStringForSelectbox("CODE_MEANING", "CODE_MEANING", "", "", "id:role;name:role;class:bootstrapSelect;multiple:multiple;data-width:330px")%></td>
							</tr>
							<tr>
								<th class="thEdit rt mandatory">Relationship</th>
								<td class="tdEdit"><%=relationship.getAsHtmlStringForSelectbox("CODE_MEANING", "CODE_MEANING", "", "", "id:relationship;name:relationship;class:bootstrapSelect;multiple:multiple;data-width:330px;options:mandatory;checkName:Relationship")%></td>
							</tr>
							<tr>
								<th class="thEdit rt">Jurisdiction</th>
								<td class="tdEdit"><ui:hidden name="jurisdictionId"/><ui:text name="jurisdictionName"/></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="accordionGroup">
				<h3>Company Details</h3>
				<div id="divCompanyDetails" class="accordionContents">
					<table id="tblCompanyDetails" class="tblEdit">
						<colgroup>
							<col width="35%"/>
							<col width="65%"/>
						</colgroup>
						<tbody>
							<tr>
								<th class="thEdit rt mandatory">ABN</th>
								<td class="tdEdit"><ui:text name="abn" options="mandatory" checkName="ABN"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Company Number</th>
								<td class="tdEdit"><ui:text name="acn"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Tax Invoice Acceptance</th>
								<td class="tdEdit"><ui:ccselect name="taxInvoiceAcceptanceType" codeType="TAX_INVOICE_ACCEPTANCE_TYPE" caption="==Select=="/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Registered for GST(AU/NZ)</th>
								<td class="tdEdit"><ui:ccradio name="gstReg" codeType="SIMPLE_YN" isCustomised="true"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">NZ GST Number</th>
								<td class="tdEdit"><ui:text name="gstNumber"/></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="accordionGroup">
				<h3>STP Details</h3>
				<div id="divStpDetails" class="accordionContents">
					<table id="tblStpDetails" class="tblEdit">
						<colgroup>
							<col width="35%"/>
							<col width="65%"/>
						</colgroup>
						<tbody>
							<tr>
								<th class="thEdit rt">STP Signatory</th>
								<td class="tdEdit"><ui:hidden name="authorizedPersonId"/><ui:text name="authorizedPersonName"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">STP BMS Id</th>
								<td class="tdEdit"><ui:text name="stpBmsId" status="disabled"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">STP Branch Number</th>
								<td class="tdEdit"><ui:text name="branchNumber"/></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div id="divRight" class="accordion" style="width:66%;float:right">
			<div class="accordionGroup" style="width:42%;float:left;">
				<h3>Customer Details</h3>
				<div id="divCustomerDetails" class="accordionContents">
					<table id="tblCustomerDetails" class="tblEdit">
						<colgroup>
							<col width="35%"/>
							<col width="65%"/>
						</colgroup>
						<tbody>
							<tr>
								<th class="thEdit rt">Product</th>
								<td class="tdEdit"><%=product.getAsHtmlStringForSelectbox("CODE_MEANING", "CODE_MEANING", "", "", "id:product;name:product;class:bootstrapSelect;multiple:multiple;data-width:280px;options:mandatory;checkName:Product")%></td>
							</tr>
							<tr>
								<th class="thEdit rt">Customer Type</th>
								<td class="tdEdit"><ui:ccselect name="customerType" codeType="ORGANISATION_CUSTOMER_TYPE" caption="==Select=="/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Customer Category</th>
								<td class="tdEdit"><ui:ccselect name="customerCategory" codeType="CUSTOMER_CATEGORY" caption="==Select=="/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Swim Lane</th>
								<td class="tdEdit"><ui:ccselect name="swimLane" codeType="SWIM_LANE" caption="==Select=="/></td>
							</tr>
							<tr>
								<th class="thEdit rt">MSA Execution Date</th>
								<td class="tdEdit"><ui:text name="msaExecutionDate" className="Ct hor" style="width:100px" option="date"/><ui:icon id="icnMsaExecutionDate" className="fa-calendar hor"/></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="accordionGroup" style="width:57%;float:right;">
				<h3>Entity Relationship / Internal Details</h3>
				<div id="divRelationshipInternalDetails" class="accordionContents">
					<table id="tblRelationshipInternalDetails" class="tblEdit">
						<colgroup>
							<col width="35%"/>
							<col width="65%"/>
						</colgroup>
						<tbody>
							<tr>
								<th class="thEdit rt">Customer Account Director</th>
								<td class="tdEdit"><ui:hidden name="esBdManagerId"/><ui:text name="esBdManagerName"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Customer Delivery Manager</th>
								<td class="tdEdit"><ui:hidden name="esAccountManagerId"/><ui:text name="esAccountManagerName"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Executive Relationship</th>
								<td class="tdEdit"><ui:hidden name="esExecRelationshipId"/><ui:text name="esExecRelationshipName"/></td>
							</tr>
							<tr>
								<th class="thEdit rt mandatory">Customer Support Consultant</th>
								<td class="tdEdit"><ui:hidden name="esPayrollConsultantId"/><ui:text name="esPayrollConsultantName" options="mandatory" checkName="Customer Support Consultant"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Customer Support Administrator</th>
								<td class="tdEdit"><ui:hidden name="esCustomerAdministratorId"/><ui:text name="esCustomerAdministratorName"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Entity Staff Contact</th>
								<td class="tdEdit"><ui:hidden name="entityStaffContactId"/><ui:text name="entityStaffContactName"/></td>
							</tr>
							<tr>
								<th class="thEdit rt">Overview</th>
								<td class="tdEdit" colspan="3"><ui:txa id="organisationOverview" name="organisationOverview" style="height:84px;"/></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="breaker"></div>
			<div class="accordionGroup">
				<h3>Communication History - Latest 50</h3>
				<div id="divCommunicationHistory" class="accordionContents">
					<div class="divButtonArea">
						<div class="divButtonAreaLeft"></div>
						<div class="divButtonAreaRight">
							<ui:buttonGroup>
								<ui:button id="btnAddCommunication" caption="button.com.add" iconClass="fa-plus-square"/>
								<ui:button id="btnDownloadCommunication" caption="Download" iconClass="fa-download"/>
							</ui:buttonGroup>
						</div>
					</div>
					<div class="verGap4"></div>
					<div id="communicationHistory" style="padding:6px;height:290px;border:1px solid #cccccc;border-radius:3px;overflow:auto;"></div>
				</div>
			</div>
		</div>
	</div>
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