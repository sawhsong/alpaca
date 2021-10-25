/**************************************************************************************************
 * project
 * Description - Sys9802 - Assignment
 *	- Generated by Source Generator
 *************************************************************************************************/
package project.app.sys.sys9802;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;

public class Sys9802Action extends BaseAction {
	@Autowired
	private Sys9802Biz biz;

	public String getDefault() throws Exception {
		biz.getDefault(paramEntity);
		return "list";
	}

	public String getList() throws Exception {
		try {
			biz.getList(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String getDetail() throws Exception {
		biz.getDetail(paramEntity);
		return "detail";
	}

	public String getUnlockPrt() throws Exception {
		biz.getUnlockPrt(paramEntity);
		return "unlockPrt";
	}

	public String getUpdateWorkingState() throws Exception {
		biz.getUpdateWorkingState(paramEntity);
		return "updateWorkingState";
	}

	public String getUpdateEndUser() throws Exception {
		biz.getUpdateEndUser(paramEntity);
		return "updateEndUser";
	}

	public String doUnlockPrt() throws Exception {
		try {
			biz.doUnlockPrt(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String doUpdateWorkingState() throws Exception {
		try {
			biz.doUpdateWorkingState(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String doUpdateEndUser() throws Exception {
		try {
			biz.doUpdateEndUser(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String exeExport() throws Exception {
		biz.exeExport(paramEntity);
		setRequestAttribute("paramEntity", paramEntity);
		return "export";
	}
}