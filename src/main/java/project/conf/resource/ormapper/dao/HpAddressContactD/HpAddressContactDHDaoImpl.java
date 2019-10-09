/**************************************************************************************************
 * Framework Generated HDAOImpl Source
 * - HP_ADDRESS_CONTACT_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dao.HpAddressContactD;

import project.common.extend.BaseHDao;
import project.conf.resource.ormapper.dto.oracle.HpAddressContactD;
import zebra.data.QueryAdvisor;

public class HpAddressContactDHDaoImpl extends BaseHDao implements HpAddressContactDDao {
	public HpAddressContactD getAddressContactByPersonId(String personId) throws Exception {
		QueryAdvisor queryAdvisor = new QueryAdvisor();
		queryAdvisor.addWhereClause("person_id = '"+personId+"'");
		return (HpAddressContactD)selectAllToDto(queryAdvisor, new HpAddressContactD());
	}
}