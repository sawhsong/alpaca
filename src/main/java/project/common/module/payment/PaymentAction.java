package project.common.module.payment;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;
import zebra.data.DataSet;
import zebra.util.CommonUtil;

public class PaymentAction extends BaseAction {
	@Autowired
	private PaymentBiz biz;

	public String getDefault() throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		String actionName = requestDataSet.getValue("actionName");
		String returnString = "";

		try {
			biz.getDefault(paramEntity);

			if (CommonUtil.equalsIgnoreCase(actionName, "previewPayslip")) {returnString = "previewPayslip";}
		} catch (Exception ex) {
		}
		return returnString;
	}
}