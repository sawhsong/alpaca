/**************************************************************************************************
 * Framework Generated DTO Source
 * - TIMEPRO_IMPORT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class TimeproImport extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double importId;
	private String IMPORT_ID;
	private double loginId;
	private String LOGIN_ID;
	private String role;
	private String ROLE;
	private String authManager;
	private String AUTH_MANAGER;
	private String authManagerEmail;
	private String AUTH_MANAGER_EMAIL;
	private String clientInvoiceNumber;
	private String CLIENT_INVOICE_NUMBER;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String customerName;
	private String CUSTOMER_NAME;
	private Date dateWorked;
	private String DATE_WORKED;
	private double exportBatchId;
	private String EXPORT_BATCH_ID;
	private double hoursWorked;
	private String HOURS_WORKED;
	private double hoursWorkedOld;
	private String HOURS_WORKED_OLD;
	private String instance;
	private String INSTANCE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String projectDescription;
	private String PROJECT_DESCRIPTION;
	private String staffName;
	private String STAFF_NAME;
	private String workDescription;
	private String WORK_DESCRIPTION;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public TimeproImport() throws Exception {
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
		setFrwVarPrimaryKey("IMPORT_ID");
		setFrwVarDateColumn("CREATION_DATE,DATE_WORKED,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("IMPORT_ID,LOGIN_ID,CREATED_BY,EXPORT_BATCH_ID,HOURS_WORKED,HOURS_WORKED_OLD,LAST_UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getImportId() {
		return importId;
	}

	public void setImportId(double importId) throws Exception {
		this.importId = importId;
		setValueFromAccessor("IMPORT_ID", CommonUtil.toString(importId));
	}

	public double getLoginId() {
		return loginId;
	}

	public void setLoginId(double loginId) throws Exception {
		this.loginId = loginId;
		setValueFromAccessor("LOGIN_ID", CommonUtil.toString(loginId));
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) throws Exception {
		this.role = role;
		setValueFromAccessor("ROLE", role);
	}

	public String getAuthManager() {
		return authManager;
	}

	public void setAuthManager(String authManager) throws Exception {
		this.authManager = authManager;
		setValueFromAccessor("AUTH_MANAGER", authManager);
	}

	public String getAuthManagerEmail() {
		return authManagerEmail;
	}

	public void setAuthManagerEmail(String authManagerEmail) throws Exception {
		this.authManagerEmail = authManagerEmail;
		setValueFromAccessor("AUTH_MANAGER_EMAIL", authManagerEmail);
	}

	public String getClientInvoiceNumber() {
		return clientInvoiceNumber;
	}

	public void setClientInvoiceNumber(String clientInvoiceNumber) throws Exception {
		this.clientInvoiceNumber = clientInvoiceNumber;
		setValueFromAccessor("CLIENT_INVOICE_NUMBER", clientInvoiceNumber);
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) throws Exception {
		this.customerName = customerName;
		setValueFromAccessor("CUSTOMER_NAME", customerName);
	}

	public Date getDateWorked() {
		return dateWorked;
	}

	public void setDateWorked(Date dateWorked) throws Exception {
		this.dateWorked = dateWorked;
		setValueFromAccessor("DATE_WORKED", CommonUtil.toString(dateWorked));
	}

	public double getExportBatchId() {
		return exportBatchId;
	}

	public void setExportBatchId(double exportBatchId) throws Exception {
		this.exportBatchId = exportBatchId;
		setValueFromAccessor("EXPORT_BATCH_ID", CommonUtil.toString(exportBatchId));
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) throws Exception {
		this.hoursWorked = hoursWorked;
		setValueFromAccessor("HOURS_WORKED", CommonUtil.toString(hoursWorked));
	}

	public double getHoursWorkedOld() {
		return hoursWorkedOld;
	}

	public void setHoursWorkedOld(double hoursWorkedOld) throws Exception {
		this.hoursWorkedOld = hoursWorkedOld;
		setValueFromAccessor("HOURS_WORKED_OLD", CommonUtil.toString(hoursWorkedOld));
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) throws Exception {
		this.instance = instance;
		setValueFromAccessor("INSTANCE", instance);
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

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) throws Exception {
		this.projectDescription = projectDescription;
		setValueFromAccessor("PROJECT_DESCRIPTION", projectDescription);
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) throws Exception {
		this.staffName = staffName;
		setValueFromAccessor("STAFF_NAME", staffName);
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) throws Exception {
		this.workDescription = workDescription;
		setValueFromAccessor("WORK_DESCRIPTION", workDescription);
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

		str += "importId : "+importId+"\n";
		str += "loginId : "+loginId+"\n";
		str += "role : "+role+"\n";
		str += "authManager : "+authManager+"\n";
		str += "authManagerEmail : "+authManagerEmail+"\n";
		str += "clientInvoiceNumber : "+clientInvoiceNumber+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "customerName : "+customerName+"\n";
		str += "dateWorked : "+dateWorked+"\n";
		str += "exportBatchId : "+exportBatchId+"\n";
		str += "hoursWorked : "+hoursWorked+"\n";
		str += "hoursWorkedOld : "+hoursWorkedOld+"\n";
		str += "instance : "+instance+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "projectDescription : "+projectDescription+"\n";
		str += "staffName : "+staffName+"\n";
		str += "workDescription : "+workDescription+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"importId\" value=\""+importId+"\">";
		str += "<column name=\"loginId\" value=\""+loginId+"\">";
		str += "<column name=\"role\" value=\""+role+"\">";
		str += "<column name=\"authManager\" value=\""+authManager+"\">";
		str += "<column name=\"authManagerEmail\" value=\""+authManagerEmail+"\">";
		str += "<column name=\"clientInvoiceNumber\" value=\""+clientInvoiceNumber+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"customerName\" value=\""+customerName+"\">";
		str += "<column name=\"dateWorked\" value=\""+dateWorked+"\">";
		str += "<column name=\"exportBatchId\" value=\""+exportBatchId+"\">";
		str += "<column name=\"hoursWorked\" value=\""+hoursWorked+"\">";
		str += "<column name=\"hoursWorkedOld\" value=\""+hoursWorkedOld+"\">";
		str += "<column name=\"instance\" value=\""+instance+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"projectDescription\" value=\""+projectDescription+"\">";
		str += "<column name=\"staffName\" value=\""+staffName+"\">";
		str += "<column name=\"workDescription\" value=\""+workDescription+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"importId\":\""+importId+"\", ";
		str += "\"loginId\":\""+loginId+"\", ";
		str += "\"role\":\""+role+"\", ";
		str += "\"authManager\":\""+authManager+"\", ";
		str += "\"authManagerEmail\":\""+authManagerEmail+"\", ";
		str += "\"clientInvoiceNumber\":\""+clientInvoiceNumber+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"customerName\":\""+customerName+"\", ";
		str += "\"dateWorked\":\""+dateWorked+"\", ";
		str += "\"exportBatchId\":\""+exportBatchId+"\", ";
		str += "\"hoursWorked\":\""+hoursWorked+"\", ";
		str += "\"hoursWorkedOld\":\""+hoursWorkedOld+"\", ";
		str += "\"instance\":\""+instance+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"projectDescription\":\""+projectDescription+"\", ";
		str += "\"staffName\":\""+staffName+"\", ";
		str += "\"workDescription\":\""+workDescription+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}