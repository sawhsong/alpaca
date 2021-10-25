/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_ORGANISATION_HIERARCHY - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalOrganisationHierarchy extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double divisionId;
	private String DIVISION_ID;
	private double organisationId;
	private String ORGANISATION_ID;
	private double unitId;
	private String UNIT_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double divisionParentId;
	private String DIVISION_PARENT_ID;
	private double organisationParentId;
	private String ORGANISATION_PARENT_ID;
	private String status;
	private String STATUS;
	private Date statusDate;
	private String STATUS_DATE;
	private double unitParentId;
	private String UNIT_PARENT_ID;
	private String unitType;
	private String UNIT_TYPE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalOrganisationHierarchy() throws Exception {
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
		setFrwVarPrimaryKey("DIVISION_ID,ORGANISATION_ID,UNIT_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,STATUS_DATE");
		setFrwVarNumberColumn("DIVISION_ID,ORGANISATION_ID,UNIT_ID,BUSINESS_GROUP_ID,CREATED_BY,LAST_UPDATED_BY,DIVISION_PARENT_ID,ORGANISATION_PARENT_ID,UNIT_PARENT_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(double divisionId) throws Exception {
		this.divisionId = divisionId;
		setValueFromAccessor("DIVISION_ID", CommonUtil.toString(divisionId));
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public double getUnitId() {
		return unitId;
	}

	public void setUnitId(double unitId) throws Exception {
		this.unitId = unitId;
		setValueFromAccessor("UNIT_ID", CommonUtil.toString(unitId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
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

	public double getDivisionParentId() {
		return divisionParentId;
	}

	public void setDivisionParentId(double divisionParentId) throws Exception {
		this.divisionParentId = divisionParentId;
		setValueFromAccessor("DIVISION_PARENT_ID", CommonUtil.toString(divisionParentId));
	}

	public double getOrganisationParentId() {
		return organisationParentId;
	}

	public void setOrganisationParentId(double organisationParentId) throws Exception {
		this.organisationParentId = organisationParentId;
		setValueFromAccessor("ORGANISATION_PARENT_ID", CommonUtil.toString(organisationParentId));
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

	public double getUnitParentId() {
		return unitParentId;
	}

	public void setUnitParentId(double unitParentId) throws Exception {
		this.unitParentId = unitParentId;
		setValueFromAccessor("UNIT_PARENT_ID", CommonUtil.toString(unitParentId));
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) throws Exception {
		this.unitType = unitType;
		setValueFromAccessor("UNIT_TYPE", unitType);
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
		if (!(object instanceof PortalOrganisationHierarchy)) {
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

		str += "divisionId : "+divisionId+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "unitId : "+unitId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "divisionParentId : "+divisionParentId+"\n";
		str += "organisationParentId : "+organisationParentId+"\n";
		str += "status : "+status+"\n";
		str += "statusDate : "+statusDate+"\n";
		str += "unitParentId : "+unitParentId+"\n";
		str += "unitType : "+unitType+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"divisionId\" value=\""+divisionId+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"unitId\" value=\""+unitId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"divisionParentId\" value=\""+divisionParentId+"\">";
		str += "<column name=\"organisationParentId\" value=\""+organisationParentId+"\">";
		str += "<column name=\"status\" value=\""+status+"\">";
		str += "<column name=\"statusDate\" value=\""+statusDate+"\">";
		str += "<column name=\"unitParentId\" value=\""+unitParentId+"\">";
		str += "<column name=\"unitType\" value=\""+unitType+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"divisionId\":\""+divisionId+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"unitId\":\""+unitId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"divisionParentId\":\""+divisionParentId+"\", ";
		str += "\"organisationParentId\":\""+organisationParentId+"\", ";
		str += "\"status\":\""+status+"\", ";
		str += "\"statusDate\":\""+statusDate+"\", ";
		str += "\"unitParentId\":\""+unitParentId+"\", ";
		str += "\"unitType\":\""+unitType+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}