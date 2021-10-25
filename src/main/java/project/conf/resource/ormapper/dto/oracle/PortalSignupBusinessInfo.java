/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_BUSINESS_INFO - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupBusinessInfo extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double businessInfoId;
	private String BUSINESS_INFO_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String bctiAccepted;
	private String BCTI_ACCEPTED;
	private String businessAddr;
	private String BUSINESS_ADDR;
	private String businessCity;
	private String BUSINESS_CITY;
	private String businessCountry;
	private String BUSINESS_COUNTRY;
	private String businessName;
	private String BUSINESS_NAME;
	private String businessNumber;
	private String BUSINESS_NUMBER;
	private String businessPhone;
	private String BUSINESS_PHONE;
	private String businessPostCode;
	private String BUSINESS_POST_CODE;
	private String businessState;
	private String BUSINESS_STATE;
	private String businessSuburb;
	private String BUSINESS_SUBURB;
	private String businessTradingName;
	private String BUSINESS_TRADING_NAME;
	private String businessType;
	private String BUSINESS_TYPE;
	private String companyNumber;
	private String COMPANY_NUMBER;
	private String gstNumber;
	private String GST_NUMBER;
	private String gstRegistered;
	private String GST_REGISTERED;
	private String rctiAccepted;
	private String RCTI_ACCEPTED;
	private String rctiAgreementText;
	private String RCTI_AGREEMENT_TEXT;
	private String rctiAuthRecipientEmail;
	private String RCTI_AUTH_RECIPIENT_EMAIL;
	private String rctiAuthRecipientName;
	private String RCTI_AUTH_RECIPIENT_NAME;
	private String rctiNominatedPersonsName;
	private String RCTI_NOMINATED_PERSONS_NAME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalSignupBusinessInfo() throws Exception {
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
		setFrwVarPrimaryKey("BUSINESS_INFO_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("USER_TF_ID,BUSINESS_INFO_ID,CREATED_BY,LAST_UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
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

	public double getBusinessInfoId() {
		return businessInfoId;
	}

	public void setBusinessInfoId(double businessInfoId) throws Exception {
		this.businessInfoId = businessInfoId;
		setValueFromAccessor("BUSINESS_INFO_ID", CommonUtil.toString(businessInfoId));
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

	public String getBctiAccepted() {
		return bctiAccepted;
	}

	public void setBctiAccepted(String bctiAccepted) throws Exception {
		this.bctiAccepted = bctiAccepted;
		setValueFromAccessor("BCTI_ACCEPTED", bctiAccepted);
	}

	public String getBusinessAddr() {
		return businessAddr;
	}

	public void setBusinessAddr(String businessAddr) throws Exception {
		this.businessAddr = businessAddr;
		setValueFromAccessor("BUSINESS_ADDR", businessAddr);
	}

	public String getBusinessCity() {
		return businessCity;
	}

	public void setBusinessCity(String businessCity) throws Exception {
		this.businessCity = businessCity;
		setValueFromAccessor("BUSINESS_CITY", businessCity);
	}

	public String getBusinessCountry() {
		return businessCountry;
	}

	public void setBusinessCountry(String businessCountry) throws Exception {
		this.businessCountry = businessCountry;
		setValueFromAccessor("BUSINESS_COUNTRY", businessCountry);
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) throws Exception {
		this.businessName = businessName;
		setValueFromAccessor("BUSINESS_NAME", businessName);
	}

	public String getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(String businessNumber) throws Exception {
		this.businessNumber = businessNumber;
		setValueFromAccessor("BUSINESS_NUMBER", businessNumber);
	}

	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) throws Exception {
		this.businessPhone = businessPhone;
		setValueFromAccessor("BUSINESS_PHONE", businessPhone);
	}

	public String getBusinessPostCode() {
		return businessPostCode;
	}

	public void setBusinessPostCode(String businessPostCode) throws Exception {
		this.businessPostCode = businessPostCode;
		setValueFromAccessor("BUSINESS_POST_CODE", businessPostCode);
	}

	public String getBusinessState() {
		return businessState;
	}

	public void setBusinessState(String businessState) throws Exception {
		this.businessState = businessState;
		setValueFromAccessor("BUSINESS_STATE", businessState);
	}

	public String getBusinessSuburb() {
		return businessSuburb;
	}

	public void setBusinessSuburb(String businessSuburb) throws Exception {
		this.businessSuburb = businessSuburb;
		setValueFromAccessor("BUSINESS_SUBURB", businessSuburb);
	}

	public String getBusinessTradingName() {
		return businessTradingName;
	}

	public void setBusinessTradingName(String businessTradingName) throws Exception {
		this.businessTradingName = businessTradingName;
		setValueFromAccessor("BUSINESS_TRADING_NAME", businessTradingName);
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) throws Exception {
		this.businessType = businessType;
		setValueFromAccessor("BUSINESS_TYPE", businessType);
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) throws Exception {
		this.companyNumber = companyNumber;
		setValueFromAccessor("COMPANY_NUMBER", companyNumber);
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) throws Exception {
		this.gstNumber = gstNumber;
		setValueFromAccessor("GST_NUMBER", gstNumber);
	}

	public String getGstRegistered() {
		return gstRegistered;
	}

	public void setGstRegistered(String gstRegistered) throws Exception {
		this.gstRegistered = gstRegistered;
		setValueFromAccessor("GST_REGISTERED", gstRegistered);
	}

	public String getRctiAccepted() {
		return rctiAccepted;
	}

	public void setRctiAccepted(String rctiAccepted) throws Exception {
		this.rctiAccepted = rctiAccepted;
		setValueFromAccessor("RCTI_ACCEPTED", rctiAccepted);
	}

	public String getRctiAgreementText() {
		return rctiAgreementText;
	}

	public void setRctiAgreementText(String rctiAgreementText) throws Exception {
		this.rctiAgreementText = rctiAgreementText;
		setValueFromAccessor("RCTI_AGREEMENT_TEXT", rctiAgreementText);
	}

	public String getRctiAuthRecipientEmail() {
		return rctiAuthRecipientEmail;
	}

	public void setRctiAuthRecipientEmail(String rctiAuthRecipientEmail) throws Exception {
		this.rctiAuthRecipientEmail = rctiAuthRecipientEmail;
		setValueFromAccessor("RCTI_AUTH_RECIPIENT_EMAIL", rctiAuthRecipientEmail);
	}

	public String getRctiAuthRecipientName() {
		return rctiAuthRecipientName;
	}

	public void setRctiAuthRecipientName(String rctiAuthRecipientName) throws Exception {
		this.rctiAuthRecipientName = rctiAuthRecipientName;
		setValueFromAccessor("RCTI_AUTH_RECIPIENT_NAME", rctiAuthRecipientName);
	}

	public String getRctiNominatedPersonsName() {
		return rctiNominatedPersonsName;
	}

	public void setRctiNominatedPersonsName(String rctiNominatedPersonsName) throws Exception {
		this.rctiNominatedPersonsName = rctiNominatedPersonsName;
		setValueFromAccessor("RCTI_NOMINATED_PERSONS_NAME", rctiNominatedPersonsName);
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
		str += "businessInfoId : "+businessInfoId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "bctiAccepted : "+bctiAccepted+"\n";
		str += "businessAddr : "+businessAddr+"\n";
		str += "businessCity : "+businessCity+"\n";
		str += "businessCountry : "+businessCountry+"\n";
		str += "businessName : "+businessName+"\n";
		str += "businessNumber : "+businessNumber+"\n";
		str += "businessPhone : "+businessPhone+"\n";
		str += "businessPostCode : "+businessPostCode+"\n";
		str += "businessState : "+businessState+"\n";
		str += "businessSuburb : "+businessSuburb+"\n";
		str += "businessTradingName : "+businessTradingName+"\n";
		str += "businessType : "+businessType+"\n";
		str += "companyNumber : "+companyNumber+"\n";
		str += "gstNumber : "+gstNumber+"\n";
		str += "gstRegistered : "+gstRegistered+"\n";
		str += "rctiAccepted : "+rctiAccepted+"\n";
		str += "rctiAgreementText : "+rctiAgreementText+"\n";
		str += "rctiAuthRecipientEmail : "+rctiAuthRecipientEmail+"\n";
		str += "rctiAuthRecipientName : "+rctiAuthRecipientName+"\n";
		str += "rctiNominatedPersonsName : "+rctiNominatedPersonsName+"\n";
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
		str += "<column name=\"businessInfoId\" value=\""+businessInfoId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"bctiAccepted\" value=\""+bctiAccepted+"\">";
		str += "<column name=\"businessAddr\" value=\""+businessAddr+"\">";
		str += "<column name=\"businessCity\" value=\""+businessCity+"\">";
		str += "<column name=\"businessCountry\" value=\""+businessCountry+"\">";
		str += "<column name=\"businessName\" value=\""+businessName+"\">";
		str += "<column name=\"businessNumber\" value=\""+businessNumber+"\">";
		str += "<column name=\"businessPhone\" value=\""+businessPhone+"\">";
		str += "<column name=\"businessPostCode\" value=\""+businessPostCode+"\">";
		str += "<column name=\"businessState\" value=\""+businessState+"\">";
		str += "<column name=\"businessSuburb\" value=\""+businessSuburb+"\">";
		str += "<column name=\"businessTradingName\" value=\""+businessTradingName+"\">";
		str += "<column name=\"businessType\" value=\""+businessType+"\">";
		str += "<column name=\"companyNumber\" value=\""+companyNumber+"\">";
		str += "<column name=\"gstNumber\" value=\""+gstNumber+"\">";
		str += "<column name=\"gstRegistered\" value=\""+gstRegistered+"\">";
		str += "<column name=\"rctiAccepted\" value=\""+rctiAccepted+"\">";
		str += "<column name=\"rctiAgreementText\" value=\""+rctiAgreementText+"\">";
		str += "<column name=\"rctiAuthRecipientEmail\" value=\""+rctiAuthRecipientEmail+"\">";
		str += "<column name=\"rctiAuthRecipientName\" value=\""+rctiAuthRecipientName+"\">";
		str += "<column name=\"rctiNominatedPersonsName\" value=\""+rctiNominatedPersonsName+"\">";
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
		str += "\"businessInfoId\":\""+businessInfoId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"bctiAccepted\":\""+bctiAccepted+"\", ";
		str += "\"businessAddr\":\""+businessAddr+"\", ";
		str += "\"businessCity\":\""+businessCity+"\", ";
		str += "\"businessCountry\":\""+businessCountry+"\", ";
		str += "\"businessName\":\""+businessName+"\", ";
		str += "\"businessNumber\":\""+businessNumber+"\", ";
		str += "\"businessPhone\":\""+businessPhone+"\", ";
		str += "\"businessPostCode\":\""+businessPostCode+"\", ";
		str += "\"businessState\":\""+businessState+"\", ";
		str += "\"businessSuburb\":\""+businessSuburb+"\", ";
		str += "\"businessTradingName\":\""+businessTradingName+"\", ";
		str += "\"businessType\":\""+businessType+"\", ";
		str += "\"companyNumber\":\""+companyNumber+"\", ";
		str += "\"gstNumber\":\""+gstNumber+"\", ";
		str += "\"gstRegistered\":\""+gstRegistered+"\", ";
		str += "\"rctiAccepted\":\""+rctiAccepted+"\", ";
		str += "\"rctiAgreementText\":\""+rctiAgreementText+"\", ";
		str += "\"rctiAuthRecipientEmail\":\""+rctiAuthRecipientEmail+"\", ";
		str += "\"rctiAuthRecipientName\":\""+rctiAuthRecipientName+"\", ";
		str += "\"rctiNominatedPersonsName\":\""+rctiNominatedPersonsName+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}