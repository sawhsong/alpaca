/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_EMER_CONTACT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupEmerContact extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double emerContactId;
	private String EMER_CONTACT_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String emergrncyContactCheck;
	private String EMERGRNCY_CONTACT_CHECK;
	private String emerContactName;
	private String EMER_CONTACT_NAME;
	private String emerContactPhone;
	private String EMER_CONTACT_PHONE;
	private String emerContactRelationship;
	private String EMER_CONTACT_RELATIONSHIP;
	private String ipAddress;
	private String IP_ADDRESS;
	private String isAnyMedicalCondition;
	private String IS_ANY_MEDICAL_CONDITION;
	private String isPreExisitingInjury;
	private String IS_PRE_EXISITING_INJURY;
	private String medicalConditionDesc;
	private String MEDICAL_CONDITION_DESC;
	private String preExisitingInjuryDesc;
	private String PRE_EXISITING_INJURY_DESC;
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
	public PortalSignupEmerContact() throws Exception {
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
		setFrwVarPrimaryKey("EMER_CONTACT_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("USER_TF_ID,EMER_CONTACT_ID,CREATED_BY,LAST_UPDATED_BY");
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

	public double getEmerContactId() {
		return emerContactId;
	}

	public void setEmerContactId(double emerContactId) throws Exception {
		this.emerContactId = emerContactId;
		setValueFromAccessor("EMER_CONTACT_ID", CommonUtil.toString(emerContactId));
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

	public String getEmergrncyContactCheck() {
		return emergrncyContactCheck;
	}

	public void setEmergrncyContactCheck(String emergrncyContactCheck) throws Exception {
		this.emergrncyContactCheck = emergrncyContactCheck;
		setValueFromAccessor("EMERGRNCY_CONTACT_CHECK", emergrncyContactCheck);
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

	public String getEmerContactRelationship() {
		return emerContactRelationship;
	}

	public void setEmerContactRelationship(String emerContactRelationship) throws Exception {
		this.emerContactRelationship = emerContactRelationship;
		setValueFromAccessor("EMER_CONTACT_RELATIONSHIP", emerContactRelationship);
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) throws Exception {
		this.ipAddress = ipAddress;
		setValueFromAccessor("IP_ADDRESS", ipAddress);
	}

	public String getIsAnyMedicalCondition() {
		return isAnyMedicalCondition;
	}

	public void setIsAnyMedicalCondition(String isAnyMedicalCondition) throws Exception {
		this.isAnyMedicalCondition = isAnyMedicalCondition;
		setValueFromAccessor("IS_ANY_MEDICAL_CONDITION", isAnyMedicalCondition);
	}

	public String getIsPreExisitingInjury() {
		return isPreExisitingInjury;
	}

	public void setIsPreExisitingInjury(String isPreExisitingInjury) throws Exception {
		this.isPreExisitingInjury = isPreExisitingInjury;
		setValueFromAccessor("IS_PRE_EXISITING_INJURY", isPreExisitingInjury);
	}

	public String getMedicalConditionDesc() {
		return medicalConditionDesc;
	}

	public void setMedicalConditionDesc(String medicalConditionDesc) throws Exception {
		this.medicalConditionDesc = medicalConditionDesc;
		setValueFromAccessor("MEDICAL_CONDITION_DESC", medicalConditionDesc);
	}

	public String getPreExisitingInjuryDesc() {
		return preExisitingInjuryDesc;
	}

	public void setPreExisitingInjuryDesc(String preExisitingInjuryDesc) throws Exception {
		this.preExisitingInjuryDesc = preExisitingInjuryDesc;
		setValueFromAccessor("PRE_EXISITING_INJURY_DESC", preExisitingInjuryDesc);
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
		str += "emerContactId : "+emerContactId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "emergrncyContactCheck : "+emergrncyContactCheck+"\n";
		str += "emerContactName : "+emerContactName+"\n";
		str += "emerContactPhone : "+emerContactPhone+"\n";
		str += "emerContactRelationship : "+emerContactRelationship+"\n";
		str += "ipAddress : "+ipAddress+"\n";
		str += "isAnyMedicalCondition : "+isAnyMedicalCondition+"\n";
		str += "isPreExisitingInjury : "+isPreExisitingInjury+"\n";
		str += "medicalConditionDesc : "+medicalConditionDesc+"\n";
		str += "preExisitingInjuryDesc : "+preExisitingInjuryDesc+"\n";
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
		str += "<column name=\"emerContactId\" value=\""+emerContactId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"emergrncyContactCheck\" value=\""+emergrncyContactCheck+"\">";
		str += "<column name=\"emerContactName\" value=\""+emerContactName+"\">";
		str += "<column name=\"emerContactPhone\" value=\""+emerContactPhone+"\">";
		str += "<column name=\"emerContactRelationship\" value=\""+emerContactRelationship+"\">";
		str += "<column name=\"ipAddress\" value=\""+ipAddress+"\">";
		str += "<column name=\"isAnyMedicalCondition\" value=\""+isAnyMedicalCondition+"\">";
		str += "<column name=\"isPreExisitingInjury\" value=\""+isPreExisitingInjury+"\">";
		str += "<column name=\"medicalConditionDesc\" value=\""+medicalConditionDesc+"\">";
		str += "<column name=\"preExisitingInjuryDesc\" value=\""+preExisitingInjuryDesc+"\">";
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
		str += "\"emerContactId\":\""+emerContactId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"emergrncyContactCheck\":\""+emergrncyContactCheck+"\", ";
		str += "\"emerContactName\":\""+emerContactName+"\", ";
		str += "\"emerContactPhone\":\""+emerContactPhone+"\", ";
		str += "\"emerContactRelationship\":\""+emerContactRelationship+"\", ";
		str += "\"ipAddress\":\""+ipAddress+"\", ";
		str += "\"isAnyMedicalCondition\":\""+isAnyMedicalCondition+"\", ";
		str += "\"isPreExisitingInjury\":\""+isPreExisitingInjury+"\", ";
		str += "\"medicalConditionDesc\":\""+medicalConditionDesc+"\", ";
		str += "\"preExisitingInjuryDesc\":\""+preExisitingInjuryDesc+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}