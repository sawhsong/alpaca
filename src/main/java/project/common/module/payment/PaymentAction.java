package project.common.module.payment;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseAction;
import zebra.data.DataSet;

public class PaymentAction extends BaseAction {
	@Autowired
	private PaymentBiz biz;

	public String getDefault() throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		String actionName = requestDataSet.getValue("actionName");

		biz.getDefault(paramEntity);
		return actionName;
	}
}