package project.common.module.bizservice.assignment;

import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface AssignmentBizService {
	public DataSet getAssignmentList(QueryAdvisor queryAdvisor) throws Exception;
}