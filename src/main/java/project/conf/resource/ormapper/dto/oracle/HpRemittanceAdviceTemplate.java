/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_REMITTANCE_ADVICE_TEMPLATE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpRemittanceAdviceTemplate extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String abn;
	private String ABN;
	private String addressDetails;
	private String ADDRESS_DETAILS;
	private String comments;
	private String COMMENTS;
	private String consultingRevenueYN;
	private String CONSULTING_REVENUE_Y_N;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String deductionsYN;
	private String DEDUCTIONS_Y_N;
	private String emailBodyTemplate;
	private String EMAIL_BODY_TEMPLATE;
	private double employmentOrgId;
	private String EMPLOYMENT_ORG_ID;
	private String generalInfoYN;
	private String GENERAL_INFO_Y_N;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdatedDate;
	private String LAST_UPDATED_DATE;
	private String leaveAccrualsYN;
	private String LEAVE_ACCRUALS_Y_N;
	private String logoName;
	private String LOGO_NAME;
	private String paymentAdviceYN;
	private String PAYMENT_ADVICE_Y_N;
	private String payAdviceYN;
	private String PAY_ADVICE_Y_N;
	private double recipientCompanyId;
	private String RECIPIENT_COMPANY_ID;
	private double remittanceAdviceTemplateId;
	private String REMITTANCE_ADVICE_TEMPLATE_ID;
	private String senderEmailAddress;
	private String SENDER_EMAIL_ADDRESS;
	private String showZeroYN;
	private String SHOW_ZERO_Y_N;
	private String templateName;
	private String TEMPLATE_NAME;
	private String templateType;
	private String TEMPLATE_TYPE;
	private String xlTemplateName;
	private String XL_TEMPLATE_NAME;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpRemittanceAdviceTemplate() throws Exception {
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
		setFrwVarPrimaryKey("");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATED_DATE");
		setFrwVarNumberColumn("CREATED_BY,EMPLOYMENT_ORG_ID,LAST_UPDATED_BY,RECIPIENT_COMPANY_ID,REMITTANCE_ADVICE_TEMPLATE_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getAbn() {
		return abn;
	}

	public void setAbn(String abn) throws Exception {
		this.abn = abn;
		setValueFromAccessor("ABN", abn);
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) throws Exception {
		this.addressDetails = addressDetails;
		setValueFromAccessor("ADDRESS_DETAILS", addressDetails);
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public String getConsultingRevenueYN() {
		return consultingRevenueYN;
	}

	public void setConsultingRevenueYN(String consultingRevenueYN) throws Exception {
		this.consultingRevenueYN = consultingRevenueYN;
		setValueFromAccessor("CONSULTING_REVENUE_Y_N", consultingRevenueYN);
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

	public String getDeductionsYN() {
		return deductionsYN;
	}

	public void setDeductionsYN(String deductionsYN) throws Exception {
		this.deductionsYN = deductionsYN;
		setValueFromAccessor("DEDUCTIONS_Y_N", deductionsYN);
	}

	public String getEmailBodyTemplate() {
		return emailBodyTemplate;
	}

	public void setEmailBodyTemplate(String emailBodyTemplate) throws Exception {
		this.emailBodyTemplate = emailBodyTemplate;
		setValueFromAccessor("EMAIL_BODY_TEMPLATE", emailBodyTemplate);
	}

	public double getEmploymentOrgId() {
		return employmentOrgId;
	}

	public void setEmploymentOrgId(double employmentOrgId) throws Exception {
		this.employmentOrgId = employmentOrgId;
		setValueFromAccessor("EMPLOYMENT_ORG_ID", CommonUtil.toString(employmentOrgId));
	}

	public String getGeneralInfoYN() {
		return generalInfoYN;
	}

	public void setGeneralInfoYN(String generalInfoYN) throws Exception {
		this.generalInfoYN = generalInfoYN;
		setValueFromAccessor("GENERAL_INFO_Y_N", generalInfoYN);
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) throws Exception {
		this.lastUpdatedDate = lastUpdatedDate;
		setValueFromAccessor("LAST_UPDATED_DATE", CommonUtil.toString(lastUpdatedDate));
	}

	public String getLeaveAccrualsYN() {
		return leaveAccrualsYN;
	}

	public void setLeaveAccrualsYN(String leaveAccrualsYN) throws Exception {
		this.leaveAccrualsYN = leaveAccrualsYN;
		setValueFromAccessor("LEAVE_ACCRUALS_Y_N", leaveAccrualsYN);
	}

	public String getLogoName() {
		return logoName;
	}

	public void setLogoName(String logoName) throws Exception {
		this.logoName = logoName;
		setValueFromAccessor("LOGO_NAME", logoName);
	}

	public String getPaymentAdviceYN() {
		return paymentAdviceYN;
	}

	public void setPaymentAdviceYN(String paymentAdviceYN) throws Exception {
		this.paymentAdviceYN = paymentAdviceYN;
		setValueFromAccessor("PAYMENT_ADVICE_Y_N", paymentAdviceYN);
	}

	public String getPayAdviceYN() {
		return payAdviceYN;
	}

	public void setPayAdviceYN(String payAdviceYN) throws Exception {
		this.payAdviceYN = payAdviceYN;
		setValueFromAccessor("PAY_ADVICE_Y_N", payAdviceYN);
	}

	public double getRecipientCompanyId() {
		return recipientCompanyId;
	}

	public void setRecipientCompanyId(double recipientCompanyId) throws Exception {
		this.recipientCompanyId = recipientCompanyId;
		setValueFromAccessor("RECIPIENT_COMPANY_ID", CommonUtil.toString(recipientCompanyId));
	}

	public double getRemittanceAdviceTemplateId() {
		return remittanceAdviceTemplateId;
	}

	public void setRemittanceAdviceTemplateId(double remittanceAdviceTemplateId) throws Exception {
		this.remittanceAdviceTemplateId = remittanceAdviceTemplateId;
		setValueFromAccessor("REMITTANCE_ADVICE_TEMPLATE_ID", CommonUtil.toString(remittanceAdviceTemplateId));
	}

	public String getSenderEmailAddress() {
		return senderEmailAddress;
	}

	public void setSenderEmailAddress(String senderEmailAddress) throws Exception {
		this.senderEmailAddress = senderEmailAddress;
		setValueFromAccessor("SENDER_EMAIL_ADDRESS", senderEmailAddress);
	}

	public String getShowZeroYN() {
		return showZeroYN;
	}

	public void setShowZeroYN(String showZeroYN) throws Exception {
		this.showZeroYN = showZeroYN;
		setValueFromAccessor("SHOW_ZERO_Y_N", showZeroYN);
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) throws Exception {
		this.templateName = templateName;
		setValueFromAccessor("TEMPLATE_NAME", templateName);
	}

	public String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(String templateType) throws Exception {
		this.templateType = templateType;
		setValueFromAccessor("TEMPLATE_TYPE", templateType);
	}

	public String getXlTemplateName() {
		return xlTemplateName;
	}

	public void setXlTemplateName(String xlTemplateName) throws Exception {
		this.xlTemplateName = xlTemplateName;
		setValueFromAccessor("XL_TEMPLATE_NAME", xlTemplateName);
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

		str += "abn : "+abn+"\n";
		str += "addressDetails : "+addressDetails+"\n";
		str += "comments : "+comments+"\n";
		str += "consultingRevenueYN : "+consultingRevenueYN+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "deductionsYN : "+deductionsYN+"\n";
		str += "emailBodyTemplate : "+emailBodyTemplate+"\n";
		str += "employmentOrgId : "+employmentOrgId+"\n";
		str += "generalInfoYN : "+generalInfoYN+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdatedDate : "+lastUpdatedDate+"\n";
		str += "leaveAccrualsYN : "+leaveAccrualsYN+"\n";
		str += "logoName : "+logoName+"\n";
		str += "paymentAdviceYN : "+paymentAdviceYN+"\n";
		str += "payAdviceYN : "+payAdviceYN+"\n";
		str += "recipientCompanyId : "+recipientCompanyId+"\n";
		str += "remittanceAdviceTemplateId : "+remittanceAdviceTemplateId+"\n";
		str += "senderEmailAddress : "+senderEmailAddress+"\n";
		str += "showZeroYN : "+showZeroYN+"\n";
		str += "templateName : "+templateName+"\n";
		str += "templateType : "+templateType+"\n";
		str += "xlTemplateName : "+xlTemplateName+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"abn\" value=\""+abn+"\">";
		str += "<column name=\"addressDetails\" value=\""+addressDetails+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"consultingRevenueYN\" value=\""+consultingRevenueYN+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"deductionsYN\" value=\""+deductionsYN+"\">";
		str += "<column name=\"emailBodyTemplate\" value=\""+emailBodyTemplate+"\">";
		str += "<column name=\"employmentOrgId\" value=\""+employmentOrgId+"\">";
		str += "<column name=\"generalInfoYN\" value=\""+generalInfoYN+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdatedDate\" value=\""+lastUpdatedDate+"\">";
		str += "<column name=\"leaveAccrualsYN\" value=\""+leaveAccrualsYN+"\">";
		str += "<column name=\"logoName\" value=\""+logoName+"\">";
		str += "<column name=\"paymentAdviceYN\" value=\""+paymentAdviceYN+"\">";
		str += "<column name=\"payAdviceYN\" value=\""+payAdviceYN+"\">";
		str += "<column name=\"recipientCompanyId\" value=\""+recipientCompanyId+"\">";
		str += "<column name=\"remittanceAdviceTemplateId\" value=\""+remittanceAdviceTemplateId+"\">";
		str += "<column name=\"senderEmailAddress\" value=\""+senderEmailAddress+"\">";
		str += "<column name=\"showZeroYN\" value=\""+showZeroYN+"\">";
		str += "<column name=\"templateName\" value=\""+templateName+"\">";
		str += "<column name=\"templateType\" value=\""+templateType+"\">";
		str += "<column name=\"xlTemplateName\" value=\""+xlTemplateName+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"abn\":\""+abn+"\", ";
		str += "\"addressDetails\":\""+addressDetails+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"consultingRevenueYN\":\""+consultingRevenueYN+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"deductionsYN\":\""+deductionsYN+"\", ";
		str += "\"emailBodyTemplate\":\""+emailBodyTemplate+"\", ";
		str += "\"employmentOrgId\":\""+employmentOrgId+"\", ";
		str += "\"generalInfoYN\":\""+generalInfoYN+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdatedDate\":\""+lastUpdatedDate+"\", ";
		str += "\"leaveAccrualsYN\":\""+leaveAccrualsYN+"\", ";
		str += "\"logoName\":\""+logoName+"\", ";
		str += "\"paymentAdviceYN\":\""+paymentAdviceYN+"\", ";
		str += "\"payAdviceYN\":\""+payAdviceYN+"\", ";
		str += "\"recipientCompanyId\":\""+recipientCompanyId+"\", ";
		str += "\"remittanceAdviceTemplateId\":\""+remittanceAdviceTemplateId+"\", ";
		str += "\"senderEmailAddress\":\""+senderEmailAddress+"\", ";
		str += "\"showZeroYN\":\""+showZeroYN+"\", ";
		str += "\"templateName\":\""+templateName+"\", ";
		str += "\"templateType\":\""+templateType+"\", ";
		str += "\"xlTemplateName\":\""+xlTemplateName+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}