/**************************************************************************************************
 * Framework Generated DTO Source
 * - CUSTOMER_CMPLX_RTNG - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class CustomerCmplxRtng extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String comms;
	private String COMMS;
	private String crm;
	private String CRM;
	private String crmCmplx;
	private String CRM_CMPLX;
	private String crmCmplxRson;
	private String CRM_CMPLX_RSON;
	private String csa;
	private String CSA;
	private String csaCmplx;
	private String CSA_CMPLX;
	private String csaCmplxRson;
	private String CSA_CMPLX_RSON;
	private String csc;
	private String CSC;
	private String cscCmplx;
	private String CSC_CMPLX;
	private String cscCmplxRson;
	private String CSC_CMPLX_RSON;
	private String csd;
	private String CSD;
	private String csm;
	private String CSM;
	private String csmCmplx;
	private String CSM_CMPLX;
	private String csmCmplxRson;
	private String CSM_CMPLX_RSON;
	private String customerStream;
	private String CUSTOMER_STREAM;
	private String invoices;
	private String INVOICES;
	private String ipros;
	private String IPROS;
	private String nextActions;
	private String NEXT_ACTIONS;
	private String opportunity;
	private String OPPORTUNITY;
	private String organisationName;
	private String ORGANISATION_NAME;
	private String revenue;
	private String REVENUE;
	private String skCmplx;
	private String SK_CMPLX;
	private String skCmplxRson;
	private String SK_CMPLX_RSON;
	private String totalBilling;
	private String TOTAL_BILLING;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public CustomerCmplxRtng() throws Exception {
		Class cls = getClass();
		Field field[] = cls.getDeclaredFields();

		for (int i=0; i<field.length; i++) {
			if (field[i].getType().isInstance(dataSet) || field[i].getType().isInstance(updateColumnsDataSet) || field[i].getName().equals("updateColumnsDataSetHeader") ||
				field[i].getName().equals("FRW_VAR_PRIMARY_KEY") || field[i].getName().equals("FRW_VAR_DATE_COLUMN") ||
				field[i].getName().equals("FRW_VAR_NUMBER_COLUMN") || field[i].getName().equals("FRW_VAR_CLOB_COLUMN") ||
				field[i].getName().equals("FRW_VAR_DEFAULT_COLUMN") || field[i].getName().equals("FRW_VAR_DEFAULT_VALUE") ||
				!CommonUtil.isUpperCaseWithNumeric(CommonUtil.remove(field[i].getName(), "_"))) {
				continue;
			}

			dataSet.addName(field[i].getName());
		}

		dataSet.addRow();
		updateColumnsDataSet.addName(updateColumnsDataSetHeader);
		setFrwVarPrimaryKey("");
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getComms() {
		return comms;
	}

	public void setComms(String comms) throws Exception {
		this.comms = comms;
		setValueFromAccessor("COMMS", comms);
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) throws Exception {
		this.crm = crm;
		setValueFromAccessor("CRM", crm);
	}

	public String getCrmCmplx() {
		return crmCmplx;
	}

	public void setCrmCmplx(String crmCmplx) throws Exception {
		this.crmCmplx = crmCmplx;
		setValueFromAccessor("CRM_CMPLX", crmCmplx);
	}

	public String getCrmCmplxRson() {
		return crmCmplxRson;
	}

	public void setCrmCmplxRson(String crmCmplxRson) throws Exception {
		this.crmCmplxRson = crmCmplxRson;
		setValueFromAccessor("CRM_CMPLX_RSON", crmCmplxRson);
	}

	public String getCsa() {
		return csa;
	}

	public void setCsa(String csa) throws Exception {
		this.csa = csa;
		setValueFromAccessor("CSA", csa);
	}

	public String getCsaCmplx() {
		return csaCmplx;
	}

	public void setCsaCmplx(String csaCmplx) throws Exception {
		this.csaCmplx = csaCmplx;
		setValueFromAccessor("CSA_CMPLX", csaCmplx);
	}

	public String getCsaCmplxRson() {
		return csaCmplxRson;
	}

	public void setCsaCmplxRson(String csaCmplxRson) throws Exception {
		this.csaCmplxRson = csaCmplxRson;
		setValueFromAccessor("CSA_CMPLX_RSON", csaCmplxRson);
	}

	public String getCsc() {
		return csc;
	}

	public void setCsc(String csc) throws Exception {
		this.csc = csc;
		setValueFromAccessor("CSC", csc);
	}

	public String getCscCmplx() {
		return cscCmplx;
	}

	public void setCscCmplx(String cscCmplx) throws Exception {
		this.cscCmplx = cscCmplx;
		setValueFromAccessor("CSC_CMPLX", cscCmplx);
	}

	public String getCscCmplxRson() {
		return cscCmplxRson;
	}

	public void setCscCmplxRson(String cscCmplxRson) throws Exception {
		this.cscCmplxRson = cscCmplxRson;
		setValueFromAccessor("CSC_CMPLX_RSON", cscCmplxRson);
	}

	public String getCsd() {
		return csd;
	}

	public void setCsd(String csd) throws Exception {
		this.csd = csd;
		setValueFromAccessor("CSD", csd);
	}

	public String getCsm() {
		return csm;
	}

	public void setCsm(String csm) throws Exception {
		this.csm = csm;
		setValueFromAccessor("CSM", csm);
	}

	public String getCsmCmplx() {
		return csmCmplx;
	}

	public void setCsmCmplx(String csmCmplx) throws Exception {
		this.csmCmplx = csmCmplx;
		setValueFromAccessor("CSM_CMPLX", csmCmplx);
	}

	public String getCsmCmplxRson() {
		return csmCmplxRson;
	}

	public void setCsmCmplxRson(String csmCmplxRson) throws Exception {
		this.csmCmplxRson = csmCmplxRson;
		setValueFromAccessor("CSM_CMPLX_RSON", csmCmplxRson);
	}

	public String getCustomerStream() {
		return customerStream;
	}

	public void setCustomerStream(String customerStream) throws Exception {
		this.customerStream = customerStream;
		setValueFromAccessor("CUSTOMER_STREAM", customerStream);
	}

	public String getInvoices() {
		return invoices;
	}

	public void setInvoices(String invoices) throws Exception {
		this.invoices = invoices;
		setValueFromAccessor("INVOICES", invoices);
	}

	public String getIpros() {
		return ipros;
	}

	public void setIpros(String ipros) throws Exception {
		this.ipros = ipros;
		setValueFromAccessor("IPROS", ipros);
	}

	public String getNextActions() {
		return nextActions;
	}

	public void setNextActions(String nextActions) throws Exception {
		this.nextActions = nextActions;
		setValueFromAccessor("NEXT_ACTIONS", nextActions);
	}

	public String getOpportunity() {
		return opportunity;
	}

	public void setOpportunity(String opportunity) throws Exception {
		this.opportunity = opportunity;
		setValueFromAccessor("OPPORTUNITY", opportunity);
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) throws Exception {
		this.organisationName = organisationName;
		setValueFromAccessor("ORGANISATION_NAME", organisationName);
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) throws Exception {
		this.revenue = revenue;
		setValueFromAccessor("REVENUE", revenue);
	}

	public String getSkCmplx() {
		return skCmplx;
	}

	public void setSkCmplx(String skCmplx) throws Exception {
		this.skCmplx = skCmplx;
		setValueFromAccessor("SK_CMPLX", skCmplx);
	}

	public String getSkCmplxRson() {
		return skCmplxRson;
	}

	public void setSkCmplxRson(String skCmplxRson) throws Exception {
		this.skCmplxRson = skCmplxRson;
		setValueFromAccessor("SK_CMPLX_RSON", skCmplxRson);
	}

	public String getTotalBilling() {
		return totalBilling;
	}

	public void setTotalBilling(String totalBilling) throws Exception {
		this.totalBilling = totalBilling;
		setValueFromAccessor("TOTAL_BILLING", totalBilling);
	}

	public String getInsertUserName() {
		return insertUserName;
	}

	public void setInsertUserName(String insertUserName) throws Exception {
		this.insertUserName = insertUserName;
		setValueFromAccessor("INSERT_USER_NAME", insertUserName);
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) throws Exception {
		this.updateUserName = updateUserName;
		setValueFromAccessor("UPDATE_USER_NAME", updateUserName);
	}

	/**
	 * Hibernate Methods - If the primary key is composed of multiple columns
	 */
	
	/**
	 * Framework Methods
	 */
	public void setDefaultValue() throws Exception {
		String columns[] = CommonUtil.split(getFrwVarDefaultColumn(), ",");
		String values[] = CommonUtil.split(getFrwVarDefaultValue(), ",");

		if (CommonUtil.isNotEmpty(columns)) {
			for (int i=0; i<columns.length; i++) {
				setValue(columns[i], values[i]);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void setValue(String columnName, String value) throws Exception {
		Class cls = getClass();
		Field field[] = cls.getDeclaredFields();

		dataSet.setValue(dataSet.getRowCnt()-1, columnName, value);
		for (int i=0; i<field.length; i++) {
			if (field[i].getName().equals(CommonUtil.toCamelCaseStartLowerCase(columnName))) {
				if (CommonUtil.isIn(columnName, CommonUtil.split(getFrwVarNumberColumn(), ","))) {
					field[i].set(this, CommonUtil.toDouble(value));
				} else if (CommonUtil.isIn(columnName, CommonUtil.split(getFrwVarDateColumn(), ","))) {
					if (CommonUtil.equalsIgnoreCase(value, "SYSDATE") || CommonUtil.containsIgnoreCase(value, "SYSDATE")) {
						field[i].set(this, CommonUtil.toDate(CommonUtil.getSysdate()));
					} else {
						field[i].set(this, CommonUtil.toDate(value));
					}
				} else {
					field[i].set(this, value);
				}
			}
		}
	}

	public void setValues(DataSet dataSet) throws Exception {
		for (int i=0; i<dataSet.getColumnCnt(); i++) {
			setValue(dataSet.getName(i), dataSet.getValue(i));
		}
	}

	public void setValues(DataSet dataSet, int rowIndex) throws Exception {
		for (int i=0; i<dataSet.getColumnCnt(); i++) {
			setValue(dataSet.getName(i), dataSet.getValue(rowIndex, i));
		}
	}

	private void setValueFromAccessor(String columnName, String value) throws Exception {
		dataSet.setValue(dataSet.getRowCnt()-1, columnName, value);
	}

	public void setConvertedTypeValue(String columnName, String value) throws Exception {
		String numberColumn = "", dateColumn = "";

		numberColumn = getFrwVarNumberColumn();
		dateColumn = getFrwVarDateColumn();

		setValue(columnName, value);

		numberColumn += (CommonUtil.isEmpty(numberColumn)) ? CommonUtil.upperCase(columnName) : "," + CommonUtil.upperCase(columnName);
		dateColumn = CommonUtil.replace(dateColumn, columnName, "");

		setFrwVarNumberColumn(numberColumn);
		setFrwVarDateColumn(dateColumn);
	}

	public String getValue(String columnName) throws Exception {
		return dataSet.getValue(dataSet.getRowCnt()-1, columnName);
	}

	public void addUpdateColumn(String columnName, String columnValue) throws Exception {
		String dataType = "";

		if (CommonUtil.isIn(columnName, CommonUtil.split(getFrwVarNumberColumn(), ","))) {
			dataType = "Number";
		} else if (CommonUtil.isIn(columnName, CommonUtil.split(getFrwVarDateColumn(), ","))) {
			dataType = "Date";
		} else {
			dataType = "String";
		}

		addUpdateColumn(columnName, columnValue, dataType);
	}

	/**
	 * dataType : String / Number / Date
	 */
	public void addUpdateColumn(String columnName, String columnValue, String dataType) throws Exception {
		updateColumnsDataSet.addRow();
		updateColumnsDataSet.setValue(updateColumnsDataSet.getRowCnt()-1, "COLUMN_NAME", columnName);
		updateColumnsDataSet.setValue(updateColumnsDataSet.getRowCnt()-1, "COLUMN_VALUE", columnValue);
		updateColumnsDataSet.setValue(updateColumnsDataSet.getRowCnt()-1, "DATA_TYPE", CommonUtil.nvl(dataType, "String"));
	}

	public void addUpdateColumnFromField() throws Exception {
		for (int i=0; i<dataSet.getColumnCnt(); i++) {
			if (CommonUtil.isNotBlank(dataSet.getValue(i))) {
				if (CommonUtil.equalsIgnoreCase(dataSet.getName(i), "INSERT_DATE") && CommonUtil.equalsIgnoreCase(dataSet.getValue(i), "SYSDATE")) {
					continue;
				}
				addUpdateColumn(dataSet.getName(i), dataSet.getValue(i));
			}
		}
	}

	/**
	 * toString
	 */
	public String toString() {
		String str = "";

		str += "comms : "+comms+"\n";
		str += "crm : "+crm+"\n";
		str += "crmCmplx : "+crmCmplx+"\n";
		str += "crmCmplxRson : "+crmCmplxRson+"\n";
		str += "csa : "+csa+"\n";
		str += "csaCmplx : "+csaCmplx+"\n";
		str += "csaCmplxRson : "+csaCmplxRson+"\n";
		str += "csc : "+csc+"\n";
		str += "cscCmplx : "+cscCmplx+"\n";
		str += "cscCmplxRson : "+cscCmplxRson+"\n";
		str += "csd : "+csd+"\n";
		str += "csm : "+csm+"\n";
		str += "csmCmplx : "+csmCmplx+"\n";
		str += "csmCmplxRson : "+csmCmplxRson+"\n";
		str += "customerStream : "+customerStream+"\n";
		str += "invoices : "+invoices+"\n";
		str += "ipros : "+ipros+"\n";
		str += "nextActions : "+nextActions+"\n";
		str += "opportunity : "+opportunity+"\n";
		str += "organisationName : "+organisationName+"\n";
		str += "revenue : "+revenue+"\n";
		str += "skCmplx : "+skCmplx+"\n";
		str += "skCmplxRson : "+skCmplxRson+"\n";
		str += "totalBilling : "+totalBilling+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"comms\" value=\""+comms+"\">";
		str += "<column name=\"crm\" value=\""+crm+"\">";
		str += "<column name=\"crmCmplx\" value=\""+crmCmplx+"\">";
		str += "<column name=\"crmCmplxRson\" value=\""+crmCmplxRson+"\">";
		str += "<column name=\"csa\" value=\""+csa+"\">";
		str += "<column name=\"csaCmplx\" value=\""+csaCmplx+"\">";
		str += "<column name=\"csaCmplxRson\" value=\""+csaCmplxRson+"\">";
		str += "<column name=\"csc\" value=\""+csc+"\">";
		str += "<column name=\"cscCmplx\" value=\""+cscCmplx+"\">";
		str += "<column name=\"cscCmplxRson\" value=\""+cscCmplxRson+"\">";
		str += "<column name=\"csd\" value=\""+csd+"\">";
		str += "<column name=\"csm\" value=\""+csm+"\">";
		str += "<column name=\"csmCmplx\" value=\""+csmCmplx+"\">";
		str += "<column name=\"csmCmplxRson\" value=\""+csmCmplxRson+"\">";
		str += "<column name=\"customerStream\" value=\""+customerStream+"\">";
		str += "<column name=\"invoices\" value=\""+invoices+"\">";
		str += "<column name=\"ipros\" value=\""+ipros+"\">";
		str += "<column name=\"nextActions\" value=\""+nextActions+"\">";
		str += "<column name=\"opportunity\" value=\""+opportunity+"\">";
		str += "<column name=\"organisationName\" value=\""+organisationName+"\">";
		str += "<column name=\"revenue\" value=\""+revenue+"\">";
		str += "<column name=\"skCmplx\" value=\""+skCmplx+"\">";
		str += "<column name=\"skCmplxRson\" value=\""+skCmplxRson+"\">";
		str += "<column name=\"totalBilling\" value=\""+totalBilling+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"comms\":\""+comms+"\", ";
		str += "\"crm\":\""+crm+"\", ";
		str += "\"crmCmplx\":\""+crmCmplx+"\", ";
		str += "\"crmCmplxRson\":\""+crmCmplxRson+"\", ";
		str += "\"csa\":\""+csa+"\", ";
		str += "\"csaCmplx\":\""+csaCmplx+"\", ";
		str += "\"csaCmplxRson\":\""+csaCmplxRson+"\", ";
		str += "\"csc\":\""+csc+"\", ";
		str += "\"cscCmplx\":\""+cscCmplx+"\", ";
		str += "\"cscCmplxRson\":\""+cscCmplxRson+"\", ";
		str += "\"csd\":\""+csd+"\", ";
		str += "\"csm\":\""+csm+"\", ";
		str += "\"csmCmplx\":\""+csmCmplx+"\", ";
		str += "\"csmCmplxRson\":\""+csmCmplxRson+"\", ";
		str += "\"customerStream\":\""+customerStream+"\", ";
		str += "\"invoices\":\""+invoices+"\", ";
		str += "\"ipros\":\""+ipros+"\", ";
		str += "\"nextActions\":\""+nextActions+"\", ";
		str += "\"opportunity\":\""+opportunity+"\", ";
		str += "\"organisationName\":\""+organisationName+"\", ";
		str += "\"revenue\":\""+revenue+"\", ";
		str += "\"skCmplx\":\""+skCmplx+"\", ";
		str += "\"skCmplxRson\":\""+skCmplxRson+"\", ";
		str += "\"totalBilling\":\""+totalBilling+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}