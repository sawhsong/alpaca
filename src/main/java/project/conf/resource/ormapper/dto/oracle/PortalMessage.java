/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_MESSAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalMessage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double messageId;
	private String MESSAGE_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private Date expiryDate;
	private String EXPIRY_DATE;
	private String generationType;
	private String GENERATION_TYPE;
	private String messageBody;
	private String MESSAGE_BODY;
	private String messageCategory;
	private String MESSAGE_CATEGORY;
	private String messageClassification;
	private String MESSAGE_CLASSIFICATION;
	private String messageDestination;
	private String MESSAGE_DESTINATION;
	private double messageReceiver;
	private String MESSAGE_RECEIVER;
	private String messageSource;
	private String MESSAGE_SOURCE;
	private String messageStatus;
	private String MESSAGE_STATUS;
	private String messageSubject;
	private String MESSAGE_SUBJECT;
	private double organisationId;
	private String ORGANISATION_ID;
	private double personId;
	private String PERSON_ID;
	private String receiverType;
	private String RECEIVER_TYPE;
	private Date visibleDate;
	private String VISIBLE_DATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalMessage() throws Exception {
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
		setFrwVarPrimaryKey("MESSAGE_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,EXPIRY_DATE,VISIBLE_DATE");
		setFrwVarNumberColumn("MESSAGE_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,MESSAGE_RECEIVER,ORGANISATION_ID,PERSON_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getMessageId() {
		return messageId;
	}

	public void setMessageId(double messageId) throws Exception {
		this.messageId = messageId;
		setValueFromAccessor("MESSAGE_ID", CommonUtil.toString(messageId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
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

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) throws Exception {
		this.expiryDate = expiryDate;
		setValueFromAccessor("EXPIRY_DATE", CommonUtil.toString(expiryDate));
	}

	public String getGenerationType() {
		return generationType;
	}

	public void setGenerationType(String generationType) throws Exception {
		this.generationType = generationType;
		setValueFromAccessor("GENERATION_TYPE", generationType);
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) throws Exception {
		this.messageBody = messageBody;
		setValueFromAccessor("MESSAGE_BODY", messageBody);
	}

	public String getMessageCategory() {
		return messageCategory;
	}

	public void setMessageCategory(String messageCategory) throws Exception {
		this.messageCategory = messageCategory;
		setValueFromAccessor("MESSAGE_CATEGORY", messageCategory);
	}

	public String getMessageClassification() {
		return messageClassification;
	}

	public void setMessageClassification(String messageClassification) throws Exception {
		this.messageClassification = messageClassification;
		setValueFromAccessor("MESSAGE_CLASSIFICATION", messageClassification);
	}

	public String getMessageDestination() {
		return messageDestination;
	}

	public void setMessageDestination(String messageDestination) throws Exception {
		this.messageDestination = messageDestination;
		setValueFromAccessor("MESSAGE_DESTINATION", messageDestination);
	}

	public double getMessageReceiver() {
		return messageReceiver;
	}

	public void setMessageReceiver(double messageReceiver) throws Exception {
		this.messageReceiver = messageReceiver;
		setValueFromAccessor("MESSAGE_RECEIVER", CommonUtil.toString(messageReceiver));
	}

	public String getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(String messageSource) throws Exception {
		this.messageSource = messageSource;
		setValueFromAccessor("MESSAGE_SOURCE", messageSource);
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) throws Exception {
		this.messageStatus = messageStatus;
		setValueFromAccessor("MESSAGE_STATUS", messageStatus);
	}

	public String getMessageSubject() {
		return messageSubject;
	}

	public void setMessageSubject(String messageSubject) throws Exception {
		this.messageSubject = messageSubject;
		setValueFromAccessor("MESSAGE_SUBJECT", messageSubject);
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getReceiverType() {
		return receiverType;
	}

	public void setReceiverType(String receiverType) throws Exception {
		this.receiverType = receiverType;
		setValueFromAccessor("RECEIVER_TYPE", receiverType);
	}

	public Date getVisibleDate() {
		return visibleDate;
	}

	public void setVisibleDate(Date visibleDate) throws Exception {
		this.visibleDate = visibleDate;
		setValueFromAccessor("VISIBLE_DATE", CommonUtil.toString(visibleDate));
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

		str += "messageId : "+messageId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "expiryDate : "+expiryDate+"\n";
		str += "generationType : "+generationType+"\n";
		str += "messageBody : "+messageBody+"\n";
		str += "messageCategory : "+messageCategory+"\n";
		str += "messageClassification : "+messageClassification+"\n";
		str += "messageDestination : "+messageDestination+"\n";
		str += "messageReceiver : "+messageReceiver+"\n";
		str += "messageSource : "+messageSource+"\n";
		str += "messageStatus : "+messageStatus+"\n";
		str += "messageSubject : "+messageSubject+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "personId : "+personId+"\n";
		str += "receiverType : "+receiverType+"\n";
		str += "visibleDate : "+visibleDate+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"messageId\" value=\""+messageId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"expiryDate\" value=\""+expiryDate+"\">";
		str += "<column name=\"generationType\" value=\""+generationType+"\">";
		str += "<column name=\"messageBody\" value=\""+messageBody+"\">";
		str += "<column name=\"messageCategory\" value=\""+messageCategory+"\">";
		str += "<column name=\"messageClassification\" value=\""+messageClassification+"\">";
		str += "<column name=\"messageDestination\" value=\""+messageDestination+"\">";
		str += "<column name=\"messageReceiver\" value=\""+messageReceiver+"\">";
		str += "<column name=\"messageSource\" value=\""+messageSource+"\">";
		str += "<column name=\"messageStatus\" value=\""+messageStatus+"\">";
		str += "<column name=\"messageSubject\" value=\""+messageSubject+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"receiverType\" value=\""+receiverType+"\">";
		str += "<column name=\"visibleDate\" value=\""+visibleDate+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"messageId\":\""+messageId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"expiryDate\":\""+expiryDate+"\", ";
		str += "\"generationType\":\""+generationType+"\", ";
		str += "\"messageBody\":\""+messageBody+"\", ";
		str += "\"messageCategory\":\""+messageCategory+"\", ";
		str += "\"messageClassification\":\""+messageClassification+"\", ";
		str += "\"messageDestination\":\""+messageDestination+"\", ";
		str += "\"messageReceiver\":\""+messageReceiver+"\", ";
		str += "\"messageSource\":\""+messageSource+"\", ";
		str += "\"messageStatus\":\""+messageStatus+"\", ";
		str += "\"messageSubject\":\""+messageSubject+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"receiverType\":\""+receiverType+"\", ";
		str += "\"visibleDate\":\""+visibleDate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}