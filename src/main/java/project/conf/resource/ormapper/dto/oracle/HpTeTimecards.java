/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_TE_TIMECARDS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpTeTimecards extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double timecardId;
	private String TIMECARD_ID;
	private double approvPersonId;
	private String APPROV_PERSON_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double createdBy;
	private String CREATED_BY;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private double personId;
	private String PERSON_ID;
	private String status;
	private String STATUS;
	private Date approveRejectionDatetime;
	private String APPROVE_REJECTION_DATETIME;
	private String approveRejectComments;
	private String APPROVE_REJECT_COMMENTS;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String comments;
	private String COMMENTS;
	private Date creationDate;
	private String CREATION_DATE;
	private String errorMessage;
	private String ERROR_MESSAGE;
	private double invoiceId;
	private String INVOICE_ID;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String payrollNotes;
	private String PAYROLL_NOTES;
	private String payrollTransferFlag;
	private String PAYROLL_TRANSFER_FLAG;
	private Date periodEndDate;
	private String PERIOD_END_DATE;
	private Date periodStartDate;
	private String PERIOD_START_DATE;
	private Date submitDatetime;
	private String SUBMIT_DATETIME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpTeTimecards() throws Exception {
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
		setFrwVarPrimaryKey("TIMECARD_ID");
		setFrwVarDateColumn("APPROVE_REJECTION_DATETIME,CREATION_DATE,LAST_UPDATE_DATE,PERIOD_END_DATE,PERIOD_START_DATE,SUBMIT_DATETIME");
		setFrwVarNumberColumn("TIMECARD_ID,APPROV_PERSON_ID,ASSIGNMENT_ID,CREATED_BY,LAST_UPDATED_BY,PERSON_ID,BUSINESS_GROUP_ID,INVOICE_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("STATUS,CREATION_DATE,LAST_UPDATE_DATE,PAYROLL_TRANSFER_FLAG");
		setFrwVarDefaultValue("W,SYSDATE,SYSDATE,U");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getTimecardId() {
		return timecardId;
	}

	public void setTimecardId(double timecardId) throws Exception {
		this.timecardId = timecardId;
		setValueFromAccessor("TIMECARD_ID", CommonUtil.toString(timecardId));
	}

	public double getApprovPersonId() {
		return approvPersonId;
	}

	public void setApprovPersonId(double approvPersonId) throws Exception {
		this.approvPersonId = approvPersonId;
		setValueFromAccessor("APPROV_PERSON_ID", CommonUtil.toString(approvPersonId));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(double createdBy) throws Exception {
		this.createdBy = createdBy;
		setValueFromAccessor("CREATED_BY", CommonUtil.toString(createdBy));
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public Date getApproveRejectionDatetime() {
		return approveRejectionDatetime;
	}

	public void setApproveRejectionDatetime(Date approveRejectionDatetime) throws Exception {
		this.approveRejectionDatetime = approveRejectionDatetime;
		setValueFromAccessor("APPROVE_REJECTION_DATETIME", CommonUtil.toString(approveRejectionDatetime));
	}

	public String getApproveRejectComments() {
		return approveRejectComments;
	}

	public void setApproveRejectComments(String approveRejectComments) throws Exception {
		this.approveRejectComments = approveRejectComments;
		setValueFromAccessor("APPROVE_REJECT_COMMENTS", approveRejectComments);
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) throws Exception {
		this.creationDate = creationDate;
		setValueFromAccessor("CREATION_DATE", CommonUtil.toString(creationDate));
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) throws Exception {
		this.errorMessage = errorMessage;
		setValueFromAccessor("ERROR_MESSAGE", errorMessage);
	}

	public double getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(double invoiceId) throws Exception {
		this.invoiceId = invoiceId;
		setValueFromAccessor("INVOICE_ID", CommonUtil.toString(invoiceId));
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) throws Exception {
		this.lastUpdateDate = lastUpdateDate;
		setValueFromAccessor("LAST_UPDATE_DATE", CommonUtil.toString(lastUpdateDate));
	}

	public String getPayrollNotes() {
		return payrollNotes;
	}

	public void setPayrollNotes(String payrollNotes) throws Exception {
		this.payrollNotes = payrollNotes;
		setValueFromAccessor("PAYROLL_NOTES", payrollNotes);
	}

	public String getPayrollTransferFlag() {
		return payrollTransferFlag;
	}

	public void setPayrollTransferFlag(String payrollTransferFlag) throws Exception {
		this.payrollTransferFlag = payrollTransferFlag;
		setValueFromAccessor("PAYROLL_TRANSFER_FLAG", payrollTransferFlag);
	}

	public Date getPeriodEndDate() {
		return periodEndDate;
	}

	public void setPeriodEndDate(Date periodEndDate) throws Exception {
		this.periodEndDate = periodEndDate;
		setValueFromAccessor("PERIOD_END_DATE", CommonUtil.toString(periodEndDate));
	}

	public Date getPeriodStartDate() {
		return periodStartDate;
	}

	public void setPeriodStartDate(Date periodStartDate) throws Exception {
		this.periodStartDate = periodStartDate;
		setValueFromAccessor("PERIOD_START_DATE", CommonUtil.toString(periodStartDate));
	}

	public Date getSubmitDatetime() {
		return submitDatetime;
	}

	public void setSubmitDatetime(Date submitDatetime) throws Exception {
		this.submitDatetime = submitDatetime;
		setValueFromAccessor("SUBMIT_DATETIME", CommonUtil.toString(submitDatetime));
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

		str += "timecardId : "+timecardId+"\n";
		str += "approvPersonId : "+approvPersonId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "personId : "+personId+"\n";
		str += "status : "+status+"\n";
		str += "approveRejectionDatetime : "+approveRejectionDatetime+"\n";
		str += "approveRejectComments : "+approveRejectComments+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "comments : "+comments+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "errorMessage : "+errorMessage+"\n";
		str += "invoiceId : "+invoiceId+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "payrollNotes : "+payrollNotes+"\n";
		str += "payrollTransferFlag : "+payrollTransferFlag+"\n";
		str += "periodEndDate : "+periodEndDate+"\n";
		str += "periodStartDate : "+periodStartDate+"\n";
		str += "submitDatetime : "+submitDatetime+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"timecardId\" value=\""+timecardId+"\">";
		str += "<column name=\"approvPersonId\" value=\""+approvPersonId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"approveRejectionDatetime\" value=\""+approveRejectionDatetime+"\">";
		str += "<column name=\"approveRejectComments\" value=\""+approveRejectComments+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"errorMessage\" value=\""+errorMessage+"\">";
		str += "<column name=\"invoiceId\" value=\""+invoiceId+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"payrollNotes\" value=\""+payrollNotes+"\">";
		str += "<column name=\"payrollTransferFlag\" value=\""+payrollTransferFlag+"\">";
		str += "<column name=\"periodEndDate\" value=\""+periodEndDate+"\">";
		str += "<column name=\"periodStartDate\" value=\""+periodStartDate+"\">";
		str += "<column name=\"submitDatetime\" value=\""+submitDatetime+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"timecardId\":\""+timecardId+"\", ";
		str += "\"approvPersonId\":\""+approvPersonId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"approveRejectionDatetime\":\""+approveRejectionDatetime+"\", ";
		str += "\"approveRejectComments\":\""+approveRejectComments+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"errorMessage\":\""+errorMessage+"\", ";
		str += "\"invoiceId\":\""+invoiceId+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"payrollNotes\":\""+payrollNotes+"\", ";
		str += "\"payrollTransferFlag\":\""+payrollTransferFlag+"\", ";
		str += "\"periodEndDate\":\""+periodEndDate+"\", ";
		str += "\"periodStartDate\":\""+periodStartDate+"\", ";
		str += "\"submitDatetime\":\""+submitDatetime+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}