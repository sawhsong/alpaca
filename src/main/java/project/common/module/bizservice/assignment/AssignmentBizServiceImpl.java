package project.common.module.bizservice.assignment;

import org.springframework.beans.factory.annotation.Autowired;

import project.conf.resource.ormapper.dao.HpAssignmentsD.HpAssignmentsDDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.example.common.extend.BaseBiz;
import zebra.exception.FrameworkException;

public class AssignmentBizServiceImpl extends BaseBiz implements AssignmentBizService {
	@Autowired
	private HpAssignmentsDDao hpAssignmentsDDao;

	public DataSet getAssignmentList(QueryAdvisor queryAdvisor) throws Exception {
		DataSet ds = new DataSet();

		try {
			hpAssignmentsDDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
			ds = hpAssignmentsDDao.getAssignmentList(queryAdvisor);
		} catch (Exception ex) {
			throw new FrameworkException(ex);
		}
		return ds;
	}
}