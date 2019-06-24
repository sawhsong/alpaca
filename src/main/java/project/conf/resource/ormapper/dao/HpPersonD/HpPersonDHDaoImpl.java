/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_PERSON_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpPersonD;

import project.common.extend.BaseHDao;
import project.common.module.commoncode.CommonCodeManager;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class HpPersonDHDaoImpl extends BaseHDao implements HpPersonDDao {
	public DataSet getPersonDataSetByCriteria(QueryAdvisor queryAdvisor) throws Exception{
		DataSet requestDataSet = queryAdvisor.getRequestDataSet();
		String dateFormat = ConfigUtil.getProperty("format.date.java");
		String personNumber = requestDataSet.getValue("personNumber");
		String name = requestDataSet.getValue("name");
		String email = requestDataSet.getValue("email");
		String empOrgId = requestDataSet.getValue("empOrgId");
		String personType = requestDataSet.getValue("personType");

		queryAdvisor.addAutoFillCriteria(personNumber, "person_number = '"+personNumber+"'");
		queryAdvisor.addAutoFillCriteria(name, "full_name = '"+name+"'");
		queryAdvisor.addAutoFillCriteria(email, "payslip_email like '"+email+"%'");
		queryAdvisor.addAutoFillCriteria(empOrgId, "employment_company_org_id = '"+empOrgId+"'");
		queryAdvisor.addVariable("dateFormat", dateFormat);
		queryAdvisor.addOrderByClause("full_name");

		return selectAsDataSet(queryAdvisor, "query.HpPersonD.getPersonDataSetByCriteria");
	}

	public DataSet getPersonBasicInfoForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpPersonD.getPersonNumberForAutoCompletion");
	}
}