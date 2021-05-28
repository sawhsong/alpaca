/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_USER_TF - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalUserTf extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double userTfId;
	private String USER_TF_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private Date startDate;
	private String START_DATE;
	private String status;
	private String STATUS;
	private double personId;
	private String PERSON_ID;
	private double tfId;
	private String TF_ID;
	private String ccPrimary;
	private String CC_PRIMARY;
	private String ccSecondary;
	private String CC_SECONDARY;
	private String ccTertiary;
	private String CC_TERTIARY;
	private double daysComplete;
	private String DAYS_COMPLETE;
	private Date finishDate;
	private String FINISH_DATE;
	private String isActive;
	private String IS_ACTIVE;
	private String source;
	private String SOURCE;
	private double sourceId;
	private String SOURCE_ID;
	private Date submissionDate;
	private String SUBMISSION_DATE;
	private double transformedBy;
	private String TRANSFORMED_BY;
	private double transformAssignmentId;
	private String TRANSFORM_ASSIGNMENT_ID;
	private Date transformDate;
	private String TRANSFORM_DATE;
	private String transformType;
	private String TRANSFORM_TYPE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalUserTf() throws Exception {
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
		setFrwVarPrimaryKey("USER_TF_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,START_DATE,FINISH_DATE,SUBMISSION_DATE,TRANSFORM_DATE");
		setFrwVarNumberColumn("USER_TF_ID,CREATED_BY,LAST_UPDATED_BY,PERSON_ID,TF_ID,DAYS_COMPLETE,SOURCE_ID,TRANSFORMED_BY,TRANSFORM_ASSIGNMENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("STATUS,CC_PRIMARY,CC_SECONDARY,IS_ACTIVE");
		setFrwVarDefaultValue("S,Y,Y,N");
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws Exception {
		this.startDate = startDate;
		setValueFromAccessor("START_DATE", CommonUtil.toString(startDate));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws Exception {
		this.status = status;
		setValueFromAccessor("STATUS", status);
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getTfId() {
		return tfId;
	}

	public void setTfId(double tfId) throws Exception {
		this.tfId = tfId;
		setValueFromAccessor("TF_ID", CommonUtil.toString(tfId));
	}

	public String getCcPrimary() {
		return ccPrimary;
	}

	public void setCcPrimary(String ccPrimary) throws Exception {
		this.ccPrimary = ccPrimary;
		setValueFromAccessor("CC_PRIMARY", ccPrimary);
	}

	public String getCcSecondary() {
		return ccSecondary;
	}

	public void setCcSecondary(String ccSecondary) throws Exception {
		this.ccSecondary = ccSecondary;
		setValueFromAccessor("CC_SECONDARY", ccSecondary);
	}

	public String getCcTertiary() {
		return ccTertiary;
	}

	public void setCcTertiary(String ccTertiary) throws Exception {
		this.ccTertiary = ccTertiary;
		setValueFromAccessor("CC_TERTIARY", ccTertiary);
	}

	public double getDaysComplete() {
		return daysComplete;
	}

	public void setDaysComplete(double daysComplete) throws Exception {
		this.daysComplete = daysComplete;
		setValueFromAccessor("DAYS_COMPLETE", CommonUtil.toString(daysComplete));
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) throws Exception {
		this.finishDate = finishDate;
		setValueFromAccessor("FINISH_DATE", CommonUtil.toString(finishDate));
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) throws Exception {
		this.source = source;
		setValueFromAccessor("SOURCE", source);
	}

	public double getSourceId() {
		return sourceId;
	}

	public void setSourceId(double sourceId) throws Exception {
		this.sourceId = sourceId;
		setValueFromAccessor("SOURCE_ID", CommonUtil.toString(sourceId));
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) throws Exception {
		this.submissionDate = submissionDate;
		setValueFromAccessor("SUBMISSION_DATE", CommonUtil.toString(submissionDate));
	}

	public double getTransformedBy() {
		return transformedBy;
	}

	public void setTransformedBy(double transformedBy) throws Exception {
		this.transformedBy = transformedBy;
		setValueFromAccessor("TRANSFORMED_BY", CommonUtil.toString(transformedBy));
	}

	public double getTransformAssignmentId() {
		return transformAssignmentId;
	}

	public void setTransformAssignmentId(double transformAssignmentId) throws Exception {
		this.transformAssignmentId = transformAssignmentId;
		setValueFromAccessor("TRANSFORM_ASSIGNMENT_ID", CommonUtil.toString(transformAssignmentId));
	}

	public Date getTransformDate() {
		return transformDate;
	}

	public void setTransformDate(Date transformDate) throws Exception {
		this.transformDate = transformDate;
		setValueFromAccessor("TRANSFORM_DATE", CommonUtil.toString(transformDate));
	}

	public String getTransformType() {
		return transformType;
	}

	public void setTransformType(String transformType) throws Exception {
		this.transformType = transformType;
		setValueFromAccessor("TRANSFORM_TYPE", transformType);
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
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "startDate : "+startDate+"\n";
		str += "status : "+status+"\n";
		str += "personId : "+personId+"\n";
		str += "tfId : "+tfId+"\n";
		str += "ccPrimary : "+ccPrimary+"\n";
		str += "ccSecondary : "+ccSecondary+"\n";
		str += "ccTertiary : "+ccTertiary+"\n";
		str += "daysComplete : "+daysComplete+"\n";
		str += "finishDate : "+finishDate+"\n";
		str += "isActive : "+isActive+"\n";
		str += "source : "+source+"\n";
		str += "sourceId : "+sourceId+"\n";
		str += "submissionDate : "+submissionDate+"\n";
		str += "transformedBy : "+transformedBy+"\n";
		str += "transformAssignmentId : "+transformAssignmentId+"\n";
		str += "transformDate : "+transformDate+"\n";
		str += "transformType : "+transformType+"\n";
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
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"startDate\" value=\""+startDate+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"tfId\" value=\""+tfId+"\">";
		str += "<column name=\"ccPrimary\" value=\""+ccPrimary+"\">";
		str += "<column name=\"ccSecondary\" value=\""+ccSecondary+"\">";
		str += "<column name=\"ccTertiary\" value=\""+ccTertiary+"\">";
		str += "<column name=\"daysComplete\" value=\""+daysComplete+"\">";
		str += "<column name=\"finishDate\" value=\""+finishDate+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"source\" value=\""+source+"\">";
		str += "<column name=\"sourceId\" value=\""+sourceId+"\">";
		str += "<column name=\"submissionDate\" value=\""+submissionDate+"\">";
		str += "<column name=\"transformedBy\" value=\""+transformedBy+"\">";
		str += "<column name=\"transformAssignmentId\" value=\""+transformAssignmentId+"\">";
		str += "<column name=\"transformDate\" value=\""+transformDate+"\">";
		str += "<column name=\"transformType\" value=\""+transformType+"\">";
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
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"startDate\":\""+startDate+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"tfId\":\""+tfId+"\", ";
		str += "\"ccPrimary\":\""+ccPrimary+"\", ";
		str += "\"ccSecondary\":\""+ccSecondary+"\", ";
		str += "\"ccTertiary\":\""+ccTertiary+"\", ";
		str += "\"daysComplete\":\""+daysComplete+"\", ";
		str += "\"finishDate\":\""+finishDate+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"source\":\""+source+"\", ";
		str += "\"sourceId\":\""+sourceId+"\", ";
		str += "\"submissionDate\":\""+submissionDate+"\", ";
		str += "\"transformedBy\":\""+transformedBy+"\", ";
		str += "\"transformAssignmentId\":\""+transformAssignmentId+"\", ";
		str += "\"transformDate\":\""+transformDate+"\", ";
		str += "\"transformType\":\""+transformType+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}