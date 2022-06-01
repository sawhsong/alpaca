<%/************************************************************************************************
* Description - Sys0408 - Menu - Authority Group
*	- Generated by Source Generator
************************************************************************************************/%>
<%@ include file="/shared/page/incCommon.jsp"%>
<%/************************************************************************************************
* Declare objects & variables
************************************************************************************************/%>
<%
	ParamEntity paramEntity = (ParamEntity)request.getAttribute("paramEntity");
	DataSet requestDataSet = paramEntity.getRequestDataSet();
	DataSet resultDataSet = (DataSet)paramEntity.getObject("resultDataSet");
	DataSet authGroupDataSet = (DataSet)paramEntity.getObject("authGroupDataSet");
	String langCode = CommonUtil.upperCase((String)session.getAttribute("langCode"));
	String delimiter = ConfigUtil.getProperty("delimiter.data");
	String selectedAuthGroup = requestDataSet.getValue("authGroup");
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
			<ui:button id="btnSave" caption="button.com.save" iconClass="fa-save"/>
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
						<label for="authGroup" class="lblEn hor mandatory"><mc:msg key="sys0408.search.authGroup"/></label>
						<div style="float:left;padding-right:4px;">
							<ui:select name="authGroup" checkName="sys0408.search.authGroup" options="mandatory">
								<ui:seloption value="" text="==Select=="/>
<%
							for (int i=0; i<authGroupDataSet.getRowCnt(); i++) {
								String selected = CommonUtil.equalsIgnoreCase(selectedAuthGroup, authGroupDataSet.getValue(i, "GROUP_ID")) ? "selected" : "";
%>
								<option value="<%=authGroupDataSet.getValue(i, "GROUP_ID")%>" desc="<%=authGroupDataSet.getValue(i, "DESCRIPTION")%>" <%=selected%>><%=authGroupDataSet.getValue(i, "GROUP_NAME")%></option>
<%
							}
%>
							</ui:select>
						</div>
						<ui:text name="authGroupDesc" className="hor" style="font-weight:bold;width:500px" status="display"/>
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
			<col width="18%"/>
			<col width="17%"/>
			<col width="21%"/>
			<col width="7%"/>
			<col width="*"/>
			<col width="5%"/>
		</colgroup>
		<thead>
			<tr>
				<th class="thGrid"><ui:icon id="icnCheck" className="fa-check-square-o fa-lg" title="sys0408.grid.selectToAssign"/></th>
				<th class="thGrid"><mc:msg key="sys0408.grid.menuId"/></th>
				<th class="thGrid"><mc:msg key="sys0408.grid.menuName"/></th>
				<th class="thGrid"><mc:msg key="sys0408.grid.menuUrl"/></th>
				<th class="thGrid"><mc:msg key="sys0408.grid.sortOrder"/></th>
				<th class="thGrid"><mc:msg key="sys0408.grid.menuDesc"/></th>
				<th class="thGrid"><mc:msg key="sys0408.grid.isActive"/></th>
			</tr>
		</thead>
		<tbody>
<%
		if (resultDataSet.getRowCnt() > 0) {
			for (int i=0; i<resultDataSet.getRowCnt(); i++) {
				String menuPath = resultDataSet.getValue(i, "PATH");
				String menuId = resultDataSet.getValue(i, "MENU_ID");
				String menuName = resultDataSet.getValue(i, "MENU_NAME_"+langCode);
				String groupId = resultDataSet.getValue(i, "GROUP_ID");
				String space = "", style = "", paramValue = "";
				int iLevel = CommonUtil.toInt(resultDataSet.getValue(i, "LEVEL")) - 1;

				style = (iLevel == 0 || iLevel == 1) ? "font-weight:bold;" : "";

				for (int j=0; j<iLevel; j++) {
					space += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				}

				paramValue = resultDataSet.getValue(i, "LEVEL")+delimiter+menuPath;
%>
			<tr class="noBorderHor">
				<td class="tdGrid Ct"><input type="checkbox" id="chkToAssign" name="chkToAssign" class="inTblGrid chkEn" value="<%=menuId%>" paramValue="<%=paramValue%>" groupId="<%=groupId%>"/></td>
				<td class="tdGrid" style="<%=style%>"><%=space%><%=menuId%></td>
				<td class="tdGrid" style="<%=style%>"><%=menuName%></td>
				<td class="tdGrid"><%=resultDataSet.getValue(i, "MENU_URL")%></td>
				<td class="tdGrid Ct"><%=resultDataSet.getValue(i, "SORT_ORDER")%></td>
				<td class="tdGrid"><%=resultDataSet.getValue(i, "DESCRIPTION")%></td>
				<td class="tdGrid Ct"><%=resultDataSet.getValue(i, "IS_ACTIVE")%></td>
			</tr>
<%
			}
		} else {
%>
			<tr>
				<td class="tdGrid Ct" colspan="7"><mc:msg key="I002"/></td>
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