/**************************************************************************************************
 * Framework Generated DTO Source
 * - LEAVE_REQUEST - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class LeaveRequest extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double leaveRequestId;
	private String LEAVE_REQUEST_ID;
	private String approveRejectComments;
	private String APPROVE_REJECT_COMMENTS;
	private Date approveRejectDate;
	private String APPROVE_REJECT_DATE;
	private String approveRejectIpAddress;
	private String APPROVE_REJECT_IP_ADDRESS;
	private double approveRejectPersonId;
	private String APPROVE_REJECT_PERSON_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double duration;
	private String DURATION;
	private String durationUnit;
	private String DURATION_UNIT;
	private Date endDate;
	private String END_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String leaveCategory;
	private String LEAVE_CATEGORY;
	private String leaveType;
	private String LEAVE_TYPE;
	private String reason;
	private String REASON;
	private Date startDate;
	private String START_DATE;
	private String status;
	private String STATUS;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public LeaveRequest() throws Exception {
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
		setFrwVarPrimaryKey("LEAVE_REQUEST_ID");
		setFrwVarDateColumn("APPROVE_REJECT_DATE,CREATION_DATE,END_DATE,LAST_UPDATE_DATE,START_DATE");
		setFrwVarNumberColumn("LEAVE_REQUEST_ID,APPROVE_REJECT_PERSON_ID,ASSIGNMENT_ID,CREATED_BY,DURATION,LAST_UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getLeaveRequestId() {
		return leaveRequestId;
	}

	public void setLeaveRequestId(double leaveRequestId) throws Exception {
		this.leaveRequestId = leaveRequestId;
		setValueFromAccessor("LEAVE_REQUEST_ID", CommonUtil.toString(leaveRequestId));
	}

	public String getApproveRejectComments() {
		return approveRejectComments;
	}

	public void setApproveRejectComments(String approveRejectComments) throws Exception {
		this.approveRejectComments = approveRejectComments;
		setValueFromAccessor("APPROVE_REJECT_COMMENTS", approveRejectComments);
	}

	public Date getApproveRejectDate() {
		return approveRejectDate;
	}

	public void setApproveRejectDate(Date approveRejectDate) throws Exception {
		this.approveRejectDate = approveRejectDate;
		setValueFromAccessor("APPROVE_REJECT_DATE", CommonUtil.toString(approveRejectDate));
	}

	public String getApproveRejectIpAddress() {
		return approveRejectIpAddress;
	}

	public void setApproveRejectIpAddress(String approveRejectIpAddress) throws Exception {
		this.approveRejectIpAddress = approveRejectIpAddress;
		setValueFromAccessor("APPROVE_REJECT_IP_ADDRESS", approveRejectIpAddress);
	}

	public double getApproveRejectPersonId() {
		return approveRejectPersonId;
	}

	public void setApproveRejectPersonId(double approveRejectPersonId) throws Exception {
		this.approveRejectPersonId = approveRejectPersonId;
		setValueFromAccessor("APPROVE_REJECT_PERSON_ID", CommonUtil.toString(approveRejectPersonId));
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) throws Exception {
		this.creationDate = creationDate;
		setValueFromAccessor("CREATION_DATE", CommonUtil.toString(creationDate));
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) throws Exception {
		this.duration = duration;
		setValueFromAccessor("DURATION", CommonUtil.toString(duration));
	}

	public String getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(String durationUnit) throws Exception {
		this.durationUnit = durationUnit;
		setValueFromAccessor("DURATION_UNIT", durationUnit);
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) throws Exception {
		this.endDate = endDate;
		setValueFromAccessor("END_DATE", CommonUtil.toString(endDate));
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

	public String getLeaveCategory() {
		return leaveCategory;
	}

	public void setLeaveCategory(String leaveCategory) throws Exception {
		this.leaveCategory = leaveCategory;
		setValueFromAccessor("LEAVE_CATEGORY", leaveCategory);
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) throws Exception {
		this.leaveType = leaveType;
		setValueFromAccessor("LEAVE_TYPE", leaveType);
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) throws Exception {
		this.reason = reason;
		setValueFromAccessor("REASON", reason);
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws Exception {
		this.startDate = startDate;
		setValueFromAccessor("START_DATE", CommonUtil.toString(startDate));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
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

		str += "leaveRequestId : "+leaveRequestId+"\n";
		str += "approveRejectComments : "+approveRejectComments+"\n";
		str += "approveRejectDate : "+approveRejectDate+"\n";
		str += "approveRejectIpAddress : "+approveRejectIpAddress+"\n";
		str += "approveRejectPersonId : "+approveRejectPersonId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "duration : "+duration+"\n";
		str += "durationUnit : "+durationUnit+"\n";
		str += "endDate : "+endDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "leaveCategory : "+leaveCategory+"\n";
		str += "leaveType : "+leaveType+"\n";
		str += "reason : "+reason+"\n";
		str += "startDate : "+startDate+"\n";
		str += "status : "+status+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"leaveRequestId\" value=\""+leaveRequestId+"\">";
		str += "<column name=\"approveRejectComments\" value=\""+approveRejectComments+"\">";
		str += "<column name=\"approveRejectDate\" value=\""+approveRejectDate+"\">";
		str += "<column name=\"approveRejectIpAddress\" value=\""+approveRejectIpAddress+"\">";
		str += "<column name=\"approveRejectPersonId\" value=\""+approveRejectPersonId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"duration\" value=\""+duration+"\">";
		str += "<column name=\"durationUnit\" value=\""+durationUnit+"\">";
		str += "<column name=\"endDate\" value=\""+endDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"leaveCategory\" value=\""+leaveCategory+"\">";
		str += "<column name=\"leaveType\" value=\""+leaveType+"\">";
		str += "<column name=\"reason\" value=\""+reason+"\">";
		str += "<column name=\"startDate\" value=\""+startDate+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"leaveRequestId\":\""+leaveRequestId+"\", ";
		str += "\"approveRejectComments\":\""+approveRejectComments+"\", ";
		str += "\"approveRejectDate\":\""+approveRejectDate+"\", ";
		str += "\"approveRejectIpAddress\":\""+approveRejectIpAddress+"\", ";
		str += "\"approveRejectPersonId\":\""+approveRejectPersonId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"duration\":\""+duration+"\", ";
		str += "\"durationUnit\":\""+durationUnit+"\", ";
		str += "\"endDate\":\""+endDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"leaveCategory\":\""+leaveCategory+"\", ";
		str += "\"leaveType\":\""+leaveType+"\", ";
		str += "\"reason\":\""+reason+"\", ";
		str += "\"startDate\":\""+startDate+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}