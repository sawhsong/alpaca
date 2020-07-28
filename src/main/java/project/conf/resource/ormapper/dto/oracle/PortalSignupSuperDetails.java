/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_SUPER_DETAILS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupSuperDetails extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double superDetailsId;
	private String SUPER_DETAILS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String bpayBillerCode;
	private String BPAY_BILLER_CODE;
	private String bpayRefNo;
	private String BPAY_REF_NO;
	private String chqAddress;
	private String CHQ_ADDRESS;
	private String chqPayTo;
	private String CHQ_PAY_TO;
	private String chqPostcode;
	private String CHQ_POSTCODE;
	private String chqState;
	private String CHQ_STATE;
	private String chqSuburb;
	private String CHQ_SUBURB;
	private double complianceDocumentContentId;
	private String COMPLIANCE_DOCUMENT_CONTENT_ID;
	private String confirmSuperCompliance;
	private String CONFIRM_SUPER_COMPLIANCE;
	private String eftAccountName;
	private String EFT_ACCOUNT_NAME;
	private String eftAccountNo;
	private String EFT_ACCOUNT_NO;
	private String eftBsb;
	private String EFT_BSB;
	private String eftEmail;
	private String EFT_EMAIL;
	private String noTfnReason;
	private String NO_TFN_REASON;
	private String paidHourly;
	private String PAID_HOURLY;
	private String paidWholly;
	private String PAID_WHOLLY;
	private String sacBpayBillerCode;
	private String SAC_BPAY_BILLER_CODE;
	private String sacBpayRefNo;
	private String SAC_BPAY_REF_NO;
	private String superChoice;
	private String SUPER_CHOICE;
	private String superFundAbn;
	private String SUPER_FUND_ABN;
	private String superFundEsa;
	private String SUPER_FUND_ESA;
	private String superFundName;
	private String SUPER_FUND_NAME;
	private String superFundNotFound;
	private String SUPER_FUND_NOT_FOUND;
	private String superFundType;
	private String SUPER_FUND_TYPE;
	private String superFundUsi;
	private String SUPER_FUND_USI;
	private String superMemberName;
	private String SUPER_MEMBER_NAME;
	private String superMemberNumber;
	private String SUPER_MEMBER_NUMBER;
	private String superPaymentType;
	private String SUPER_PAYMENT_TYPE;
	private String tfn;
	private String TFN;
	private String transformed;
	private String TRANSFORMED;
	private String workPersonally;
	private String WORK_PERSONALLY;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalSignupSuperDetails() throws Exception {
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
		setFrwVarPrimaryKey("SUPER_DETAILS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("USER_TF_ID,SUPER_DETAILS_ID,CREATED_BY,LAST_UPDATED_BY,COMPLIANCE_DOCUMENT_CONTENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("CONFIRM_SUPER_COMPLIANCE,TRANSFORMED");
		setFrwVarDefaultValue("N,N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getUserTfId() {
		return userTfId;
	}

	public void setUserTfId(double userTfId) throws Exception {
		this.userTfId = userTfId;
		setValueFromAccessor("USER_TF_ID", CommonUtil.toString(userTfId));
	}

	public double getSuperDetailsId() {
		return superDetailsId;
	}

	public void setSuperDetailsId(double superDetailsId) throws Exception {
		this.superDetailsId = superDetailsId;
		setValueFromAccessor("SUPER_DETAILS_ID", CommonUtil.toString(superDetailsId));
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

	public String getBpayBillerCode() {
		return bpayBillerCode;
	}

	public void setBpayBillerCode(String bpayBillerCode) throws Exception {
		this.bpayBillerCode = bpayBillerCode;
		setValueFromAccessor("BPAY_BILLER_CODE", bpayBillerCode);
	}

	public String getBpayRefNo() {
		return bpayRefNo;
	}

	public void setBpayRefNo(String bpayRefNo) throws Exception {
		this.bpayRefNo = bpayRefNo;
		setValueFromAccessor("BPAY_REF_NO", bpayRefNo);
	}

	public String getChqAddress() {
		return chqAddress;
	}

	public void setChqAddress(String chqAddress) throws Exception {
		this.chqAddress = chqAddress;
		setValueFromAccessor("CHQ_ADDRESS", chqAddress);
	}

	public String getChqPayTo() {
		return chqPayTo;
	}

	public void setChqPayTo(String chqPayTo) throws Exception {
		this.chqPayTo = chqPayTo;
		setValueFromAccessor("CHQ_PAY_TO", chqPayTo);
	}

	public String getChqPostcode() {
		return chqPostcode;
	}

	public void setChqPostcode(String chqPostcode) throws Exception {
		this.chqPostcode = chqPostcode;
		setValueFromAccessor("CHQ_POSTCODE", chqPostcode);
	}

	public String getChqState() {
		return chqState;
	}

	public void setChqState(String chqState) throws Exception {
		this.chqState = chqState;
		setValueFromAccessor("CHQ_STATE", chqState);
	}

	public String getChqSuburb() {
		return chqSuburb;
	}

	public void setChqSuburb(String chqSuburb) throws Exception {
		this.chqSuburb = chqSuburb;
		setValueFromAccessor("CHQ_SUBURB", chqSuburb);
	}

	public double getComplianceDocumentContentId() {
		return complianceDocumentContentId;
	}

	public void setComplianceDocumentContentId(double complianceDocumentContentId) throws Exception {
		this.complianceDocumentContentId = complianceDocumentContentId;
		setValueFromAccessor("COMPLIANCE_DOCUMENT_CONTENT_ID", CommonUtil.toString(complianceDocumentContentId));
	}

	public String getConfirmSuperCompliance() {
		return confirmSuperCompliance;
	}

	public void setConfirmSuperCompliance(String confirmSuperCompliance) throws Exception {
		this.confirmSuperCompliance = confirmSuperCompliance;
		setValueFromAccessor("CONFIRM_SUPER_COMPLIANCE", confirmSuperCompliance);
	}

	public String getEftAccountName() {
		return eftAccountName;
	}

	public void setEftAccountName(String eftAccountName) throws Exception {
		this.eftAccountName = eftAccountName;
		setValueFromAccessor("EFT_ACCOUNT_NAME", eftAccountName);
	}

	public String getEftAccountNo() {
		return eftAccountNo;
	}

	public void setEftAccountNo(String eftAccountNo) throws Exception {
		this.eftAccountNo = eftAccountNo;
		setValueFromAccessor("EFT_ACCOUNT_NO", eftAccountNo);
	}

	public String getEftBsb() {
		return eftBsb;
	}

	public void setEftBsb(String eftBsb) throws Exception {
		this.eftBsb = eftBsb;
		setValueFromAccessor("EFT_BSB", eftBsb);
	}

	public String getEftEmail() {
		return eftEmail;
	}

	public void setEftEmail(String eftEmail) throws Exception {
		this.eftEmail = eftEmail;
		setValueFromAccessor("EFT_EMAIL", eftEmail);
	}

	public String getNoTfnReason() {
		return noTfnReason;
	}

	public void setNoTfnReason(String noTfnReason) throws Exception {
		this.noTfnReason = noTfnReason;
		setValueFromAccessor("NO_TFN_REASON", noTfnReason);
	}

	public String getPaidHourly() {
		return paidHourly;
	}

	public void setPaidHourly(String paidHourly) throws Exception {
		this.paidHourly = paidHourly;
		setValueFromAccessor("PAID_HOURLY", paidHourly);
	}

	public String getPaidWholly() {
		return paidWholly;
	}

	public void setPaidWholly(String paidWholly) throws Exception {
		this.paidWholly = paidWholly;
		setValueFromAccessor("PAID_WHOLLY", paidWholly);
	}

	public String getSacBpayBillerCode() {
		return sacBpayBillerCode;
	}

	public void setSacBpayBillerCode(String sacBpayBillerCode) throws Exception {
		this.sacBpayBillerCode = sacBpayBillerCode;
		setValueFromAccessor("SAC_BPAY_BILLER_CODE", sacBpayBillerCode);
	}

	public String getSacBpayRefNo() {
		return sacBpayRefNo;
	}

	public void setSacBpayRefNo(String sacBpayRefNo) throws Exception {
		this.sacBpayRefNo = sacBpayRefNo;
		setValueFromAccessor("SAC_BPAY_REF_NO", sacBpayRefNo);
	}

	public String getSuperChoice() {
		return superChoice;
	}

	public void setSuperChoice(String superChoice) throws Exception {
		this.superChoice = superChoice;
		setValueFromAccessor("SUPER_CHOICE", superChoice);
	}

	public String getSuperFundAbn() {
		return superFundAbn;
	}

	public void setSuperFundAbn(String superFundAbn) throws Exception {
		this.superFundAbn = superFundAbn;
		setValueFromAccessor("SUPER_FUND_ABN", superFundAbn);
	}

	public String getSuperFundEsa() {
		return superFundEsa;
	}

	public void setSuperFundEsa(String superFundEsa) throws Exception {
		this.superFundEsa = superFundEsa;
		setValueFromAccessor("SUPER_FUND_ESA", superFundEsa);
	}

	public String getSuperFundName() {
		return superFundName;
	}

	public void setSuperFundName(String superFundName) throws Exception {
		this.superFundName = superFundName;
		setValueFromAccessor("SUPER_FUND_NAME", superFundName);
	}

	public String getSuperFundNotFound() {
		return superFundNotFound;
	}

	public void setSuperFundNotFound(String superFundNotFound) throws Exception {
		this.superFundNotFound = superFundNotFound;
		setValueFromAccessor("SUPER_FUND_NOT_FOUND", superFundNotFound);
	}

	public String getSuperFundType() {
		return superFundType;
	}

	public void setSuperFundType(String superFundType) throws Exception {
		this.superFundType = superFundType;
		setValueFromAccessor("SUPER_FUND_TYPE", superFundType);
	}

	public String getSuperFundUsi() {
		return superFundUsi;
	}

	public void setSuperFundUsi(String superFundUsi) throws Exception {
		this.superFundUsi = superFundUsi;
		setValueFromAccessor("SUPER_FUND_USI", superFundUsi);
	}

	public String getSuperMemberName() {
		return superMemberName;
	}

	public void setSuperMemberName(String superMemberName) throws Exception {
		this.superMemberName = superMemberName;
		setValueFromAccessor("SUPER_MEMBER_NAME", superMemberName);
	}

	public String getSuperMemberNumber() {
		return superMemberNumber;
	}

	public void setSuperMemberNumber(String superMemberNumber) throws Exception {
		this.superMemberNumber = superMemberNumber;
		setValueFromAccessor("SUPER_MEMBER_NUMBER", superMemberNumber);
	}

	public String getSuperPaymentType() {
		return superPaymentType;
	}

	public void setSuperPaymentType(String superPaymentType) throws Exception {
		this.superPaymentType = superPaymentType;
		setValueFromAccessor("SUPER_PAYMENT_TYPE", superPaymentType);
	}

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) throws Exception {
		this.tfn = tfn;
		setValueFromAccessor("TFN", tfn);
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
	}

	public String getWorkPersonally() {
		return workPersonally;
	}

	public void setWorkPersonally(String workPersonally) throws Exception {
		this.workPersonally = workPersonally;
		setValueFromAccessor("WORK_PERSONALLY", workPersonally);
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

		str += "userTfId : "+userTfId+"\n";
		str += "superDetailsId : "+superDetailsId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "bpayBillerCode : "+bpayBillerCode+"\n";
		str += "bpayRefNo : "+bpayRefNo+"\n";
		str += "chqAddress : "+chqAddress+"\n";
		str += "chqPayTo : "+chqPayTo+"\n";
		str += "chqPostcode : "+chqPostcode+"\n";
		str += "chqState : "+chqState+"\n";
		str += "chqSuburb : "+chqSuburb+"\n";
		str += "complianceDocumentContentId : "+complianceDocumentContentId+"\n";
		str += "confirmSuperCompliance : "+confirmSuperCompliance+"\n";
		str += "eftAccountName : "+eftAccountName+"\n";
		str += "eftAccountNo : "+eftAccountNo+"\n";
		str += "eftBsb : "+eftBsb+"\n";
		str += "eftEmail : "+eftEmail+"\n";
		str += "noTfnReason : "+noTfnReason+"\n";
		str += "paidHourly : "+paidHourly+"\n";
		str += "paidWholly : "+paidWholly+"\n";
		str += "sacBpayBillerCode : "+sacBpayBillerCode+"\n";
		str += "sacBpayRefNo : "+sacBpayRefNo+"\n";
		str += "superChoice : "+superChoice+"\n";
		str += "superFundAbn : "+superFundAbn+"\n";
		str += "superFundEsa : "+superFundEsa+"\n";
		str += "superFundName : "+superFundName+"\n";
		str += "superFundNotFound : "+superFundNotFound+"\n";
		str += "superFundType : "+superFundType+"\n";
		str += "superFundUsi : "+superFundUsi+"\n";
		str += "superMemberName : "+superMemberName+"\n";
		str += "superMemberNumber : "+superMemberNumber+"\n";
		str += "superPaymentType : "+superPaymentType+"\n";
		str += "tfn : "+tfn+"\n";
		str += "transformed : "+transformed+"\n";
		str += "workPersonally : "+workPersonally+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"userTfId\" value=\""+userTfId+"\">";
		str += "<column name=\"superDetailsId\" value=\""+superDetailsId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"bpayBillerCode\" value=\""+bpayBillerCode+"\">";
		str += "<column name=\"bpayRefNo\" value=\""+bpayRefNo+"\">";
		str += "<column name=\"chqAddress\" value=\""+chqAddress+"\">";
		str += "<column name=\"chqPayTo\" value=\""+chqPayTo+"\">";
		str += "<column name=\"chqPostcode\" value=\""+chqPostcode+"\">";
		str += "<column name=\"chqState\" value=\""+chqState+"\">";
		str += "<column name=\"chqSuburb\" value=\""+chqSuburb+"\">";
		str += "<column name=\"complianceDocumentContentId\" value=\""+complianceDocumentContentId+"\">";
		str += "<column name=\"confirmSuperCompliance\" value=\""+confirmSuperCompliance+"\">";
		str += "<column name=\"eftAccountName\" value=\""+eftAccountName+"\">";
		str += "<column name=\"eftAccountNo\" value=\""+eftAccountNo+"\">";
		str += "<column name=\"eftBsb\" value=\""+eftBsb+"\">";
		str += "<column name=\"eftEmail\" value=\""+eftEmail+"\">";
		str += "<column name=\"noTfnReason\" value=\""+noTfnReason+"\">";
		str += "<column name=\"paidHourly\" value=\""+paidHourly+"\">";
		str += "<column name=\"paidWholly\" value=\""+paidWholly+"\">";
		str += "<column name=\"sacBpayBillerCode\" value=\""+sacBpayBillerCode+"\">";
		str += "<column name=\"sacBpayRefNo\" value=\""+sacBpayRefNo+"\">";
		str += "<column name=\"superChoice\" value=\""+superChoice+"\">";
		str += "<column name=\"superFundAbn\" value=\""+superFundAbn+"\">";
		str += "<column name=\"superFundEsa\" value=\""+superFundEsa+"\">";
		str += "<column name=\"superFundName\" value=\""+superFundName+"\">";
		str += "<column name=\"superFundNotFound\" value=\""+superFundNotFound+"\">";
		str += "<column name=\"superFundType\" value=\""+superFundType+"\">";
		str += "<column name=\"superFundUsi\" value=\""+superFundUsi+"\">";
		str += "<column name=\"superMemberName\" value=\""+superMemberName+"\">";
		str += "<column name=\"superMemberNumber\" value=\""+superMemberNumber+"\">";
		str += "<column name=\"superPaymentType\" value=\""+superPaymentType+"\">";
		str += "<column name=\"tfn\" value=\""+tfn+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"workPersonally\" value=\""+workPersonally+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"userTfId\":\""+userTfId+"\", ";
		str += "\"superDetailsId\":\""+superDetailsId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"bpayBillerCode\":\""+bpayBillerCode+"\", ";
		str += "\"bpayRefNo\":\""+bpayRefNo+"\", ";
		str += "\"chqAddress\":\""+chqAddress+"\", ";
		str += "\"chqPayTo\":\""+chqPayTo+"\", ";
		str += "\"chqPostcode\":\""+chqPostcode+"\", ";
		str += "\"chqState\":\""+chqState+"\", ";
		str += "\"chqSuburb\":\""+chqSuburb+"\", ";
		str += "\"complianceDocumentContentId\":\""+complianceDocumentContentId+"\", ";
		str += "\"confirmSuperCompliance\":\""+confirmSuperCompliance+"\", ";
		str += "\"eftAccountName\":\""+eftAccountName+"\", ";
		str += "\"eftAccountNo\":\""+eftAccountNo+"\", ";
		str += "\"eftBsb\":\""+eftBsb+"\", ";
		str += "\"eftEmail\":\""+eftEmail+"\", ";
		str += "\"noTfnReason\":\""+noTfnReason+"\", ";
		str += "\"paidHourly\":\""+paidHourly+"\", ";
		str += "\"paidWholly\":\""+paidWholly+"\", ";
		str += "\"sacBpayBillerCode\":\""+sacBpayBillerCode+"\", ";
		str += "\"sacBpayRefNo\":\""+sacBpayRefNo+"\", ";
		str += "\"superChoice\":\""+superChoice+"\", ";
		str += "\"superFundAbn\":\""+superFundAbn+"\", ";
		str += "\"superFundEsa\":\""+superFundEsa+"\", ";
		str += "\"superFundName\":\""+superFundName+"\", ";
		str += "\"superFundNotFound\":\""+superFundNotFound+"\", ";
		str += "\"superFundType\":\""+superFundType+"\", ";
		str += "\"superFundUsi\":\""+superFundUsi+"\", ";
		str += "\"superMemberName\":\""+superMemberName+"\", ";
		str += "\"superMemberNumber\":\""+superMemberNumber+"\", ";
		str += "\"superPaymentType\":\""+superPaymentType+"\", ";
		str += "\"tfn\":\""+tfn+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"workPersonally\":\""+workPersonally+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}