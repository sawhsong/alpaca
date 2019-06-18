package project.common.module.commonlookup;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseBiz;
import project.conf.resource.ormapper.dao.HpOrganisationD.HpOrganisationDDao;
import zebra.data.DataSet;
import zebra.data.ParamEntity;
import zebra.data.QueryAdvisor;
import zebra.exception.FrameworkException;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class CommonLookupBizImpl extends BaseBiz implements CommonLookupBiz {
	@Autowired
	private HpOrganisationDDao hpOrganisationDDao;

	public ParamEntity getDefault(ParamEntity paramEntity) throws Exception {
		try {
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getEmploymentOrganisationLookup(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();
		String empOrgName = requestDataSet.getValue("empOrgName");
		String abn = requestDataSet.getValue("abn");
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseForAdminTool"), ConfigUtil.getProperty("jdbc.user.name"));

		try {
			hpOrganisationDDao.setDataSourceName(dataSource);

			queryAdvisor.setPagination(true);

			queryAdvisor.addAutoFillCriteria(empOrgName, "lower(organisation_name) like lower('"+empOrgName+"%')");
			queryAdvisor.addAutoFillCriteria(abn, "abn like '%"+abn+"%'");
			queryAdvisor.addOrderByClause("organisation_name asc");

			paramEntity.setAjaxResponseDataSet(hpOrganisationDDao.getEmploymentOrganisationLookup(queryAdvisor));
			paramEntity.setTotalResultRows(queryAdvisor.getTotalResultRows());
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}
}