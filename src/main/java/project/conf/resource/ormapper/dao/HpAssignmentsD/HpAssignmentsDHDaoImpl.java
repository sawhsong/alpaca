/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_ASSIGNMENTS_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpAssignmentsD;

import project.common.extend.BaseHDao;
import project.conf.resource.ormapper.dto.oracle.HpAssignmentsD;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public class HpAssignmentsDHDaoImpl extends BaseHDao implements HpAssignmentsDDao {
	public int updateColumn(String assignmentId, HpAssignmentsD hpAssignmentsD) throws Exception {
		QueryAdvisor qa = new QueryAdvisor();

		qa.addWhereClause("assignment_id = '"+assignmentId+"'");
		return updateColumns(qa, hpAssignmentsD);
	}

	public DataSet getAssignmentList(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpAssignmentsD.getAssignmentList");
	}

	public HpAssignmentsD getByAssignmentId(String assignmentId) throws Exception {
		QueryAdvisor qa = new QueryAdvisor();
		qa.addWhereClause("assignment_id = '"+assignmentId+"'");
		return (HpAssignmentsD)selectAllToDto(qa, new HpAssignmentsD());
	}
}