/**************************************************************************************************
 * Framework Generated DTO Source
 * - TERMINATION_PAYMENT_DETAIL - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class TerminationPaymentDetail extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double personId;
	private String PERSON_ID;
	private double terminationPaymentDetailId;
	private String TERMINATION_PAYMENT_DETAIL_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String employeeName;
	private String EMPLOYEE_NAME;
	private double employmentCompanyId;
	private String EMPLOYMENT_COMPANY_ID;
	private Date employmentEndDate;
	private String EMPLOYMENT_END_DATE;
	private Date employmentStartDate;
	private String EMPLOYMENT_START_DATE;
	private Date financialYearEndDate;
	private String FINANCIAL_YEAR_END_DATE;
	private Date financialYearStartDate;
	private String FINANCIAL_YEAR_START_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String payeeAddressLine;
	private String PAYEE_ADDRESS_LINE;
	private String payeeName;
	private String PAYEE_NAME;
	private String payeeSurname;
	private String PAYEE_SURNAME;
	private Date paymentDate;
	private String PAYMENT_DATE;
	private Date terminationDate;
	private String TERMINATION_DATE;
	private double terminationPayerDetailId;
	private String TERMINATION_PAYER_DETAIL_ID;
	private String terminationPaymentType;
	private String TERMINATION_PAYMENT_TYPE;
	private double empdupeFileId;
	private String EMPDUPE_FILE_ID;
	private double personEoyId;
	private String PERSON_EOY_ID;
	private double assessableAmount;
	private String ASSESSABLE_AMOUNT;
	private String authorisedPerson;
	private String AUTHORISED_PERSON;
	private String payeeCountry;
	private String PAYEE_COUNTRY;
	private Date payeeDateOfBirth;
	private String PAYEE_DATE_OF_BIRTH;
	private String payeeMiddleName;
	private String PAYEE_MIDDLE_NAME;
	private String payeePostcode;
	private String PAYEE_POSTCODE;
	private String payeeState;
	private String PAYEE_STATE;
	private String payeeSuburb;
	private String PAYEE_SUBURB;
	private String payeeTfn;
	private String PAYEE_TFN;
	private double paymentGrossAmount;
	private String PAYMENT_GROSS_AMOUNT;
	private double totalTaxWithheld;
	private String TOTAL_TAX_WITHHELD;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public TerminationPaymentDetail() throws Exception {
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
		setFrwVarPrimaryKey("TERMINATION_PAYMENT_DETAIL_ID");
		setFrwVarDateColumn("CREATION_DATE,EMPLOYMENT_END_DATE,EMPLOYMENT_START_DATE,FINANCIAL_YEAR_END_DATE,FINANCIAL_YEAR_START_DATE,LAST_UPDATE_DATE,PAYMENT_DATE,TERMINATION_DATE,PAYEE_DATE_OF_BIRTH");
		setFrwVarNumberColumn("PERSON_ID,TERMINATION_PAYMENT_DETAIL_ID,BUSINESS_GROUP_ID,CREATED_BY,EMPLOYMENT_COMPANY_ID,LAST_UPDATED_BY,TERMINATION_PAYER_DETAIL_ID,EMPDUPE_FILE_ID,PERSON_EOY_ID,ASSESSABLE_AMOUNT,PAYMENT_GROSS_AMOUNT,TOTAL_TAX_WITHHELD");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getTerminationPaymentDetailId() {
		return terminationPaymentDetailId;
	}

	public void setTerminationPaymentDetailId(double terminationPaymentDetailId) throws Exception {
		this.terminationPaymentDetailId = terminationPaymentDetailId;
		setValueFromAccessor("TERMINATION_PAYMENT_DETAIL_ID", CommonUtil.toString(terminationPaymentDetailId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
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

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) throws Exception {
		this.employeeName = employeeName;
		setValueFromAccessor("EMPLOYEE_NAME", employeeName);
	}

	public double getEmploymentCompanyId() {
		return employmentCompanyId;
	}

	public void setEmploymentCompanyId(double employmentCompanyId) throws Exception {
		this.employmentCompanyId = employmentCompanyId;
		setValueFromAccessor("EMPLOYMENT_COMPANY_ID", CommonUtil.toString(employmentCompanyId));
	}

	public Date getEmploymentEndDate() {
		return employmentEndDate;
	}

	public void setEmploymentEndDate(Date employmentEndDate) throws Exception {
		this.employmentEndDate = employmentEndDate;
		setValueFromAccessor("EMPLOYMENT_END_DATE", CommonUtil.toString(employmentEndDate));
	}

	public Date getEmploymentStartDate() {
		return employmentStartDate;
	}

	public void setEmploymentStartDate(Date employmentStartDate) throws Exception {
		this.employmentStartDate = employmentStartDate;
		setValueFromAccessor("EMPLOYMENT_START_DATE", CommonUtil.toString(employmentStartDate));
	}

	public Date getFinancialYearEndDate() {
		return financialYearEndDate;
	}

	public void setFinancialYearEndDate(Date financialYearEndDate) throws Exception {
		this.financialYearEndDate = financialYearEndDate;
		setValueFromAccessor("FINANCIAL_YEAR_END_DATE", CommonUtil.toString(financialYearEndDate));
	}

	public Date getFinancialYearStartDate() {
		return financialYearStartDate;
	}

	public void setFinancialYearStartDate(Date financialYearStartDate) throws Exception {
		this.financialYearStartDate = financialYearStartDate;
		setValueFromAccessor("FINANCIAL_YEAR_START_DATE", CommonUtil.toString(financialYearStartDate));
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

	public String getPayeeAddressLine() {
		return payeeAddressLine;
	}

	public void setPayeeAddressLine(String payeeAddressLine) throws Exception {
		this.payeeAddressLine = payeeAddressLine;
		setValueFromAccessor("PAYEE_ADDRESS_LINE", payeeAddressLine);
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) throws Exception {
		this.payeeName = payeeName;
		setValueFromAccessor("PAYEE_NAME", payeeName);
	}

	public String getPayeeSurname() {
		return payeeSurname;
	}

	public void setPayeeSurname(String payeeSurname) throws Exception {
		this.payeeSurname = payeeSurname;
		setValueFromAccessor("PAYEE_SURNAME", payeeSurname);
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) throws Exception {
		this.paymentDate = paymentDate;
		setValueFromAccessor("PAYMENT_DATE", CommonUtil.toString(paymentDate));
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) throws Exception {
		this.terminationDate = terminationDate;
		setValueFromAccessor("TERMINATION_DATE", CommonUtil.toString(terminationDate));
	}

	public double getTerminationPayerDetailId() {
		return terminationPayerDetailId;
	}

	public void setTerminationPayerDetailId(double terminationPayerDetailId) throws Exception {
		this.terminationPayerDetailId = terminationPayerDetailId;
		setValueFromAccessor("TERMINATION_PAYER_DETAIL_ID", CommonUtil.toString(terminationPayerDetailId));
	}

	public String getTerminationPaymentType() {
		return terminationPaymentType;
	}

	public void setTerminationPaymentType(String terminationPaymentType) throws Exception {
		this.terminationPaymentType = terminationPaymentType;
		setValueFromAccessor("TERMINATION_PAYMENT_TYPE", terminationPaymentType);
	}

	public double getEmpdupeFileId() {
		return empdupeFileId;
	}

	public void setEmpdupeFileId(double empdupeFileId) throws Exception {
		this.empdupeFileId = empdupeFileId;
		setValueFromAccessor("EMPDUPE_FILE_ID", CommonUtil.toString(empdupeFileId));
	}

	public double getPersonEoyId() {
		return personEoyId;
	}

	public void setPersonEoyId(double personEoyId) throws Exception {
		this.personEoyId = personEoyId;
		setValueFromAccessor("PERSON_EOY_ID", CommonUtil.toString(personEoyId));
	}

	public double getAssessableAmount() {
		return assessableAmount;
	}

	public void setAssessableAmount(double assessableAmount) throws Exception {
		this.assessableAmount = assessableAmount;
		setValueFromAccessor("ASSESSABLE_AMOUNT", CommonUtil.toString(assessableAmount));
	}

	public String getAuthorisedPerson() {
		return authorisedPerson;
	}

	public void setAuthorisedPerson(String authorisedPerson) throws Exception {
		this.authorisedPerson = authorisedPerson;
		setValueFromAccessor("AUTHORISED_PERSON", authorisedPerson);
	}

	public String getPayeeCountry() {
		return payeeCountry;
	}

	public void setPayeeCountry(String payeeCountry) throws Exception {
		this.payeeCountry = payeeCountry;
		setValueFromAccessor("PAYEE_COUNTRY", payeeCountry);
	}

	public Date getPayeeDateOfBirth() {
		return payeeDateOfBirth;
	}

	public void setPayeeDateOfBirth(Date payeeDateOfBirth) throws Exception {
		this.payeeDateOfBirth = payeeDateOfBirth;
		setValueFromAccessor("PAYEE_DATE_OF_BIRTH", CommonUtil.toString(payeeDateOfBirth));
	}

	public String getPayeeMiddleName() {
		return payeeMiddleName;
	}

	public void setPayeeMiddleName(String payeeMiddleName) throws Exception {
		this.payeeMiddleName = payeeMiddleName;
		setValueFromAccessor("PAYEE_MIDDLE_NAME", payeeMiddleName);
	}

	public String getPayeePostcode() {
		return payeePostcode;
	}

	public void setPayeePostcode(String payeePostcode) throws Exception {
		this.payeePostcode = payeePostcode;
		setValueFromAccessor("PAYEE_POSTCODE", payeePostcode);
	}

	public String getPayeeState() {
		return payeeState;
	}

	public void setPayeeState(String payeeState) throws Exception {
		this.payeeState = payeeState;
		setValueFromAccessor("PAYEE_STATE", payeeState);
	}

	public String getPayeeSuburb() {
		return payeeSuburb;
	}

	public void setPayeeSuburb(String payeeSuburb) throws Exception {
		this.payeeSuburb = payeeSuburb;
		setValueFromAccessor("PAYEE_SUBURB", payeeSuburb);
	}

	public String getPayeeTfn() {
		return payeeTfn;
	}

	public void setPayeeTfn(String payeeTfn) throws Exception {
		this.payeeTfn = payeeTfn;
		setValueFromAccessor("PAYEE_TFN", payeeTfn);
	}

	public double getPaymentGrossAmount() {
		return paymentGrossAmount;
	}

	public void setPaymentGrossAmount(double paymentGrossAmount) throws Exception {
		this.paymentGrossAmount = paymentGrossAmount;
		setValueFromAccessor("PAYMENT_GROSS_AMOUNT", CommonUtil.toString(paymentGrossAmount));
	}

	public double getTotalTaxWithheld() {
		return totalTaxWithheld;
	}

	public void setTotalTaxWithheld(double totalTaxWithheld) throws Exception {
		this.totalTaxWithheld = totalTaxWithheld;
		setValueFromAccessor("TOTAL_TAX_WITHHELD", CommonUtil.toString(totalTaxWithheld));
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

		str += "personId : "+personId+"\n";
		str += "terminationPaymentDetailId : "+terminationPaymentDetailId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "employeeName : "+employeeName+"\n";
		str += "employmentCompanyId : "+employmentCompanyId+"\n";
		str += "employmentEndDate : "+employmentEndDate+"\n";
		str += "employmentStartDate : "+employmentStartDate+"\n";
		str += "financialYearEndDate : "+financialYearEndDate+"\n";
		str += "financialYearStartDate : "+financialYearStartDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "payeeAddressLine : "+payeeAddressLine+"\n";
		str += "payeeName : "+payeeName+"\n";
		str += "payeeSurname : "+payeeSurname+"\n";
		str += "paymentDate : "+paymentDate+"\n";
		str += "terminationDate : "+terminationDate+"\n";
		str += "terminationPayerDetailId : "+terminationPayerDetailId+"\n";
		str += "terminationPaymentType : "+terminationPaymentType+"\n";
		str += "empdupeFileId : "+empdupeFileId+"\n";
		str += "personEoyId : "+personEoyId+"\n";
		str += "assessableAmount : "+assessableAmount+"\n";
		str += "authorisedPerson : "+authorisedPerson+"\n";
		str += "payeeCountry : "+payeeCountry+"\n";
		str += "payeeDateOfBirth : "+payeeDateOfBirth+"\n";
		str += "payeeMiddleName : "+payeeMiddleName+"\n";
		str += "payeePostcode : "+payeePostcode+"\n";
		str += "payeeState : "+payeeState+"\n";
		str += "payeeSuburb : "+payeeSuburb+"\n";
		str += "payeeTfn : "+payeeTfn+"\n";
		str += "paymentGrossAmount : "+paymentGrossAmount+"\n";
		str += "totalTaxWithheld : "+totalTaxWithheld+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"terminationPaymentDetailId\" value=\""+terminationPaymentDetailId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"employeeName\" value=\""+employeeName+"\">";
		str += "<column name=\"employmentCompanyId\" value=\""+employmentCompanyId+"\">";
		str += "<column name=\"employmentEndDate\" value=\""+employmentEndDate+"\">";
		str += "<column name=\"employmentStartDate\" value=\""+employmentStartDate+"\">";
		str += "<column name=\"financialYearEndDate\" value=\""+financialYearEndDate+"\">";
		str += "<column name=\"financialYearStartDate\" value=\""+financialYearStartDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"payeeAddressLine\" value=\""+payeeAddressLine+"\">";
		str += "<column name=\"payeeName\" value=\""+payeeName+"\">";
		str += "<column name=\"payeeSurname\" value=\""+payeeSurname+"\">";
		str += "<column name=\"paymentDate\" value=\""+paymentDate+"\">";
		str += "<column name=\"terminationDate\" value=\""+terminationDate+"\">";
		str += "<column name=\"terminationPayerDetailId\" value=\""+terminationPayerDetailId+"\">";
		str += "<column name=\"terminationPaymentType\" value=\""+terminationPaymentType+"\">";
		str += "<column name=\"empdupeFileId\" value=\""+empdupeFileId+"\">";
		str += "<column name=\"personEoyId\" value=\""+personEoyId+"\">";
		str += "<column name=\"assessableAmount\" value=\""+assessableAmount+"\">";
		str += "<column name=\"authorisedPerson\" value=\""+authorisedPerson+"\">";
		str += "<column name=\"payeeCountry\" value=\""+payeeCountry+"\">";
		str += "<column name=\"payeeDateOfBirth\" value=\""+payeeDateOfBirth+"\">";
		str += "<column name=\"payeeMiddleName\" value=\""+payeeMiddleName+"\">";
		str += "<column name=\"payeePostcode\" value=\""+payeePostcode+"\">";
		str += "<column name=\"payeeState\" value=\""+payeeState+"\">";
		str += "<column name=\"payeeSuburb\" value=\""+payeeSuburb+"\">";
		str += "<column name=\"payeeTfn\" value=\""+payeeTfn+"\">";
		str += "<column name=\"paymentGrossAmount\" value=\""+paymentGrossAmount+"\">";
		str += "<column name=\"totalTaxWithheld\" value=\""+totalTaxWithheld+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"personId\":\""+personId+"\", ";
		str += "\"terminationPaymentDetailId\":\""+terminationPaymentDetailId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"employeeName\":\""+employeeName+"\", ";
		str += "\"employmentCompanyId\":\""+employmentCompanyId+"\", ";
		str += "\"employmentEndDate\":\""+employmentEndDate+"\", ";
		str += "\"employmentStartDate\":\""+employmentStartDate+"\", ";
		str += "\"financialYearEndDate\":\""+financialYearEndDate+"\", ";
		str += "\"financialYearStartDate\":\""+financialYearStartDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"payeeAddressLine\":\""+payeeAddressLine+"\", ";
		str += "\"payeeName\":\""+payeeName+"\", ";
		str += "\"payeeSurname\":\""+payeeSurname+"\", ";
		str += "\"paymentDate\":\""+paymentDate+"\", ";
		str += "\"terminationDate\":\""+terminationDate+"\", ";
		str += "\"terminationPayerDetailId\":\""+terminationPayerDetailId+"\", ";
		str += "\"terminationPaymentType\":\""+terminationPaymentType+"\", ";
		str += "\"empdupeFileId\":\""+empdupeFileId+"\", ";
		str += "\"personEoyId\":\""+personEoyId+"\", ";
		str += "\"assessableAmount\":\""+assessableAmount+"\", ";
		str += "\"authorisedPerson\":\""+authorisedPerson+"\", ";
		str += "\"payeeCountry\":\""+payeeCountry+"\", ";
		str += "\"payeeDateOfBirth\":\""+payeeDateOfBirth+"\", ";
		str += "\"payeeMiddleName\":\""+payeeMiddleName+"\", ";
		str += "\"payeePostcode\":\""+payeePostcode+"\", ";
		str += "\"payeeState\":\""+payeeState+"\", ";
		str += "\"payeeSuburb\":\""+payeeSuburb+"\", ";
		str += "\"payeeTfn\":\""+payeeTfn+"\", ";
		str += "\"paymentGrossAmount\":\""+paymentGrossAmount+"\", ";
		str += "\"totalTaxWithheld\":\""+totalTaxWithheld+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}