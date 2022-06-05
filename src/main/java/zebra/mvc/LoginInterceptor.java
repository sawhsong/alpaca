package zebra.mvc;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import project.app.login.LoginAction;
import project.common.module.commonfunction.CommonFunctionAction;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class LoginInterceptor implements Interceptor {
	private Logger logger = LogManager.getLogger(this.getClass());

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Map sessionMap = context.getSession();
		Object action = invocation.getAction();
		String userId = (String)sessionMap.get("UserId"), returnValue = "";
		boolean isAuthenticated = CommonUtil.toBoolean(CommonUtil.nvl((String)sessionMap.get("IsAuthenticated"), "false"));

//		for (Iterator iter = context.getContextMap().entrySet().iterator(); iter.hasNext();) {
//			Entry entry = (Entry)iter.next();
//			String key = (String)entry.getKey();
//			Object obj = entry.getValue();
//
//			logger.debug("getContextMap in LoginInterceptor - [" + key + "] : [" + obj + "]");
//		}

		// Log
		if (CommonUtil.equalsIgnoreCase(ConfigUtil.getProperty("log.interceptor.login"), "Y")) {
			logger.debug("invocation.getAction() : "+action.getClass().getName());
			logger.debug("session.getId() : "+session.getId());

			for (Iterator iter = sessionMap.entrySet().iterator(); iter.hasNext();) {
				Entry entry = (Entry)iter.next();
				String key = (String)entry.getKey();
				Object obj = entry.getValue();

				logger.debug("sessionMap in LoginInterceptor - [" + key + "] : [" + obj + "]");
			}
		}

//		if (action instanceof LoginAction) {
//			if (CommonUtil.equalsIgnoreCase(invocation.getProxy().getMethod(), "getUserProfile")) {
//				userId = (String)sessionMap.get("UserId");
//				if (CommonUtil.isBlank(userId)) {
//					returnValue = "checkScreenForLogin";
//				}
//			}
//		} else {
//			userId = (String)sessionMap.get("UserId");
//			if (CommonUtil.isBlank(userId)) {
//				if (isAjaxCall(request)) {
//					returnValue = "ajaxSessionTimeout";
//				} else {
//					returnValue = "checkScreenForLogin";
//				}
//			}
//		}

		if (action instanceof LoginAction || action instanceof CommonFunctionAction) {
			String method = invocation.getProxy().getMethod();

			if (CommonUtil.isIn(method, "getUserProfile", "getFavoriteMenuList", "getFavoriteMenu")) {
				if (CommonUtil.isBlank(userId) || !isAuthenticated) {
					if (isAjaxCall(request)) {
						returnValue = "ajaxSessionTimeout";
					} else {
						returnValue = "checkScreenForLogin";
					}
				}
			}
		} else {
			if (CommonUtil.isBlank(userId) || !isAuthenticated) {
				if (isAjaxCall(request)) {
					returnValue = "ajaxSessionTimeout";
				} else {
					returnValue = "checkScreenForLogin";
				}
			}
		}

		if (CommonUtil.isNotBlank(returnValue)) {
			if (session.isNew()) {
				request.setAttribute("sessionCheckType", "SessionTimedOut");
			}

			session.setAttribute("frameworkName", ConfigUtil.getProperty("name.framework"));
			session.setAttribute("projectName", ConfigUtil.getProperty("name.project"));
			session.setAttribute("langCode", CommonUtil.lowerCase(request.getLocale().getLanguage()));
			session.setAttribute("themeId", CommonUtil.lowerCase(ConfigUtil.getProperty("view.theme.default")));

			return returnValue;
		}

		return invocation.invoke();
	}

	private boolean isAjaxCall(HttpServletRequest request) {
		if (CommonUtil.toBoolean(request.getHeader("isAjaxCallForFramework"))) {
			return true;
		} else {
			return false;
		}
	}
}