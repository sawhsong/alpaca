/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_ETP_SUMMARYS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpEtpSummarys extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double etpSummaryId;
	private String ETP_SUMMARY_ID;
	private String abn;
	private String ABN;
	private double assessableAmount;
	private String ASSESSABLE_AMOUNT;
	private String authorizedPerson;
	private String AUTHORIZED_PERSON;
	private String branchNo;
	private String BRANCH_NO;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date dateOfBirth;
	private String DATE_OF_BIRTH;
	private Date dateOfPayment;
	private String DATE_OF_PAYMENT;
	private String deathBenefit;
	private String DEATH_BENEFIT;
	private String emmployeeName;
	private String EMMPLOYEE_NAME;
	private double empDueFileId;
	private String EMP_DUE_FILE_ID;
	private Date endDate;
	private String END_DATE;
	private double gross;
	private String GROSS;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdatedDate;
	private String LAST_UPDATED_DATE;
	private String noDayAfter30Jun83;
	private String NO_DAY_AFTER_30_JUN_83;
	private String noDayBefore1Jul83;
	private String NO_DAY_BEFORE_1_JUL_83;
	private double organisationId;
	private String ORGANISATION_ID;
	private String orgPhone1;
	private String ORG_PHONE1;
	private String orgPostCode;
	private String ORG_POST_CODE;
	private String orgState;
	private String ORG_STATE;
	private String payeesAddressLine;
	private String PAYEES_ADDRESS_LINE;
	private String payeesPincode;
	private String PAYEES_PINCODE;
	private String payeesState;
	private String PAYEES_STATE;
	private String payeesSuburb;
	private String PAYEES_SUBURB;
	private String payersAddressLine;
	private String PAYERS_ADDRESS_LINE;
	private String payersSuburb;
	private String PAYERS_SUBURB;
	private String payerName;
	private String PAYER_NAME;
	private double personEoyId;
	private String PERSON_EOY_ID;
	private double personId;
	private String PERSON_ID;
	private String postJun1983TaxComponent;
	private String POST_JUN_1983_TAX_COMPONENT;
	private String postJun1983UntaxComponent;
	private String POST_JUN_1983_UNTAX_COMPONENT;
	private String postJun1994InvalComponent;
	private String POST_JUN_1994_INVAL_COMPONENT;
	private String preJuly1983Component;
	private String PRE_JULY_1983_COMPONENT;
	private Date serviceStartDate;
	private String SERVICE_START_DATE;
	private Date startDate;
	private String START_DATE;
	private double taxWithheld;
	private String TAX_WITHHELD;
	private String tfn;
	private String TFN;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpEtpSummarys() throws Exception {
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
		setFrwVarPrimaryKey("");
		setFrwVarDateColumn("CREATION_DATE,DATE_OF_BIRTH,DATE_OF_PAYMENT,END_DATE,LAST_UPDATED_DATE,SERVICE_START_DATE,START_DATE");
		setFrwVarNumberColumn("ETP_SUMMARY_ID,ASSESSABLE_AMOUNT,CREATED_BY,EMP_DUE_FILE_ID,GROSS,LAST_UPDATED_BY,ORGANISATION_ID,PERSON_EOY_ID,PERSON_ID,TAX_WITHHELD");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getEtpSummaryId() {
		return etpSummaryId;
	}

	public void setEtpSummaryId(double etpSummaryId) throws Exception {
		this.etpSummaryId = etpSummaryId;
		setValueFromAccessor("ETP_SUMMARY_ID", CommonUtil.toString(etpSummaryId));
	}

	public String getAbn() {
		return abn;
	}

	public void setAbn(String abn) throws Exception {
		this.abn = abn;
		setValueFromAccessor("ABN", abn);
	}

	public double getAssessableAmount() {
		return assessableAmount;
	}

	public void setAssessableAmount(double assessableAmount) throws Exception {
		this.assessableAmount = assessableAmount;
		setValueFromAccessor("ASSESSABLE_AMOUNT", CommonUtil.toString(assessableAmount));
	}

	public String getAuthorizedPerson() {
		return authorizedPerson;
	}

	public void setAuthorizedPerson(String authorizedPerson) throws Exception {
		this.authorizedPerson = authorizedPerson;
		setValueFromAccessor("AUTHORIZED_PERSON", authorizedPerson);
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) throws Exception {
		this.branchNo = branchNo;
		setValueFromAccessor("BRANCH_NO", branchNo);
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

	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) throws Exception {
		this.dateOfPayment = dateOfPayment;
		setValueFromAccessor("DATE_OF_PAYMENT", CommonUtil.toString(dateOfPayment));
	}

	public String getDeathBenefit() {
		return deathBenefit;
	}

	public void setDeathBenefit(String deathBenefit) throws Exception {
		this.deathBenefit = deathBenefit;
		setValueFromAccessor("DEATH_BENEFIT", deathBenefit);
	}

	public String getEmmployeeName() {
		return emmployeeName;
	}

	public void setEmmployeeName(String emmployeeName) throws Exception {
		this.emmployeeName = emmployeeName;
		setValueFromAccessor("EMMPLOYEE_NAME", emmployeeName);
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

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) throws Exception {
		this.gross = gross;
		setValueFromAccessor("GROSS", CommonUtil.toString(gross));
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

	public String getNoDayAfter30Jun83() {
		return noDayAfter30Jun83;
	}

	public void setNoDayAfter30Jun83(String noDayAfter30Jun83) throws Exception {
		this.noDayAfter30Jun83 = noDayAfter30Jun83;
		setValueFromAccessor("NO_DAY_AFTER_30_JUN_83", noDayAfter30Jun83);
	}

	public String getNoDayBefore1Jul83() {
		return noDayBefore1Jul83;
	}

	public void setNoDayBefore1Jul83(String noDayBefore1Jul83) throws Exception {
		this.noDayBefore1Jul83 = noDayBefore1Jul83;
		setValueFromAccessor("NO_DAY_BEFORE_1_JUL_83", noDayBefore1Jul83);
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public String getOrgPhone1() {
		return orgPhone1;
	}

	public void setOrgPhone1(String orgPhone1) throws Exception {
		this.orgPhone1 = orgPhone1;
		setValueFromAccessor("ORG_PHONE1", orgPhone1);
	}

	public String getOrgPostCode() {
		return orgPostCode;
	}

	public void setOrgPostCode(String orgPostCode) throws Exception {
		this.orgPostCode = orgPostCode;
		setValueFromAccessor("ORG_POST_CODE", orgPostCode);
	}

	public String getOrgState() {
		return orgState;
	}

	public void setOrgState(String orgState) throws Exception {
		this.orgState = orgState;
		setValueFromAccessor("ORG_STATE", orgState);
	}

	public String getPayeesAddressLine() {
		return payeesAddressLine;
	}

	public void setPayeesAddressLine(String payeesAddressLine) throws Exception {
		this.payeesAddressLine = payeesAddressLine;
		setValueFromAccessor("PAYEES_ADDRESS_LINE", payeesAddressLine);
	}

	public String getPayeesPincode() {
		return payeesPincode;
	}

	public void setPayeesPincode(String payeesPincode) throws Exception {
		this.payeesPincode = payeesPincode;
		setValueFromAccessor("PAYEES_PINCODE", payeesPincode);
	}

	public String getPayeesState() {
		return payeesState;
	}

	public void setPayeesState(String payeesState) throws Exception {
		this.payeesState = payeesState;
		setValueFromAccessor("PAYEES_STATE", payeesState);
	}

	public String getPayeesSuburb() {
		return payeesSuburb;
	}

	public void setPayeesSuburb(String payeesSuburb) throws Exception {
		this.payeesSuburb = payeesSuburb;
		setValueFromAccessor("PAYEES_SUBURB", payeesSuburb);
	}

	public String getPayersAddressLine() {
		return payersAddressLine;
	}

	public void setPayersAddressLine(String payersAddressLine) throws Exception {
		this.payersAddressLine = payersAddressLine;
		setValueFromAccessor("PAYERS_ADDRESS_LINE", payersAddressLine);
	}

	public String getPayersSuburb() {
		return payersSuburb;
	}

	public void setPayersSuburb(String payersSuburb) throws Exception {
		this.payersSuburb = payersSuburb;
		setValueFromAccessor("PAYERS_SUBURB", payersSuburb);
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

	public String getPostJun1983TaxComponent() {
		return postJun1983TaxComponent;
	}

	public void setPostJun1983TaxComponent(String postJun1983TaxComponent) throws Exception {
		this.postJun1983TaxComponent = postJun1983TaxComponent;
		setValueFromAccessor("POST_JUN_1983_TAX_COMPONENT", postJun1983TaxComponent);
	}

	public String getPostJun1983UntaxComponent() {
		return postJun1983UntaxComponent;
	}

	public void setPostJun1983UntaxComponent(String postJun1983UntaxComponent) throws Exception {
		this.postJun1983UntaxComponent = postJun1983UntaxComponent;
		setValueFromAccessor("POST_JUN_1983_UNTAX_COMPONENT", postJun1983UntaxComponent);
	}

	public String getPostJun1994InvalComponent() {
		return postJun1994InvalComponent;
	}

	public void setPostJun1994InvalComponent(String postJun1994InvalComponent) throws Exception {
		this.postJun1994InvalComponent = postJun1994InvalComponent;
		setValueFromAccessor("POST_JUN_1994_INVAL_COMPONENT", postJun1994InvalComponent);
	}

	public String getPreJuly1983Component() {
		return preJuly1983Component;
	}

	public void setPreJuly1983Component(String preJuly1983Component) throws Exception {
		this.preJuly1983Component = preJuly1983Component;
		setValueFromAccessor("PRE_JULY_1983_COMPONENT", preJuly1983Component);
	}

	public Date getServiceStartDate() {
		return serviceStartDate;
	}

	public void setServiceStartDate(Date serviceStartDate) throws Exception {
		this.serviceStartDate = serviceStartDate;
		setValueFromAccessor("SERVICE_START_DATE", CommonUtil.toString(serviceStartDate));
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws Exception {
		this.startDate = startDate;
		setValueFromAccessor("START_DATE", CommonUtil.toString(startDate));
	}

	public double getTaxWithheld() {
		return taxWithheld;
	}

	public void setTaxWithheld(double taxWithheld) throws Exception {
		this.taxWithheld = taxWithheld;
		setValueFromAccessor("TAX_WITHHELD", CommonUtil.toString(taxWithheld));
	}

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) throws Exception {
		this.tfn = tfn;
		setValueFromAccessor("TFN", tfn);
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

		str += "etpSummaryId : "+etpSummaryId+"\n";
		str += "abn : "+abn+"\n";
		str += "assessableAmount : "+assessableAmount+"\n";
		str += "authorizedPerson : "+authorizedPerson+"\n";
		str += "branchNo : "+branchNo+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "dateOfBirth : "+dateOfBirth+"\n";
		str += "dateOfPayment : "+dateOfPayment+"\n";
		str += "deathBenefit : "+deathBenefit+"\n";
		str += "emmployeeName : "+emmployeeName+"\n";
		str += "empDueFileId : "+empDueFileId+"\n";
		str += "endDate : "+endDate+"\n";
		str += "gross : "+gross+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdatedDate : "+lastUpdatedDate+"\n";
		str += "noDayAfter30Jun83 : "+noDayAfter30Jun83+"\n";
		str += "noDayBefore1Jul83 : "+noDayBefore1Jul83+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "orgPhone1 : "+orgPhone1+"\n";
		str += "orgPostCode : "+orgPostCode+"\n";
		str += "orgState : "+orgState+"\n";
		str += "payeesAddressLine : "+payeesAddressLine+"\n";
		str += "payeesPincode : "+payeesPincode+"\n";
		str += "payeesState : "+payeesState+"\n";
		str += "payeesSuburb : "+payeesSuburb+"\n";
		str += "payersAddressLine : "+payersAddressLine+"\n";
		str += "payersSuburb : "+payersSuburb+"\n";
		str += "payerName : "+payerName+"\n";
		str += "personEoyId : "+personEoyId+"\n";
		str += "personId : "+personId+"\n";
		str += "postJun1983TaxComponent : "+postJun1983TaxComponent+"\n";
		str += "postJun1983UntaxComponent : "+postJun1983UntaxComponent+"\n";
		str += "postJun1994InvalComponent : "+postJun1994InvalComponent+"\n";
		str += "preJuly1983Component : "+preJuly1983Component+"\n";
		str += "serviceStartDate : "+serviceStartDate+"\n";
		str += "startDate : "+startDate+"\n";
		str += "taxWithheld : "+taxWithheld+"\n";
		str += "tfn : "+tfn+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"etpSummaryId\" value=\""+etpSummaryId+"\">";
		str += "<column name=\"abn\" value=\""+abn+"\">";
		str += "<column name=\"assessableAmount\" value=\""+assessableAmount+"\">";
		str += "<column name=\"authorizedPerson\" value=\""+authorizedPerson+"\">";
		str += "<column name=\"branchNo\" value=\""+branchNo+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"dateOfBirth\" value=\""+dateOfBirth+"\">";
		str += "<column name=\"dateOfPayment\" value=\""+dateOfPayment+"\">";
		str += "<column name=\"deathBenefit\" value=\""+deathBenefit+"\">";
		str += "<column name=\"emmployeeName\" value=\""+emmployeeName+"\">";
		str += "<column name=\"empDueFileId\" value=\""+empDueFileId+"\">";
		str += "<column name=\"endDate\" value=\""+endDate+"\">";
		str += "<column name=\"gross\" value=\""+gross+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdatedDate\" value=\""+lastUpdatedDate+"\">";
		str += "<column name=\"noDayAfter30Jun83\" value=\""+noDayAfter30Jun83+"\">";
		str += "<column name=\"noDayBefore1Jul83\" value=\""+noDayBefore1Jul83+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"orgPhone1\" value=\""+orgPhone1+"\">";
		str += "<column name=\"orgPostCode\" value=\""+orgPostCode+"\">";
		str += "<column name=\"orgState\" value=\""+orgState+"\">";
		str += "<column name=\"payeesAddressLine\" value=\""+payeesAddressLine+"\">";
		str += "<column name=\"payeesPincode\" value=\""+payeesPincode+"\">";
		str += "<column name=\"payeesState\" value=\""+payeesState+"\">";
		str += "<column name=\"payeesSuburb\" value=\""+payeesSuburb+"\">";
		str += "<column name=\"payersAddressLine\" value=\""+payersAddressLine+"\">";
		str += "<column name=\"payersSuburb\" value=\""+payersSuburb+"\">";
		str += "<column name=\"payerName\" value=\""+payerName+"\">";
		str += "<column name=\"personEoyId\" value=\""+personEoyId+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"postJun1983TaxComponent\" value=\""+postJun1983TaxComponent+"\">";
		str += "<column name=\"postJun1983UntaxComponent\" value=\""+postJun1983UntaxComponent+"\">";
		str += "<column name=\"postJun1994InvalComponent\" value=\""+postJun1994InvalComponent+"\">";
		str += "<column name=\"preJuly1983Component\" value=\""+preJuly1983Component+"\">";
		str += "<column name=\"serviceStartDate\" value=\""+serviceStartDate+"\">";
		str += "<column name=\"startDate\" value=\""+startDate+"\">";
		str += "<column name=\"taxWithheld\" value=\""+taxWithheld+"\">";
		str += "<column name=\"tfn\" value=\""+tfn+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"etpSummaryId\":\""+etpSummaryId+"\", ";
		str += "\"abn\":\""+abn+"\", ";
		str += "\"assessableAmount\":\""+assessableAmount+"\", ";
		str += "\"authorizedPerson\":\""+authorizedPerson+"\", ";
		str += "\"branchNo\":\""+branchNo+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"dateOfBirth\":\""+dateOfBirth+"\", ";
		str += "\"dateOfPayment\":\""+dateOfPayment+"\", ";
		str += "\"deathBenefit\":\""+deathBenefit+"\", ";
		str += "\"emmployeeName\":\""+emmployeeName+"\", ";
		str += "\"empDueFileId\":\""+empDueFileId+"\", ";
		str += "\"endDate\":\""+endDate+"\", ";
		str += "\"gross\":\""+gross+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdatedDate\":\""+lastUpdatedDate+"\", ";
		str += "\"noDayAfter30Jun83\":\""+noDayAfter30Jun83+"\", ";
		str += "\"noDayBefore1Jul83\":\""+noDayBefore1Jul83+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"orgPhone1\":\""+orgPhone1+"\", ";
		str += "\"orgPostCode\":\""+orgPostCode+"\", ";
		str += "\"orgState\":\""+orgState+"\", ";
		str += "\"payeesAddressLine\":\""+payeesAddressLine+"\", ";
		str += "\"payeesPincode\":\""+payeesPincode+"\", ";
		str += "\"payeesState\":\""+payeesState+"\", ";
		str += "\"payeesSuburb\":\""+payeesSuburb+"\", ";
		str += "\"payersAddressLine\":\""+payersAddressLine+"\", ";
		str += "\"payersSuburb\":\""+payersSuburb+"\", ";
		str += "\"payerName\":\""+payerName+"\", ";
		str += "\"personEoyId\":\""+personEoyId+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"postJun1983TaxComponent\":\""+postJun1983TaxComponent+"\", ";
		str += "\"postJun1983UntaxComponent\":\""+postJun1983UntaxComponent+"\", ";
		str += "\"postJun1994InvalComponent\":\""+postJun1994InvalComponent+"\", ";
		str += "\"preJuly1983Component\":\""+preJuly1983Component+"\", ";
		str += "\"serviceStartDate\":\""+serviceStartDate+"\", ";
		str += "\"startDate\":\""+startDate+"\", ";
		str += "\"taxWithheld\":\""+taxWithheld+"\", ";
		str += "\"tfn\":\""+tfn+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}