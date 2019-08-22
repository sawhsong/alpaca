/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_ASSIGNMENTS_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpAssignmentsD;

import project.common.extend.BaseHDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public class HpAssignmentsDHDaoImpl extends BaseHDao implements HpAssignmentsDDao {
	public DataSet getAssignmentList(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpAssignmentsD.getAssignmentList");
	}
}