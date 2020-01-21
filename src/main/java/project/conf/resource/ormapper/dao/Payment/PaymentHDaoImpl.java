/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - PAYMENT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.Payment;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseHDao;
import project.conf.resource.ormapper.dao.ProjectDummy.ProjectDummyDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class PaymentHDaoImpl extends BaseHDao implements PaymentDao {
	@Autowired
	private ProjectDummyDao projectDummyDao;

	public DataSet getPayslipMasterByPaymentId(QueryAdvisor queryAdvisor, String paymentId) throws Exception {
		queryAdvisor.addVariable("dateFormat", ConfigUtil.getProperty("format.date.java"));
		queryAdvisor.addVariable("paymentId", paymentId);

		return selectAsDataSet(queryAdvisor, "query.Payment.getPayslipMasterByPaymentId");
	}

	public DataSet getPayslipMasterByPaymentId(String paymentId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();

		queryAdvisor.addVariable("dateFormat", ConfigUtil.getProperty("format.date.java"));
		queryAdvisor.addVariable("paymentId", paymentId);

		return selectAsDataSet(queryAdvisor, "query.Payment.getPayslipMasterByPaymentId");
	}

	public DataSet getYtdAllByPersonIdForPreview(QueryAdvisor queryAdvisor, String personId, Date paymentDate, String... ytdTypes) throws Exception {
		String dateFormat = ConfigUtil.getProperty("format.default.date");
		DataSet financialYear;

		financialYear = projectDummyDao.getFinacialYear();
		queryAdvisor.addVariable("financialDateFrom", financialYear.getValue("FINANCIAL_DATE_FROM"));
		queryAdvisor.addVariable("financialDateTo", financialYear.getValue("FINANCIAL_DATE_TO"));
		queryAdvisor.addVariable("paymentDate", CommonUtil.toString(paymentDate, dateFormat));
		queryAdvisor.addVariable("personId", personId);
		if (ytdTypes != null && ytdTypes.length > 0) {
			String str = "";
			for (String type : ytdTypes) {
				str += (CommonUtil.isBlank(str)) ? "'"+type+"'" : ", '"+type+"'";
			}
			queryAdvisor.addWhereClause("ytd_type in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getYtdAllByPersonIdForPreview");
	}

	public DataSet getYtdAllByPersonIdForPreview(String personId, Date paymentDate, String... ytdTypes) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		String dateFormat = ConfigUtil.getProperty("format.default.date");
		DataSet financialYear;

		financialYear = projectDummyDao.getFinacialYear();
		queryAdvisor.addVariable("financialDateFrom", financialYear.getValue("FINANCIAL_DATE_FROM"));
		queryAdvisor.addVariable("financialDateTo", financialYear.getValue("FINANCIAL_DATE_TO"));
		queryAdvisor.addVariable("paymentDate", CommonUtil.toString(paymentDate, dateFormat));
		queryAdvisor.addVariable("personId", personId);
		if (ytdTypes != null && ytdTypes.length > 0) {
			String str = "";
			for (String type : ytdTypes) {
				str += (CommonUtil.isBlank(str)) ? "'"+type+"'" : ", '"+type+"'";
			}
			queryAdvisor.addWhereClause("ytd_type in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getYtdAllByPersonIdForPreview");
	}

	public DataSet getYtdByElementIdForPreview(QueryAdvisor queryAdvisor, String personId, Date paymentDate, String... elementIds) throws Exception {
		String dateFormat = ConfigUtil.getProperty("format.default.date");
		DataSet financialYear;

		financialYear = projectDummyDao.getFinacialYear();
		queryAdvisor.addVariable("financialDateFrom", financialYear.getValue("FINANCIAL_DATE_FROM"));
		queryAdvisor.addVariable("financialDateTo", financialYear.getValue("FINANCIAL_DATE_TO"));
		queryAdvisor.addVariable("paymentDate", CommonUtil.toString(paymentDate, dateFormat));
		queryAdvisor.addVariable("personId", personId);
		if (elementIds != null && elementIds.length > 0) {
			String str = "";
			for (String id : elementIds) {
				str += (CommonUtil.isBlank(str)) ? "'"+id+"'" : ", '"+id+"'";
			}
			queryAdvisor.addWhereClause("element_id in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getYtdAllByPersonIdForPreview");
	}

	public DataSet getYtdByElementIdForPreview(String personId, Date paymentDate, String... elementIds) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		String dateFormat = ConfigUtil.getProperty("format.default.date");
		DataSet financialYear;

		financialYear = projectDummyDao.getFinacialYear();
		queryAdvisor.addVariable("financialDateFrom", financialYear.getValue("FINANCIAL_DATE_FROM"));
		queryAdvisor.addVariable("financialDateTo", financialYear.getValue("FINANCIAL_DATE_TO"));
		queryAdvisor.addVariable("paymentDate", CommonUtil.toString(paymentDate, dateFormat));
		queryAdvisor.addVariable("personId", personId);
		if (elementIds != null && elementIds.length > 0) {
			String str = "";
			for (String id : elementIds) {
				str += (CommonUtil.isBlank(str)) ? "'"+id+"'" : ", '"+id+"'";
			}
			queryAdvisor.addWhereClause("element_id in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getYtdAllByPersonIdForPreview");
	}

	public DataSet getPaymentAllByPaymentIdForPreview(QueryAdvisor queryAdvisor, String paymentId, String... paymentTypes) throws Exception {
		queryAdvisor.addVariable("paymentId", paymentId);
		if (paymentTypes != null && paymentTypes.length > 0) {
			String str = "";
			for (String type : paymentTypes) {
				str += (CommonUtil.isBlank(str)) ? "'"+type+"'" : ", '"+type+"'";
			}
			queryAdvisor.addWhereClause("type in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getPaymentAllByPaymentIdForPreview");
	}

	public DataSet getPaymentAllByPaymentIdForPreview(String paymentId, String... paymentTypes) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();

		queryAdvisor.addVariable("paymentId", paymentId);
		if (paymentTypes != null && paymentTypes.length > 0) {
			String str = "";
			for (String type : paymentTypes) {
				str += (CommonUtil.isBlank(str)) ? "'"+type+"'" : ", '"+type+"'";
			}
			queryAdvisor.addWhereClause("type in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getPaymentAllByPaymentIdForPreview");
	}

	public DataSet getPaymentByElementIdForPreview(QueryAdvisor queryAdvisor, String paymentId, String... elementIds) throws Exception {
		queryAdvisor.addVariable("paymentId", paymentId);
		if (elementIds != null && elementIds.length > 0) {
			String str = "";
			for (String id : elementIds) {
				str += (CommonUtil.isBlank(str)) ? "'"+id+"'" : ", '"+id+"'";
			}
			queryAdvisor.addWhereClause("element_id in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getPaymentAllByPaymentIdForPreview");
	}

	public DataSet getPaymentByElementIdForPreview(String paymentId, String... elementIds) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();

		queryAdvisor.addVariable("paymentId", paymentId);
		if (elementIds != null && elementIds.length > 0) {
			String str = "";
			for (String id : elementIds) {
				str += (CommonUtil.isBlank(str)) ? "'"+id+"'" : ", '"+id+"'";
			}
			queryAdvisor.addWhereClause("element_id in ("+str+")");
		}

		return selectAsDataSet(queryAdvisor, "query.Payment.getPaymentAllByPaymentIdForPreview");
	}

	public DataSet getEarningsByPaymentIdForPreview(QueryAdvisor queryAdvisor, String paymentId) throws Exception {
		queryAdvisor.addVariable("dateFormat", ConfigUtil.getProperty("format.date.java"));
		queryAdvisor.addVariable("paymentId", paymentId);

		return selectAsDataSet(queryAdvisor, "query.Payment.getEarningsByPaymentIdForPreview");
	}

	public DataSet getEarningsByPaymentIdForPreview(String paymentId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();

		queryAdvisor.addVariable("dateFormat", ConfigUtil.getProperty("format.date.java"));
		queryAdvisor.addVariable("paymentId", paymentId);

		return selectAsDataSet(queryAdvisor, "query.Payment.getEarningsByPaymentIdForPreview");
	}

	public DataSet getDeductionsByPaymentIdForPreview(QueryAdvisor queryAdvisor, String paymentId) throws Exception {
		queryAdvisor.addVariable("dateFormat", ConfigUtil.getProperty("format.date.java"));
		queryAdvisor.addVariable("paymentId", paymentId);

		return selectAsDataSet(queryAdvisor, "query.Payment.getDeductionsByPaymentIdForPreview");
	}

	public DataSet getDeductionsByPaymentIdForPreview(String paymentId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();

		queryAdvisor.addVariable("dateFormat", ConfigUtil.getProperty("format.date.java"));
		queryAdvisor.addVariable("paymentId", paymentId);

		return selectAsDataSet(queryAdvisor, "query.Payment.getDeductionsByPaymentIdForPreview");
	}
}