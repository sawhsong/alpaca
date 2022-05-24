<%/************************************************************************************************
* Description - Sys0402 - Menu
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	DataSet quickMenuDataSet = MenuManager.getQuickMenu();
	DataSet menuDataSet = MenuManager.getMenuDataSetByLevel(1);
	String langCode = CommonUtil.upperCase((String)session.getAttribute("langCode"));
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
			<ui:button id="btnSetSort" caption="sys0402.btn.sort" iconClass="fa-sort-numeric-asc"/>
			<ui:button id="btnNew" caption="button.com.new" iconClass="fa-plus-square"/>
			<ui:button id="btnDelete" caption="button.com.delete" iconClass="fa-trash"/>
			<ui:button id="btnSearch" caption="button.com.search" iconClass="fa-search"/>
			<ui:button id="btnClear" caption="button.com.clear" iconClass="fa-refresh"/>
			<ui:button id="btnExport" caption="button.com.export" iconClass="fa-download"/>
		</ui:buttonGroup>
	</div>
</div>
<div id="divAdminToolArea"><%@ include file="/project/common/include/bodyAdminToolArea.jsp"%></div>
<div id="divSearchCriteriaArea" class="areaContainer">
	<div class="panel panel-default">
		<div class="panel-body">
			<table class="tblDefault">
				<tr>
					<td class="tdDefault">
						<label for="searchMenu" class="lblEn hor"><mc:msg key="sys0402.search.searchType"/></label>
						<ui:select name="searchMenu">
							<ui:seloption value="" text="==Select=="/>
<%
						for (int i=0; i<menuDataSet.getRowCnt(); i++) {
%>
							<option value="<%=menuDataSet.getValue(i, "MENU_ID")%>"><%=menuDataSet.getValue(i, "MENU_NAME_"+langCode)%>(<%=menuDataSet.getValue(i, "MENU_ID")%>)</option>
<%
						}
%>
						</ui:select>
					</td>
				</tr>
			</table>
		</div>
	</div>
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
	<table id="tblGrid" class="tblGrid sort autosort">
		<colgroup>
			<col width="2%"/>
			<col width="2%"/>
			<col width="14%"/>
			<col width="17%"/>
			<col width="22%"/>
			<col width="5%"/>
			<col width="*"/>
			<col width="4%"/>
		</colgroup>
		<thead>
			<tr>
				<th class="thGrid"><ui:icon className="fa-magic fa-lg"/></th>
				<th class="thGrid"><ui:icon id="icnCheck" className="fa-check-square-o fa-lg" title="page.com.selectToDelete"/></th>
				<th class="thGrid"><mc:msg key="sys0402.grid.menuId"/></th>
				<th class="thGrid"><mc:msg key="sys0402.grid.menuName"/></th>
				<th class="thGrid"><mc:msg key="sys0402.grid.menuUrl"/></th>
				<th class="thGrid"><mc:msg key="sys0402.grid.sortOrder"/></th>
				<th class="thGrid"><mc:msg key="sys0402.grid.menuDesc"/></th>
				<th class="thGrid"><mc:msg key="sys0402.grid.isActive"/></th>
			</tr>
		</thead>
		<tbody id="tblGridBody">
			<tr>
				<td class="tdGrid Ct" colspan="8"><mc:msg key="I002"/></td>
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