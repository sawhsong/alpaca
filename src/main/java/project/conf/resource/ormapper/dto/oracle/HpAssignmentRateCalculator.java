/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_ASSIGNMENT_RATE_CALCULATOR - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpAssignmentRateCalculator extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double rateCalculatorId;
	private String RATE_CALCULATOR_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String calculationType;
	private String CALCULATION_TYPE;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double managementFee;
	private String MANAGEMENT_FEE;
	private String managementFeeConsolidation;
	private String MANAGEMENT_FEE_CONSOLIDATION;
	private String managementFeeType;
	private String MANAGEMENT_FEE_TYPE;
	private double payrollTax;
	private String PAYROLL_TAX;
	private String payrollTaxConsolidation;
	private String PAYROLL_TAX_CONSOLIDATION;
	private String payrollTaxType;
	private String PAYROLL_TAX_TYPE;
	private String periodType;
	private String PERIOD_TYPE;
	private double totalBilledAmount;
	private String TOTAL_BILLED_AMOUNT;
	private String workingState;
	private String WORKING_STATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpAssignmentRateCalculator() throws Exception {
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
		setFrwVarPrimaryKey("RATE_CALCULATOR_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("RATE_CALCULATOR_ID,ASSIGNMENT_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,MANAGEMENT_FEE,PAYROLL_TAX,TOTAL_BILLED_AMOUNT");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getRateCalculatorId() {
		return rateCalculatorId;
	}

	public void setRateCalculatorId(double rateCalculatorId) throws Exception {
		this.rateCalculatorId = rateCalculatorId;
		setValueFromAccessor("RATE_CALCULATOR_ID", CommonUtil.toString(rateCalculatorId));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(String calculationType) throws Exception {
		this.calculationType = calculationType;
		setValueFromAccessor("CALCULATION_TYPE", calculationType);
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

	public double getManagementFee() {
		return managementFee;
	}

	public void setManagementFee(double managementFee) throws Exception {
		this.managementFee = managementFee;
		setValueFromAccessor("MANAGEMENT_FEE", CommonUtil.toString(managementFee));
	}

	public String getManagementFeeConsolidation() {
		return managementFeeConsolidation;
	}

	public void setManagementFeeConsolidation(String managementFeeConsolidation) throws Exception {
		this.managementFeeConsolidation = managementFeeConsolidation;
		setValueFromAccessor("MANAGEMENT_FEE_CONSOLIDATION", managementFeeConsolidation);
	}

	public String getManagementFeeType() {
		return managementFeeType;
	}

	public void setManagementFeeType(String managementFeeType) throws Exception {
		this.managementFeeType = managementFeeType;
		setValueFromAccessor("MANAGEMENT_FEE_TYPE", managementFeeType);
	}

	public double getPayrollTax() {
		return payrollTax;
	}

	public void setPayrollTax(double payrollTax) throws Exception {
		this.payrollTax = payrollTax;
		setValueFromAccessor("PAYROLL_TAX", CommonUtil.toString(payrollTax));
	}

	public String getPayrollTaxConsolidation() {
		return payrollTaxConsolidation;
	}

	public void setPayrollTaxConsolidation(String payrollTaxConsolidation) throws Exception {
		this.payrollTaxConsolidation = payrollTaxConsolidation;
		setValueFromAccessor("PAYROLL_TAX_CONSOLIDATION", payrollTaxConsolidation);
	}

	public String getPayrollTaxType() {
		return payrollTaxType;
	}

	public void setPayrollTaxType(String payrollTaxType) throws Exception {
		this.payrollTaxType = payrollTaxType;
		setValueFromAccessor("PAYROLL_TAX_TYPE", payrollTaxType);
	}

	public String getPeriodType() {
		return periodType;
	}

	public void setPeriodType(String periodType) throws Exception {
		this.periodType = periodType;
		setValueFromAccessor("PERIOD_TYPE", periodType);
	}

	public double getTotalBilledAmount() {
		return totalBilledAmount;
	}

	public void setTotalBilledAmount(double totalBilledAmount) throws Exception {
		this.totalBilledAmount = totalBilledAmount;
		setValueFromAccessor("TOTAL_BILLED_AMOUNT", CommonUtil.toString(totalBilledAmount));
	}

	public String getWorkingState() {
		return workingState;
	}

	public void setWorkingState(String workingState) throws Exception {
		this.workingState = workingState;
		setValueFromAccessor("WORKING_STATE", workingState);
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

		str += "rateCalculatorId : "+rateCalculatorId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "calculationType : "+calculationType+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "managementFee : "+managementFee+"\n";
		str += "managementFeeConsolidation : "+managementFeeConsolidation+"\n";
		str += "managementFeeType : "+managementFeeType+"\n";
		str += "payrollTax : "+payrollTax+"\n";
		str += "payrollTaxConsolidation : "+payrollTaxConsolidation+"\n";
		str += "payrollTaxType : "+payrollTaxType+"\n";
		str += "periodType : "+periodType+"\n";
		str += "totalBilledAmount : "+totalBilledAmount+"\n";
		str += "workingState : "+workingState+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"rateCalculatorId\" value=\""+rateCalculatorId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"calculationType\" value=\""+calculationType+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"managementFee\" value=\""+managementFee+"\">";
		str += "<column name=\"managementFeeConsolidation\" value=\""+managementFeeConsolidation+"\">";
		str += "<column name=\"managementFeeType\" value=\""+managementFeeType+"\">";
		str += "<column name=\"payrollTax\" value=\""+payrollTax+"\">";
		str += "<column name=\"payrollTaxConsolidation\" value=\""+payrollTaxConsolidation+"\">";
		str += "<column name=\"payrollTaxType\" value=\""+payrollTaxType+"\">";
		str += "<column name=\"periodType\" value=\""+periodType+"\">";
		str += "<column name=\"totalBilledAmount\" value=\""+totalBilledAmount+"\">";
		str += "<column name=\"workingState\" value=\""+workingState+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"rateCalculatorId\":\""+rateCalculatorId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"calculationType\":\""+calculationType+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"managementFee\":\""+managementFee+"\", ";
		str += "\"managementFeeConsolidation\":\""+managementFeeConsolidation+"\", ";
		str += "\"managementFeeType\":\""+managementFeeType+"\", ";
		str += "\"payrollTax\":\""+payrollTax+"\", ";
		str += "\"payrollTaxConsolidation\":\""+payrollTaxConsolidation+"\", ";
		str += "\"payrollTaxType\":\""+payrollTaxType+"\", ";
		str += "\"periodType\":\""+periodType+"\", ";
		str += "\"totalBilledAmount\":\""+totalBilledAmount+"\", ";
		str += "\"workingState\":\""+workingState+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}