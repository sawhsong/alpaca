<%/************************************************************************************************
* Description
* - 
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity pe = (ParamEntity)request.getAttribute("paramEntity");
	DataSet dsRequest = (DataSet)pe.getRequestDataSet();
%>
<%/************************************************************************************************
* HTML
************************************************************************************************/%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="icon" type="image/png" href="<mc:cp key="imgIcon"/>/zebraFavicon.png">
<title><mc:msg key="fwk.main.system.title"/></title>
<%/************************************************************************************************
* Stylesheet & Javascript
************************************************************************************************/%>
<%@ include file="/shared/page/incCssJs.jsp"%>
<style type="text/css">
.thGrid {border-bottom:0px;}
.tblGrid tr:not(.default):not(.active):not(.info):not(.success):not(.warning):not(.danger):hover td {background:#FFFFFF;}
#liDummy {display:none;}
#divDataArea.areaContainerPopup {padding-top:0px;}
.dummyDetail {list-style:none;}
.dragHandler, .dragHandler > i {cursor:move;}
.deleteButton {cursor:pointer;}
</style>
<script type="text/javascript" src="<mc:cp key="viewPageJsName"/>"></script>
<script type="text/javascript">
var codeType = "<%=dsRequest.getValue("codeType")%>";
</script>
</head>
<%/************************************************************************************************
* Page & Header
************************************************************************************************/%>
<body>
<form id="fmDefault" name="fmDefault" method="post" action="">
<div id="divPopupWindowHolder">
<div id="divFixedPanelPopup">
<div id="divLocationPathArea"><%@ include file="/zebra/example/common/include/bodyLocationPathArea.jsp"%></div>
<%/************************************************************************************************
* Real Contents - fixed panel(tab, button, search, information)
************************************************************************************************/%>
<div id="divTabArea"></div>
<div id="divButtonArea" class="areaContainerPopup">
	<div id="divButtonAreaLeft"></div>
	<div id="divButtonAreaRight">
		<ui:buttonGroup id="buttonGroup">
			<ui:button id="btnSave" caption="button.com.save" iconClass="fa-save"/>
			<ui:button id="btnClose" caption="button.com.close" iconClass="fa-times"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divSearchCriteriaArea"></div>
<div id="divInformArea" class="areaContainerPopup">
	<table class="tblEdit">
		<colgroup>
			<col width="6%"/>
			<col width="18%"/>
			<col width="8%"/>
			<col width="20%"/>
			<col width="6%"/>
			<col width="7%"/>
			<col width="7%"/>
			<col width="*"/>
		</colgroup>
		<tr>
			<th class="thEdit Rt mandatory"><mc:msg key="fwk.commoncode.header.codeType"/></th>
			<td class="tdEdit"><ui:text name="codeTypeMaster" style="text-transform:uppercase;" checkName="fwk.commoncode.header.codeType" options="mandatory" status="disabled"/></td>
			<th class="thEdit Rt mandatory"><mc:msg key="fwk.commoncode.header.codeMeaning"/></th>
			<td class="tdEdit"><ui:text name="codeMeaningMaster" checkName="fwk.commoncode.header.codeMeaning" options="mandatory"/></td>
			<th class="thEdit Rt mandatory"><mc:msg key="fwk.commoncode.header.isActive"/></th>
			<td class="tdEdit ct"><ui:ccradio name="isActiveMaster" codeType="SIMPLE_YN" selectedValue="Y" source="framework"/></td>
			<th class="thEdit Rt mandatory"><mc:msg key="fwk.commoncode.header.description"/></th>
			<td class="tdEdit"><ui:text name="descriptionMaster" checkName="fwk.commoncode.header.description" options="mandatory"/></td>
		</tr>
	</table>
</div>
<div class="breaker" style="height:5px;"></div>
<div class="divButtonArea areaContainerPopup">
	<div class="divButtonAreaLeft"></div>
	<div class="divButtonAreaRight">
		<ui:buttonGroup id="subButtonGroup">
			<ui:button id="btnAdd" caption="button.com.add" iconClass="fa-plus"/>
		</ui:buttonGroup>
	</div>
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
	<table id="tblGrid" class="tblGrid">
		<colgroup>
			<col width="2%"/>
			<col width="2%"/>
			<col width="20%"/>
			<col width="30%"/>
			<col width="6%"/>
			<col width="*"/>
			<col width="6%"/>
		</colgroup>
		<thead>
			<tr>
				<th class="thGrid"></th>
				<th class="thGrid"></th>
				<th class="thGrid mandatory"><mc:msg key="fwk.commoncode.header.commonCode"/></th>
				<th class="thGrid mandatory"><mc:msg key="fwk.commoncode.header.codeMeaning"/></th>
				<th class="thGrid mandatory"><mc:msg key="fwk.commoncode.header.isActive"/></th>
				<th class="thGrid mandatory"><mc:msg key="fwk.commoncode.header.description"/></th>
				<th class="thGrid mandatory"><mc:msg key="fwk.commoncode.header.sortOrder"/></th>
			</tr>
		</thead>
		<tbody id="tblGridBody">
			<tr class="noStripe">
				<td colspan="7" style="padding:0px;border-top:0px"><ul id="ulCommonCodeDetailHolder"></ul></td>
			</tr>
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
<li id="liDummy" class="dummyDetail">
	<table class="tblGrid" style="border:0px">
		<colgroup>
			<col width="2%"/>
			<col width="2%"/>
			<col width="20%"/>
			<col width="30%"/>
			<col width="6%"/>
			<col width="*"/>
			<col width="6%"/>
		</colgroup>
		<tr class="noBorderAll">
			<th id="thDragHander" class="thGrid dragHandler" title="<mc:msg key="fwk.commoncode.msg.drag"/>"><ui:icon id="iDragHandler" className="fa-lg fa-sort"/></th>
			<th id="thDeleteButton" class="thGrid deleteButton" title="<mc:msg key="fwk.commoncode.msg.delete"/>"><ui:icon id="iDeleteButton" className="fa-lg fa-times"/></th>
			<td class="tdGrid ct"><ui:text name="commonCodeDetail" style="text-transform:uppercase" checkName="fwk.commoncode.header.commonCode" options="mandatory"/></td>
			<td class="tdGrid ct"><ui:text name="codeMeaningDetail" checkName="fwk.commoncode.header.codeMeaning" options="mandatory"/></td>
			<td class="tdGrid ct"><ui:ccradio name="isActiveDetail" codeType="SIMPLE_YN" selectedValue="Y" source="framework"/></td>
			<td class="tdGrid ct"><ui:text name="descriptionDetail" checkName="fwk.commoncode.header.descriptionEn" options="mandatory"/></td>
			<td class="tdGrid ct"><ui:text name="sortOrderDetail" className="ct" checkName="fwk.commoncode.header.sortOrder" option="numeric" options="mandatory"/></td>
		</tr>
	</table>
</li>
</form>
<%/************************************************************************************************
* Additional Form
************************************************************************************************/%>
<form id="fmHidden" name="fmHidden" method="post" action=""></form>
</body>
</html>