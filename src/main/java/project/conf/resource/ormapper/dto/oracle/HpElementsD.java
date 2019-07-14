/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_ELEMENTS_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpElementsD extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double elementId;
	private String ELEMENT_ID;
	private Date fromDate;
	private String FROM_DATE;
	private Date toDate;
	private String TO_DATE;
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
	private String abn;
	private String ABN;
	private String additionalEntryAllowed;
	private String ADDITIONAL_ENTRY_ALLOWED;
	private String allowance;
	private String ALLOWANCE;
	private double applicationTaxRate;
	private String APPLICATION_TAX_RATE;
	private String calculationRule;
	private String CALCULATION_RULE;
	private String category;
	private String CATEGORY;
	private double classificationsId;
	private String CLASSIFICATIONS_ID;
	private String comments;
	private String COMMENTS;
	private String creditDebitFlag;
	private String CREDIT_DEBIT_FLAG;
	private String earCheque;
	private String EAR_CHEQUE;
	private String earCredit;
	private String EAR_CREDIT;
	private String earDebit;
	private String EAR_DEBIT;
	private String earEft;
	private String EAR_EFT;
	private String earElement;
	private String EAR_ELEMENT;
	private String earFactored;
	private String EAR_FACTORED;
	private String elementName;
	private String ELEMENT_NAME;
	private String elementType;
	private String ELEMENT_TYPE;
	private String glCode;
	private String GL_CODE;
	private String glCodeDebit;
	private String GL_CODE_DEBIT;
	private String grossSalary;
	private String GROSS_SALARY;
	private String gstExempt;
	private String GST_EXEMPT;
	private String leaveAccural;
	private String LEAVE_ACCURAL;
	private String lumpSumType;
	private String LUMP_SUM_TYPE;
	private String multipleEntriesAllowed;
	private String MULTIPLE_ENTRIES_ALLOWED;
	private String ote;
	private String OTE;
	private String preTaxDeduction;
	private String PRE_TAX_DEDUCTION;
	private double priority;
	private String PRIORITY;
	private String processingType;
	private String PROCESSING_TYPE;
	private String reduceRegular;
	private String REDUCE_REGULAR;
	private String reportingName;
	private String REPORTING_NAME;
	private String salaryWages;
	private String SALARY_WAGES;
	private String separateCheck;
	private String SEPARATE_CHECK;
	private String sfn;
	private String SFN;
	private String showAll;
	private String SHOW_ALL;
	private String spin;
	private String SPIN;
	private double stpAllowanceId;
	private String STP_ALLOWANCE_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpElementsD() throws Exception {
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
		setFrwVarPrimaryKey("ELEMENT_ID,FROM_DATE,TO_DATE");
		setFrwVarDateColumn("FROM_DATE,TO_DATE,CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("ELEMENT_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,APPLICATION_TAX_RATE,CLASSIFICATIONS_ID,PRIORITY,STP_ALLOWANCE_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getElementId() {
		return elementId;
	}

	public void setElementId(double elementId) throws Exception {
		this.elementId = elementId;
		setValueFromAccessor("ELEMENT_ID", CommonUtil.toString(elementId));
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

	public String getAbn() {
		return abn;
	}

	public void setAbn(String abn) throws Exception {
		this.abn = abn;
		setValueFromAccessor("ABN", abn);
	}

	public String getAdditionalEntryAllowed() {
		return additionalEntryAllowed;
	}

	public void setAdditionalEntryAllowed(String additionalEntryAllowed) throws Exception {
		this.additionalEntryAllowed = additionalEntryAllowed;
		setValueFromAccessor("ADDITIONAL_ENTRY_ALLOWED", additionalEntryAllowed);
	}

	public String getAllowance() {
		return allowance;
	}

	public void setAllowance(String allowance) throws Exception {
		this.allowance = allowance;
		setValueFromAccessor("ALLOWANCE", allowance);
	}

	public double getApplicationTaxRate() {
		return applicationTaxRate;
	}

	public void setApplicationTaxRate(double applicationTaxRate) throws Exception {
		this.applicationTaxRate = applicationTaxRate;
		setValueFromAccessor("APPLICATION_TAX_RATE", CommonUtil.toString(applicationTaxRate));
	}

	public String getCalculationRule() {
		return calculationRule;
	}

	public void setCalculationRule(String calculationRule) throws Exception {
		this.calculationRule = calculationRule;
		setValueFromAccessor("CALCULATION_RULE", calculationRule);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) throws Exception {
		this.category = category;
		setValueFromAccessor("CATEGORY", category);
	}

	public double getClassificationsId() {
		return classificationsId;
	}

	public void setClassificationsId(double classificationsId) throws Exception {
		this.classificationsId = classificationsId;
		setValueFromAccessor("CLASSIFICATIONS_ID", CommonUtil.toString(classificationsId));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public String getCreditDebitFlag() {
		return creditDebitFlag;
	}

	public void setCreditDebitFlag(String creditDebitFlag) throws Exception {
		this.creditDebitFlag = creditDebitFlag;
		setValueFromAccessor("CREDIT_DEBIT_FLAG", creditDebitFlag);
	}

	public String getEarCheque() {
		return earCheque;
	}

	public void setEarCheque(String earCheque) throws Exception {
		this.earCheque = earCheque;
		setValueFromAccessor("EAR_CHEQUE", earCheque);
	}

	public String getEarCredit() {
		return earCredit;
	}

	public void setEarCredit(String earCredit) throws Exception {
		this.earCredit = earCredit;
		setValueFromAccessor("EAR_CREDIT", earCredit);
	}

	public String getEarDebit() {
		return earDebit;
	}

	public void setEarDebit(String earDebit) throws Exception {
		this.earDebit = earDebit;
		setValueFromAccessor("EAR_DEBIT", earDebit);
	}

	public String getEarEft() {
		return earEft;
	}

	public void setEarEft(String earEft) throws Exception {
		this.earEft = earEft;
		setValueFromAccessor("EAR_EFT", earEft);
	}

	public String getEarElement() {
		return earElement;
	}

	public void setEarElement(String earElement) throws Exception {
		this.earElement = earElement;
		setValueFromAccessor("EAR_ELEMENT", earElement);
	}

	public String getEarFactored() {
		return earFactored;
	}

	public void setEarFactored(String earFactored) throws Exception {
		this.earFactored = earFactored;
		setValueFromAccessor("EAR_FACTORED", earFactored);
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) throws Exception {
		this.elementName = elementName;
		setValueFromAccessor("ELEMENT_NAME", elementName);
	}

	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) throws Exception {
		this.elementType = elementType;
		setValueFromAccessor("ELEMENT_TYPE", elementType);
	}

	public String getGlCode() {
		return glCode;
	}

	public void setGlCode(String glCode) throws Exception {
		this.glCode = glCode;
		setValueFromAccessor("GL_CODE", glCode);
	}

	public String getGlCodeDebit() {
		return glCodeDebit;
	}

	public void setGlCodeDebit(String glCodeDebit) throws Exception {
		this.glCodeDebit = glCodeDebit;
		setValueFromAccessor("GL_CODE_DEBIT", glCodeDebit);
	}

	public String getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(String grossSalary) throws Exception {
		this.grossSalary = grossSalary;
		setValueFromAccessor("GROSS_SALARY", grossSalary);
	}

	public String getGstExempt() {
		return gstExempt;
	}

	public void setGstExempt(String gstExempt) throws Exception {
		this.gstExempt = gstExempt;
		setValueFromAccessor("GST_EXEMPT", gstExempt);
	}

	public String getLeaveAccural() {
		return leaveAccural;
	}

	public void setLeaveAccural(String leaveAccural) throws Exception {
		this.leaveAccural = leaveAccural;
		setValueFromAccessor("LEAVE_ACCURAL", leaveAccural);
	}

	public String getLumpSumType() {
		return lumpSumType;
	}

	public void setLumpSumType(String lumpSumType) throws Exception {
		this.lumpSumType = lumpSumType;
		setValueFromAccessor("LUMP_SUM_TYPE", lumpSumType);
	}

	public String getMultipleEntriesAllowed() {
		return multipleEntriesAllowed;
	}

	public void setMultipleEntriesAllowed(String multipleEntriesAllowed) throws Exception {
		this.multipleEntriesAllowed = multipleEntriesAllowed;
		setValueFromAccessor("MULTIPLE_ENTRIES_ALLOWED", multipleEntriesAllowed);
	}

	public String getOte() {
		return ote;
	}

	public void setOte(String ote) throws Exception {
		this.ote = ote;
		setValueFromAccessor("OTE", ote);
	}

	public String getPreTaxDeduction() {
		return preTaxDeduction;
	}

	public void setPreTaxDeduction(String preTaxDeduction) throws Exception {
		this.preTaxDeduction = preTaxDeduction;
		setValueFromAccessor("PRE_TAX_DEDUCTION", preTaxDeduction);
	}

	public double getPriority() {
		return priority;
	}

	public void setPriority(double priority) throws Exception {
		this.priority = priority;
		setValueFromAccessor("PRIORITY", CommonUtil.toString(priority));
	}

	public String getProcessingType() {
		return processingType;
	}

	public void setProcessingType(String processingType) throws Exception {
		this.processingType = processingType;
		setValueFromAccessor("PROCESSING_TYPE", processingType);
	}

	public String getReduceRegular() {
		return reduceRegular;
	}

	public void setReduceRegular(String reduceRegular) throws Exception {
		this.reduceRegular = reduceRegular;
		setValueFromAccessor("REDUCE_REGULAR", reduceRegular);
	}

	public String getReportingName() {
		return reportingName;
	}

	public void setReportingName(String reportingName) throws Exception {
		this.reportingName = reportingName;
		setValueFromAccessor("REPORTING_NAME", reportingName);
	}

	public String getSalaryWages() {
		return salaryWages;
	}

	public void setSalaryWages(String salaryWages) throws Exception {
		this.salaryWages = salaryWages;
		setValueFromAccessor("SALARY_WAGES", salaryWages);
	}

	public String getSeparateCheck() {
		return separateCheck;
	}

	public void setSeparateCheck(String separateCheck) throws Exception {
		this.separateCheck = separateCheck;
		setValueFromAccessor("SEPARATE_CHECK", separateCheck);
	}

	public String getSfn() {
		return sfn;
	}

	public void setSfn(String sfn) throws Exception {
		this.sfn = sfn;
		setValueFromAccessor("SFN", sfn);
	}

	public String getShowAll() {
		return showAll;
	}

	public void setShowAll(String showAll) throws Exception {
		this.showAll = showAll;
		setValueFromAccessor("SHOW_ALL", showAll);
	}

	public String getSpin() {
		return spin;
	}

	public void setSpin(String spin) throws Exception {
		this.spin = spin;
		setValueFromAccessor("SPIN", spin);
	}

	public double getStpAllowanceId() {
		return stpAllowanceId;
	}

	public void setStpAllowanceId(double stpAllowanceId) throws Exception {
		this.stpAllowanceId = stpAllowanceId;
		setValueFromAccessor("STP_ALLOWANCE_ID", CommonUtil.toString(stpAllowanceId));
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
	public boolean equals(Object object) {
		if (!(object instanceof HpElementsD)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return 1;
	}

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

		str += "elementId : "+elementId+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "toDate : "+toDate+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "abn : "+abn+"\n";
		str += "additionalEntryAllowed : "+additionalEntryAllowed+"\n";
		str += "allowance : "+allowance+"\n";
		str += "applicationTaxRate : "+applicationTaxRate+"\n";
		str += "calculationRule : "+calculationRule+"\n";
		str += "category : "+category+"\n";
		str += "classificationsId : "+classificationsId+"\n";
		str += "comments : "+comments+"\n";
		str += "creditDebitFlag : "+creditDebitFlag+"\n";
		str += "earCheque : "+earCheque+"\n";
		str += "earCredit : "+earCredit+"\n";
		str += "earDebit : "+earDebit+"\n";
		str += "earEft : "+earEft+"\n";
		str += "earElement : "+earElement+"\n";
		str += "earFactored : "+earFactored+"\n";
		str += "elementName : "+elementName+"\n";
		str += "elementType : "+elementType+"\n";
		str += "glCode : "+glCode+"\n";
		str += "glCodeDebit : "+glCodeDebit+"\n";
		str += "grossSalary : "+grossSalary+"\n";
		str += "gstExempt : "+gstExempt+"\n";
		str += "leaveAccural : "+leaveAccural+"\n";
		str += "lumpSumType : "+lumpSumType+"\n";
		str += "multipleEntriesAllowed : "+multipleEntriesAllowed+"\n";
		str += "ote : "+ote+"\n";
		str += "preTaxDeduction : "+preTaxDeduction+"\n";
		str += "priority : "+priority+"\n";
		str += "processingType : "+processingType+"\n";
		str += "reduceRegular : "+reduceRegular+"\n";
		str += "reportingName : "+reportingName+"\n";
		str += "salaryWages : "+salaryWages+"\n";
		str += "separateCheck : "+separateCheck+"\n";
		str += "sfn : "+sfn+"\n";
		str += "showAll : "+showAll+"\n";
		str += "spin : "+spin+"\n";
		str += "stpAllowanceId : "+stpAllowanceId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"elementId\" value=\""+elementId+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"abn\" value=\""+abn+"\">";
		str += "<column name=\"additionalEntryAllowed\" value=\""+additionalEntryAllowed+"\">";
		str += "<column name=\"allowance\" value=\""+allowance+"\">";
		str += "<column name=\"applicationTaxRate\" value=\""+applicationTaxRate+"\">";
		str += "<column name=\"calculationRule\" value=\""+calculationRule+"\">";
		str += "<column name=\"category\" value=\""+category+"\">";
		str += "<column name=\"classificationsId\" value=\""+classificationsId+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"creditDebitFlag\" value=\""+creditDebitFlag+"\">";
		str += "<column name=\"earCheque\" value=\""+earCheque+"\">";
		str += "<column name=\"earCredit\" value=\""+earCredit+"\">";
		str += "<column name=\"earDebit\" value=\""+earDebit+"\">";
		str += "<column name=\"earEft\" value=\""+earEft+"\">";
		str += "<column name=\"earElement\" value=\""+earElement+"\">";
		str += "<column name=\"earFactored\" value=\""+earFactored+"\">";
		str += "<column name=\"elementName\" value=\""+elementName+"\">";
		str += "<column name=\"elementType\" value=\""+elementType+"\">";
		str += "<column name=\"glCode\" value=\""+glCode+"\">";
		str += "<column name=\"glCodeDebit\" value=\""+glCodeDebit+"\">";
		str += "<column name=\"grossSalary\" value=\""+grossSalary+"\">";
		str += "<column name=\"gstExempt\" value=\""+gstExempt+"\">";
		str += "<column name=\"leaveAccural\" value=\""+leaveAccural+"\">";
		str += "<column name=\"lumpSumType\" value=\""+lumpSumType+"\">";
		str += "<column name=\"multipleEntriesAllowed\" value=\""+multipleEntriesAllowed+"\">";
		str += "<column name=\"ote\" value=\""+ote+"\">";
		str += "<column name=\"preTaxDeduction\" value=\""+preTaxDeduction+"\">";
		str += "<column name=\"priority\" value=\""+priority+"\">";
		str += "<column name=\"processingType\" value=\""+processingType+"\">";
		str += "<column name=\"reduceRegular\" value=\""+reduceRegular+"\">";
		str += "<column name=\"reportingName\" value=\""+reportingName+"\">";
		str += "<column name=\"salaryWages\" value=\""+salaryWages+"\">";
		str += "<column name=\"separateCheck\" value=\""+separateCheck+"\">";
		str += "<column name=\"sfn\" value=\""+sfn+"\">";
		str += "<column name=\"showAll\" value=\""+showAll+"\">";
		str += "<column name=\"spin\" value=\""+spin+"\">";
		str += "<column name=\"stpAllowanceId\" value=\""+stpAllowanceId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"elementId\":\""+elementId+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"abn\":\""+abn+"\", ";
		str += "\"additionalEntryAllowed\":\""+additionalEntryAllowed+"\", ";
		str += "\"allowance\":\""+allowance+"\", ";
		str += "\"applicationTaxRate\":\""+applicationTaxRate+"\", ";
		str += "\"calculationRule\":\""+calculationRule+"\", ";
		str += "\"category\":\""+category+"\", ";
		str += "\"classificationsId\":\""+classificationsId+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"creditDebitFlag\":\""+creditDebitFlag+"\", ";
		str += "\"earCheque\":\""+earCheque+"\", ";
		str += "\"earCredit\":\""+earCredit+"\", ";
		str += "\"earDebit\":\""+earDebit+"\", ";
		str += "\"earEft\":\""+earEft+"\", ";
		str += "\"earElement\":\""+earElement+"\", ";
		str += "\"earFactored\":\""+earFactored+"\", ";
		str += "\"elementName\":\""+elementName+"\", ";
		str += "\"elementType\":\""+elementType+"\", ";
		str += "\"glCode\":\""+glCode+"\", ";
		str += "\"glCodeDebit\":\""+glCodeDebit+"\", ";
		str += "\"grossSalary\":\""+grossSalary+"\", ";
		str += "\"gstExempt\":\""+gstExempt+"\", ";
		str += "\"leaveAccural\":\""+leaveAccural+"\", ";
		str += "\"lumpSumType\":\""+lumpSumType+"\", ";
		str += "\"multipleEntriesAllowed\":\""+multipleEntriesAllowed+"\", ";
		str += "\"ote\":\""+ote+"\", ";
		str += "\"preTaxDeduction\":\""+preTaxDeduction+"\", ";
		str += "\"priority\":\""+priority+"\", ";
		str += "\"processingType\":\""+processingType+"\", ";
		str += "\"reduceRegular\":\""+reduceRegular+"\", ";
		str += "\"reportingName\":\""+reportingName+"\", ";
		str += "\"salaryWages\":\""+salaryWages+"\", ";
		str += "\"separateCheck\":\""+separateCheck+"\", ";
		str += "\"sfn\":\""+sfn+"\", ";
		str += "\"showAll\":\""+showAll+"\", ";
		str += "\"spin\":\""+spin+"\", ";
		str += "\"stpAllowanceId\":\""+stpAllowanceId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}