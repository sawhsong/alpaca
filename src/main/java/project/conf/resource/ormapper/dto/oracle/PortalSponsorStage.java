/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SPONSOR_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSponsorStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double submissionId;
	private String SUBMISSION_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double migPersonalDetailsId;
	private String MIG_PERSONAL_DETAILS_ID;
	private Date approvalDate1068;
	private String APPROVAL_DATE_1068;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String currentVisaStatus;
	private String CURRENT_VISA_STATUS;
	private Date fromDate;
	private String FROM_DATE;
	private double organisationId;
	private String ORGANISATION_ID;
	private String passportNumber;
	private String PASSPORT_NUMBER;
	private double personId;
	private String PERSON_ID;
	private double salaryLevel;
	private String SALARY_LEVEL;
	private String sponsorshipInProgress;
	private String SPONSORSHIP_IN_PROGRESS;
	private Date toDate;
	private String TO_DATE;
	private String transformed;
	private String TRANSFORMED;
	private String visaType;
	private String VISA_TYPE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalSponsorStage() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,APPROVAL_DATE_1068,FROM_DATE,TO_DATE");
		setFrwVarNumberColumn("SUBMISSION_ID,CREATED_BY,LAST_UPDATED_BY,MIG_PERSONAL_DETAILS_ID,BUSINESS_GROUP_ID,ORGANISATION_ID,PERSON_ID,SALARY_LEVEL");
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

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) throws Exception {
		this.lastUpdateDate = lastUpdateDate;
		setValueFromAccessor("LAST_UPDATE_DATE", CommonUtil.toString(lastUpdateDate));
	}

	public double getMigPersonalDetailsId() {
		return migPersonalDetailsId;
	}

	public void setMigPersonalDetailsId(double migPersonalDetailsId) throws Exception {
		this.migPersonalDetailsId = migPersonalDetailsId;
		setValueFromAccessor("MIG_PERSONAL_DETAILS_ID", CommonUtil.toString(migPersonalDetailsId));
	}

	public Date getApprovalDate1068() {
		return approvalDate1068;
	}

	public void setApprovalDate1068(Date approvalDate1068) throws Exception {
		this.approvalDate1068 = approvalDate1068;
		setValueFromAccessor("APPROVAL_DATE_1068", CommonUtil.toString(approvalDate1068));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getCurrentVisaStatus() {
		return currentVisaStatus;
	}

	public void setCurrentVisaStatus(String currentVisaStatus) throws Exception {
		this.currentVisaStatus = currentVisaStatus;
		setValueFromAccessor("CURRENT_VISA_STATUS", currentVisaStatus);
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) throws Exception {
		this.fromDate = fromDate;
		setValueFromAccessor("FROM_DATE", CommonUtil.toString(fromDate));
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) throws Exception {
		this.passportNumber = passportNumber;
		setValueFromAccessor("PASSPORT_NUMBER", passportNumber);
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(double salaryLevel) throws Exception {
		this.salaryLevel = salaryLevel;
		setValueFromAccessor("SALARY_LEVEL", CommonUtil.toString(salaryLevel));
	}

	public String getSponsorshipInProgress() {
		return sponsorshipInProgress;
	}

	public void setSponsorshipInProgress(String sponsorshipInProgress) throws Exception {
		this.sponsorshipInProgress = sponsorshipInProgress;
		setValueFromAccessor("SPONSORSHIP_IN_PROGRESS", sponsorshipInProgress);
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) throws Exception {
		this.toDate = toDate;
		setValueFromAccessor("TO_DATE", CommonUtil.toString(toDate));
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) throws Exception {
		this.visaType = visaType;
		setValueFromAccessor("VISA_TYPE", visaType);
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
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "migPersonalDetailsId : "+migPersonalDetailsId+"\n";
		str += "approvalDate1068 : "+approvalDate1068+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "currentVisaStatus : "+currentVisaStatus+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "passportNumber : "+passportNumber+"\n";
		str += "personId : "+personId+"\n";
		str += "salaryLevel : "+salaryLevel+"\n";
		str += "sponsorshipInProgress : "+sponsorshipInProgress+"\n";
		str += "toDate : "+toDate+"\n";
		str += "transformed : "+transformed+"\n";
		str += "visaType : "+visaType+"\n";
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
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"migPersonalDetailsId\" value=\""+migPersonalDetailsId+"\">";
		str += "<column name=\"approvalDate1068\" value=\""+approvalDate1068+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"currentVisaStatus\" value=\""+currentVisaStatus+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"passportNumber\" value=\""+passportNumber+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"salaryLevel\" value=\""+salaryLevel+"\">";
		str += "<column name=\"sponsorshipInProgress\" value=\""+sponsorshipInProgress+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"visaType\" value=\""+visaType+"\">";
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
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"migPersonalDetailsId\":\""+migPersonalDetailsId+"\", ";
		str += "\"approvalDate1068\":\""+approvalDate1068+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"currentVisaStatus\":\""+currentVisaStatus+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"passportNumber\":\""+passportNumber+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"salaryLevel\":\""+salaryLevel+"\", ";
		str += "\"sponsorshipInProgress\":\""+sponsorshipInProgress+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"visaType\":\""+visaType+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}