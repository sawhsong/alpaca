/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_EMPLOYEE_TERIMINATION - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpEmployeeTerimination extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double employeeTeriminationId;
	private String EMPLOYEE_TERIMINATION_ID;
	private String applicableTaxRate;
	private String APPLICABLE_TAX_RATE;
	private double asgProcessId;
	private String ASG_PROCESS_ID;
	private Date endDate;
	private String END_DATE;
	private Date fromDate;
	private String FROM_DATE;
	private String gross;
	private String GROSS;
	private double grossAmtTax;
	private String GROSS_AMT_TAX;
	private double lumpsumA;
	private String LUMPSUM_A;
	private double lumpsumATax;
	private String LUMPSUM_A_TAX;
	private double lumpsumB;
	private String LUMPSUM_B;
	private double lumpsumBTax;
	private String LUMPSUM_B_TAX;
	private String organisationId;
	private String ORGANISATION_ID;
	private double otherAmount;
	private String OTHER_AMOUNT;
	private double personEoyId;
	private String PERSON_EOY_ID;
	private double personId;
	private String PERSON_ID;
	private String postJun1983UntaxComponent;
	private String POST_JUN_1983_UNTAX_COMPONENT;
	private String postJun1994InvalComponent;
	private String POST_JUN_1994_INVAL_COMPONENT;
	private String preJuly1983Component;
	private String PRE_JULY_1983_COMPONENT;
	private String terminateReason;
	private String TERMINATE_REASON;
	private Date terminationDate;
	private String TERMINATION_DATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpEmployeeTerimination() throws Exception {
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
		setFrwVarPrimaryKey("");
		setFrwVarDateColumn("END_DATE,FROM_DATE,TERMINATION_DATE");
		setFrwVarNumberColumn("EMPLOYEE_TERIMINATION_ID,ASG_PROCESS_ID,GROSS_AMT_TAX,LUMPSUM_A,LUMPSUM_A_TAX,LUMPSUM_B,LUMPSUM_B_TAX,OTHER_AMOUNT,PERSON_EOY_ID,PERSON_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getEmployeeTeriminationId() {
		return employeeTeriminationId;
	}

	public void setEmployeeTeriminationId(double employeeTeriminationId) throws Exception {
		this.employeeTeriminationId = employeeTeriminationId;
		setValueFromAccessor("EMPLOYEE_TERIMINATION_ID", CommonUtil.toString(employeeTeriminationId));
	}

	public String getApplicableTaxRate() {
		return applicableTaxRate;
	}

	public void setApplicableTaxRate(String applicableTaxRate) throws Exception {
		this.applicableTaxRate = applicableTaxRate;
		setValueFromAccessor("APPLICABLE_TAX_RATE", applicableTaxRate);
	}

	public double getAsgProcessId() {
		return asgProcessId;
	}

	public void setAsgProcessId(double asgProcessId) throws Exception {
		this.asgProcessId = asgProcessId;
		setValueFromAccessor("ASG_PROCESS_ID", CommonUtil.toString(asgProcessId));
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) throws Exception {
		this.endDate = endDate;
		setValueFromAccessor("END_DATE", CommonUtil.toString(endDate));
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) throws Exception {
		this.fromDate = fromDate;
		setValueFromAccessor("FROM_DATE", CommonUtil.toString(fromDate));
	}

	public String getGross() {
		return gross;
	}

	public void setGross(String gross) throws Exception {
		this.gross = gross;
		setValueFromAccessor("GROSS", gross);
	}

	public double getGrossAmtTax() {
		return grossAmtTax;
	}

	public void setGrossAmtTax(double grossAmtTax) throws Exception {
		this.grossAmtTax = grossAmtTax;
		setValueFromAccessor("GROSS_AMT_TAX", CommonUtil.toString(grossAmtTax));
	}

	public double getLumpsumA() {
		return lumpsumA;
	}

	public void setLumpsumA(double lumpsumA) throws Exception {
		this.lumpsumA = lumpsumA;
		setValueFromAccessor("LUMPSUM_A", CommonUtil.toString(lumpsumA));
	}

	public double getLumpsumATax() {
		return lumpsumATax;
	}

	public void setLumpsumATax(double lumpsumATax) throws Exception {
		this.lumpsumATax = lumpsumATax;
		setValueFromAccessor("LUMPSUM_A_TAX", CommonUtil.toString(lumpsumATax));
	}

	public double getLumpsumB() {
		return lumpsumB;
	}

	public void setLumpsumB(double lumpsumB) throws Exception {
		this.lumpsumB = lumpsumB;
		setValueFromAccessor("LUMPSUM_B", CommonUtil.toString(lumpsumB));
	}

	public double getLumpsumBTax() {
		return lumpsumBTax;
	}

	public void setLumpsumBTax(double lumpsumBTax) throws Exception {
		this.lumpsumBTax = lumpsumBTax;
		setValueFromAccessor("LUMPSUM_B_TAX", CommonUtil.toString(lumpsumBTax));
	}

	public String getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(String organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", organisationId);
	}

	public double getOtherAmount() {
		return otherAmount;
	}

	public void setOtherAmount(double otherAmount) throws Exception {
		this.otherAmount = otherAmount;
		setValueFromAccessor("OTHER_AMOUNT", CommonUtil.toString(otherAmount));
	}

	public double getPersonEoyId() {
		return personEoyId;
	}

	public void setPersonEoyId(double personEoyId) throws Exception {
		this.personEoyId = personEoyId;
		setValueFromAccessor("PERSON_EOY_ID", CommonUtil.toString(personEoyId));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getPostJun1983UntaxComponent() {
		return postJun1983UntaxComponent;
	}

	public void setPostJun1983UntaxComponent(String postJun1983UntaxComponent) throws Exception {
		this.postJun1983UntaxComponent = postJun1983UntaxComponent;
		setValueFromAccessor("POST_JUN_1983_UNTAX_COMPONENT", postJun1983UntaxComponent);
	}

	public String getPostJun1994InvalComponent() {
		return postJun1994InvalComponent;
	}

	public void setPostJun1994InvalComponent(String postJun1994InvalComponent) throws Exception {
		this.postJun1994InvalComponent = postJun1994InvalComponent;
		setValueFromAccessor("POST_JUN_1994_INVAL_COMPONENT", postJun1994InvalComponent);
	}

	public String getPreJuly1983Component() {
		return preJuly1983Component;
	}

	public void setPreJuly1983Component(String preJuly1983Component) throws Exception {
		this.preJuly1983Component = preJuly1983Component;
		setValueFromAccessor("PRE_JULY_1983_COMPONENT", preJuly1983Component);
	}

	public String getTerminateReason() {
		return terminateReason;
	}

	public void setTerminateReason(String terminateReason) throws Exception {
		this.terminateReason = terminateReason;
		setValueFromAccessor("TERMINATE_REASON", terminateReason);
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) throws Exception {
		this.terminationDate = terminationDate;
		setValueFromAccessor("TERMINATION_DATE", CommonUtil.toString(terminationDate));
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

		str += "employeeTeriminationId : "+employeeTeriminationId+"\n";
		str += "applicableTaxRate : "+applicableTaxRate+"\n";
		str += "asgProcessId : "+asgProcessId+"\n";
		str += "endDate : "+endDate+"\n";
		str += "fromDate : "+fromDate+"\n";
		str += "gross : "+gross+"\n";
		str += "grossAmtTax : "+grossAmtTax+"\n";
		str += "lumpsumA : "+lumpsumA+"\n";
		str += "lumpsumATax : "+lumpsumATax+"\n";
		str += "lumpsumB : "+lumpsumB+"\n";
		str += "lumpsumBTax : "+lumpsumBTax+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "otherAmount : "+otherAmount+"\n";
		str += "personEoyId : "+personEoyId+"\n";
		str += "personId : "+personId+"\n";
		str += "postJun1983UntaxComponent : "+postJun1983UntaxComponent+"\n";
		str += "postJun1994InvalComponent : "+postJun1994InvalComponent+"\n";
		str += "preJuly1983Component : "+preJuly1983Component+"\n";
		str += "terminateReason : "+terminateReason+"\n";
		str += "terminationDate : "+terminationDate+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"employeeTeriminationId\" value=\""+employeeTeriminationId+"\">";
		str += "<column name=\"applicableTaxRate\" value=\""+applicableTaxRate+"\">";
		str += "<column name=\"asgProcessId\" value=\""+asgProcessId+"\">";
		str += "<column name=\"endDate\" value=\""+endDate+"\">";
		str += "<column name=\"fromDate\" value=\""+fromDate+"\">";
		str += "<column name=\"gross\" value=\""+gross+"\">";
		str += "<column name=\"grossAmtTax\" value=\""+grossAmtTax+"\">";
		str += "<column name=\"lumpsumA\" value=\""+lumpsumA+"\">";
		str += "<column name=\"lumpsumATax\" value=\""+lumpsumATax+"\">";
		str += "<column name=\"lumpsumB\" value=\""+lumpsumB+"\">";
		str += "<column name=\"lumpsumBTax\" value=\""+lumpsumBTax+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"otherAmount\" value=\""+otherAmount+"\">";
		str += "<column name=\"personEoyId\" value=\""+personEoyId+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"postJun1983UntaxComponent\" value=\""+postJun1983UntaxComponent+"\">";
		str += "<column name=\"postJun1994InvalComponent\" value=\""+postJun1994InvalComponent+"\">";
		str += "<column name=\"preJuly1983Component\" value=\""+preJuly1983Component+"\">";
		str += "<column name=\"terminateReason\" value=\""+terminateReason+"\">";
		str += "<column name=\"terminationDate\" value=\""+terminationDate+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"employeeTeriminationId\":\""+employeeTeriminationId+"\", ";
		str += "\"applicableTaxRate\":\""+applicableTaxRate+"\", ";
		str += "\"asgProcessId\":\""+asgProcessId+"\", ";
		str += "\"endDate\":\""+endDate+"\", ";
		str += "\"fromDate\":\""+fromDate+"\", ";
		str += "\"gross\":\""+gross+"\", ";
		str += "\"grossAmtTax\":\""+grossAmtTax+"\", ";
		str += "\"lumpsumA\":\""+lumpsumA+"\", ";
		str += "\"lumpsumATax\":\""+lumpsumATax+"\", ";
		str += "\"lumpsumB\":\""+lumpsumB+"\", ";
		str += "\"lumpsumBTax\":\""+lumpsumBTax+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"otherAmount\":\""+otherAmount+"\", ";
		str += "\"personEoyId\":\""+personEoyId+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"postJun1983UntaxComponent\":\""+postJun1983UntaxComponent+"\", ";
		str += "\"postJun1994InvalComponent\":\""+postJun1994InvalComponent+"\", ";
		str += "\"preJuly1983Component\":\""+preJuly1983Component+"\", ";
		str += "\"terminateReason\":\""+terminateReason+"\", ";
		str += "\"terminationDate\":\""+terminationDate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}