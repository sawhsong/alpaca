package project.common.module.bizservice.payment;

import org.springframework.beans.factory.annotation.Autowired;

import project.conf.resource.ormapper.dao.HpAsgProcesses.HpAsgProcessesDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.example.common.extend.BaseBiz;

public class PaymentBizServiceImpl extends BaseBiz implements PaymentBizService {
	@Autowired
	private HpAsgProcessesDao hpAsgProcessesDao;

	public DataSet getPayslipListByPersonId(QueryAdvisor queryAdvisor, String personId) throws Exception {
		hpAsgProcessesDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return hpAsgProcessesDao.getPayslipListByPersonId(queryAdvisor, personId);
	}
}