/**************************************************************************************************
 * Framework Generated DTO Source
 * - TIMESHEET - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class Timesheet extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double timesheetId;
	private String TIMESHEET_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private Date periodEndDate;
	private String PERIOD_END_DATE;
	private Date periodStartDate;
	private String PERIOD_START_DATE;
	private String approvRejectComments;
	private String APPROV_REJECT_COMMENTS;
	private Date approvRejectDateTime;
	private String APPROV_REJECT_DATE_TIME;
	private String approvRejectIpAddress;
	private String APPROV_REJECT_IP_ADDRESS;
	private double approvRejectPersonId;
	private String APPROV_REJECT_PERSON_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date dueDate;
	private String DUE_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String status;
	private String STATUS;
	private Date submitDateTime;
	private String SUBMIT_DATE_TIME;
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
	public Timesheet() throws Exception {
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
		setFrwVarPrimaryKey("TIMESHEET_ID");
		setFrwVarDateColumn("PERIOD_END_DATE,PERIOD_START_DATE,APPROV_REJECT_DATE_TIME,CREATION_DATE,DUE_DATE,LAST_UPDATE_DATE,SUBMIT_DATE_TIME");
		setFrwVarNumberColumn("TIMESHEET_ID,ASSIGNMENT_ID,APPROV_REJECT_PERSON_ID,CREATED_BY,LAST_UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getTimesheetId() {
		return timesheetId;
	}

	public void setTimesheetId(double timesheetId) throws Exception {
		this.timesheetId = timesheetId;
		setValueFromAccessor("TIMESHEET_ID", CommonUtil.toString(timesheetId));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
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

	public String getApprovRejectComments() {
		return approvRejectComments;
	}

	public void setApprovRejectComments(String approvRejectComments) throws Exception {
		this.approvRejectComments = approvRejectComments;
		setValueFromAccessor("APPROV_REJECT_COMMENTS", approvRejectComments);
	}

	public Date getApprovRejectDateTime() {
		return approvRejectDateTime;
	}

	public void setApprovRejectDateTime(Date approvRejectDateTime) throws Exception {
		this.approvRejectDateTime = approvRejectDateTime;
		setValueFromAccessor("APPROV_REJECT_DATE_TIME", CommonUtil.toString(approvRejectDateTime));
	}

	public String getApprovRejectIpAddress() {
		return approvRejectIpAddress;
	}

	public void setApprovRejectIpAddress(String approvRejectIpAddress) throws Exception {
		this.approvRejectIpAddress = approvRejectIpAddress;
		setValueFromAccessor("APPROV_REJECT_IP_ADDRESS", approvRejectIpAddress);
	}

	public double getApprovRejectPersonId() {
		return approvRejectPersonId;
	}

	public void setApprovRejectPersonId(double approvRejectPersonId) throws Exception {
		this.approvRejectPersonId = approvRejectPersonId;
		setValueFromAccessor("APPROV_REJECT_PERSON_ID", CommonUtil.toString(approvRejectPersonId));
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

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) throws Exception {
		this.dueDate = dueDate;
		setValueFromAccessor("DUE_DATE", CommonUtil.toString(dueDate));
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public Date getSubmitDateTime() {
		return submitDateTime;
	}

	public void setSubmitDateTime(Date submitDateTime) throws Exception {
		this.submitDateTime = submitDateTime;
		setValueFromAccessor("SUBMIT_DATE_TIME", CommonUtil.toString(submitDateTime));
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

		str += "timesheetId : "+timesheetId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "periodEndDate : "+periodEndDate+"\n";
		str += "periodStartDate : "+periodStartDate+"\n";
		str += "approvRejectComments : "+approvRejectComments+"\n";
		str += "approvRejectDateTime : "+approvRejectDateTime+"\n";
		str += "approvRejectIpAddress : "+approvRejectIpAddress+"\n";
		str += "approvRejectPersonId : "+approvRejectPersonId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "dueDate : "+dueDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "status : "+status+"\n";
		str += "submitDateTime : "+submitDateTime+"\n";
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

		str += "<column name=\"timesheetId\" value=\""+timesheetId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"periodEndDate\" value=\""+periodEndDate+"\">";
		str += "<column name=\"periodStartDate\" value=\""+periodStartDate+"\">";
		str += "<column name=\"approvRejectComments\" value=\""+approvRejectComments+"\">";
		str += "<column name=\"approvRejectDateTime\" value=\""+approvRejectDateTime+"\">";
		str += "<column name=\"approvRejectIpAddress\" value=\""+approvRejectIpAddress+"\">";
		str += "<column name=\"approvRejectPersonId\" value=\""+approvRejectPersonId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"dueDate\" value=\""+dueDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"submitDateTime\" value=\""+submitDateTime+"\">";
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

		str += "\"timesheetId\":\""+timesheetId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"periodEndDate\":\""+periodEndDate+"\", ";
		str += "\"periodStartDate\":\""+periodStartDate+"\", ";
		str += "\"approvRejectComments\":\""+approvRejectComments+"\", ";
		str += "\"approvRejectDateTime\":\""+approvRejectDateTime+"\", ";
		str += "\"approvRejectIpAddress\":\""+approvRejectIpAddress+"\", ";
		str += "\"approvRejectPersonId\":\""+approvRejectPersonId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"dueDate\":\""+dueDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"submitDateTime\":\""+submitDateTime+"\", ";
		str += "\"unit\":\""+unit+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}