/**************************************************************************************************
 * Framework Generated DTO Source
 * - TERMINATION_PAYER_DETAIL - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class TerminationPayerDetail extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double organisationId;
	private String ORGANISATION_ID;
	private double terminationPayerDetailId;
	private String TERMINATION_PAYER_DETAIL_ID;
	private String payerAddressLine;
	private String PAYER_ADDRESS_LINE;
	private String payerName;
	private String PAYER_NAME;
	private Date asOfDate;
	private String AS_OF_DATE;
	private String payerAbnWpn;
	private String PAYER_ABN_WPN;
	private double payerAuthorisedPerson;
	private String PAYER_AUTHORISED_PERSON;
	private String payerBranchNumber;
	private String PAYER_BRANCH_NUMBER;
	private String payerCountry;
	private String PAYER_COUNTRY;
	private String payerPostcode;
	private String PAYER_POSTCODE;
	private String payerState;
	private String PAYER_STATE;
	private String payerSuburb;
	private String PAYER_SUBURB;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public TerminationPayerDetail() throws Exception {
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
		setFrwVarPrimaryKey("TERMINATION_PAYER_DETAIL_ID");
		setFrwVarDateColumn("AS_OF_DATE");
		setFrwVarNumberColumn("ORGANISATION_ID,TERMINATION_PAYER_DETAIL_ID,PAYER_AUTHORISED_PERSON");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public double getTerminationPayerDetailId() {
		return terminationPayerDetailId;
	}

	public void setTerminationPayerDetailId(double terminationPayerDetailId) throws Exception {
		this.terminationPayerDetailId = terminationPayerDetailId;
		setValueFromAccessor("TERMINATION_PAYER_DETAIL_ID", CommonUtil.toString(terminationPayerDetailId));
	}

	public String getPayerAddressLine() {
		return payerAddressLine;
	}

	public void setPayerAddressLine(String payerAddressLine) throws Exception {
		this.payerAddressLine = payerAddressLine;
		setValueFromAccessor("PAYER_ADDRESS_LINE", payerAddressLine);
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) throws Exception {
		this.payerName = payerName;
		setValueFromAccessor("PAYER_NAME", payerName);
	}

	public Date getAsOfDate() {
		return asOfDate;
	}

	public void setAsOfDate(Date asOfDate) throws Exception {
		this.asOfDate = asOfDate;
		setValueFromAccessor("AS_OF_DATE", CommonUtil.toString(asOfDate));
	}

	public String getPayerAbnWpn() {
		return payerAbnWpn;
	}

	public void setPayerAbnWpn(String payerAbnWpn) throws Exception {
		this.payerAbnWpn = payerAbnWpn;
		setValueFromAccessor("PAYER_ABN_WPN", payerAbnWpn);
	}

	public double getPayerAuthorisedPerson() {
		return payerAuthorisedPerson;
	}

	public void setPayerAuthorisedPerson(double payerAuthorisedPerson) throws Exception {
		this.payerAuthorisedPerson = payerAuthorisedPerson;
		setValueFromAccessor("PAYER_AUTHORISED_PERSON", CommonUtil.toString(payerAuthorisedPerson));
	}

	public String getPayerBranchNumber() {
		return payerBranchNumber;
	}

	public void setPayerBranchNumber(String payerBranchNumber) throws Exception {
		this.payerBranchNumber = payerBranchNumber;
		setValueFromAccessor("PAYER_BRANCH_NUMBER", payerBranchNumber);
	}

	public String getPayerCountry() {
		return payerCountry;
	}

	public void setPayerCountry(String payerCountry) throws Exception {
		this.payerCountry = payerCountry;
		setValueFromAccessor("PAYER_COUNTRY", payerCountry);
	}

	public String getPayerPostcode() {
		return payerPostcode;
	}

	public void setPayerPostcode(String payerPostcode) throws Exception {
		this.payerPostcode = payerPostcode;
		setValueFromAccessor("PAYER_POSTCODE", payerPostcode);
	}

	public String getPayerState() {
		return payerState;
	}

	public void setPayerState(String payerState) throws Exception {
		this.payerState = payerState;
		setValueFromAccessor("PAYER_STATE", payerState);
	}

	public String getPayerSuburb() {
		return payerSuburb;
	}

	public void setPayerSuburb(String payerSuburb) throws Exception {
		this.payerSuburb = payerSuburb;
		setValueFromAccessor("PAYER_SUBURB", payerSuburb);
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

		str += "organisationId : "+organisationId+"\n";
		str += "terminationPayerDetailId : "+terminationPayerDetailId+"\n";
		str += "payerAddressLine : "+payerAddressLine+"\n";
		str += "payerName : "+payerName+"\n";
		str += "asOfDate : "+asOfDate+"\n";
		str += "payerAbnWpn : "+payerAbnWpn+"\n";
		str += "payerAuthorisedPerson : "+payerAuthorisedPerson+"\n";
		str += "payerBranchNumber : "+payerBranchNumber+"\n";
		str += "payerCountry : "+payerCountry+"\n";
		str += "payerPostcode : "+payerPostcode+"\n";
		str += "payerState : "+payerState+"\n";
		str += "payerSuburb : "+payerSuburb+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"terminationPayerDetailId\" value=\""+terminationPayerDetailId+"\">";
		str += "<column name=\"payerAddressLine\" value=\""+payerAddressLine+"\">";
		str += "<column name=\"payerName\" value=\""+payerName+"\">";
		str += "<column name=\"asOfDate\" value=\""+asOfDate+"\">";
		str += "<column name=\"payerAbnWpn\" value=\""+payerAbnWpn+"\">";
		str += "<column name=\"payerAuthorisedPerson\" value=\""+payerAuthorisedPerson+"\">";
		str += "<column name=\"payerBranchNumber\" value=\""+payerBranchNumber+"\">";
		str += "<column name=\"payerCountry\" value=\""+payerCountry+"\">";
		str += "<column name=\"payerPostcode\" value=\""+payerPostcode+"\">";
		str += "<column name=\"payerState\" value=\""+payerState+"\">";
		str += "<column name=\"payerSuburb\" value=\""+payerSuburb+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"terminationPayerDetailId\":\""+terminationPayerDetailId+"\", ";
		str += "\"payerAddressLine\":\""+payerAddressLine+"\", ";
		str += "\"payerName\":\""+payerName+"\", ";
		str += "\"asOfDate\":\""+asOfDate+"\", ";
		str += "\"payerAbnWpn\":\""+payerAbnWpn+"\", ";
		str += "\"payerAuthorisedPerson\":\""+payerAuthorisedPerson+"\", ";
		str += "\"payerBranchNumber\":\""+payerBranchNumber+"\", ";
		str += "\"payerCountry\":\""+payerCountry+"\", ";
		str += "\"payerPostcode\":\""+payerPostcode+"\", ";
		str += "\"payerState\":\""+payerState+"\", ";
		str += "\"payerSuburb\":\""+payerSuburb+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}