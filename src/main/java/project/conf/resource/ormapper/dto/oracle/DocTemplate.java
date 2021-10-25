/**************************************************************************************************
 * Framework Generated DTO Source
 * - DOC_TEMPLATE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class DocTemplate extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double docTemplateId;
	private String DOC_TEMPLATE_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdatedDate;
	private String LAST_UPDATED_DATE;
	private String accessAdhoc;
	private String ACCESS_ADHOC;
	private String accessAssignment;
	private String ACCESS_ASSIGNMENT;
	private String accessOpportunity;
	private String ACCESS_OPPORTUNITY;
	private String accessOrg;
	private String ACCESS_ORG;
	private String description;
	private String DESCRIPTION;
	private String docFile;
	private String DOC_FILE;
	private String docName;
	private String DOC_NAME;
	private Date endDate;
	private String END_DATE;
	private String generatedFileNameTemplate;
	private String GENERATED_FILE_NAME_TEMPLATE;
	private String pdfOutput;
	private String PDF_OUTPUT;
	private Date startDate;
	private String START_DATE;
	private String status;
	private String STATUS;
	private String tempName;
	private String TEMP_NAME;
	private String wordOutput;
	private String WORD_OUTPUT;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public DocTemplate() throws Exception {
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
		setFrwVarPrimaryKey("DOC_TEMPLATE_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATED_DATE,END_DATE,START_DATE");
		setFrwVarNumberColumn("DOC_TEMPLATE_ID,CREATED_BY,LAST_UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getDocTemplateId() {
		return docTemplateId;
	}

	public void setDocTemplateId(double docTemplateId) throws Exception {
		this.docTemplateId = docTemplateId;
		setValueFromAccessor("DOC_TEMPLATE_ID", CommonUtil.toString(docTemplateId));
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

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) throws Exception {
		this.lastUpdatedDate = lastUpdatedDate;
		setValueFromAccessor("LAST_UPDATED_DATE", CommonUtil.toString(lastUpdatedDate));
	}

	public String getAccessAdhoc() {
		return accessAdhoc;
	}

	public void setAccessAdhoc(String accessAdhoc) throws Exception {
		this.accessAdhoc = accessAdhoc;
		setValueFromAccessor("ACCESS_ADHOC", accessAdhoc);
	}

	public String getAccessAssignment() {
		return accessAssignment;
	}

	public void setAccessAssignment(String accessAssignment) throws Exception {
		this.accessAssignment = accessAssignment;
		setValueFromAccessor("ACCESS_ASSIGNMENT", accessAssignment);
	}

	public String getAccessOpportunity() {
		return accessOpportunity;
	}

	public void setAccessOpportunity(String accessOpportunity) throws Exception {
		this.accessOpportunity = accessOpportunity;
		setValueFromAccessor("ACCESS_OPPORTUNITY", accessOpportunity);
	}

	public String getAccessOrg() {
		return accessOrg;
	}

	public void setAccessOrg(String accessOrg) throws Exception {
		this.accessOrg = accessOrg;
		setValueFromAccessor("ACCESS_ORG", accessOrg);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public String getDocFile() {
		return docFile;
	}

	public void setDocFile(String docFile) throws Exception {
		this.docFile = docFile;
		setValueFromAccessor("DOC_FILE", docFile);
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) throws Exception {
		this.docName = docName;
		setValueFromAccessor("DOC_NAME", docName);
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) throws Exception {
		this.endDate = endDate;
		setValueFromAccessor("END_DATE", CommonUtil.toString(endDate));
	}

	public String getGeneratedFileNameTemplate() {
		return generatedFileNameTemplate;
	}

	public void setGeneratedFileNameTemplate(String generatedFileNameTemplate) throws Exception {
		this.generatedFileNameTemplate = generatedFileNameTemplate;
		setValueFromAccessor("GENERATED_FILE_NAME_TEMPLATE", generatedFileNameTemplate);
	}

	public String getPdfOutput() {
		return pdfOutput;
	}

	public void setPdfOutput(String pdfOutput) throws Exception {
		this.pdfOutput = pdfOutput;
		setValueFromAccessor("PDF_OUTPUT", pdfOutput);
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws Exception {
		this.startDate = startDate;
		setValueFromAccessor("START_DATE", CommonUtil.toString(startDate));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public String getTempName() {
		return tempName;
	}

	public void setTempName(String tempName) throws Exception {
		this.tempName = tempName;
		setValueFromAccessor("TEMP_NAME", tempName);
	}

	public String getWordOutput() {
		return wordOutput;
	}

	public void setWordOutput(String wordOutput) throws Exception {
		this.wordOutput = wordOutput;
		setValueFromAccessor("WORD_OUTPUT", wordOutput);
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

		str += "docTemplateId : "+docTemplateId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdatedDate : "+lastUpdatedDate+"\n";
		str += "accessAdhoc : "+accessAdhoc+"\n";
		str += "accessAssignment : "+accessAssignment+"\n";
		str += "accessOpportunity : "+accessOpportunity+"\n";
		str += "accessOrg : "+accessOrg+"\n";
		str += "description : "+description+"\n";
		str += "docFile : "+docFile+"\n";
		str += "docName : "+docName+"\n";
		str += "endDate : "+endDate+"\n";
		str += "generatedFileNameTemplate : "+generatedFileNameTemplate+"\n";
		str += "pdfOutput : "+pdfOutput+"\n";
		str += "startDate : "+startDate+"\n";
		str += "status : "+status+"\n";
		str += "tempName : "+tempName+"\n";
		str += "wordOutput : "+wordOutput+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"docTemplateId\" value=\""+docTemplateId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdatedDate\" value=\""+lastUpdatedDate+"\">";
		str += "<column name=\"accessAdhoc\" value=\""+accessAdhoc+"\">";
		str += "<column name=\"accessAssignment\" value=\""+accessAssignment+"\">";
		str += "<column name=\"accessOpportunity\" value=\""+accessOpportunity+"\">";
		str += "<column name=\"accessOrg\" value=\""+accessOrg+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"docFile\" value=\""+docFile+"\">";
		str += "<column name=\"docName\" value=\""+docName+"\">";
		str += "<column name=\"endDate\" value=\""+endDate+"\">";
		str += "<column name=\"generatedFileNameTemplate\" value=\""+generatedFileNameTemplate+"\">";
		str += "<column name=\"pdfOutput\" value=\""+pdfOutput+"\">";
		str += "<column name=\"startDate\" value=\""+startDate+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"tempName\" value=\""+tempName+"\">";
		str += "<column name=\"wordOutput\" value=\""+wordOutput+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"docTemplateId\":\""+docTemplateId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdatedDate\":\""+lastUpdatedDate+"\", ";
		str += "\"accessAdhoc\":\""+accessAdhoc+"\", ";
		str += "\"accessAssignment\":\""+accessAssignment+"\", ";
		str += "\"accessOpportunity\":\""+accessOpportunity+"\", ";
		str += "\"accessOrg\":\""+accessOrg+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"docFile\":\""+docFile+"\", ";
		str += "\"docName\":\""+docName+"\", ";
		str += "\"endDate\":\""+endDate+"\", ";
		str += "\"generatedFileNameTemplate\":\""+generatedFileNameTemplate+"\", ";
		str += "\"pdfOutput\":\""+pdfOutput+"\", ";
		str += "\"startDate\":\""+startDate+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"tempName\":\""+tempName+"\", ";
		str += "\"wordOutput\":\""+wordOutput+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}