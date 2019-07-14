/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_ASSIGNMENT_RATES_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalAssignmentRatesStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double asgRateId;
	private String ASG_RATE_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
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
	private double advancedPayment;
	private String ADVANCED_PAYMENT;
	private double annualLeaveRate;
	private String ANNUAL_LEAVE_RATE;
	private double bonus;
	private String BONUS;
	private String comments;
	private String COMMENTS;
	private double commission;
	private String COMMISSION;
	private double deductions;
	private String DEDUCTIONS;
	private Date effectiveDate;
	private String EFFECTIVE_DATE;
	private double employeeSuperContribution;
	private String EMPLOYEE_SUPER_CONTRIBUTION;
	private double fbt;
	private String FBT;
	private double lslRate;
	private String LSL_RATE;
	private double normalHours;
	private String NORMAL_HOURS;
	private double normalRate;
	private String NORMAL_RATE;
	private double novatedLease;
	private String NOVATED_LEASE;
	private double overtimeRate;
	private String OVERTIME_RATE;
	private String placement;
	private String PLACEMENT;
	private double salSac;
	private String SAL_SAC;
	private double sickLeaveRate;
	private String SICK_LEAVE_RATE;
	private String transformed;
	private String TRANSFORMED;
	private double transformedAsgId;
	private String TRANSFORMED_ASG_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalAssignmentRatesStage() throws Exception {
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
		setFrwVarPrimaryKey("ASG_RATE_ID,ASSIGNMENT_ID,SUBMISSION_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,EFFECTIVE_DATE");
		setFrwVarNumberColumn("ASG_RATE_ID,ASSIGNMENT_ID,SUBMISSION_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,ADVANCED_PAYMENT,ANNUAL_LEAVE_RATE,BONUS,COMMISSION,DEDUCTIONS,EMPLOYEE_SUPER_CONTRIBUTION,FBT,LSL_RATE,NORMAL_HOURS,NORMAL_RATE,NOVATED_LEASE,OVERTIME_RATE,SAL_SAC,SICK_LEAVE_RATE,TRANSFORMED_ASG_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getAsgRateId() {
		return asgRateId;
	}

	public void setAsgRateId(double asgRateId) throws Exception {
		this.asgRateId = asgRateId;
		setValueFromAccessor("ASG_RATE_ID", CommonUtil.toString(asgRateId));
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

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

	public double getAdvancedPayment() {
		return advancedPayment;
	}

	public void setAdvancedPayment(double advancedPayment) throws Exception {
		this.advancedPayment = advancedPayment;
		setValueFromAccessor("ADVANCED_PAYMENT", CommonUtil.toString(advancedPayment));
	}

	public double getAnnualLeaveRate() {
		return annualLeaveRate;
	}

	public void setAnnualLeaveRate(double annualLeaveRate) throws Exception {
		this.annualLeaveRate = annualLeaveRate;
		setValueFromAccessor("ANNUAL_LEAVE_RATE", CommonUtil.toString(annualLeaveRate));
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) throws Exception {
		this.bonus = bonus;
		setValueFromAccessor("BONUS", CommonUtil.toString(bonus));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) throws Exception {
		this.commission = commission;
		setValueFromAccessor("COMMISSION", CommonUtil.toString(commission));
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) throws Exception {
		this.deductions = deductions;
		setValueFromAccessor("DEDUCTIONS", CommonUtil.toString(deductions));
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) throws Exception {
		this.effectiveDate = effectiveDate;
		setValueFromAccessor("EFFECTIVE_DATE", CommonUtil.toString(effectiveDate));
	}

	public double getEmployeeSuperContribution() {
		return employeeSuperContribution;
	}

	public void setEmployeeSuperContribution(double employeeSuperContribution) throws Exception {
		this.employeeSuperContribution = employeeSuperContribution;
		setValueFromAccessor("EMPLOYEE_SUPER_CONTRIBUTION", CommonUtil.toString(employeeSuperContribution));
	}

	public double getFbt() {
		return fbt;
	}

	public void setFbt(double fbt) throws Exception {
		this.fbt = fbt;
		setValueFromAccessor("FBT", CommonUtil.toString(fbt));
	}

	public double getLslRate() {
		return lslRate;
	}

	public void setLslRate(double lslRate) throws Exception {
		this.lslRate = lslRate;
		setValueFromAccessor("LSL_RATE", CommonUtil.toString(lslRate));
	}

	public double getNormalHours() {
		return normalHours;
	}

	public void setNormalHours(double normalHours) throws Exception {
		this.normalHours = normalHours;
		setValueFromAccessor("NORMAL_HOURS", CommonUtil.toString(normalHours));
	}

	public double getNormalRate() {
		return normalRate;
	}

	public void setNormalRate(double normalRate) throws Exception {
		this.normalRate = normalRate;
		setValueFromAccessor("NORMAL_RATE", CommonUtil.toString(normalRate));
	}

	public double getNovatedLease() {
		return novatedLease;
	}

	public void setNovatedLease(double novatedLease) throws Exception {
		this.novatedLease = novatedLease;
		setValueFromAccessor("NOVATED_LEASE", CommonUtil.toString(novatedLease));
	}

	public double getOvertimeRate() {
		return overtimeRate;
	}

	public void setOvertimeRate(double overtimeRate) throws Exception {
		this.overtimeRate = overtimeRate;
		setValueFromAccessor("OVERTIME_RATE", CommonUtil.toString(overtimeRate));
	}

	public String getPlacement() {
		return placement;
	}

	public void setPlacement(String placement) throws Exception {
		this.placement = placement;
		setValueFromAccessor("PLACEMENT", placement);
	}

	public double getSalSac() {
		return salSac;
	}

	public void setSalSac(double salSac) throws Exception {
		this.salSac = salSac;
		setValueFromAccessor("SAL_SAC", CommonUtil.toString(salSac));
	}

	public double getSickLeaveRate() {
		return sickLeaveRate;
	}

	public void setSickLeaveRate(double sickLeaveRate) throws Exception {
		this.sickLeaveRate = sickLeaveRate;
		setValueFromAccessor("SICK_LEAVE_RATE", CommonUtil.toString(sickLeaveRate));
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
	}

	public double getTransformedAsgId() {
		return transformedAsgId;
	}

	public void setTransformedAsgId(double transformedAsgId) throws Exception {
		this.transformedAsgId = transformedAsgId;
		setValueFromAccessor("TRANSFORMED_ASG_ID", CommonUtil.toString(transformedAsgId));
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
		if (!(object instanceof PortalAssignmentRatesStage)) {
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

		str += "asgRateId : "+asgRateId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "submissionId : "+submissionId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "advancedPayment : "+advancedPayment+"\n";
		str += "annualLeaveRate : "+annualLeaveRate+"\n";
		str += "bonus : "+bonus+"\n";
		str += "comments : "+comments+"\n";
		str += "commission : "+commission+"\n";
		str += "deductions : "+deductions+"\n";
		str += "effectiveDate : "+effectiveDate+"\n";
		str += "employeeSuperContribution : "+employeeSuperContribution+"\n";
		str += "fbt : "+fbt+"\n";
		str += "lslRate : "+lslRate+"\n";
		str += "normalHours : "+normalHours+"\n";
		str += "normalRate : "+normalRate+"\n";
		str += "novatedLease : "+novatedLease+"\n";
		str += "overtimeRate : "+overtimeRate+"\n";
		str += "placement : "+placement+"\n";
		str += "salSac : "+salSac+"\n";
		str += "sickLeaveRate : "+sickLeaveRate+"\n";
		str += "transformed : "+transformed+"\n";
		str += "transformedAsgId : "+transformedAsgId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"asgRateId\" value=\""+asgRateId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"submissionId\" value=\""+submissionId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"advancedPayment\" value=\""+advancedPayment+"\">";
		str += "<column name=\"annualLeaveRate\" value=\""+annualLeaveRate+"\">";
		str += "<column name=\"bonus\" value=\""+bonus+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"commission\" value=\""+commission+"\">";
		str += "<column name=\"deductions\" value=\""+deductions+"\">";
		str += "<column name=\"effectiveDate\" value=\""+effectiveDate+"\">";
		str += "<column name=\"employeeSuperContribution\" value=\""+employeeSuperContribution+"\">";
		str += "<column name=\"fbt\" value=\""+fbt+"\">";
		str += "<column name=\"lslRate\" value=\""+lslRate+"\">";
		str += "<column name=\"normalHours\" value=\""+normalHours+"\">";
		str += "<column name=\"normalRate\" value=\""+normalRate+"\">";
		str += "<column name=\"novatedLease\" value=\""+novatedLease+"\">";
		str += "<column name=\"overtimeRate\" value=\""+overtimeRate+"\">";
		str += "<column name=\"placement\" value=\""+placement+"\">";
		str += "<column name=\"salSac\" value=\""+salSac+"\">";
		str += "<column name=\"sickLeaveRate\" value=\""+sickLeaveRate+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"transformedAsgId\" value=\""+transformedAsgId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"asgRateId\":\""+asgRateId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"submissionId\":\""+submissionId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"advancedPayment\":\""+advancedPayment+"\", ";
		str += "\"annualLeaveRate\":\""+annualLeaveRate+"\", ";
		str += "\"bonus\":\""+bonus+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"commission\":\""+commission+"\", ";
		str += "\"deductions\":\""+deductions+"\", ";
		str += "\"effectiveDate\":\""+effectiveDate+"\", ";
		str += "\"employeeSuperContribution\":\""+employeeSuperContribution+"\", ";
		str += "\"fbt\":\""+fbt+"\", ";
		str += "\"lslRate\":\""+lslRate+"\", ";
		str += "\"normalHours\":\""+normalHours+"\", ";
		str += "\"normalRate\":\""+normalRate+"\", ";
		str += "\"novatedLease\":\""+novatedLease+"\", ";
		str += "\"overtimeRate\":\""+overtimeRate+"\", ";
		str += "\"placement\":\""+placement+"\", ";
		str += "\"salSac\":\""+salSac+"\", ";
		str += "\"sickLeaveRate\":\""+sickLeaveRate+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"transformedAsgId\":\""+transformedAsgId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}