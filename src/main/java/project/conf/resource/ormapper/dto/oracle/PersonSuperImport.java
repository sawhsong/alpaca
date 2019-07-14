/**************************************************************************************************
 * Framework Generated DTO Source
 * - PERSON_SUPER_IMPORT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PersonSuperImport extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String abn;
	private String ABN;
	private Date birthDate;
	private String BIRTH_DATE;
	private String comments;
	private String COMMENTS;
	private String contributionMethod;
	private String CONTRIBUTION_METHOD;
	private String contributionMethodCode;
	private String CONTRIBUTION_METHOD_CODE;
	private Date dateJoinedFund;
	private String DATE_JOINED_FUND;
	private String firstname;
	private String FIRSTNAME;
	private String frequency;
	private String FREQUENCY;
	private String frequencyCode;
	private String FREQUENCY_CODE;
	private String fundName;
	private String FUND_NAME;
	private String fundSpin;
	private String FUND_SPIN;
	private String fundType;
	private String FUND_TYPE;
	private String hoursWorked;
	private String HOURS_WORKED;
	private String hoursWorkedCode;
	private String HOURS_WORKED_CODE;
	private String membershipNo;
	private String MEMBERSHIP_NO;
	private String middleName;
	private String MIDDLE_NAME;
	private double personId;
	private String PERSON_ID;
	private String personNumber;
	private String PERSON_NUMBER;
	private String sfn;
	private String SFN;
	private String spin;
	private String SPIN;
	private double superFundId;
	private String SUPER_FUND_ID;
	private String surname;
	private String SURNAME;
	private String typeOfEmployment;
	private String TYPE_OF_EMPLOYMENT;
	private String typeOfEmploymentCode;
	private String TYPE_OF_EMPLOYMENT_CODE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PersonSuperImport() throws Exception {
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
		setFrwVarDateColumn("BIRTH_DATE,DATE_JOINED_FUND");
		setFrwVarNumberColumn("PERSON_ID,SUPER_FUND_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getAbn() {
		return abn;
	}

	public void setAbn(String abn) throws Exception {
		this.abn = abn;
		setValueFromAccessor("ABN", abn);
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) throws Exception {
		this.birthDate = birthDate;
		setValueFromAccessor("BIRTH_DATE", CommonUtil.toString(birthDate));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public String getContributionMethod() {
		return contributionMethod;
	}

	public void setContributionMethod(String contributionMethod) throws Exception {
		this.contributionMethod = contributionMethod;
		setValueFromAccessor("CONTRIBUTION_METHOD", contributionMethod);
	}

	public String getContributionMethodCode() {
		return contributionMethodCode;
	}

	public void setContributionMethodCode(String contributionMethodCode) throws Exception {
		this.contributionMethodCode = contributionMethodCode;
		setValueFromAccessor("CONTRIBUTION_METHOD_CODE", contributionMethodCode);
	}

	public Date getDateJoinedFund() {
		return dateJoinedFund;
	}

	public void setDateJoinedFund(Date dateJoinedFund) throws Exception {
		this.dateJoinedFund = dateJoinedFund;
		setValueFromAccessor("DATE_JOINED_FUND", CommonUtil.toString(dateJoinedFund));
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) throws Exception {
		this.firstname = firstname;
		setValueFromAccessor("FIRSTNAME", firstname);
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) throws Exception {
		this.frequency = frequency;
		setValueFromAccessor("FREQUENCY", frequency);
	}

	public String getFrequencyCode() {
		return frequencyCode;
	}

	public void setFrequencyCode(String frequencyCode) throws Exception {
		this.frequencyCode = frequencyCode;
		setValueFromAccessor("FREQUENCY_CODE", frequencyCode);
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) throws Exception {
		this.fundName = fundName;
		setValueFromAccessor("FUND_NAME", fundName);
	}

	public String getFundSpin() {
		return fundSpin;
	}

	public void setFundSpin(String fundSpin) throws Exception {
		this.fundSpin = fundSpin;
		setValueFromAccessor("FUND_SPIN", fundSpin);
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) throws Exception {
		this.fundType = fundType;
		setValueFromAccessor("FUND_TYPE", fundType);
	}

	public String getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(String hoursWorked) throws Exception {
		this.hoursWorked = hoursWorked;
		setValueFromAccessor("HOURS_WORKED", hoursWorked);
	}

	public String getHoursWorkedCode() {
		return hoursWorkedCode;
	}

	public void setHoursWorkedCode(String hoursWorkedCode) throws Exception {
		this.hoursWorkedCode = hoursWorkedCode;
		setValueFromAccessor("HOURS_WORKED_CODE", hoursWorkedCode);
	}

	public String getMembershipNo() {
		return membershipNo;
	}

	public void setMembershipNo(String membershipNo) throws Exception {
		this.membershipNo = membershipNo;
		setValueFromAccessor("MEMBERSHIP_NO", membershipNo);
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) throws Exception {
		this.middleName = middleName;
		setValueFromAccessor("MIDDLE_NAME", middleName);
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public String getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(String personNumber) throws Exception {
		this.personNumber = personNumber;
		setValueFromAccessor("PERSON_NUMBER", personNumber);
	}

	public String getSfn() {
		return sfn;
	}

	public void setSfn(String sfn) throws Exception {
		this.sfn = sfn;
		setValueFromAccessor("SFN", sfn);
	}

	public String getSpin() {
		return spin;
	}

	public void setSpin(String spin) throws Exception {
		this.spin = spin;
		setValueFromAccessor("SPIN", spin);
	}

	public double getSuperFundId() {
		return superFundId;
	}

	public void setSuperFundId(double superFundId) throws Exception {
		this.superFundId = superFundId;
		setValueFromAccessor("SUPER_FUND_ID", CommonUtil.toString(superFundId));
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		this.surname = surname;
		setValueFromAccessor("SURNAME", surname);
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) throws Exception {
		this.typeOfEmployment = typeOfEmployment;
		setValueFromAccessor("TYPE_OF_EMPLOYMENT", typeOfEmployment);
	}

	public String getTypeOfEmploymentCode() {
		return typeOfEmploymentCode;
	}

	public void setTypeOfEmploymentCode(String typeOfEmploymentCode) throws Exception {
		this.typeOfEmploymentCode = typeOfEmploymentCode;
		setValueFromAccessor("TYPE_OF_EMPLOYMENT_CODE", typeOfEmploymentCode);
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

		str += "abn : "+abn+"\n";
		str += "birthDate : "+birthDate+"\n";
		str += "comments : "+comments+"\n";
		str += "contributionMethod : "+contributionMethod+"\n";
		str += "contributionMethodCode : "+contributionMethodCode+"\n";
		str += "dateJoinedFund : "+dateJoinedFund+"\n";
		str += "firstname : "+firstname+"\n";
		str += "frequency : "+frequency+"\n";
		str += "frequencyCode : "+frequencyCode+"\n";
		str += "fundName : "+fundName+"\n";
		str += "fundSpin : "+fundSpin+"\n";
		str += "fundType : "+fundType+"\n";
		str += "hoursWorked : "+hoursWorked+"\n";
		str += "hoursWorkedCode : "+hoursWorkedCode+"\n";
		str += "membershipNo : "+membershipNo+"\n";
		str += "middleName : "+middleName+"\n";
		str += "personId : "+personId+"\n";
		str += "personNumber : "+personNumber+"\n";
		str += "sfn : "+sfn+"\n";
		str += "spin : "+spin+"\n";
		str += "superFundId : "+superFundId+"\n";
		str += "surname : "+surname+"\n";
		str += "typeOfEmployment : "+typeOfEmployment+"\n";
		str += "typeOfEmploymentCode : "+typeOfEmploymentCode+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"abn\" value=\""+abn+"\">";
		str += "<column name=\"birthDate\" value=\""+birthDate+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"contributionMethod\" value=\""+contributionMethod+"\">";
		str += "<column name=\"contributionMethodCode\" value=\""+contributionMethodCode+"\">";
		str += "<column name=\"dateJoinedFund\" value=\""+dateJoinedFund+"\">";
		str += "<column name=\"firstname\" value=\""+firstname+"\">";
		str += "<column name=\"frequency\" value=\""+frequency+"\">";
		str += "<column name=\"frequencyCode\" value=\""+frequencyCode+"\">";
		str += "<column name=\"fundName\" value=\""+fundName+"\">";
		str += "<column name=\"fundSpin\" value=\""+fundSpin+"\">";
		str += "<column name=\"fundType\" value=\""+fundType+"\">";
		str += "<column name=\"hoursWorked\" value=\""+hoursWorked+"\">";
		str += "<column name=\"hoursWorkedCode\" value=\""+hoursWorkedCode+"\">";
		str += "<column name=\"membershipNo\" value=\""+membershipNo+"\">";
		str += "<column name=\"middleName\" value=\""+middleName+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"personNumber\" value=\""+personNumber+"\">";
		str += "<column name=\"sfn\" value=\""+sfn+"\">";
		str += "<column name=\"spin\" value=\""+spin+"\">";
		str += "<column name=\"superFundId\" value=\""+superFundId+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"typeOfEmployment\" value=\""+typeOfEmployment+"\">";
		str += "<column name=\"typeOfEmploymentCode\" value=\""+typeOfEmploymentCode+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"abn\":\""+abn+"\", ";
		str += "\"birthDate\":\""+birthDate+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"contributionMethod\":\""+contributionMethod+"\", ";
		str += "\"contributionMethodCode\":\""+contributionMethodCode+"\", ";
		str += "\"dateJoinedFund\":\""+dateJoinedFund+"\", ";
		str += "\"firstname\":\""+firstname+"\", ";
		str += "\"frequency\":\""+frequency+"\", ";
		str += "\"frequencyCode\":\""+frequencyCode+"\", ";
		str += "\"fundName\":\""+fundName+"\", ";
		str += "\"fundSpin\":\""+fundSpin+"\", ";
		str += "\"fundType\":\""+fundType+"\", ";
		str += "\"hoursWorked\":\""+hoursWorked+"\", ";
		str += "\"hoursWorkedCode\":\""+hoursWorkedCode+"\", ";
		str += "\"membershipNo\":\""+membershipNo+"\", ";
		str += "\"middleName\":\""+middleName+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"personNumber\":\""+personNumber+"\", ";
		str += "\"sfn\":\""+sfn+"\", ";
		str += "\"spin\":\""+spin+"\", ";
		str += "\"superFundId\":\""+superFundId+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"typeOfEmployment\":\""+typeOfEmployment+"\", ";
		str += "\"typeOfEmploymentCode\":\""+typeOfEmploymentCode+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}