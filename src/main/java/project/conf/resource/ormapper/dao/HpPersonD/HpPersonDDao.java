/**************************************************************************************************
 * Framework Generated DAO Source
 * - HP_PERSON_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpPersonD;

import project.conf.resource.ormapper.dto.oracle.HpPersonD;
import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface HpPersonDDao extends IDao {
	/**
	 * Select HpPersonD object by personId
	 * @param personId
	 * @return
	 * @throws Exception
	 */
	public HpPersonD getPersonByPersonId(String personId) throws Exception;
	/**
	 * HpPersonD DataSet by QueryAdvisor
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getPersonDataSetByCriteria(QueryAdvisor queryAdvisor) throws Exception;
	/**
	 * For Quick search menu(QM20)
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getPersonDataSetForQuickMenu(QueryAdvisor queryAdvisor) throws Exception;
	/**
	 * Person Id, Number, fullName for auto completion
	 * @param queryAdvisor
	 * @return
	 * @throws Exception
	 */
	public DataSet getPersonBasicInfoForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception;
}