/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_ORGANISATION_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpOrganisationD;

import project.common.extend.BaseHDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.util.CommonUtil;

public class HpOrganisationDHDaoImpl extends BaseHDao implements HpOrganisationDDao {
	public DataSet getOrganisationDataSetForQuickMenu(QueryAdvisor queryAdvisor) throws Exception {
		DataSet requestDataSet = queryAdvisor.getRequestDataSet();
		String orgId = requestDataSet.getValue("orgId");
		String orgName = CommonUtil.lowerCase(requestDataSet.getValue("orgName"));
		String orgType = requestDataSet.getValue("orgType");
		String orgRelationship = CommonUtil.lowerCase(requestDataSet.getValue("orgRelationship"));
		String cscId = requestDataSet.getValue("cscId");
		String crmId = requestDataSet.getValue("crmId");
		String orgState = requestDataSet.getValue("orgState");
		String orgCountry = requestDataSet.getValue("orgCountry");

		queryAdvisor.addAutoFillCriteria(orgId, "organisation_id = '"+orgId+"'");
		queryAdvisor.addAutoFillCriteria(orgName, "lower(organisation_name) like '%"+orgName+"%'");
		queryAdvisor.addAutoFillCriteria(orgType, "organisation_type = '"+orgType+"%'");
		queryAdvisor.addAutoFillCriteria(orgRelationship, "lower(relationship) like '%"+orgRelationship+"%'");
		queryAdvisor.addAutoFillCriteria(cscId, "es_payroll_consultant = '"+cscId+"'");
		queryAdvisor.addAutoFillCriteria(crmId, "es_account_manager = '"+crmId+"'");
		queryAdvisor.addAutoFillCriteria(orgState, "state = '"+orgState+"'");
		queryAdvisor.addAutoFillCriteria(orgCountry, "country = '"+orgCountry+"'");

		queryAdvisor.addOrderByClause("organisation_name");

		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getOrganisationDataSetForQuickMenu");
	}

	public DataSet getOrgNameDataSetForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getOrgNameDataSetForAutoCompletion");
	}

	public DataSet getAbnDataSetForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getOrgNameDataSetForAutoCompletion");
	}

	public DataSet getEmploymentOrganisationLookup(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getEmploymentOrganisationLookup");
	}
}