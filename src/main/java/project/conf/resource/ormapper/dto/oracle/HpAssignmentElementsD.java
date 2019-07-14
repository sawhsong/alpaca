/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_ASSIGNMENT_ELEMENTS_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpAssignmentElementsD extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double asgElementId;
	private String ASG_ELEMENT_ID;
	private Date fromDate;
	private String FROM_DATE;
	private Date toDate;
	private String TO_DATE;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String alternateName;
	private String ALTERNATE_NAME;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double consolidatedElementId;
	private String CONSOLIDATED_ELEMENT_ID;
	private double elementId;
	private String ELEMENT_ID;
	private double elePriority;
	private String ELE_PRIORITY;
	private String glCode;
	private String GL_CODE;
	private String glCodeDebit;
	private String GL_CODE_DEBIT;
	private String gstExempt;
	private String GST_EXEMPT;
	private String infoFlag;
	private String INFO_FLAG;
	private String invoiceFlag;
	private String INVOICE_FLAG;
	private double invoiceId;
	private String INVOICE_ID;
	private String isActive;
	private String IS_ACTIVE;
	private String membershipNumber;
	private String MEMBERSHIP_NUMBER;
	private double percentageAppliedElementId;
	private String PERCENTAGE_APPLIED_ELEMENT_ID;
	private String processedFlag;
	private String PROCESSED_FLAG;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpAssignmentElementsD() throws Exception {
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
		setFrwVarPrimaryKey("ASG_ELEMENT_ID,FROM_DATE,TO_DATE");
		setFrwVarDateColumn("FROM_DATE,TO_DATE,CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("ASG_ELEMENT_ID,CREATED_BY,LAST_UPDATED_BY,ASSIGNMENT_ID,BUSINESS_GROUP_ID,CONSOLIDATED_ELEMENT_ID,ELEMENT_ID,ELE_PRIORITY,INVOICE_ID,PERCENTAGE_APPLIED_ELEMENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getAsgElementId() {
		return asgElementId;
	}

	public void setAsgElementId(double asgElementId) throws Exception {
		this.asgElementId = asgElementId;
		setValueFromAccessor("ASG_ELEMENT_ID", CommonUtil.toString(asgElementId));
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

	public String getAlternateName() {
		return alternateName;
	}

	public void setAlternateName(String alternateName) throws Exception {
		this.alternateName = alternateName;
		setValueFromAccessor("ALTERNATE_NAME", alternateName);
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public double getConsolidatedElementId() {
		return consolidatedElementId;
	}

	public void setConsolidatedElementId(double consolidatedElementId) throws Exception {
		this.consolidatedElementId = consolidatedElementId;
		setValueFromAccessor("CONSOLIDATED_ELEMENT_ID", CommonUtil.toString(consolidatedElementId));
	}

	public double getElementId() {
		return elementId;
	}

	public void setElementId(double elementId) throws Exception {
		this.elementId = elementId;
		setValueFromAccessor("ELEMENT_ID", CommonUtil.toString(elementId));
	}

	public double getElePriority() {
		return elePriority;
	}

	public void setElePriority(double elePriority) throws Exception {
		this.elePriority = elePriority;
		setValueFromAccessor("ELE_PRIORITY", CommonUtil.toString(elePriority));
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

	public String getGstExempt() {
		return gstExempt;
	}

	public void setGstExempt(String gstExempt) throws Exception {
		this.gstExempt = gstExempt;
		setValueFromAccessor("GST_EXEMPT", gstExempt);
	}

	public String getInfoFlag() {
		return infoFlag;
	}

	public void setInfoFlag(String infoFlag) throws Exception {
		this.infoFlag = infoFlag;
		setValueFromAccessor("INFO_FLAG", infoFlag);
	}

	public String getInvoiceFlag() {
		return invoiceFlag;
	}

	public void setInvoiceFlag(String invoiceFlag) throws Exception {
		this.invoiceFlag = invoiceFlag;
		setValueFromAccessor("INVOICE_FLAG", invoiceFlag);
	}

	public double getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(double invoiceId) throws Exception {
		this.invoiceId = invoiceId;
		setValueFromAccessor("INVOICE_ID", CommonUtil.toString(invoiceId));
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
	}

	public String getMembershipNumber() {
		return membershipNumber;
	}

	public void setMembershipNumber(String membershipNumber) throws Exception {
		this.membershipNumber = membershipNumber;
		setValueFromAccessor("MEMBERSHIP_NUMBER", membershipNumber);
	}

	public double getPercentageAppliedElementId() {
		return percentageAppliedElementId;
	}

	public void setPercentageAppliedElementId(double percentageAppliedElementId) throws Exception {
		this.percentageAppliedElementId = percentageAppliedElementId;
		setValueFromAccessor("PERCENTAGE_APPLIED_ELEMENT_ID", CommonUtil.toString(percentageAppliedElementId));
	}

	public String getProcessedFlag() {
		return processedFlag;
	}

	public void setProcessedFlag(String processedFlag) throws Exception {
		this.processedFlag = processedFlag;
		setValueFromAccessor("PROCESSED_FLAG", processedFlag);
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
		if (!(object instanceof HpAssignmentElementsD)) {
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

		str += "asgElementId : "+asgElementId+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "toDate : "+toDate+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "alternateName : "+alternateName+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "consolidatedElementId : "+consolidatedElementId+"\n";
		str += "elementId : "+elementId+"\n";
		str += "elePriority : "+elePriority+"\n";
		str += "glCode : "+glCode+"\n";
		str += "glCodeDebit : "+glCodeDebit+"\n";
		str += "gstExempt : "+gstExempt+"\n";
		str += "infoFlag : "+infoFlag+"\n";
		str += "invoiceFlag : "+invoiceFlag+"\n";
		str += "invoiceId : "+invoiceId+"\n";
		str += "isActive : "+isActive+"\n";
		str += "membershipNumber : "+membershipNumber+"\n";
		str += "percentageAppliedElementId : "+percentageAppliedElementId+"\n";
		str += "processedFlag : "+processedFlag+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"asgElementId\" value=\""+asgElementId+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"alternateName\" value=\""+alternateName+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"consolidatedElementId\" value=\""+consolidatedElementId+"\">";
		str += "<column name=\"elementId\" value=\""+elementId+"\">";
		str += "<column name=\"elePriority\" value=\""+elePriority+"\">";
		str += "<column name=\"glCode\" value=\""+glCode+"\">";
		str += "<column name=\"glCodeDebit\" value=\""+glCodeDebit+"\">";
		str += "<column name=\"gstExempt\" value=\""+gstExempt+"\">";
		str += "<column name=\"infoFlag\" value=\""+infoFlag+"\">";
		str += "<column name=\"invoiceFlag\" value=\""+invoiceFlag+"\">";
		str += "<column name=\"invoiceId\" value=\""+invoiceId+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"membershipNumber\" value=\""+membershipNumber+"\">";
		str += "<column name=\"percentageAppliedElementId\" value=\""+percentageAppliedElementId+"\">";
		str += "<column name=\"processedFlag\" value=\""+processedFlag+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"asgElementId\":\""+asgElementId+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"alternateName\":\""+alternateName+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"consolidatedElementId\":\""+consolidatedElementId+"\", ";
		str += "\"elementId\":\""+elementId+"\", ";
		str += "\"elePriority\":\""+elePriority+"\", ";
		str += "\"glCode\":\""+glCode+"\", ";
		str += "\"glCodeDebit\":\""+glCodeDebit+"\", ";
		str += "\"gstExempt\":\""+gstExempt+"\", ";
		str += "\"infoFlag\":\""+infoFlag+"\", ";
		str += "\"invoiceFlag\":\""+invoiceFlag+"\", ";
		str += "\"invoiceId\":\""+invoiceId+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"membershipNumber\":\""+membershipNumber+"\", ";
		str += "\"percentageAppliedElementId\":\""+percentageAppliedElementId+"\", ";
		str += "\"processedFlag\":\""+processedFlag+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}