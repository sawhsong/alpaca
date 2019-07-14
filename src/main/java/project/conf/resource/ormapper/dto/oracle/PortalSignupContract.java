/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_CONTRACT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupContract extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double contractDetailsId;
	private String CONTRACT_DETAILS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double userTfId;
	private String USER_TF_ID;
	private String acceptType;
	private String ACCEPT_TYPE;
	private String documentContentId;
	private String DOCUMENT_CONTENT_ID;
	private String downloadedContract;
	private String DOWNLOADED_CONTRACT;
	private Date electronicExeDateTime;
	private String ELECTRONIC_EXE_DATE_TIME;
	private String electronicExeUserEmail;
	private String ELECTRONIC_EXE_USER_EMAIL;
	private String electronicExeUserFullName;
	private String ELECTRONIC_EXE_USER_FULL_NAME;
	private String electronicExeUserIpAddress;
	private String ELECTRONIC_EXE_USER_IP_ADDRESS;
	private String executionType;
	private String EXECUTION_TYPE;
	private String sendType;
	private String SEND_TYPE;
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
	public PortalSignupContract() throws Exception {
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
		setFrwVarPrimaryKey("CONTRACT_DETAILS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,ELECTRONIC_EXE_DATE_TIME");
		setFrwVarNumberColumn("CONTRACT_DETAILS_ID,CREATED_BY,LAST_UPDATED_BY,USER_TF_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getContractDetailsId() {
		return contractDetailsId;
	}

	public void setContractDetailsId(double contractDetailsId) throws Exception {
		this.contractDetailsId = contractDetailsId;
		setValueFromAccessor("CONTRACT_DETAILS_ID", CommonUtil.toString(contractDetailsId));
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

	public double getUserTfId() {
		return userTfId;
	}

	public void setUserTfId(double userTfId) throws Exception {
		this.userTfId = userTfId;
		setValueFromAccessor("USER_TF_ID", CommonUtil.toString(userTfId));
	}

	public String getAcceptType() {
		return acceptType;
	}

	public void setAcceptType(String acceptType) throws Exception {
		this.acceptType = acceptType;
		setValueFromAccessor("ACCEPT_TYPE", acceptType);
	}

	public String getDocumentContentId() {
		return documentContentId;
	}

	public void setDocumentContentId(String documentContentId) throws Exception {
		this.documentContentId = documentContentId;
		setValueFromAccessor("DOCUMENT_CONTENT_ID", documentContentId);
	}

	public String getDownloadedContract() {
		return downloadedContract;
	}

	public void setDownloadedContract(String downloadedContract) throws Exception {
		this.downloadedContract = downloadedContract;
		setValueFromAccessor("DOWNLOADED_CONTRACT", downloadedContract);
	}

	public Date getElectronicExeDateTime() {
		return electronicExeDateTime;
	}

	public void setElectronicExeDateTime(Date electronicExeDateTime) throws Exception {
		this.electronicExeDateTime = electronicExeDateTime;
		setValueFromAccessor("ELECTRONIC_EXE_DATE_TIME", CommonUtil.toString(electronicExeDateTime));
	}

	public String getElectronicExeUserEmail() {
		return electronicExeUserEmail;
	}

	public void setElectronicExeUserEmail(String electronicExeUserEmail) throws Exception {
		this.electronicExeUserEmail = electronicExeUserEmail;
		setValueFromAccessor("ELECTRONIC_EXE_USER_EMAIL", electronicExeUserEmail);
	}

	public String getElectronicExeUserFullName() {
		return electronicExeUserFullName;
	}

	public void setElectronicExeUserFullName(String electronicExeUserFullName) throws Exception {
		this.electronicExeUserFullName = electronicExeUserFullName;
		setValueFromAccessor("ELECTRONIC_EXE_USER_FULL_NAME", electronicExeUserFullName);
	}

	public String getElectronicExeUserIpAddress() {
		return electronicExeUserIpAddress;
	}

	public void setElectronicExeUserIpAddress(String electronicExeUserIpAddress) throws Exception {
		this.electronicExeUserIpAddress = electronicExeUserIpAddress;
		setValueFromAccessor("ELECTRONIC_EXE_USER_IP_ADDRESS", electronicExeUserIpAddress);
	}

	public String getExecutionType() {
		return executionType;
	}

	public void setExecutionType(String executionType) throws Exception {
		this.executionType = executionType;
		setValueFromAccessor("EXECUTION_TYPE", executionType);
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) throws Exception {
		this.sendType = sendType;
		setValueFromAccessor("SEND_TYPE", sendType);
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

		str += "contractDetailsId : "+contractDetailsId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "userTfId : "+userTfId+"\n";
		str += "acceptType : "+acceptType+"\n";
		str += "documentContentId : "+documentContentId+"\n";
		str += "downloadedContract : "+downloadedContract+"\n";
		str += "electronicExeDateTime : "+electronicExeDateTime+"\n";
		str += "electronicExeUserEmail : "+electronicExeUserEmail+"\n";
		str += "electronicExeUserFullName : "+electronicExeUserFullName+"\n";
		str += "electronicExeUserIpAddress : "+electronicExeUserIpAddress+"\n";
		str += "executionType : "+executionType+"\n";
		str += "sendType : "+sendType+"\n";
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

		str += "<column name=\"contractDetailsId\" value=\""+contractDetailsId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"userTfId\" value=\""+userTfId+"\">";
		str += "<column name=\"acceptType\" value=\""+acceptType+"\">";
		str += "<column name=\"documentContentId\" value=\""+documentContentId+"\">";
		str += "<column name=\"downloadedContract\" value=\""+downloadedContract+"\">";
		str += "<column name=\"electronicExeDateTime\" value=\""+electronicExeDateTime+"\">";
		str += "<column name=\"electronicExeUserEmail\" value=\""+electronicExeUserEmail+"\">";
		str += "<column name=\"electronicExeUserFullName\" value=\""+electronicExeUserFullName+"\">";
		str += "<column name=\"electronicExeUserIpAddress\" value=\""+electronicExeUserIpAddress+"\">";
		str += "<column name=\"executionType\" value=\""+executionType+"\">";
		str += "<column name=\"sendType\" value=\""+sendType+"\">";
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

		str += "\"contractDetailsId\":\""+contractDetailsId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"userTfId\":\""+userTfId+"\", ";
		str += "\"acceptType\":\""+acceptType+"\", ";
		str += "\"documentContentId\":\""+documentContentId+"\", ";
		str += "\"downloadedContract\":\""+downloadedContract+"\", ";
		str += "\"electronicExeDateTime\":\""+electronicExeDateTime+"\", ";
		str += "\"electronicExeUserEmail\":\""+electronicExeUserEmail+"\", ";
		str += "\"electronicExeUserFullName\":\""+electronicExeUserFullName+"\", ";
		str += "\"electronicExeUserIpAddress\":\""+electronicExeUserIpAddress+"\", ";
		str += "\"executionType\":\""+executionType+"\", ";
		str += "\"sendType\":\""+sendType+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}