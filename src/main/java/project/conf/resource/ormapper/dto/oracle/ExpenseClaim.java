/**************************************************************************************************
 * Framework Generated DTO Source
 * - EXPENSE_CLAIM - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class ExpenseClaim extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double expenseClaimId;
	private String EXPENSE_CLAIM_ID;
	private String accountName;
	private String ACCOUNT_NAME;
	private String accountNumber;
	private String ACCOUNT_NUMBER;
	private double amount;
	private String AMOUNT;
	private String approveRejectComments;
	private String APPROVE_REJECT_COMMENTS;
	private Date approveRejectDate;
	private String APPROVE_REJECT_DATE;
	private String approveRejectIpAddress;
	private String APPROVE_REJECT_IP_ADDRESS;
	private double approveRejectPersonId;
	private String APPROVE_REJECT_PERSON_ID;
	private String bsb;
	private String BSB;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date dateOfClaim;
	private String DATE_OF_CLAIM;
	private String department;
	private String DEPARTMENT;
	private String description;
	private String DESCRIPTION;
	private String expenseType;
	private String EXPENSE_TYPE;
	private double gst;
	private String GST;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double personId;
	private String PERSON_ID;
	private Date processedDate;
	private String PROCESSED_DATE;
	private String status;
	private String STATUS;
	private Date submittedDate;
	private String SUBMITTED_DATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public ExpenseClaim() throws Exception {
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
		setFrwVarPrimaryKey("EXPENSE_CLAIM_ID");
		setFrwVarDateColumn("APPROVE_REJECT_DATE,CREATION_DATE,DATE_OF_CLAIM,LAST_UPDATE_DATE,PROCESSED_DATE,SUBMITTED_DATE");
		setFrwVarNumberColumn("EXPENSE_CLAIM_ID,AMOUNT,APPROVE_REJECT_PERSON_ID,CREATED_BY,GST,LAST_UPDATED_BY,PERSON_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getExpenseClaimId() {
		return expenseClaimId;
	}

	public void setExpenseClaimId(double expenseClaimId) throws Exception {
		this.expenseClaimId = expenseClaimId;
		setValueFromAccessor("EXPENSE_CLAIM_ID", CommonUtil.toString(expenseClaimId));
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) throws Exception {
		this.amount = amount;
		setValueFromAccessor("AMOUNT", CommonUtil.toString(amount));
	}

	public String getApproveRejectComments() {
		return approveRejectComments;
	}

	public void setApproveRejectComments(String approveRejectComments) throws Exception {
		this.approveRejectComments = approveRejectComments;
		setValueFromAccessor("APPROVE_REJECT_COMMENTS", approveRejectComments);
	}

	public Date getApproveRejectDate() {
		return approveRejectDate;
	}

	public void setApproveRejectDate(Date approveRejectDate) throws Exception {
		this.approveRejectDate = approveRejectDate;
		setValueFromAccessor("APPROVE_REJECT_DATE", CommonUtil.toString(approveRejectDate));
	}

	public String getApproveRejectIpAddress() {
		return approveRejectIpAddress;
	}

	public void setApproveRejectIpAddress(String approveRejectIpAddress) throws Exception {
		this.approveRejectIpAddress = approveRejectIpAddress;
		setValueFromAccessor("APPROVE_REJECT_IP_ADDRESS", approveRejectIpAddress);
	}

	public double getApproveRejectPersonId() {
		return approveRejectPersonId;
	}

	public void setApproveRejectPersonId(double approveRejectPersonId) throws Exception {
		this.approveRejectPersonId = approveRejectPersonId;
		setValueFromAccessor("APPROVE_REJECT_PERSON_ID", CommonUtil.toString(approveRejectPersonId));
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

	public Date getDateOfClaim() {
		return dateOfClaim;
	}

	public void setDateOfClaim(Date dateOfClaim) throws Exception {
		this.dateOfClaim = dateOfClaim;
		setValueFromAccessor("DATE_OF_CLAIM", CommonUtil.toString(dateOfClaim));
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) throws Exception {
		this.department = department;
		setValueFromAccessor("DEPARTMENT", department);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) throws Exception {
		this.expenseType = expenseType;
		setValueFromAccessor("EXPENSE_TYPE", expenseType);
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) throws Exception {
		this.gst = gst;
		setValueFromAccessor("GST", CommonUtil.toString(gst));
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

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public Date getProcessedDate() {
		return processedDate;
	}

	public void setProcessedDate(Date processedDate) throws Exception {
		this.processedDate = processedDate;
		setValueFromAccessor("PROCESSED_DATE", CommonUtil.toString(processedDate));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) throws Exception {
		this.submittedDate = submittedDate;
		setValueFromAccessor("SUBMITTED_DATE", CommonUtil.toString(submittedDate));
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

		str += "expenseClaimId : "+expenseClaimId+"\n";
		str += "accountName : "+accountName+"\n";
		str += "accountNumber : "+accountNumber+"\n";
		str += "amount : "+amount+"\n";
		str += "approveRejectComments : "+approveRejectComments+"\n";
		str += "approveRejectDate : "+approveRejectDate+"\n";
		str += "approveRejectIpAddress : "+approveRejectIpAddress+"\n";
		str += "approveRejectPersonId : "+approveRejectPersonId+"\n";
		str += "bsb : "+bsb+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "dateOfClaim : "+dateOfClaim+"\n";
		str += "department : "+department+"\n";
		str += "description : "+description+"\n";
		str += "expenseType : "+expenseType+"\n";
		str += "gst : "+gst+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "personId : "+personId+"\n";
		str += "processedDate : "+processedDate+"\n";
		str += "status : "+status+"\n";
		str += "submittedDate : "+submittedDate+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"expenseClaimId\" value=\""+expenseClaimId+"\">";
		str += "<column name=\"accountName\" value=\""+accountName+"\">";
		str += "<column name=\"accountNumber\" value=\""+accountNumber+"\">";
		str += "<column name=\"amount\" value=\""+amount+"\">";
		str += "<column name=\"approveRejectComments\" value=\""+approveRejectComments+"\">";
		str += "<column name=\"approveRejectDate\" value=\""+approveRejectDate+"\">";
		str += "<column name=\"approveRejectIpAddress\" value=\""+approveRejectIpAddress+"\">";
		str += "<column name=\"approveRejectPersonId\" value=\""+approveRejectPersonId+"\">";
		str += "<column name=\"bsb\" value=\""+bsb+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"dateOfClaim\" value=\""+dateOfClaim+"\">";
		str += "<column name=\"department\" value=\""+department+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"expenseType\" value=\""+expenseType+"\">";
		str += "<column name=\"gst\" value=\""+gst+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"processedDate\" value=\""+processedDate+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"submittedDate\" value=\""+submittedDate+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"expenseClaimId\":\""+expenseClaimId+"\", ";
		str += "\"accountName\":\""+accountName+"\", ";
		str += "\"accountNumber\":\""+accountNumber+"\", ";
		str += "\"amount\":\""+amount+"\", ";
		str += "\"approveRejectComments\":\""+approveRejectComments+"\", ";
		str += "\"approveRejectDate\":\""+approveRejectDate+"\", ";
		str += "\"approveRejectIpAddress\":\""+approveRejectIpAddress+"\", ";
		str += "\"approveRejectPersonId\":\""+approveRejectPersonId+"\", ";
		str += "\"bsb\":\""+bsb+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"dateOfClaim\":\""+dateOfClaim+"\", ";
		str += "\"department\":\""+department+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"expenseType\":\""+expenseType+"\", ";
		str += "\"gst\":\""+gst+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"processedDate\":\""+processedDate+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"submittedDate\":\""+submittedDate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}