package project.common.module.commonlookup;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;
import zebra.data.DataSet;
import zebra.util.CommonUtil;

public class CommonLookupAction extends BaseAction {
	@Autowired
	private CommonLookupBiz biz;

	public String getDefault() throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		String lookupType = requestDataSet.getValue("lookupType");
		String returnString = "";

		try {
			biz.getDefault(paramEntity);
			if (CommonUtil.equalsIgnoreCase(lookupType, "EmploymentOrg")) {
				returnString = "employmentOrg";
			}
		} catch (Exception ex) {
		}
		return returnString;
	}

	public String getEmploymentOrganisationLookup() throws Exception {
		try {
			biz.getEmploymentOrganisationLookup(paramEntity);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		setRequestAttribute("paramEntity", paramEntity);
		return "ajaxResponse";
	}
}