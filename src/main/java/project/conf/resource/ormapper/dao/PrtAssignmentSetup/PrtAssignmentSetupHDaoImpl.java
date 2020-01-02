/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - PRT_ASSIGNMENT_SETUP - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.PrtAssignmentSetup;

import project.common.extend.BaseHDao;
import project.conf.resource.ormapper.dto.oracle.PrtAssignmentSetup;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.util.ConfigUtil;

public class PrtAssignmentSetupHDaoImpl extends BaseHDao implements PrtAssignmentSetupDao {
	public DataSet getByAssignmentId(String assignmentId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		String dateFormat = ConfigUtil.getProperty("format.date.java");

		queryAdvisor.addVariable("dateFormat", dateFormat);
		queryAdvisor.addWhereClause("assignment_id = '"+assignmentId+"'");
		return selectAsDataSet(queryAdvisor, "query.PrtAssignmentSetup.getByAssignmentId");
	}

	public DataSet getLatestDataSetByAssignmentId(String assignmentId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		String dateFormat = ConfigUtil.getProperty("format.date.java");

		queryAdvisor.addVariable("dateFormat", dateFormat);
		queryAdvisor.addVariable("assignmentId", assignmentId);
		return selectAsDataSet(queryAdvisor, "query.PrtAssignmentSetup.getLatestDataSetByAssignmentId");
	}

	public int deleteByAssignmentId(String assignmentId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();

		queryAdvisor.addWhereClause("assignment_id = '"+assignmentId+"'");
		return deleteWithSQLQuery(queryAdvisor, new PrtAssignmentSetup());
	}
}