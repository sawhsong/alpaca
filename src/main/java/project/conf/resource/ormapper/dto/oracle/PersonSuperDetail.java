/**************************************************************************************************
 * Framework Generated DTO Source
 * - PERSON_SUPER_DETAIL - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PersonSuperDetail extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double superId;
	private String SUPER_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private String comments;
	private String COMMENTS;
	private String contributionMethod;
	private String CONTRIBUTION_METHOD;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date dateJoinedFund;
	private String DATE_JOINED_FUND;
	private String frequency;
	private String FREQUENCY;
	private String fundType;
	private String FUND_TYPE;
	private String hoursWorked;
	private String HOURS_WORKED;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String membershipNo;
	private String MEMBERSHIP_NO;
	private double personId;
	private String PERSON_ID;
	private double superFundId;
	private String SUPER_FUND_ID;
	private String typeOfEmployment;
	private String TYPE_OF_EMPLOYMENT;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PersonSuperDetail() throws Exception {
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
		setFrwVarPrimaryKey("SUPER_ID");
		setFrwVarDateColumn("CREATION_DATE,DATE_JOINED_FUND,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("SUPER_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,PERSON_ID,SUPER_FUND_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getSuperId() {
		return superId;
	}

	public void setSuperId(double superId) throws Exception {
		this.superId = superId;
		setValueFromAccessor("SUPER_ID", CommonUtil.toString(superId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
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

	public Date getDateJoinedFund() {
		return dateJoinedFund;
	}

	public void setDateJoinedFund(Date dateJoinedFund) throws Exception {
		this.dateJoinedFund = dateJoinedFund;
		setValueFromAccessor("DATE_JOINED_FUND", CommonUtil.toString(dateJoinedFund));
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) throws Exception {
		this.frequency = frequency;
		setValueFromAccessor("FREQUENCY", frequency);
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

	public String getMembershipNo() {
		return membershipNo;
	}

	public void setMembershipNo(String membershipNo) throws Exception {
		this.membershipNo = membershipNo;
		setValueFromAccessor("MEMBERSHIP_NO", membershipNo);
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getSuperFundId() {
		return superFundId;
	}

	public void setSuperFundId(double superFundId) throws Exception {
		this.superFundId = superFundId;
		setValueFromAccessor("SUPER_FUND_ID", CommonUtil.toString(superFundId));
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) throws Exception {
		this.typeOfEmployment = typeOfEmployment;
		setValueFromAccessor("TYPE_OF_EMPLOYMENT", typeOfEmployment);
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

		str += "superId : "+superId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "comments : "+comments+"\n";
		str += "contributionMethod : "+contributionMethod+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "dateJoinedFund : "+dateJoinedFund+"\n";
		str += "frequency : "+frequency+"\n";
		str += "fundType : "+fundType+"\n";
		str += "hoursWorked : "+hoursWorked+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "membershipNo : "+membershipNo+"\n";
		str += "personId : "+personId+"\n";
		str += "superFundId : "+superFundId+"\n";
		str += "typeOfEmployment : "+typeOfEmployment+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"superId\" value=\""+superId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"contributionMethod\" value=\""+contributionMethod+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"dateJoinedFund\" value=\""+dateJoinedFund+"\">";
		str += "<column name=\"frequency\" value=\""+frequency+"\">";
		str += "<column name=\"fundType\" value=\""+fundType+"\">";
		str += "<column name=\"hoursWorked\" value=\""+hoursWorked+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"membershipNo\" value=\""+membershipNo+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"superFundId\" value=\""+superFundId+"\">";
		str += "<column name=\"typeOfEmployment\" value=\""+typeOfEmployment+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"superId\":\""+superId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"contributionMethod\":\""+contributionMethod+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"dateJoinedFund\":\""+dateJoinedFund+"\", ";
		str += "\"frequency\":\""+frequency+"\", ";
		str += "\"fundType\":\""+fundType+"\", ";
		str += "\"hoursWorked\":\""+hoursWorked+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"membershipNo\":\""+membershipNo+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"superFundId\":\""+superFundId+"\", ";
		str += "\"typeOfEmployment\":\""+typeOfEmployment+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}