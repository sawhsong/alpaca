package project.common.module.bizservice.payment;

import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface PaymentBizService {
	public DataSet getPayslipListByPersonId(QueryAdvisor queryAdvisor, String personId) throws Exception;
}