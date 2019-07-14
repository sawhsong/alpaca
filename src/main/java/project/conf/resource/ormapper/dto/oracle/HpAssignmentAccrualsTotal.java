/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_ASSIGNMENT_ACCRUALS_TOTAL - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpAssignmentAccrualsTotal extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double assignmentAccrualsTotalId;
	private String ASSIGNMENT_ACCRUALS_TOTAL_ID;
	private String assignmentAccrualType;
	private String ASSIGNMENT_ACCRUAL_TYPE;
	private double assignmentPlanId;
	private String ASSIGNMENT_PLAN_ID;
	private double assignmentProcessId;
	private String ASSIGNMENT_PROCESS_ID;
	private Date carriedCommencedDate;
	private String CARRIED_COMMENCED_DATE;
	private String comments;
	private String COMMENTS;
	private double elementId;
	private String ELEMENT_ID;
	private double hours;
	private String HOURS;
	private double paymentId;
	private String PAYMENT_ID;
	private Date payDate;
	private String PAY_DATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpAssignmentAccrualsTotal() throws Exception {
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
		setFrwVarPrimaryKey("ASSIGNMENT_ACCRUALS_TOTAL_ID");
		setFrwVarDateColumn("CARRIED_COMMENCED_DATE,PAY_DATE");
		setFrwVarNumberColumn("ASSIGNMENT_ACCRUALS_TOTAL_ID,ASSIGNMENT_PLAN_ID,ASSIGNMENT_PROCESS_ID,ELEMENT_ID,HOURS,PAYMENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getAssignmentAccrualsTotalId() {
		return assignmentAccrualsTotalId;
	}

	public void setAssignmentAccrualsTotalId(double assignmentAccrualsTotalId) throws Exception {
		this.assignmentAccrualsTotalId = assignmentAccrualsTotalId;
		setValueFromAccessor("ASSIGNMENT_ACCRUALS_TOTAL_ID", CommonUtil.toString(assignmentAccrualsTotalId));
	}

	public String getAssignmentAccrualType() {
		return assignmentAccrualType;
	}

	public void setAssignmentAccrualType(String assignmentAccrualType) throws Exception {
		this.assignmentAccrualType = assignmentAccrualType;
		setValueFromAccessor("ASSIGNMENT_ACCRUAL_TYPE", assignmentAccrualType);
	}

	public double getAssignmentPlanId() {
		return assignmentPlanId;
	}

	public void setAssignmentPlanId(double assignmentPlanId) throws Exception {
		this.assignmentPlanId = assignmentPlanId;
		setValueFromAccessor("ASSIGNMENT_PLAN_ID", CommonUtil.toString(assignmentPlanId));
	}

	public double getAssignmentProcessId() {
		return assignmentProcessId;
	}

	public void setAssignmentProcessId(double assignmentProcessId) throws Exception {
		this.assignmentProcessId = assignmentProcessId;
		setValueFromAccessor("ASSIGNMENT_PROCESS_ID", CommonUtil.toString(assignmentProcessId));
	}

	public Date getCarriedCommencedDate() {
		return carriedCommencedDate;
	}

	public void setCarriedCommencedDate(Date carriedCommencedDate) throws Exception {
		this.carriedCommencedDate = carriedCommencedDate;
		setValueFromAccessor("CARRIED_COMMENCED_DATE", CommonUtil.toString(carriedCommencedDate));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public double getElementId() {
		return elementId;
	}

	public void setElementId(double elementId) throws Exception {
		this.elementId = elementId;
		setValueFromAccessor("ELEMENT_ID", CommonUtil.toString(elementId));
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) throws Exception {
		this.hours = hours;
		setValueFromAccessor("HOURS", CommonUtil.toString(hours));
	}

	public double getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(double paymentId) throws Exception {
		this.paymentId = paymentId;
		setValueFromAccessor("PAYMENT_ID", CommonUtil.toString(paymentId));
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) throws Exception {
		this.payDate = payDate;
		setValueFromAccessor("PAY_DATE", CommonUtil.toString(payDate));
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

		str += "assignmentAccrualsTotalId : "+assignmentAccrualsTotalId+"\n";
		str += "assignmentAccrualType : "+assignmentAccrualType+"\n";
		str += "assignmentPlanId : "+assignmentPlanId+"\n";
		str += "assignmentProcessId : "+assignmentProcessId+"\n";
		str += "carriedCommencedDate : "+carriedCommencedDate+"\n";
		str += "comments : "+comments+"\n";
		str += "elementId : "+elementId+"\n";
		str += "hours : "+hours+"\n";
		str += "paymentId : "+paymentId+"\n";
		str += "payDate : "+payDate+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"assignmentAccrualsTotalId\" value=\""+assignmentAccrualsTotalId+"\">";
		str += "<column name=\"assignmentAccrualType\" value=\""+assignmentAccrualType+"\">";
		str += "<column name=\"assignmentPlanId\" value=\""+assignmentPlanId+"\">";
		str += "<column name=\"assignmentProcessId\" value=\""+assignmentProcessId+"\">";
		str += "<column name=\"carriedCommencedDate\" value=\""+carriedCommencedDate+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"elementId\" value=\""+elementId+"\">";
		str += "<column name=\"hours\" value=\""+hours+"\">";
		str += "<column name=\"paymentId\" value=\""+paymentId+"\">";
		str += "<column name=\"payDate\" value=\""+payDate+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"assignmentAccrualsTotalId\":\""+assignmentAccrualsTotalId+"\", ";
		str += "\"assignmentAccrualType\":\""+assignmentAccrualType+"\", ";
		str += "\"assignmentPlanId\":\""+assignmentPlanId+"\", ";
		str += "\"assignmentProcessId\":\""+assignmentProcessId+"\", ";
		str += "\"carriedCommencedDate\":\""+carriedCommencedDate+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"elementId\":\""+elementId+"\", ";
		str += "\"hours\":\""+hours+"\", ";
		str += "\"paymentId\":\""+paymentId+"\", ";
		str += "\"payDate\":\""+payDate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}