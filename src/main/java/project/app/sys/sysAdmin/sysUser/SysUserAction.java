/**************************************************************************************************
 * project
 * Description - SysUser - User
 *	- Generated by Source Generator
 *************************************************************************************************/
package project.app.sys.sysAdmin.sysUser;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;

public class SysUserAction extends BaseAction {
	@Autowired
	private SysUserBiz biz;

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

	public String getInsert() throws Exception {
		biz.getInsert(paramEntity);
		return "insert";
	}

	public String getUpdate() throws Exception {
		biz.getUpdate(paramEntity);
		return "update";
	}

	public String getActionContextMenu() throws Exception {
		biz.getActionContextMenu(paramEntity);
		return "actionContextMenu";
	}

	public String doResetPassword() throws Exception {
		try {
			biz.doResetPassword(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String exeInsert() throws Exception {
		try {
			biz.exeInsert(paramEntity);

			if (paramEntity.isSuccess()) {
				paramEntity.setObject("script", "parent.popup.close();parent.doSearch();");
			} else {
				paramEntity.setObject("script", "history.go(-1);");
			}

			paramEntity.setObject("messageCode", paramEntity.getMessageCode());
			paramEntity.setObject("message", paramEntity.getMessage());
		} catch (Exception ex) {
			logger.error(ex.getMessage());

			paramEntity.setObject("messageCode", "E000");
			paramEntity.setObject("message", ex.getMessage());
			paramEntity.setObject("script", "history.go(-1);");
		}
		return "pageHandler";
	}

	public String exeUpdate() throws Exception {
		try {
			biz.exeUpdate(paramEntity);

			if (paramEntity.isSuccess()) {
				paramEntity.setObject("script", "parent.popup.close();parent.doSearch();");
			} else {
				paramEntity.setObject("script", "history.go(-1);");
			}

			paramEntity.setObject("messageCode", paramEntity.getMessageCode());
			paramEntity.setObject("message", paramEntity.getMessage());
		} catch (Exception ex) {
			logger.error(ex.getMessage());

			paramEntity.setObject("messageCode", "E000");
			paramEntity.setObject("message", ex.getMessage());
			paramEntity.setObject("script", "history.go(-1);");
		}
		return "pageHandler";
	}

	public String exeDelete() throws Exception {
		try {
			biz.exeDelete(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String exeActionContextMenu() throws Exception {
		try {
			biz.exeActionContextMenu(paramEntity);
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

	public String getAuthorityGroup() throws Exception {
		try {
			biz.getAuthorityGroup(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String hasAuthKey() throws Exception {
		try {
			biz.hasAuthKey(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String getAuthenticationSecretKey() throws Exception {
		try {
			biz.getAuthenticationSecretKey(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}
}