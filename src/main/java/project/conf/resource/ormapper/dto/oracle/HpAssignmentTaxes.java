/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_ASSIGNMENT_TAXES - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpAssignmentTaxes extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double asgTaxId;
	private String ASG_TAX_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double adjustedTaxRate;
	private String ADJUSTED_TAX_RATE;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String calculateGst;
	private String CALCULATE_GST;
	private String companyIproPayment;
	private String COMPANY_IPRO_PAYMENT;
	private String dependantRebate;
	private String DEPENDANT_REBATE;
	private double dependantRebateAmount;
	private String DEPENDANT_REBATE_AMOUNT;
	private String hecs;
	private String HECS;
	private String hecsThresholdClaimed;
	private String HECS_THRESHOLD_CLAIMED;
	private String irdNumber;
	private String IRD_NUMBER;
	private String overwriteTax;
	private String OVERWRITE_TAX;
	private String paymentType;
	private String PAYMENT_TYPE;
	private String payrollType;
	private String PAYROLL_TYPE;
	private double protectedNet;
	private String PROTECTED_NET;
	private String protectedPer;
	private String PROTECTED_PER;
	private String studentScheme;
	private String STUDENT_SCHEME;
	private String studentSchemeThresholdClaim;
	private String STUDENT_SCHEME_THRESHOLD_CLAIM;
	private String taxCode;
	private String TAX_CODE;
	private double taxScale;
	private String TAX_SCALE;
	private String tfn;
	private String TFN;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpAssignmentTaxes() throws Exception {
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
		setFrwVarPrimaryKey("ASG_TAX_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("ASG_TAX_ID,CREATED_BY,LAST_UPDATED_BY,ASSIGNMENT_ID,ADJUSTED_TAX_RATE,BUSINESS_GROUP_ID,DEPENDANT_REBATE_AMOUNT,PROTECTED_NET,TAX_SCALE");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getAsgTaxId() {
		return asgTaxId;
	}

	public void setAsgTaxId(double asgTaxId) throws Exception {
		this.asgTaxId = asgTaxId;
		setValueFromAccessor("ASG_TAX_ID", CommonUtil.toString(asgTaxId));
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

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getAdjustedTaxRate() {
		return adjustedTaxRate;
	}

	public void setAdjustedTaxRate(double adjustedTaxRate) throws Exception {
		this.adjustedTaxRate = adjustedTaxRate;
		setValueFromAccessor("ADJUSTED_TAX_RATE", CommonUtil.toString(adjustedTaxRate));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public String getCalculateGst() {
		return calculateGst;
	}

	public void setCalculateGst(String calculateGst) throws Exception {
		this.calculateGst = calculateGst;
		setValueFromAccessor("CALCULATE_GST", calculateGst);
	}

	public String getCompanyIproPayment() {
		return companyIproPayment;
	}

	public void setCompanyIproPayment(String companyIproPayment) throws Exception {
		this.companyIproPayment = companyIproPayment;
		setValueFromAccessor("COMPANY_IPRO_PAYMENT", companyIproPayment);
	}

	public String getDependantRebate() {
		return dependantRebate;
	}

	public void setDependantRebate(String dependantRebate) throws Exception {
		this.dependantRebate = dependantRebate;
		setValueFromAccessor("DEPENDANT_REBATE", dependantRebate);
	}

	public double getDependantRebateAmount() {
		return dependantRebateAmount;
	}

	public void setDependantRebateAmount(double dependantRebateAmount) throws Exception {
		this.dependantRebateAmount = dependantRebateAmount;
		setValueFromAccessor("DEPENDANT_REBATE_AMOUNT", CommonUtil.toString(dependantRebateAmount));
	}

	public String getHecs() {
		return hecs;
	}

	public void setHecs(String hecs) throws Exception {
		this.hecs = hecs;
		setValueFromAccessor("HECS", hecs);
	}

	public String getHecsThresholdClaimed() {
		return hecsThresholdClaimed;
	}

	public void setHecsThresholdClaimed(String hecsThresholdClaimed) throws Exception {
		this.hecsThresholdClaimed = hecsThresholdClaimed;
		setValueFromAccessor("HECS_THRESHOLD_CLAIMED", hecsThresholdClaimed);
	}

	public String getIrdNumber() {
		return irdNumber;
	}

	public void setIrdNumber(String irdNumber) throws Exception {
		this.irdNumber = irdNumber;
		setValueFromAccessor("IRD_NUMBER", irdNumber);
	}

	public String getOverwriteTax() {
		return overwriteTax;
	}

	public void setOverwriteTax(String overwriteTax) throws Exception {
		this.overwriteTax = overwriteTax;
		setValueFromAccessor("OVERWRITE_TAX", overwriteTax);
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) throws Exception {
		this.paymentType = paymentType;
		setValueFromAccessor("PAYMENT_TYPE", paymentType);
	}

	public String getPayrollType() {
		return payrollType;
	}

	public void setPayrollType(String payrollType) throws Exception {
		this.payrollType = payrollType;
		setValueFromAccessor("PAYROLL_TYPE", payrollType);
	}

	public double getProtectedNet() {
		return protectedNet;
	}

	public void setProtectedNet(double protectedNet) throws Exception {
		this.protectedNet = protectedNet;
		setValueFromAccessor("PROTECTED_NET", CommonUtil.toString(protectedNet));
	}

	public String getProtectedPer() {
		return protectedPer;
	}

	public void setProtectedPer(String protectedPer) throws Exception {
		this.protectedPer = protectedPer;
		setValueFromAccessor("PROTECTED_PER", protectedPer);
	}

	public String getStudentScheme() {
		return studentScheme;
	}

	public void setStudentScheme(String studentScheme) throws Exception {
		this.studentScheme = studentScheme;
		setValueFromAccessor("STUDENT_SCHEME", studentScheme);
	}

	public String getStudentSchemeThresholdClaim() {
		return studentSchemeThresholdClaim;
	}

	public void setStudentSchemeThresholdClaim(String studentSchemeThresholdClaim) throws Exception {
		this.studentSchemeThresholdClaim = studentSchemeThresholdClaim;
		setValueFromAccessor("STUDENT_SCHEME_THRESHOLD_CLAIM", studentSchemeThresholdClaim);
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) throws Exception {
		this.taxCode = taxCode;
		setValueFromAccessor("TAX_CODE", taxCode);
	}

	public double getTaxScale() {
		return taxScale;
	}

	public void setTaxScale(double taxScale) throws Exception {
		this.taxScale = taxScale;
		setValueFromAccessor("TAX_SCALE", CommonUtil.toString(taxScale));
	}

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) throws Exception {
		this.tfn = tfn;
		setValueFromAccessor("TFN", tfn);
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

		str += "asgTaxId : "+asgTaxId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "adjustedTaxRate : "+adjustedTaxRate+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "calculateGst : "+calculateGst+"\n";
		str += "companyIproPayment : "+companyIproPayment+"\n";
		str += "dependantRebate : "+dependantRebate+"\n";
		str += "dependantRebateAmount : "+dependantRebateAmount+"\n";
		str += "hecs : "+hecs+"\n";
		str += "hecsThresholdClaimed : "+hecsThresholdClaimed+"\n";
		str += "irdNumber : "+irdNumber+"\n";
		str += "overwriteTax : "+overwriteTax+"\n";
		str += "paymentType : "+paymentType+"\n";
		str += "payrollType : "+payrollType+"\n";
		str += "protectedNet : "+protectedNet+"\n";
		str += "protectedPer : "+protectedPer+"\n";
		str += "studentScheme : "+studentScheme+"\n";
		str += "studentSchemeThresholdClaim : "+studentSchemeThresholdClaim+"\n";
		str += "taxCode : "+taxCode+"\n";
		str += "taxScale : "+taxScale+"\n";
		str += "tfn : "+tfn+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"asgTaxId\" value=\""+asgTaxId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"adjustedTaxRate\" value=\""+adjustedTaxRate+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"calculateGst\" value=\""+calculateGst+"\">";
		str += "<column name=\"companyIproPayment\" value=\""+companyIproPayment+"\">";
		str += "<column name=\"dependantRebate\" value=\""+dependantRebate+"\">";
		str += "<column name=\"dependantRebateAmount\" value=\""+dependantRebateAmount+"\">";
		str += "<column name=\"hecs\" value=\""+hecs+"\">";
		str += "<column name=\"hecsThresholdClaimed\" value=\""+hecsThresholdClaimed+"\">";
		str += "<column name=\"irdNumber\" value=\""+irdNumber+"\">";
		str += "<column name=\"overwriteTax\" value=\""+overwriteTax+"\">";
		str += "<column name=\"paymentType\" value=\""+paymentType+"\">";
		str += "<column name=\"payrollType\" value=\""+payrollType+"\">";
		str += "<column name=\"protectedNet\" value=\""+protectedNet+"\">";
		str += "<column name=\"protectedPer\" value=\""+protectedPer+"\">";
		str += "<column name=\"studentScheme\" value=\""+studentScheme+"\">";
		str += "<column name=\"studentSchemeThresholdClaim\" value=\""+studentSchemeThresholdClaim+"\">";
		str += "<column name=\"taxCode\" value=\""+taxCode+"\">";
		str += "<column name=\"taxScale\" value=\""+taxScale+"\">";
		str += "<column name=\"tfn\" value=\""+tfn+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"asgTaxId\":\""+asgTaxId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"adjustedTaxRate\":\""+adjustedTaxRate+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"calculateGst\":\""+calculateGst+"\", ";
		str += "\"companyIproPayment\":\""+companyIproPayment+"\", ";
		str += "\"dependantRebate\":\""+dependantRebate+"\", ";
		str += "\"dependantRebateAmount\":\""+dependantRebateAmount+"\", ";
		str += "\"hecs\":\""+hecs+"\", ";
		str += "\"hecsThresholdClaimed\":\""+hecsThresholdClaimed+"\", ";
		str += "\"irdNumber\":\""+irdNumber+"\", ";
		str += "\"overwriteTax\":\""+overwriteTax+"\", ";
		str += "\"paymentType\":\""+paymentType+"\", ";
		str += "\"payrollType\":\""+payrollType+"\", ";
		str += "\"protectedNet\":\""+protectedNet+"\", ";
		str += "\"protectedPer\":\""+protectedPer+"\", ";
		str += "\"studentScheme\":\""+studentScheme+"\", ";
		str += "\"studentSchemeThresholdClaim\":\""+studentSchemeThresholdClaim+"\", ";
		str += "\"taxCode\":\""+taxCode+"\", ";
		str += "\"taxScale\":\""+taxScale+"\", ";
		str += "\"tfn\":\""+tfn+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}