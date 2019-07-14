/**************************************************************************************************
 * Framework Generated DTO Source
 * - SEC_GRP_OBJ_PRIV - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class SecGrpObjPriv extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double grpObjPrivId;
	private String GRP_OBJ_PRIV_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String isActive;
	private String IS_ACTIVE;
	private double secGroupId;
	private String SEC_GROUP_ID;
	private double secObjPrivId;
	private String SEC_OBJ_PRIV_ID;
	private Date startDate;
	private String START_DATE;
	private Date endDate;
	private String END_DATE;
	private double updatedBy;
	private String UPDATED_BY;
	private Date updatedDate;
	private String UPDATED_DATE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public SecGrpObjPriv() throws Exception {
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
		setFrwVarPrimaryKey("GRP_OBJ_PRIV_ID");
		setFrwVarDateColumn("CREATION_DATE,START_DATE,END_DATE,UPDATED_DATE");
		setFrwVarNumberColumn("GRP_OBJ_PRIV_ID,CREATED_BY,SEC_GROUP_ID,SEC_OBJ_PRIV_ID,UPDATED_BY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getGrpObjPrivId() {
		return grpObjPrivId;
	}

	public void setGrpObjPrivId(double grpObjPrivId) throws Exception {
		this.grpObjPrivId = grpObjPrivId;
		setValueFromAccessor("GRP_OBJ_PRIV_ID", CommonUtil.toString(grpObjPrivId));
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

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
	}

	public double getSecGroupId() {
		return secGroupId;
	}

	public void setSecGroupId(double secGroupId) throws Exception {
		this.secGroupId = secGroupId;
		setValueFromAccessor("SEC_GROUP_ID", CommonUtil.toString(secGroupId));
	}

	public double getSecObjPrivId() {
		return secObjPrivId;
	}

	public void setSecObjPrivId(double secObjPrivId) throws Exception {
		this.secObjPrivId = secObjPrivId;
		setValueFromAccessor("SEC_OBJ_PRIV_ID", CommonUtil.toString(secObjPrivId));
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws Exception {
		this.startDate = startDate;
		setValueFromAccessor("START_DATE", CommonUtil.toString(startDate));
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) throws Exception {
		this.endDate = endDate;
		setValueFromAccessor("END_DATE", CommonUtil.toString(endDate));
	}

	public double getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(double updatedBy) throws Exception {
		this.updatedBy = updatedBy;
		setValueFromAccessor("UPDATED_BY", CommonUtil.toString(updatedBy));
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) throws Exception {
		this.updatedDate = updatedDate;
		setValueFromAccessor("UPDATED_DATE", CommonUtil.toString(updatedDate));
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

		str += "grpObjPrivId : "+grpObjPrivId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "isActive : "+isActive+"\n";
		str += "secGroupId : "+secGroupId+"\n";
		str += "secObjPrivId : "+secObjPrivId+"\n";
		str += "startDate : "+startDate+"\n";
		str += "endDate : "+endDate+"\n";
		str += "updatedBy : "+updatedBy+"\n";
		str += "updatedDate : "+updatedDate+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"grpObjPrivId\" value=\""+grpObjPrivId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"secGroupId\" value=\""+secGroupId+"\">";
		str += "<column name=\"secObjPrivId\" value=\""+secObjPrivId+"\">";
		str += "<column name=\"startDate\" value=\""+startDate+"\">";
		str += "<column name=\"endDate\" value=\""+endDate+"\">";
		str += "<column name=\"updatedBy\" value=\""+updatedBy+"\">";
		str += "<column name=\"updatedDate\" value=\""+updatedDate+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"grpObjPrivId\":\""+grpObjPrivId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"secGroupId\":\""+secGroupId+"\", ";
		str += "\"secObjPrivId\":\""+secObjPrivId+"\", ";
		str += "\"startDate\":\""+startDate+"\", ";
		str += "\"endDate\":\""+endDate+"\", ";
		str += "\"updatedBy\":\""+updatedBy+"\", ";
		str += "\"updatedDate\":\""+updatedDate+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}