/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_ACCRUAL_PLANS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpAccrualPlans extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double planId;
	private String PLAN_ID;
	private String accrualName;
	private String ACCRUAL_NAME;
	private String accrualType;
	private String ACCRUAL_TYPE;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String description;
	private String DESCRIPTION;
	private String displayName;
	private String DISPLAY_NAME;
	private double elementId;
	private String ELEMENT_ID;
	private double noOfHours;
	private String NO_OF_HOURS;
	private double totalAnnualHours;
	private String TOTAL_ANNUAL_HOURS;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpAccrualPlans() throws Exception {
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
		setFrwVarPrimaryKey("PLAN_ID");
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("PLAN_ID,BUSINESS_GROUP_ID,ELEMENT_ID,NO_OF_HOURS,TOTAL_ANNUAL_HOURS");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPlanId() {
		return planId;
	}

	public void setPlanId(double planId) throws Exception {
		this.planId = planId;
		setValueFromAccessor("PLAN_ID", CommonUtil.toString(planId));
	}

	public String getAccrualName() {
		return accrualName;
	}

	public void setAccrualName(String accrualName) throws Exception {
		this.accrualName = accrualName;
		setValueFromAccessor("ACCRUAL_NAME", accrualName);
	}

	public String getAccrualType() {
		return accrualType;
	}

	public void setAccrualType(String accrualType) throws Exception {
		this.accrualType = accrualType;
		setValueFromAccessor("ACCRUAL_TYPE", accrualType);
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) throws Exception {
		this.displayName = displayName;
		setValueFromAccessor("DISPLAY_NAME", displayName);
	}

	public double getElementId() {
		return elementId;
	}

	public void setElementId(double elementId) throws Exception {
		this.elementId = elementId;
		setValueFromAccessor("ELEMENT_ID", CommonUtil.toString(elementId));
	}

	public double getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(double noOfHours) throws Exception {
		this.noOfHours = noOfHours;
		setValueFromAccessor("NO_OF_HOURS", CommonUtil.toString(noOfHours));
	}

	public double getTotalAnnualHours() {
		return totalAnnualHours;
	}

	public void setTotalAnnualHours(double totalAnnualHours) throws Exception {
		this.totalAnnualHours = totalAnnualHours;
		setValueFromAccessor("TOTAL_ANNUAL_HOURS", CommonUtil.toString(totalAnnualHours));
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

		str += "planId : "+planId+"\n";
		str += "accrualName : "+accrualName+"\n";
		str += "accrualType : "+accrualType+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "description : "+description+"\n";
		str += "displayName : "+displayName+"\n";
		str += "elementId : "+elementId+"\n";
		str += "noOfHours : "+noOfHours+"\n";
		str += "totalAnnualHours : "+totalAnnualHours+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"planId\" value=\""+planId+"\">";
		str += "<column name=\"accrualName\" value=\""+accrualName+"\">";
		str += "<column name=\"accrualType\" value=\""+accrualType+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"displayName\" value=\""+displayName+"\">";
		str += "<column name=\"elementId\" value=\""+elementId+"\">";
		str += "<column name=\"noOfHours\" value=\""+noOfHours+"\">";
		str += "<column name=\"totalAnnualHours\" value=\""+totalAnnualHours+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"planId\":\""+planId+"\", ";
		str += "\"accrualName\":\""+accrualName+"\", ";
		str += "\"accrualType\":\""+accrualType+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"displayName\":\""+displayName+"\", ";
		str += "\"elementId\":\""+elementId+"\", ";
		str += "\"noOfHours\":\""+noOfHours+"\", ";
		str += "\"totalAnnualHours\":\""+totalAnnualHours+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}