package project.conf.resource.ormapper.dao.ProjectDummy;

import java.util.Date;

import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;

public interface ProjectDummyDao extends IDao {
	public DataSet getFinacialYear() throws Exception;
	public DataSet getFinacialYear(Date date) throws Exception;
	public DataSet getDatabaseSessionList(QueryAdvisor queryAdvisor) throws Exception;
	public DataSet getSqlTextBySqlId(String sqlId) throws Exception;
	public int killSessions(String ids[]) throws Exception;
}