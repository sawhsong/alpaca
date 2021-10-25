/**************************************************************************************************
 * Framework Generated DTO Source
 * - ASG_DELIVERABLES_RATES_LOG - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class AsgDeliverablesRatesLog extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double logId;
	private String LOG_ID;
	private double asgDeliverablesRatesId;
	private String ASG_DELIVERABLES_RATES_ID;
	private Date actionDate;
	private String ACTION_DATE;
	private String approveRejectComments;
	private String APPROVE_REJECT_COMMENTS;
	private Date approveRejectDateTime;
	private String APPROVE_REJECT_DATE_TIME;
	private String approveRejectIp;
	private String APPROVE_REJECT_IP;
	private double approveRejectPersonId;
	private String APPROVE_REJECT_PERSON_ID;
	private String attachedFile;
	private String ATTACHED_FILE;
	private String comments;
	private String COMMENTS;
	private String fileName;
	private String FILE_NAME;
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
	public AsgDeliverablesRatesLog() throws Exception {
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
		setFrwVarPrimaryKey("LOG_ID");
		setFrwVarDateColumn("ACTION_DATE,APPROVE_REJECT_DATE_TIME");
		setFrwVarNumberColumn("LOG_ID,ASG_DELIVERABLES_RATES_ID,APPROVE_REJECT_PERSON_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getLogId() {
		return logId;
	}

	public void setLogId(double logId) throws Exception {
		this.logId = logId;
		setValueFromAccessor("LOG_ID", CommonUtil.toString(logId));
	}

	public double getAsgDeliverablesRatesId() {
		return asgDeliverablesRatesId;
	}

	public void setAsgDeliverablesRatesId(double asgDeliverablesRatesId) throws Exception {
		this.asgDeliverablesRatesId = asgDeliverablesRatesId;
		setValueFromAccessor("ASG_DELIVERABLES_RATES_ID", CommonUtil.toString(asgDeliverablesRatesId));
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) throws Exception {
		this.actionDate = actionDate;
		setValueFromAccessor("ACTION_DATE", CommonUtil.toString(actionDate));
	}

	public String getApproveRejectComments() {
		return approveRejectComments;
	}

	public void setApproveRejectComments(String approveRejectComments) throws Exception {
		this.approveRejectComments = approveRejectComments;
		setValueFromAccessor("APPROVE_REJECT_COMMENTS", approveRejectComments);
	}

	public Date getApproveRejectDateTime() {
		return approveRejectDateTime;
	}

	public void setApproveRejectDateTime(Date approveRejectDateTime) throws Exception {
		this.approveRejectDateTime = approveRejectDateTime;
		setValueFromAccessor("APPROVE_REJECT_DATE_TIME", CommonUtil.toString(approveRejectDateTime));
	}

	public String getApproveRejectIp() {
		return approveRejectIp;
	}

	public void setApproveRejectIp(String approveRejectIp) throws Exception {
		this.approveRejectIp = approveRejectIp;
		setValueFromAccessor("APPROVE_REJECT_IP", approveRejectIp);
	}

	public double getApproveRejectPersonId() {
		return approveRejectPersonId;
	}

	public void setApproveRejectPersonId(double approveRejectPersonId) throws Exception {
		this.approveRejectPersonId = approveRejectPersonId;
		setValueFromAccessor("APPROVE_REJECT_PERSON_ID", CommonUtil.toString(approveRejectPersonId));
	}

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) throws Exception {
		this.attachedFile = attachedFile;
		setValueFromAccessor("ATTACHED_FILE", attachedFile);
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) throws Exception {
		this.fileName = fileName;
		setValueFromAccessor("FILE_NAME", fileName);
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

		str += "logId : "+logId+"\n";
		str += "asgDeliverablesRatesId : "+asgDeliverablesRatesId+"\n";
		str += "actionDate : "+actionDate+"\n";
		str += "approveRejectComments : "+approveRejectComments+"\n";
		str += "approveRejectDateTime : "+approveRejectDateTime+"\n";
		str += "approveRejectIp : "+approveRejectIp+"\n";
		str += "approveRejectPersonId : "+approveRejectPersonId+"\n";
		str += "attachedFile : "+attachedFile+"\n";
		str += "comments : "+comments+"\n";
		str += "fileName : "+fileName+"\n";
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

		str += "<column name=\"logId\" value=\""+logId+"\">";
		str += "<column name=\"asgDeliverablesRatesId\" value=\""+asgDeliverablesRatesId+"\">";
		str += "<column name=\"actionDate\" value=\""+actionDate+"\">";
		str += "<column name=\"approveRejectComments\" value=\""+approveRejectComments+"\">";
		str += "<column name=\"approveRejectDateTime\" value=\""+approveRejectDateTime+"\">";
		str += "<column name=\"approveRejectIp\" value=\""+approveRejectIp+"\">";
		str += "<column name=\"approveRejectPersonId\" value=\""+approveRejectPersonId+"\">";
		str += "<column name=\"attachedFile\" value=\""+attachedFile+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"fileName\" value=\""+fileName+"\">";
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

		str += "\"logId\":\""+logId+"\", ";
		str += "\"asgDeliverablesRatesId\":\""+asgDeliverablesRatesId+"\", ";
		str += "\"actionDate\":\""+actionDate+"\", ";
		str += "\"approveRejectComments\":\""+approveRejectComments+"\", ";
		str += "\"approveRejectDateTime\":\""+approveRejectDateTime+"\", ";
		str += "\"approveRejectIp\":\""+approveRejectIp+"\", ";
		str += "\"approveRejectPersonId\":\""+approveRejectPersonId+"\", ";
		str += "\"attachedFile\":\""+attachedFile+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"fileName\":\""+fileName+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}