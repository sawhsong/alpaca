/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_CONTACT_DETAILS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupContactDetails extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double contactDetailsId;
	private String CONTACT_DETAILS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String homeAddressLine;
	private String HOME_ADDRESS_LINE;
	private String homeCity;
	private String HOME_CITY;
	private String homeCountry;
	private String HOME_COUNTRY;
	private String homePostCode;
	private String HOME_POST_CODE;
	private String homeState;
	private String HOME_STATE;
	private String homeSuburb;
	private String HOME_SUBURB;
	private String portalEmailAddress;
	private String PORTAL_EMAIL_ADDRESS;
	private String telephoneHome;
	private String TELEPHONE_HOME;
	private String telephoneMobile;
	private String TELEPHONE_MOBILE;
	private String telephoneWork;
	private String TELEPHONE_WORK;
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
	public PortalSignupContactDetails() throws Exception {
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
		setFrwVarPrimaryKey("CONTACT_DETAILS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("USER_TF_ID,CONTACT_DETAILS_ID,CREATED_BY,LAST_UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
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

	public double getContactDetailsId() {
		return contactDetailsId;
	}

	public void setContactDetailsId(double contactDetailsId) throws Exception {
		this.contactDetailsId = contactDetailsId;
		setValueFromAccessor("CONTACT_DETAILS_ID", CommonUtil.toString(contactDetailsId));
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

	public String getHomeAddressLine() {
		return homeAddressLine;
	}

	public void setHomeAddressLine(String homeAddressLine) throws Exception {
		this.homeAddressLine = homeAddressLine;
		setValueFromAccessor("HOME_ADDRESS_LINE", homeAddressLine);
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) throws Exception {
		this.homeCity = homeCity;
		setValueFromAccessor("HOME_CITY", homeCity);
	}

	public String getHomeCountry() {
		return homeCountry;
	}

	public void setHomeCountry(String homeCountry) throws Exception {
		this.homeCountry = homeCountry;
		setValueFromAccessor("HOME_COUNTRY", homeCountry);
	}

	public String getHomePostCode() {
		return homePostCode;
	}

	public void setHomePostCode(String homePostCode) throws Exception {
		this.homePostCode = homePostCode;
		setValueFromAccessor("HOME_POST_CODE", homePostCode);
	}

	public String getHomeState() {
		return homeState;
	}

	public void setHomeState(String homeState) throws Exception {
		this.homeState = homeState;
		setValueFromAccessor("HOME_STATE", homeState);
	}

	public String getHomeSuburb() {
		return homeSuburb;
	}

	public void setHomeSuburb(String homeSuburb) throws Exception {
		this.homeSuburb = homeSuburb;
		setValueFromAccessor("HOME_SUBURB", homeSuburb);
	}

	public String getPortalEmailAddress() {
		return portalEmailAddress;
	}

	public void setPortalEmailAddress(String portalEmailAddress) throws Exception {
		this.portalEmailAddress = portalEmailAddress;
		setValueFromAccessor("PORTAL_EMAIL_ADDRESS", portalEmailAddress);
	}

	public String getTelephoneHome() {
		return telephoneHome;
	}

	public void setTelephoneHome(String telephoneHome) throws Exception {
		this.telephoneHome = telephoneHome;
		setValueFromAccessor("TELEPHONE_HOME", telephoneHome);
	}

	public String getTelephoneMobile() {
		return telephoneMobile;
	}

	public void setTelephoneMobile(String telephoneMobile) throws Exception {
		this.telephoneMobile = telephoneMobile;
		setValueFromAccessor("TELEPHONE_MOBILE", telephoneMobile);
	}

	public String getTelephoneWork() {
		return telephoneWork;
	}

	public void setTelephoneWork(String telephoneWork) throws Exception {
		this.telephoneWork = telephoneWork;
		setValueFromAccessor("TELEPHONE_WORK", telephoneWork);
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
		str += "contactDetailsId : "+contactDetailsId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "homeAddressLine : "+homeAddressLine+"\n";
		str += "homeCity : "+homeCity+"\n";
		str += "homeCountry : "+homeCountry+"\n";
		str += "homePostCode : "+homePostCode+"\n";
		str += "homeState : "+homeState+"\n";
		str += "homeSuburb : "+homeSuburb+"\n";
		str += "portalEmailAddress : "+portalEmailAddress+"\n";
		str += "telephoneHome : "+telephoneHome+"\n";
		str += "telephoneMobile : "+telephoneMobile+"\n";
		str += "telephoneWork : "+telephoneWork+"\n";
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
		str += "<column name=\"contactDetailsId\" value=\""+contactDetailsId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"homeAddressLine\" value=\""+homeAddressLine+"\">";
		str += "<column name=\"homeCity\" value=\""+homeCity+"\">";
		str += "<column name=\"homeCountry\" value=\""+homeCountry+"\">";
		str += "<column name=\"homePostCode\" value=\""+homePostCode+"\">";
		str += "<column name=\"homeState\" value=\""+homeState+"\">";
		str += "<column name=\"homeSuburb\" value=\""+homeSuburb+"\">";
		str += "<column name=\"portalEmailAddress\" value=\""+portalEmailAddress+"\">";
		str += "<column name=\"telephoneHome\" value=\""+telephoneHome+"\">";
		str += "<column name=\"telephoneMobile\" value=\""+telephoneMobile+"\">";
		str += "<column name=\"telephoneWork\" value=\""+telephoneWork+"\">";
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
		str += "\"contactDetailsId\":\""+contactDetailsId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"homeAddressLine\":\""+homeAddressLine+"\", ";
		str += "\"homeCity\":\""+homeCity+"\", ";
		str += "\"homeCountry\":\""+homeCountry+"\", ";
		str += "\"homePostCode\":\""+homePostCode+"\", ";
		str += "\"homeState\":\""+homeState+"\", ";
		str += "\"homeSuburb\":\""+homeSuburb+"\", ";
		str += "\"portalEmailAddress\":\""+portalEmailAddress+"\", ";
		str += "\"telephoneHome\":\""+telephoneHome+"\", ";
		str += "\"telephoneMobile\":\""+telephoneMobile+"\", ";
		str += "\"telephoneWork\":\""+telephoneWork+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}