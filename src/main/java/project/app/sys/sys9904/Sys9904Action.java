/**************************************************************************************************
 * project
 * Description - Sys9904 - Free Board
 *	- Generated by Source Generator
 *************************************************************************************************/
package project.app.sys.sys9904;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;
import zebra.util.CommonUtil;

public class Sys9904Action extends BaseAction {
	@Autowired
	private Sys9904Biz biz;

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

	public String getAttachedFile() throws Exception {
		try {
			biz.getAttachedFile(paramEntity);
		} catch (Exception ex) {
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}

	public String exeInsert() throws Exception {
		try {
			biz.exeInsert(paramEntity);

			if (paramEntity.isSuccess()) {
				paramEntity.setObject("action", "/sys/9904/getDefault.do");
			} else {
				paramEntity.setObject("script", "history.go(-1);");
			}
		} catch (Exception ex) {
			paramEntity.setObject("script", "history.go(-1);");
		} finally {
			if (CommonUtil.isNotBlank(paramEntity.getRequestDataSet().getValue("articleContents"))) {
				paramEntity.getRequestDataSet().setValue("articleContents", "");
			}
			paramEntity.setObject("messageCode", paramEntity.getMessageCode());
			paramEntity.setObject("message", paramEntity.getMessage());
		}
		return "pageHandler";
	}

	public String exeUpdate() throws Exception {
		try {
			biz.exeUpdate(paramEntity);

			if (paramEntity.isSuccess()) {
				paramEntity.setObject("action", "/sys/9904/getDefault.do");
			} else {
				paramEntity.setObject("script", "history.go(-1);");
			}
		} catch (Exception ex) {
			paramEntity.setObject("script", "history.go(-1);");
		} finally {
			if (CommonUtil.isNotBlank(paramEntity.getRequestDataSet().getValue("articleContents"))) {
				paramEntity.getRequestDataSet().setValue("articleContents", "");
			}
			paramEntity.setObject("messageCode", paramEntity.getMessageCode());
			paramEntity.setObject("message", paramEntity.getMessage());
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

	public String exeExport() throws Exception {
		biz.exeExport(paramEntity);
		setRequestAttribute("paramEntity", paramEntity);
		return "export";
	}
}