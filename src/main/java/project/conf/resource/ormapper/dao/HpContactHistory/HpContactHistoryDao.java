/**************************************************************************************************
 * Framework Generated DAO Source
 * - HP_CONTACT_HISTORY - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpContactHistory;

import zebra.base.IDao;
import zebra.data.DataSet;

public interface HpContactHistoryDao extends IDao {
	public DataSet getContactHistoryForPersonalInfoByPersonId(String personId) throws Exception;
}