/**************************************************************************************************
 * Framework Generated DAO Source
 * - HP_PERSON_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpPersonD;

import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface HpPersonDDao extends IDao {
	/**
	 * Person Id, Number, fullName for auto completion
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getPersonBasicInfoForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception;
}