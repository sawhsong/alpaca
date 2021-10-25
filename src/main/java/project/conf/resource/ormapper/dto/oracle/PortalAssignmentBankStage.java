/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_ASSIGNMENT_BANK_STAGE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalAssignmentBankStage extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double asgPayMethodId;
	private String ASG_PAY_METHOD_ID;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double submissionId;
	private String SUBMISSION_ID;
	private String accountName;
	private String ACCOUNT_NAME;
	private String accountNumber;
	private String ACCOUNT_NUMBER;
	private String bankName;
	private String BANK_NAME;
	private String bsb;
	private String BSB;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date fromDate;
	private String FROM_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private Date toDate;
	private String TO_DATE;
	private double amount;
	private String AMOUNT;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double percentage;
	private String PERCENTAGE;
	private double priority;
	private String PRIORITY;
	private String status;
	private String STATUS;
	private Date statusDate;
	private String STATUS_DATE;
	private String transformed;
	private String TRANSFORMED;
	private double transformedAsgId;
	private String TRANSFORMED_ASG_ID;
	private double transformedAsgPayMethodId;
	private String TRANSFORMED_ASG_PAY_METHOD_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalAssignmentBankStage() throws Exception {
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
		setFrwVarPrimaryKey("ASG_PAY_METHOD_ID,ASSIGNMENT_ID,SUBMISSION_ID");
		setFrwVarDateColumn("CREATION_DATE,FROM_DATE,LAST_UPDATE_DATE,TO_DATE,STATUS_DATE");
		setFrwVarNumberColumn("ASG_PAY_METHOD_ID,ASSIGNMENT_ID,SUBMISSION_ID,CREATED_BY,LAST_UPDATED_BY,AMOUNT,BUSINESS_GROUP_ID,PERCENTAGE,PRIORITY,TRANSFORMED_ASG_ID,TRANSFORMED_ASG_PAY_METHOD_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getAsgPayMethodId() {
		return asgPayMethodId;
	}

	public void setAsgPayMethodId(double asgPayMethodId) throws Exception {
		this.asgPayMethodId = asgPayMethodId;
		setValueFromAccessor("ASG_PAY_METHOD_ID", CommonUtil.toString(asgPayMethodId));
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) throws Exception {
		this.accountName = accountName;
		setValueFromAccessor("ACCOUNT_NAME", accountName);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) throws Exception {
		this.accountNumber = accountNumber;
		setValueFromAccessor("ACCOUNT_NUMBER", accountNumber);
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) throws Exception {
		this.bankName = bankName;
		setValueFromAccessor("BANK_NAME", bankName);
	}

	public String getBsb() {
		return bsb;
	}

	public void setBsb(String bsb) throws Exception {
		this.bsb = bsb;
		setValueFromAccessor("BSB", bsb);
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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) throws Exception {
		this.fromDate = fromDate;
		setValueFromAccessor("FROM_DATE", CommonUtil.toString(fromDate));
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

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) throws Exception {
		this.toDate = toDate;
		setValueFromAccessor("TO_DATE", CommonUtil.toString(toDate));
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) throws Exception {
		this.amount = amount;
		setValueFromAccessor("AMOUNT", CommonUtil.toString(amount));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) throws Exception {
		this.percentage = percentage;
		setValueFromAccessor("PERCENTAGE", CommonUtil.toString(percentage));
	}

	public double getPriority() {
		return priority;
	}

	public void setPriority(double priority) throws Exception {
		this.priority = priority;
		setValueFromAccessor("PRIORITY", CommonUtil.toString(priority));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) throws Exception {
		this.statusDate = statusDate;
		setValueFromAccessor("STATUS_DATE", CommonUtil.toString(statusDate));
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

	public double getTransformedAsgPayMethodId() {
		return transformedAsgPayMethodId;
	}

	public void setTransformedAsgPayMethodId(double transformedAsgPayMethodId) throws Exception {
		this.transformedAsgPayMethodId = transformedAsgPayMethodId;
		setValueFromAccessor("TRANSFORMED_ASG_PAY_METHOD_ID", CommonUtil.toString(transformedAsgPayMethodId));
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
		if (!(object instanceof PortalAssignmentBankStage)) {
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

		str += "asgPayMethodId : "+asgPayMethodId+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "submissionId : "+submissionId+"\n";
		str += "accountName : "+accountName+"\n";
		str += "accountNumber : "+accountNumber+"\n";
		str += "bankName : "+bankName+"\n";
		str += "bsb : "+bsb+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "toDate : "+toDate+"\n";
		str += "amount : "+amount+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "percentage : "+percentage+"\n";
		str += "priority : "+priority+"\n";
		str += "status : "+status+"\n";
		str += "statusDate : "+statusDate+"\n";
		str += "transformed : "+transformed+"\n";
		str += "transformedAsgId : "+transformedAsgId+"\n";
		str += "transformedAsgPayMethodId : "+transformedAsgPayMethodId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"asgPayMethodId\" value=\""+asgPayMethodId+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"submissionId\" value=\""+submissionId+"\">";
		str += "<column name=\"accountName\" value=\""+accountName+"\">";
		str += "<column name=\"accountNumber\" value=\""+accountNumber+"\">";
		str += "<column name=\"bankName\" value=\""+bankName+"\">";
		str += "<column name=\"bsb\" value=\""+bsb+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"toDate\" value=\""+toDate+"\">";
		str += "<column name=\"amount\" value=\""+amount+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"percentage\" value=\""+percentage+"\">";
		str += "<column name=\"priority\" value=\""+priority+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"statusDate\" value=\""+statusDate+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"transformedAsgId\" value=\""+transformedAsgId+"\">";
		str += "<column name=\"transformedAsgPayMethodId\" value=\""+transformedAsgPayMethodId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"asgPayMethodId\":\""+asgPayMethodId+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"submissionId\":\""+submissionId+"\", ";
		str += "\"accountName\":\""+accountName+"\", ";
		str += "\"accountNumber\":\""+accountNumber+"\", ";
		str += "\"bankName\":\""+bankName+"\", ";
		str += "\"bsb\":\""+bsb+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"toDate\":\""+toDate+"\", ";
		str += "\"amount\":\""+amount+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"percentage\":\""+percentage+"\", ";
		str += "\"priority\":\""+priority+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"statusDate\":\""+statusDate+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"transformedAsgId\":\""+transformedAsgId+"\", ";
		str += "\"transformedAsgPayMethodId\":\""+transformedAsgPayMethodId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}