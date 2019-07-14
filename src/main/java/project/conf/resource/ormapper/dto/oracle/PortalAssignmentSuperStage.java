/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_ASSIGNMENT_SUPER_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalAssignmentSuperStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double submissionId;
	private String SUBMISSION_ID;
	private double asgElementId;
	private String ASG_ELEMENT_ID;
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
	private String alternateName;
	private String ALTERNATE_NAME;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double elementId;
	private String ELEMENT_ID;
	private Date fromDate;
	private String FROM_DATE;
	private String gstExempt;
	private String GST_EXEMPT;
	private String isActive;
	private String IS_ACTIVE;
	private String membershipNumber;
	private String MEMBERSHIP_NUMBER;
	private double percentageAppliedElementId;
	private String PERCENTAGE_APPLIED_ELEMENT_ID;
	private String superFund;
	private String SUPER_FUND;
	private double superFundId;
	private String SUPER_FUND_ID;
	private Date toDate;
	private String TO_DATE;
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
	public PortalAssignmentSuperStage() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,FROM_DATE,TO_DATE");
		setFrwVarNumberColumn("SUBMISSION_ID,ASG_ELEMENT_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,ASSIGNMENT_ID,ELEMENT_ID,PERCENTAGE_APPLIED_ELEMENT_ID,SUPER_FUND_ID");
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

	public double getAsgElementId() {
		return asgElementId;
	}

	public void setAsgElementId(double asgElementId) throws Exception {
		this.asgElementId = asgElementId;
		setValueFromAccessor("ASG_ELEMENT_ID", CommonUtil.toString(asgElementId));
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

	public String getGstExempt() {
		return gstExempt;
	}

	public void setGstExempt(String gstExempt) throws Exception {
		this.gstExempt = gstExempt;
		setValueFromAccessor("GST_EXEMPT", gstExempt);
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

	public String getSuperFund() {
		return superFund;
	}

	public void setSuperFund(String superFund) throws Exception {
		this.superFund = superFund;
		setValueFromAccessor("SUPER_FUND", superFund);
	}

	public double getSuperFundId() {
		return superFundId;
	}

	public void setSuperFundId(double superFundId) throws Exception {
		this.superFundId = superFundId;
		setValueFromAccessor("SUPER_FUND_ID", CommonUtil.toString(superFundId));
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) throws Exception {
		this.toDate = toDate;
		setValueFromAccessor("TO_DATE", CommonUtil.toString(toDate));
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

		str += "submissionId : "+submissionId+"\n";
		str += "asgElementId : "+asgElementId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "alternateName : "+alternateName+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "elementId : "+elementId+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "gstExempt : "+gstExempt+"\n";
		str += "isActive : "+isActive+"\n";
		str += "membershipNumber : "+membershipNumber+"\n";
		str += "percentageAppliedElementId : "+percentageAppliedElementId+"\n";
		str += "superFund : "+superFund+"\n";
		str += "superFundId : "+superFundId+"\n";
		str += "toDate : "+toDate+"\n";
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

		str += "<column name=\"submissionId\" value=\""+submissionId+"\">";
		str += "<column name=\"asgElementId\" value=\""+asgElementId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"alternateName\" value=\""+alternateName+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"elementId\" value=\""+elementId+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"gstExempt\" value=\""+gstExempt+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"membershipNumber\" value=\""+membershipNumber+"\">";
		str += "<column name=\"percentageAppliedElementId\" value=\""+percentageAppliedElementId+"\">";
		str += "<column name=\"superFund\" value=\""+superFund+"\">";
		str += "<column name=\"superFundId\" value=\""+superFundId+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
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

		str += "\"submissionId\":\""+submissionId+"\", ";
		str += "\"asgElementId\":\""+asgElementId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"alternateName\":\""+alternateName+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"elementId\":\""+elementId+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"gstExempt\":\""+gstExempt+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"membershipNumber\":\""+membershipNumber+"\", ";
		str += "\"percentageAppliedElementId\":\""+percentageAppliedElementId+"\", ";
		str += "\"superFund\":\""+superFund+"\", ";
		str += "\"superFundId\":\""+superFundId+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}