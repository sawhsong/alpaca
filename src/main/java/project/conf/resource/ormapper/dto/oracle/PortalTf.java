/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_TF - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalTf extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double tfId;
	private String TF_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String tfCode;
	private String TF_CODE;
	private String tfName;
	private String TF_NAME;
	private double daysComplete;
	private String DAYS_COMPLETE;
	private String isActive;
	private String IS_ACTIVE;
	private String reminderEmail;
	private String REMINDER_EMAIL;
	private String reminderEmailSubject;
	private String REMINDER_EMAIL_SUBJECT;
	private String tfDescription;
	private String TF_DESCRIPTION;
	private double totalStep;
	private String TOTAL_STEP;
	private String welcomeEmail;
	private String WELCOME_EMAIL;
	private String welcomeEmail2;
	private String WELCOME_EMAIL2;
	private String welcomeEmailSubject;
	private String WELCOME_EMAIL_SUBJECT;
	private String welcomeEmailSubject2;
	private String WELCOME_EMAIL_SUBJECT2;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalTf() throws Exception {
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
		setFrwVarPrimaryKey("TF_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("TF_ID,CREATED_BY,LAST_UPDATED_BY,DAYS_COMPLETE,TOTAL_STEP");
		setFrwVarClobColumn("REMINDER_EMAIL,WELCOME_EMAIL,WELCOME_EMAIL2");
		setFrwVarDefaultColumn("IS_ACTIVE");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getTfId() {
		return tfId;
	}

	public void setTfId(double tfId) throws Exception {
		this.tfId = tfId;
		setValueFromAccessor("TF_ID", CommonUtil.toString(tfId));
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

	public String getTfCode() {
		return tfCode;
	}

	public void setTfCode(String tfCode) throws Exception {
		this.tfCode = tfCode;
		setValueFromAccessor("TF_CODE", tfCode);
	}

	public String getTfName() {
		return tfName;
	}

	public void setTfName(String tfName) throws Exception {
		this.tfName = tfName;
		setValueFromAccessor("TF_NAME", tfName);
	}

	public double getDaysComplete() {
		return daysComplete;
	}

	public void setDaysComplete(double daysComplete) throws Exception {
		this.daysComplete = daysComplete;
		setValueFromAccessor("DAYS_COMPLETE", CommonUtil.toString(daysComplete));
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
	}

	public String getReminderEmail() {
		return reminderEmail;
	}

	public void setReminderEmail(String reminderEmail) throws Exception {
		this.reminderEmail = reminderEmail;
		setValueFromAccessor("REMINDER_EMAIL", reminderEmail);
	}

	public String getReminderEmailSubject() {
		return reminderEmailSubject;
	}

	public void setReminderEmailSubject(String reminderEmailSubject) throws Exception {
		this.reminderEmailSubject = reminderEmailSubject;
		setValueFromAccessor("REMINDER_EMAIL_SUBJECT", reminderEmailSubject);
	}

	public String getTfDescription() {
		return tfDescription;
	}

	public void setTfDescription(String tfDescription) throws Exception {
		this.tfDescription = tfDescription;
		setValueFromAccessor("TF_DESCRIPTION", tfDescription);
	}

	public double getTotalStep() {
		return totalStep;
	}

	public void setTotalStep(double totalStep) throws Exception {
		this.totalStep = totalStep;
		setValueFromAccessor("TOTAL_STEP", CommonUtil.toString(totalStep));
	}

	public String getWelcomeEmail() {
		return welcomeEmail;
	}

	public void setWelcomeEmail(String welcomeEmail) throws Exception {
		this.welcomeEmail = welcomeEmail;
		setValueFromAccessor("WELCOME_EMAIL", welcomeEmail);
	}

	public String getWelcomeEmail2() {
		return welcomeEmail2;
	}

	public void setWelcomeEmail2(String welcomeEmail2) throws Exception {
		this.welcomeEmail2 = welcomeEmail2;
		setValueFromAccessor("WELCOME_EMAIL2", welcomeEmail2);
	}

	public String getWelcomeEmailSubject() {
		return welcomeEmailSubject;
	}

	public void setWelcomeEmailSubject(String welcomeEmailSubject) throws Exception {
		this.welcomeEmailSubject = welcomeEmailSubject;
		setValueFromAccessor("WELCOME_EMAIL_SUBJECT", welcomeEmailSubject);
	}

	public String getWelcomeEmailSubject2() {
		return welcomeEmailSubject2;
	}

	public void setWelcomeEmailSubject2(String welcomeEmailSubject2) throws Exception {
		this.welcomeEmailSubject2 = welcomeEmailSubject2;
		setValueFromAccessor("WELCOME_EMAIL_SUBJECT2", welcomeEmailSubject2);
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

		str += "tfId : "+tfId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "tfCode : "+tfCode+"\n";
		str += "tfName : "+tfName+"\n";
		str += "daysComplete : "+daysComplete+"\n";
		str += "isActive : "+isActive+"\n";
		str += "reminderEmail : "+reminderEmail+"\n";
		str += "reminderEmailSubject : "+reminderEmailSubject+"\n";
		str += "tfDescription : "+tfDescription+"\n";
		str += "totalStep : "+totalStep+"\n";
		str += "welcomeEmail : "+welcomeEmail+"\n";
		str += "welcomeEmail2 : "+welcomeEmail2+"\n";
		str += "welcomeEmailSubject : "+welcomeEmailSubject+"\n";
		str += "welcomeEmailSubject2 : "+welcomeEmailSubject2+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"tfId\" value=\""+tfId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"tfCode\" value=\""+tfCode+"\">";
		str += "<column name=\"tfName\" value=\""+tfName+"\">";
		str += "<column name=\"daysComplete\" value=\""+daysComplete+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"reminderEmail\" value=\""+reminderEmail+"\">";
		str += "<column name=\"reminderEmailSubject\" value=\""+reminderEmailSubject+"\">";
		str += "<column name=\"tfDescription\" value=\""+tfDescription+"\">";
		str += "<column name=\"totalStep\" value=\""+totalStep+"\">";
		str += "<column name=\"welcomeEmail\" value=\""+welcomeEmail+"\">";
		str += "<column name=\"welcomeEmail2\" value=\""+welcomeEmail2+"\">";
		str += "<column name=\"welcomeEmailSubject\" value=\""+welcomeEmailSubject+"\">";
		str += "<column name=\"welcomeEmailSubject2\" value=\""+welcomeEmailSubject2+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"tfId\":\""+tfId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"tfCode\":\""+tfCode+"\", ";
		str += "\"tfName\":\""+tfName+"\", ";
		str += "\"daysComplete\":\""+daysComplete+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"reminderEmail\":\""+reminderEmail+"\", ";
		str += "\"reminderEmailSubject\":\""+reminderEmailSubject+"\", ";
		str += "\"tfDescription\":\""+tfDescription+"\", ";
		str += "\"totalStep\":\""+totalStep+"\", ";
		str += "\"welcomeEmail\":\""+welcomeEmail+"\", ";
		str += "\"welcomeEmail2\":\""+welcomeEmail2+"\", ";
		str += "\"welcomeEmailSubject\":\""+welcomeEmailSubject+"\", ";
		str += "\"welcomeEmailSubject2\":\""+welcomeEmailSubject2+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}