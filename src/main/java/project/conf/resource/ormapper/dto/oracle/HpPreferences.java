/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_PREFERENCES - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpPreferences extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double preferenceId;
	private String PREFERENCE_ID;
	private double createdBy;
	private String CREATED_BY;
	private String displayType;
	private String DISPLAY_TYPE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private String preferenceName;
	private String PREFERENCE_NAME;
	private Date creationDate;
	private String CREATION_DATE;
	private String defaultValue;
	private String DEFAULT_VALUE;
	private String description;
	private String DESCRIPTION;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String lookupType;
	private String LOOKUP_TYPE;
	private String multipleValues;
	private String MULTIPLE_VALUES;
	private String userAllowedFlag;
	private String USER_ALLOWED_FLAG;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpPreferences() throws Exception {
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
		setFrwVarPrimaryKey("PREFERENCE_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("PREFERENCE_ID,CREATED_BY,LAST_UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarDefaultValue("SYSDATE,SYSDATE");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(double preferenceId) throws Exception {
		this.preferenceId = preferenceId;
		setValueFromAccessor("PREFERENCE_ID", CommonUtil.toString(preferenceId));
	}

	public double getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(double createdBy) throws Exception {
		this.createdBy = createdBy;
		setValueFromAccessor("CREATED_BY", CommonUtil.toString(createdBy));
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) throws Exception {
		this.displayType = displayType;
		setValueFromAccessor("DISPLAY_TYPE", displayType);
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public String getPreferenceName() {
		return preferenceName;
	}

	public void setPreferenceName(String preferenceName) throws Exception {
		this.preferenceName = preferenceName;
		setValueFromAccessor("PREFERENCE_NAME", preferenceName);
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) throws Exception {
		this.creationDate = creationDate;
		setValueFromAccessor("CREATION_DATE", CommonUtil.toString(creationDate));
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) throws Exception {
		this.defaultValue = defaultValue;
		setValueFromAccessor("DEFAULT_VALUE", defaultValue);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) throws Exception {
		this.lastUpdateDate = lastUpdateDate;
		setValueFromAccessor("LAST_UPDATE_DATE", CommonUtil.toString(lastUpdateDate));
	}

	public String getLookupType() {
		return lookupType;
	}

	public void setLookupType(String lookupType) throws Exception {
		this.lookupType = lookupType;
		setValueFromAccessor("LOOKUP_TYPE", lookupType);
	}

	public String getMultipleValues() {
		return multipleValues;
	}

	public void setMultipleValues(String multipleValues) throws Exception {
		this.multipleValues = multipleValues;
		setValueFromAccessor("MULTIPLE_VALUES", multipleValues);
	}

	public String getUserAllowedFlag() {
		return userAllowedFlag;
	}

	public void setUserAllowedFlag(String userAllowedFlag) throws Exception {
		this.userAllowedFlag = userAllowedFlag;
		setValueFromAccessor("USER_ALLOWED_FLAG", userAllowedFlag);
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

		str += "preferenceId : "+preferenceId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "displayType : "+displayType+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "preferenceName : "+preferenceName+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "defaultValue : "+defaultValue+"\n";
		str += "description : "+description+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "lookupType : "+lookupType+"\n";
		str += "multipleValues : "+multipleValues+"\n";
		str += "userAllowedFlag : "+userAllowedFlag+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"preferenceId\" value=\""+preferenceId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"displayType\" value=\""+displayType+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"preferenceName\" value=\""+preferenceName+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"defaultValue\" value=\""+defaultValue+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"lookupType\" value=\""+lookupType+"\">";
		str += "<column name=\"multipleValues\" value=\""+multipleValues+"\">";
		str += "<column name=\"userAllowedFlag\" value=\""+userAllowedFlag+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"preferenceId\":\""+preferenceId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"displayType\":\""+displayType+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"preferenceName\":\""+preferenceName+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"defaultValue\":\""+defaultValue+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"lookupType\":\""+lookupType+"\", ";
		str += "\"multipleValues\":\""+multipleValues+"\", ";
		str += "\"userAllowedFlag\":\""+userAllowedFlag+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}