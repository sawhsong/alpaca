/**************************************************************************************************
 * Framework Generated DTO Source
 * - DOC_TEMPLATE_FIELD - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class DocTemplateField extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double docTempFieldId;
	private String DOC_TEMP_FIELD_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double docTempId;
	private String DOC_TEMP_ID;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdatedDate;
	private String LAST_UPDATED_DATE;
	private String defaultValue;
	private String DEFAULT_VALUE;
	private String fieldName;
	private String FIELD_NAME;
	private String fieldTag;
	private String FIELD_TAG;
	private String isActive;
	private String IS_ACTIVE;
	private String isEditable;
	private String IS_EDITABLE;
	private String isMandatory;
	private String IS_MANDATORY;
	private String lookupType;
	private String LOOKUP_TYPE;
	private double mappedFieldId;
	private String MAPPED_FIELD_ID;
	private double mappedObjId;
	private String MAPPED_OBJ_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public DocTemplateField() throws Exception {
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
		setFrwVarPrimaryKey("DOC_TEMP_FIELD_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATED_DATE");
		setFrwVarNumberColumn("DOC_TEMP_FIELD_ID,CREATED_BY,DOC_TEMP_ID,LAST_UPDATED_BY,MAPPED_FIELD_ID,MAPPED_OBJ_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getDocTempFieldId() {
		return docTempFieldId;
	}

	public void setDocTempFieldId(double docTempFieldId) throws Exception {
		this.docTempFieldId = docTempFieldId;
		setValueFromAccessor("DOC_TEMP_FIELD_ID", CommonUtil.toString(docTempFieldId));
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

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) throws Exception {
		this.defaultValue = defaultValue;
		setValueFromAccessor("DEFAULT_VALUE", defaultValue);
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) throws Exception {
		this.fieldName = fieldName;
		setValueFromAccessor("FIELD_NAME", fieldName);
	}

	public String getFieldTag() {
		return fieldTag;
	}

	public void setFieldTag(String fieldTag) throws Exception {
		this.fieldTag = fieldTag;
		setValueFromAccessor("FIELD_TAG", fieldTag);
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
	}

	public String getIsEditable() {
		return isEditable;
	}

	public void setIsEditable(String isEditable) throws Exception {
		this.isEditable = isEditable;
		setValueFromAccessor("IS_EDITABLE", isEditable);
	}

	public String getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(String isMandatory) throws Exception {
		this.isMandatory = isMandatory;
		setValueFromAccessor("IS_MANDATORY", isMandatory);
	}

	public String getLookupType() {
		return lookupType;
	}

	public void setLookupType(String lookupType) throws Exception {
		this.lookupType = lookupType;
		setValueFromAccessor("LOOKUP_TYPE", lookupType);
	}

	public double getMappedFieldId() {
		return mappedFieldId;
	}

	public void setMappedFieldId(double mappedFieldId) throws Exception {
		this.mappedFieldId = mappedFieldId;
		setValueFromAccessor("MAPPED_FIELD_ID", CommonUtil.toString(mappedFieldId));
	}

	public double getMappedObjId() {
		return mappedObjId;
	}

	public void setMappedObjId(double mappedObjId) throws Exception {
		this.mappedObjId = mappedObjId;
		setValueFromAccessor("MAPPED_OBJ_ID", CommonUtil.toString(mappedObjId));
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

		str += "docTempFieldId : "+docTempFieldId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "docTempId : "+docTempId+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdatedDate : "+lastUpdatedDate+"\n";
		str += "defaultValue : "+defaultValue+"\n";
		str += "fieldName : "+fieldName+"\n";
		str += "fieldTag : "+fieldTag+"\n";
		str += "isActive : "+isActive+"\n";
		str += "isEditable : "+isEditable+"\n";
		str += "isMandatory : "+isMandatory+"\n";
		str += "lookupType : "+lookupType+"\n";
		str += "mappedFieldId : "+mappedFieldId+"\n";
		str += "mappedObjId : "+mappedObjId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"docTempFieldId\" value=\""+docTempFieldId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"docTempId\" value=\""+docTempId+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdatedDate\" value=\""+lastUpdatedDate+"\">";
		str += "<column name=\"defaultValue\" value=\""+defaultValue+"\">";
		str += "<column name=\"fieldName\" value=\""+fieldName+"\">";
		str += "<column name=\"fieldTag\" value=\""+fieldTag+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"isEditable\" value=\""+isEditable+"\">";
		str += "<column name=\"isMandatory\" value=\""+isMandatory+"\">";
		str += "<column name=\"lookupType\" value=\""+lookupType+"\">";
		str += "<column name=\"mappedFieldId\" value=\""+mappedFieldId+"\">";
		str += "<column name=\"mappedObjId\" value=\""+mappedObjId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"docTempFieldId\":\""+docTempFieldId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"docTempId\":\""+docTempId+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdatedDate\":\""+lastUpdatedDate+"\", ";
		str += "\"defaultValue\":\""+defaultValue+"\", ";
		str += "\"fieldName\":\""+fieldName+"\", ";
		str += "\"fieldTag\":\""+fieldTag+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"isEditable\":\""+isEditable+"\", ";
		str += "\"isMandatory\":\""+isMandatory+"\", ";
		str += "\"lookupType\":\""+lookupType+"\", ";
		str += "\"mappedFieldId\":\""+mappedFieldId+"\", ";
		str += "\"mappedObjId\":\""+mappedObjId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}