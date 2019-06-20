package project.common.module.autocompletion;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.extend.BaseBiz;
import project.conf.resource.ormapper.dao.HpOrganisationD.HpOrganisationDDao;
import project.conf.resource.ormapper.dao.HpPersonD.HpPersonDDao;
import project.conf.resource.ormapper.dao.SysCommonCode.SysCommonCodeDao;
import project.conf.resource.ormapper.dao.SysCountryCurrency.SysCountryCurrencyDao;
import project.conf.resource.ormapper.dao.SysUser.SysUserDao;
import zebra.data.DataSet;
import zebra.data.ParamEntity;
import zebra.data.QueryAdvisor;
import zebra.exception.FrameworkException;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class AutoCompletionBizImpl extends BaseBiz implements AutoCompletionBiz {
	@Autowired
	private SysCommonCodeDao sysCommonCodeDao;
	@Autowired
	private SysUserDao sysUserDao;
	@Autowired
	private SysCountryCurrencyDao sysCountryCurrencyDao;
	@Autowired
	private HpOrganisationDDao hpOrganisationDDao;
	@Autowired
	private HpPersonDDao hpPersonDDao;

	public ParamEntity getCommonCodeType(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		String inputValue = requestDataSet.getValue("inputValue");

		try {
			paramEntity.setAjaxResponseDataSet(sysCommonCodeDao.getActiveCodeTypeDataSetLikeCodeType(inputValue));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getUserId(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();
		String inputValue = requestDataSet.getValue("inputValue");

		try {
			queryAdvisor.addAutoFillCriteria(inputValue, "lower(user_id) like lower('"+inputValue+"%')");
			queryAdvisor.addOrderByClause("user_name");
			paramEntity.setAjaxResponseDataSet(sysUserDao.getUserNameDataSetForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getLoginId(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();
		String inputValue = requestDataSet.getValue("inputValue");

		try {
			queryAdvisor.addAutoFillCriteria(inputValue, "lower(login_id) like lower('"+inputValue+"%')");
			queryAdvisor.addOrderByClause("login_id");
			paramEntity.setAjaxResponseDataSet(sysUserDao.getUserNameDataSetForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getUserName(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();

		try {
			queryAdvisor.setRequestDataSet(requestDataSet);
			paramEntity.setAjaxResponseDataSet(sysUserDao.getUserNameDataSetForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getCurrencyCode(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();

		try {
			queryAdvisor.setRequestDataSet(requestDataSet);
			paramEntity.setAjaxResponseDataSet(sysCountryCurrencyDao.getCurrencyCodeDataSetForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getCountryName(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();

		try {
			queryAdvisor.setRequestDataSet(requestDataSet);
			paramEntity.setAjaxResponseDataSet(sysCountryCurrencyDao.getCountryNameDataSetForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getOrgName(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();
		String inputValue = requestDataSet.getValue("inputValue");
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseForAdminTool"), ConfigUtil.getProperty("jdbc.user.name"));

		try {
			hpOrganisationDDao.setDataSourceName(dataSource);

			queryAdvisor.addAutoFillCriteria(inputValue, "lower(organisation_name) like lower('"+inputValue+"%')");
			queryAdvisor.addOrderByClause("organisation_name asc");

			paramEntity.setAjaxResponseDataSet(hpOrganisationDDao.getOrgNameDataSetForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getAbn(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();
		String inputValue = requestDataSet.getValue("inputValue");
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseForAdminTool"), ConfigUtil.getProperty("jdbc.user.name"));

		try {
			hpOrganisationDDao.setDataSourceName(dataSource);

			queryAdvisor.addAutoFillCriteria(inputValue, "abn like ('"+inputValue+"%')");
			queryAdvisor.addOrderByClause("abn asc");

			paramEntity.setAjaxResponseDataSet(hpOrganisationDDao.getAbnDataSetForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getPersonNumber(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();
		String inputValue = requestDataSet.getValue("inputValue");
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseForAdminTool"), ConfigUtil.getProperty("jdbc.user.name"));

		try {
			hpPersonDDao.setDataSourceName(dataSource);

			queryAdvisor.addAutoFillCriteria(inputValue, "lower(person_number) like lower('"+inputValue+"%')");
			queryAdvisor.addOrderByClause("person_number");

			paramEntity.setAjaxResponseDataSet(hpPersonDDao.getPersonBasicInfoForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getPersonName(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		QueryAdvisor queryAdvisor = paramEntity.getQueryAdvisor();
		String inputValue = requestDataSet.getValue("inputValue");
		HttpSession session = paramEntity.getSession();
		String dataSource = CommonUtil.nvl((String)session.getAttribute("DatabaseForAdminTool"), ConfigUtil.getProperty("jdbc.user.name"));

		try {
			hpPersonDDao.setDataSourceName(dataSource);

			queryAdvisor.addAutoFillCriteria(inputValue, "lower(full_name) like lower('"+inputValue+"%')");
			queryAdvisor.addOrderByClause("full_name");

			paramEntity.setAjaxResponseDataSet(hpPersonDDao.getPersonBasicInfoForAutoCompletion(queryAdvisor));
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}
}