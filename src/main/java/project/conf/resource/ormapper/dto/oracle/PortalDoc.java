/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_DOC - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalDoc extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double stepId;
	private String STEP_ID;
	private double docId;
	private String DOC_ID;
	private String docFileType;
	private String DOC_FILE_TYPE;
	private String docName;
	private String DOC_NAME;
	private String docSubType;
	private String DOC_SUB_TYPE;
	private double docContentId;
	private String DOC_CONTENT_ID;
	private String docType;
	private String DOC_TYPE;
	private String perciDocSubtype;
	private String PERCI_DOC_SUBTYPE;
	private String perciDocType;
	private String PERCI_DOC_TYPE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalDoc() throws Exception {
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
		setFrwVarPrimaryKey("DOC_ID");
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("STEP_ID,DOC_ID,DOC_CONTENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("DOC_TYPE");
		setFrwVarDefaultValue("C");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getStepId() {
		return stepId;
	}

	public void setStepId(double stepId) throws Exception {
		this.stepId = stepId;
		setValueFromAccessor("STEP_ID", CommonUtil.toString(stepId));
	}

	public double getDocId() {
		return docId;
	}

	public void setDocId(double docId) throws Exception {
		this.docId = docId;
		setValueFromAccessor("DOC_ID", CommonUtil.toString(docId));
	}

	public String getDocFileType() {
		return docFileType;
	}

	public void setDocFileType(String docFileType) throws Exception {
		this.docFileType = docFileType;
		setValueFromAccessor("DOC_FILE_TYPE", docFileType);
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) throws Exception {
		this.docName = docName;
		setValueFromAccessor("DOC_NAME", docName);
	}

	public String getDocSubType() {
		return docSubType;
	}

	public void setDocSubType(String docSubType) throws Exception {
		this.docSubType = docSubType;
		setValueFromAccessor("DOC_SUB_TYPE", docSubType);
	}

	public double getDocContentId() {
		return docContentId;
	}

	public void setDocContentId(double docContentId) throws Exception {
		this.docContentId = docContentId;
		setValueFromAccessor("DOC_CONTENT_ID", CommonUtil.toString(docContentId));
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) throws Exception {
		this.docType = docType;
		setValueFromAccessor("DOC_TYPE", docType);
	}

	public String getPerciDocSubtype() {
		return perciDocSubtype;
	}

	public void setPerciDocSubtype(String perciDocSubtype) throws Exception {
		this.perciDocSubtype = perciDocSubtype;
		setValueFromAccessor("PERCI_DOC_SUBTYPE", perciDocSubtype);
	}

	public String getPerciDocType() {
		return perciDocType;
	}

	public void setPerciDocType(String perciDocType) throws Exception {
		this.perciDocType = perciDocType;
		setValueFromAccessor("PERCI_DOC_TYPE", perciDocType);
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

		str += "stepId : "+stepId+"\n";
		str += "docId : "+docId+"\n";
		str += "docFileType : "+docFileType+"\n";
		str += "docName : "+docName+"\n";
		str += "docSubType : "+docSubType+"\n";
		str += "docContentId : "+docContentId+"\n";
		str += "docType : "+docType+"\n";
		str += "perciDocSubtype : "+perciDocSubtype+"\n";
		str += "perciDocType : "+perciDocType+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"stepId\" value=\""+stepId+"\">";
		str += "<column name=\"docId\" value=\""+docId+"\">";
		str += "<column name=\"docFileType\" value=\""+docFileType+"\">";
		str += "<column name=\"docName\" value=\""+docName+"\">";
		str += "<column name=\"docSubType\" value=\""+docSubType+"\">";
		str += "<column name=\"docContentId\" value=\""+docContentId+"\">";
		str += "<column name=\"docType\" value=\""+docType+"\">";
		str += "<column name=\"perciDocSubtype\" value=\""+perciDocSubtype+"\">";
		str += "<column name=\"perciDocType\" value=\""+perciDocType+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"stepId\":\""+stepId+"\", ";
		str += "\"docId\":\""+docId+"\", ";
		str += "\"docFileType\":\""+docFileType+"\", ";
		str += "\"docName\":\""+docName+"\", ";
		str += "\"docSubType\":\""+docSubType+"\", ";
		str += "\"docContentId\":\""+docContentId+"\", ";
		str += "\"docType\":\""+docType+"\", ";
		str += "\"perciDocSubtype\":\""+perciDocSubtype+"\", ";
		str += "\"perciDocType\":\""+perciDocType+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}