package project.common.module.feed;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;

public class FeedAction extends BaseAction {
	@Autowired
	private FeedBiz biz;

	public String getRssAbcJustin() throws Exception {
		try {
			biz.getRssAbcJustin(paramEntity);
		} catch (Exception ex) {
			return "ajaxResponse";
		} finally {
			setRequestAttribute("paramEntity", paramEntity);
		}
		return "ajaxResponse";
	}

	public String getRssNewsComAuWorld() throws Exception {
		try {
			biz.getRssNewsComAuWorld(paramEntity);
		} catch (Exception ex) {
			return "ajaxResponse";
		} finally {
			setRequestAttribute("paramEntity", paramEntity);
		}
		return "ajaxResponse";
	}
}