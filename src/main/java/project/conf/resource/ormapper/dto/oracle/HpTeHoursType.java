/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_TE_HOURS_TYPE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpTeHoursType extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double hoursTypeId;
	private String HOURS_TYPE_ID;
	private String attribute1;
	private String ATTRIBUTE1;
	private String attribute2;
	private String ATTRIBUTE2;
	private String attribute3;
	private String ATTRIBUTE3;
	private String attribute4;
	private String ATTRIBUTE4;
	private String attribute5;
	private String ATTRIBUTE5;
	private double elementId;
	private String ELEMENT_ID;
	private String hoursType;
	private String HOURS_TYPE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpTeHoursType() throws Exception {
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
		setFrwVarPrimaryKey("HOURS_TYPE_ID");
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("HOURS_TYPE_ID,ELEMENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getHoursTypeId() {
		return hoursTypeId;
	}

	public void setHoursTypeId(double hoursTypeId) throws Exception {
		this.hoursTypeId = hoursTypeId;
		setValueFromAccessor("HOURS_TYPE_ID", CommonUtil.toString(hoursTypeId));
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) throws Exception {
		this.attribute1 = attribute1;
		setValueFromAccessor("ATTRIBUTE1", attribute1);
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) throws Exception {
		this.attribute2 = attribute2;
		setValueFromAccessor("ATTRIBUTE2", attribute2);
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) throws Exception {
		this.attribute3 = attribute3;
		setValueFromAccessor("ATTRIBUTE3", attribute3);
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) throws Exception {
		this.attribute4 = attribute4;
		setValueFromAccessor("ATTRIBUTE4", attribute4);
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) throws Exception {
		this.attribute5 = attribute5;
		setValueFromAccessor("ATTRIBUTE5", attribute5);
	}

	public double getElementId() {
		return elementId;
	}

	public void setElementId(double elementId) throws Exception {
		this.elementId = elementId;
		setValueFromAccessor("ELEMENT_ID", CommonUtil.toString(elementId));
	}

	public String getHoursType() {
		return hoursType;
	}

	public void setHoursType(String hoursType) throws Exception {
		this.hoursType = hoursType;
		setValueFromAccessor("HOURS_TYPE", hoursType);
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

		str += "hoursTypeId : "+hoursTypeId+"\n";
		str += "attribute1 : "+attribute1+"\n";
		str += "attribute2 : "+attribute2+"\n";
		str += "attribute3 : "+attribute3+"\n";
		str += "attribute4 : "+attribute4+"\n";
		str += "attribute5 : "+attribute5+"\n";
		str += "elementId : "+elementId+"\n";
		str += "hoursType : "+hoursType+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"hoursTypeId\" value=\""+hoursTypeId+"\">";
		str += "<column name=\"attribute1\" value=\""+attribute1+"\">";
		str += "<column name=\"attribute2\" value=\""+attribute2+"\">";
		str += "<column name=\"attribute3\" value=\""+attribute3+"\">";
		str += "<column name=\"attribute4\" value=\""+attribute4+"\">";
		str += "<column name=\"attribute5\" value=\""+attribute5+"\">";
		str += "<column name=\"elementId\" value=\""+elementId+"\">";
		str += "<column name=\"hoursType\" value=\""+hoursType+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"hoursTypeId\":\""+hoursTypeId+"\", ";
		str += "\"attribute1\":\""+attribute1+"\", ";
		str += "\"attribute2\":\""+attribute2+"\", ";
		str += "\"attribute3\":\""+attribute3+"\", ";
		str += "\"attribute4\":\""+attribute4+"\", ";
		str += "\"attribute5\":\""+attribute5+"\", ";
		str += "\"elementId\":\""+elementId+"\", ";
		str += "\"hoursType\":\""+hoursType+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}