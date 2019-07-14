/**************************************************************************************************
 * Framework Generated DTO Source
 * - SUPER_FUND_DETAIL - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class SuperFundDetail extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double superFundId;
	private String SUPER_FUND_ID;
	private String abn;
	private String ABN;
	private String accountName;
	private String ACCOUNT_NAME;
	private String accountNumber;
	private String ACCOUNT_NUMBER;
	private String active;
	private String ACTIVE;
	private String addressLine1;
	private String ADDRESS_LINE_1;
	private String addressLine2;
	private String ADDRESS_LINE_2;
	private String bankAbbrevation;
	private String BANK_ABBREVATION;
	private String branchName;
	private String BRANCH_NAME;
	private String bsb;
	private String BSB;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String comments;
	private String COMMENTS;
	private double contactPersonId;
	private String CONTACT_PERSON_ID;
	private String country;
	private String COUNTRY;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String defaultFund;
	private String DEFAULT_FUND;
	private String electronicServiceAddress;
	private String ELECTRONIC_SERVICE_ADDRESS;
	private String email;
	private String EMAIL;
	private String employerNumber;
	private String EMPLOYER_NUMBER;
	private String fax;
	private String FAX;
	private String fundName;
	private String FUND_NAME;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double organisationId;
	private String ORGANISATION_ID;
	private String phone;
	private String PHONE;
	private String postcode;
	private String POSTCODE;
	private String productName;
	private String PRODUCT_NAME;
	private double relationshipOwnerId;
	private String RELATIONSHIP_OWNER_ID;
	private String sfn;
	private String SFN;
	private String smsf;
	private String SMSF;
	private String spin;
	private String SPIN;
	private String state;
	private String STATE;
	private String suburb;
	private String SUBURB;
	private String usi;
	private String USI;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public SuperFundDetail() throws Exception {
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
		setFrwVarPrimaryKey("SUPER_FUND_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("SUPER_FUND_ID,BUSINESS_GROUP_ID,CONTACT_PERSON_ID,CREATED_BY,LAST_UPDATED_BY,ORGANISATION_ID,RELATIONSHIP_OWNER_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getSuperFundId() {
		return superFundId;
	}

	public void setSuperFundId(double superFundId) throws Exception {
		this.superFundId = superFundId;
		setValueFromAccessor("SUPER_FUND_ID", CommonUtil.toString(superFundId));
	}

	public String getAbn() {
		return abn;
	}

	public void setAbn(String abn) throws Exception {
		this.abn = abn;
		setValueFromAccessor("ABN", abn);
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) throws Exception {
		this.accountName = accountName;
		setValueFromAccessor("ACCOUNT_NAME", accountName);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) throws Exception {
		this.accountNumber = accountNumber;
		setValueFromAccessor("ACCOUNT_NUMBER", accountNumber);
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) throws Exception {
		this.active = active;
		setValueFromAccessor("ACTIVE", active);
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

	public String getBankAbbrevation() {
		return bankAbbrevation;
	}

	public void setBankAbbrevation(String bankAbbrevation) throws Exception {
		this.bankAbbrevation = bankAbbrevation;
		setValueFromAccessor("BANK_ABBREVATION", bankAbbrevation);
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) throws Exception {
		this.branchName = branchName;
		setValueFromAccessor("BRANCH_NAME", branchName);
	}

	public String getBsb() {
		return bsb;
	}

	public void setBsb(String bsb) throws Exception {
		this.bsb = bsb;
		setValueFromAccessor("BSB", bsb);
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public double getContactPersonId() {
		return contactPersonId;
	}

	public void setContactPersonId(double contactPersonId) throws Exception {
		this.contactPersonId = contactPersonId;
		setValueFromAccessor("CONTACT_PERSON_ID", CommonUtil.toString(contactPersonId));
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

	public String getDefaultFund() {
		return defaultFund;
	}

	public void setDefaultFund(String defaultFund) throws Exception {
		this.defaultFund = defaultFund;
		setValueFromAccessor("DEFAULT_FUND", defaultFund);
	}

	public String getElectronicServiceAddress() {
		return electronicServiceAddress;
	}

	public void setElectronicServiceAddress(String electronicServiceAddress) throws Exception {
		this.electronicServiceAddress = electronicServiceAddress;
		setValueFromAccessor("ELECTRONIC_SERVICE_ADDRESS", electronicServiceAddress);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		this.email = email;
		setValueFromAccessor("EMAIL", email);
	}

	public String getEmployerNumber() {
		return employerNumber;
	}

	public void setEmployerNumber(String employerNumber) throws Exception {
		this.employerNumber = employerNumber;
		setValueFromAccessor("EMPLOYER_NUMBER", employerNumber);
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) throws Exception {
		this.fax = fax;
		setValueFromAccessor("FAX", fax);
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) throws Exception {
		this.fundName = fundName;
		setValueFromAccessor("FUND_NAME", fundName);
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

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws Exception {
		this.phone = phone;
		setValueFromAccessor("PHONE", phone);
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) throws Exception {
		this.postcode = postcode;
		setValueFromAccessor("POSTCODE", postcode);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) throws Exception {
		this.productName = productName;
		setValueFromAccessor("PRODUCT_NAME", productName);
	}

	public double getRelationshipOwnerId() {
		return relationshipOwnerId;
	}

	public void setRelationshipOwnerId(double relationshipOwnerId) throws Exception {
		this.relationshipOwnerId = relationshipOwnerId;
		setValueFromAccessor("RELATIONSHIP_OWNER_ID", CommonUtil.toString(relationshipOwnerId));
	}

	public String getSfn() {
		return sfn;
	}

	public void setSfn(String sfn) throws Exception {
		this.sfn = sfn;
		setValueFromAccessor("SFN", sfn);
	}

	public String getSmsf() {
		return smsf;
	}

	public void setSmsf(String smsf) throws Exception {
		this.smsf = smsf;
		setValueFromAccessor("SMSF", smsf);
	}

	public String getSpin() {
		return spin;
	}

	public void setSpin(String spin) throws Exception {
		this.spin = spin;
		setValueFromAccessor("SPIN", spin);
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

	public String getUsi() {
		return usi;
	}

	public void setUsi(String usi) throws Exception {
		this.usi = usi;
		setValueFromAccessor("USI", usi);
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

		str += "superFundId : "+superFundId+"\n";
		str += "abn : "+abn+"\n";
		str += "accountName : "+accountName+"\n";
		str += "accountNumber : "+accountNumber+"\n";
		str += "active : "+active+"\n";
		str += "addressLine1 : "+addressLine1+"\n";
		str += "addressLine2 : "+addressLine2+"\n";
		str += "bankAbbrevation : "+bankAbbrevation+"\n";
		str += "branchName : "+branchName+"\n";
		str += "bsb : "+bsb+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "comments : "+comments+"\n";
		str += "contactPersonId : "+contactPersonId+"\n";
		str += "country : "+country+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "defaultFund : "+defaultFund+"\n";
		str += "electronicServiceAddress : "+electronicServiceAddress+"\n";
		str += "email : "+email+"\n";
		str += "employerNumber : "+employerNumber+"\n";
		str += "fax : "+fax+"\n";
		str += "fundName : "+fundName+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "phone : "+phone+"\n";
		str += "postcode : "+postcode+"\n";
		str += "productName : "+productName+"\n";
		str += "relationshipOwnerId : "+relationshipOwnerId+"\n";
		str += "sfn : "+sfn+"\n";
		str += "smsf : "+smsf+"\n";
		str += "spin : "+spin+"\n";
		str += "state : "+state+"\n";
		str += "suburb : "+suburb+"\n";
		str += "usi : "+usi+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"superFundId\" value=\""+superFundId+"\">";
		str += "<column name=\"abn\" value=\""+abn+"\">";
		str += "<column name=\"accountName\" value=\""+accountName+"\">";
		str += "<column name=\"accountNumber\" value=\""+accountNumber+"\">";
		str += "<column name=\"active\" value=\""+active+"\">";
		str += "<column name=\"addressLine1\" value=\""+addressLine1+"\">";
		str += "<column name=\"addressLine2\" value=\""+addressLine2+"\">";
		str += "<column name=\"bankAbbrevation\" value=\""+bankAbbrevation+"\">";
		str += "<column name=\"branchName\" value=\""+branchName+"\">";
		str += "<column name=\"bsb\" value=\""+bsb+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"contactPersonId\" value=\""+contactPersonId+"\">";
		str += "<column name=\"country\" value=\""+country+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"defaultFund\" value=\""+defaultFund+"\">";
		str += "<column name=\"electronicServiceAddress\" value=\""+electronicServiceAddress+"\">";
		str += "<column name=\"email\" value=\""+email+"\">";
		str += "<column name=\"employerNumber\" value=\""+employerNumber+"\">";
		str += "<column name=\"fax\" value=\""+fax+"\">";
		str += "<column name=\"fundName\" value=\""+fundName+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"phone\" value=\""+phone+"\">";
		str += "<column name=\"postcode\" value=\""+postcode+"\">";
		str += "<column name=\"productName\" value=\""+productName+"\">";
		str += "<column name=\"relationshipOwnerId\" value=\""+relationshipOwnerId+"\">";
		str += "<column name=\"sfn\" value=\""+sfn+"\">";
		str += "<column name=\"smsf\" value=\""+smsf+"\">";
		str += "<column name=\"spin\" value=\""+spin+"\">";
		str += "<column name=\"state\" value=\""+state+"\">";
		str += "<column name=\"suburb\" value=\""+suburb+"\">";
		str += "<column name=\"usi\" value=\""+usi+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"superFundId\":\""+superFundId+"\", ";
		str += "\"abn\":\""+abn+"\", ";
		str += "\"accountName\":\""+accountName+"\", ";
		str += "\"accountNumber\":\""+accountNumber+"\", ";
		str += "\"active\":\""+active+"\", ";
		str += "\"addressLine1\":\""+addressLine1+"\", ";
		str += "\"addressLine2\":\""+addressLine2+"\", ";
		str += "\"bankAbbrevation\":\""+bankAbbrevation+"\", ";
		str += "\"branchName\":\""+branchName+"\", ";
		str += "\"bsb\":\""+bsb+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"contactPersonId\":\""+contactPersonId+"\", ";
		str += "\"country\":\""+country+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"defaultFund\":\""+defaultFund+"\", ";
		str += "\"electronicServiceAddress\":\""+electronicServiceAddress+"\", ";
		str += "\"email\":\""+email+"\", ";
		str += "\"employerNumber\":\""+employerNumber+"\", ";
		str += "\"fax\":\""+fax+"\", ";
		str += "\"fundName\":\""+fundName+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"phone\":\""+phone+"\", ";
		str += "\"postcode\":\""+postcode+"\", ";
		str += "\"productName\":\""+productName+"\", ";
		str += "\"relationshipOwnerId\":\""+relationshipOwnerId+"\", ";
		str += "\"sfn\":\""+sfn+"\", ";
		str += "\"smsf\":\""+smsf+"\", ";
		str += "\"spin\":\""+spin+"\", ";
		str += "\"state\":\""+state+"\", ";
		str += "\"suburb\":\""+suburb+"\", ";
		str += "\"usi\":\""+usi+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}