/**************************************************************************************************
 * Project
 * Description
 * - Login
 *************************************************************************************************/
package project.app.login;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;
import project.conf.resource.ormapper.dto.oracle.SysUser;
import zebra.config.MemoryBean;
import zebra.data.DataSet;
import zebra.util.CommonUtil;

public class LoginAction extends BaseAction {
	@Autowired
	private LoginBiz biz;

	public String index() throws Exception {
		biz.index(paramEntity);
		return "loginPage";
	}

	public String resetPassword() throws Exception {
		biz.index(paramEntity);
		return "resetPassword";
	}

	public String requestRegister() throws Exception {
		biz.index(paramEntity);
		return "requestRegister";
	}

	public String login() throws Exception {
		try {
			biz.exeLogin(paramEntity);

			if (paramEntity.isSuccess()) {
				SysUser sysUser = (SysUser)paramEntity.getObject("sysUser");
				String themeId = CommonUtil.lowerCase(sysUser.getThemeType());

				session.setAttribute("UserId", sysUser.getUserId());
				session.setAttribute("UserName", sysUser.getUserName());
				session.setAttribute("LoginId", sysUser.getLoginId());
				session.setAttribute("langCode", CommonUtil.lowerCase(sysUser.getLanguage()));

				if (CommonUtil.equalsIgnoreCase(themeId, "theme999")) {
					Random random = new Random();
					session.setAttribute("themeId", "theme"+CommonUtil.leftPad(CommonUtil.toString(random.nextInt(10)), 3, "0"));
				} else {
					session.setAttribute("themeId", themeId);
				}

				session.setAttribute("maxRowsPerPage", CommonUtil.toString(sysUser.getMaxRowPerPage(), "###"));
				session.setAttribute("pageNumsPerPage", CommonUtil.toString(sysUser.getPageNumPerPage(), "###"));
				session.setAttribute("SysUser", sysUser);
				session.setAttribute("AuthenticationKey", (String)paramEntity.getObject("authenticationKey"));

				MemoryBean.set(session.getId(), session);

				paramEntity.setAjaxResponseDataSet(sysUser.getDataSet());
			}
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String exeResetPassword() throws Exception {
		try {
			biz.exeResetPassword(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String exeRequestRegister() throws Exception {
		try {
			biz.exeRequestRegister(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String getUserProfile() throws Exception {
		biz.getUserProfile(paramEntity);
		return "userProfile";
	}

	public String getUpdateUserProfile() throws Exception {
		biz.getUserProfile(paramEntity);
		return "updateUserProfile";
	}

	public String exeUpdate() throws Exception {
		try {
			biz.exeUpdate(paramEntity);

			paramEntity.setObject("messageCode", paramEntity.getMessageCode());
			paramEntity.setObject("message", paramEntity.getMessage());
			if (paramEntity.isSuccess()) {
				paramEntity.setObject("action", "/login/logout.do");
				paramEntity.setObject("message", paramEntity.getMessage()+"<br/>"+getMessage("login.message.restart", paramEntity));
			} else {
				paramEntity.setObject("script", "history.go(-1);");
			}
		} catch (Exception ex) {
			paramEntity.setObject("script", "history.go(-1);");
		}

		return "pageHandler";
	}

	public String controlAdminTool() throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		String flag = requestDataSet.getValue("flag");

		try {
			session.setAttribute("isVisibleAdminTool", flag);
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String setSessionValuesForAdminTool() throws Exception {
		try {
			biz.setSessionValuesForAdminTool(paramEntity);

			if (paramEntity.isSuccess()) {
				session.setAttribute("DatabaseForAdminTool", paramEntity.getRequestDataSet().getValue("databaseAdminTool"));
				session.setAttribute("DatabaseQuickSearch", paramEntity.getRequestDataSet().getValue("databaseAdminTool"));
			}
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String removeSessionValuesForAdminTool() throws Exception {
		try {
			session.removeAttribute("DatabaseForAdminTool");
			session.removeAttribute("PersonIdForAdminTool");
			session.removeAttribute("PersonNumberForAdminTool");
			session.removeAttribute("PersonFullNameForAdminTool");
			session.removeAttribute("HpPersonDForAdminTool");

			session.removeAttribute("DatabaseQuickSearch");
			session.removeAttribute("PersonIdQuickSearch");
			session.removeAttribute("PersonNumberQuickSearch");
			session.removeAttribute("PersonFullNameQuickSearch");
			session.removeAttribute("HpPersonDQuickSearch");
			paramEntity.setSuccess(true);
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

	public String logout() throws Exception {
		MemoryBean.remove(session.getId());
		session.invalidate();
		System.gc();
		System.runFinalization();
		return "index";
	}

	public String getAuthentication() throws Exception {
		biz.index(paramEntity);
		return "authenticate";
	}

	public String doAuthentication() throws Exception {
		try {
			biz.doAuthentication(paramEntity);

			if (paramEntity.isSuccess()) {
				session.setAttribute("AuthenticationKey", (String)paramEntity.getObject("authenticationKey"));
				session.setAttribute("IsAuthenticated", (String)paramEntity.getObject("isAuthenticated"));
			}
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}
}