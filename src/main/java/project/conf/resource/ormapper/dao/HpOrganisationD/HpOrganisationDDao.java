/**************************************************************************************************
 * Framework Generated DAO Source
 * - HP_ORGANISATION_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpOrganisationD;

import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface HpOrganisationDDao extends IDao {
	/**
	 * Select Employment Org for common organisation lookup(common search popup)
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getEmploymentOrganisationLookup(QueryAdvisor queryAdvisor) throws Exception;
}