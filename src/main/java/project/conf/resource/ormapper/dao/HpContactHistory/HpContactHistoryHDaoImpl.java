/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_CONTACT_HISTORY - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpContactHistory;

import project.common.extend.BaseHDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.util.ConfigUtil;

public class HpContactHistoryHDaoImpl extends BaseHDao implements HpContactHistoryDao {
	public DataSet getContactHistoryForPersonalInfoByPersonId(String personId) throws Exception {
		QueryAdvisor qa = new QueryAdvisor();
		String dateFormat = ConfigUtil.getProperty("format.date.java");

		qa.addVariable("dateFormat", dateFormat);
		qa.addVariable("personId", personId);

		return selectAsDataSet(qa, "query.HpContactHistory.getContactHistoryForPersonalInfoByPersonId");
	}
}