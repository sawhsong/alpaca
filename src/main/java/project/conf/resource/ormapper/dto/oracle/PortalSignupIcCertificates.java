/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_IC_CERTIFICATES - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupIcCertificates extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double certificatesId;
	private String CERTIFICATES_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String dirDeclSigned;
	private String DIR_DECL_SIGNED;
	private double incorpCertDocCntntId;
	private String INCORP_CERT_DOC_CNTNT_ID;
	private String ipaddress;
	private String IPADDRESS;
	private double lhldDocCntntId;
	private String LHLD_DOC_CNTNT_ID;
	private Date lhldDocExpiry;
	private String LHLD_DOC_EXPIRY;
	private String lhldRequired;
	private String LHLD_REQUIRED;
	private double profIndmDocCntntId;
	private String PROF_INDM_DOC_CNTNT_ID;
	private Date profIndmExpiry;
	private String PROF_INDM_EXPIRY;
	private double publLiabDocCntntId;
	private String PUBL_LIAB_DOC_CNTNT_ID;
	private Date publLiabExpiry;
	private String PUBL_LIAB_EXPIRY;
	private String sendOffline;
	private String SEND_OFFLINE;
	private String workingState;
	private String WORKING_STATE;
	private double wrkrsCompDocCntntId;
	private String WRKRS_COMP_DOC_CNTNT_ID;
	private Date wrkrsCompExpiry;
	private String WRKRS_COMP_EXPIRY;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalSignupIcCertificates() throws Exception {
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
		setFrwVarPrimaryKey("CERTIFICATES_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,LHLD_DOC_EXPIRY,PROF_INDM_EXPIRY,PUBL_LIAB_EXPIRY,WRKRS_COMP_EXPIRY");
		setFrwVarNumberColumn("USER_TF_ID,CERTIFICATES_ID,CREATED_BY,LAST_UPDATED_BY,INCORP_CERT_DOC_CNTNT_ID,LHLD_DOC_CNTNT_ID,PROF_INDM_DOC_CNTNT_ID,PUBL_LIAB_DOC_CNTNT_ID,WRKRS_COMP_DOC_CNTNT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("SEND_OFFLINE");
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

	public double getCertificatesId() {
		return certificatesId;
	}

	public void setCertificatesId(double certificatesId) throws Exception {
		this.certificatesId = certificatesId;
		setValueFromAccessor("CERTIFICATES_ID", CommonUtil.toString(certificatesId));
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

	public String getDirDeclSigned() {
		return dirDeclSigned;
	}

	public void setDirDeclSigned(String dirDeclSigned) throws Exception {
		this.dirDeclSigned = dirDeclSigned;
		setValueFromAccessor("DIR_DECL_SIGNED", dirDeclSigned);
	}

	public double getIncorpCertDocCntntId() {
		return incorpCertDocCntntId;
	}

	public void setIncorpCertDocCntntId(double incorpCertDocCntntId) throws Exception {
		this.incorpCertDocCntntId = incorpCertDocCntntId;
		setValueFromAccessor("INCORP_CERT_DOC_CNTNT_ID", CommonUtil.toString(incorpCertDocCntntId));
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) throws Exception {
		this.ipaddress = ipaddress;
		setValueFromAccessor("IPADDRESS", ipaddress);
	}

	public double getLhldDocCntntId() {
		return lhldDocCntntId;
	}

	public void setLhldDocCntntId(double lhldDocCntntId) throws Exception {
		this.lhldDocCntntId = lhldDocCntntId;
		setValueFromAccessor("LHLD_DOC_CNTNT_ID", CommonUtil.toString(lhldDocCntntId));
	}

	public Date getLhldDocExpiry() {
		return lhldDocExpiry;
	}

	public void setLhldDocExpiry(Date lhldDocExpiry) throws Exception {
		this.lhldDocExpiry = lhldDocExpiry;
		setValueFromAccessor("LHLD_DOC_EXPIRY", CommonUtil.toString(lhldDocExpiry));
	}

	public String getLhldRequired() {
		return lhldRequired;
	}

	public void setLhldRequired(String lhldRequired) throws Exception {
		this.lhldRequired = lhldRequired;
		setValueFromAccessor("LHLD_REQUIRED", lhldRequired);
	}

	public double getProfIndmDocCntntId() {
		return profIndmDocCntntId;
	}

	public void setProfIndmDocCntntId(double profIndmDocCntntId) throws Exception {
		this.profIndmDocCntntId = profIndmDocCntntId;
		setValueFromAccessor("PROF_INDM_DOC_CNTNT_ID", CommonUtil.toString(profIndmDocCntntId));
	}

	public Date getProfIndmExpiry() {
		return profIndmExpiry;
	}

	public void setProfIndmExpiry(Date profIndmExpiry) throws Exception {
		this.profIndmExpiry = profIndmExpiry;
		setValueFromAccessor("PROF_INDM_EXPIRY", CommonUtil.toString(profIndmExpiry));
	}

	public double getPublLiabDocCntntId() {
		return publLiabDocCntntId;
	}

	public void setPublLiabDocCntntId(double publLiabDocCntntId) throws Exception {
		this.publLiabDocCntntId = publLiabDocCntntId;
		setValueFromAccessor("PUBL_LIAB_DOC_CNTNT_ID", CommonUtil.toString(publLiabDocCntntId));
	}

	public Date getPublLiabExpiry() {
		return publLiabExpiry;
	}

	public void setPublLiabExpiry(Date publLiabExpiry) throws Exception {
		this.publLiabExpiry = publLiabExpiry;
		setValueFromAccessor("PUBL_LIAB_EXPIRY", CommonUtil.toString(publLiabExpiry));
	}

	public String getSendOffline() {
		return sendOffline;
	}

	public void setSendOffline(String sendOffline) throws Exception {
		this.sendOffline = sendOffline;
		setValueFromAccessor("SEND_OFFLINE", sendOffline);
	}

	public String getWorkingState() {
		return workingState;
	}

	public void setWorkingState(String workingState) throws Exception {
		this.workingState = workingState;
		setValueFromAccessor("WORKING_STATE", workingState);
	}

	public double getWrkrsCompDocCntntId() {
		return wrkrsCompDocCntntId;
	}

	public void setWrkrsCompDocCntntId(double wrkrsCompDocCntntId) throws Exception {
		this.wrkrsCompDocCntntId = wrkrsCompDocCntntId;
		setValueFromAccessor("WRKRS_COMP_DOC_CNTNT_ID", CommonUtil.toString(wrkrsCompDocCntntId));
	}

	public Date getWrkrsCompExpiry() {
		return wrkrsCompExpiry;
	}

	public void setWrkrsCompExpiry(Date wrkrsCompExpiry) throws Exception {
		this.wrkrsCompExpiry = wrkrsCompExpiry;
		setValueFromAccessor("WRKRS_COMP_EXPIRY", CommonUtil.toString(wrkrsCompExpiry));
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

		str += "userTfId : "+userTfId+"\n";
		str += "certificatesId : "+certificatesId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "dirDeclSigned : "+dirDeclSigned+"\n";
		str += "incorpCertDocCntntId : "+incorpCertDocCntntId+"\n";
		str += "ipaddress : "+ipaddress+"\n";
		str += "lhldDocCntntId : "+lhldDocCntntId+"\n";
		str += "lhldDocExpiry : "+lhldDocExpiry+"\n";
		str += "lhldRequired : "+lhldRequired+"\n";
		str += "profIndmDocCntntId : "+profIndmDocCntntId+"\n";
		str += "profIndmExpiry : "+profIndmExpiry+"\n";
		str += "publLiabDocCntntId : "+publLiabDocCntntId+"\n";
		str += "publLiabExpiry : "+publLiabExpiry+"\n";
		str += "sendOffline : "+sendOffline+"\n";
		str += "workingState : "+workingState+"\n";
		str += "wrkrsCompDocCntntId : "+wrkrsCompDocCntntId+"\n";
		str += "wrkrsCompExpiry : "+wrkrsCompExpiry+"\n";
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
		str += "<column name=\"certificatesId\" value=\""+certificatesId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"dirDeclSigned\" value=\""+dirDeclSigned+"\">";
		str += "<column name=\"incorpCertDocCntntId\" value=\""+incorpCertDocCntntId+"\">";
		str += "<column name=\"ipaddress\" value=\""+ipaddress+"\">";
		str += "<column name=\"lhldDocCntntId\" value=\""+lhldDocCntntId+"\">";
		str += "<column name=\"lhldDocExpiry\" value=\""+lhldDocExpiry+"\">";
		str += "<column name=\"lhldRequired\" value=\""+lhldRequired+"\">";
		str += "<column name=\"profIndmDocCntntId\" value=\""+profIndmDocCntntId+"\">";
		str += "<column name=\"profIndmExpiry\" value=\""+profIndmExpiry+"\">";
		str += "<column name=\"publLiabDocCntntId\" value=\""+publLiabDocCntntId+"\">";
		str += "<column name=\"publLiabExpiry\" value=\""+publLiabExpiry+"\">";
		str += "<column name=\"sendOffline\" value=\""+sendOffline+"\">";
		str += "<column name=\"workingState\" value=\""+workingState+"\">";
		str += "<column name=\"wrkrsCompDocCntntId\" value=\""+wrkrsCompDocCntntId+"\">";
		str += "<column name=\"wrkrsCompExpiry\" value=\""+wrkrsCompExpiry+"\">";
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
		str += "\"certificatesId\":\""+certificatesId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"dirDeclSigned\":\""+dirDeclSigned+"\", ";
		str += "\"incorpCertDocCntntId\":\""+incorpCertDocCntntId+"\", ";
		str += "\"ipaddress\":\""+ipaddress+"\", ";
		str += "\"lhldDocCntntId\":\""+lhldDocCntntId+"\", ";
		str += "\"lhldDocExpiry\":\""+lhldDocExpiry+"\", ";
		str += "\"lhldRequired\":\""+lhldRequired+"\", ";
		str += "\"profIndmDocCntntId\":\""+profIndmDocCntntId+"\", ";
		str += "\"profIndmExpiry\":\""+profIndmExpiry+"\", ";
		str += "\"publLiabDocCntntId\":\""+publLiabDocCntntId+"\", ";
		str += "\"publLiabExpiry\":\""+publLiabExpiry+"\", ";
		str += "\"sendOffline\":\""+sendOffline+"\", ";
		str += "\"workingState\":\""+workingState+"\", ";
		str += "\"wrkrsCompDocCntntId\":\""+wrkrsCompDocCntntId+"\", ";
		str += "\"wrkrsCompExpiry\":\""+wrkrsCompExpiry+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}