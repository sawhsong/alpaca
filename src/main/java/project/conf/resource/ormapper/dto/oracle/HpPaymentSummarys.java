/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_PAYMENT_SUMMARYS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpPaymentSummarys extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double paymentSummaryId;
	private String PAYMENT_SUMMARY_ID;
	private String abn;
	private String ABN;
	private String addressLine;
	private String ADDRESS_LINE;
	private double allowance;
	private String ALLOWANCE;
	private double allowance1;
	private String ALLOWANCE1;
	private String allowance1Desc;
	private String ALLOWANCE1_DESC;
	private double allowance2;
	private String ALLOWANCE2;
	private String allowance2Desc;
	private String ALLOWANCE2_DESC;
	private double allowance3;
	private String ALLOWANCE3;
	private String allowance3Desc;
	private String ALLOWANCE3_DESC;
	private double allowance4;
	private String ALLOWANCE4;
	private String allowance4Desc;
	private String ALLOWANCE4_DESC;
	private String branchNo;
	private String BRANCH_NO;
	private String cdep;
	private String CDEP;
	private String country;
	private String COUNTRY;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date dateOfBirth;
	private String DATE_OF_BIRTH;
	private String emmployeeName;
	private String EMMPLOYEE_NAME;
	private String employeeDeduction;
	private String EMPLOYEE_DEDUCTION;
	private double employeeDeductionAmount;
	private String EMPLOYEE_DEDUCTION_AMOUNT;
	private double empDueFileId;
	private String EMP_DUE_FILE_ID;
	private Date endDate;
	private String END_DATE;
	private String firstGivenName;
	private String FIRST_GIVEN_NAME;
	private double grossPayments;
	private String GROSS_PAYMENTS;
	private String grossPaymentType;
	private String GROSS_PAYMENT_TYPE;
	private String isExemptFromFbt;
	private String IS_EXEMPT_FROM_FBT;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double lumpSumA;
	private String LUMP_SUM_A;
	private double lumpSumB;
	private String LUMP_SUM_B;
	private double lumpSumD;
	private String LUMP_SUM_D;
	private double lumpSumE;
	private String LUMP_SUM_E;
	private double organisationId;
	private String ORGANISATION_ID;
	private double otherIncome;
	private String OTHER_INCOME;
	private String payerName;
	private String PAYER_NAME;
	private double personEoyId;
	private String PERSON_EOY_ID;
	private double personId;
	private String PERSON_ID;
	private String postcode;
	private String POSTCODE;
	private double reportableFbt;
	private String REPORTABLE_FBT;
	private double repEmpSuperCont;
	private String REP_EMP_SUPER_CONT;
	private String secondGivenName;
	private String SECOND_GIVEN_NAME;
	private String sentStatus;
	private String SENT_STATUS;
	private Date servicePeriodEndDate;
	private String SERVICE_PERIOD_END_DATE;
	private Date servicePeriodStartDate;
	private String SERVICE_PERIOD_START_DATE;
	private Date startDate;
	private String START_DATE;
	private String state;
	private String STATE;
	private String suburb;
	private String SUBURB;
	private String surname;
	private String SURNAME;
	private String tfn;
	private String TFN;
	private double totalTaxWithheld;
	private String TOTAL_TAX_WITHHELD;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpPaymentSummarys() throws Exception {
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
		setFrwVarPrimaryKey("PAYMENT_SUMMARY_ID");
		setFrwVarDateColumn("CREATION_DATE,DATE_OF_BIRTH,END_DATE,LAST_UPDATE_DATE,SERVICE_PERIOD_END_DATE,SERVICE_PERIOD_START_DATE,START_DATE");
		setFrwVarNumberColumn("PAYMENT_SUMMARY_ID,ALLOWANCE,ALLOWANCE1,ALLOWANCE2,ALLOWANCE3,ALLOWANCE4,CREATED_BY,EMPLOYEE_DEDUCTION_AMOUNT,EMP_DUE_FILE_ID,GROSS_PAYMENTS,LAST_UPDATED_BY,LUMP_SUM_A,LUMP_SUM_B,LUMP_SUM_D,LUMP_SUM_E,ORGANISATION_ID,OTHER_INCOME,PERSON_EOY_ID,PERSON_ID,REPORTABLE_FBT,REP_EMP_SUPER_CONT,TOTAL_TAX_WITHHELD");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPaymentSummaryId() {
		return paymentSummaryId;
	}

	public void setPaymentSummaryId(double paymentSummaryId) throws Exception {
		this.paymentSummaryId = paymentSummaryId;
		setValueFromAccessor("PAYMENT_SUMMARY_ID", CommonUtil.toString(paymentSummaryId));
	}

	public String getAbn() {
		return abn;
	}

	public void setAbn(String abn) throws Exception {
		this.abn = abn;
		setValueFromAccessor("ABN", abn);
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) throws Exception {
		this.addressLine = addressLine;
		setValueFromAccessor("ADDRESS_LINE", addressLine);
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) throws Exception {
		this.allowance = allowance;
		setValueFromAccessor("ALLOWANCE", CommonUtil.toString(allowance));
	}

	public double getAllowance1() {
		return allowance1;
	}

	public void setAllowance1(double allowance1) throws Exception {
		this.allowance1 = allowance1;
		setValueFromAccessor("ALLOWANCE1", CommonUtil.toString(allowance1));
	}

	public String getAllowance1Desc() {
		return allowance1Desc;
	}

	public void setAllowance1Desc(String allowance1Desc) throws Exception {
		this.allowance1Desc = allowance1Desc;
		setValueFromAccessor("ALLOWANCE1_DESC", allowance1Desc);
	}

	public double getAllowance2() {
		return allowance2;
	}

	public void setAllowance2(double allowance2) throws Exception {
		this.allowance2 = allowance2;
		setValueFromAccessor("ALLOWANCE2", CommonUtil.toString(allowance2));
	}

	public String getAllowance2Desc() {
		return allowance2Desc;
	}

	public void setAllowance2Desc(String allowance2Desc) throws Exception {
		this.allowance2Desc = allowance2Desc;
		setValueFromAccessor("ALLOWANCE2_DESC", allowance2Desc);
	}

	public double getAllowance3() {
		return allowance3;
	}

	public void setAllowance3(double allowance3) throws Exception {
		this.allowance3 = allowance3;
		setValueFromAccessor("ALLOWANCE3", CommonUtil.toString(allowance3));
	}

	public String getAllowance3Desc() {
		return allowance3Desc;
	}

	public void setAllowance3Desc(String allowance3Desc) throws Exception {
		this.allowance3Desc = allowance3Desc;
		setValueFromAccessor("ALLOWANCE3_DESC", allowance3Desc);
	}

	public double getAllowance4() {
		return allowance4;
	}

	public void setAllowance4(double allowance4) throws Exception {
		this.allowance4 = allowance4;
		setValueFromAccessor("ALLOWANCE4", CommonUtil.toString(allowance4));
	}

	public String getAllowance4Desc() {
		return allowance4Desc;
	}

	public void setAllowance4Desc(String allowance4Desc) throws Exception {
		this.allowance4Desc = allowance4Desc;
		setValueFromAccessor("ALLOWANCE4_DESC", allowance4Desc);
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) throws Exception {
		this.branchNo = branchNo;
		setValueFromAccessor("BRANCH_NO", branchNo);
	}

	public String getCdep() {
		return cdep;
	}

	public void setCdep(String cdep) throws Exception {
		this.cdep = cdep;
		setValueFromAccessor("CDEP", cdep);
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) throws Exception {
		this.dateOfBirth = dateOfBirth;
		setValueFromAccessor("DATE_OF_BIRTH", CommonUtil.toString(dateOfBirth));
	}

	public String getEmmployeeName() {
		return emmployeeName;
	}

	public void setEmmployeeName(String emmployeeName) throws Exception {
		this.emmployeeName = emmployeeName;
		setValueFromAccessor("EMMPLOYEE_NAME", emmployeeName);
	}

	public String getEmployeeDeduction() {
		return employeeDeduction;
	}

	public void setEmployeeDeduction(String employeeDeduction) throws Exception {
		this.employeeDeduction = employeeDeduction;
		setValueFromAccessor("EMPLOYEE_DEDUCTION", employeeDeduction);
	}

	public double getEmployeeDeductionAmount() {
		return employeeDeductionAmount;
	}

	public void setEmployeeDeductionAmount(double employeeDeductionAmount) throws Exception {
		this.employeeDeductionAmount = employeeDeductionAmount;
		setValueFromAccessor("EMPLOYEE_DEDUCTION_AMOUNT", CommonUtil.toString(employeeDeductionAmount));
	}

	public double getEmpDueFileId() {
		return empDueFileId;
	}

	public void setEmpDueFileId(double empDueFileId) throws Exception {
		this.empDueFileId = empDueFileId;
		setValueFromAccessor("EMP_DUE_FILE_ID", CommonUtil.toString(empDueFileId));
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) throws Exception {
		this.endDate = endDate;
		setValueFromAccessor("END_DATE", CommonUtil.toString(endDate));
	}

	public String getFirstGivenName() {
		return firstGivenName;
	}

	public void setFirstGivenName(String firstGivenName) throws Exception {
		this.firstGivenName = firstGivenName;
		setValueFromAccessor("FIRST_GIVEN_NAME", firstGivenName);
	}

	public double getGrossPayments() {
		return grossPayments;
	}

	public void setGrossPayments(double grossPayments) throws Exception {
		this.grossPayments = grossPayments;
		setValueFromAccessor("GROSS_PAYMENTS", CommonUtil.toString(grossPayments));
	}

	public String getGrossPaymentType() {
		return grossPaymentType;
	}

	public void setGrossPaymentType(String grossPaymentType) throws Exception {
		this.grossPaymentType = grossPaymentType;
		setValueFromAccessor("GROSS_PAYMENT_TYPE", grossPaymentType);
	}

	public String getIsExemptFromFbt() {
		return isExemptFromFbt;
	}

	public void setIsExemptFromFbt(String isExemptFromFbt) throws Exception {
		this.isExemptFromFbt = isExemptFromFbt;
		setValueFromAccessor("IS_EXEMPT_FROM_FBT", isExemptFromFbt);
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

	public double getLumpSumA() {
		return lumpSumA;
	}

	public void setLumpSumA(double lumpSumA) throws Exception {
		this.lumpSumA = lumpSumA;
		setValueFromAccessor("LUMP_SUM_A", CommonUtil.toString(lumpSumA));
	}

	public double getLumpSumB() {
		return lumpSumB;
	}

	public void setLumpSumB(double lumpSumB) throws Exception {
		this.lumpSumB = lumpSumB;
		setValueFromAccessor("LUMP_SUM_B", CommonUtil.toString(lumpSumB));
	}

	public double getLumpSumD() {
		return lumpSumD;
	}

	public void setLumpSumD(double lumpSumD) throws Exception {
		this.lumpSumD = lumpSumD;
		setValueFromAccessor("LUMP_SUM_D", CommonUtil.toString(lumpSumD));
	}

	public double getLumpSumE() {
		return lumpSumE;
	}

	public void setLumpSumE(double lumpSumE) throws Exception {
		this.lumpSumE = lumpSumE;
		setValueFromAccessor("LUMP_SUM_E", CommonUtil.toString(lumpSumE));
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public double getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(double otherIncome) throws Exception {
		this.otherIncome = otherIncome;
		setValueFromAccessor("OTHER_INCOME", CommonUtil.toString(otherIncome));
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) throws Exception {
		this.payerName = payerName;
		setValueFromAccessor("PAYER_NAME", payerName);
	}

	public double getPersonEoyId() {
		return personEoyId;
	}

	public void setPersonEoyId(double personEoyId) throws Exception {
		this.personEoyId = personEoyId;
		setValueFromAccessor("PERSON_EOY_ID", CommonUtil.toString(personEoyId));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) throws Exception {
		this.postcode = postcode;
		setValueFromAccessor("POSTCODE", postcode);
	}

	public double getReportableFbt() {
		return reportableFbt;
	}

	public void setReportableFbt(double reportableFbt) throws Exception {
		this.reportableFbt = reportableFbt;
		setValueFromAccessor("REPORTABLE_FBT", CommonUtil.toString(reportableFbt));
	}

	public double getRepEmpSuperCont() {
		return repEmpSuperCont;
	}

	public void setRepEmpSuperCont(double repEmpSuperCont) throws Exception {
		this.repEmpSuperCont = repEmpSuperCont;
		setValueFromAccessor("REP_EMP_SUPER_CONT", CommonUtil.toString(repEmpSuperCont));
	}

	public String getSecondGivenName() {
		return secondGivenName;
	}

	public void setSecondGivenName(String secondGivenName) throws Exception {
		this.secondGivenName = secondGivenName;
		setValueFromAccessor("SECOND_GIVEN_NAME", secondGivenName);
	}

	public String getSentStatus() {
		return sentStatus;
	}

	public void setSentStatus(String sentStatus) throws Exception {
		this.sentStatus = sentStatus;
		setValueFromAccessor("SENT_STATUS", sentStatus);
	}

	public Date getServicePeriodEndDate() {
		return servicePeriodEndDate;
	}

	public void setServicePeriodEndDate(Date servicePeriodEndDate) throws Exception {
		this.servicePeriodEndDate = servicePeriodEndDate;
		setValueFromAccessor("SERVICE_PERIOD_END_DATE", CommonUtil.toString(servicePeriodEndDate));
	}

	public Date getServicePeriodStartDate() {
		return servicePeriodStartDate;
	}

	public void setServicePeriodStartDate(Date servicePeriodStartDate) throws Exception {
		this.servicePeriodStartDate = servicePeriodStartDate;
		setValueFromAccessor("SERVICE_PERIOD_START_DATE", CommonUtil.toString(servicePeriodStartDate));
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws Exception {
		this.startDate = startDate;
		setValueFromAccessor("START_DATE", CommonUtil.toString(startDate));
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

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) throws Exception {
		this.tfn = tfn;
		setValueFromAccessor("TFN", tfn);
	}

	public double getTotalTaxWithheld() {
		return totalTaxWithheld;
	}

	public void setTotalTaxWithheld(double totalTaxWithheld) throws Exception {
		this.totalTaxWithheld = totalTaxWithheld;
		setValueFromAccessor("TOTAL_TAX_WITHHELD", CommonUtil.toString(totalTaxWithheld));
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

		str += "paymentSummaryId : "+paymentSummaryId+"\n";
		str += "abn : "+abn+"\n";
		str += "addressLine : "+addressLine+"\n";
		str += "allowance : "+allowance+"\n";
		str += "allowance1 : "+allowance1+"\n";
		str += "allowance1Desc : "+allowance1Desc+"\n";
		str += "allowance2 : "+allowance2+"\n";
		str += "allowance2Desc : "+allowance2Desc+"\n";
		str += "allowance3 : "+allowance3+"\n";
		str += "allowance3Desc : "+allowance3Desc+"\n";
		str += "allowance4 : "+allowance4+"\n";
		str += "allowance4Desc : "+allowance4Desc+"\n";
		str += "branchNo : "+branchNo+"\n";
		str += "cdep : "+cdep+"\n";
		str += "country : "+country+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "dateOfBirth : "+dateOfBirth+"\n";
		str += "emmployeeName : "+emmployeeName+"\n";
		str += "employeeDeduction : "+employeeDeduction+"\n";
		str += "employeeDeductionAmount : "+employeeDeductionAmount+"\n";
		str += "empDueFileId : "+empDueFileId+"\n";
		str += "endDate : "+endDate+"\n";
		str += "firstGivenName : "+firstGivenName+"\n";
		str += "grossPayments : "+grossPayments+"\n";
		str += "grossPaymentType : "+grossPaymentType+"\n";
		str += "isExemptFromFbt : "+isExemptFromFbt+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "lumpSumA : "+lumpSumA+"\n";
		str += "lumpSumB : "+lumpSumB+"\n";
		str += "lumpSumD : "+lumpSumD+"\n";
		str += "lumpSumE : "+lumpSumE+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "otherIncome : "+otherIncome+"\n";
		str += "payerName : "+payerName+"\n";
		str += "personEoyId : "+personEoyId+"\n";
		str += "personId : "+personId+"\n";
		str += "postcode : "+postcode+"\n";
		str += "reportableFbt : "+reportableFbt+"\n";
		str += "repEmpSuperCont : "+repEmpSuperCont+"\n";
		str += "secondGivenName : "+secondGivenName+"\n";
		str += "sentStatus : "+sentStatus+"\n";
		str += "servicePeriodEndDate : "+servicePeriodEndDate+"\n";
		str += "servicePeriodStartDate : "+servicePeriodStartDate+"\n";
		str += "startDate : "+startDate+"\n";
		str += "state : "+state+"\n";
		str += "suburb : "+suburb+"\n";
		str += "surname : "+surname+"\n";
		str += "tfn : "+tfn+"\n";
		str += "totalTaxWithheld : "+totalTaxWithheld+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"paymentSummaryId\" value=\""+paymentSummaryId+"\">";
		str += "<column name=\"abn\" value=\""+abn+"\">";
		str += "<column name=\"addressLine\" value=\""+addressLine+"\">";
		str += "<column name=\"allowance\" value=\""+allowance+"\">";
		str += "<column name=\"allowance1\" value=\""+allowance1+"\">";
		str += "<column name=\"allowance1Desc\" value=\""+allowance1Desc+"\">";
		str += "<column name=\"allowance2\" value=\""+allowance2+"\">";
		str += "<column name=\"allowance2Desc\" value=\""+allowance2Desc+"\">";
		str += "<column name=\"allowance3\" value=\""+allowance3+"\">";
		str += "<column name=\"allowance3Desc\" value=\""+allowance3Desc+"\">";
		str += "<column name=\"allowance4\" value=\""+allowance4+"\">";
		str += "<column name=\"allowance4Desc\" value=\""+allowance4Desc+"\">";
		str += "<column name=\"branchNo\" value=\""+branchNo+"\">";
		str += "<column name=\"cdep\" value=\""+cdep+"\">";
		str += "<column name=\"country\" value=\""+country+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"dateOfBirth\" value=\""+dateOfBirth+"\">";
		str += "<column name=\"emmployeeName\" value=\""+emmployeeName+"\">";
		str += "<column name=\"employeeDeduction\" value=\""+employeeDeduction+"\">";
		str += "<column name=\"employeeDeductionAmount\" value=\""+employeeDeductionAmount+"\">";
		str += "<column name=\"empDueFileId\" value=\""+empDueFileId+"\">";
		str += "<column name=\"endDate\" value=\""+endDate+"\">";
		str += "<column name=\"firstGivenName\" value=\""+firstGivenName+"\">";
		str += "<column name=\"grossPayments\" value=\""+grossPayments+"\">";
		str += "<column name=\"grossPaymentType\" value=\""+grossPaymentType+"\">";
		str += "<column name=\"isExemptFromFbt\" value=\""+isExemptFromFbt+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"lumpSumA\" value=\""+lumpSumA+"\">";
		str += "<column name=\"lumpSumB\" value=\""+lumpSumB+"\">";
		str += "<column name=\"lumpSumD\" value=\""+lumpSumD+"\">";
		str += "<column name=\"lumpSumE\" value=\""+lumpSumE+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"otherIncome\" value=\""+otherIncome+"\">";
		str += "<column name=\"payerName\" value=\""+payerName+"\">";
		str += "<column name=\"personEoyId\" value=\""+personEoyId+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"postcode\" value=\""+postcode+"\">";
		str += "<column name=\"reportableFbt\" value=\""+reportableFbt+"\">";
		str += "<column name=\"repEmpSuperCont\" value=\""+repEmpSuperCont+"\">";
		str += "<column name=\"secondGivenName\" value=\""+secondGivenName+"\">";
		str += "<column name=\"sentStatus\" value=\""+sentStatus+"\">";
		str += "<column name=\"servicePeriodEndDate\" value=\""+servicePeriodEndDate+"\">";
		str += "<column name=\"servicePeriodStartDate\" value=\""+servicePeriodStartDate+"\">";
		str += "<column name=\"startDate\" value=\""+startDate+"\">";
		str += "<column name=\"state\" value=\""+state+"\">";
		str += "<column name=\"suburb\" value=\""+suburb+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"tfn\" value=\""+tfn+"\">";
		str += "<column name=\"totalTaxWithheld\" value=\""+totalTaxWithheld+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"paymentSummaryId\":\""+paymentSummaryId+"\", ";
		str += "\"abn\":\""+abn+"\", ";
		str += "\"addressLine\":\""+addressLine+"\", ";
		str += "\"allowance\":\""+allowance+"\", ";
		str += "\"allowance1\":\""+allowance1+"\", ";
		str += "\"allowance1Desc\":\""+allowance1Desc+"\", ";
		str += "\"allowance2\":\""+allowance2+"\", ";
		str += "\"allowance2Desc\":\""+allowance2Desc+"\", ";
		str += "\"allowance3\":\""+allowance3+"\", ";
		str += "\"allowance3Desc\":\""+allowance3Desc+"\", ";
		str += "\"allowance4\":\""+allowance4+"\", ";
		str += "\"allowance4Desc\":\""+allowance4Desc+"\", ";
		str += "\"branchNo\":\""+branchNo+"\", ";
		str += "\"cdep\":\""+cdep+"\", ";
		str += "\"country\":\""+country+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"dateOfBirth\":\""+dateOfBirth+"\", ";
		str += "\"emmployeeName\":\""+emmployeeName+"\", ";
		str += "\"employeeDeduction\":\""+employeeDeduction+"\", ";
		str += "\"employeeDeductionAmount\":\""+employeeDeductionAmount+"\", ";
		str += "\"empDueFileId\":\""+empDueFileId+"\", ";
		str += "\"endDate\":\""+endDate+"\", ";
		str += "\"firstGivenName\":\""+firstGivenName+"\", ";
		str += "\"grossPayments\":\""+grossPayments+"\", ";
		str += "\"grossPaymentType\":\""+grossPaymentType+"\", ";
		str += "\"isExemptFromFbt\":\""+isExemptFromFbt+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"lumpSumA\":\""+lumpSumA+"\", ";
		str += "\"lumpSumB\":\""+lumpSumB+"\", ";
		str += "\"lumpSumD\":\""+lumpSumD+"\", ";
		str += "\"lumpSumE\":\""+lumpSumE+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"otherIncome\":\""+otherIncome+"\", ";
		str += "\"payerName\":\""+payerName+"\", ";
		str += "\"personEoyId\":\""+personEoyId+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"postcode\":\""+postcode+"\", ";
		str += "\"reportableFbt\":\""+reportableFbt+"\", ";
		str += "\"repEmpSuperCont\":\""+repEmpSuperCont+"\", ";
		str += "\"secondGivenName\":\""+secondGivenName+"\", ";
		str += "\"sentStatus\":\""+sentStatus+"\", ";
		str += "\"servicePeriodEndDate\":\""+servicePeriodEndDate+"\", ";
		str += "\"servicePeriodStartDate\":\""+servicePeriodStartDate+"\", ";
		str += "\"startDate\":\""+startDate+"\", ";
		str += "\"state\":\""+state+"\", ";
		str += "\"suburb\":\""+suburb+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"tfn\":\""+tfn+"\", ";
		str += "\"totalTaxWithheld\":\""+totalTaxWithheld+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}