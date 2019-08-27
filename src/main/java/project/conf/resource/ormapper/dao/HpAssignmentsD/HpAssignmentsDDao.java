/**************************************************************************************************
 * Framework Generated DAO Source
 * - HP_ASSIGNMENTS_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpAssignmentsD;

import project.conf.resource.ormapper.dto.oracle.HpAssignmentsD;
import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface HpAssignmentsDDao extends IDao {
	public int updateColumn(String assignmentId, HpAssignmentsD hpAssignmentsD) throws Exception;
	public DataSet getAssignmentList(QueryAdvisor queryAdvisor) throws Exception;
	public HpAssignmentsD getByAssignmentId(String assignmentId) throws Exception;
}