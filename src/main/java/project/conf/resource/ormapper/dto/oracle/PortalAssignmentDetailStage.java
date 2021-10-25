/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_ASSIGNMENT_DETAIL_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalAssignmentDetailStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double submissionId;
	private String SUBMISSION_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date fromDate;
	private String FROM_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double personId;
	private String PERSON_ID;
	private Date toDate;
	private String TO_DATE;
	private double annualSalary;
	private String ANNUAL_SALARY;
	private double annualSuperAmt;
	private String ANNUAL_SUPER_AMT;
	private Date assignmentEndDate;
	private String ASSIGNMENT_END_DATE;
	private String assignmentNumber;
	private String ASSIGNMENT_NUMBER;
	private Date assignmentStartDate;
	private String ASSIGNMENT_START_DATE;
	private double billingCodeId;
	private String BILLING_CODE_ID;
	private Date firstPayDate;
	private String FIRST_PAY_DATE;
	private double overtimeRate;
	private String OVERTIME_RATE;
	private String payrollNotes;
	private String PAYROLL_NOTES;
	private String payFrequency;
	private String PAY_FREQUENCY;
	private String personType;
	private String PERSON_TYPE;
	private double rate;
	private String RATE;
	private double standardHrs;
	private String STANDARD_HRS;
	private double superAmt;
	private String SUPER_AMT;
	private String timecardRequired;
	private String TIMECARD_REQUIRED;
	private String title;
	private String TITLE;
	private String transformed;
	private String TRANSFORMED;
	private String unit;
	private String UNIT;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalAssignmentDetailStage() throws Exception {
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
		setFrwVarPrimaryKey("SUBMISSION_ID");
		setFrwVarDateColumn("CREATION_DATE,FROM_DATE,LAST_UPDATE_DATE,TO_DATE,ASSIGNMENT_END_DATE,ASSIGNMENT_START_DATE,FIRST_PAY_DATE");
		setFrwVarNumberColumn("SUBMISSION_ID,ASSIGNMENT_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,PERSON_ID,ANNUAL_SALARY,ANNUAL_SUPER_AMT,BILLING_CODE_ID,OVERTIME_RATE,RATE,STANDARD_HRS,SUPER_AMT");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(double submissionId) throws Exception {
		this.submissionId = submissionId;
		setValueFromAccessor("SUBMISSION_ID", CommonUtil.toString(submissionId));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) throws Exception {
		this.fromDate = fromDate;
		setValueFromAccessor("FROM_DATE", CommonUtil.toString(fromDate));
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

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) throws Exception {
		this.toDate = toDate;
		setValueFromAccessor("TO_DATE", CommonUtil.toString(toDate));
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) throws Exception {
		this.annualSalary = annualSalary;
		setValueFromAccessor("ANNUAL_SALARY", CommonUtil.toString(annualSalary));
	}

	public double getAnnualSuperAmt() {
		return annualSuperAmt;
	}

	public void setAnnualSuperAmt(double annualSuperAmt) throws Exception {
		this.annualSuperAmt = annualSuperAmt;
		setValueFromAccessor("ANNUAL_SUPER_AMT", CommonUtil.toString(annualSuperAmt));
	}

	public Date getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public void setAssignmentEndDate(Date assignmentEndDate) throws Exception {
		this.assignmentEndDate = assignmentEndDate;
		setValueFromAccessor("ASSIGNMENT_END_DATE", CommonUtil.toString(assignmentEndDate));
	}

	public String getAssignmentNumber() {
		return assignmentNumber;
	}

	public void setAssignmentNumber(String assignmentNumber) throws Exception {
		this.assignmentNumber = assignmentNumber;
		setValueFromAccessor("ASSIGNMENT_NUMBER", assignmentNumber);
	}

	public Date getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(Date assignmentStartDate) throws Exception {
		this.assignmentStartDate = assignmentStartDate;
		setValueFromAccessor("ASSIGNMENT_START_DATE", CommonUtil.toString(assignmentStartDate));
	}

	public double getBillingCodeId() {
		return billingCodeId;
	}

	public void setBillingCodeId(double billingCodeId) throws Exception {
		this.billingCodeId = billingCodeId;
		setValueFromAccessor("BILLING_CODE_ID", CommonUtil.toString(billingCodeId));
	}

	public Date getFirstPayDate() {
		return firstPayDate;
	}

	public void setFirstPayDate(Date firstPayDate) throws Exception {
		this.firstPayDate = firstPayDate;
		setValueFromAccessor("FIRST_PAY_DATE", CommonUtil.toString(firstPayDate));
	}

	public double getOvertimeRate() {
		return overtimeRate;
	}

	public void setOvertimeRate(double overtimeRate) throws Exception {
		this.overtimeRate = overtimeRate;
		setValueFromAccessor("OVERTIME_RATE", CommonUtil.toString(overtimeRate));
	}

	public String getPayrollNotes() {
		return payrollNotes;
	}

	public void setPayrollNotes(String payrollNotes) throws Exception {
		this.payrollNotes = payrollNotes;
		setValueFromAccessor("PAYROLL_NOTES", payrollNotes);
	}

	public String getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(String payFrequency) throws Exception {
		this.payFrequency = payFrequency;
		setValueFromAccessor("PAY_FREQUENCY", payFrequency);
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) throws Exception {
		this.personType = personType;
		setValueFromAccessor("PERSON_TYPE", personType);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) throws Exception {
		this.rate = rate;
		setValueFromAccessor("RATE", CommonUtil.toString(rate));
	}

	public double getStandardHrs() {
		return standardHrs;
	}

	public void setStandardHrs(double standardHrs) throws Exception {
		this.standardHrs = standardHrs;
		setValueFromAccessor("STANDARD_HRS", CommonUtil.toString(standardHrs));
	}

	public double getSuperAmt() {
		return superAmt;
	}

	public void setSuperAmt(double superAmt) throws Exception {
		this.superAmt = superAmt;
		setValueFromAccessor("SUPER_AMT", CommonUtil.toString(superAmt));
	}

	public String getTimecardRequired() {
		return timecardRequired;
	}

	public void setTimecardRequired(String timecardRequired) throws Exception {
		this.timecardRequired = timecardRequired;
		setValueFromAccessor("TIMECARD_REQUIRED", timecardRequired);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		this.title = title;
		setValueFromAccessor("TITLE", title);
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) throws Exception {
		this.unit = unit;
		setValueFromAccessor("UNIT", unit);
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

		str += "submissionId : "+submissionId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "personId : "+personId+"\n";
		str += "toDate : "+toDate+"\n";
		str += "annualSalary : "+annualSalary+"\n";
		str += "annualSuperAmt : "+annualSuperAmt+"\n";
		str += "assignmentEndDate : "+assignmentEndDate+"\n";
		str += "assignmentNumber : "+assignmentNumber+"\n";
		str += "assignmentStartDate : "+assignmentStartDate+"\n";
		str += "billingCodeId : "+billingCodeId+"\n";
		str += "firstPayDate : "+firstPayDate+"\n";
		str += "overtimeRate : "+overtimeRate+"\n";
		str += "payrollNotes : "+payrollNotes+"\n";
		str += "payFrequency : "+payFrequency+"\n";
		str += "personType : "+personType+"\n";
		str += "rate : "+rate+"\n";
		str += "standardHrs : "+standardHrs+"\n";
		str += "superAmt : "+superAmt+"\n";
		str += "timecardRequired : "+timecardRequired+"\n";
		str += "title : "+title+"\n";
		str += "transformed : "+transformed+"\n";
		str += "unit : "+unit+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"submissionId\" value=\""+submissionId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
		str += "<column name=\"annualSalary\" value=\""+annualSalary+"\">";
		str += "<column name=\"annualSuperAmt\" value=\""+annualSuperAmt+"\">";
		str += "<column name=\"assignmentEndDate\" value=\""+assignmentEndDate+"\">";
		str += "<column name=\"assignmentNumber\" value=\""+assignmentNumber+"\">";
		str += "<column name=\"assignmentStartDate\" value=\""+assignmentStartDate+"\">";
		str += "<column name=\"billingCodeId\" value=\""+billingCodeId+"\">";
		str += "<column name=\"firstPayDate\" value=\""+firstPayDate+"\">";
		str += "<column name=\"overtimeRate\" value=\""+overtimeRate+"\">";
		str += "<column name=\"payrollNotes\" value=\""+payrollNotes+"\">";
		str += "<column name=\"payFrequency\" value=\""+payFrequency+"\">";
		str += "<column name=\"personType\" value=\""+personType+"\">";
		str += "<column name=\"rate\" value=\""+rate+"\">";
		str += "<column name=\"standardHrs\" value=\""+standardHrs+"\">";
		str += "<column name=\"superAmt\" value=\""+superAmt+"\">";
		str += "<column name=\"timecardRequired\" value=\""+timecardRequired+"\">";
		str += "<column name=\"title\" value=\""+title+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"unit\" value=\""+unit+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"submissionId\":\""+submissionId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"annualSalary\":\""+annualSalary+"\", ";
		str += "\"annualSuperAmt\":\""+annualSuperAmt+"\", ";
		str += "\"assignmentEndDate\":\""+assignmentEndDate+"\", ";
		str += "\"assignmentNumber\":\""+assignmentNumber+"\", ";
		str += "\"assignmentStartDate\":\""+assignmentStartDate+"\", ";
		str += "\"billingCodeId\":\""+billingCodeId+"\", ";
		str += "\"firstPayDate\":\""+firstPayDate+"\", ";
		str += "\"overtimeRate\":\""+overtimeRate+"\", ";
		str += "\"payrollNotes\":\""+payrollNotes+"\", ";
		str += "\"payFrequency\":\""+payFrequency+"\", ";
		str += "\"personType\":\""+personType+"\", ";
		str += "\"rate\":\""+rate+"\", ";
		str += "\"standardHrs\":\""+standardHrs+"\", ";
		str += "\"superAmt\":\""+superAmt+"\", ";
		str += "\"timecardRequired\":\""+timecardRequired+"\", ";
		str += "\"title\":\""+title+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"unit\":\""+unit+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}