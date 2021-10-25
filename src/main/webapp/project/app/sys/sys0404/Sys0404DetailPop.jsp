<%/************************************************************************************************
* Description - Sys0404 - Authority Group
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	DataSet resultDataSet = (DataSet)paramEntity.getObject("resultDataSet");
	SysAuthGroup sysAuthGroup = (SysAuthGroup)paramEntity.getObject("sysAuthGroup");
	String dateFormat = ConfigUtil.getProperty("format.date.java");
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
var groupId = "<%=sysAuthGroup.getGroupId()%>";
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
			<ui:button id="btnEdit" caption="button.com.edit" iconClass="fa-edit"/>
			<ui:button id="btnDelete" caption="button.com.delete" iconClass="fa-save"/>
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
	<table class="tblEdit">
		<colgroup>
			<col width="15%"/>
			<col width="35%"/>
			<col width="15%"/>
			<col width="35%"/>
		</colgroup>
		<tr>
			<th class="thEdit Rt"><mc:msg key="sys0404.header.groupId"/></th>
			<td class="tdEdit"><%=sysAuthGroup.getGroupId()%></td>
			<th class="thEdit Rt"><mc:msg key="sys0404.header.isActive"/></th>
			<td class="tdEdit"><%=sysAuthGroup.getIsActive()%></td>
		</tr>
		<tr>
			<th class="thEdit Rt"><mc:msg key="sys0404.header.groupName"/></th>
			<td class="tdEdit" colspan="3"><%=sysAuthGroup.getGroupName()%></td>
		</tr>
		<tr>
			<th class="thEdit Rt"><mc:msg key="sys0404.header.description"/></th>
			<td class="tdEdit" colspan="3"><%=sysAuthGroup.getDescription()%></td>
		</tr>
		<tr>
			<th class="thEdit"><mc:msg key="page.com.insertUser"/></th>
			<td class="tdEdit"><%=sysAuthGroup.getInsertUserName()%></td>
			<th class="thEdit"><mc:msg key="page.com.insertDate"/></th>
			<td class="tdEdit"><%=CommonUtil.toString(sysAuthGroup.getInsertDate(), dateFormat)%></td>
		</tr>
		<tr>
			<th class="thEdit"><mc:msg key="page.com.updateUser"/></th>
			<td class="tdEdit"><%=sysAuthGroup.getUpdateUserName()%></td>
			<th class="thEdit"><mc:msg key="page.com.updateDate"/></th>
			<td class="tdEdit"><%=CommonUtil.toString(sysAuthGroup.getUpdateDate(), dateFormat)%></td>
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