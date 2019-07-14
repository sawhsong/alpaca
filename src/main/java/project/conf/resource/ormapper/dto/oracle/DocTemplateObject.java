/**************************************************************************************************
 * Framework Generated DTO Source
 * - DOC_TEMPLATE_OBJECT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class DocTemplateObject extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double docTempObjId;
	private String DOC_TEMP_OBJ_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double docTempId;
	private String DOC_TEMP_ID;
	private double docTempObjKeyFieldId;
	private String DOC_TEMP_OBJ_KEY_FIELD_ID;
	private double docTempSourceObjFieldId;
	private String DOC_TEMP_SOURCE_OBJ_FIELD_ID;
	private double docTempSourceObjId;
	private String DOC_TEMP_SOURCE_OBJ_ID;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdatedDate;
	private String LAST_UPDATED_DATE;
	private double selectedObjTempId;
	private String SELECTED_OBJ_TEMP_ID;
	private String docTempObjName;
	private String DOC_TEMP_OBJ_NAME;
	private String docTempObjType;
	private String DOC_TEMP_OBJ_TYPE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public DocTemplateObject() throws Exception {
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
		setFrwVarPrimaryKey("DOC_TEMP_OBJ_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATED_DATE");
		setFrwVarNumberColumn("DOC_TEMP_OBJ_ID,CREATED_BY,DOC_TEMP_ID,DOC_TEMP_OBJ_KEY_FIELD_ID,DOC_TEMP_SOURCE_OBJ_FIELD_ID,DOC_TEMP_SOURCE_OBJ_ID,LAST_UPDATED_BY,SELECTED_OBJ_TEMP_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getDocTempObjId() {
		return docTempObjId;
	}

	public void setDocTempObjId(double docTempObjId) throws Exception {
		this.docTempObjId = docTempObjId;
		setValueFromAccessor("DOC_TEMP_OBJ_ID", CommonUtil.toString(docTempObjId));
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

	public double getDocTempId() {
		return docTempId;
	}

	public void setDocTempId(double docTempId) throws Exception {
		this.docTempId = docTempId;
		setValueFromAccessor("DOC_TEMP_ID", CommonUtil.toString(docTempId));
	}

	public double getDocTempObjKeyFieldId() {
		return docTempObjKeyFieldId;
	}

	public void setDocTempObjKeyFieldId(double docTempObjKeyFieldId) throws Exception {
		this.docTempObjKeyFieldId = docTempObjKeyFieldId;
		setValueFromAccessor("DOC_TEMP_OBJ_KEY_FIELD_ID", CommonUtil.toString(docTempObjKeyFieldId));
	}

	public double getDocTempSourceObjFieldId() {
		return docTempSourceObjFieldId;
	}

	public void setDocTempSourceObjFieldId(double docTempSourceObjFieldId) throws Exception {
		this.docTempSourceObjFieldId = docTempSourceObjFieldId;
		setValueFromAccessor("DOC_TEMP_SOURCE_OBJ_FIELD_ID", CommonUtil.toString(docTempSourceObjFieldId));
	}

	public double getDocTempSourceObjId() {
		return docTempSourceObjId;
	}

	public void setDocTempSourceObjId(double docTempSourceObjId) throws Exception {
		this.docTempSourceObjId = docTempSourceObjId;
		setValueFromAccessor("DOC_TEMP_SOURCE_OBJ_ID", CommonUtil.toString(docTempSourceObjId));
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) throws Exception {
		this.lastUpdatedDate = lastUpdatedDate;
		setValueFromAccessor("LAST_UPDATED_DATE", CommonUtil.toString(lastUpdatedDate));
	}

	public double getSelectedObjTempId() {
		return selectedObjTempId;
	}

	public void setSelectedObjTempId(double selectedObjTempId) throws Exception {
		this.selectedObjTempId = selectedObjTempId;
		setValueFromAccessor("SELECTED_OBJ_TEMP_ID", CommonUtil.toString(selectedObjTempId));
	}

	public String getDocTempObjName() {
		return docTempObjName;
	}

	public void setDocTempObjName(String docTempObjName) throws Exception {
		this.docTempObjName = docTempObjName;
		setValueFromAccessor("DOC_TEMP_OBJ_NAME", docTempObjName);
	}

	public String getDocTempObjType() {
		return docTempObjType;
	}

	public void setDocTempObjType(String docTempObjType) throws Exception {
		this.docTempObjType = docTempObjType;
		setValueFromAccessor("DOC_TEMP_OBJ_TYPE", docTempObjType);
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

		str += "docTempObjId : "+docTempObjId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "docTempId : "+docTempId+"\n";
		str += "docTempObjKeyFieldId : "+docTempObjKeyFieldId+"\n";
		str += "docTempSourceObjFieldId : "+docTempSourceObjFieldId+"\n";
		str += "docTempSourceObjId : "+docTempSourceObjId+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdatedDate : "+lastUpdatedDate+"\n";
		str += "selectedObjTempId : "+selectedObjTempId+"\n";
		str += "docTempObjName : "+docTempObjName+"\n";
		str += "docTempObjType : "+docTempObjType+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"docTempObjId\" value=\""+docTempObjId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"docTempId\" value=\""+docTempId+"\">";
		str += "<column name=\"docTempObjKeyFieldId\" value=\""+docTempObjKeyFieldId+"\">";
		str += "<column name=\"docTempSourceObjFieldId\" value=\""+docTempSourceObjFieldId+"\">";
		str += "<column name=\"docTempSourceObjId\" value=\""+docTempSourceObjId+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdatedDate\" value=\""+lastUpdatedDate+"\">";
		str += "<column name=\"selectedObjTempId\" value=\""+selectedObjTempId+"\">";
		str += "<column name=\"docTempObjName\" value=\""+docTempObjName+"\">";
		str += "<column name=\"docTempObjType\" value=\""+docTempObjType+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"docTempObjId\":\""+docTempObjId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"docTempId\":\""+docTempId+"\", ";
		str += "\"docTempObjKeyFieldId\":\""+docTempObjKeyFieldId+"\", ";
		str += "\"docTempSourceObjFieldId\":\""+docTempSourceObjFieldId+"\", ";
		str += "\"docTempSourceObjId\":\""+docTempSourceObjId+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdatedDate\":\""+lastUpdatedDate+"\", ";
		str += "\"selectedObjTempId\":\""+selectedObjTempId+"\", ";
		str += "\"docTempObjName\":\""+docTempObjName+"\", ";
		str += "\"docTempObjType\":\""+docTempObjType+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}