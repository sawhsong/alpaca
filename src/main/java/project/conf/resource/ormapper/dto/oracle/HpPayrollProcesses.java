/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_PAYROLL_PROCESSES - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpPayrollProcesses extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double payrollProcessId;
	private String PAYROLL_PROCESS_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String actionType;
	private String ACTION_TYPE;
	private Date actualPayDate;
	private String ACTUAL_PAY_DATE;
	private double assignmentSetId;
	private String ASSIGNMENT_SET_ID;
	private String attribute1;
	private String ATTRIBUTE1;
	private String attribute10;
	private String ATTRIBUTE10;
	private String attribute2;
	private String ATTRIBUTE2;
	private String attribute3;
	private String ATTRIBUTE3;
	private String attribute4;
	private String ATTRIBUTE4;
	private String attribute5;
	private String ATTRIBUTE5;
	private String attribute6;
	private String ATTRIBUTE6;
	private String attribute7;
	private String ATTRIBUTE7;
	private String attribute8;
	private String ATTRIBUTE8;
	private String attribute9;
	private String ATTRIBUTE9;
	private double billingCodeId;
	private String BILLING_CODE_ID;
	private double chequeEndNumber;
	private String CHEQUE_END_NUMBER;
	private Date chequeStartDate;
	private String CHEQUE_START_DATE;
	private double chequeStartNumber;
	private String CHEQUE_START_NUMBER;
	private Date dateEarned;
	private String DATE_EARNED;
	private Date effectiveDate;
	private String EFFECTIVE_DATE;
	private double paymentId;
	private String PAYMENT_ID;
	private Date periodStartDate;
	private String PERIOD_START_DATE;
	private String processStatus;
	private String PROCESS_STATUS;
	private double requestId;
	private String REQUEST_ID;
	private double timePeriodId;
	private String TIME_PERIOD_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpPayrollProcesses() throws Exception {
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
		setFrwVarPrimaryKey("PAYROLL_PROCESS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,ACTUAL_PAY_DATE,CHEQUE_START_DATE,DATE_EARNED,EFFECTIVE_DATE,PERIOD_START_DATE");
		setFrwVarNumberColumn("PAYROLL_PROCESS_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,ASSIGNMENT_SET_ID,BILLING_CODE_ID,CHEQUE_END_NUMBER,CHEQUE_START_NUMBER,PAYMENT_ID,REQUEST_ID,TIME_PERIOD_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPayrollProcessId() {
		return payrollProcessId;
	}

	public void setPayrollProcessId(double payrollProcessId) throws Exception {
		this.payrollProcessId = payrollProcessId;
		setValueFromAccessor("PAYROLL_PROCESS_ID", CommonUtil.toString(payrollProcessId));
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

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) throws Exception {
		this.actionType = actionType;
		setValueFromAccessor("ACTION_TYPE", actionType);
	}

	public Date getActualPayDate() {
		return actualPayDate;
	}

	public void setActualPayDate(Date actualPayDate) throws Exception {
		this.actualPayDate = actualPayDate;
		setValueFromAccessor("ACTUAL_PAY_DATE", CommonUtil.toString(actualPayDate));
	}

	public double getAssignmentSetId() {
		return assignmentSetId;
	}

	public void setAssignmentSetId(double assignmentSetId) throws Exception {
		this.assignmentSetId = assignmentSetId;
		setValueFromAccessor("ASSIGNMENT_SET_ID", CommonUtil.toString(assignmentSetId));
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) throws Exception {
		this.attribute1 = attribute1;
		setValueFromAccessor("ATTRIBUTE1", attribute1);
	}

	public String getAttribute10() {
		return attribute10;
	}

	public void setAttribute10(String attribute10) throws Exception {
		this.attribute10 = attribute10;
		setValueFromAccessor("ATTRIBUTE10", attribute10);
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) throws Exception {
		this.attribute2 = attribute2;
		setValueFromAccessor("ATTRIBUTE2", attribute2);
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) throws Exception {
		this.attribute3 = attribute3;
		setValueFromAccessor("ATTRIBUTE3", attribute3);
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) throws Exception {
		this.attribute4 = attribute4;
		setValueFromAccessor("ATTRIBUTE4", attribute4);
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) throws Exception {
		this.attribute5 = attribute5;
		setValueFromAccessor("ATTRIBUTE5", attribute5);
	}

	public String getAttribute6() {
		return attribute6;
	}

	public void setAttribute6(String attribute6) throws Exception {
		this.attribute6 = attribute6;
		setValueFromAccessor("ATTRIBUTE6", attribute6);
	}

	public String getAttribute7() {
		return attribute7;
	}

	public void setAttribute7(String attribute7) throws Exception {
		this.attribute7 = attribute7;
		setValueFromAccessor("ATTRIBUTE7", attribute7);
	}

	public String getAttribute8() {
		return attribute8;
	}

	public void setAttribute8(String attribute8) throws Exception {
		this.attribute8 = attribute8;
		setValueFromAccessor("ATTRIBUTE8", attribute8);
	}

	public String getAttribute9() {
		return attribute9;
	}

	public void setAttribute9(String attribute9) throws Exception {
		this.attribute9 = attribute9;
		setValueFromAccessor("ATTRIBUTE9", attribute9);
	}

	public double getBillingCodeId() {
		return billingCodeId;
	}

	public void setBillingCodeId(double billingCodeId) throws Exception {
		this.billingCodeId = billingCodeId;
		setValueFromAccessor("BILLING_CODE_ID", CommonUtil.toString(billingCodeId));
	}

	public double getChequeEndNumber() {
		return chequeEndNumber;
	}

	public void setChequeEndNumber(double chequeEndNumber) throws Exception {
		this.chequeEndNumber = chequeEndNumber;
		setValueFromAccessor("CHEQUE_END_NUMBER", CommonUtil.toString(chequeEndNumber));
	}

	public Date getChequeStartDate() {
		return chequeStartDate;
	}

	public void setChequeStartDate(Date chequeStartDate) throws Exception {
		this.chequeStartDate = chequeStartDate;
		setValueFromAccessor("CHEQUE_START_DATE", CommonUtil.toString(chequeStartDate));
	}

	public double getChequeStartNumber() {
		return chequeStartNumber;
	}

	public void setChequeStartNumber(double chequeStartNumber) throws Exception {
		this.chequeStartNumber = chequeStartNumber;
		setValueFromAccessor("CHEQUE_START_NUMBER", CommonUtil.toString(chequeStartNumber));
	}

	public Date getDateEarned() {
		return dateEarned;
	}

	public void setDateEarned(Date dateEarned) throws Exception {
		this.dateEarned = dateEarned;
		setValueFromAccessor("DATE_EARNED", CommonUtil.toString(dateEarned));
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) throws Exception {
		this.effectiveDate = effectiveDate;
		setValueFromAccessor("EFFECTIVE_DATE", CommonUtil.toString(effectiveDate));
	}

	public double getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(double paymentId) throws Exception {
		this.paymentId = paymentId;
		setValueFromAccessor("PAYMENT_ID", CommonUtil.toString(paymentId));
	}

	public Date getPeriodStartDate() {
		return periodStartDate;
	}

	public void setPeriodStartDate(Date periodStartDate) throws Exception {
		this.periodStartDate = periodStartDate;
		setValueFromAccessor("PERIOD_START_DATE", CommonUtil.toString(periodStartDate));
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) throws Exception {
		this.processStatus = processStatus;
		setValueFromAccessor("PROCESS_STATUS", processStatus);
	}

	public double getRequestId() {
		return requestId;
	}

	public void setRequestId(double requestId) throws Exception {
		this.requestId = requestId;
		setValueFromAccessor("REQUEST_ID", CommonUtil.toString(requestId));
	}

	public double getTimePeriodId() {
		return timePeriodId;
	}

	public void setTimePeriodId(double timePeriodId) throws Exception {
		this.timePeriodId = timePeriodId;
		setValueFromAccessor("TIME_PERIOD_ID", CommonUtil.toString(timePeriodId));
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

		str += "payrollProcessId : "+payrollProcessId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "actionType : "+actionType+"\n";
		str += "actualPayDate : "+actualPayDate+"\n";
		str += "assignmentSetId : "+assignmentSetId+"\n";
		str += "attribute1 : "+attribute1+"\n";
		str += "attribute10 : "+attribute10+"\n";
		str += "attribute2 : "+attribute2+"\n";
		str += "attribute3 : "+attribute3+"\n";
		str += "attribute4 : "+attribute4+"\n";
		str += "attribute5 : "+attribute5+"\n";
		str += "attribute6 : "+attribute6+"\n";
		str += "attribute7 : "+attribute7+"\n";
		str += "attribute8 : "+attribute8+"\n";
		str += "attribute9 : "+attribute9+"\n";
		str += "billingCodeId : "+billingCodeId+"\n";
		str += "chequeEndNumber : "+chequeEndNumber+"\n";
		str += "chequeStartDate : "+chequeStartDate+"\n";
		str += "chequeStartNumber : "+chequeStartNumber+"\n";
		str += "dateEarned : "+dateEarned+"\n";
		str += "effectiveDate : "+effectiveDate+"\n";
		str += "paymentId : "+paymentId+"\n";
		str += "periodStartDate : "+periodStartDate+"\n";
		str += "processStatus : "+processStatus+"\n";
		str += "requestId : "+requestId+"\n";
		str += "timePeriodId : "+timePeriodId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"payrollProcessId\" value=\""+payrollProcessId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"actionType\" value=\""+actionType+"\">";
		str += "<column name=\"actualPayDate\" value=\""+actualPayDate+"\">";
		str += "<column name=\"assignmentSetId\" value=\""+assignmentSetId+"\">";
		str += "<column name=\"attribute1\" value=\""+attribute1+"\">";
		str += "<column name=\"attribute10\" value=\""+attribute10+"\">";
		str += "<column name=\"attribute2\" value=\""+attribute2+"\">";
		str += "<column name=\"attribute3\" value=\""+attribute3+"\">";
		str += "<column name=\"attribute4\" value=\""+attribute4+"\">";
		str += "<column name=\"attribute5\" value=\""+attribute5+"\">";
		str += "<column name=\"attribute6\" value=\""+attribute6+"\">";
		str += "<column name=\"attribute7\" value=\""+attribute7+"\">";
		str += "<column name=\"attribute8\" value=\""+attribute8+"\">";
		str += "<column name=\"attribute9\" value=\""+attribute9+"\">";
		str += "<column name=\"billingCodeId\" value=\""+billingCodeId+"\">";
		str += "<column name=\"chequeEndNumber\" value=\""+chequeEndNumber+"\">";
		str += "<column name=\"chequeStartDate\" value=\""+chequeStartDate+"\">";
		str += "<column name=\"chequeStartNumber\" value=\""+chequeStartNumber+"\">";
		str += "<column name=\"dateEarned\" value=\""+dateEarned+"\">";
		str += "<column name=\"effectiveDate\" value=\""+effectiveDate+"\">";
		str += "<column name=\"paymentId\" value=\""+paymentId+"\">";
		str += "<column name=\"periodStartDate\" value=\""+periodStartDate+"\">";
		str += "<column name=\"processStatus\" value=\""+processStatus+"\">";
		str += "<column name=\"requestId\" value=\""+requestId+"\">";
		str += "<column name=\"timePeriodId\" value=\""+timePeriodId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"payrollProcessId\":\""+payrollProcessId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"actionType\":\""+actionType+"\", ";
		str += "\"actualPayDate\":\""+actualPayDate+"\", ";
		str += "\"assignmentSetId\":\""+assignmentSetId+"\", ";
		str += "\"attribute1\":\""+attribute1+"\", ";
		str += "\"attribute10\":\""+attribute10+"\", ";
		str += "\"attribute2\":\""+attribute2+"\", ";
		str += "\"attribute3\":\""+attribute3+"\", ";
		str += "\"attribute4\":\""+attribute4+"\", ";
		str += "\"attribute5\":\""+attribute5+"\", ";
		str += "\"attribute6\":\""+attribute6+"\", ";
		str += "\"attribute7\":\""+attribute7+"\", ";
		str += "\"attribute8\":\""+attribute8+"\", ";
		str += "\"attribute9\":\""+attribute9+"\", ";
		str += "\"billingCodeId\":\""+billingCodeId+"\", ";
		str += "\"chequeEndNumber\":\""+chequeEndNumber+"\", ";
		str += "\"chequeStartDate\":\""+chequeStartDate+"\", ";
		str += "\"chequeStartNumber\":\""+chequeStartNumber+"\", ";
		str += "\"dateEarned\":\""+dateEarned+"\", ";
		str += "\"effectiveDate\":\""+effectiveDate+"\", ";
		str += "\"paymentId\":\""+paymentId+"\", ";
		str += "\"periodStartDate\":\""+periodStartDate+"\", ";
		str += "\"processStatus\":\""+processStatus+"\", ";
		str += "\"requestId\":\""+requestId+"\", ";
		str += "\"timePeriodId\":\""+timePeriodId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}