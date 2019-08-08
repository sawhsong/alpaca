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
	 * For Quick Menu
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getOrganisationDataSetForQuickMenu(QueryAdvisor queryAdvisor) throws Exception;
	/**
	 * Select Org Id, Org Name for auto completion
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getOrgNameDataSetForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception;
	/**
	 * Select Org ABN for auto completion
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getAbnDataSetForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception;
	/**
	 * Select Employment Org for common organisation lookup(common search popup)
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getEmploymentOrganisationLookup(QueryAdvisor queryAdvisor) throws Exception;
}