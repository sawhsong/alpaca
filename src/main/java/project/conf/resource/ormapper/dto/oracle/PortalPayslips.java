/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_PAYSLIPS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalPayslips extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double payslipId;
	private String PAYSLIP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double netAmount;
	private String NET_AMOUNT;
	private String payslipContent;
	private String PAYSLIP_CONTENT;
	private Date payslipDate;
	private String PAYSLIP_DATE;
	private Date periodFromDate;
	private String PERIOD_FROM_DATE;
	private Date periodToDate;
	private String PERIOD_TO_DATE;
	private double personNumber;
	private String PERSON_NUMBER;
	private double paymentId;
	private String PAYMENT_ID;
	private String payslipDescription;
	private String PAYSLIP_DESCRIPTION;
	private String viewed;
	private String VIEWED;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalPayslips() throws Exception {
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
		setFrwVarPrimaryKey("PAYSLIP_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,PAYSLIP_DATE,PERIOD_FROM_DATE,PERIOD_TO_DATE");
		setFrwVarNumberColumn("PAYSLIP_ID,CREATED_BY,LAST_UPDATED_BY,NET_AMOUNT,PERSON_NUMBER,PAYMENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPayslipId() {
		return payslipId;
	}

	public void setPayslipId(double payslipId) throws Exception {
		this.payslipId = payslipId;
		setValueFromAccessor("PAYSLIP_ID", CommonUtil.toString(payslipId));
	}

	public double getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(double createdBy) throws Exception {
		this.createdBy = createdBy;
		setValueFromAccessor("CREATED_BY", CommonUtil.toString(createdBy));
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) throws Exception {
		this.creationDate = creationDate;
		setValueFromAccessor("CREATION_DATE", CommonUtil.toString(creationDate));
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) throws Exception {
		this.lastUpdateDate = lastUpdateDate;
		setValueFromAccessor("LAST_UPDATE_DATE", CommonUtil.toString(lastUpdateDate));
	}

	public double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(double netAmount) throws Exception {
		this.netAmount = netAmount;
		setValueFromAccessor("NET_AMOUNT", CommonUtil.toString(netAmount));
	}

	public String getPayslipContent() {
		return payslipContent;
	}

	public void setPayslipContent(String payslipContent) throws Exception {
		this.payslipContent = payslipContent;
		setValueFromAccessor("PAYSLIP_CONTENT", payslipContent);
	}

	public Date getPayslipDate() {
		return payslipDate;
	}

	public void setPayslipDate(Date payslipDate) throws Exception {
		this.payslipDate = payslipDate;
		setValueFromAccessor("PAYSLIP_DATE", CommonUtil.toString(payslipDate));
	}

	public Date getPeriodFromDate() {
		return periodFromDate;
	}

	public void setPeriodFromDate(Date periodFromDate) throws Exception {
		this.periodFromDate = periodFromDate;
		setValueFromAccessor("PERIOD_FROM_DATE", CommonUtil.toString(periodFromDate));
	}

	public Date getPeriodToDate() {
		return periodToDate;
	}

	public void setPeriodToDate(Date periodToDate) throws Exception {
		this.periodToDate = periodToDate;
		setValueFromAccessor("PERIOD_TO_DATE", CommonUtil.toString(periodToDate));
	}

	public double getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(double personNumber) throws Exception {
		this.personNumber = personNumber;
		setValueFromAccessor("PERSON_NUMBER", CommonUtil.toString(personNumber));
	}

	public double getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(double paymentId) throws Exception {
		this.paymentId = paymentId;
		setValueFromAccessor("PAYMENT_ID", CommonUtil.toString(paymentId));
	}

	public String getPayslipDescription() {
		return payslipDescription;
	}

	public void setPayslipDescription(String payslipDescription) throws Exception {
		this.payslipDescription = payslipDescription;
		setValueFromAccessor("PAYSLIP_DESCRIPTION", payslipDescription);
	}

	public String getViewed() {
		return viewed;
	}

	public void setViewed(String viewed) throws Exception {
		this.viewed = viewed;
		setValueFromAccessor("VIEWED", viewed);
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

		str += "payslipId : "+payslipId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "netAmount : "+netAmount+"\n";
		str += "payslipContent : "+payslipContent+"\n";
		str += "payslipDate : "+payslipDate+"\n";
		str += "periodFromDate : "+periodFromDate+"\n";
		str += "periodToDate : "+periodToDate+"\n";
		str += "personNumber : "+personNumber+"\n";
		str += "paymentId : "+paymentId+"\n";
		str += "payslipDescription : "+payslipDescription+"\n";
		str += "viewed : "+viewed+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"payslipId\" value=\""+payslipId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"netAmount\" value=\""+netAmount+"\">";
		str += "<column name=\"payslipContent\" value=\""+payslipContent+"\">";
		str += "<column name=\"payslipDate\" value=\""+payslipDate+"\">";
		str += "<column name=\"periodFromDate\" value=\""+periodFromDate+"\">";
		str += "<column name=\"periodToDate\" value=\""+periodToDate+"\">";
		str += "<column name=\"personNumber\" value=\""+personNumber+"\">";
		str += "<column name=\"paymentId\" value=\""+paymentId+"\">";
		str += "<column name=\"payslipDescription\" value=\""+payslipDescription+"\">";
		str += "<column name=\"viewed\" value=\""+viewed+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"payslipId\":\""+payslipId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"netAmount\":\""+netAmount+"\", ";
		str += "\"payslipContent\":\""+payslipContent+"\", ";
		str += "\"payslipDate\":\""+payslipDate+"\", ";
		str += "\"periodFromDate\":\""+periodFromDate+"\", ";
		str += "\"periodToDate\":\""+periodToDate+"\", ";
		str += "\"personNumber\":\""+personNumber+"\", ";
		str += "\"paymentId\":\""+paymentId+"\", ";
		str += "\"payslipDescription\":\""+payslipDescription+"\", ";
		str += "\"viewed\":\""+viewed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}