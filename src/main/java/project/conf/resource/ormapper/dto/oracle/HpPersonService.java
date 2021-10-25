/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_PERSON_SERVICE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpPersonService extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double personServiceId;
	private String PERSON_SERVICE_ID;
	private String addressLine;
	private String ADDRESS_LINE;
	private String approvedExpenses;
	private String APPROVED_EXPENSES;
	private Date assignmentEndDate;
	private String ASSIGNMENT_END_DATE;
	private Date assignmentStartDate;
	private String ASSIGNMENT_START_DATE;
	private String attribute1;
	private String ATTRIBUTE1;
	private String attribute2;
	private String ATTRIBUTE2;
	private String attribute3;
	private String ATTRIBUTE3;
	private String attribute4;
	private String ATTRIBUTE4;
	private String attribute5;
	private String ATTRIBUTE5;
	private String country;
	private String COUNTRY;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String dataServiceType;
	private String DATA_SERVICE_TYPE;
	private Date dateOfBirth;
	private String DATE_OF_BIRTH;
	private String email;
	private String EMAIL;
	private String employmentCompanyAbn;
	private String EMPLOYMENT_COMPANY_ABN;
	private String employmentCompanyName;
	private String EMPLOYMENT_COMPANY_NAME;
	private String endClient;
	private String END_CLIENT;
	private String equipmentDetails;
	private String EQUIPMENT_DETAILS;
	private String equipmentRequired;
	private String EQUIPMENT_REQUIRED;
	private String externalReference;
	private String EXTERNAL_REFERENCE;
	private String firstName;
	private String FIRST_NAME;
	private String invoicedEsCustomer;
	private String INVOICED_ES_CUSTOMER;
	private String iproFeeUpon;
	private String IPRO_FEE_UPON;
	private String jobTitle;
	private String JOB_TITLE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String middleName;
	private String MIDDLE_NAME;
	private String mobile;
	private String MOBILE;
	private String newContract;
	private String NEW_CONTRACT;
	private double organisationId;
	private String ORGANISATION_ID;
	private String personType;
	private String PERSON_TYPE;
	private String postCode;
	private String POST_CODE;
	private double rate;
	private String RATE;
	private String rateUnit;
	private String RATE_UNIT;
	private String restraintOfTrade;
	private String RESTRAINT_OF_TRADE;
	private String serviceDescription;
	private String SERVICE_DESCRIPTION;
	private String serviceStatus;
	private String SERVICE_STATUS;
	private String specialConditions;
	private String SPECIAL_CONDITIONS;
	private String state;
	private String STATE;
	private String statusDetail;
	private String STATUS_DETAIL;
	private String suburb;
	private String SUBURB;
	private String surname;
	private String SURNAME;
	private String terminationNotice;
	private String TERMINATION_NOTICE;
	private String terminationNoticeUnit;
	private String TERMINATION_NOTICE_UNIT;
	private String workingHoursBasis;
	private String WORKING_HOURS_BASIS;
	private String workEndTime;
	private String WORK_END_TIME;
	private String workStartTime;
	private String WORK_START_TIME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpPersonService() throws Exception {
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
		setFrwVarPrimaryKey("PERSON_SERVICE_ID");
		setFrwVarDateColumn("ASSIGNMENT_END_DATE,ASSIGNMENT_START_DATE,CREATION_DATE,DATE_OF_BIRTH,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("PERSON_SERVICE_ID,CREATED_BY,LAST_UPDATED_BY,ORGANISATION_ID,RATE");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPersonServiceId() {
		return personServiceId;
	}

	public void setPersonServiceId(double personServiceId) throws Exception {
		this.personServiceId = personServiceId;
		setValueFromAccessor("PERSON_SERVICE_ID", CommonUtil.toString(personServiceId));
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) throws Exception {
		this.addressLine = addressLine;
		setValueFromAccessor("ADDRESS_LINE", addressLine);
	}

	public String getApprovedExpenses() {
		return approvedExpenses;
	}

	public void setApprovedExpenses(String approvedExpenses) throws Exception {
		this.approvedExpenses = approvedExpenses;
		setValueFromAccessor("APPROVED_EXPENSES", approvedExpenses);
	}

	public Date getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public void setAssignmentEndDate(Date assignmentEndDate) throws Exception {
		this.assignmentEndDate = assignmentEndDate;
		setValueFromAccessor("ASSIGNMENT_END_DATE", CommonUtil.toString(assignmentEndDate));
	}

	public Date getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(Date assignmentStartDate) throws Exception {
		this.assignmentStartDate = assignmentStartDate;
		setValueFromAccessor("ASSIGNMENT_START_DATE", CommonUtil.toString(assignmentStartDate));
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) throws Exception {
		this.attribute1 = attribute1;
		setValueFromAccessor("ATTRIBUTE1", attribute1);
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) throws Exception {
		this.attribute2 = attribute2;
		setValueFromAccessor("ATTRIBUTE2", attribute2);
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) throws Exception {
		this.attribute3 = attribute3;
		setValueFromAccessor("ATTRIBUTE3", attribute3);
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) throws Exception {
		this.attribute4 = attribute4;
		setValueFromAccessor("ATTRIBUTE4", attribute4);
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) throws Exception {
		this.attribute5 = attribute5;
		setValueFromAccessor("ATTRIBUTE5", attribute5);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) throws Exception {
		this.country = country;
		setValueFromAccessor("COUNTRY", country);
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

	public String getDataServiceType() {
		return dataServiceType;
	}

	public void setDataServiceType(String dataServiceType) throws Exception {
		this.dataServiceType = dataServiceType;
		setValueFromAccessor("DATA_SERVICE_TYPE", dataServiceType);
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) throws Exception {
		this.dateOfBirth = dateOfBirth;
		setValueFromAccessor("DATE_OF_BIRTH", CommonUtil.toString(dateOfBirth));
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		this.email = email;
		setValueFromAccessor("EMAIL", email);
	}

	public String getEmploymentCompanyAbn() {
		return employmentCompanyAbn;
	}

	public void setEmploymentCompanyAbn(String employmentCompanyAbn) throws Exception {
		this.employmentCompanyAbn = employmentCompanyAbn;
		setValueFromAccessor("EMPLOYMENT_COMPANY_ABN", employmentCompanyAbn);
	}

	public String getEmploymentCompanyName() {
		return employmentCompanyName;
	}

	public void setEmploymentCompanyName(String employmentCompanyName) throws Exception {
		this.employmentCompanyName = employmentCompanyName;
		setValueFromAccessor("EMPLOYMENT_COMPANY_NAME", employmentCompanyName);
	}

	public String getEndClient() {
		return endClient;
	}

	public void setEndClient(String endClient) throws Exception {
		this.endClient = endClient;
		setValueFromAccessor("END_CLIENT", endClient);
	}

	public String getEquipmentDetails() {
		return equipmentDetails;
	}

	public void setEquipmentDetails(String equipmentDetails) throws Exception {
		this.equipmentDetails = equipmentDetails;
		setValueFromAccessor("EQUIPMENT_DETAILS", equipmentDetails);
	}

	public String getEquipmentRequired() {
		return equipmentRequired;
	}

	public void setEquipmentRequired(String equipmentRequired) throws Exception {
		this.equipmentRequired = equipmentRequired;
		setValueFromAccessor("EQUIPMENT_REQUIRED", equipmentRequired);
	}

	public String getExternalReference() {
		return externalReference;
	}

	public void setExternalReference(String externalReference) throws Exception {
		this.externalReference = externalReference;
		setValueFromAccessor("EXTERNAL_REFERENCE", externalReference);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		this.firstName = firstName;
		setValueFromAccessor("FIRST_NAME", firstName);
	}

	public String getInvoicedEsCustomer() {
		return invoicedEsCustomer;
	}

	public void setInvoicedEsCustomer(String invoicedEsCustomer) throws Exception {
		this.invoicedEsCustomer = invoicedEsCustomer;
		setValueFromAccessor("INVOICED_ES_CUSTOMER", invoicedEsCustomer);
	}

	public String getIproFeeUpon() {
		return iproFeeUpon;
	}

	public void setIproFeeUpon(String iproFeeUpon) throws Exception {
		this.iproFeeUpon = iproFeeUpon;
		setValueFromAccessor("IPRO_FEE_UPON", iproFeeUpon);
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) throws Exception {
		this.jobTitle = jobTitle;
		setValueFromAccessor("JOB_TITLE", jobTitle);
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) throws Exception {
		this.middleName = middleName;
		setValueFromAccessor("MIDDLE_NAME", middleName);
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) throws Exception {
		this.mobile = mobile;
		setValueFromAccessor("MOBILE", mobile);
	}

	public String getNewContract() {
		return newContract;
	}

	public void setNewContract(String newContract) throws Exception {
		this.newContract = newContract;
		setValueFromAccessor("NEW_CONTRACT", newContract);
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) throws Exception {
		this.personType = personType;
		setValueFromAccessor("PERSON_TYPE", personType);
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) throws Exception {
		this.postCode = postCode;
		setValueFromAccessor("POST_CODE", postCode);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) throws Exception {
		this.rate = rate;
		setValueFromAccessor("RATE", CommonUtil.toString(rate));
	}

	public String getRateUnit() {
		return rateUnit;
	}

	public void setRateUnit(String rateUnit) throws Exception {
		this.rateUnit = rateUnit;
		setValueFromAccessor("RATE_UNIT", rateUnit);
	}

	public String getRestraintOfTrade() {
		return restraintOfTrade;
	}

	public void setRestraintOfTrade(String restraintOfTrade) throws Exception {
		this.restraintOfTrade = restraintOfTrade;
		setValueFromAccessor("RESTRAINT_OF_TRADE", restraintOfTrade);
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) throws Exception {
		this.serviceDescription = serviceDescription;
		setValueFromAccessor("SERVICE_DESCRIPTION", serviceDescription);
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) throws Exception {
		this.serviceStatus = serviceStatus;
		setValueFromAccessor("SERVICE_STATUS", serviceStatus);
	}

	public String getSpecialConditions() {
		return specialConditions;
	}

	public void setSpecialConditions(String specialConditions) throws Exception {
		this.specialConditions = specialConditions;
		setValueFromAccessor("SPECIAL_CONDITIONS", specialConditions);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) throws Exception {
		this.state = state;
		setValueFromAccessor("STATE", state);
	}

	public String getStatusDetail() {
		return statusDetail;
	}

	public void setStatusDetail(String statusDetail) throws Exception {
		this.statusDetail = statusDetail;
		setValueFromAccessor("STATUS_DETAIL", statusDetail);
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) throws Exception {
		this.suburb = suburb;
		setValueFromAccessor("SUBURB", suburb);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		this.surname = surname;
		setValueFromAccessor("SURNAME", surname);
	}

	public String getTerminationNotice() {
		return terminationNotice;
	}

	public void setTerminationNotice(String terminationNotice) throws Exception {
		this.terminationNotice = terminationNotice;
		setValueFromAccessor("TERMINATION_NOTICE", terminationNotice);
	}

	public String getTerminationNoticeUnit() {
		return terminationNoticeUnit;
	}

	public void setTerminationNoticeUnit(String terminationNoticeUnit) throws Exception {
		this.terminationNoticeUnit = terminationNoticeUnit;
		setValueFromAccessor("TERMINATION_NOTICE_UNIT", terminationNoticeUnit);
	}

	public String getWorkingHoursBasis() {
		return workingHoursBasis;
	}

	public void setWorkingHoursBasis(String workingHoursBasis) throws Exception {
		this.workingHoursBasis = workingHoursBasis;
		setValueFromAccessor("WORKING_HOURS_BASIS", workingHoursBasis);
	}

	public String getWorkEndTime() {
		return workEndTime;
	}

	public void setWorkEndTime(String workEndTime) throws Exception {
		this.workEndTime = workEndTime;
		setValueFromAccessor("WORK_END_TIME", workEndTime);
	}

	public String getWorkStartTime() {
		return workStartTime;
	}

	public void setWorkStartTime(String workStartTime) throws Exception {
		this.workStartTime = workStartTime;
		setValueFromAccessor("WORK_START_TIME", workStartTime);
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

		str += "personServiceId : "+personServiceId+"\n";
		str += "addressLine : "+addressLine+"\n";
		str += "approvedExpenses : "+approvedExpenses+"\n";
		str += "assignmentEndDate : "+assignmentEndDate+"\n";
		str += "assignmentStartDate : "+assignmentStartDate+"\n";
		str += "attribute1 : "+attribute1+"\n";
		str += "attribute2 : "+attribute2+"\n";
		str += "attribute3 : "+attribute3+"\n";
		str += "attribute4 : "+attribute4+"\n";
		str += "attribute5 : "+attribute5+"\n";
		str += "country : "+country+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "dataServiceType : "+dataServiceType+"\n";
		str += "dateOfBirth : "+dateOfBirth+"\n";
		str += "email : "+email+"\n";
		str += "employmentCompanyAbn : "+employmentCompanyAbn+"\n";
		str += "employmentCompanyName : "+employmentCompanyName+"\n";
		str += "endClient : "+endClient+"\n";
		str += "equipmentDetails : "+equipmentDetails+"\n";
		str += "equipmentRequired : "+equipmentRequired+"\n";
		str += "externalReference : "+externalReference+"\n";
		str += "firstName : "+firstName+"\n";
		str += "invoicedEsCustomer : "+invoicedEsCustomer+"\n";
		str += "iproFeeUpon : "+iproFeeUpon+"\n";
		str += "jobTitle : "+jobTitle+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "middleName : "+middleName+"\n";
		str += "mobile : "+mobile+"\n";
		str += "newContract : "+newContract+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "personType : "+personType+"\n";
		str += "postCode : "+postCode+"\n";
		str += "rate : "+rate+"\n";
		str += "rateUnit : "+rateUnit+"\n";
		str += "restraintOfTrade : "+restraintOfTrade+"\n";
		str += "serviceDescription : "+serviceDescription+"\n";
		str += "serviceStatus : "+serviceStatus+"\n";
		str += "specialConditions : "+specialConditions+"\n";
		str += "state : "+state+"\n";
		str += "statusDetail : "+statusDetail+"\n";
		str += "suburb : "+suburb+"\n";
		str += "surname : "+surname+"\n";
		str += "terminationNotice : "+terminationNotice+"\n";
		str += "terminationNoticeUnit : "+terminationNoticeUnit+"\n";
		str += "workingHoursBasis : "+workingHoursBasis+"\n";
		str += "workEndTime : "+workEndTime+"\n";
		str += "workStartTime : "+workStartTime+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"personServiceId\" value=\""+personServiceId+"\">";
		str += "<column name=\"addressLine\" value=\""+addressLine+"\">";
		str += "<column name=\"approvedExpenses\" value=\""+approvedExpenses+"\">";
		str += "<column name=\"assignmentEndDate\" value=\""+assignmentEndDate+"\">";
		str += "<column name=\"assignmentStartDate\" value=\""+assignmentStartDate+"\">";
		str += "<column name=\"attribute1\" value=\""+attribute1+"\">";
		str += "<column name=\"attribute2\" value=\""+attribute2+"\">";
		str += "<column name=\"attribute3\" value=\""+attribute3+"\">";
		str += "<column name=\"attribute4\" value=\""+attribute4+"\">";
		str += "<column name=\"attribute5\" value=\""+attribute5+"\">";
		str += "<column name=\"country\" value=\""+country+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"dataServiceType\" value=\""+dataServiceType+"\">";
		str += "<column name=\"dateOfBirth\" value=\""+dateOfBirth+"\">";
		str += "<column name=\"email\" value=\""+email+"\">";
		str += "<column name=\"employmentCompanyAbn\" value=\""+employmentCompanyAbn+"\">";
		str += "<column name=\"employmentCompanyName\" value=\""+employmentCompanyName+"\">";
		str += "<column name=\"endClient\" value=\""+endClient+"\">";
		str += "<column name=\"equipmentDetails\" value=\""+equipmentDetails+"\">";
		str += "<column name=\"equipmentRequired\" value=\""+equipmentRequired+"\">";
		str += "<column name=\"externalReference\" value=\""+externalReference+"\">";
		str += "<column name=\"firstName\" value=\""+firstName+"\">";
		str += "<column name=\"invoicedEsCustomer\" value=\""+invoicedEsCustomer+"\">";
		str += "<column name=\"iproFeeUpon\" value=\""+iproFeeUpon+"\">";
		str += "<column name=\"jobTitle\" value=\""+jobTitle+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"middleName\" value=\""+middleName+"\">";
		str += "<column name=\"mobile\" value=\""+mobile+"\">";
		str += "<column name=\"newContract\" value=\""+newContract+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"personType\" value=\""+personType+"\">";
		str += "<column name=\"postCode\" value=\""+postCode+"\">";
		str += "<column name=\"rate\" value=\""+rate+"\">";
		str += "<column name=\"rateUnit\" value=\""+rateUnit+"\">";
		str += "<column name=\"restraintOfTrade\" value=\""+restraintOfTrade+"\">";
		str += "<column name=\"serviceDescription\" value=\""+serviceDescription+"\">";
		str += "<column name=\"serviceStatus\" value=\""+serviceStatus+"\">";
		str += "<column name=\"specialConditions\" value=\""+specialConditions+"\">";
		str += "<column name=\"state\" value=\""+state+"\">";
		str += "<column name=\"statusDetail\" value=\""+statusDetail+"\">";
		str += "<column name=\"suburb\" value=\""+suburb+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"terminationNotice\" value=\""+terminationNotice+"\">";
		str += "<column name=\"terminationNoticeUnit\" value=\""+terminationNoticeUnit+"\">";
		str += "<column name=\"workingHoursBasis\" value=\""+workingHoursBasis+"\">";
		str += "<column name=\"workEndTime\" value=\""+workEndTime+"\">";
		str += "<column name=\"workStartTime\" value=\""+workStartTime+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"personServiceId\":\""+personServiceId+"\", ";
		str += "\"addressLine\":\""+addressLine+"\", ";
		str += "\"approvedExpenses\":\""+approvedExpenses+"\", ";
		str += "\"assignmentEndDate\":\""+assignmentEndDate+"\", ";
		str += "\"assignmentStartDate\":\""+assignmentStartDate+"\", ";
		str += "\"attribute1\":\""+attribute1+"\", ";
		str += "\"attribute2\":\""+attribute2+"\", ";
		str += "\"attribute3\":\""+attribute3+"\", ";
		str += "\"attribute4\":\""+attribute4+"\", ";
		str += "\"attribute5\":\""+attribute5+"\", ";
		str += "\"country\":\""+country+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"dataServiceType\":\""+dataServiceType+"\", ";
		str += "\"dateOfBirth\":\""+dateOfBirth+"\", ";
		str += "\"email\":\""+email+"\", ";
		str += "\"employmentCompanyAbn\":\""+employmentCompanyAbn+"\", ";
		str += "\"employmentCompanyName\":\""+employmentCompanyName+"\", ";
		str += "\"endClient\":\""+endClient+"\", ";
		str += "\"equipmentDetails\":\""+equipmentDetails+"\", ";
		str += "\"equipmentRequired\":\""+equipmentRequired+"\", ";
		str += "\"externalReference\":\""+externalReference+"\", ";
		str += "\"firstName\":\""+firstName+"\", ";
		str += "\"invoicedEsCustomer\":\""+invoicedEsCustomer+"\", ";
		str += "\"iproFeeUpon\":\""+iproFeeUpon+"\", ";
		str += "\"jobTitle\":\""+jobTitle+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"middleName\":\""+middleName+"\", ";
		str += "\"mobile\":\""+mobile+"\", ";
		str += "\"newContract\":\""+newContract+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"personType\":\""+personType+"\", ";
		str += "\"postCode\":\""+postCode+"\", ";
		str += "\"rate\":\""+rate+"\", ";
		str += "\"rateUnit\":\""+rateUnit+"\", ";
		str += "\"restraintOfTrade\":\""+restraintOfTrade+"\", ";
		str += "\"serviceDescription\":\""+serviceDescription+"\", ";
		str += "\"serviceStatus\":\""+serviceStatus+"\", ";
		str += "\"specialConditions\":\""+specialConditions+"\", ";
		str += "\"state\":\""+state+"\", ";
		str += "\"statusDetail\":\""+statusDetail+"\", ";
		str += "\"suburb\":\""+suburb+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"terminationNotice\":\""+terminationNotice+"\", ";
		str += "\"terminationNoticeUnit\":\""+terminationNoticeUnit+"\", ";
		str += "\"workingHoursBasis\":\""+workingHoursBasis+"\", ";
		str += "\"workEndTime\":\""+workEndTime+"\", ";
		str += "\"workStartTime\":\""+workStartTime+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}