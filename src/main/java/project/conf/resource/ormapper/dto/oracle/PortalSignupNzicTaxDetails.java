/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_NZIC_TAX_DETAILS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupNzicTaxDetails extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double nzIcTaxDetailsId;
	private String NZ_IC_TAX_DETAILS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String declarationIpAddress;
	private String DECLARATION_IP_ADDRESS;
	private String declarationPersonDesignation;
	private String DECLARATION_PERSON_DESIGNATION;
	private String declarationPersonName;
	private String DECLARATION_PERSON_NAME;
	private String declarationSigned;
	private String DECLARATION_SIGNED;
	private Date declarationSignedDate;
	private String DECLARATION_SIGNED_DATE;
	private double docContentId;
	private String DOC_CONTENT_ID;
	private String fullName;
	private String FULL_NAME;
	private String irdNumber;
	private String IRD_NUMBER;
	private String isTaxRateFromProvided;
	private String IS_TAX_RATE_FROM_PROVIDED;
	private String schedulePayActivityNumber;
	private String SCHEDULE_PAY_ACTIVITY_NUMBER;
	private String strCertificateStatus;
	private String STR_CERTIFICATE_STATUS;
	private String taxRate;
	private String TAX_RATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalSignupNzicTaxDetails() throws Exception {
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
		setFrwVarPrimaryKey("NZ_IC_TAX_DETAILS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,DECLARATION_SIGNED_DATE");
		setFrwVarNumberColumn("USER_TF_ID,NZ_IC_TAX_DETAILS_ID,CREATED_BY,LAST_UPDATED_BY,DOC_CONTENT_ID");
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

	public double getNzIcTaxDetailsId() {
		return nzIcTaxDetailsId;
	}

	public void setNzIcTaxDetailsId(double nzIcTaxDetailsId) throws Exception {
		this.nzIcTaxDetailsId = nzIcTaxDetailsId;
		setValueFromAccessor("NZ_IC_TAX_DETAILS_ID", CommonUtil.toString(nzIcTaxDetailsId));
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

	public String getDeclarationIpAddress() {
		return declarationIpAddress;
	}

	public void setDeclarationIpAddress(String declarationIpAddress) throws Exception {
		this.declarationIpAddress = declarationIpAddress;
		setValueFromAccessor("DECLARATION_IP_ADDRESS", declarationIpAddress);
	}

	public String getDeclarationPersonDesignation() {
		return declarationPersonDesignation;
	}

	public void setDeclarationPersonDesignation(String declarationPersonDesignation) throws Exception {
		this.declarationPersonDesignation = declarationPersonDesignation;
		setValueFromAccessor("DECLARATION_PERSON_DESIGNATION", declarationPersonDesignation);
	}

	public String getDeclarationPersonName() {
		return declarationPersonName;
	}

	public void setDeclarationPersonName(String declarationPersonName) throws Exception {
		this.declarationPersonName = declarationPersonName;
		setValueFromAccessor("DECLARATION_PERSON_NAME", declarationPersonName);
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

	public double getDocContentId() {
		return docContentId;
	}

	public void setDocContentId(double docContentId) throws Exception {
		this.docContentId = docContentId;
		setValueFromAccessor("DOC_CONTENT_ID", CommonUtil.toString(docContentId));
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) throws Exception {
		this.fullName = fullName;
		setValueFromAccessor("FULL_NAME", fullName);
	}

	public String getIrdNumber() {
		return irdNumber;
	}

	public void setIrdNumber(String irdNumber) throws Exception {
		this.irdNumber = irdNumber;
		setValueFromAccessor("IRD_NUMBER", irdNumber);
	}

	public String getIsTaxRateFromProvided() {
		return isTaxRateFromProvided;
	}

	public void setIsTaxRateFromProvided(String isTaxRateFromProvided) throws Exception {
		this.isTaxRateFromProvided = isTaxRateFromProvided;
		setValueFromAccessor("IS_TAX_RATE_FROM_PROVIDED", isTaxRateFromProvided);
	}

	public String getSchedulePayActivityNumber() {
		return schedulePayActivityNumber;
	}

	public void setSchedulePayActivityNumber(String schedulePayActivityNumber) throws Exception {
		this.schedulePayActivityNumber = schedulePayActivityNumber;
		setValueFromAccessor("SCHEDULE_PAY_ACTIVITY_NUMBER", schedulePayActivityNumber);
	}

	public String getStrCertificateStatus() {
		return strCertificateStatus;
	}

	public void setStrCertificateStatus(String strCertificateStatus) throws Exception {
		this.strCertificateStatus = strCertificateStatus;
		setValueFromAccessor("STR_CERTIFICATE_STATUS", strCertificateStatus);
	}

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) throws Exception {
		this.taxRate = taxRate;
		setValueFromAccessor("TAX_RATE", taxRate);
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
		str += "nzIcTaxDetailsId : "+nzIcTaxDetailsId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "declarationIpAddress : "+declarationIpAddress+"\n";
		str += "declarationPersonDesignation : "+declarationPersonDesignation+"\n";
		str += "declarationPersonName : "+declarationPersonName+"\n";
		str += "declarationSigned : "+declarationSigned+"\n";
		str += "declarationSignedDate : "+declarationSignedDate+"\n";
		str += "docContentId : "+docContentId+"\n";
		str += "fullName : "+fullName+"\n";
		str += "irdNumber : "+irdNumber+"\n";
		str += "isTaxRateFromProvided : "+isTaxRateFromProvided+"\n";
		str += "schedulePayActivityNumber : "+schedulePayActivityNumber+"\n";
		str += "strCertificateStatus : "+strCertificateStatus+"\n";
		str += "taxRate : "+taxRate+"\n";
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
		str += "<column name=\"nzIcTaxDetailsId\" value=\""+nzIcTaxDetailsId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"declarationIpAddress\" value=\""+declarationIpAddress+"\">";
		str += "<column name=\"declarationPersonDesignation\" value=\""+declarationPersonDesignation+"\">";
		str += "<column name=\"declarationPersonName\" value=\""+declarationPersonName+"\">";
		str += "<column name=\"declarationSigned\" value=\""+declarationSigned+"\">";
		str += "<column name=\"declarationSignedDate\" value=\""+declarationSignedDate+"\">";
		str += "<column name=\"docContentId\" value=\""+docContentId+"\">";
		str += "<column name=\"fullName\" value=\""+fullName+"\">";
		str += "<column name=\"irdNumber\" value=\""+irdNumber+"\">";
		str += "<column name=\"isTaxRateFromProvided\" value=\""+isTaxRateFromProvided+"\">";
		str += "<column name=\"schedulePayActivityNumber\" value=\""+schedulePayActivityNumber+"\">";
		str += "<column name=\"strCertificateStatus\" value=\""+strCertificateStatus+"\">";
		str += "<column name=\"taxRate\" value=\""+taxRate+"\">";
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
		str += "\"nzIcTaxDetailsId\":\""+nzIcTaxDetailsId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"declarationIpAddress\":\""+declarationIpAddress+"\", ";
		str += "\"declarationPersonDesignation\":\""+declarationPersonDesignation+"\", ";
		str += "\"declarationPersonName\":\""+declarationPersonName+"\", ";
		str += "\"declarationSigned\":\""+declarationSigned+"\", ";
		str += "\"declarationSignedDate\":\""+declarationSignedDate+"\", ";
		str += "\"docContentId\":\""+docContentId+"\", ";
		str += "\"fullName\":\""+fullName+"\", ";
		str += "\"irdNumber\":\""+irdNumber+"\", ";
		str += "\"isTaxRateFromProvided\":\""+isTaxRateFromProvided+"\", ";
		str += "\"schedulePayActivityNumber\":\""+schedulePayActivityNumber+"\", ";
		str += "\"strCertificateStatus\":\""+strCertificateStatus+"\", ";
		str += "\"taxRate\":\""+taxRate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}