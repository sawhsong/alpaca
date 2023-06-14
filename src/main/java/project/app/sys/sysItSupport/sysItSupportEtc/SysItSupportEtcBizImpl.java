/**************************************************************************************************
 * project
 * Description - SysItSupportEtc - ETC
 *	- Generated by Source Generator
 *************************************************************************************************/
package project.app.sys.sysItSupport.sysItSupportEtc;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseBiz;
import project.conf.resource.ormapper.dao.EoExpense.EoExpenseDao;
import project.conf.resource.ormapper.dao.HpBillingCode.HpBillingCodeDao;
import project.conf.resource.ormapper.dao.HpOrganisationD.HpOrganisationDDao;
import project.conf.resource.ormapper.dao.HpPersonD.HpPersonDDao;
import project.conf.resource.ormapper.dao.Opportunity.OpportunityDao;
import project.conf.resource.ormapper.dto.oracle.EoExpense;
import project.conf.resource.ormapper.dto.oracle.HpBillingCode;
import project.conf.resource.ormapper.dto.oracle.HpOrganisationD;
import zebra.data.DataSet;
import zebra.data.ParamEntity;
import zebra.exception.FrameworkException;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class SysItSupportEtcBizImpl extends BaseBiz implements SysItSupportEtcBiz {
	@Autowired
	private HpOrganisationDDao hpOrganisationDDao;
	@Autowired
	private HpBillingCodeDao hpBillingCodeDao;
	@Autowired
	private HpPersonDDao hpPersonDDao;
	@Autowired
	private OpportunityDao opportunityDao;
	@Autowired
	private EoExpenseDao eoExpenseDao;

	public ParamEntity getDefault(ParamEntity paramEntity) throws Exception {
		try {
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getList(ParamEntity paramEntity) throws Exception {
		try {
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getOrgInfo(ParamEntity paramEntity) throws Exception {
		DataSet dsReq = paramEntity.getRequestDataSet();
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseQuickSearch"), ConfigUtil.getProperty("jdbc.user.name"));
		String organisationId = dsReq.getValue("organisationId");
		DataSet result = new DataSet();
		HpOrganisationD hpOrganisationD;

		try {
			hpOrganisationDDao.setDataSourceName(dataSource);
			hpOrganisationD = hpOrganisationDDao.getOrganisationByOrganisationId(organisationId);

			result.addColumn("organisationId", CommonUtil.toStringForId(hpOrganisationD.getOrganisationId()));
			result.addColumn("organisationName", hpOrganisationD.getOrganisationName());
			result.addColumn("abn", CommonUtil.getFormatString(CommonUtil.removeString(hpOrganisationD.getAbn(), "-"), "??-???-???-???"));
			result.addColumn("acn", CommonUtil.getFormatString(hpOrganisationD.getAcn(), "???-???-???"));

			paramEntity.setAjaxResponseDataSet(result);
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getBillingCodeInfo(ParamEntity paramEntity) throws Exception {
		DataSet dsReq = paramEntity.getRequestDataSet();
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseQuickSearch"), ConfigUtil.getProperty("jdbc.user.name"));
		String billingCodeId = dsReq.getValue("billingCodeId");
		DataSet result = new DataSet();
		HpBillingCode hpBillingCode;

		try {
			hpBillingCodeDao.setDataSourceName(dataSource);
			hpBillingCode = hpBillingCodeDao.getBillingCodeByBillingCodeId(billingCodeId);

			result.addColumn("billingCodeId", CommonUtil.toStringForId(hpBillingCode.getBillingCodeId()));
			result.addColumn("billingCode", hpBillingCode.getBillingCode());
			result.addColumn("periodsCreationType", hpBillingCode.getPeriodsCreationType());

			paramEntity.setAjaxResponseDataSet(result);
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity doSaveOrg(ParamEntity paramEntity) throws Exception {
		DataSet dsReq = paramEntity.getRequestDataSet();
		String orgId = dsReq.getValue("orgId");
		String orgNameTo = dsReq.getValue("orgNameTo");
		String abnTo = dsReq.getValue("abnTo");
		String acnTo = CommonUtil.removeString(dsReq.getValue("acnTo"), "-");
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseQuickSearch"), ConfigUtil.getProperty("jdbc.user.name"));
		HpOrganisationD hpOrganisationD = new HpOrganisationD();
		int result = 0;

		try {
			hpOrganisationDDao.setDataSourceName(dataSource);

			hpOrganisationD.addUpdateColumn("organisation_name", orgNameTo);
			hpOrganisationD.addUpdateColumn("abn", abnTo);
			hpOrganisationD.addUpdateColumn("acn", acnTo);
			hpOrganisationD.addUpdateColumn("last_updated_by", "1");
			hpOrganisationD.addUpdateColumn("last_update_date", "sysdate", "Date");

			result = hpOrganisationDDao.updateColumns(orgId, hpOrganisationD);
			if (result <= 0) {
				throw new FrameworkException("E801", getMessage("E801", paramEntity));
			}

			paramEntity.setSuccess(true);
			paramEntity.setMessage("I801", getMessage("I801", paramEntity));
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity doSaveBillingCodeCreationType(ParamEntity paramEntity) throws Exception {
		DataSet dsReq = paramEntity.getRequestDataSet();
		String billingCodeId = dsReq.getValue("billingCodeId");
		String billingCodeCreationTypeTo = dsReq.getValue("billingCodeCreationTypeTo");
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseQuickSearch"), ConfigUtil.getProperty("jdbc.user.name"));
		HpBillingCode hpBillingCode = new HpBillingCode();
		int result = 0;

		try {
			hpBillingCodeDao.setDataSourceName(dataSource);

			hpBillingCode.addUpdateColumn("periods_creation_type", billingCodeCreationTypeTo);
			hpBillingCode.addUpdateColumn("last_updated_by", "1");
			hpBillingCode.addUpdateColumn("last_update_date", "sysdate", "Date");

			result = hpBillingCodeDao.updateColumns(billingCodeId, hpBillingCode);
			if (result <= 0) {
				throw new FrameworkException("E801", getMessage("E801", paramEntity));
			}

			paramEntity.setSuccess(true);
			paramEntity.setMessage("I801", getMessage("I801", paramEntity));
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity doSaveAccntShift(ParamEntity paramEntity) throws Exception {
		DataSet dsReq = paramEntity.getRequestDataSet();
		String selectedShiftOrg = dsReq.getValue("selectedShiftOrg");
		String shiftToId = dsReq.getValue("shiftToId");
		boolean isOrganisationShift = CommonUtil.toBoolean(dsReq.getValue("isOrganisationShift"));
		boolean isPersonShift = CommonUtil.toBoolean(dsReq.getValue("isPersonShift"));
		boolean isOpportunityShift = CommonUtil.toBoolean(dsReq.getValue("isOpportunityShift"));
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseQuickSearch"), ConfigUtil.getProperty("jdbc.user.name"));
		String delimiter = ConfigUtil.getProperty("delimiter.record");
		String selectedShiftOrgs[];
		int result = 0;

		try {
			selectedShiftOrgs = CommonUtil.split(selectedShiftOrg, delimiter);

			if (isOrganisationShift) {
				HpOrganisationD hpOrganisationD = new HpOrganisationD();
				hpOrganisationDDao.setDataSourceName(dataSource);

//				hpOrganisationD.addUpdateColumn("es_account_manager", shiftToId);
//				hpOrganisationD.addUpdateColumn("es_cs_consultant", shiftToId);
				hpOrganisationD.addUpdateColumn("es_customer_administrator", shiftToId);
				hpOrganisationD.addUpdateColumn("last_updated_by", "1");
				hpOrganisationD.addUpdateColumn("last_update_date", "sysdate", "Date");

				result += hpOrganisationDDao.updateColumns(selectedShiftOrgs, hpOrganisationD);
			}

			if (isPersonShift) {
				hpPersonDDao.setDataSourceName(dataSource);

				result += hpPersonDDao.shiftAccountFromOpportunity(selectedShiftOrgs, shiftToId);
				result += hpPersonDDao.shiftAccountFromAssignment(selectedShiftOrgs, shiftToId);
			}

			if (isOpportunityShift) {
				opportunityDao.setDataSourceName(dataSource);

				result += opportunityDao.shiftAccount(selectedShiftOrgs, shiftToId);
			}

			if (result <= 0) {
				throw new FrameworkException("E801", getMessage("E801", paramEntity));
			}

			paramEntity.setSuccess(true);
			paramEntity.setMessage("I801", getMessage("I801", paramEntity));
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity doUpdateEoExpenseStatus(ParamEntity paramEntity) throws Exception {
		DataSet dsReq = paramEntity.getRequestDataSet();
		String txaEoExpenseIds = dsReq.getValue("txaEoExpenseIds");
		String eoExpenseStatusTo = dsReq.getValue("eoExpenseStatusTo");
		String eoExpenseIds[];
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseQuickSearch"), ConfigUtil.getProperty("jdbc.user.name"));
		EoExpense eoExpense = new EoExpense();
		int result = 0;

		try {
			eoExpenseDao.setDataSourceName(dataSource);

			eoExpenseIds = CommonUtil.split(txaEoExpenseIds, "\n\r");

			eoExpense.addUpdateColumn("status", eoExpenseStatusTo);
			eoExpense.addUpdateColumn("last_updated_by", "1");
			eoExpense.addUpdateColumn("last_update_date", "sysdate", "Date");

			result = eoExpenseDao.updateStatusByIds(eoExpenseIds, eoExpense);
			if (result <= 0) {
				throw new FrameworkException("E801", getMessage("E801", paramEntity));
			}

			paramEntity.setSuccess(true);
			paramEntity.setMessage("I801", getMessage("I801", paramEntity));
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}
}