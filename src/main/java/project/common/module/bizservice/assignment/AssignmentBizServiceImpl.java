package project.common.module.bizservice.assignment;

import org.springframework.beans.factory.annotation.Autowired;

import project.conf.resource.ormapper.dao.HpAssignmentsD.HpAssignmentsDDao;
import project.conf.resource.ormapper.dto.oracle.HpAssignmentsD;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.example.common.extend.BaseBiz;

public class AssignmentBizServiceImpl extends BaseBiz implements AssignmentBizService {
	@Autowired
	private HpAssignmentsDDao hpAssignmentsDDao;

	public DataSet getAssignmentList(QueryAdvisor queryAdvisor) throws Exception {
		DataSet ds = new DataSet();

		hpAssignmentsDDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		ds = hpAssignmentsDDao.getAssignmentList(queryAdvisor);
		return ds;
	}

	public HpAssignmentsD getAssignmentByAssignmentId(QueryAdvisor queryAdvisor, String assignmentId) throws Exception {
		hpAssignmentsDDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return hpAssignmentsDDao.getByAssignmentId(assignmentId);
	}

	public DataSet getAssignmentAsDataSetByAssignmentId(QueryAdvisor queryAdvisor, String assignmentId) throws Exception {
		hpAssignmentsDDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return hpAssignmentsDDao.getDataSetByAssignmentId(assignmentId);
	}

	public int updateWorkingState(QueryAdvisor queryAdvisor, String assignmentId, String toWorkingState) throws Exception {
		HpAssignmentsD hpAssignmentsD = new HpAssignmentsD();

		hpAssignmentsD.addUpdateColumn("working_state", toWorkingState);
		hpAssignmentsD.addUpdateColumn("last_updated_by", "1");
		hpAssignmentsD.addUpdateColumn("last_update_date", "sysdate", "Date");

		queryAdvisor.addWhereClause("assignment_id = '"+assignmentId+"'");

		hpAssignmentsDDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));

		return hpAssignmentsDDao.updateAssignmentByColumn(queryAdvisor, hpAssignmentsD);
	}
}