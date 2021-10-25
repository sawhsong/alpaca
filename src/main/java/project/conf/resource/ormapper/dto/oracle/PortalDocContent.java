/**************************************************************************************************
 * Framework Generated DTO Source
 * - PORTAL_DOC_CONTENT - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PortalDocContent extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double docContentId;
	private String DOC_CONTENT_ID;
	private String docContentName;
	private String DOC_CONTENT_NAME;
	private String docContent;
	private String DOC_CONTENT;
	private double docContentBytesize;
	private String DOC_CONTENT_BYTESIZE;
	private String docContentMime;
	private String DOC_CONTENT_MIME;
	private String isInternalDoc;
	private String IS_INTERNAL_DOC;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PortalDocContent() throws Exception {
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
		setFrwVarPrimaryKey("DOC_CONTENT_ID");
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("DOC_CONTENT_ID,DOC_CONTENT_BYTESIZE");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getDocContentId() {
		return docContentId;
	}

	public void setDocContentId(double docContentId) throws Exception {
		this.docContentId = docContentId;
		setValueFromAccessor("DOC_CONTENT_ID", CommonUtil.toString(docContentId));
	}

	public String getDocContentName() {
		return docContentName;
	}

	public void setDocContentName(String docContentName) throws Exception {
		this.docContentName = docContentName;
		setValueFromAccessor("DOC_CONTENT_NAME", docContentName);
	}

	public String getDocContent() {
		return docContent;
	}

	public void setDocContent(String docContent) throws Exception {
		this.docContent = docContent;
		setValueFromAccessor("DOC_CONTENT", docContent);
	}

	public double getDocContentBytesize() {
		return docContentBytesize;
	}

	public void setDocContentBytesize(double docContentBytesize) throws Exception {
		this.docContentBytesize = docContentBytesize;
		setValueFromAccessor("DOC_CONTENT_BYTESIZE", CommonUtil.toString(docContentBytesize));
	}

	public String getDocContentMime() {
		return docContentMime;
	}

	public void setDocContentMime(String docContentMime) throws Exception {
		this.docContentMime = docContentMime;
		setValueFromAccessor("DOC_CONTENT_MIME", docContentMime);
	}

	public String getIsInternalDoc() {
		return isInternalDoc;
	}

	public void setIsInternalDoc(String isInternalDoc) throws Exception {
		this.isInternalDoc = isInternalDoc;
		setValueFromAccessor("IS_INTERNAL_DOC", isInternalDoc);
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

		str += "docContentId : "+docContentId+"\n";
		str += "docContentName : "+docContentName+"\n";
		str += "docContent : "+docContent+"\n";
		str += "docContentBytesize : "+docContentBytesize+"\n";
		str += "docContentMime : "+docContentMime+"\n";
		str += "isInternalDoc : "+isInternalDoc+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"docContentId\" value=\""+docContentId+"\">";
		str += "<column name=\"docContentName\" value=\""+docContentName+"\">";
		str += "<column name=\"docContent\" value=\""+docContent+"\">";
		str += "<column name=\"docContentBytesize\" value=\""+docContentBytesize+"\">";
		str += "<column name=\"docContentMime\" value=\""+docContentMime+"\">";
		str += "<column name=\"isInternalDoc\" value=\""+isInternalDoc+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"docContentId\":\""+docContentId+"\", ";
		str += "\"docContentName\":\""+docContentName+"\", ";
		str += "\"docContent\":\""+docContent+"\", ";
		str += "\"docContentBytesize\":\""+docContentBytesize+"\", ";
		str += "\"docContentMime\":\""+docContentMime+"\", ";
		str += "\"isInternalDoc\":\""+isInternalDoc+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}