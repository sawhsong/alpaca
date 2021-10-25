/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_TAX_DETAILS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupTaxDetails extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double taxDetailsId;
	private String TAX_DETAILS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String addressLine1;
	private String ADDRESS_LINE_1;
	private String addressLine2;
	private String ADDRESS_LINE_2;
	private String austResident;
	private String AUST_RESIDENT;
	private String country;
	private String COUNTRY;
	private Date dateOfBirth;
	private String DATE_OF_BIRTH;
	private String declarationSigned;
	private String DECLARATION_SIGNED;
	private Date declarationSignedDate;
	private String DECLARATION_SIGNED_DATE;
	private double documentContentId;
	private String DOCUMENT_CONTENT_ID;
	private String firstName;
	private String FIRST_NAME;
	private String hecsDebt;
	private String HECS_DEBT;
	private String middleName;
	private String MIDDLE_NAME;
	private String noTfnReason;
	private String NO_TFN_REASON;
	private double payerId;
	private String PAYER_ID;
	private String paymentBasis;
	private String PAYMENT_BASIS;
	private String postCode;
	private String POST_CODE;
	private String previousFirstName;
	private String PREVIOUS_FIRST_NAME;
	private String previousMiddleName;
	private String PREVIOUS_MIDDLE_NAME;
	private String previousSurname;
	private String PREVIOUS_SURNAME;
	private String seniorTaxOffsetClaimed;
	private String SENIOR_TAX_OFFSET_CLAIMED;
	private String specialRebatesClaimed;
	private String SPECIAL_REBATES_CLAIMED;
	private String state;
	private String STATE;
	private String suburb;
	private String SUBURB;
	private String supplementDebt;
	private String SUPPLEMENT_DEBT;
	private String surname;
	private String SURNAME;
	private String taxfreeThresholdClaimed;
	private String TAXFREE_THRESHOLD_CLAIMED;
	private String tfn;
	private String TFN;
	private String title;
	private String TITLE;
	private String tnfDocPostedOffline;
	private String TNF_DOC_POSTED_OFFLINE;
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
	public PortalSignupTaxDetails() throws Exception {
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
		setFrwVarPrimaryKey("TAX_DETAILS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,DATE_OF_BIRTH,DECLARATION_SIGNED_DATE");
		setFrwVarNumberColumn("USER_TF_ID,TAX_DETAILS_ID,CREATED_BY,LAST_UPDATED_BY,DOCUMENT_CONTENT_ID,PAYER_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TNF_DOC_POSTED_OFFLINE,TRANSFORMED");
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

	public double getTaxDetailsId() {
		return taxDetailsId;
	}

	public void setTaxDetailsId(double taxDetailsId) throws Exception {
		this.taxDetailsId = taxDetailsId;
		setValueFromAccessor("TAX_DETAILS_ID", CommonUtil.toString(taxDetailsId));
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

	public String getAustResident() {
		return austResident;
	}

	public void setAustResident(String austResident) throws Exception {
		this.austResident = austResident;
		setValueFromAccessor("AUST_RESIDENT", austResident);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) throws Exception {
		this.country = country;
		setValueFromAccessor("COUNTRY", country);
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) throws Exception {
		this.dateOfBirth = dateOfBirth;
		setValueFromAccessor("DATE_OF_BIRTH", CommonUtil.toString(dateOfBirth));
	}

	public String getDeclarationSigned() {
		return declarationSigned;
	}

	public void setDeclarationSigned(String declarationSigned) throws Exception {
		this.declarationSigned = declarationSigned;
		setValueFromAccessor("DECLARATION_SIGNED", declarationSigned);
	}

	public Date getDeclarationSignedDate() {
		return declarationSignedDate;
	}

	public void setDeclarationSignedDate(Date declarationSignedDate) throws Exception {
		this.declarationSignedDate = declarationSignedDate;
		setValueFromAccessor("DECLARATION_SIGNED_DATE", CommonUtil.toString(declarationSignedDate));
	}

	public double getDocumentContentId() {
		return documentContentId;
	}

	public void setDocumentContentId(double documentContentId) throws Exception {
		this.documentContentId = documentContentId;
		setValueFromAccessor("DOCUMENT_CONTENT_ID", CommonUtil.toString(documentContentId));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		this.firstName = firstName;
		setValueFromAccessor("FIRST_NAME", firstName);
	}

	public String getHecsDebt() {
		return hecsDebt;
	}

	public void setHecsDebt(String hecsDebt) throws Exception {
		this.hecsDebt = hecsDebt;
		setValueFromAccessor("HECS_DEBT", hecsDebt);
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

	public String getSeniorTaxOffsetClaimed() {
		return seniorTaxOffsetClaimed;
	}

	public void setSeniorTaxOffsetClaimed(String seniorTaxOffsetClaimed) throws Exception {
		this.seniorTaxOffsetClaimed = seniorTaxOffsetClaimed;
		setValueFromAccessor("SENIOR_TAX_OFFSET_CLAIMED", seniorTaxOffsetClaimed);
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

	public String getSupplementDebt() {
		return supplementDebt;
	}

	public void setSupplementDebt(String supplementDebt) throws Exception {
		this.supplementDebt = supplementDebt;
		setValueFromAccessor("SUPPLEMENT_DEBT", supplementDebt);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		this.surname = surname;
		setValueFromAccessor("SURNAME", surname);
	}

	public String getTaxfreeThresholdClaimed() {
		return taxfreeThresholdClaimed;
	}

	public void setTaxfreeThresholdClaimed(String taxfreeThresholdClaimed) throws Exception {
		this.taxfreeThresholdClaimed = taxfreeThresholdClaimed;
		setValueFromAccessor("TAXFREE_THRESHOLD_CLAIMED", taxfreeThresholdClaimed);
	}

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) throws Exception {
		this.tfn = tfn;
		setValueFromAccessor("TFN", tfn);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		this.title = title;
		setValueFromAccessor("TITLE", title);
	}

	public String getTnfDocPostedOffline() {
		return tnfDocPostedOffline;
	}

	public void setTnfDocPostedOffline(String tnfDocPostedOffline) throws Exception {
		this.tnfDocPostedOffline = tnfDocPostedOffline;
		setValueFromAccessor("TNF_DOC_POSTED_OFFLINE", tnfDocPostedOffline);
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

		str += "userTfId : "+userTfId+"\n";
		str += "taxDetailsId : "+taxDetailsId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "addressLine1 : "+addressLine1+"\n";
		str += "addressLine2 : "+addressLine2+"\n";
		str += "austResident : "+austResident+"\n";
		str += "country : "+country+"\n";
		str += "dateOfBirth : "+dateOfBirth+"\n";
		str += "declarationSigned : "+declarationSigned+"\n";
		str += "declarationSignedDate : "+declarationSignedDate+"\n";
		str += "documentContentId : "+documentContentId+"\n";
		str += "firstName : "+firstName+"\n";
		str += "hecsDebt : "+hecsDebt+"\n";
		str += "middleName : "+middleName+"\n";
		str += "noTfnReason : "+noTfnReason+"\n";
		str += "payerId : "+payerId+"\n";
		str += "paymentBasis : "+paymentBasis+"\n";
		str += "postCode : "+postCode+"\n";
		str += "previousFirstName : "+previousFirstName+"\n";
		str += "previousMiddleName : "+previousMiddleName+"\n";
		str += "previousSurname : "+previousSurname+"\n";
		str += "seniorTaxOffsetClaimed : "+seniorTaxOffsetClaimed+"\n";
		str += "specialRebatesClaimed : "+specialRebatesClaimed+"\n";
		str += "state : "+state+"\n";
		str += "suburb : "+suburb+"\n";
		str += "supplementDebt : "+supplementDebt+"\n";
		str += "surname : "+surname+"\n";
		str += "taxfreeThresholdClaimed : "+taxfreeThresholdClaimed+"\n";
		str += "tfn : "+tfn+"\n";
		str += "title : "+title+"\n";
		str += "tnfDocPostedOffline : "+tnfDocPostedOffline+"\n";
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

		str += "<column name=\"userTfId\" value=\""+userTfId+"\">";
		str += "<column name=\"taxDetailsId\" value=\""+taxDetailsId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"addressLine1\" value=\""+addressLine1+"\">";
		str += "<column name=\"addressLine2\" value=\""+addressLine2+"\">";
		str += "<column name=\"austResident\" value=\""+austResident+"\">";
		str += "<column name=\"country\" value=\""+country+"\">";
		str += "<column name=\"dateOfBirth\" value=\""+dateOfBirth+"\">";
		str += "<column name=\"declarationSigned\" value=\""+declarationSigned+"\">";
		str += "<column name=\"declarationSignedDate\" value=\""+declarationSignedDate+"\">";
		str += "<column name=\"documentContentId\" value=\""+documentContentId+"\">";
		str += "<column name=\"firstName\" value=\""+firstName+"\">";
		str += "<column name=\"hecsDebt\" value=\""+hecsDebt+"\">";
		str += "<column name=\"middleName\" value=\""+middleName+"\">";
		str += "<column name=\"noTfnReason\" value=\""+noTfnReason+"\">";
		str += "<column name=\"payerId\" value=\""+payerId+"\">";
		str += "<column name=\"paymentBasis\" value=\""+paymentBasis+"\">";
		str += "<column name=\"postCode\" value=\""+postCode+"\">";
		str += "<column name=\"previousFirstName\" value=\""+previousFirstName+"\">";
		str += "<column name=\"previousMiddleName\" value=\""+previousMiddleName+"\">";
		str += "<column name=\"previousSurname\" value=\""+previousSurname+"\">";
		str += "<column name=\"seniorTaxOffsetClaimed\" value=\""+seniorTaxOffsetClaimed+"\">";
		str += "<column name=\"specialRebatesClaimed\" value=\""+specialRebatesClaimed+"\">";
		str += "<column name=\"state\" value=\""+state+"\">";
		str += "<column name=\"suburb\" value=\""+suburb+"\">";
		str += "<column name=\"supplementDebt\" value=\""+supplementDebt+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"taxfreeThresholdClaimed\" value=\""+taxfreeThresholdClaimed+"\">";
		str += "<column name=\"tfn\" value=\""+tfn+"\">";
		str += "<column name=\"title\" value=\""+title+"\">";
		str += "<column name=\"tnfDocPostedOffline\" value=\""+tnfDocPostedOffline+"\">";
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

		str += "\"userTfId\":\""+userTfId+"\", ";
		str += "\"taxDetailsId\":\""+taxDetailsId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"addressLine1\":\""+addressLine1+"\", ";
		str += "\"addressLine2\":\""+addressLine2+"\", ";
		str += "\"austResident\":\""+austResident+"\", ";
		str += "\"country\":\""+country+"\", ";
		str += "\"dateOfBirth\":\""+dateOfBirth+"\", ";
		str += "\"declarationSigned\":\""+declarationSigned+"\", ";
		str += "\"declarationSignedDate\":\""+declarationSignedDate+"\", ";
		str += "\"documentContentId\":\""+documentContentId+"\", ";
		str += "\"firstName\":\""+firstName+"\", ";
		str += "\"hecsDebt\":\""+hecsDebt+"\", ";
		str += "\"middleName\":\""+middleName+"\", ";
		str += "\"noTfnReason\":\""+noTfnReason+"\", ";
		str += "\"payerId\":\""+payerId+"\", ";
		str += "\"paymentBasis\":\""+paymentBasis+"\", ";
		str += "\"postCode\":\""+postCode+"\", ";
		str += "\"previousFirstName\":\""+previousFirstName+"\", ";
		str += "\"previousMiddleName\":\""+previousMiddleName+"\", ";
		str += "\"previousSurname\":\""+previousSurname+"\", ";
		str += "\"seniorTaxOffsetClaimed\":\""+seniorTaxOffsetClaimed+"\", ";
		str += "\"specialRebatesClaimed\":\""+specialRebatesClaimed+"\", ";
		str += "\"state\":\""+state+"\", ";
		str += "\"suburb\":\""+suburb+"\", ";
		str += "\"supplementDebt\":\""+supplementDebt+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"taxfreeThresholdClaimed\":\""+taxfreeThresholdClaimed+"\", ";
		str += "\"tfn\":\""+tfn+"\", ";
		str += "\"title\":\""+title+"\", ";
		str += "\"tnfDocPostedOffline\":\""+tnfDocPostedOffline+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}