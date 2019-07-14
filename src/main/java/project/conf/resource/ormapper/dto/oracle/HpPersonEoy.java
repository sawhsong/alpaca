/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_PERSON_EOY - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpPersonEoy extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double personEoyId;
	private String PERSON_EOY_ID;
	private double allowance1;
	private String ALLOWANCE1;
	private String allowance1Desc;
	private String ALLOWANCE1_DESC;
	private double allowance2;
	private String ALLOWANCE2;
	private String allowance2Desc;
	private String ALLOWANCE2_DESC;
	private double allowance3;
	private String ALLOWANCE3;
	private String allowance3Desc;
	private String ALLOWANCE3_DESC;
	private double allowance4;
	private String ALLOWANCE4;
	private String allowance4Desc;
	private String ALLOWANCE4_DESC;
	private double amount;
	private String AMOUNT;
	private String cdep;
	private String CDEP;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String employeeDeduction;
	private String EMPLOYEE_DEDUCTION;
	private Date fromDate;
	private String FROM_DATE;
	private String generatedStatus;
	private String GENERATED_STATUS;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double lumpSumA;
	private String LUMP_SUM_A;
	private double lumpSumB;
	private String LUMP_SUM_B;
	private double lumpSumD;
	private String LUMP_SUM_D;
	private double lumpSumE;
	private String LUMP_SUM_E;
	private double organisationId;
	private String ORGANISATION_ID;
	private String otherIncome;
	private String OTHER_INCOME;
	private double personId;
	private String PERSON_ID;
	private double reportableFbt;
	private String REPORTABLE_FBT;
	private Date servicePeriodEndDate;
	private String SERVICE_PERIOD_END_DATE;
	private Date servicePeriodStartDate;
	private String SERVICE_PERIOD_START_DATE;
	private Date toDate;
	private String TO_DATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpPersonEoy() throws Exception {
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
		setFrwVarPrimaryKey("PERSON_EOY_ID");
		setFrwVarDateColumn("CREATION_DATE,FROM_DATE,LAST_UPDATE_DATE,SERVICE_PERIOD_END_DATE,SERVICE_PERIOD_START_DATE,TO_DATE");
		setFrwVarNumberColumn("PERSON_EOY_ID,ALLOWANCE1,ALLOWANCE2,ALLOWANCE3,ALLOWANCE4,AMOUNT,CREATED_BY,LAST_UPDATED_BY,LUMP_SUM_A,LUMP_SUM_B,LUMP_SUM_D,LUMP_SUM_E,ORGANISATION_ID,PERSON_ID,REPORTABLE_FBT");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPersonEoyId() {
		return personEoyId;
	}

	public void setPersonEoyId(double personEoyId) throws Exception {
		this.personEoyId = personEoyId;
		setValueFromAccessor("PERSON_EOY_ID", CommonUtil.toString(personEoyId));
	}

	public double getAllowance1() {
		return allowance1;
	}

	public void setAllowance1(double allowance1) throws Exception {
		this.allowance1 = allowance1;
		setValueFromAccessor("ALLOWANCE1", CommonUtil.toString(allowance1));
	}

	public String getAllowance1Desc() {
		return allowance1Desc;
	}

	public void setAllowance1Desc(String allowance1Desc) throws Exception {
		this.allowance1Desc = allowance1Desc;
		setValueFromAccessor("ALLOWANCE1_DESC", allowance1Desc);
	}

	public double getAllowance2() {
		return allowance2;
	}

	public void setAllowance2(double allowance2) throws Exception {
		this.allowance2 = allowance2;
		setValueFromAccessor("ALLOWANCE2", CommonUtil.toString(allowance2));
	}

	public String getAllowance2Desc() {
		return allowance2Desc;
	}

	public void setAllowance2Desc(String allowance2Desc) throws Exception {
		this.allowance2Desc = allowance2Desc;
		setValueFromAccessor("ALLOWANCE2_DESC", allowance2Desc);
	}

	public double getAllowance3() {
		return allowance3;
	}

	public void setAllowance3(double allowance3) throws Exception {
		this.allowance3 = allowance3;
		setValueFromAccessor("ALLOWANCE3", CommonUtil.toString(allowance3));
	}

	public String getAllowance3Desc() {
		return allowance3Desc;
	}

	public void setAllowance3Desc(String allowance3Desc) throws Exception {
		this.allowance3Desc = allowance3Desc;
		setValueFromAccessor("ALLOWANCE3_DESC", allowance3Desc);
	}

	public double getAllowance4() {
		return allowance4;
	}

	public void setAllowance4(double allowance4) throws Exception {
		this.allowance4 = allowance4;
		setValueFromAccessor("ALLOWANCE4", CommonUtil.toString(allowance4));
	}

	public String getAllowance4Desc() {
		return allowance4Desc;
	}

	public void setAllowance4Desc(String allowance4Desc) throws Exception {
		this.allowance4Desc = allowance4Desc;
		setValueFromAccessor("ALLOWANCE4_DESC", allowance4Desc);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) throws Exception {
		this.amount = amount;
		setValueFromAccessor("AMOUNT", CommonUtil.toString(amount));
	}

	public String getCdep() {
		return cdep;
	}

	public void setCdep(String cdep) throws Exception {
		this.cdep = cdep;
		setValueFromAccessor("CDEP", cdep);
	}

	public double getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(double createdBy) throws Exception {
		this.createdBy = createdBy;
		setValueFromAccessor("CREATED_BY", CommonUtil.toString(createdBy));
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) throws Exception {
		this.creationDate = creationDate;
		setValueFromAccessor("CREATION_DATE", CommonUtil.toString(creationDate));
	}

	public String getEmployeeDeduction() {
		return employeeDeduction;
	}

	public void setEmployeeDeduction(String employeeDeduction) throws Exception {
		this.employeeDeduction = employeeDeduction;
		setValueFromAccessor("EMPLOYEE_DEDUCTION", employeeDeduction);
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) throws Exception {
		this.fromDate = fromDate;
		setValueFromAccessor("FROM_DATE", CommonUtil.toString(fromDate));
	}

	public String getGeneratedStatus() {
		return generatedStatus;
	}

	public void setGeneratedStatus(String generatedStatus) throws Exception {
		this.generatedStatus = generatedStatus;
		setValueFromAccessor("GENERATED_STATUS", generatedStatus);
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) throws Exception {
		this.lastUpdateDate = lastUpdateDate;
		setValueFromAccessor("LAST_UPDATE_DATE", CommonUtil.toString(lastUpdateDate));
	}

	public double getLumpSumA() {
		return lumpSumA;
	}

	public void setLumpSumA(double lumpSumA) throws Exception {
		this.lumpSumA = lumpSumA;
		setValueFromAccessor("LUMP_SUM_A", CommonUtil.toString(lumpSumA));
	}

	public double getLumpSumB() {
		return lumpSumB;
	}

	public void setLumpSumB(double lumpSumB) throws Exception {
		this.lumpSumB = lumpSumB;
		setValueFromAccessor("LUMP_SUM_B", CommonUtil.toString(lumpSumB));
	}

	public double getLumpSumD() {
		return lumpSumD;
	}

	public void setLumpSumD(double lumpSumD) throws Exception {
		this.lumpSumD = lumpSumD;
		setValueFromAccessor("LUMP_SUM_D", CommonUtil.toString(lumpSumD));
	}

	public double getLumpSumE() {
		return lumpSumE;
	}

	public void setLumpSumE(double lumpSumE) throws Exception {
		this.lumpSumE = lumpSumE;
		setValueFromAccessor("LUMP_SUM_E", CommonUtil.toString(lumpSumE));
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public String getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(String otherIncome) throws Exception {
		this.otherIncome = otherIncome;
		setValueFromAccessor("OTHER_INCOME", otherIncome);
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getReportableFbt() {
		return reportableFbt;
	}

	public void setReportableFbt(double reportableFbt) throws Exception {
		this.reportableFbt = reportableFbt;
		setValueFromAccessor("REPORTABLE_FBT", CommonUtil.toString(reportableFbt));
	}

	public Date getServicePeriodEndDate() {
		return servicePeriodEndDate;
	}

	public void setServicePeriodEndDate(Date servicePeriodEndDate) throws Exception {
		this.servicePeriodEndDate = servicePeriodEndDate;
		setValueFromAccessor("SERVICE_PERIOD_END_DATE", CommonUtil.toString(servicePeriodEndDate));
	}

	public Date getServicePeriodStartDate() {
		return servicePeriodStartDate;
	}

	public void setServicePeriodStartDate(Date servicePeriodStartDate) throws Exception {
		this.servicePeriodStartDate = servicePeriodStartDate;
		setValueFromAccessor("SERVICE_PERIOD_START_DATE", CommonUtil.toString(servicePeriodStartDate));
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) throws Exception {
		this.toDate = toDate;
		setValueFromAccessor("TO_DATE", CommonUtil.toString(toDate));
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

		str += "personEoyId : "+personEoyId+"\n";
		str += "allowance1 : "+allowance1+"\n";
		str += "allowance1Desc : "+allowance1Desc+"\n";
		str += "allowance2 : "+allowance2+"\n";
		str += "allowance2Desc : "+allowance2Desc+"\n";
		str += "allowance3 : "+allowance3+"\n";
		str += "allowance3Desc : "+allowance3Desc+"\n";
		str += "allowance4 : "+allowance4+"\n";
		str += "allowance4Desc : "+allowance4Desc+"\n";
		str += "amount : "+amount+"\n";
		str += "cdep : "+cdep+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "employeeDeduction : "+employeeDeduction+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "generatedStatus : "+generatedStatus+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "lumpSumA : "+lumpSumA+"\n";
		str += "lumpSumB : "+lumpSumB+"\n";
		str += "lumpSumD : "+lumpSumD+"\n";
		str += "lumpSumE : "+lumpSumE+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "otherIncome : "+otherIncome+"\n";
		str += "personId : "+personId+"\n";
		str += "reportableFbt : "+reportableFbt+"\n";
		str += "servicePeriodEndDate : "+servicePeriodEndDate+"\n";
		str += "servicePeriodStartDate : "+servicePeriodStartDate+"\n";
		str += "toDate : "+toDate+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"personEoyId\" value=\""+personEoyId+"\">";
		str += "<column name=\"allowance1\" value=\""+allowance1+"\">";
		str += "<column name=\"allowance1Desc\" value=\""+allowance1Desc+"\">";
		str += "<column name=\"allowance2\" value=\""+allowance2+"\">";
		str += "<column name=\"allowance2Desc\" value=\""+allowance2Desc+"\">";
		str += "<column name=\"allowance3\" value=\""+allowance3+"\">";
		str += "<column name=\"allowance3Desc\" value=\""+allowance3Desc+"\">";
		str += "<column name=\"allowance4\" value=\""+allowance4+"\">";
		str += "<column name=\"allowance4Desc\" value=\""+allowance4Desc+"\">";
		str += "<column name=\"amount\" value=\""+amount+"\">";
		str += "<column name=\"cdep\" value=\""+cdep+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"employeeDeduction\" value=\""+employeeDeduction+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"generatedStatus\" value=\""+generatedStatus+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"lumpSumA\" value=\""+lumpSumA+"\">";
		str += "<column name=\"lumpSumB\" value=\""+lumpSumB+"\">";
		str += "<column name=\"lumpSumD\" value=\""+lumpSumD+"\">";
		str += "<column name=\"lumpSumE\" value=\""+lumpSumE+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"otherIncome\" value=\""+otherIncome+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"reportableFbt\" value=\""+reportableFbt+"\">";
		str += "<column name=\"servicePeriodEndDate\" value=\""+servicePeriodEndDate+"\">";
		str += "<column name=\"servicePeriodStartDate\" value=\""+servicePeriodStartDate+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"personEoyId\":\""+personEoyId+"\", ";
		str += "\"allowance1\":\""+allowance1+"\", ";
		str += "\"allowance1Desc\":\""+allowance1Desc+"\", ";
		str += "\"allowance2\":\""+allowance2+"\", ";
		str += "\"allowance2Desc\":\""+allowance2Desc+"\", ";
		str += "\"allowance3\":\""+allowance3+"\", ";
		str += "\"allowance3Desc\":\""+allowance3Desc+"\", ";
		str += "\"allowance4\":\""+allowance4+"\", ";
		str += "\"allowance4Desc\":\""+allowance4Desc+"\", ";
		str += "\"amount\":\""+amount+"\", ";
		str += "\"cdep\":\""+cdep+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"employeeDeduction\":\""+employeeDeduction+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"generatedStatus\":\""+generatedStatus+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"lumpSumA\":\""+lumpSumA+"\", ";
		str += "\"lumpSumB\":\""+lumpSumB+"\", ";
		str += "\"lumpSumD\":\""+lumpSumD+"\", ";
		str += "\"lumpSumE\":\""+lumpSumE+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"otherIncome\":\""+otherIncome+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"reportableFbt\":\""+reportableFbt+"\", ";
		str += "\"servicePeriodEndDate\":\""+servicePeriodEndDate+"\", ";
		str += "\"servicePeriodStartDate\":\""+servicePeriodStartDate+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}