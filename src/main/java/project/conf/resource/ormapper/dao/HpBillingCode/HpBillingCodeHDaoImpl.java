/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_BILLING_CODE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpBillingCode;

import project.common.extend.BaseHDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public class HpBillingCodeHDaoImpl extends BaseHDao implements HpBillingCodeDao {
	public DataSet getBillingCodeByCodeForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpBillingCode.getBillingCodeByCodeForAutoCompletion");
	}
}