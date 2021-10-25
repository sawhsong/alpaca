/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_INVOICE_TEMPLATE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpInvoiceTemplate extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double invTemplateId;
	private String INV_TEMPLATE_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String comments;
	private String COMMENTS;
	private String countryCode;
	private String COUNTRY_CODE;
	private String currencyCode;
	private String CURRENCY_CODE;
	private double currencyId;
	private String CURRENCY_ID;
	private String currencySymbol;
	private String CURRENCY_SYMBOL;
	private String currencyUnicode;
	private String CURRENCY_UNICODE;
	private String excel;
	private String EXCEL;
	private String footerMsg;
	private String FOOTER_MSG;
	private double gstAmount;
	private String GST_AMOUNT;
	private String html;
	private String HTML;
	private String includeGst;
	private String INCLUDE_GST;
	private String invoiceTemplateCode;
	private String INVOICE_TEMPLATE_CODE;
	private String invoiceType;
	private String INVOICE_TYPE;
	private String languageCode;
	private String LANGUAGE_CODE;
	private double organisationId;
	private String ORGANISATION_ID;
	private String pdf;
	private String PDF;
	private String splitConsultingFees;
	private String SPLIT_CONSULTING_FEES;
	private String taxCode;
	private String TAX_CODE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpInvoiceTemplate() throws Exception {
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
		setFrwVarPrimaryKey("INV_TEMPLATE_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("INV_TEMPLATE_ID,CREATED_BY,LAST_UPDATED_BY,BUSINESS_GROUP_ID,CURRENCY_ID,GST_AMOUNT,ORGANISATION_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getInvTemplateId() {
		return invTemplateId;
	}

	public void setInvTemplateId(double invTemplateId) throws Exception {
		this.invTemplateId = invTemplateId;
		setValueFromAccessor("INV_TEMPLATE_ID", CommonUtil.toString(invTemplateId));
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

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) throws Exception {
		this.countryCode = countryCode;
		setValueFromAccessor("COUNTRY_CODE", countryCode);
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) throws Exception {
		this.currencyCode = currencyCode;
		setValueFromAccessor("CURRENCY_CODE", currencyCode);
	}

	public double getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(double currencyId) throws Exception {
		this.currencyId = currencyId;
		setValueFromAccessor("CURRENCY_ID", CommonUtil.toString(currencyId));
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) throws Exception {
		this.currencySymbol = currencySymbol;
		setValueFromAccessor("CURRENCY_SYMBOL", currencySymbol);
	}

	public String getCurrencyUnicode() {
		return currencyUnicode;
	}

	public void setCurrencyUnicode(String currencyUnicode) throws Exception {
		this.currencyUnicode = currencyUnicode;
		setValueFromAccessor("CURRENCY_UNICODE", currencyUnicode);
	}

	public String getExcel() {
		return excel;
	}

	public void setExcel(String excel) throws Exception {
		this.excel = excel;
		setValueFromAccessor("EXCEL", excel);
	}

	public String getFooterMsg() {
		return footerMsg;
	}

	public void setFooterMsg(String footerMsg) throws Exception {
		this.footerMsg = footerMsg;
		setValueFromAccessor("FOOTER_MSG", footerMsg);
	}

	public double getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(double gstAmount) throws Exception {
		this.gstAmount = gstAmount;
		setValueFromAccessor("GST_AMOUNT", CommonUtil.toString(gstAmount));
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) throws Exception {
		this.html = html;
		setValueFromAccessor("HTML", html);
	}

	public String getIncludeGst() {
		return includeGst;
	}

	public void setIncludeGst(String includeGst) throws Exception {
		this.includeGst = includeGst;
		setValueFromAccessor("INCLUDE_GST", includeGst);
	}

	public String getInvoiceTemplateCode() {
		return invoiceTemplateCode;
	}

	public void setInvoiceTemplateCode(String invoiceTemplateCode) throws Exception {
		this.invoiceTemplateCode = invoiceTemplateCode;
		setValueFromAccessor("INVOICE_TEMPLATE_CODE", invoiceTemplateCode);
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) throws Exception {
		this.invoiceType = invoiceType;
		setValueFromAccessor("INVOICE_TYPE", invoiceType);
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) throws Exception {
		this.languageCode = languageCode;
		setValueFromAccessor("LANGUAGE_CODE", languageCode);
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) throws Exception {
		this.pdf = pdf;
		setValueFromAccessor("PDF", pdf);
	}

	public String getSplitConsultingFees() {
		return splitConsultingFees;
	}

	public void setSplitConsultingFees(String splitConsultingFees) throws Exception {
		this.splitConsultingFees = splitConsultingFees;
		setValueFromAccessor("SPLIT_CONSULTING_FEES", splitConsultingFees);
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) throws Exception {
		this.taxCode = taxCode;
		setValueFromAccessor("TAX_CODE", taxCode);
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

		str += "invTemplateId : "+invTemplateId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "comments : "+comments+"\n";
		str += "countryCode : "+countryCode+"\n";
		str += "currencyCode : "+currencyCode+"\n";
		str += "currencyId : "+currencyId+"\n";
		str += "currencySymbol : "+currencySymbol+"\n";
		str += "currencyUnicode : "+currencyUnicode+"\n";
		str += "excel : "+excel+"\n";
		str += "footerMsg : "+footerMsg+"\n";
		str += "gstAmount : "+gstAmount+"\n";
		str += "html : "+html+"\n";
		str += "includeGst : "+includeGst+"\n";
		str += "invoiceTemplateCode : "+invoiceTemplateCode+"\n";
		str += "invoiceType : "+invoiceType+"\n";
		str += "languageCode : "+languageCode+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "pdf : "+pdf+"\n";
		str += "splitConsultingFees : "+splitConsultingFees+"\n";
		str += "taxCode : "+taxCode+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"invTemplateId\" value=\""+invTemplateId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"countryCode\" value=\""+countryCode+"\">";
		str += "<column name=\"currencyCode\" value=\""+currencyCode+"\">";
		str += "<column name=\"currencyId\" value=\""+currencyId+"\">";
		str += "<column name=\"currencySymbol\" value=\""+currencySymbol+"\">";
		str += "<column name=\"currencyUnicode\" value=\""+currencyUnicode+"\">";
		str += "<column name=\"excel\" value=\""+excel+"\">";
		str += "<column name=\"footerMsg\" value=\""+footerMsg+"\">";
		str += "<column name=\"gstAmount\" value=\""+gstAmount+"\">";
		str += "<column name=\"html\" value=\""+html+"\">";
		str += "<column name=\"includeGst\" value=\""+includeGst+"\">";
		str += "<column name=\"invoiceTemplateCode\" value=\""+invoiceTemplateCode+"\">";
		str += "<column name=\"invoiceType\" value=\""+invoiceType+"\">";
		str += "<column name=\"languageCode\" value=\""+languageCode+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"pdf\" value=\""+pdf+"\">";
		str += "<column name=\"splitConsultingFees\" value=\""+splitConsultingFees+"\">";
		str += "<column name=\"taxCode\" value=\""+taxCode+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"invTemplateId\":\""+invTemplateId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"countryCode\":\""+countryCode+"\", ";
		str += "\"currencyCode\":\""+currencyCode+"\", ";
		str += "\"currencyId\":\""+currencyId+"\", ";
		str += "\"currencySymbol\":\""+currencySymbol+"\", ";
		str += "\"currencyUnicode\":\""+currencyUnicode+"\", ";
		str += "\"excel\":\""+excel+"\", ";
		str += "\"footerMsg\":\""+footerMsg+"\", ";
		str += "\"gstAmount\":\""+gstAmount+"\", ";
		str += "\"html\":\""+html+"\", ";
		str += "\"includeGst\":\""+includeGst+"\", ";
		str += "\"invoiceTemplateCode\":\""+invoiceTemplateCode+"\", ";
		str += "\"invoiceType\":\""+invoiceType+"\", ";
		str += "\"languageCode\":\""+languageCode+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"pdf\":\""+pdf+"\", ";
		str += "\"splitConsultingFees\":\""+splitConsultingFees+"\", ";
		str += "\"taxCode\":\""+taxCode+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}