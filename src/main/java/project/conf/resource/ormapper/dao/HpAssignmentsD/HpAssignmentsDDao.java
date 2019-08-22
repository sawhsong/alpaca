/**************************************************************************************************
 * Framework Generated DAO Source
 * - HP_ASSIGNMENTS_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpAssignmentsD;

import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface HpAssignmentsDDao extends IDao {
	public DataSet getAssignmentList(QueryAdvisor queryAdvisor) throws Exception;
}