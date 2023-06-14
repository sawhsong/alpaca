/**************************************************************************************************
 * Framework Generated DTO Source
 * - MRN_EMAIL_SENDER - Email sender
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class MrnEmailSender extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String emailSenderId;
	private String EMAIL_SENDER_ID;
	private Date actionDate;
	private String ACTION_DATE;
	private String actionName;
	private String ACTION_NAME;
	private String actionSrc;
	private String ACTION_SRC;
	private String fromEmail;
	private String FROM_EMAIL;
	private String status;
	private String STATUS;
	private String subject;
	private String SUBJECT;
	private String toEmail;
	private String TO_EMAIL;
	private String bccEmail;
	private String BCC_EMAIL;
	private String ccEmail;
	private String CC_EMAIL;
	private String contents;
	private String CONTENTS;
	private String fromName;
	private String FROM_NAME;
	private Date insertDate;
	private String INSERT_DATE;
	private String insertUserId;
	private String INSERT_USER_ID;
	private String templateName;
	private String TEMPLATE_NAME;
	private String templatePath;
	private String TEMPLATE_PATH;
	private String toName;
	private String TO_NAME;
	private Date updateDate;
	private String UPDATE_DATE;
	private String updateUserId;
	private String UPDATE_USER_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public MrnEmailSender() throws Exception {
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
		setFrwVarPrimaryKey("EMAIL_SENDER_ID");
		setFrwVarDateColumn("ACTION_DATE,INSERT_DATE,UPDATE_DATE");
		setFrwVarNumberColumn("");
		setFrwVarClobColumn("CONTENTS");
		setFrwVarDefaultColumn("CONTENTS,INSERT_DATE");
		setFrwVarDefaultValue("EMPTY_CLOB(),sysdate");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getEmailSenderId() {
		return emailSenderId;
	}

	public void setEmailSenderId(String emailSenderId) throws Exception {
		this.emailSenderId = emailSenderId;
		setValueFromAccessor("EMAIL_SENDER_ID", emailSenderId);
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) throws Exception {
		this.actionDate = actionDate;
		setValueFromAccessor("ACTION_DATE", CommonUtil.toString(actionDate));
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) throws Exception {
		this.actionName = actionName;
		setValueFromAccessor("ACTION_NAME", actionName);
	}

	public String getActionSrc() {
		return actionSrc;
	}

	public void setActionSrc(String actionSrc) throws Exception {
		this.actionSrc = actionSrc;
		setValueFromAccessor("ACTION_SRC", actionSrc);
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) throws Exception {
		this.fromEmail = fromEmail;
		setValueFromAccessor("FROM_EMAIL", fromEmail);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) throws Exception {
		this.subject = subject;
		setValueFromAccessor("SUBJECT", subject);
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) throws Exception {
		this.toEmail = toEmail;
		setValueFromAccessor("TO_EMAIL", toEmail);
	}

	public String getBccEmail() {
		return bccEmail;
	}

	public void setBccEmail(String bccEmail) throws Exception {
		this.bccEmail = bccEmail;
		setValueFromAccessor("BCC_EMAIL", bccEmail);
	}

	public String getCcEmail() {
		return ccEmail;
	}

	public void setCcEmail(String ccEmail) throws Exception {
		this.ccEmail = ccEmail;
		setValueFromAccessor("CC_EMAIL", ccEmail);
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) throws Exception {
		this.contents = contents;
		setValueFromAccessor("CONTENTS", contents);
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) throws Exception {
		this.fromName = fromName;
		setValueFromAccessor("FROM_NAME", fromName);
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) throws Exception {
		this.insertDate = insertDate;
		setValueFromAccessor("INSERT_DATE", CommonUtil.toString(insertDate));
	}

	public String getInsertUserId() {
		return insertUserId;
	}

	public void setInsertUserId(String insertUserId) throws Exception {
		this.insertUserId = insertUserId;
		setValueFromAccessor("INSERT_USER_ID", insertUserId);
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) throws Exception {
		this.templateName = templateName;
		setValueFromAccessor("TEMPLATE_NAME", templateName);
	}

	public String getTemplatePath() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) throws Exception {
		this.templatePath = templatePath;
		setValueFromAccessor("TEMPLATE_PATH", templatePath);
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) throws Exception {
		this.toName = toName;
		setValueFromAccessor("TO_NAME", toName);
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) throws Exception {
		this.updateDate = updateDate;
		setValueFromAccessor("UPDATE_DATE", CommonUtil.toString(updateDate));
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) throws Exception {
		this.updateUserId = updateUserId;
		setValueFromAccessor("UPDATE_USER_ID", updateUserId);
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

		str += "emailSenderId : "+emailSenderId+"\n";
		str += "actionDate : "+actionDate+"\n";
		str += "actionName : "+actionName+"\n";
		str += "actionSrc : "+actionSrc+"\n";
		str += "fromEmail : "+fromEmail+"\n";
		str += "status : "+status+"\n";
		str += "subject : "+subject+"\n";
		str += "toEmail : "+toEmail+"\n";
		str += "bccEmail : "+bccEmail+"\n";
		str += "ccEmail : "+ccEmail+"\n";
		str += "contents : "+contents+"\n";
		str += "fromName : "+fromName+"\n";
		str += "insertDate : "+insertDate+"\n";
		str += "insertUserId : "+insertUserId+"\n";
		str += "templateName : "+templateName+"\n";
		str += "templatePath : "+templatePath+"\n";
		str += "toName : "+toName+"\n";
		str += "updateDate : "+updateDate+"\n";
		str += "updateUserId : "+updateUserId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"emailSenderId\" value=\""+emailSenderId+"\">";
		str += "<column name=\"actionDate\" value=\""+actionDate+"\">";
		str += "<column name=\"actionName\" value=\""+actionName+"\">";
		str += "<column name=\"actionSrc\" value=\""+actionSrc+"\">";
		str += "<column name=\"fromEmail\" value=\""+fromEmail+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"subject\" value=\""+subject+"\">";
		str += "<column name=\"toEmail\" value=\""+toEmail+"\">";
		str += "<column name=\"bccEmail\" value=\""+bccEmail+"\">";
		str += "<column name=\"ccEmail\" value=\""+ccEmail+"\">";
		str += "<column name=\"contents\" value=\""+contents+"\">";
		str += "<column name=\"fromName\" value=\""+fromName+"\">";
		str += "<column name=\"insertDate\" value=\""+insertDate+"\">";
		str += "<column name=\"insertUserId\" value=\""+insertUserId+"\">";
		str += "<column name=\"templateName\" value=\""+templateName+"\">";
		str += "<column name=\"templatePath\" value=\""+templatePath+"\">";
		str += "<column name=\"toName\" value=\""+toName+"\">";
		str += "<column name=\"updateDate\" value=\""+updateDate+"\">";
		str += "<column name=\"updateUserId\" value=\""+updateUserId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"emailSenderId\":\""+emailSenderId+"\", ";
		str += "\"actionDate\":\""+actionDate+"\", ";
		str += "\"actionName\":\""+actionName+"\", ";
		str += "\"actionSrc\":\""+actionSrc+"\", ";
		str += "\"fromEmail\":\""+fromEmail+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"subject\":\""+subject+"\", ";
		str += "\"toEmail\":\""+toEmail+"\", ";
		str += "\"bccEmail\":\""+bccEmail+"\", ";
		str += "\"ccEmail\":\""+ccEmail+"\", ";
		str += "\"contents\":\""+contents+"\", ";
		str += "\"fromName\":\""+fromName+"\", ";
		str += "\"insertDate\":\""+insertDate+"\", ";
		str += "\"insertUserId\":\""+insertUserId+"\", ";
		str += "\"templateName\":\""+templateName+"\", ";
		str += "\"templatePath\":\""+templatePath+"\", ";
		str += "\"toName\":\""+toName+"\", ";
		str += "\"updateDate\":\""+updateDate+"\", ";
		str += "\"updateUserId\":\""+updateUserId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}