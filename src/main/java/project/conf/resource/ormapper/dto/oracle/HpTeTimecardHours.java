/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_TE_TIMECARD_HOURS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpTeTimecardHours extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double timecardHourId;
	private String TIMECARD_HOUR_ID;
	private double createdBy;
	private String CREATED_BY;
	private double hours;
	private String HOURS;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private double lineId;
	private String LINE_ID;
	private String status;
	private String STATUS;
	private double timecardId;
	private String TIMECARD_ID;
	private Date workDate;
	private String WORK_DATE;
	private double assignmentElementId;
	private String ASSIGNMENT_ELEMENT_ID;
	private Date creationDate;
	private String CREATION_DATE;
	private String errorMessage;
	private String ERROR_MESSAGE;
	private double invoiceId;
	private String INVOICE_ID;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String payrollTransferFlag;
	private String PAYROLL_TRANSFER_FLAG;
	private Date timeIn;
	private String TIME_IN;
	private Date timeOut;
	private String TIME_OUT;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpTeTimecardHours() throws Exception {
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
		setFrwVarPrimaryKey("TIMECARD_HOUR_ID");
		setFrwVarDateColumn("WORK_DATE,CREATION_DATE,LAST_UPDATE_DATE,TIME_IN,TIME_OUT");
		setFrwVarNumberColumn("TIMECARD_HOUR_ID,CREATED_BY,HOURS,LAST_UPDATED_BY,LINE_ID,TIMECARD_ID,ASSIGNMENT_ELEMENT_ID,INVOICE_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("CREATION_DATE,LAST_UPDATE_DATE,PAYROLL_TRANSFER_FLAG");
		setFrwVarDefaultValue("SYSDATE,SYSDATE,U");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getTimecardHourId() {
		return timecardHourId;
	}

	public void setTimecardHourId(double timecardHourId) throws Exception {
		this.timecardHourId = timecardHourId;
		setValueFromAccessor("TIMECARD_HOUR_ID", CommonUtil.toString(timecardHourId));
	}

	public double getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(double createdBy) throws Exception {
		this.createdBy = createdBy;
		setValueFromAccessor("CREATED_BY", CommonUtil.toString(createdBy));
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) throws Exception {
		this.hours = hours;
		setValueFromAccessor("HOURS", CommonUtil.toString(hours));
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public double getLineId() {
		return lineId;
	}

	public void setLineId(double lineId) throws Exception {
		this.lineId = lineId;
		setValueFromAccessor("LINE_ID", CommonUtil.toString(lineId));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public double getTimecardId() {
		return timecardId;
	}

	public void setTimecardId(double timecardId) throws Exception {
		this.timecardId = timecardId;
		setValueFromAccessor("TIMECARD_ID", CommonUtil.toString(timecardId));
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) throws Exception {
		this.workDate = workDate;
		setValueFromAccessor("WORK_DATE", CommonUtil.toString(workDate));
	}

	public double getAssignmentElementId() {
		return assignmentElementId;
	}

	public void setAssignmentElementId(double assignmentElementId) throws Exception {
		this.assignmentElementId = assignmentElementId;
		setValueFromAccessor("ASSIGNMENT_ELEMENT_ID", CommonUtil.toString(assignmentElementId));
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

	public String getPayrollTransferFlag() {
		return payrollTransferFlag;
	}

	public void setPayrollTransferFlag(String payrollTransferFlag) throws Exception {
		this.payrollTransferFlag = payrollTransferFlag;
		setValueFromAccessor("PAYROLL_TRANSFER_FLAG", payrollTransferFlag);
	}

	public Date getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Date timeIn) throws Exception {
		this.timeIn = timeIn;
		setValueFromAccessor("TIME_IN", CommonUtil.toString(timeIn));
	}

	public Date getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Date timeOut) throws Exception {
		this.timeOut = timeOut;
		setValueFromAccessor("TIME_OUT", CommonUtil.toString(timeOut));
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

		str += "timecardHourId : "+timecardHourId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "hours : "+hours+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lineId : "+lineId+"\n";
		str += "status : "+status+"\n";
		str += "timecardId : "+timecardId+"\n";
		str += "workDate : "+workDate+"\n";
		str += "assignmentElementId : "+assignmentElementId+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "errorMessage : "+errorMessage+"\n";
		str += "invoiceId : "+invoiceId+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "payrollTransferFlag : "+payrollTransferFlag+"\n";
		str += "timeIn : "+timeIn+"\n";
		str += "timeOut : "+timeOut+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"timecardHourId\" value=\""+timecardHourId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"hours\" value=\""+hours+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lineId\" value=\""+lineId+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"timecardId\" value=\""+timecardId+"\">";
		str += "<column name=\"workDate\" value=\""+workDate+"\">";
		str += "<column name=\"assignmentElementId\" value=\""+assignmentElementId+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"errorMessage\" value=\""+errorMessage+"\">";
		str += "<column name=\"invoiceId\" value=\""+invoiceId+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"payrollTransferFlag\" value=\""+payrollTransferFlag+"\">";
		str += "<column name=\"timeIn\" value=\""+timeIn+"\">";
		str += "<column name=\"timeOut\" value=\""+timeOut+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"timecardHourId\":\""+timecardHourId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"hours\":\""+hours+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lineId\":\""+lineId+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"timecardId\":\""+timecardId+"\", ";
		str += "\"workDate\":\""+workDate+"\", ";
		str += "\"assignmentElementId\":\""+assignmentElementId+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"errorMessage\":\""+errorMessage+"\", ";
		str += "\"invoiceId\":\""+invoiceId+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"payrollTransferFlag\":\""+payrollTransferFlag+"\", ";
		str += "\"timeIn\":\""+timeIn+"\", ";
		str += "\"timeOut\":\""+timeOut+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}