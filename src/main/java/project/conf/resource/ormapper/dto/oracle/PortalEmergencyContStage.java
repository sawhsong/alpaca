/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_EMERGENCY_CONT_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalEmergencyContStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double submissionId;
	private String SUBMISSION_ID;
	private double addressId;
	private String ADDRESS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double personId;
	private String PERSON_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String emerContactAddressLine;
	private String EMER_CONTACT_ADDRESS_LINE;
	private String emerContactCountry;
	private String EMER_CONTACT_COUNTRY;
	private String emerContactEmail;
	private String EMER_CONTACT_EMAIL;
	private String emerContactName;
	private String EMER_CONTACT_NAME;
	private String emerContactPhone;
	private String EMER_CONTACT_PHONE;
	private String emerContactPostCode;
	private String EMER_CONTACT_POST_CODE;
	private String emerContactRelationship;
	private String EMER_CONTACT_RELATIONSHIP;
	private String emerContactState;
	private String EMER_CONTACT_STATE;
	private String emerContactSuburb;
	private String EMER_CONTACT_SUBURB;
	private Date fromDate;
	private String FROM_DATE;
	private Date toDate;
	private String TO_DATE;
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
	public PortalEmergencyContStage() throws Exception {
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
		setFrwVarPrimaryKey("SUBMISSION_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,FROM_DATE,TO_DATE");
		setFrwVarNumberColumn("SUBMISSION_ID,ADDRESS_ID,CREATED_BY,LAST_UPDATED_BY,PERSON_ID,BUSINESS_GROUP_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(double submissionId) throws Exception {
		this.submissionId = submissionId;
		setValueFromAccessor("SUBMISSION_ID", CommonUtil.toString(submissionId));
	}

	public double getAddressId() {
		return addressId;
	}

	public void setAddressId(double addressId) throws Exception {
		this.addressId = addressId;
		setValueFromAccessor("ADDRESS_ID", CommonUtil.toString(addressId));
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

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getEmerContactAddressLine() {
		return emerContactAddressLine;
	}

	public void setEmerContactAddressLine(String emerContactAddressLine) throws Exception {
		this.emerContactAddressLine = emerContactAddressLine;
		setValueFromAccessor("EMER_CONTACT_ADDRESS_LINE", emerContactAddressLine);
	}

	public String getEmerContactCountry() {
		return emerContactCountry;
	}

	public void setEmerContactCountry(String emerContactCountry) throws Exception {
		this.emerContactCountry = emerContactCountry;
		setValueFromAccessor("EMER_CONTACT_COUNTRY", emerContactCountry);
	}

	public String getEmerContactEmail() {
		return emerContactEmail;
	}

	public void setEmerContactEmail(String emerContactEmail) throws Exception {
		this.emerContactEmail = emerContactEmail;
		setValueFromAccessor("EMER_CONTACT_EMAIL", emerContactEmail);
	}

	public String getEmerContactName() {
		return emerContactName;
	}

	public void setEmerContactName(String emerContactName) throws Exception {
		this.emerContactName = emerContactName;
		setValueFromAccessor("EMER_CONTACT_NAME", emerContactName);
	}

	public String getEmerContactPhone() {
		return emerContactPhone;
	}

	public void setEmerContactPhone(String emerContactPhone) throws Exception {
		this.emerContactPhone = emerContactPhone;
		setValueFromAccessor("EMER_CONTACT_PHONE", emerContactPhone);
	}

	public String getEmerContactPostCode() {
		return emerContactPostCode;
	}

	public void setEmerContactPostCode(String emerContactPostCode) throws Exception {
		this.emerContactPostCode = emerContactPostCode;
		setValueFromAccessor("EMER_CONTACT_POST_CODE", emerContactPostCode);
	}

	public String getEmerContactRelationship() {
		return emerContactRelationship;
	}

	public void setEmerContactRelationship(String emerContactRelationship) throws Exception {
		this.emerContactRelationship = emerContactRelationship;
		setValueFromAccessor("EMER_CONTACT_RELATIONSHIP", emerContactRelationship);
	}

	public String getEmerContactState() {
		return emerContactState;
	}

	public void setEmerContactState(String emerContactState) throws Exception {
		this.emerContactState = emerContactState;
		setValueFromAccessor("EMER_CONTACT_STATE", emerContactState);
	}

	public String getEmerContactSuburb() {
		return emerContactSuburb;
	}

	public void setEmerContactSuburb(String emerContactSuburb) throws Exception {
		this.emerContactSuburb = emerContactSuburb;
		setValueFromAccessor("EMER_CONTACT_SUBURB", emerContactSuburb);
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) throws Exception {
		this.fromDate = fromDate;
		setValueFromAccessor("FROM_DATE", CommonUtil.toString(fromDate));
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) throws Exception {
		this.toDate = toDate;
		setValueFromAccessor("TO_DATE", CommonUtil.toString(toDate));
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

		str += "submissionId : "+submissionId+"\n";
		str += "addressId : "+addressId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "personId : "+personId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "emerContactAddressLine : "+emerContactAddressLine+"\n";
		str += "emerContactCountry : "+emerContactCountry+"\n";
		str += "emerContactEmail : "+emerContactEmail+"\n";
		str += "emerContactName : "+emerContactName+"\n";
		str += "emerContactPhone : "+emerContactPhone+"\n";
		str += "emerContactPostCode : "+emerContactPostCode+"\n";
		str += "emerContactRelationship : "+emerContactRelationship+"\n";
		str += "emerContactState : "+emerContactState+"\n";
		str += "emerContactSuburb : "+emerContactSuburb+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "toDate : "+toDate+"\n";
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

		str += "<column name=\"submissionId\" value=\""+submissionId+"\">";
		str += "<column name=\"addressId\" value=\""+addressId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"emerContactAddressLine\" value=\""+emerContactAddressLine+"\">";
		str += "<column name=\"emerContactCountry\" value=\""+emerContactCountry+"\">";
		str += "<column name=\"emerContactEmail\" value=\""+emerContactEmail+"\">";
		str += "<column name=\"emerContactName\" value=\""+emerContactName+"\">";
		str += "<column name=\"emerContactPhone\" value=\""+emerContactPhone+"\">";
		str += "<column name=\"emerContactPostCode\" value=\""+emerContactPostCode+"\">";
		str += "<column name=\"emerContactRelationship\" value=\""+emerContactRelationship+"\">";
		str += "<column name=\"emerContactState\" value=\""+emerContactState+"\">";
		str += "<column name=\"emerContactSuburb\" value=\""+emerContactSuburb+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
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

		str += "\"submissionId\":\""+submissionId+"\", ";
		str += "\"addressId\":\""+addressId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"emerContactAddressLine\":\""+emerContactAddressLine+"\", ";
		str += "\"emerContactCountry\":\""+emerContactCountry+"\", ";
		str += "\"emerContactEmail\":\""+emerContactEmail+"\", ";
		str += "\"emerContactName\":\""+emerContactName+"\", ";
		str += "\"emerContactPhone\":\""+emerContactPhone+"\", ";
		str += "\"emerContactPostCode\":\""+emerContactPostCode+"\", ";
		str += "\"emerContactRelationship\":\""+emerContactRelationship+"\", ";
		str += "\"emerContactState\":\""+emerContactState+"\", ";
		str += "\"emerContactSuburb\":\""+emerContactSuburb+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}