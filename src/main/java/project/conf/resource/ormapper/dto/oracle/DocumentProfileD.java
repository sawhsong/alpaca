/**************************************************************************************************
 * Framework Generated DTO Source
 * - DOCUMENT_PROFILE_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class DocumentProfileD extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String description;
	private String DESCRIPTION;
	private double dueDateOffset;
	private String DUE_DATE_OFFSET;
	private String dueDateOffsetSource;
	private String DUE_DATE_OFFSET_SOURCE;
	private double followUpDateOffset;
	private String FOLLOW_UP_DATE_OFFSET;
	private String followUpDateOffsetSource;
	private String FOLLOW_UP_DATE_OFFSET_SOURCE;
	private String isActive;
	private String IS_ACTIVE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double masterDocumentId;
	private String MASTER_DOCUMENT_ID;
	private double profileDId;
	private String PROFILE_D_ID;
	private double profileId;
	private String PROFILE_ID;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public DocumentProfileD() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("CREATED_BY,DUE_DATE_OFFSET,FOLLOW_UP_DATE_OFFSET,LAST_UPDATED_BY,MASTER_DOCUMENT_ID,PROFILE_D_ID,PROFILE_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public double getDueDateOffset() {
		return dueDateOffset;
	}

	public void setDueDateOffset(double dueDateOffset) throws Exception {
		this.dueDateOffset = dueDateOffset;
		setValueFromAccessor("DUE_DATE_OFFSET", CommonUtil.toString(dueDateOffset));
	}

	public String getDueDateOffsetSource() {
		return dueDateOffsetSource;
	}

	public void setDueDateOffsetSource(String dueDateOffsetSource) throws Exception {
		this.dueDateOffsetSource = dueDateOffsetSource;
		setValueFromAccessor("DUE_DATE_OFFSET_SOURCE", dueDateOffsetSource);
	}

	public double getFollowUpDateOffset() {
		return followUpDateOffset;
	}

	public void setFollowUpDateOffset(double followUpDateOffset) throws Exception {
		this.followUpDateOffset = followUpDateOffset;
		setValueFromAccessor("FOLLOW_UP_DATE_OFFSET", CommonUtil.toString(followUpDateOffset));
	}

	public String getFollowUpDateOffsetSource() {
		return followUpDateOffsetSource;
	}

	public void setFollowUpDateOffsetSource(String followUpDateOffsetSource) throws Exception {
		this.followUpDateOffsetSource = followUpDateOffsetSource;
		setValueFromAccessor("FOLLOW_UP_DATE_OFFSET_SOURCE", followUpDateOffsetSource);
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
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

	public double getMasterDocumentId() {
		return masterDocumentId;
	}

	public void setMasterDocumentId(double masterDocumentId) throws Exception {
		this.masterDocumentId = masterDocumentId;
		setValueFromAccessor("MASTER_DOCUMENT_ID", CommonUtil.toString(masterDocumentId));
	}

	public double getProfileDId() {
		return profileDId;
	}

	public void setProfileDId(double profileDId) throws Exception {
		this.profileDId = profileDId;
		setValueFromAccessor("PROFILE_D_ID", CommonUtil.toString(profileDId));
	}

	public double getProfileId() {
		return profileId;
	}

	public void setProfileId(double profileId) throws Exception {
		this.profileId = profileId;
		setValueFromAccessor("PROFILE_ID", CommonUtil.toString(profileId));
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

		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "description : "+description+"\n";
		str += "dueDateOffset : "+dueDateOffset+"\n";
		str += "dueDateOffsetSource : "+dueDateOffsetSource+"\n";
		str += "followUpDateOffset : "+followUpDateOffset+"\n";
		str += "followUpDateOffsetSource : "+followUpDateOffsetSource+"\n";
		str += "isActive : "+isActive+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "masterDocumentId : "+masterDocumentId+"\n";
		str += "profileDId : "+profileDId+"\n";
		str += "profileId : "+profileId+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"dueDateOffset\" value=\""+dueDateOffset+"\">";
		str += "<column name=\"dueDateOffsetSource\" value=\""+dueDateOffsetSource+"\">";
		str += "<column name=\"followUpDateOffset\" value=\""+followUpDateOffset+"\">";
		str += "<column name=\"followUpDateOffsetSource\" value=\""+followUpDateOffsetSource+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"masterDocumentId\" value=\""+masterDocumentId+"\">";
		str += "<column name=\"profileDId\" value=\""+profileDId+"\">";
		str += "<column name=\"profileId\" value=\""+profileId+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"dueDateOffset\":\""+dueDateOffset+"\", ";
		str += "\"dueDateOffsetSource\":\""+dueDateOffsetSource+"\", ";
		str += "\"followUpDateOffset\":\""+followUpDateOffset+"\", ";
		str += "\"followUpDateOffsetSource\":\""+followUpDateOffsetSource+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"masterDocumentId\":\""+masterDocumentId+"\", ";
		str += "\"profileDId\":\""+profileDId+"\", ";
		str += "\"profileId\":\""+profileId+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}