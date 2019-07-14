/**************************************************************************************************
 * Framework Generated DTO Source
 * - NAV_SYNC_LOG - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class NavSyncLog extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String comments;
	private String COMMENTS;
	private double logId;
	private String LOG_ID;
	private String navDbName;
	private String NAV_DB_NAME;
	private String objectId;
	private String OBJECT_ID;
	private String objectToSync;
	private String OBJECT_TO_SYNC;
	private String operationType;
	private String OPERATION_TYPE;
	private double syncBy;
	private String SYNC_BY;
	private Date syncDate;
	private String SYNC_DATE;
	private String syncStatus;
	private String SYNC_STATUS;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public NavSyncLog() throws Exception {
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
		setFrwVarPrimaryKey("");
		setFrwVarDateColumn("SYNC_DATE");
		setFrwVarNumberColumn("LOG_ID,SYNC_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public double getLogId() {
		return logId;
	}

	public void setLogId(double logId) throws Exception {
		this.logId = logId;
		setValueFromAccessor("LOG_ID", CommonUtil.toString(logId));
	}

	public String getNavDbName() {
		return navDbName;
	}

	public void setNavDbName(String navDbName) throws Exception {
		this.navDbName = navDbName;
		setValueFromAccessor("NAV_DB_NAME", navDbName);
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) throws Exception {
		this.objectId = objectId;
		setValueFromAccessor("OBJECT_ID", objectId);
	}

	public String getObjectToSync() {
		return objectToSync;
	}

	public void setObjectToSync(String objectToSync) throws Exception {
		this.objectToSync = objectToSync;
		setValueFromAccessor("OBJECT_TO_SYNC", objectToSync);
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) throws Exception {
		this.operationType = operationType;
		setValueFromAccessor("OPERATION_TYPE", operationType);
	}

	public double getSyncBy() {
		return syncBy;
	}

	public void setSyncBy(double syncBy) throws Exception {
		this.syncBy = syncBy;
		setValueFromAccessor("SYNC_BY", CommonUtil.toString(syncBy));
	}

	public Date getSyncDate() {
		return syncDate;
	}

	public void setSyncDate(Date syncDate) throws Exception {
		this.syncDate = syncDate;
		setValueFromAccessor("SYNC_DATE", CommonUtil.toString(syncDate));
	}

	public String getSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(String syncStatus) throws Exception {
		this.syncStatus = syncStatus;
		setValueFromAccessor("SYNC_STATUS", syncStatus);
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

		str += "comments : "+comments+"\n";
		str += "logId : "+logId+"\n";
		str += "navDbName : "+navDbName+"\n";
		str += "objectId : "+objectId+"\n";
		str += "objectToSync : "+objectToSync+"\n";
		str += "operationType : "+operationType+"\n";
		str += "syncBy : "+syncBy+"\n";
		str += "syncDate : "+syncDate+"\n";
		str += "syncStatus : "+syncStatus+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"logId\" value=\""+logId+"\">";
		str += "<column name=\"navDbName\" value=\""+navDbName+"\">";
		str += "<column name=\"objectId\" value=\""+objectId+"\">";
		str += "<column name=\"objectToSync\" value=\""+objectToSync+"\">";
		str += "<column name=\"operationType\" value=\""+operationType+"\">";
		str += "<column name=\"syncBy\" value=\""+syncBy+"\">";
		str += "<column name=\"syncDate\" value=\""+syncDate+"\">";
		str += "<column name=\"syncStatus\" value=\""+syncStatus+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"comments\":\""+comments+"\", ";
		str += "\"logId\":\""+logId+"\", ";
		str += "\"navDbName\":\""+navDbName+"\", ";
		str += "\"objectId\":\""+objectId+"\", ";
		str += "\"objectToSync\":\""+objectToSync+"\", ";
		str += "\"operationType\":\""+operationType+"\", ";
		str += "\"syncBy\":\""+syncBy+"\", ";
		str += "\"syncDate\":\""+syncDate+"\", ";
		str += "\"syncStatus\":\""+syncStatus+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}