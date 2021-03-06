/**************************************************************************************************
 * project
 * Description - Qm10 - Select Database
 *	- Generated by Source Generator
 *************************************************************************************************/
package project.app.qm.qm10;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;

public class Qm10Action extends BaseAction {
	@Autowired
	private Qm10Biz biz;

	public String getDefault() throws Exception {
		biz.getDefault(paramEntity);
		return "list";
	}

	public String exeSave() throws Exception {
		try {
			biz.exeSave(paramEntity);

			if (paramEntity.isSuccess()) {
				session.setAttribute("DatabaseForAdminTool", paramEntity.getRequestDataSet().getValue("dataSource"));
				session.setAttribute("DatabaseQuickSearch", paramEntity.getRequestDataSet().getValue("dataSource"));
			}
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}
}