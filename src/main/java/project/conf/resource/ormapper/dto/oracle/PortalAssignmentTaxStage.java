/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_ASSIGNMENT_TAX_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalAssignmentTaxStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double submissionId;
	private String SUBMISSION_ID;
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
	private String tfn;
	private String TFN;
	private double asgTaxId;
	private String ASG_TAX_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private String austYn;
	private String AUST_YN;
	private String dependantRebate;
	private String DEPENDANT_REBATE;
	private double dependantRebateAmount;
	private String DEPENDANT_REBATE_AMOUNT;
	private String hecs;
	private String HECS;
	private String hecsThresholdClaimed;
	private String HECS_THRESHOLD_CLAIMED;
	private String studentScheme;
	private String STUDENT_SCHEME;
	private String studentSchemeThresholdClaim;
	private String STUDENT_SCHEME_THRESHOLD_CLAIM;
	private String taxFreeThreasholdYn;
	private String TAX_FREE_THREASHOLD_YN;
	private double taxScaleId;
	private String TAX_SCALE_ID;
	private String transformed;
	private String TRANSFORMED;
	private double withholdingAmt;
	private String WITHHOLDING_AMT;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalAssignmentTaxStage() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("SUBMISSION_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,ASG_TAX_ID,ASSIGNMENT_ID,DEPENDANT_REBATE_AMOUNT,TAX_SCALE_ID,WITHHOLDING_AMT");
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

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) throws Exception {
		this.tfn = tfn;
		setValueFromAccessor("TFN", tfn);
	}

	public double getAsgTaxId() {
		return asgTaxId;
	}

	public void setAsgTaxId(double asgTaxId) throws Exception {
		this.asgTaxId = asgTaxId;
		setValueFromAccessor("ASG_TAX_ID", CommonUtil.toString(asgTaxId));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public String getAustYn() {
		return austYn;
	}

	public void setAustYn(String austYn) throws Exception {
		this.austYn = austYn;
		setValueFromAccessor("AUST_YN", austYn);
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

	public String getTaxFreeThreasholdYn() {
		return taxFreeThreasholdYn;
	}

	public void setTaxFreeThreasholdYn(String taxFreeThreasholdYn) throws Exception {
		this.taxFreeThreasholdYn = taxFreeThreasholdYn;
		setValueFromAccessor("TAX_FREE_THREASHOLD_YN", taxFreeThreasholdYn);
	}

	public double getTaxScaleId() {
		return taxScaleId;
	}

	public void setTaxScaleId(double taxScaleId) throws Exception {
		this.taxScaleId = taxScaleId;
		setValueFromAccessor("TAX_SCALE_ID", CommonUtil.toString(taxScaleId));
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
	}

	public double getWithholdingAmt() {
		return withholdingAmt;
	}

	public void setWithholdingAmt(double withholdingAmt) throws Exception {
		this.withholdingAmt = withholdingAmt;
		setValueFromAccessor("WITHHOLDING_AMT", CommonUtil.toString(withholdingAmt));
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
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "tfn : "+tfn+"\n";
		str += "asgTaxId : "+asgTaxId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "austYn : "+austYn+"\n";
		str += "dependantRebate : "+dependantRebate+"\n";
		str += "dependantRebateAmount : "+dependantRebateAmount+"\n";
		str += "hecs : "+hecs+"\n";
		str += "hecsThresholdClaimed : "+hecsThresholdClaimed+"\n";
		str += "studentScheme : "+studentScheme+"\n";
		str += "studentSchemeThresholdClaim : "+studentSchemeThresholdClaim+"\n";
		str += "taxFreeThreasholdYn : "+taxFreeThreasholdYn+"\n";
		str += "taxScaleId : "+taxScaleId+"\n";
		str += "transformed : "+transformed+"\n";
		str += "withholdingAmt : "+withholdingAmt+"\n";
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
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"tfn\" value=\""+tfn+"\">";
		str += "<column name=\"asgTaxId\" value=\""+asgTaxId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"austYn\" value=\""+austYn+"\">";
		str += "<column name=\"dependantRebate\" value=\""+dependantRebate+"\">";
		str += "<column name=\"dependantRebateAmount\" value=\""+dependantRebateAmount+"\">";
		str += "<column name=\"hecs\" value=\""+hecs+"\">";
		str += "<column name=\"hecsThresholdClaimed\" value=\""+hecsThresholdClaimed+"\">";
		str += "<column name=\"studentScheme\" value=\""+studentScheme+"\">";
		str += "<column name=\"studentSchemeThresholdClaim\" value=\""+studentSchemeThresholdClaim+"\">";
		str += "<column name=\"taxFreeThreasholdYn\" value=\""+taxFreeThreasholdYn+"\">";
		str += "<column name=\"taxScaleId\" value=\""+taxScaleId+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"withholdingAmt\" value=\""+withholdingAmt+"\">";
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
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"tfn\":\""+tfn+"\", ";
		str += "\"asgTaxId\":\""+asgTaxId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"austYn\":\""+austYn+"\", ";
		str += "\"dependantRebate\":\""+dependantRebate+"\", ";
		str += "\"dependantRebateAmount\":\""+dependantRebateAmount+"\", ";
		str += "\"hecs\":\""+hecs+"\", ";
		str += "\"hecsThresholdClaimed\":\""+hecsThresholdClaimed+"\", ";
		str += "\"studentScheme\":\""+studentScheme+"\", ";
		str += "\"studentSchemeThresholdClaim\":\""+studentSchemeThresholdClaim+"\", ";
		str += "\"taxFreeThreasholdYn\":\""+taxFreeThreasholdYn+"\", ";
		str += "\"taxScaleId\":\""+taxScaleId+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"withholdingAmt\":\""+withholdingAmt+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}