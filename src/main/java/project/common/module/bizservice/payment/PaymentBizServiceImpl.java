package project.common.module.bizservice.payment;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import project.conf.resource.ormapper.dao.HpAsgProcesses.HpAsgProcessesDao;
import project.conf.resource.ormapper.dao.HpBalanceLines.HpBalanceLinesDao;
import project.conf.resource.ormapper.dao.Payment.PaymentDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.example.common.extend.BaseBiz;

public class PaymentBizServiceImpl extends BaseBiz implements PaymentBizService {
	@Autowired
	private HpAsgProcessesDao hpAsgProcessesDao;
	@Autowired
	private PaymentDao paymentDao;
	@Autowired
	private HpBalanceLinesDao hpBalanceLinesDao;

	public DataSet getPayslipListByPersonId(QueryAdvisor queryAdvisor, String personId) throws Exception {
		hpAsgProcessesDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return hpAsgProcessesDao.getPayslipListByPersonId(queryAdvisor, personId);
	}

	public DataSet getPayslipMasterByPaymentId(QueryAdvisor queryAdvisor, String paymentId) throws Exception {
		paymentDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return paymentDao.getPayslipMasterByPaymentId(queryAdvisor, paymentId);
	}

	public DataSet getBalanceLinesByElementId(QueryAdvisor queryAdvisor, String paymentId, String elementId) throws Exception {
		hpBalanceLinesDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return hpBalanceLinesDao.getByElementId(queryAdvisor, paymentId, elementId);
	}

	public DataSet getYtdAllByPersonIdForPreview(QueryAdvisor queryAdvisor, String personId, Date paymentDate, String... ytdTypes) throws Exception {
		paymentDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return paymentDao.getYtdAllByPersonIdForPreview(queryAdvisor, personId, paymentDate, ytdTypes);
	}

	public DataSet getYtdByElementIdForPreview(QueryAdvisor queryAdvisor, String personId, Date paymentDate, String elementId) throws Exception {
		paymentDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return paymentDao.getYtdByElementIdForPreview(queryAdvisor, personId, paymentDate, elementId);
	}

	public DataSet getEarningsByPaymentIdForPreview(QueryAdvisor queryAdvisor, String paymentId) throws Exception {
		paymentDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return paymentDao.getEarningsByPaymentIdForPreview(queryAdvisor, paymentId);
	}

	public DataSet getDeductionsByPaymentIdForPreview(QueryAdvisor queryAdvisor, String paymentId) throws Exception {
		paymentDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return paymentDao.getDeductionsByPaymentIdForPreview(queryAdvisor, paymentId);
	}

	public DataSet getYtdDeductionForPreview(QueryAdvisor queryAdvisor, String personId, Date paymentDate) throws Exception {
		paymentDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return paymentDao.getYtdAllByPersonIdForPreview(queryAdvisor, personId, paymentDate, "Deduction");
	}

	public DataSet getPaymentAllByPaymentIdForPreview(QueryAdvisor queryAdvisor, String paymentId, String... paymentTypes) throws Exception {
		paymentDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return paymentDao.getPaymentAllByPaymentIdForPreview(queryAdvisor, paymentId, paymentTypes);
	}
}