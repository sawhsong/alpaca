/**************************************************************************************************
 * Framework Generated DTO Source
 * - INVOICE_ELEMENT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class InvoiceElement extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double invoiceElementId;
	private String INVOICE_ELEMENT_ID;
	private String alternateName;
	private String ALTERNATE_NAME;
	private double assignmentId;
	private String ASSIGNMENT_ID;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double consolidateTo;
	private String CONSOLIDATE_TO;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double elementId;
	private String ELEMENT_ID;
	private double gstAmount;
	private String GST_AMOUNT;
	private String gstExempt;
	private String GST_EXEMPT;
	private String info;
	private String INFO;
	private double invoiceId;
	private String INVOICE_ID;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String period;
	private String PERIOD;
	private double rate;
	private String RATE;
	private String source;
	private String SOURCE;
	private double sourceId;
	private String SOURCE_ID;
	private double unit;
	private String UNIT;
	private String unitCalc;
	private String UNIT_CALC;
	private double value;
	private String VALUE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public InvoiceElement() throws Exception {
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
		setFrwVarNumberColumn("INVOICE_ELEMENT_ID,ASSIGNMENT_ID,BUSINESS_GROUP_ID,CONSOLIDATE_TO,CREATED_BY,ELEMENT_ID,GST_AMOUNT,INVOICE_ID,LAST_UPDATED_BY,RATE,SOURCE_ID,UNIT,VALUE");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getInvoiceElementId() {
		return invoiceElementId;
	}

	public void setInvoiceElementId(double invoiceElementId) throws Exception {
		this.invoiceElementId = invoiceElementId;
		setValueFromAccessor("INVOICE_ELEMENT_ID", CommonUtil.toString(invoiceElementId));
	}

	public String getAlternateName() {
		return alternateName;
	}

	public void setAlternateName(String alternateName) throws Exception {
		this.alternateName = alternateName;
		setValueFromAccessor("ALTERNATE_NAME", alternateName);
	}

	public double getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(double assignmentId) throws Exception {
		this.assignmentId = assignmentId;
		setValueFromAccessor("ASSIGNMENT_ID", CommonUtil.toString(assignmentId));
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public double getConsolidateTo() {
		return consolidateTo;
	}

	public void setConsolidateTo(double consolidateTo) throws Exception {
		this.consolidateTo = consolidateTo;
		setValueFromAccessor("CONSOLIDATE_TO", CommonUtil.toString(consolidateTo));
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

	public double getElementId() {
		return elementId;
	}

	public void setElementId(double elementId) throws Exception {
		this.elementId = elementId;
		setValueFromAccessor("ELEMENT_ID", CommonUtil.toString(elementId));
	}

	public double getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(double gstAmount) throws Exception {
		this.gstAmount = gstAmount;
		setValueFromAccessor("GST_AMOUNT", CommonUtil.toString(gstAmount));
	}

	public String getGstExempt() {
		return gstExempt;
	}

	public void setGstExempt(String gstExempt) throws Exception {
		this.gstExempt = gstExempt;
		setValueFromAccessor("GST_EXEMPT", gstExempt);
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) throws Exception {
		this.info = info;
		setValueFromAccessor("INFO", info);
	}

	public double getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(double invoiceId) throws Exception {
		this.invoiceId = invoiceId;
		setValueFromAccessor("INVOICE_ID", CommonUtil.toString(invoiceId));
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

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) throws Exception {
		this.period = period;
		setValueFromAccessor("PERIOD", period);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) throws Exception {
		this.rate = rate;
		setValueFromAccessor("RATE", CommonUtil.toString(rate));
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

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) throws Exception {
		this.unit = unit;
		setValueFromAccessor("UNIT", CommonUtil.toString(unit));
	}

	public String getUnitCalc() {
		return unitCalc;
	}

	public void setUnitCalc(String unitCalc) throws Exception {
		this.unitCalc = unitCalc;
		setValueFromAccessor("UNIT_CALC", unitCalc);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) throws Exception {
		this.value = value;
		setValueFromAccessor("VALUE", CommonUtil.toString(value));
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

		str += "invoiceElementId : "+invoiceElementId+"\n";
		str += "alternateName : "+alternateName+"\n";
		str += "assignmentId : "+assignmentId+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "consolidateTo : "+consolidateTo+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "elementId : "+elementId+"\n";
		str += "gstAmount : "+gstAmount+"\n";
		str += "gstExempt : "+gstExempt+"\n";
		str += "info : "+info+"\n";
		str += "invoiceId : "+invoiceId+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "period : "+period+"\n";
		str += "rate : "+rate+"\n";
		str += "source : "+source+"\n";
		str += "sourceId : "+sourceId+"\n";
		str += "unit : "+unit+"\n";
		str += "unitCalc : "+unitCalc+"\n";
		str += "value : "+value+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"invoiceElementId\" value=\""+invoiceElementId+"\">";
		str += "<column name=\"alternateName\" value=\""+alternateName+"\">";
		str += "<column name=\"assignmentId\" value=\""+assignmentId+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"consolidateTo\" value=\""+consolidateTo+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"elementId\" value=\""+elementId+"\">";
		str += "<column name=\"gstAmount\" value=\""+gstAmount+"\">";
		str += "<column name=\"gstExempt\" value=\""+gstExempt+"\">";
		str += "<column name=\"info\" value=\""+info+"\">";
		str += "<column name=\"invoiceId\" value=\""+invoiceId+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"period\" value=\""+period+"\">";
		str += "<column name=\"rate\" value=\""+rate+"\">";
		str += "<column name=\"source\" value=\""+source+"\">";
		str += "<column name=\"sourceId\" value=\""+sourceId+"\">";
		str += "<column name=\"unit\" value=\""+unit+"\">";
		str += "<column name=\"unitCalc\" value=\""+unitCalc+"\">";
		str += "<column name=\"value\" value=\""+value+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"invoiceElementId\":\""+invoiceElementId+"\", ";
		str += "\"alternateName\":\""+alternateName+"\", ";
		str += "\"assignmentId\":\""+assignmentId+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"consolidateTo\":\""+consolidateTo+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"elementId\":\""+elementId+"\", ";
		str += "\"gstAmount\":\""+gstAmount+"\", ";
		str += "\"gstExempt\":\""+gstExempt+"\", ";
		str += "\"info\":\""+info+"\", ";
		str += "\"invoiceId\":\""+invoiceId+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"period\":\""+period+"\", ";
		str += "\"rate\":\""+rate+"\", ";
		str += "\"source\":\""+source+"\", ";
		str += "\"sourceId\":\""+sourceId+"\", ";
		str += "\"unit\":\""+unit+"\", ";
		str += "\"unitCalc\":\""+unitCalc+"\", ";
		str += "\"value\":\""+value+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}