/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_PERSON_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpPersonD;

import project.common.extend.BaseHDao;
import project.conf.resource.ormapper.dto.oracle.HpPersonD;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class HpPersonDHDaoImpl extends BaseHDao implements HpPersonDDao {
	public HpPersonD getPersonByPersonId(String personId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		queryAdvisor.addWhereClause("person_id = '"+personId+"'");
		return (HpPersonD)selectAllToDto(queryAdvisor, new HpPersonD());
	}

	public DataSet getPersonDataSetByCriteria(QueryAdvisor queryAdvisor) throws Exception {
		DataSet requestDataSet = queryAdvisor.getRequestDataSet();
		String dateFormat = ConfigUtil.getProperty("format.date.java");
		String personNumber = requestDataSet.getValue("personNumber");
		String name = requestDataSet.getValue("name");
		String email = requestDataSet.getValue("email");
		String empOrgId = requestDataSet.getValue("empOrgId");
		String personType = CommonUtil.lowerCase(requestDataSet.getValue("personType"));

		queryAdvisor.addAutoFillCriteria(personNumber, "person_number = '"+personNumber+"'");
		queryAdvisor.addAutoFillCriteria(name, "full_name = '"+name+"'");
		queryAdvisor.addAutoFillCriteria(email, "payslip_email like '"+email+"%'");
		queryAdvisor.addAutoFillCriteria(empOrgId, "employment_company_org_id = '"+empOrgId+"'");
		if (CommonUtil.isNotBlank(personType)) {
			String delimiter = ConfigUtil.getProperty("delimiter.record");
			String personTypes[] = CommonUtil.split(CommonUtil.trimToEmpty(personType), delimiter);
			String personTypeWhere = "";
			for (int i=0; i<personTypes.length; i++) {
				personTypeWhere += (CommonUtil.isNotBlank(personTypeWhere)) ? ", '"+personTypes[i]+"'" : "'"+personTypes[i]+"'";
			}
			queryAdvisor.addAutoFillCriteria(personTypeWhere, "lower(person_type) in ("+personTypeWhere+")");
		}
		queryAdvisor.addVariable("dateFormat", dateFormat);
		queryAdvisor.addOrderByClause("full_name");

		return selectAsDataSet(queryAdvisor, "query.HpPersonD.getPersonDataSetByCriteria");
	}

	public DataSet getPersonDataSetForQuickMenu(QueryAdvisor queryAdvisor) throws Exception {
		DataSet requestDataSet = queryAdvisor.getRequestDataSet();
		String dateFormat = ConfigUtil.getProperty("format.date.java");
		String personNumber = requestDataSet.getValue("personNumber");
		String name = requestDataSet.getValue("name");
		String email = requestDataSet.getValue("email");
		String empOrgId = requestDataSet.getValue("empOrgId");
		String personType = CommonUtil.lowerCase(requestDataSet.getValue("personType"));

		queryAdvisor.addAutoFillCriteria(personNumber, "per.person_number = '"+personNumber+"'");
		queryAdvisor.addAutoFillCriteria(name, "per.full_name = '"+name+"'");
		queryAdvisor.addAutoFillCriteria(email, "per.payslip_email like '"+email+"%'");
		queryAdvisor.addAutoFillCriteria(empOrgId, "per.employment_company_org_id = '"+empOrgId+"'");
		if (CommonUtil.isNotBlank(personType)) {
			String delimiter = ConfigUtil.getProperty("delimiter.record");
			String personTypes[] = CommonUtil.split(CommonUtil.trimToEmpty(personType), delimiter);
			String personTypeWhere = "";
			for (int i=0; i<personTypes.length; i++) {
				personTypeWhere += (CommonUtil.isNotBlank(personTypeWhere)) ? ", '"+personTypes[i]+"'" : "'"+personTypes[i]+"'";
			}
			queryAdvisor.addAutoFillCriteria(personTypeWhere, "lower(per.person_type) in ("+personTypeWhere+")");
		}
		queryAdvisor.addVariable("dateFormat", dateFormat);
		queryAdvisor.addOrderByClause("per.surname, per.first_name");

		return selectAsDataSet(queryAdvisor, "query.HpPersonD.getPersonDataSetForQuickMenu");
	}

	public DataSet getPersonBasicInfoForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception {
		return selectAsDataSet(queryAdvisor, "query.HpPersonD.getPersonNumberForAutoCompletion");
	}
}