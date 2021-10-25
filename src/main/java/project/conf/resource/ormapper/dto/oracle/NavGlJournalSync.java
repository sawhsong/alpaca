/**************************************************************************************************
 * Framework Generated DTO Source
 * - NAV_GL_JOURNAL_SYNC - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class NavGlJournalSync extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double syncId;
	private String SYNC_ID;
	private double crTotal;
	private String CR_TOTAL;
	private double drTotal;
	private String DR_TOTAL;
	private Date journalDate;
	private String JOURNAL_DATE;
	private double syncBy;
	private String SYNC_BY;
	private Date syncDate;
	private String SYNC_DATE;
	private String syncStatus;
	private String SYNC_STATUS;
	private String navObjectType;
	private String NAV_OBJECT_TYPE;
	private double paymentId;
	private String PAYMENT_ID;
	private String paymentMethod;
	private String PAYMENT_METHOD;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public NavGlJournalSync() throws Exception {
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
		setFrwVarPrimaryKey("SYNC_ID");
		setFrwVarDateColumn("JOURNAL_DATE,SYNC_DATE");
		setFrwVarNumberColumn("SYNC_ID,CR_TOTAL,DR_TOTAL,SYNC_BY,PAYMENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getSyncId() {
		return syncId;
	}

	public void setSyncId(double syncId) throws Exception {
		this.syncId = syncId;
		setValueFromAccessor("SYNC_ID", CommonUtil.toString(syncId));
	}

	public double getCrTotal() {
		return crTotal;
	}

	public void setCrTotal(double crTotal) throws Exception {
		this.crTotal = crTotal;
		setValueFromAccessor("CR_TOTAL", CommonUtil.toString(crTotal));
	}

	public double getDrTotal() {
		return drTotal;
	}

	public void setDrTotal(double drTotal) throws Exception {
		this.drTotal = drTotal;
		setValueFromAccessor("DR_TOTAL", CommonUtil.toString(drTotal));
	}

	public Date getJournalDate() {
		return journalDate;
	}

	public void setJournalDate(Date journalDate) throws Exception {
		this.journalDate = journalDate;
		setValueFromAccessor("JOURNAL_DATE", CommonUtil.toString(journalDate));
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

	public String getNavObjectType() {
		return navObjectType;
	}

	public void setNavObjectType(String navObjectType) throws Exception {
		this.navObjectType = navObjectType;
		setValueFromAccessor("NAV_OBJECT_TYPE", navObjectType);
	}

	public double getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(double paymentId) throws Exception {
		this.paymentId = paymentId;
		setValueFromAccessor("PAYMENT_ID", CommonUtil.toString(paymentId));
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) throws Exception {
		this.paymentMethod = paymentMethod;
		setValueFromAccessor("PAYMENT_METHOD", paymentMethod);
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

		str += "syncId : "+syncId+"\n";
		str += "crTotal : "+crTotal+"\n";
		str += "drTotal : "+drTotal+"\n";
		str += "journalDate : "+journalDate+"\n";
		str += "syncBy : "+syncBy+"\n";
		str += "syncDate : "+syncDate+"\n";
		str += "syncStatus : "+syncStatus+"\n";
		str += "navObjectType : "+navObjectType+"\n";
		str += "paymentId : "+paymentId+"\n";
		str += "paymentMethod : "+paymentMethod+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"syncId\" value=\""+syncId+"\">";
		str += "<column name=\"crTotal\" value=\""+crTotal+"\">";
		str += "<column name=\"drTotal\" value=\""+drTotal+"\">";
		str += "<column name=\"journalDate\" value=\""+journalDate+"\">";
		str += "<column name=\"syncBy\" value=\""+syncBy+"\">";
		str += "<column name=\"syncDate\" value=\""+syncDate+"\">";
		str += "<column name=\"syncStatus\" value=\""+syncStatus+"\">";
		str += "<column name=\"navObjectType\" value=\""+navObjectType+"\">";
		str += "<column name=\"paymentId\" value=\""+paymentId+"\">";
		str += "<column name=\"paymentMethod\" value=\""+paymentMethod+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"syncId\":\""+syncId+"\", ";
		str += "\"crTotal\":\""+crTotal+"\", ";
		str += "\"drTotal\":\""+drTotal+"\", ";
		str += "\"journalDate\":\""+journalDate+"\", ";
		str += "\"syncBy\":\""+syncBy+"\", ";
		str += "\"syncDate\":\""+syncDate+"\", ";
		str += "\"syncStatus\":\""+syncStatus+"\", ";
		str += "\"navObjectType\":\""+navObjectType+"\", ";
		str += "\"paymentId\":\""+paymentId+"\", ";
		str += "\"paymentMethod\":\""+paymentMethod+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}