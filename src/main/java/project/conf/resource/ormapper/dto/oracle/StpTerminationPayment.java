/**************************************************************************************************
 * Framework Generated DTO Source
 * - STP_TERMINATION_PAYMENT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class StpTerminationPayment extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String etpCode;
	private String ETP_CODE;
	private double etpPaygAmount;
	private String ETP_PAYG_AMOUNT;
	private String etpPaymentDate;
	private String ETP_PAYMENT_DATE;
	private Date etpPaymentDateOld;
	private String ETP_PAYMENT_DATE_OLD;
	private double etpTaxableComp;
	private String ETP_TAXABLE_COMP;
	private double etpTaxfreeComponent;
	private String ETP_TAXFREE_COMPONENT;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double payeeId;
	private String PAYEE_ID;
	private double terminationPayId;
	private String TERMINATION_PAY_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public StpTerminationPayment() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,ETP_PAYMENT_DATE_OLD,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("BUSINESS_GROUP_ID,CREATED_BY,ETP_PAYG_AMOUNT,ETP_TAXABLE_COMP,ETP_TAXFREE_COMPONENT,LAST_UPDATED_BY,PAYEE_ID,TERMINATION_PAY_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
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

	public String getEtpCode() {
		return etpCode;
	}

	public void setEtpCode(String etpCode) throws Exception {
		this.etpCode = etpCode;
		setValueFromAccessor("ETP_CODE", etpCode);
	}

	public double getEtpPaygAmount() {
		return etpPaygAmount;
	}

	public void setEtpPaygAmount(double etpPaygAmount) throws Exception {
		this.etpPaygAmount = etpPaygAmount;
		setValueFromAccessor("ETP_PAYG_AMOUNT", CommonUtil.toString(etpPaygAmount));
	}

	public String getEtpPaymentDate() {
		return etpPaymentDate;
	}

	public void setEtpPaymentDate(String etpPaymentDate) throws Exception {
		this.etpPaymentDate = etpPaymentDate;
		setValueFromAccessor("ETP_PAYMENT_DATE", etpPaymentDate);
	}

	public Date getEtpPaymentDateOld() {
		return etpPaymentDateOld;
	}

	public void setEtpPaymentDateOld(Date etpPaymentDateOld) throws Exception {
		this.etpPaymentDateOld = etpPaymentDateOld;
		setValueFromAccessor("ETP_PAYMENT_DATE_OLD", CommonUtil.toString(etpPaymentDateOld));
	}

	public double getEtpTaxableComp() {
		return etpTaxableComp;
	}

	public void setEtpTaxableComp(double etpTaxableComp) throws Exception {
		this.etpTaxableComp = etpTaxableComp;
		setValueFromAccessor("ETP_TAXABLE_COMP", CommonUtil.toString(etpTaxableComp));
	}

	public double getEtpTaxfreeComponent() {
		return etpTaxfreeComponent;
	}

	public void setEtpTaxfreeComponent(double etpTaxfreeComponent) throws Exception {
		this.etpTaxfreeComponent = etpTaxfreeComponent;
		setValueFromAccessor("ETP_TAXFREE_COMPONENT", CommonUtil.toString(etpTaxfreeComponent));
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

	public double getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(double payeeId) throws Exception {
		this.payeeId = payeeId;
		setValueFromAccessor("PAYEE_ID", CommonUtil.toString(payeeId));
	}

	public double getTerminationPayId() {
		return terminationPayId;
	}

	public void setTerminationPayId(double terminationPayId) throws Exception {
		this.terminationPayId = terminationPayId;
		setValueFromAccessor("TERMINATION_PAY_ID", CommonUtil.toString(terminationPayId));
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

		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "etpCode : "+etpCode+"\n";
		str += "etpPaygAmount : "+etpPaygAmount+"\n";
		str += "etpPaymentDate : "+etpPaymentDate+"\n";
		str += "etpPaymentDateOld : "+etpPaymentDateOld+"\n";
		str += "etpTaxableComp : "+etpTaxableComp+"\n";
		str += "etpTaxfreeComponent : "+etpTaxfreeComponent+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "payeeId : "+payeeId+"\n";
		str += "terminationPayId : "+terminationPayId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"etpCode\" value=\""+etpCode+"\">";
		str += "<column name=\"etpPaygAmount\" value=\""+etpPaygAmount+"\">";
		str += "<column name=\"etpPaymentDate\" value=\""+etpPaymentDate+"\">";
		str += "<column name=\"etpPaymentDateOld\" value=\""+etpPaymentDateOld+"\">";
		str += "<column name=\"etpTaxableComp\" value=\""+etpTaxableComp+"\">";
		str += "<column name=\"etpTaxfreeComponent\" value=\""+etpTaxfreeComponent+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"payeeId\" value=\""+payeeId+"\">";
		str += "<column name=\"terminationPayId\" value=\""+terminationPayId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"etpCode\":\""+etpCode+"\", ";
		str += "\"etpPaygAmount\":\""+etpPaygAmount+"\", ";
		str += "\"etpPaymentDate\":\""+etpPaymentDate+"\", ";
		str += "\"etpPaymentDateOld\":\""+etpPaymentDateOld+"\", ";
		str += "\"etpTaxableComp\":\""+etpTaxableComp+"\", ";
		str += "\"etpTaxfreeComponent\":\""+etpTaxfreeComponent+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"payeeId\":\""+payeeId+"\", ";
		str += "\"terminationPayId\":\""+terminationPayId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}