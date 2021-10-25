/**************************************************************************************************
 * Framework Generated DTO Source
 * - TIMESHEET_LINE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class TimesheetLine extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double timesheetLineId;
	private String TIMESHEET_LINE_ID;
	private double assignmentRateId;
	private String ASSIGNMENT_RATE_ID;
	private String description;
	private String DESCRIPTION;
	private String endTime;
	private String END_TIME;
	private double hours;
	private String HOURS;
	private String nonworkedTime;
	private String NONWORKED_TIME;
	private String startTime;
	private String START_TIME;
	private double timesheetId;
	private String TIMESHEET_ID;
	private Date workDate;
	private String WORK_DATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public TimesheetLine() throws Exception {
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
		setFrwVarPrimaryKey("TIMESHEET_LINE_ID");
		setFrwVarDateColumn("WORK_DATE");
		setFrwVarNumberColumn("TIMESHEET_LINE_ID,ASSIGNMENT_RATE_ID,HOURS,TIMESHEET_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getTimesheetLineId() {
		return timesheetLineId;
	}

	public void setTimesheetLineId(double timesheetLineId) throws Exception {
		this.timesheetLineId = timesheetLineId;
		setValueFromAccessor("TIMESHEET_LINE_ID", CommonUtil.toString(timesheetLineId));
	}

	public double getAssignmentRateId() {
		return assignmentRateId;
	}

	public void setAssignmentRateId(double assignmentRateId) throws Exception {
		this.assignmentRateId = assignmentRateId;
		setValueFromAccessor("ASSIGNMENT_RATE_ID", CommonUtil.toString(assignmentRateId));
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) throws Exception {
		this.endTime = endTime;
		setValueFromAccessor("END_TIME", endTime);
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) throws Exception {
		this.hours = hours;
		setValueFromAccessor("HOURS", CommonUtil.toString(hours));
	}

	public String getNonworkedTime() {
		return nonworkedTime;
	}

	public void setNonworkedTime(String nonworkedTime) throws Exception {
		this.nonworkedTime = nonworkedTime;
		setValueFromAccessor("NONWORKED_TIME", nonworkedTime);
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) throws Exception {
		this.startTime = startTime;
		setValueFromAccessor("START_TIME", startTime);
	}

	public double getTimesheetId() {
		return timesheetId;
	}

	public void setTimesheetId(double timesheetId) throws Exception {
		this.timesheetId = timesheetId;
		setValueFromAccessor("TIMESHEET_ID", CommonUtil.toString(timesheetId));
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) throws Exception {
		this.workDate = workDate;
		setValueFromAccessor("WORK_DATE", CommonUtil.toString(workDate));
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

		str += "timesheetLineId : "+timesheetLineId+"\n";
		str += "assignmentRateId : "+assignmentRateId+"\n";
		str += "description : "+description+"\n";
		str += "endTime : "+endTime+"\n";
		str += "hours : "+hours+"\n";
		str += "nonworkedTime : "+nonworkedTime+"\n";
		str += "startTime : "+startTime+"\n";
		str += "timesheetId : "+timesheetId+"\n";
		str += "workDate : "+workDate+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"timesheetLineId\" value=\""+timesheetLineId+"\">";
		str += "<column name=\"assignmentRateId\" value=\""+assignmentRateId+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"endTime\" value=\""+endTime+"\">";
		str += "<column name=\"hours\" value=\""+hours+"\">";
		str += "<column name=\"nonworkedTime\" value=\""+nonworkedTime+"\">";
		str += "<column name=\"startTime\" value=\""+startTime+"\">";
		str += "<column name=\"timesheetId\" value=\""+timesheetId+"\">";
		str += "<column name=\"workDate\" value=\""+workDate+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"timesheetLineId\":\""+timesheetLineId+"\", ";
		str += "\"assignmentRateId\":\""+assignmentRateId+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"endTime\":\""+endTime+"\", ";
		str += "\"hours\":\""+hours+"\", ";
		str += "\"nonworkedTime\":\""+nonworkedTime+"\", ";
		str += "\"startTime\":\""+startTime+"\", ";
		str += "\"timesheetId\":\""+timesheetId+"\", ";
		str += "\"workDate\":\""+workDate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}