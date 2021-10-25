/**************************************************************************************************
 * Framework Generated DTO Source
 * - STP_PAYER - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class StpPayer extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String abnId;
	private String ABN_ID;
	private String amendmentI;
	private String AMENDMENT_I;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String countryC;
	private String COUNTRY_C;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String emailT;
	private String EMAIL_T;
	private double fileId;
	private String FILE_ID;
	private double interactionRecordCt;
	private String INTERACTION_RECORD_CT;
	private String interactionTransId;
	private String INTERACTION_TRANS_ID;
	private String intermediaryBusinessId;
	private String INTERMEDIARY_BUSINESS_ID;
	private String intEmail;
	private String INT_EMAIL;
	private String intFullName;
	private String INT_FULL_NAME;
	private String intPhone;
	private String INT_PHONE;
	private String intSignatoryId;
	private String INT_SIGNATORY_ID;
	private Date intSignatureD;
	private String INT_SIGNATURE_D;
	private String intStatementAccept;
	private String INT_STATEMENT_ACCEPT;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String line1T;
	private String LINE1_T;
	private String line2T;
	private String LINE2_T;
	private String localityNameT;
	private String LOCALITY_NAME_T;
	private String msgTimestampGen;
	private String MSG_TIMESTAMP_GEN;
	private String orgBranchC;
	private String ORG_BRANCH_C;
	private String orgNameT;
	private String ORG_NAME_T;
	private double payerId;
	private String PAYER_ID;
	private double paygTaxWh;
	private String PAYG_TAX_WH;
	private String payRecordTrans;
	private String PAY_RECORD_TRANS;
	private String personFullName;
	private String PERSON_FULL_NAME;
	private String phoneMinN;
	private String PHONE_MIN_N;
	private String postcodeT;
	private String POSTCODE_T;
	private String signatoryIdentifier;
	private String SIGNATORY_IDENTIFIER;
	private String signatureD;
	private String SIGNATURE_D;
	private String softwareBmsId;
	private String SOFTWARE_BMS_ID;
	private String state;
	private String STATE;
	private String statementAccepted;
	private String STATEMENT_ACCEPTED;
	private String taxAgentId;
	private String TAX_AGENT_ID;
	private double totalGrossPayment;
	private String TOTAL_GROSS_PAYMENT;
	private String whPayerId;
	private String WH_PAYER_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public StpPayer() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,INT_SIGNATURE_D,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("BUSINESS_GROUP_ID,CREATED_BY,FILE_ID,INTERACTION_RECORD_CT,LAST_UPDATED_BY,PAYER_ID,PAYG_TAX_WH,TOTAL_GROSS_PAYMENT");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getAbnId() {
		return abnId;
	}

	public void setAbnId(String abnId) throws Exception {
		this.abnId = abnId;
		setValueFromAccessor("ABN_ID", abnId);
	}

	public String getAmendmentI() {
		return amendmentI;
	}

	public void setAmendmentI(String amendmentI) throws Exception {
		this.amendmentI = amendmentI;
		setValueFromAccessor("AMENDMENT_I", amendmentI);
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getCountryC() {
		return countryC;
	}

	public void setCountryC(String countryC) throws Exception {
		this.countryC = countryC;
		setValueFromAccessor("COUNTRY_C", countryC);
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

	public String getEmailT() {
		return emailT;
	}

	public void setEmailT(String emailT) throws Exception {
		this.emailT = emailT;
		setValueFromAccessor("EMAIL_T", emailT);
	}

	public double getFileId() {
		return fileId;
	}

	public void setFileId(double fileId) throws Exception {
		this.fileId = fileId;
		setValueFromAccessor("FILE_ID", CommonUtil.toString(fileId));
	}

	public double getInteractionRecordCt() {
		return interactionRecordCt;
	}

	public void setInteractionRecordCt(double interactionRecordCt) throws Exception {
		this.interactionRecordCt = interactionRecordCt;
		setValueFromAccessor("INTERACTION_RECORD_CT", CommonUtil.toString(interactionRecordCt));
	}

	public String getInteractionTransId() {
		return interactionTransId;
	}

	public void setInteractionTransId(String interactionTransId) throws Exception {
		this.interactionTransId = interactionTransId;
		setValueFromAccessor("INTERACTION_TRANS_ID", interactionTransId);
	}

	public String getIntermediaryBusinessId() {
		return intermediaryBusinessId;
	}

	public void setIntermediaryBusinessId(String intermediaryBusinessId) throws Exception {
		this.intermediaryBusinessId = intermediaryBusinessId;
		setValueFromAccessor("INTERMEDIARY_BUSINESS_ID", intermediaryBusinessId);
	}

	public String getIntEmail() {
		return intEmail;
	}

	public void setIntEmail(String intEmail) throws Exception {
		this.intEmail = intEmail;
		setValueFromAccessor("INT_EMAIL", intEmail);
	}

	public String getIntFullName() {
		return intFullName;
	}

	public void setIntFullName(String intFullName) throws Exception {
		this.intFullName = intFullName;
		setValueFromAccessor("INT_FULL_NAME", intFullName);
	}

	public String getIntPhone() {
		return intPhone;
	}

	public void setIntPhone(String intPhone) throws Exception {
		this.intPhone = intPhone;
		setValueFromAccessor("INT_PHONE", intPhone);
	}

	public String getIntSignatoryId() {
		return intSignatoryId;
	}

	public void setIntSignatoryId(String intSignatoryId) throws Exception {
		this.intSignatoryId = intSignatoryId;
		setValueFromAccessor("INT_SIGNATORY_ID", intSignatoryId);
	}

	public Date getIntSignatureD() {
		return intSignatureD;
	}

	public void setIntSignatureD(Date intSignatureD) throws Exception {
		this.intSignatureD = intSignatureD;
		setValueFromAccessor("INT_SIGNATURE_D", CommonUtil.toString(intSignatureD));
	}

	public String getIntStatementAccept() {
		return intStatementAccept;
	}

	public void setIntStatementAccept(String intStatementAccept) throws Exception {
		this.intStatementAccept = intStatementAccept;
		setValueFromAccessor("INT_STATEMENT_ACCEPT", intStatementAccept);
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

	public String getLine1T() {
		return line1T;
	}

	public void setLine1T(String line1T) throws Exception {
		this.line1T = line1T;
		setValueFromAccessor("LINE1_T", line1T);
	}

	public String getLine2T() {
		return line2T;
	}

	public void setLine2T(String line2T) throws Exception {
		this.line2T = line2T;
		setValueFromAccessor("LINE2_T", line2T);
	}

	public String getLocalityNameT() {
		return localityNameT;
	}

	public void setLocalityNameT(String localityNameT) throws Exception {
		this.localityNameT = localityNameT;
		setValueFromAccessor("LOCALITY_NAME_T", localityNameT);
	}

	public String getMsgTimestampGen() {
		return msgTimestampGen;
	}

	public void setMsgTimestampGen(String msgTimestampGen) throws Exception {
		this.msgTimestampGen = msgTimestampGen;
		setValueFromAccessor("MSG_TIMESTAMP_GEN", msgTimestampGen);
	}

	public String getOrgBranchC() {
		return orgBranchC;
	}

	public void setOrgBranchC(String orgBranchC) throws Exception {
		this.orgBranchC = orgBranchC;
		setValueFromAccessor("ORG_BRANCH_C", orgBranchC);
	}

	public String getOrgNameT() {
		return orgNameT;
	}

	public void setOrgNameT(String orgNameT) throws Exception {
		this.orgNameT = orgNameT;
		setValueFromAccessor("ORG_NAME_T", orgNameT);
	}

	public double getPayerId() {
		return payerId;
	}

	public void setPayerId(double payerId) throws Exception {
		this.payerId = payerId;
		setValueFromAccessor("PAYER_ID", CommonUtil.toString(payerId));
	}

	public double getPaygTaxWh() {
		return paygTaxWh;
	}

	public void setPaygTaxWh(double paygTaxWh) throws Exception {
		this.paygTaxWh = paygTaxWh;
		setValueFromAccessor("PAYG_TAX_WH", CommonUtil.toString(paygTaxWh));
	}

	public String getPayRecordTrans() {
		return payRecordTrans;
	}

	public void setPayRecordTrans(String payRecordTrans) throws Exception {
		this.payRecordTrans = payRecordTrans;
		setValueFromAccessor("PAY_RECORD_TRANS", payRecordTrans);
	}

	public String getPersonFullName() {
		return personFullName;
	}

	public void setPersonFullName(String personFullName) throws Exception {
		this.personFullName = personFullName;
		setValueFromAccessor("PERSON_FULL_NAME", personFullName);
	}

	public String getPhoneMinN() {
		return phoneMinN;
	}

	public void setPhoneMinN(String phoneMinN) throws Exception {
		this.phoneMinN = phoneMinN;
		setValueFromAccessor("PHONE_MIN_N", phoneMinN);
	}

	public String getPostcodeT() {
		return postcodeT;
	}

	public void setPostcodeT(String postcodeT) throws Exception {
		this.postcodeT = postcodeT;
		setValueFromAccessor("POSTCODE_T", postcodeT);
	}

	public String getSignatoryIdentifier() {
		return signatoryIdentifier;
	}

	public void setSignatoryIdentifier(String signatoryIdentifier) throws Exception {
		this.signatoryIdentifier = signatoryIdentifier;
		setValueFromAccessor("SIGNATORY_IDENTIFIER", signatoryIdentifier);
	}

	public String getSignatureD() {
		return signatureD;
	}

	public void setSignatureD(String signatureD) throws Exception {
		this.signatureD = signatureD;
		setValueFromAccessor("SIGNATURE_D", signatureD);
	}

	public String getSoftwareBmsId() {
		return softwareBmsId;
	}

	public void setSoftwareBmsId(String softwareBmsId) throws Exception {
		this.softwareBmsId = softwareBmsId;
		setValueFromAccessor("SOFTWARE_BMS_ID", softwareBmsId);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) throws Exception {
		this.state = state;
		setValueFromAccessor("STATE", state);
	}

	public String getStatementAccepted() {
		return statementAccepted;
	}

	public void setStatementAccepted(String statementAccepted) throws Exception {
		this.statementAccepted = statementAccepted;
		setValueFromAccessor("STATEMENT_ACCEPTED", statementAccepted);
	}

	public String getTaxAgentId() {
		return taxAgentId;
	}

	public void setTaxAgentId(String taxAgentId) throws Exception {
		this.taxAgentId = taxAgentId;
		setValueFromAccessor("TAX_AGENT_ID", taxAgentId);
	}

	public double getTotalGrossPayment() {
		return totalGrossPayment;
	}

	public void setTotalGrossPayment(double totalGrossPayment) throws Exception {
		this.totalGrossPayment = totalGrossPayment;
		setValueFromAccessor("TOTAL_GROSS_PAYMENT", CommonUtil.toString(totalGrossPayment));
	}

	public String getWhPayerId() {
		return whPayerId;
	}

	public void setWhPayerId(String whPayerId) throws Exception {
		this.whPayerId = whPayerId;
		setValueFromAccessor("WH_PAYER_ID", whPayerId);
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

		str += "abnId : "+abnId+"\n";
		str += "amendmentI : "+amendmentI+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "countryC : "+countryC+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "emailT : "+emailT+"\n";
		str += "fileId : "+fileId+"\n";
		str += "interactionRecordCt : "+interactionRecordCt+"\n";
		str += "interactionTransId : "+interactionTransId+"\n";
		str += "intermediaryBusinessId : "+intermediaryBusinessId+"\n";
		str += "intEmail : "+intEmail+"\n";
		str += "intFullName : "+intFullName+"\n";
		str += "intPhone : "+intPhone+"\n";
		str += "intSignatoryId : "+intSignatoryId+"\n";
		str += "intSignatureD : "+intSignatureD+"\n";
		str += "intStatementAccept : "+intStatementAccept+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "line1T : "+line1T+"\n";
		str += "line2T : "+line2T+"\n";
		str += "localityNameT : "+localityNameT+"\n";
		str += "msgTimestampGen : "+msgTimestampGen+"\n";
		str += "orgBranchC : "+orgBranchC+"\n";
		str += "orgNameT : "+orgNameT+"\n";
		str += "payerId : "+payerId+"\n";
		str += "paygTaxWh : "+paygTaxWh+"\n";
		str += "payRecordTrans : "+payRecordTrans+"\n";
		str += "personFullName : "+personFullName+"\n";
		str += "phoneMinN : "+phoneMinN+"\n";
		str += "postcodeT : "+postcodeT+"\n";
		str += "signatoryIdentifier : "+signatoryIdentifier+"\n";
		str += "signatureD : "+signatureD+"\n";
		str += "softwareBmsId : "+softwareBmsId+"\n";
		str += "state : "+state+"\n";
		str += "statementAccepted : "+statementAccepted+"\n";
		str += "taxAgentId : "+taxAgentId+"\n";
		str += "totalGrossPayment : "+totalGrossPayment+"\n";
		str += "whPayerId : "+whPayerId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"abnId\" value=\""+abnId+"\">";
		str += "<column name=\"amendmentI\" value=\""+amendmentI+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"countryC\" value=\""+countryC+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"emailT\" value=\""+emailT+"\">";
		str += "<column name=\"fileId\" value=\""+fileId+"\">";
		str += "<column name=\"interactionRecordCt\" value=\""+interactionRecordCt+"\">";
		str += "<column name=\"interactionTransId\" value=\""+interactionTransId+"\">";
		str += "<column name=\"intermediaryBusinessId\" value=\""+intermediaryBusinessId+"\">";
		str += "<column name=\"intEmail\" value=\""+intEmail+"\">";
		str += "<column name=\"intFullName\" value=\""+intFullName+"\">";
		str += "<column name=\"intPhone\" value=\""+intPhone+"\">";
		str += "<column name=\"intSignatoryId\" value=\""+intSignatoryId+"\">";
		str += "<column name=\"intSignatureD\" value=\""+intSignatureD+"\">";
		str += "<column name=\"intStatementAccept\" value=\""+intStatementAccept+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"line1T\" value=\""+line1T+"\">";
		str += "<column name=\"line2T\" value=\""+line2T+"\">";
		str += "<column name=\"localityNameT\" value=\""+localityNameT+"\">";
		str += "<column name=\"msgTimestampGen\" value=\""+msgTimestampGen+"\">";
		str += "<column name=\"orgBranchC\" value=\""+orgBranchC+"\">";
		str += "<column name=\"orgNameT\" value=\""+orgNameT+"\">";
		str += "<column name=\"payerId\" value=\""+payerId+"\">";
		str += "<column name=\"paygTaxWh\" value=\""+paygTaxWh+"\">";
		str += "<column name=\"payRecordTrans\" value=\""+payRecordTrans+"\">";
		str += "<column name=\"personFullName\" value=\""+personFullName+"\">";
		str += "<column name=\"phoneMinN\" value=\""+phoneMinN+"\">";
		str += "<column name=\"postcodeT\" value=\""+postcodeT+"\">";
		str += "<column name=\"signatoryIdentifier\" value=\""+signatoryIdentifier+"\">";
		str += "<column name=\"signatureD\" value=\""+signatureD+"\">";
		str += "<column name=\"softwareBmsId\" value=\""+softwareBmsId+"\">";
		str += "<column name=\"state\" value=\""+state+"\">";
		str += "<column name=\"statementAccepted\" value=\""+statementAccepted+"\">";
		str += "<column name=\"taxAgentId\" value=\""+taxAgentId+"\">";
		str += "<column name=\"totalGrossPayment\" value=\""+totalGrossPayment+"\">";
		str += "<column name=\"whPayerId\" value=\""+whPayerId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"abnId\":\""+abnId+"\", ";
		str += "\"amendmentI\":\""+amendmentI+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"countryC\":\""+countryC+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"emailT\":\""+emailT+"\", ";
		str += "\"fileId\":\""+fileId+"\", ";
		str += "\"interactionRecordCt\":\""+interactionRecordCt+"\", ";
		str += "\"interactionTransId\":\""+interactionTransId+"\", ";
		str += "\"intermediaryBusinessId\":\""+intermediaryBusinessId+"\", ";
		str += "\"intEmail\":\""+intEmail+"\", ";
		str += "\"intFullName\":\""+intFullName+"\", ";
		str += "\"intPhone\":\""+intPhone+"\", ";
		str += "\"intSignatoryId\":\""+intSignatoryId+"\", ";
		str += "\"intSignatureD\":\""+intSignatureD+"\", ";
		str += "\"intStatementAccept\":\""+intStatementAccept+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"line1T\":\""+line1T+"\", ";
		str += "\"line2T\":\""+line2T+"\", ";
		str += "\"localityNameT\":\""+localityNameT+"\", ";
		str += "\"msgTimestampGen\":\""+msgTimestampGen+"\", ";
		str += "\"orgBranchC\":\""+orgBranchC+"\", ";
		str += "\"orgNameT\":\""+orgNameT+"\", ";
		str += "\"payerId\":\""+payerId+"\", ";
		str += "\"paygTaxWh\":\""+paygTaxWh+"\", ";
		str += "\"payRecordTrans\":\""+payRecordTrans+"\", ";
		str += "\"personFullName\":\""+personFullName+"\", ";
		str += "\"phoneMinN\":\""+phoneMinN+"\", ";
		str += "\"postcodeT\":\""+postcodeT+"\", ";
		str += "\"signatoryIdentifier\":\""+signatoryIdentifier+"\", ";
		str += "\"signatureD\":\""+signatureD+"\", ";
		str += "\"softwareBmsId\":\""+softwareBmsId+"\", ";
		str += "\"state\":\""+state+"\", ";
		str += "\"statementAccepted\":\""+statementAccepted+"\", ";
		str += "\"taxAgentId\":\""+taxAgentId+"\", ";
		str += "\"totalGrossPayment\":\""+totalGrossPayment+"\", ";
		str += "\"whPayerId\":\""+whPayerId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}