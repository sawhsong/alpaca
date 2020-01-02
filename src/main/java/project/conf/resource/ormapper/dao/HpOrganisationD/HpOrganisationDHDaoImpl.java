/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_ORGANISATION_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpOrganisationD;

import project.common.extend.BaseHDao;
import project.conf.resource.ormapper.dto.oracle.HpOrganisationD;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.util.CommonUtil;

public class HpOrganisationDHDaoImpl extends BaseHDao implements HpOrganisationDDao {
	public int updateColumns(String organisationId, HpOrganisationD hpOrganisationD) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		queryAdvisor.addWhereClause("organisation_id = '"+organisationId+"'");
		return updateColumns(queryAdvisor, hpOrganisationD);
	}

	public HpOrganisationD getOrganisationByOrganisationId(String organisationId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		queryAdvisor.addWhereClause("organisation_id = '"+organisationId+"'");
		return (HpOrganisationD)selectAllToDto(queryAdvisor, new HpOrganisationD());
	}

	public DataSet getDataSetByOrganisationIds(String... organisationIds) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		String ids = "";
		String excludeOrgIds = "'1811', '3071', '3', '93191'";

		for (String id : organisationIds) {
			ids += (CommonUtil.isBlank(ids)) ? "'"+id+"'" : ", "+"'"+id+"'";
		}
		queryAdvisor.addVariable("organisationIds", ids);
		queryAdvisor.addAutoFillCriteria(excludeOrgIds, "organisation_id not in ("+excludeOrgIds+")");
		queryAdvisor.addOrderByClause("organisation_name");

		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getDataSetByOrganisationIds");
	}

	public DataSet getOrganisationDataSetForQuickMenu(QueryAdvisor queryAdvisor) throws Exception {
		DataSet requestDataSet = queryAdvisor.getRequestDataSet();
		String orgId = requestDataSet.getValue("orgId");
		String orgName = CommonUtil.lowerCase(requestDataSet.getValue("orgName"));
		String orgType = requestDataSet.getValue("orgType");
		String orgRelationship = CommonUtil.lowerCase(requestDataSet.getValue("orgRelationship"));
		String cscId = requestDataSet.getValue("cscId");
		String crmId = requestDataSet.getValue("crmId");
		String orgState = requestDataSet.getValue("orgState");
		String orgCountry = requestDataSet.getValue("orgCountryName");

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

	public DataSet getOrgInfoDataSetForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getOrgInfoDataSetForAutoCompletion");
	}

	public DataSet getBillingOrgByNameForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getBillingOrgByNameForAutoCompletion");
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