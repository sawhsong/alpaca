/**************************************************************************************************
 * Framework Generated DTO Source
 * - TEMPLATED_DOC - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class TemplatedDoc extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double templatedDocId;
	private String TEMPLATED_DOC_ID;
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
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double orgId;
	private String ORG_ID;
	private double personId;
	private String PERSON_ID;
	private String templatedDocDescription;
	private String TEMPLATED_DOC_DESCRIPTION;
	private String templatedDocName;
	private String TEMPLATED_DOC_NAME;
	private String templatedFile;
	private String TEMPLATED_FILE;
	private String templatedFileName;
	private String TEMPLATED_FILE_NAME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public TemplatedDoc() throws Exception {
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
		setFrwVarPrimaryKey("TEMPLATED_DOC_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATED_DATE");
		setFrwVarNumberColumn("TEMPLATED_DOC_ID,CREATED_BY,DOC_TEMP_ID,LAST_UPDATED_BY,ASSIGNMENT_ID,ORG_ID,PERSON_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getTemplatedDocId() {
		return templatedDocId;
	}

	public void setTemplatedDocId(double templatedDocId) throws Exception {
		this.templatedDocId = templatedDocId;
		setValueFromAccessor("TEMPLATED_DOC_ID", CommonUtil.toString(templatedDocId));
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

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getOrgId() {
		return orgId;
	}

	public void setOrgId(double orgId) throws Exception {
		this.orgId = orgId;
		setValueFromAccessor("ORG_ID", CommonUtil.toString(orgId));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getTemplatedDocDescription() {
		return templatedDocDescription;
	}

	public void setTemplatedDocDescription(String templatedDocDescription) throws Exception {
		this.templatedDocDescription = templatedDocDescription;
		setValueFromAccessor("TEMPLATED_DOC_DESCRIPTION", templatedDocDescription);
	}

	public String getTemplatedDocName() {
		return templatedDocName;
	}

	public void setTemplatedDocName(String templatedDocName) throws Exception {
		this.templatedDocName = templatedDocName;
		setValueFromAccessor("TEMPLATED_DOC_NAME", templatedDocName);
	}

	public String getTemplatedFile() {
		return templatedFile;
	}

	public void setTemplatedFile(String templatedFile) throws Exception {
		this.templatedFile = templatedFile;
		setValueFromAccessor("TEMPLATED_FILE", templatedFile);
	}

	public String getTemplatedFileName() {
		return templatedFileName;
	}

	public void setTemplatedFileName(String templatedFileName) throws Exception {
		this.templatedFileName = templatedFileName;
		setValueFromAccessor("TEMPLATED_FILE_NAME", templatedFileName);
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

		str += "templatedDocId : "+templatedDocId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "docTempId : "+docTempId+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdatedDate : "+lastUpdatedDate+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "orgId : "+orgId+"\n";
		str += "personId : "+personId+"\n";
		str += "templatedDocDescription : "+templatedDocDescription+"\n";
		str += "templatedDocName : "+templatedDocName+"\n";
		str += "templatedFile : "+templatedFile+"\n";
		str += "templatedFileName : "+templatedFileName+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"templatedDocId\" value=\""+templatedDocId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"docTempId\" value=\""+docTempId+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdatedDate\" value=\""+lastUpdatedDate+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"orgId\" value=\""+orgId+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"templatedDocDescription\" value=\""+templatedDocDescription+"\">";
		str += "<column name=\"templatedDocName\" value=\""+templatedDocName+"\">";
		str += "<column name=\"templatedFile\" value=\""+templatedFile+"\">";
		str += "<column name=\"templatedFileName\" value=\""+templatedFileName+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"templatedDocId\":\""+templatedDocId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"docTempId\":\""+docTempId+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdatedDate\":\""+lastUpdatedDate+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"orgId\":\""+orgId+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"templatedDocDescription\":\""+templatedDocDescription+"\", ";
		str += "\"templatedDocName\":\""+templatedDocName+"\", ";
		str += "\"templatedFile\":\""+templatedFile+"\", ";
		str += "\"templatedFileName\":\""+templatedFileName+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}