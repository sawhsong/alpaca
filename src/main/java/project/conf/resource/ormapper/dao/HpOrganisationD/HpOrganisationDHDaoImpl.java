/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_ORGANISATION_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpOrganisationD;

import project.common.extend.BaseHDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public class HpOrganisationDHDaoImpl extends BaseHDao implements HpOrganisationDDao {
	public DataSet getEmploymentOrganisationLookup(QueryAdvisor queryAdvisor) throws Exception {
		DataSet requestDataSet = queryAdvisor.getRequestDataSet();
		String empOrgName = requestDataSet.getValue("empOrgName");
		String abn = requestDataSet.getValue("abn");

		queryAdvisor.addAutoFillCriteria(empOrgName, "lower(organisation_name) like lower('%"+empOrgName+"%')");
		queryAdvisor.addAutoFillCriteria(abn, "abn like '%"+abn+"%'");
		queryAdvisor.addOrderByClause("organisation_name asc");

		return selectAsDataSet(queryAdvisor, "query.HpOrganisationD.getEmploymentOrganisationLookup");
	}
}