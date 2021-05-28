/**************************************************************************************************
 * Framework Generated DTO Source
 * - TFND_REPORT_PAYEE_RECORD - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class TfndReportPayeeRecord extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double tfndReportPayeeRecordId;
	private String TFND_REPORT_PAYEE_RECORD_ID;
	private String austResident;
	private String AUST_RESIDENT;
	private Date dateOfBirth;
	private String DATE_OF_BIRTH;
	private Date dateSigned;
	private String DATE_SIGNED;
	private String hecsDebt;
	private String HECS_DEBT;
	private double payerId;
	private String PAYER_ID;
	private String paymentBasis;
	private String PAYMENT_BASIS;
	private double personId;
	private String PERSON_ID;
	private String signaturePresent;
	private String SIGNATURE_PRESENT;
	private String taxfreeThresholdClaimed;
	private String TAXFREE_THRESHOLD_CLAIMED;
	private String addressLine1;
	private String ADDRESS_LINE_1;
	private String addressLine2;
	private String ADDRESS_LINE_2;
	private String country;
	private String COUNTRY;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String firstName;
	private String FIRST_NAME;
	private String isActive;
	private String IS_ACTIVE;
	private String isReportable;
	private String IS_REPORTABLE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String middleName;
	private String MIDDLE_NAME;
	private String noTfnReason;
	private String NO_TFN_REASON;
	private String payrollIdentifier;
	private String PAYROLL_IDENTIFIER;
	private String postCode;
	private String POST_CODE;
	private String previousFirstName;
	private String PREVIOUS_FIRST_NAME;
	private String previousMiddleName;
	private String PREVIOUS_MIDDLE_NAME;
	private String previousSurname;
	private String PREVIOUS_SURNAME;
	private String primaryEmail;
	private String PRIMARY_EMAIL;
	private String seniorTaxOffsetClaimed;
	private String SENIOR_TAX_OFFSET_CLAIMED;
	private String sfssDebt;
	private String SFSS_DEBT;
	private String specialRebatesClaimed;
	private String SPECIAL_REBATES_CLAIMED;
	private String state;
	private String STATE;
	private String suburb;
	private String SUBURB;
	private String surname;
	private String SURNAME;
	private String terminatedIndicator;
	private String TERMINATED_INDICATOR;
	private String tfn;
	private String TFN;
	private double tfndReportFileId;
	private String TFND_REPORT_FILE_ID;
	private String title;
	private String TITLE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public TfndReportPayeeRecord() throws Exception {
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
		setFrwVarPrimaryKey("TFND_REPORT_PAYEE_RECORD_ID");
		setFrwVarDateColumn("DATE_OF_BIRTH,DATE_SIGNED,CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("TFND_REPORT_PAYEE_RECORD_ID,PAYER_ID,PERSON_ID,CREATED_BY,LAST_UPDATED_BY,TFND_REPORT_FILE_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getTfndReportPayeeRecordId() {
		return tfndReportPayeeRecordId;
	}

	public void setTfndReportPayeeRecordId(double tfndReportPayeeRecordId) throws Exception {
		this.tfndReportPayeeRecordId = tfndReportPayeeRecordId;
		setValueFromAccessor("TFND_REPORT_PAYEE_RECORD_ID", CommonUtil.toString(tfndReportPayeeRecordId));
	}

	public String getAustResident() {
		return austResident;
	}

	public void setAustResident(String austResident) throws Exception {
		this.austResident = austResident;
		setValueFromAccessor("AUST_RESIDENT", austResident);
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) throws Exception {
		this.dateOfBirth = dateOfBirth;
		setValueFromAccessor("DATE_OF_BIRTH", CommonUtil.toString(dateOfBirth));
	}

	public Date getDateSigned() {
		return dateSigned;
	}

	public void setDateSigned(Date dateSigned) throws Exception {
		this.dateSigned = dateSigned;
		setValueFromAccessor("DATE_SIGNED", CommonUtil.toString(dateSigned));
	}

	public String getHecsDebt() {
		return hecsDebt;
	}

	public void setHecsDebt(String hecsDebt) throws Exception {
		this.hecsDebt = hecsDebt;
		setValueFromAccessor("HECS_DEBT", hecsDebt);
	}

	public double getPayerId() {
		return payerId;
	}

	public void setPayerId(double payerId) throws Exception {
		this.payerId = payerId;
		setValueFromAccessor("PAYER_ID", CommonUtil.toString(payerId));
	}

	public String getPaymentBasis() {
		return paymentBasis;
	}

	public void setPaymentBasis(String paymentBasis) throws Exception {
		this.paymentBasis = paymentBasis;
		setValueFromAccessor("PAYMENT_BASIS", paymentBasis);
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getSignaturePresent() {
		return signaturePresent;
	}

	public void setSignaturePresent(String signaturePresent) throws Exception {
		this.signaturePresent = signaturePresent;
		setValueFromAccessor("SIGNATURE_PRESENT", signaturePresent);
	}

	public String getTaxfreeThresholdClaimed() {
		return taxfreeThresholdClaimed;
	}

	public void setTaxfreeThresholdClaimed(String taxfreeThresholdClaimed) throws Exception {
		this.taxfreeThresholdClaimed = taxfreeThresholdClaimed;
		setValueFromAccessor("TAXFREE_THRESHOLD_CLAIMED", taxfreeThresholdClaimed);
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) throws Exception {
		this.addressLine1 = addressLine1;
		setValueFromAccessor("ADDRESS_LINE_1", addressLine1);
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) throws Exception {
		this.addressLine2 = addressLine2;
		setValueFromAccessor("ADDRESS_LINE_2", addressLine2);
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		this.firstName = firstName;
		setValueFromAccessor("FIRST_NAME", firstName);
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
	}

	public String getIsReportable() {
		return isReportable;
	}

	public void setIsReportable(String isReportable) throws Exception {
		this.isReportable = isReportable;
		setValueFromAccessor("IS_REPORTABLE", isReportable);
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

	public String getNoTfnReason() {
		return noTfnReason;
	}

	public void setNoTfnReason(String noTfnReason) throws Exception {
		this.noTfnReason = noTfnReason;
		setValueFromAccessor("NO_TFN_REASON", noTfnReason);
	}

	public String getPayrollIdentifier() {
		return payrollIdentifier;
	}

	public void setPayrollIdentifier(String payrollIdentifier) throws Exception {
		this.payrollIdentifier = payrollIdentifier;
		setValueFromAccessor("PAYROLL_IDENTIFIER", payrollIdentifier);
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) throws Exception {
		this.postCode = postCode;
		setValueFromAccessor("POST_CODE", postCode);
	}

	public String getPreviousFirstName() {
		return previousFirstName;
	}

	public void setPreviousFirstName(String previousFirstName) throws Exception {
		this.previousFirstName = previousFirstName;
		setValueFromAccessor("PREVIOUS_FIRST_NAME", previousFirstName);
	}

	public String getPreviousMiddleName() {
		return previousMiddleName;
	}

	public void setPreviousMiddleName(String previousMiddleName) throws Exception {
		this.previousMiddleName = previousMiddleName;
		setValueFromAccessor("PREVIOUS_MIDDLE_NAME", previousMiddleName);
	}

	public String getPreviousSurname() {
		return previousSurname;
	}

	public void setPreviousSurname(String previousSurname) throws Exception {
		this.previousSurname = previousSurname;
		setValueFromAccessor("PREVIOUS_SURNAME", previousSurname);
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) throws Exception {
		this.primaryEmail = primaryEmail;
		setValueFromAccessor("PRIMARY_EMAIL", primaryEmail);
	}

	public String getSeniorTaxOffsetClaimed() {
		return seniorTaxOffsetClaimed;
	}

	public void setSeniorTaxOffsetClaimed(String seniorTaxOffsetClaimed) throws Exception {
		this.seniorTaxOffsetClaimed = seniorTaxOffsetClaimed;
		setValueFromAccessor("SENIOR_TAX_OFFSET_CLAIMED", seniorTaxOffsetClaimed);
	}

	public String getSfssDebt() {
		return sfssDebt;
	}

	public void setSfssDebt(String sfssDebt) throws Exception {
		this.sfssDebt = sfssDebt;
		setValueFromAccessor("SFSS_DEBT", sfssDebt);
	}

	public String getSpecialRebatesClaimed() {
		return specialRebatesClaimed;
	}

	public void setSpecialRebatesClaimed(String specialRebatesClaimed) throws Exception {
		this.specialRebatesClaimed = specialRebatesClaimed;
		setValueFromAccessor("SPECIAL_REBATES_CLAIMED", specialRebatesClaimed);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) throws Exception {
		this.state = state;
		setValueFromAccessor("STATE", state);
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

	public String getTerminatedIndicator() {
		return terminatedIndicator;
	}

	public void setTerminatedIndicator(String terminatedIndicator) throws Exception {
		this.terminatedIndicator = terminatedIndicator;
		setValueFromAccessor("TERMINATED_INDICATOR", terminatedIndicator);
	}

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) throws Exception {
		this.tfn = tfn;
		setValueFromAccessor("TFN", tfn);
	}

	public double getTfndReportFileId() {
		return tfndReportFileId;
	}

	public void setTfndReportFileId(double tfndReportFileId) throws Exception {
		this.tfndReportFileId = tfndReportFileId;
		setValueFromAccessor("TFND_REPORT_FILE_ID", CommonUtil.toString(tfndReportFileId));
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		this.title = title;
		setValueFromAccessor("TITLE", title);
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

		if (CommonUtil.isInIgnoreCase(columnName, CommonUtil.split(getFrwVarNumberColumn(), ","))) {
			dataType = "Number";
		} else if (CommonUtil.isInIgnoreCase(columnName, CommonUtil.split(getFrwVarDateColumn(), ","))) {
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

		str += "tfndReportPayeeRecordId : "+tfndReportPayeeRecordId+"\n";
		str += "austResident : "+austResident+"\n";
		str += "dateOfBirth : "+dateOfBirth+"\n";
		str += "dateSigned : "+dateSigned+"\n";
		str += "hecsDebt : "+hecsDebt+"\n";
		str += "payerId : "+payerId+"\n";
		str += "paymentBasis : "+paymentBasis+"\n";
		str += "personId : "+personId+"\n";
		str += "signaturePresent : "+signaturePresent+"\n";
		str += "taxfreeThresholdClaimed : "+taxfreeThresholdClaimed+"\n";
		str += "addressLine1 : "+addressLine1+"\n";
		str += "addressLine2 : "+addressLine2+"\n";
		str += "country : "+country+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "firstName : "+firstName+"\n";
		str += "isActive : "+isActive+"\n";
		str += "isReportable : "+isReportable+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "middleName : "+middleName+"\n";
		str += "noTfnReason : "+noTfnReason+"\n";
		str += "payrollIdentifier : "+payrollIdentifier+"\n";
		str += "postCode : "+postCode+"\n";
		str += "previousFirstName : "+previousFirstName+"\n";
		str += "previousMiddleName : "+previousMiddleName+"\n";
		str += "previousSurname : "+previousSurname+"\n";
		str += "primaryEmail : "+primaryEmail+"\n";
		str += "seniorTaxOffsetClaimed : "+seniorTaxOffsetClaimed+"\n";
		str += "sfssDebt : "+sfssDebt+"\n";
		str += "specialRebatesClaimed : "+specialRebatesClaimed+"\n";
		str += "state : "+state+"\n";
		str += "suburb : "+suburb+"\n";
		str += "surname : "+surname+"\n";
		str += "terminatedIndicator : "+terminatedIndicator+"\n";
		str += "tfn : "+tfn+"\n";
		str += "tfndReportFileId : "+tfndReportFileId+"\n";
		str += "title : "+title+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"tfndReportPayeeRecordId\" value=\""+tfndReportPayeeRecordId+"\">";
		str += "<column name=\"austResident\" value=\""+austResident+"\">";
		str += "<column name=\"dateOfBirth\" value=\""+dateOfBirth+"\">";
		str += "<column name=\"dateSigned\" value=\""+dateSigned+"\">";
		str += "<column name=\"hecsDebt\" value=\""+hecsDebt+"\">";
		str += "<column name=\"payerId\" value=\""+payerId+"\">";
		str += "<column name=\"paymentBasis\" value=\""+paymentBasis+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"signaturePresent\" value=\""+signaturePresent+"\">";
		str += "<column name=\"taxfreeThresholdClaimed\" value=\""+taxfreeThresholdClaimed+"\">";
		str += "<column name=\"addressLine1\" value=\""+addressLine1+"\">";
		str += "<column name=\"addressLine2\" value=\""+addressLine2+"\">";
		str += "<column name=\"country\" value=\""+country+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"firstName\" value=\""+firstName+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"isReportable\" value=\""+isReportable+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"middleName\" value=\""+middleName+"\">";
		str += "<column name=\"noTfnReason\" value=\""+noTfnReason+"\">";
		str += "<column name=\"payrollIdentifier\" value=\""+payrollIdentifier+"\">";
		str += "<column name=\"postCode\" value=\""+postCode+"\">";
		str += "<column name=\"previousFirstName\" value=\""+previousFirstName+"\">";
		str += "<column name=\"previousMiddleName\" value=\""+previousMiddleName+"\">";
		str += "<column name=\"previousSurname\" value=\""+previousSurname+"\">";
		str += "<column name=\"primaryEmail\" value=\""+primaryEmail+"\">";
		str += "<column name=\"seniorTaxOffsetClaimed\" value=\""+seniorTaxOffsetClaimed+"\">";
		str += "<column name=\"sfssDebt\" value=\""+sfssDebt+"\">";
		str += "<column name=\"specialRebatesClaimed\" value=\""+specialRebatesClaimed+"\">";
		str += "<column name=\"state\" value=\""+state+"\">";
		str += "<column name=\"suburb\" value=\""+suburb+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"terminatedIndicator\" value=\""+terminatedIndicator+"\">";
		str += "<column name=\"tfn\" value=\""+tfn+"\">";
		str += "<column name=\"tfndReportFileId\" value=\""+tfndReportFileId+"\">";
		str += "<column name=\"title\" value=\""+title+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"tfndReportPayeeRecordId\":\""+tfndReportPayeeRecordId+"\", ";
		str += "\"austResident\":\""+austResident+"\", ";
		str += "\"dateOfBirth\":\""+dateOfBirth+"\", ";
		str += "\"dateSigned\":\""+dateSigned+"\", ";
		str += "\"hecsDebt\":\""+hecsDebt+"\", ";
		str += "\"payerId\":\""+payerId+"\", ";
		str += "\"paymentBasis\":\""+paymentBasis+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"signaturePresent\":\""+signaturePresent+"\", ";
		str += "\"taxfreeThresholdClaimed\":\""+taxfreeThresholdClaimed+"\", ";
		str += "\"addressLine1\":\""+addressLine1+"\", ";
		str += "\"addressLine2\":\""+addressLine2+"\", ";
		str += "\"country\":\""+country+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"firstName\":\""+firstName+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"isReportable\":\""+isReportable+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"middleName\":\""+middleName+"\", ";
		str += "\"noTfnReason\":\""+noTfnReason+"\", ";
		str += "\"payrollIdentifier\":\""+payrollIdentifier+"\", ";
		str += "\"postCode\":\""+postCode+"\", ";
		str += "\"previousFirstName\":\""+previousFirstName+"\", ";
		str += "\"previousMiddleName\":\""+previousMiddleName+"\", ";
		str += "\"previousSurname\":\""+previousSurname+"\", ";
		str += "\"primaryEmail\":\""+primaryEmail+"\", ";
		str += "\"seniorTaxOffsetClaimed\":\""+seniorTaxOffsetClaimed+"\", ";
		str += "\"sfssDebt\":\""+sfssDebt+"\", ";
		str += "\"specialRebatesClaimed\":\""+specialRebatesClaimed+"\", ";
		str += "\"state\":\""+state+"\", ";
		str += "\"suburb\":\""+suburb+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"terminatedIndicator\":\""+terminatedIndicator+"\", ";
		str += "\"tfn\":\""+tfn+"\", ";
		str += "\"tfndReportFileId\":\""+tfndReportFileId+"\", ";
		str += "\"title\":\""+title+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}