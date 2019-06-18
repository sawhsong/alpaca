/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_ORGANISATION_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpOrganisationD;

import project.common.extend.BaseHDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public class HpOrganisationDHDaoImpl extends BaseHDao implements HpOrganisationDDao {
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