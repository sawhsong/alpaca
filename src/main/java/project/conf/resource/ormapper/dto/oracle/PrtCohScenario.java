/**************************************************************************************************
 * Framework Generated DTO Source
 * - PRT_COH_SCENARIO - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class PrtCohScenario extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double prtCohScenarioId;
	private String PRT_COH_SCENARIO_ID;
	private String evidenceDescription;
	private String EVIDENCE_DESCRIPTION;
	private String evidenceDocSrcOrg;
	private String EVIDENCE_DOC_SRC_ORG;
	private String evidenceDocSubtype;
	private String EVIDENCE_DOC_SUBTYPE;
	private String isActive;
	private String IS_ACTIVE;
	private String organisationLiable;
	private String ORGANISATION_LIABLE;
	private String scenario;
	private String SCENARIO;
	private String stateCode;
	private String STATE_CODE;
	private String canEuBoBeSame;
	private String CAN_EU_BO_BE_SAME;
	private String description;
	private String DESCRIPTION;
	private String isAgency2Mandatory;
	private String IS_AGENCY2_MANDATORY;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public PrtCohScenario() throws Exception {
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
		setFrwVarPrimaryKey("PRT_COH_SCENARIO_ID");
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("PRT_COH_SCENARIO_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPrtCohScenarioId() {
		return prtCohScenarioId;
	}

	public void setPrtCohScenarioId(double prtCohScenarioId) throws Exception {
		this.prtCohScenarioId = prtCohScenarioId;
		setValueFromAccessor("PRT_COH_SCENARIO_ID", CommonUtil.toString(prtCohScenarioId));
	}

	public String getEvidenceDescription() {
		return evidenceDescription;
	}

	public void setEvidenceDescription(String evidenceDescription) throws Exception {
		this.evidenceDescription = evidenceDescription;
		setValueFromAccessor("EVIDENCE_DESCRIPTION", evidenceDescription);
	}

	public String getEvidenceDocSrcOrg() {
		return evidenceDocSrcOrg;
	}

	public void setEvidenceDocSrcOrg(String evidenceDocSrcOrg) throws Exception {
		this.evidenceDocSrcOrg = evidenceDocSrcOrg;
		setValueFromAccessor("EVIDENCE_DOC_SRC_ORG", evidenceDocSrcOrg);
	}

	public String getEvidenceDocSubtype() {
		return evidenceDocSubtype;
	}

	public void setEvidenceDocSubtype(String evidenceDocSubtype) throws Exception {
		this.evidenceDocSubtype = evidenceDocSubtype;
		setValueFromAccessor("EVIDENCE_DOC_SUBTYPE", evidenceDocSubtype);
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) throws Exception {
		this.isActive = isActive;
		setValueFromAccessor("IS_ACTIVE", isActive);
	}

	public String getOrganisationLiable() {
		return organisationLiable;
	}

	public void setOrganisationLiable(String organisationLiable) throws Exception {
		this.organisationLiable = organisationLiable;
		setValueFromAccessor("ORGANISATION_LIABLE", organisationLiable);
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) throws Exception {
		this.scenario = scenario;
		setValueFromAccessor("SCENARIO", scenario);
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) throws Exception {
		this.stateCode = stateCode;
		setValueFromAccessor("STATE_CODE", stateCode);
	}

	public String getCanEuBoBeSame() {
		return canEuBoBeSame;
	}

	public void setCanEuBoBeSame(String canEuBoBeSame) throws Exception {
		this.canEuBoBeSame = canEuBoBeSame;
		setValueFromAccessor("CAN_EU_BO_BE_SAME", canEuBoBeSame);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.description = description;
		setValueFromAccessor("DESCRIPTION", description);
	}

	public String getIsAgency2Mandatory() {
		return isAgency2Mandatory;
	}

	public void setIsAgency2Mandatory(String isAgency2Mandatory) throws Exception {
		this.isAgency2Mandatory = isAgency2Mandatory;
		setValueFromAccessor("IS_AGENCY2_MANDATORY", isAgency2Mandatory);
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

		str += "prtCohScenarioId : "+prtCohScenarioId+"\n";
		str += "evidenceDescription : "+evidenceDescription+"\n";
		str += "evidenceDocSrcOrg : "+evidenceDocSrcOrg+"\n";
		str += "evidenceDocSubtype : "+evidenceDocSubtype+"\n";
		str += "isActive : "+isActive+"\n";
		str += "organisationLiable : "+organisationLiable+"\n";
		str += "scenario : "+scenario+"\n";
		str += "stateCode : "+stateCode+"\n";
		str += "canEuBoBeSame : "+canEuBoBeSame+"\n";
		str += "description : "+description+"\n";
		str += "isAgency2Mandatory : "+isAgency2Mandatory+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"prtCohScenarioId\" value=\""+prtCohScenarioId+"\">";
		str += "<column name=\"evidenceDescription\" value=\""+evidenceDescription+"\">";
		str += "<column name=\"evidenceDocSrcOrg\" value=\""+evidenceDocSrcOrg+"\">";
		str += "<column name=\"evidenceDocSubtype\" value=\""+evidenceDocSubtype+"\">";
		str += "<column name=\"isActive\" value=\""+isActive+"\">";
		str += "<column name=\"organisationLiable\" value=\""+organisationLiable+"\">";
		str += "<column name=\"scenario\" value=\""+scenario+"\">";
		str += "<column name=\"stateCode\" value=\""+stateCode+"\">";
		str += "<column name=\"canEuBoBeSame\" value=\""+canEuBoBeSame+"\">";
		str += "<column name=\"description\" value=\""+description+"\">";
		str += "<column name=\"isAgency2Mandatory\" value=\""+isAgency2Mandatory+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"prtCohScenarioId\":\""+prtCohScenarioId+"\", ";
		str += "\"evidenceDescription\":\""+evidenceDescription+"\", ";
		str += "\"evidenceDocSrcOrg\":\""+evidenceDocSrcOrg+"\", ";
		str += "\"evidenceDocSubtype\":\""+evidenceDocSubtype+"\", ";
		str += "\"isActive\":\""+isActive+"\", ";
		str += "\"organisationLiable\":\""+organisationLiable+"\", ";
		str += "\"scenario\":\""+scenario+"\", ";
		str += "\"stateCode\":\""+stateCode+"\", ";
		str += "\"canEuBoBeSame\":\""+canEuBoBeSame+"\", ";
		str += "\"description\":\""+description+"\", ";
		str += "\"isAgency2Mandatory\":\""+isAgency2Mandatory+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}