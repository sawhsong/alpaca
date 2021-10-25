/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_USER_ACTION - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalUserAction extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double actionId;
	private String ACTION_ID;
	private double actionBy;
	private String ACTION_BY;
	private String actionContent;
	private String ACTION_CONTENT;
	private Date actionDate;
	private String ACTION_DATE;
	private String actionType;
	private String ACTION_TYPE;
	private String emailedTo;
	private String EMAILED_TO;
	private String ipAddress;
	private String IP_ADDRESS;
	private String userName;
	private String USER_NAME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalUserAction() throws Exception {
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
		setFrwVarPrimaryKey("ACTION_ID");
		setFrwVarDateColumn("ACTION_DATE");
		setFrwVarNumberColumn("ACTION_ID,ACTION_BY");
		setFrwVarClobColumn("ACTION_CONTENT");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getActionId() {
		return actionId;
	}

	public void setActionId(double actionId) throws Exception {
		this.actionId = actionId;
		setValueFromAccessor("ACTION_ID", CommonUtil.toString(actionId));
	}

	public double getActionBy() {
		return actionBy;
	}

	public void setActionBy(double actionBy) throws Exception {
		this.actionBy = actionBy;
		setValueFromAccessor("ACTION_BY", CommonUtil.toString(actionBy));
	}

	public String getActionContent() {
		return actionContent;
	}

	public void setActionContent(String actionContent) throws Exception {
		this.actionContent = actionContent;
		setValueFromAccessor("ACTION_CONTENT", actionContent);
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) throws Exception {
		this.actionDate = actionDate;
		setValueFromAccessor("ACTION_DATE", CommonUtil.toString(actionDate));
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) throws Exception {
		this.actionType = actionType;
		setValueFromAccessor("ACTION_TYPE", actionType);
	}

	public String getEmailedTo() {
		return emailedTo;
	}

	public void setEmailedTo(String emailedTo) throws Exception {
		this.emailedTo = emailedTo;
		setValueFromAccessor("EMAILED_TO", emailedTo);
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) throws Exception {
		this.ipAddress = ipAddress;
		setValueFromAccessor("IP_ADDRESS", ipAddress);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) throws Exception {
		this.userName = userName;
		setValueFromAccessor("USER_NAME", userName);
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

		str += "actionId : "+actionId+"\n";
		str += "actionBy : "+actionBy+"\n";
		str += "actionContent : "+actionContent+"\n";
		str += "actionDate : "+actionDate+"\n";
		str += "actionType : "+actionType+"\n";
		str += "emailedTo : "+emailedTo+"\n";
		str += "ipAddress : "+ipAddress+"\n";
		str += "userName : "+userName+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"actionId\" value=\""+actionId+"\">";
		str += "<column name=\"actionBy\" value=\""+actionBy+"\">";
		str += "<column name=\"actionContent\" value=\""+actionContent+"\">";
		str += "<column name=\"actionDate\" value=\""+actionDate+"\">";
		str += "<column name=\"actionType\" value=\""+actionType+"\">";
		str += "<column name=\"emailedTo\" value=\""+emailedTo+"\">";
		str += "<column name=\"ipAddress\" value=\""+ipAddress+"\">";
		str += "<column name=\"userName\" value=\""+userName+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"actionId\":\""+actionId+"\", ";
		str += "\"actionBy\":\""+actionBy+"\", ";
		str += "\"actionContent\":\""+actionContent+"\", ";
		str += "\"actionDate\":\""+actionDate+"\", ";
		str += "\"actionType\":\""+actionType+"\", ";
		str += "\"emailedTo\":\""+emailedTo+"\", ";
		str += "\"ipAddress\":\""+ipAddress+"\", ";
		str += "\"userName\":\""+userName+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}