/**************************************************************************************************
 * Framework Generated DTO Source
 * - WC_NT_UPDATE_RATES - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class WcNtUpdateRates extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double codeGroupId;
	private String CODE_GROUP_ID;
	private String codeGroupName;
	private String CODE_GROUP_NAME;
	private double codeRateDId;
	private String CODE_RATE_D_ID;
	private double codeRateId;
	private String CODE_RATE_ID;
	private String codeRateName;
	private String CODE_RATE_NAME;
	private Date endDate;
	private String END_DATE;
	private double newPercentage;
	private String NEW_PERCENTAGE;
	private double percentage;
	private String PERCENTAGE;
	private String rateActive;
	private String RATE_ACTIVE;
	private String rateDActive;
	private String RATE_D_ACTIVE;
	private String rateDIsActive;
	private String RATE_D_IS_ACTIVE;
	private String rateIsActive;
	private String RATE_IS_ACTIVE;
	private String remark;
	private String REMARK;
	private Date startDate;
	private String START_DATE;
	private String wicCode;
	private String WIC_CODE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public WcNtUpdateRates() throws Exception {
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
		setFrwVarDateColumn("END_DATE,START_DATE");
		setFrwVarNumberColumn("CODE_GROUP_ID,CODE_RATE_D_ID,CODE_RATE_ID,NEW_PERCENTAGE,PERCENTAGE");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getCodeGroupId() {
		return codeGroupId;
	}

	public void setCodeGroupId(double codeGroupId) throws Exception {
		this.codeGroupId = codeGroupId;
		setValueFromAccessor("CODE_GROUP_ID", CommonUtil.toString(codeGroupId));
	}

	public String getCodeGroupName() {
		return codeGroupName;
	}

	public void setCodeGroupName(String codeGroupName) throws Exception {
		this.codeGroupName = codeGroupName;
		setValueFromAccessor("CODE_GROUP_NAME", codeGroupName);
	}

	public double getCodeRateDId() {
		return codeRateDId;
	}

	public void setCodeRateDId(double codeRateDId) throws Exception {
		this.codeRateDId = codeRateDId;
		setValueFromAccessor("CODE_RATE_D_ID", CommonUtil.toString(codeRateDId));
	}

	public double getCodeRateId() {
		return codeRateId;
	}

	public void setCodeRateId(double codeRateId) throws Exception {
		this.codeRateId = codeRateId;
		setValueFromAccessor("CODE_RATE_ID", CommonUtil.toString(codeRateId));
	}

	public String getCodeRateName() {
		return codeRateName;
	}

	public void setCodeRateName(String codeRateName) throws Exception {
		this.codeRateName = codeRateName;
		setValueFromAccessor("CODE_RATE_NAME", codeRateName);
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) throws Exception {
		this.endDate = endDate;
		setValueFromAccessor("END_DATE", CommonUtil.toString(endDate));
	}

	public double getNewPercentage() {
		return newPercentage;
	}

	public void setNewPercentage(double newPercentage) throws Exception {
		this.newPercentage = newPercentage;
		setValueFromAccessor("NEW_PERCENTAGE", CommonUtil.toString(newPercentage));
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) throws Exception {
		this.percentage = percentage;
		setValueFromAccessor("PERCENTAGE", CommonUtil.toString(percentage));
	}

	public String getRateActive() {
		return rateActive;
	}

	public void setRateActive(String rateActive) throws Exception {
		this.rateActive = rateActive;
		setValueFromAccessor("RATE_ACTIVE", rateActive);
	}

	public String getRateDActive() {
		return rateDActive;
	}

	public void setRateDActive(String rateDActive) throws Exception {
		this.rateDActive = rateDActive;
		setValueFromAccessor("RATE_D_ACTIVE", rateDActive);
	}

	public String getRateDIsActive() {
		return rateDIsActive;
	}

	public void setRateDIsActive(String rateDIsActive) throws Exception {
		this.rateDIsActive = rateDIsActive;
		setValueFromAccessor("RATE_D_IS_ACTIVE", rateDIsActive);
	}

	public String getRateIsActive() {
		return rateIsActive;
	}

	public void setRateIsActive(String rateIsActive) throws Exception {
		this.rateIsActive = rateIsActive;
		setValueFromAccessor("RATE_IS_ACTIVE", rateIsActive);
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) throws Exception {
		this.remark = remark;
		setValueFromAccessor("REMARK", remark);
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws Exception {
		this.startDate = startDate;
		setValueFromAccessor("START_DATE", CommonUtil.toString(startDate));
	}

	public String getWicCode() {
		return wicCode;
	}

	public void setWicCode(String wicCode) throws Exception {
		this.wicCode = wicCode;
		setValueFromAccessor("WIC_CODE", wicCode);
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

		str += "codeGroupId : "+codeGroupId+"\n";
		str += "codeGroupName : "+codeGroupName+"\n";
		str += "codeRateDId : "+codeRateDId+"\n";
		str += "codeRateId : "+codeRateId+"\n";
		str += "codeRateName : "+codeRateName+"\n";
		str += "endDate : "+endDate+"\n";
		str += "newPercentage : "+newPercentage+"\n";
		str += "percentage : "+percentage+"\n";
		str += "rateActive : "+rateActive+"\n";
		str += "rateDActive : "+rateDActive+"\n";
		str += "rateDIsActive : "+rateDIsActive+"\n";
		str += "rateIsActive : "+rateIsActive+"\n";
		str += "remark : "+remark+"\n";
		str += "startDate : "+startDate+"\n";
		str += "wicCode : "+wicCode+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"codeGroupId\" value=\""+codeGroupId+"\">";
		str += "<column name=\"codeGroupName\" value=\""+codeGroupName+"\">";
		str += "<column name=\"codeRateDId\" value=\""+codeRateDId+"\">";
		str += "<column name=\"codeRateId\" value=\""+codeRateId+"\">";
		str += "<column name=\"codeRateName\" value=\""+codeRateName+"\">";
		str += "<column name=\"endDate\" value=\""+endDate+"\">";
		str += "<column name=\"newPercentage\" value=\""+newPercentage+"\">";
		str += "<column name=\"percentage\" value=\""+percentage+"\">";
		str += "<column name=\"rateActive\" value=\""+rateActive+"\">";
		str += "<column name=\"rateDActive\" value=\""+rateDActive+"\">";
		str += "<column name=\"rateDIsActive\" value=\""+rateDIsActive+"\">";
		str += "<column name=\"rateIsActive\" value=\""+rateIsActive+"\">";
		str += "<column name=\"remark\" value=\""+remark+"\">";
		str += "<column name=\"startDate\" value=\""+startDate+"\">";
		str += "<column name=\"wicCode\" value=\""+wicCode+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"codeGroupId\":\""+codeGroupId+"\", ";
		str += "\"codeGroupName\":\""+codeGroupName+"\", ";
		str += "\"codeRateDId\":\""+codeRateDId+"\", ";
		str += "\"codeRateId\":\""+codeRateId+"\", ";
		str += "\"codeRateName\":\""+codeRateName+"\", ";
		str += "\"endDate\":\""+endDate+"\", ";
		str += "\"newPercentage\":\""+newPercentage+"\", ";
		str += "\"percentage\":\""+percentage+"\", ";
		str += "\"rateActive\":\""+rateActive+"\", ";
		str += "\"rateDActive\":\""+rateDActive+"\", ";
		str += "\"rateDIsActive\":\""+rateDIsActive+"\", ";
		str += "\"rateIsActive\":\""+rateIsActive+"\", ";
		str += "\"remark\":\""+remark+"\", ";
		str += "\"startDate\":\""+startDate+"\", ";
		str += "\"wicCode\":\""+wicCode+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}