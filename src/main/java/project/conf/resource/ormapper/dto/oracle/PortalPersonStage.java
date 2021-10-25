/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_PERSON_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalPersonStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double submissionId;
	private String SUBMISSION_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String firstName;
	private String FIRST_NAME;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double organisationId;
	private String ORGANISATION_ID;
	private double personId;
	private String PERSON_ID;
	private String personNumber;
	private String PERSON_NUMBER;
	private String surname;
	private String SURNAME;
	private Date dateOfBirth;
	private String DATE_OF_BIRTH;
	private double directReportId;
	private String DIRECT_REPORT_ID;
	private double divisionId;
	private String DIVISION_ID;
	private String gender;
	private String GENDER;
	private String middleName;
	private String MIDDLE_NAME;
	private String personType;
	private String PERSON_TYPE;
	private String preferredName;
	private String PREFERRED_NAME;
	private String prefix;
	private String PREFIX;
	private String title;
	private String TITLE;
	private String transformed;
	private String TRANSFORMED;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalPersonStage() throws Exception {
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
		setFrwVarPrimaryKey("SUBMISSION_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,DATE_OF_BIRTH");
		setFrwVarNumberColumn("SUBMISSION_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,ORGANISATION_ID,PERSON_ID,DIRECT_REPORT_ID,DIVISION_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(double submissionId) throws Exception {
		this.submissionId = submissionId;
		setValueFromAccessor("SUBMISSION_ID", CommonUtil.toString(submissionId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		this.firstName = firstName;
		setValueFromAccessor("FIRST_NAME", firstName);
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

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(String personNumber) throws Exception {
		this.personNumber = personNumber;
		setValueFromAccessor("PERSON_NUMBER", personNumber);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		this.surname = surname;
		setValueFromAccessor("SURNAME", surname);
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) throws Exception {
		this.dateOfBirth = dateOfBirth;
		setValueFromAccessor("DATE_OF_BIRTH", CommonUtil.toString(dateOfBirth));
	}

	public double getDirectReportId() {
		return directReportId;
	}

	public void setDirectReportId(double directReportId) throws Exception {
		this.directReportId = directReportId;
		setValueFromAccessor("DIRECT_REPORT_ID", CommonUtil.toString(directReportId));
	}

	public double getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(double divisionId) throws Exception {
		this.divisionId = divisionId;
		setValueFromAccessor("DIVISION_ID", CommonUtil.toString(divisionId));
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) throws Exception {
		this.gender = gender;
		setValueFromAccessor("GENDER", gender);
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) throws Exception {
		this.middleName = middleName;
		setValueFromAccessor("MIDDLE_NAME", middleName);
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) throws Exception {
		this.personType = personType;
		setValueFromAccessor("PERSON_TYPE", personType);
	}

	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) throws Exception {
		this.preferredName = preferredName;
		setValueFromAccessor("PREFERRED_NAME", preferredName);
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) throws Exception {
		this.prefix = prefix;
		setValueFromAccessor("PREFIX", prefix);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		this.title = title;
		setValueFromAccessor("TITLE", title);
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
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

		str += "submissionId : "+submissionId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "firstName : "+firstName+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "personId : "+personId+"\n";
		str += "personNumber : "+personNumber+"\n";
		str += "surname : "+surname+"\n";
		str += "dateOfBirth : "+dateOfBirth+"\n";
		str += "directReportId : "+directReportId+"\n";
		str += "divisionId : "+divisionId+"\n";
		str += "gender : "+gender+"\n";
		str += "middleName : "+middleName+"\n";
		str += "personType : "+personType+"\n";
		str += "preferredName : "+preferredName+"\n";
		str += "prefix : "+prefix+"\n";
		str += "title : "+title+"\n";
		str += "transformed : "+transformed+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"submissionId\" value=\""+submissionId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"firstName\" value=\""+firstName+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"personNumber\" value=\""+personNumber+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"dateOfBirth\" value=\""+dateOfBirth+"\">";
		str += "<column name=\"directReportId\" value=\""+directReportId+"\">";
		str += "<column name=\"divisionId\" value=\""+divisionId+"\">";
		str += "<column name=\"gender\" value=\""+gender+"\">";
		str += "<column name=\"middleName\" value=\""+middleName+"\">";
		str += "<column name=\"personType\" value=\""+personType+"\">";
		str += "<column name=\"preferredName\" value=\""+preferredName+"\">";
		str += "<column name=\"prefix\" value=\""+prefix+"\">";
		str += "<column name=\"title\" value=\""+title+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"submissionId\":\""+submissionId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"firstName\":\""+firstName+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"personNumber\":\""+personNumber+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"dateOfBirth\":\""+dateOfBirth+"\", ";
		str += "\"directReportId\":\""+directReportId+"\", ";
		str += "\"divisionId\":\""+divisionId+"\", ";
		str += "\"gender\":\""+gender+"\", ";
		str += "\"middleName\":\""+middleName+"\", ";
		str += "\"personType\":\""+personType+"\", ";
		str += "\"preferredName\":\""+preferredName+"\", ";
		str += "\"prefix\":\""+prefix+"\", ";
		str += "\"title\":\""+title+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}