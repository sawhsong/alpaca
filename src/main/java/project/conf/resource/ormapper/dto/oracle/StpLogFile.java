/**************************************************************************************************
 * Framework Generated DTO Source
 * - STP_LOG_FILE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class StpLogFile extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String description;
	private String DESCRIPTION;
	private String documentId;
	private String DOCUMENT_ID;
	private String errorDesc;
	private String ERROR_DESC;
	private String fieldName;
	private String FIELD_NAME;
	private String fieldValue;
	private String FIELD_VALUE;
	private double fileId;
	private String FILE_ID;
	private double logFileId;
	private String LOG_FILE_ID;
	private String section;
	private String SECTION;
	private String severity;
	private String SEVERITY;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public StpLogFile() throws Exception {
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
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("FILE_ID,LOG_FILE_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) throws Exception {
		this.documentId = documentId;
		setValueFromAccessor("DOCUMENT_ID", documentId);
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) throws Exception {
		this.errorDesc = errorDesc;
		setValueFromAccessor("ERROR_DESC", errorDesc);
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) throws Exception {
		this.fieldName = fieldName;
		setValueFromAccessor("FIELD_NAME", fieldName);
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) throws Exception {
		this.fieldValue = fieldValue;
		setValueFromAccessor("FIELD_VALUE", fieldValue);
	}

	public double getFileId() {
		return fileId;
	}

	public void setFileId(double fileId) throws Exception {
		this.fileId = fileId;
		setValueFromAccessor("FILE_ID", CommonUtil.toString(fileId));
	}

	public double getLogFileId() {
		return logFileId;
	}

	public void setLogFileId(double logFileId) throws Exception {
		this.logFileId = logFileId;
		setValueFromAccessor("LOG_FILE_ID", CommonUtil.toString(logFileId));
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) throws Exception {
		this.section = section;
		setValueFromAccessor("SECTION", section);
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) throws Exception {
		this.severity = severity;
		setValueFromAccessor("SEVERITY", severity);
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

		str += "description : "+description+"\n";
		str += "documentId : "+documentId+"\n";
		str += "errorDesc : "+errorDesc+"\n";
		str += "fieldName : "+fieldName+"\n";
		str += "fieldValue : "+fieldValue+"\n";
		str += "fileId : "+fileId+"\n";
		str += "logFileId : "+logFileId+"\n";
		str += "section : "+section+"\n";
		str += "severity : "+severity+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"documentId\" value=\""+documentId+"\">";
		str += "<column name=\"errorDesc\" value=\""+errorDesc+"\">";
		str += "<column name=\"fieldName\" value=\""+fieldName+"\">";
		str += "<column name=\"fieldValue\" value=\""+fieldValue+"\">";
		str += "<column name=\"fileId\" value=\""+fileId+"\">";
		str += "<column name=\"logFileId\" value=\""+logFileId+"\">";
		str += "<column name=\"section\" value=\""+section+"\">";
		str += "<column name=\"severity\" value=\""+severity+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"description\":\""+description+"\", ";
		str += "\"documentId\":\""+documentId+"\", ";
		str += "\"errorDesc\":\""+errorDesc+"\", ";
		str += "\"fieldName\":\""+fieldName+"\", ";
		str += "\"fieldValue\":\""+fieldValue+"\", ";
		str += "\"fileId\":\""+fileId+"\", ";
		str += "\"logFileId\":\""+logFileId+"\", ";
		str += "\"section\":\""+section+"\", ";
		str += "\"severity\":\""+severity+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}