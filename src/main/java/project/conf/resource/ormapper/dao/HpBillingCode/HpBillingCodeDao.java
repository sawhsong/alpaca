/**************************************************************************************************
 * Framework Generated DAO Source
 * - HP_BILLING_CODE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpBillingCode;

import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface HpBillingCodeDao extends IDao {
	public DataSet getBillingCodeByCodeForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception;
}