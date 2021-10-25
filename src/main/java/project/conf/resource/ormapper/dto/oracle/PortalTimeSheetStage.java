/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_TIME_SHEET_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalTimeSheetStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double submissionSeqId;
	private String SUBMISSION_SEQ_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double directReportId;
	private String DIRECT_REPORT_ID;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double personId;
	private String PERSON_ID;
	private double submissionId;
	private String SUBMISSION_ID;
	private double advancedPayment;
	private String ADVANCED_PAYMENT;
	private double allowances;
	private String ALLOWANCES;
	private double annualLeaveHours;
	private String ANNUAL_LEAVE_HOURS;
	private double annualLeaveRate;
	private String ANNUAL_LEAVE_RATE;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double bonus;
	private String BONUS;
	private String comments;
	private String COMMENTS;
	private double commission;
	private String COMMISSION;
	private double deductions;
	private String DEDUCTIONS;
	private String divisionBusinessUnit;
	private String DIVISION_BUSINESS_UNIT;
	private double divisionId;
	private String DIVISION_ID;
	private double employeeSuperContribution;
	private String EMPLOYEE_SUPER_CONTRIBUTION;
	private double fbt;
	private String FBT;
	private String firstName;
	private String FIRST_NAME;
	private String homeState;
	private String HOME_STATE;
	private double lslHours;
	private String LSL_HOURS;
	private double lslRate;
	private String LSL_RATE;
	private double mainContact;
	private String MAIN_CONTACT;
	private String middleName;
	private String MIDDLE_NAME;
	private double normalHours;
	private String NORMAL_HOURS;
	private double normalRate;
	private String NORMAL_RATE;
	private double novatedLease;
	private String NOVATED_LEASE;
	private double organisationId;
	private String ORGANISATION_ID;
	private String organisationName;
	private String ORGANISATION_NAME;
	private double overtimeHours;
	private String OVERTIME_HOURS;
	private double overtimeRate;
	private String OVERTIME_RATE;
	private String personType;
	private String PERSON_TYPE;
	private double salSac;
	private String SAL_SAC;
	private double sickLeaveHours;
	private String SICK_LEAVE_HOURS;
	private double sickLeaveRate;
	private String SICK_LEAVE_RATE;
	private String status;
	private String STATUS;
	private String surname;
	private String SURNAME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalTimeSheetStage() throws Exception {
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
		setFrwVarPrimaryKey("SUBMISSION_SEQ_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("SUBMISSION_SEQ_ID,BUSINESS_GROUP_ID,CREATED_BY,DIRECT_REPORT_ID,LAST_UPDATED_BY,PERSON_ID,SUBMISSION_ID,ADVANCED_PAYMENT,ALLOWANCES,ANNUAL_LEAVE_HOURS,ANNUAL_LEAVE_RATE,ASSIGNMENT_ID,BONUS,COMMISSION,DEDUCTIONS,DIVISION_ID,EMPLOYEE_SUPER_CONTRIBUTION,FBT,LSL_HOURS,LSL_RATE,MAIN_CONTACT,NORMAL_HOURS,NORMAL_RATE,NOVATED_LEASE,ORGANISATION_ID,OVERTIME_HOURS,OVERTIME_RATE,SAL_SAC,SICK_LEAVE_HOURS,SICK_LEAVE_RATE");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getSubmissionSeqId() {
		return submissionSeqId;
	}

	public void setSubmissionSeqId(double submissionSeqId) throws Exception {
		this.submissionSeqId = submissionSeqId;
		setValueFromAccessor("SUBMISSION_SEQ_ID", CommonUtil.toString(submissionSeqId));
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

	public double getDirectReportId() {
		return directReportId;
	}

	public void setDirectReportId(double directReportId) throws Exception {
		this.directReportId = directReportId;
		setValueFromAccessor("DIRECT_REPORT_ID", CommonUtil.toString(directReportId));
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

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(double submissionId) throws Exception {
		this.submissionId = submissionId;
		setValueFromAccessor("SUBMISSION_ID", CommonUtil.toString(submissionId));
	}

	public double getAdvancedPayment() {
		return advancedPayment;
	}

	public void setAdvancedPayment(double advancedPayment) throws Exception {
		this.advancedPayment = advancedPayment;
		setValueFromAccessor("ADVANCED_PAYMENT", CommonUtil.toString(advancedPayment));
	}

	public double getAllowances() {
		return allowances;
	}

	public void setAllowances(double allowances) throws Exception {
		this.allowances = allowances;
		setValueFromAccessor("ALLOWANCES", CommonUtil.toString(allowances));
	}

	public double getAnnualLeaveHours() {
		return annualLeaveHours;
	}

	public void setAnnualLeaveHours(double annualLeaveHours) throws Exception {
		this.annualLeaveHours = annualLeaveHours;
		setValueFromAccessor("ANNUAL_LEAVE_HOURS", CommonUtil.toString(annualLeaveHours));
	}

	public double getAnnualLeaveRate() {
		return annualLeaveRate;
	}

	public void setAnnualLeaveRate(double annualLeaveRate) throws Exception {
		this.annualLeaveRate = annualLeaveRate;
		setValueFromAccessor("ANNUAL_LEAVE_RATE", CommonUtil.toString(annualLeaveRate));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) throws Exception {
		this.bonus = bonus;
		setValueFromAccessor("BONUS", CommonUtil.toString(bonus));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) throws Exception {
		this.commission = commission;
		setValueFromAccessor("COMMISSION", CommonUtil.toString(commission));
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) throws Exception {
		this.deductions = deductions;
		setValueFromAccessor("DEDUCTIONS", CommonUtil.toString(deductions));
	}

	public String getDivisionBusinessUnit() {
		return divisionBusinessUnit;
	}

	public void setDivisionBusinessUnit(String divisionBusinessUnit) throws Exception {
		this.divisionBusinessUnit = divisionBusinessUnit;
		setValueFromAccessor("DIVISION_BUSINESS_UNIT", divisionBusinessUnit);
	}

	public double getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(double divisionId) throws Exception {
		this.divisionId = divisionId;
		setValueFromAccessor("DIVISION_ID", CommonUtil.toString(divisionId));
	}

	public double getEmployeeSuperContribution() {
		return employeeSuperContribution;
	}

	public void setEmployeeSuperContribution(double employeeSuperContribution) throws Exception {
		this.employeeSuperContribution = employeeSuperContribution;
		setValueFromAccessor("EMPLOYEE_SUPER_CONTRIBUTION", CommonUtil.toString(employeeSuperContribution));
	}

	public double getFbt() {
		return fbt;
	}

	public void setFbt(double fbt) throws Exception {
		this.fbt = fbt;
		setValueFromAccessor("FBT", CommonUtil.toString(fbt));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		this.firstName = firstName;
		setValueFromAccessor("FIRST_NAME", firstName);
	}

	public String getHomeState() {
		return homeState;
	}

	public void setHomeState(String homeState) throws Exception {
		this.homeState = homeState;
		setValueFromAccessor("HOME_STATE", homeState);
	}

	public double getLslHours() {
		return lslHours;
	}

	public void setLslHours(double lslHours) throws Exception {
		this.lslHours = lslHours;
		setValueFromAccessor("LSL_HOURS", CommonUtil.toString(lslHours));
	}

	public double getLslRate() {
		return lslRate;
	}

	public void setLslRate(double lslRate) throws Exception {
		this.lslRate = lslRate;
		setValueFromAccessor("LSL_RATE", CommonUtil.toString(lslRate));
	}

	public double getMainContact() {
		return mainContact;
	}

	public void setMainContact(double mainContact) throws Exception {
		this.mainContact = mainContact;
		setValueFromAccessor("MAIN_CONTACT", CommonUtil.toString(mainContact));
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) throws Exception {
		this.middleName = middleName;
		setValueFromAccessor("MIDDLE_NAME", middleName);
	}

	public double getNormalHours() {
		return normalHours;
	}

	public void setNormalHours(double normalHours) throws Exception {
		this.normalHours = normalHours;
		setValueFromAccessor("NORMAL_HOURS", CommonUtil.toString(normalHours));
	}

	public double getNormalRate() {
		return normalRate;
	}

	public void setNormalRate(double normalRate) throws Exception {
		this.normalRate = normalRate;
		setValueFromAccessor("NORMAL_RATE", CommonUtil.toString(normalRate));
	}

	public double getNovatedLease() {
		return novatedLease;
	}

	public void setNovatedLease(double novatedLease) throws Exception {
		this.novatedLease = novatedLease;
		setValueFromAccessor("NOVATED_LEASE", CommonUtil.toString(novatedLease));
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) throws Exception {
		this.organisationName = organisationName;
		setValueFromAccessor("ORGANISATION_NAME", organisationName);
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) throws Exception {
		this.overtimeHours = overtimeHours;
		setValueFromAccessor("OVERTIME_HOURS", CommonUtil.toString(overtimeHours));
	}

	public double getOvertimeRate() {
		return overtimeRate;
	}

	public void setOvertimeRate(double overtimeRate) throws Exception {
		this.overtimeRate = overtimeRate;
		setValueFromAccessor("OVERTIME_RATE", CommonUtil.toString(overtimeRate));
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) throws Exception {
		this.personType = personType;
		setValueFromAccessor("PERSON_TYPE", personType);
	}

	public double getSalSac() {
		return salSac;
	}

	public void setSalSac(double salSac) throws Exception {
		this.salSac = salSac;
		setValueFromAccessor("SAL_SAC", CommonUtil.toString(salSac));
	}

	public double getSickLeaveHours() {
		return sickLeaveHours;
	}

	public void setSickLeaveHours(double sickLeaveHours) throws Exception {
		this.sickLeaveHours = sickLeaveHours;
		setValueFromAccessor("SICK_LEAVE_HOURS", CommonUtil.toString(sickLeaveHours));
	}

	public double getSickLeaveRate() {
		return sickLeaveRate;
	}

	public void setSickLeaveRate(double sickLeaveRate) throws Exception {
		this.sickLeaveRate = sickLeaveRate;
		setValueFromAccessor("SICK_LEAVE_RATE", CommonUtil.toString(sickLeaveRate));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		this.surname = surname;
		setValueFromAccessor("SURNAME", surname);
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

		str += "submissionSeqId : "+submissionSeqId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "directReportId : "+directReportId+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "personId : "+personId+"\n";
		str += "submissionId : "+submissionId+"\n";
		str += "advancedPayment : "+advancedPayment+"\n";
		str += "allowances : "+allowances+"\n";
		str += "annualLeaveHours : "+annualLeaveHours+"\n";
		str += "annualLeaveRate : "+annualLeaveRate+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "bonus : "+bonus+"\n";
		str += "comments : "+comments+"\n";
		str += "commission : "+commission+"\n";
		str += "deductions : "+deductions+"\n";
		str += "divisionBusinessUnit : "+divisionBusinessUnit+"\n";
		str += "divisionId : "+divisionId+"\n";
		str += "employeeSuperContribution : "+employeeSuperContribution+"\n";
		str += "fbt : "+fbt+"\n";
		str += "firstName : "+firstName+"\n";
		str += "homeState : "+homeState+"\n";
		str += "lslHours : "+lslHours+"\n";
		str += "lslRate : "+lslRate+"\n";
		str += "mainContact : "+mainContact+"\n";
		str += "middleName : "+middleName+"\n";
		str += "normalHours : "+normalHours+"\n";
		str += "normalRate : "+normalRate+"\n";
		str += "novatedLease : "+novatedLease+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "organisationName : "+organisationName+"\n";
		str += "overtimeHours : "+overtimeHours+"\n";
		str += "overtimeRate : "+overtimeRate+"\n";
		str += "personType : "+personType+"\n";
		str += "salSac : "+salSac+"\n";
		str += "sickLeaveHours : "+sickLeaveHours+"\n";
		str += "sickLeaveRate : "+sickLeaveRate+"\n";
		str += "status : "+status+"\n";
		str += "surname : "+surname+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"submissionSeqId\" value=\""+submissionSeqId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"directReportId\" value=\""+directReportId+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"submissionId\" value=\""+submissionId+"\">";
		str += "<column name=\"advancedPayment\" value=\""+advancedPayment+"\">";
		str += "<column name=\"allowances\" value=\""+allowances+"\">";
		str += "<column name=\"annualLeaveHours\" value=\""+annualLeaveHours+"\">";
		str += "<column name=\"annualLeaveRate\" value=\""+annualLeaveRate+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"bonus\" value=\""+bonus+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"commission\" value=\""+commission+"\">";
		str += "<column name=\"deductions\" value=\""+deductions+"\">";
		str += "<column name=\"divisionBusinessUnit\" value=\""+divisionBusinessUnit+"\">";
		str += "<column name=\"divisionId\" value=\""+divisionId+"\">";
		str += "<column name=\"employeeSuperContribution\" value=\""+employeeSuperContribution+"\">";
		str += "<column name=\"fbt\" value=\""+fbt+"\">";
		str += "<column name=\"firstName\" value=\""+firstName+"\">";
		str += "<column name=\"homeState\" value=\""+homeState+"\">";
		str += "<column name=\"lslHours\" value=\""+lslHours+"\">";
		str += "<column name=\"lslRate\" value=\""+lslRate+"\">";
		str += "<column name=\"mainContact\" value=\""+mainContact+"\">";
		str += "<column name=\"middleName\" value=\""+middleName+"\">";
		str += "<column name=\"normalHours\" value=\""+normalHours+"\">";
		str += "<column name=\"normalRate\" value=\""+normalRate+"\">";
		str += "<column name=\"novatedLease\" value=\""+novatedLease+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"organisationName\" value=\""+organisationName+"\">";
		str += "<column name=\"overtimeHours\" value=\""+overtimeHours+"\">";
		str += "<column name=\"overtimeRate\" value=\""+overtimeRate+"\">";
		str += "<column name=\"personType\" value=\""+personType+"\">";
		str += "<column name=\"salSac\" value=\""+salSac+"\">";
		str += "<column name=\"sickLeaveHours\" value=\""+sickLeaveHours+"\">";
		str += "<column name=\"sickLeaveRate\" value=\""+sickLeaveRate+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"submissionSeqId\":\""+submissionSeqId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"directReportId\":\""+directReportId+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"submissionId\":\""+submissionId+"\", ";
		str += "\"advancedPayment\":\""+advancedPayment+"\", ";
		str += "\"allowances\":\""+allowances+"\", ";
		str += "\"annualLeaveHours\":\""+annualLeaveHours+"\", ";
		str += "\"annualLeaveRate\":\""+annualLeaveRate+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"bonus\":\""+bonus+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"commission\":\""+commission+"\", ";
		str += "\"deductions\":\""+deductions+"\", ";
		str += "\"divisionBusinessUnit\":\""+divisionBusinessUnit+"\", ";
		str += "\"divisionId\":\""+divisionId+"\", ";
		str += "\"employeeSuperContribution\":\""+employeeSuperContribution+"\", ";
		str += "\"fbt\":\""+fbt+"\", ";
		str += "\"firstName\":\""+firstName+"\", ";
		str += "\"homeState\":\""+homeState+"\", ";
		str += "\"lslHours\":\""+lslHours+"\", ";
		str += "\"lslRate\":\""+lslRate+"\", ";
		str += "\"mainContact\":\""+mainContact+"\", ";
		str += "\"middleName\":\""+middleName+"\", ";
		str += "\"normalHours\":\""+normalHours+"\", ";
		str += "\"normalRate\":\""+normalRate+"\", ";
		str += "\"novatedLease\":\""+novatedLease+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"organisationName\":\""+organisationName+"\", ";
		str += "\"overtimeHours\":\""+overtimeHours+"\", ";
		str += "\"overtimeRate\":\""+overtimeRate+"\", ";
		str += "\"personType\":\""+personType+"\", ";
		str += "\"salSac\":\""+salSac+"\", ";
		str += "\"sickLeaveHours\":\""+sickLeaveHours+"\", ";
		str += "\"sickLeaveRate\":\""+sickLeaveRate+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}