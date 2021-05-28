/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_SIGNUP_RESIDENCY - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalSignupResidency extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double residencyDetailsId;
	private String RESIDENCY_DETAILS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String alreadySubmitted;
	private String ALREADY_SUBMITTED;
	private String confirmTrueCopy;
	private String CONFIRM_TRUE_COPY;
	private double docContentId1;
	private String DOC_CONTENT_ID_1;
	private double docContentId2;
	private String DOC_CONTENT_ID_2;
	private double docContentId3;
	private String DOC_CONTENT_ID_3;
	private String migrationAssistance;
	private String MIGRATION_ASSISTANCE;
	private String prType;
	private String PR_TYPE;
	private String residencyType;
	private String RESIDENCY_TYPE;
	private String transformed;
	private String TRANSFORMED;
	private String visaType;
	private String VISA_TYPE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalSignupResidency() throws Exception {
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
		setFrwVarPrimaryKey("RESIDENCY_DETAILS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("USER_TF_ID,RESIDENCY_DETAILS_ID,CREATED_BY,LAST_UPDATED_BY,DOC_CONTENT_ID_1,DOC_CONTENT_ID_2,DOC_CONTENT_ID_3");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("TRANSFORMED");
		setFrwVarDefaultValue("N");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getUserTfId() {
		return userTfId;
	}

	public void setUserTfId(double userTfId) throws Exception {
		this.userTfId = userTfId;
		setValueFromAccessor("USER_TF_ID", CommonUtil.toString(userTfId));
	}

	public double getResidencyDetailsId() {
		return residencyDetailsId;
	}

	public void setResidencyDetailsId(double residencyDetailsId) throws Exception {
		this.residencyDetailsId = residencyDetailsId;
		setValueFromAccessor("RESIDENCY_DETAILS_ID", CommonUtil.toString(residencyDetailsId));
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

	public String getAlreadySubmitted() {
		return alreadySubmitted;
	}

	public void setAlreadySubmitted(String alreadySubmitted) throws Exception {
		this.alreadySubmitted = alreadySubmitted;
		setValueFromAccessor("ALREADY_SUBMITTED", alreadySubmitted);
	}

	public String getConfirmTrueCopy() {
		return confirmTrueCopy;
	}

	public void setConfirmTrueCopy(String confirmTrueCopy) throws Exception {
		this.confirmTrueCopy = confirmTrueCopy;
		setValueFromAccessor("CONFIRM_TRUE_COPY", confirmTrueCopy);
	}

	public double getDocContentId1() {
		return docContentId1;
	}

	public void setDocContentId1(double docContentId1) throws Exception {
		this.docContentId1 = docContentId1;
		setValueFromAccessor("DOC_CONTENT_ID_1", CommonUtil.toString(docContentId1));
	}

	public double getDocContentId2() {
		return docContentId2;
	}

	public void setDocContentId2(double docContentId2) throws Exception {
		this.docContentId2 = docContentId2;
		setValueFromAccessor("DOC_CONTENT_ID_2", CommonUtil.toString(docContentId2));
	}

	public double getDocContentId3() {
		return docContentId3;
	}

	public void setDocContentId3(double docContentId3) throws Exception {
		this.docContentId3 = docContentId3;
		setValueFromAccessor("DOC_CONTENT_ID_3", CommonUtil.toString(docContentId3));
	}

	public String getMigrationAssistance() {
		return migrationAssistance;
	}

	public void setMigrationAssistance(String migrationAssistance) throws Exception {
		this.migrationAssistance = migrationAssistance;
		setValueFromAccessor("MIGRATION_ASSISTANCE", migrationAssistance);
	}

	public String getPrType() {
		return prType;
	}

	public void setPrType(String prType) throws Exception {
		this.prType = prType;
		setValueFromAccessor("PR_TYPE", prType);
	}

	public String getResidencyType() {
		return residencyType;
	}

	public void setResidencyType(String residencyType) throws Exception {
		this.residencyType = residencyType;
		setValueFromAccessor("RESIDENCY_TYPE", residencyType);
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) throws Exception {
		this.visaType = visaType;
		setValueFromAccessor("VISA_TYPE", visaType);
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

		if (CommonUtil.isInIgnoreCase(columnName, CommonUtil.split(getFrwVarNumberColumn(), ","))) {
			dataType = "Number";
		} else if (CommonUtil.isInIgnoreCase(columnName, CommonUtil.split(getFrwVarDateColumn(), ","))) {
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

		str += "userTfId : "+userTfId+"\n";
		str += "residencyDetailsId : "+residencyDetailsId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "alreadySubmitted : "+alreadySubmitted+"\n";
		str += "confirmTrueCopy : "+confirmTrueCopy+"\n";
		str += "docContentId1 : "+docContentId1+"\n";
		str += "docContentId2 : "+docContentId2+"\n";
		str += "docContentId3 : "+docContentId3+"\n";
		str += "migrationAssistance : "+migrationAssistance+"\n";
		str += "prType : "+prType+"\n";
		str += "residencyType : "+residencyType+"\n";
		str += "transformed : "+transformed+"\n";
		str += "visaType : "+visaType+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"userTfId\" value=\""+userTfId+"\">";
		str += "<column name=\"residencyDetailsId\" value=\""+residencyDetailsId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"alreadySubmitted\" value=\""+alreadySubmitted+"\">";
		str += "<column name=\"confirmTrueCopy\" value=\""+confirmTrueCopy+"\">";
		str += "<column name=\"docContentId1\" value=\""+docContentId1+"\">";
		str += "<column name=\"docContentId2\" value=\""+docContentId2+"\">";
		str += "<column name=\"docContentId3\" value=\""+docContentId3+"\">";
		str += "<column name=\"migrationAssistance\" value=\""+migrationAssistance+"\">";
		str += "<column name=\"prType\" value=\""+prType+"\">";
		str += "<column name=\"residencyType\" value=\""+residencyType+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"visaType\" value=\""+visaType+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"userTfId\":\""+userTfId+"\", ";
		str += "\"residencyDetailsId\":\""+residencyDetailsId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"alreadySubmitted\":\""+alreadySubmitted+"\", ";
		str += "\"confirmTrueCopy\":\""+confirmTrueCopy+"\", ";
		str += "\"docContentId1\":\""+docContentId1+"\", ";
		str += "\"docContentId2\":\""+docContentId2+"\", ";
		str += "\"docContentId3\":\""+docContentId3+"\", ";
		str += "\"migrationAssistance\":\""+migrationAssistance+"\", ";
		str += "\"prType\":\""+prType+"\", ";
		str += "\"residencyType\":\""+residencyType+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"visaType\":\""+visaType+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}