/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_BALANCE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpBalance extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double assignmentActionId;
	private String ASSIGNMENT_ACTION_ID;
	private double actionSequence;
	private String ACTION_SEQUENCE;
	private String actionType;
	private String ACTION_TYPE;
	private double actRunTypeId;
	private String ACT_RUN_TYPE_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double billingCodeId;
	private String BILLING_CODE_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double consolidationSetId;
	private String CONSOLIDATION_SET_ID;
	private Date creationDate;
	private String CREATION_DATE;
	private Date dateEarned;
	private String DATE_EARNED;
	private Date effectiveDate;
	private String EFFECTIVE_DATE;
	private double paymentId;
	private String PAYMENT_ID;
	private double payrollActionId;
	private String PAYROLL_ACTION_ID;
	private Date payActionCreationDate;
	private String PAY_ACTION_CREATION_DATE;
	private Date periodEndDate;
	private String PERIOD_END_DATE;
	private double personId;
	private String PERSON_ID;
	private double taxUnitId;
	private String TAX_UNIT_ID;
	private double timePeriodId;
	private String TIME_PERIOD_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpBalance() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,DATE_EARNED,EFFECTIVE_DATE,PAY_ACTION_CREATION_DATE,PERIOD_END_DATE");
		setFrwVarNumberColumn("ASSIGNMENT_ACTION_ID,ACTION_SEQUENCE,ACT_RUN_TYPE_ID,ASSIGNMENT_ID,BILLING_CODE_ID,BUSINESS_GROUP_ID,CONSOLIDATION_SET_ID,PAYMENT_ID,PAYROLL_ACTION_ID,PERSON_ID,TAX_UNIT_ID,TIME_PERIOD_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getAssignmentActionId() {
		return assignmentActionId;
	}

	public void setAssignmentActionId(double assignmentActionId) throws Exception {
		this.assignmentActionId = assignmentActionId;
		setValueFromAccessor("ASSIGNMENT_ACTION_ID", CommonUtil.toString(assignmentActionId));
	}

	public double getActionSequence() {
		return actionSequence;
	}

	public void setActionSequence(double actionSequence) throws Exception {
		this.actionSequence = actionSequence;
		setValueFromAccessor("ACTION_SEQUENCE", CommonUtil.toString(actionSequence));
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) throws Exception {
		this.actionType = actionType;
		setValueFromAccessor("ACTION_TYPE", actionType);
	}

	public double getActRunTypeId() {
		return actRunTypeId;
	}

	public void setActRunTypeId(double actRunTypeId) throws Exception {
		this.actRunTypeId = actRunTypeId;
		setValueFromAccessor("ACT_RUN_TYPE_ID", CommonUtil.toString(actRunTypeId));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getBillingCodeId() {
		return billingCodeId;
	}

	public void setBillingCodeId(double billingCodeId) throws Exception {
		this.billingCodeId = billingCodeId;
		setValueFromAccessor("BILLING_CODE_ID", CommonUtil.toString(billingCodeId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public double getConsolidationSetId() {
		return consolidationSetId;
	}

	public void setConsolidationSetId(double consolidationSetId) throws Exception {
		this.consolidationSetId = consolidationSetId;
		setValueFromAccessor("CONSOLIDATION_SET_ID", CommonUtil.toString(consolidationSetId));
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) throws Exception {
		this.creationDate = creationDate;
		setValueFromAccessor("CREATION_DATE", CommonUtil.toString(creationDate));
	}

	public Date getDateEarned() {
		return dateEarned;
	}

	public void setDateEarned(Date dateEarned) throws Exception {
		this.dateEarned = dateEarned;
		setValueFromAccessor("DATE_EARNED", CommonUtil.toString(dateEarned));
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) throws Exception {
		this.effectiveDate = effectiveDate;
		setValueFromAccessor("EFFECTIVE_DATE", CommonUtil.toString(effectiveDate));
	}

	public double getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(double paymentId) throws Exception {
		this.paymentId = paymentId;
		setValueFromAccessor("PAYMENT_ID", CommonUtil.toString(paymentId));
	}

	public double getPayrollActionId() {
		return payrollActionId;
	}

	public void setPayrollActionId(double payrollActionId) throws Exception {
		this.payrollActionId = payrollActionId;
		setValueFromAccessor("PAYROLL_ACTION_ID", CommonUtil.toString(payrollActionId));
	}

	public Date getPayActionCreationDate() {
		return payActionCreationDate;
	}

	public void setPayActionCreationDate(Date payActionCreationDate) throws Exception {
		this.payActionCreationDate = payActionCreationDate;
		setValueFromAccessor("PAY_ACTION_CREATION_DATE", CommonUtil.toString(payActionCreationDate));
	}

	public Date getPeriodEndDate() {
		return periodEndDate;
	}

	public void setPeriodEndDate(Date periodEndDate) throws Exception {
		this.periodEndDate = periodEndDate;
		setValueFromAccessor("PERIOD_END_DATE", CommonUtil.toString(periodEndDate));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getTaxUnitId() {
		return taxUnitId;
	}

	public void setTaxUnitId(double taxUnitId) throws Exception {
		this.taxUnitId = taxUnitId;
		setValueFromAccessor("TAX_UNIT_ID", CommonUtil.toString(taxUnitId));
	}

	public double getTimePeriodId() {
		return timePeriodId;
	}

	public void setTimePeriodId(double timePeriodId) throws Exception {
		this.timePeriodId = timePeriodId;
		setValueFromAccessor("TIME_PERIOD_ID", CommonUtil.toString(timePeriodId));
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

		str += "assignmentActionId : "+assignmentActionId+"\n";
		str += "actionSequence : "+actionSequence+"\n";
		str += "actionType : "+actionType+"\n";
		str += "actRunTypeId : "+actRunTypeId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "billingCodeId : "+billingCodeId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "consolidationSetId : "+consolidationSetId+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "dateEarned : "+dateEarned+"\n";
		str += "effectiveDate : "+effectiveDate+"\n";
		str += "paymentId : "+paymentId+"\n";
		str += "payrollActionId : "+payrollActionId+"\n";
		str += "payActionCreationDate : "+payActionCreationDate+"\n";
		str += "periodEndDate : "+periodEndDate+"\n";
		str += "personId : "+personId+"\n";
		str += "taxUnitId : "+taxUnitId+"\n";
		str += "timePeriodId : "+timePeriodId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"assignmentActionId\" value=\""+assignmentActionId+"\">";
		str += "<column name=\"actionSequence\" value=\""+actionSequence+"\">";
		str += "<column name=\"actionType\" value=\""+actionType+"\">";
		str += "<column name=\"actRunTypeId\" value=\""+actRunTypeId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"billingCodeId\" value=\""+billingCodeId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"consolidationSetId\" value=\""+consolidationSetId+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"dateEarned\" value=\""+dateEarned+"\">";
		str += "<column name=\"effectiveDate\" value=\""+effectiveDate+"\">";
		str += "<column name=\"paymentId\" value=\""+paymentId+"\">";
		str += "<column name=\"payrollActionId\" value=\""+payrollActionId+"\">";
		str += "<column name=\"payActionCreationDate\" value=\""+payActionCreationDate+"\">";
		str += "<column name=\"periodEndDate\" value=\""+periodEndDate+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"taxUnitId\" value=\""+taxUnitId+"\">";
		str += "<column name=\"timePeriodId\" value=\""+timePeriodId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"assignmentActionId\":\""+assignmentActionId+"\", ";
		str += "\"actionSequence\":\""+actionSequence+"\", ";
		str += "\"actionType\":\""+actionType+"\", ";
		str += "\"actRunTypeId\":\""+actRunTypeId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"billingCodeId\":\""+billingCodeId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"consolidationSetId\":\""+consolidationSetId+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"dateEarned\":\""+dateEarned+"\", ";
		str += "\"effectiveDate\":\""+effectiveDate+"\", ";
		str += "\"paymentId\":\""+paymentId+"\", ";
		str += "\"payrollActionId\":\""+payrollActionId+"\", ";
		str += "\"payActionCreationDate\":\""+payActionCreationDate+"\", ";
		str += "\"periodEndDate\":\""+periodEndDate+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"taxUnitId\":\""+taxUnitId+"\", ";
		str += "\"timePeriodId\":\""+timePeriodId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}