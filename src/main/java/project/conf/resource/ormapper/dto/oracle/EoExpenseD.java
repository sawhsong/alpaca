/**************************************************************************************************
 * Framework Generated DTO Source
 * - EO_EXPENSE_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class EoExpenseD extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double eoExpenseDId;
	private String EO_EXPENSE_D_ID;
	private double eoExpenseId;
	private String EO_EXPENSE_ID;
	private double assignmentRateId;
	private String ASSIGNMENT_RATE_ID;
	private String attachedFile;
	private String ATTACHED_FILE;
	private String description;
	private String DESCRIPTION;
	private double expenseAmount;
	private String EXPENSE_AMOUNT;
	private Date expenseDate;
	private String EXPENSE_DATE;
	private String fileName;
	private String FILE_NAME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public EoExpenseD() throws Exception {
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
		setFrwVarPrimaryKey("EO_EXPENSE_D_ID");
		setFrwVarDateColumn("EXPENSE_DATE");
		setFrwVarNumberColumn("EO_EXPENSE_D_ID,EO_EXPENSE_ID,ASSIGNMENT_RATE_ID,EXPENSE_AMOUNT");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getEoExpenseDId() {
		return eoExpenseDId;
	}

	public void setEoExpenseDId(double eoExpenseDId) throws Exception {
		this.eoExpenseDId = eoExpenseDId;
		setValueFromAccessor("EO_EXPENSE_D_ID", CommonUtil.toString(eoExpenseDId));
	}

	public double getEoExpenseId() {
		return eoExpenseId;
	}

	public void setEoExpenseId(double eoExpenseId) throws Exception {
		this.eoExpenseId = eoExpenseId;
		setValueFromAccessor("EO_EXPENSE_ID", CommonUtil.toString(eoExpenseId));
	}

	public double getAssignmentRateId() {
		return assignmentRateId;
	}

	public void setAssignmentRateId(double assignmentRateId) throws Exception {
		this.assignmentRateId = assignmentRateId;
		setValueFromAccessor("ASSIGNMENT_RATE_ID", CommonUtil.toString(assignmentRateId));
	}

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) throws Exception {
		this.attachedFile = attachedFile;
		setValueFromAccessor("ATTACHED_FILE", attachedFile);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) throws Exception {
		this.expenseAmount = expenseAmount;
		setValueFromAccessor("EXPENSE_AMOUNT", CommonUtil.toString(expenseAmount));
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) throws Exception {
		this.expenseDate = expenseDate;
		setValueFromAccessor("EXPENSE_DATE", CommonUtil.toString(expenseDate));
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) throws Exception {
		this.fileName = fileName;
		setValueFromAccessor("FILE_NAME", fileName);
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

		str += "eoExpenseDId : "+eoExpenseDId+"\n";
		str += "eoExpenseId : "+eoExpenseId+"\n";
		str += "assignmentRateId : "+assignmentRateId+"\n";
		str += "attachedFile : "+attachedFile+"\n";
		str += "description : "+description+"\n";
		str += "expenseAmount : "+expenseAmount+"\n";
		str += "expenseDate : "+expenseDate+"\n";
		str += "fileName : "+fileName+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"eoExpenseDId\" value=\""+eoExpenseDId+"\">";
		str += "<column name=\"eoExpenseId\" value=\""+eoExpenseId+"\">";
		str += "<column name=\"assignmentRateId\" value=\""+assignmentRateId+"\">";
		str += "<column name=\"attachedFile\" value=\""+attachedFile+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"expenseAmount\" value=\""+expenseAmount+"\">";
		str += "<column name=\"expenseDate\" value=\""+expenseDate+"\">";
		str += "<column name=\"fileName\" value=\""+fileName+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"eoExpenseDId\":\""+eoExpenseDId+"\", ";
		str += "\"eoExpenseId\":\""+eoExpenseId+"\", ";
		str += "\"assignmentRateId\":\""+assignmentRateId+"\", ";
		str += "\"attachedFile\":\""+attachedFile+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"expenseAmount\":\""+expenseAmount+"\", ";
		str += "\"expenseDate\":\""+expenseDate+"\", ";
		str += "\"fileName\":\""+fileName+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}