/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_PERCI_NIR - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpPerciNir extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double perciNirId;
	private String PERCI_NIR_ID;
	private double asgId;
	private String ASG_ID;
	private String asgComments;
	private String ASG_COMMENTS;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double ciGstAmt;
	private String CI_GST_AMT;
	private double ciOthersAmt;
	private String CI_OTHERS_AMT;
	private double ciPayrollTaxAmt;
	private String CI_PAYROLL_TAX_AMT;
	private double ciRateAmt;
	private String CI_RATE_AMT;
	private String comments;
	private String COMMENTS;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private String existingProcYN;
	private String EXISTING_PROC_Y_N;
	private String extDateChnagedYN;
	private String EXT_DATE_CHNAGED_Y_N;
	private String extDateYN;
	private String EXT_DATE_Y_N;
	private String invoiceCycle;
	private String INVOICE_CYCLE;
	private double invGstAmt;
	private String INV_GST_AMT;
	private String invGstUnit;
	private String INV_GST_UNIT;
	private double invMgtFeeAmt;
	private String INV_MGT_FEE_AMT;
	private String invMgtFeeUnit;
	private String INV_MGT_FEE_UNIT;
	private double invOthAmt;
	private String INV_OTH_AMT;
	private String invOthUnit;
	private String INV_OTH_UNIT;
	private double invPrtAmt;
	private String INV_PRT_AMT;
	private String invPrtUnit;
	private String INV_PRT_UNIT;
	private double invRateAmt;
	private String INV_RATE_AMT;
	private String invRateUnit;
	private String INV_RATE_UNIT;
	private Date lafhaRevDate;
	private String LAFHA_REV_DATE;
	private String lafhaYN;
	private String LAFHA_Y_N;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String maxLafha;
	private String MAX_LAFHA;
	private String newAsgYN;
	private String NEW_ASG_Y_N;
	private String newBillOrgYN;
	private String NEW_BILL_ORG_Y_N;
	private String newProcYN;
	private String NEW_PROC_Y_N;
	private String nextActionCreated;
	private String NEXT_ACTION_CREATED;
	private double orgId;
	private String ORG_ID;
	private String payCycle;
	private String PAY_CYCLE;
	private String posMgtFeeAmt;
	private String POS_MGT_FEE_AMT;
	private String posMgtFeeUnit;
	private String POS_MGT_FEE_UNIT;
	private String posOthAmt;
	private String POS_OTH_AMT;
	private String posOthUnit;
	private String POS_OTH_UNIT;
	private String posPrtAmt;
	private String POS_PRT_AMT;
	private String posPrtUnit;
	private String POS_PRT_UNIT;
	private String posRateAmt;
	private String POS_RATE_AMT;
	private String posRateUnit;
	private String POS_RATE_UNIT;
	private double prtOrgId;
	private String PRT_ORG_ID;
	private String sponLevel;
	private String SPON_LEVEL;
	private String timesheetCycle;
	private String TIMESHEET_CYCLE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpPerciNir() throws Exception {
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
		setFrwVarPrimaryKey("PERCI_NIR_ID");
		setFrwVarDateColumn("CREATION_DATE,LAFHA_REV_DATE,LAST_UPDATE_DATE");
		setFrwVarNumberColumn("PERCI_NIR_ID,ASG_ID,BUSINESS_GROUP_ID,CI_GST_AMT,CI_OTHERS_AMT,CI_PAYROLL_TAX_AMT,CI_RATE_AMT,CREATED_BY,INV_GST_AMT,INV_MGT_FEE_AMT,INV_OTH_AMT,INV_PRT_AMT,INV_RATE_AMT,LAST_UPDATED_BY,ORG_ID,PRT_ORG_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getPerciNirId() {
		return perciNirId;
	}

	public void setPerciNirId(double perciNirId) throws Exception {
		this.perciNirId = perciNirId;
		setValueFromAccessor("PERCI_NIR_ID", CommonUtil.toString(perciNirId));
	}

	public double getAsgId() {
		return asgId;
	}

	public void setAsgId(double asgId) throws Exception {
		this.asgId = asgId;
		setValueFromAccessor("ASG_ID", CommonUtil.toString(asgId));
	}

	public String getAsgComments() {
		return asgComments;
	}

	public void setAsgComments(String asgComments) throws Exception {
		this.asgComments = asgComments;
		setValueFromAccessor("ASG_COMMENTS", asgComments);
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public double getCiGstAmt() {
		return ciGstAmt;
	}

	public void setCiGstAmt(double ciGstAmt) throws Exception {
		this.ciGstAmt = ciGstAmt;
		setValueFromAccessor("CI_GST_AMT", CommonUtil.toString(ciGstAmt));
	}

	public double getCiOthersAmt() {
		return ciOthersAmt;
	}

	public void setCiOthersAmt(double ciOthersAmt) throws Exception {
		this.ciOthersAmt = ciOthersAmt;
		setValueFromAccessor("CI_OTHERS_AMT", CommonUtil.toString(ciOthersAmt));
	}

	public double getCiPayrollTaxAmt() {
		return ciPayrollTaxAmt;
	}

	public void setCiPayrollTaxAmt(double ciPayrollTaxAmt) throws Exception {
		this.ciPayrollTaxAmt = ciPayrollTaxAmt;
		setValueFromAccessor("CI_PAYROLL_TAX_AMT", CommonUtil.toString(ciPayrollTaxAmt));
	}

	public double getCiRateAmt() {
		return ciRateAmt;
	}

	public void setCiRateAmt(double ciRateAmt) throws Exception {
		this.ciRateAmt = ciRateAmt;
		setValueFromAccessor("CI_RATE_AMT", CommonUtil.toString(ciRateAmt));
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
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

	public String getExistingProcYN() {
		return existingProcYN;
	}

	public void setExistingProcYN(String existingProcYN) throws Exception {
		this.existingProcYN = existingProcYN;
		setValueFromAccessor("EXISTING_PROC_Y_N", existingProcYN);
	}

	public String getExtDateChnagedYN() {
		return extDateChnagedYN;
	}

	public void setExtDateChnagedYN(String extDateChnagedYN) throws Exception {
		this.extDateChnagedYN = extDateChnagedYN;
		setValueFromAccessor("EXT_DATE_CHNAGED_Y_N", extDateChnagedYN);
	}

	public String getExtDateYN() {
		return extDateYN;
	}

	public void setExtDateYN(String extDateYN) throws Exception {
		this.extDateYN = extDateYN;
		setValueFromAccessor("EXT_DATE_Y_N", extDateYN);
	}

	public String getInvoiceCycle() {
		return invoiceCycle;
	}

	public void setInvoiceCycle(String invoiceCycle) throws Exception {
		this.invoiceCycle = invoiceCycle;
		setValueFromAccessor("INVOICE_CYCLE", invoiceCycle);
	}

	public double getInvGstAmt() {
		return invGstAmt;
	}

	public void setInvGstAmt(double invGstAmt) throws Exception {
		this.invGstAmt = invGstAmt;
		setValueFromAccessor("INV_GST_AMT", CommonUtil.toString(invGstAmt));
	}

	public String getInvGstUnit() {
		return invGstUnit;
	}

	public void setInvGstUnit(String invGstUnit) throws Exception {
		this.invGstUnit = invGstUnit;
		setValueFromAccessor("INV_GST_UNIT", invGstUnit);
	}

	public double getInvMgtFeeAmt() {
		return invMgtFeeAmt;
	}

	public void setInvMgtFeeAmt(double invMgtFeeAmt) throws Exception {
		this.invMgtFeeAmt = invMgtFeeAmt;
		setValueFromAccessor("INV_MGT_FEE_AMT", CommonUtil.toString(invMgtFeeAmt));
	}

	public String getInvMgtFeeUnit() {
		return invMgtFeeUnit;
	}

	public void setInvMgtFeeUnit(String invMgtFeeUnit) throws Exception {
		this.invMgtFeeUnit = invMgtFeeUnit;
		setValueFromAccessor("INV_MGT_FEE_UNIT", invMgtFeeUnit);
	}

	public double getInvOthAmt() {
		return invOthAmt;
	}

	public void setInvOthAmt(double invOthAmt) throws Exception {
		this.invOthAmt = invOthAmt;
		setValueFromAccessor("INV_OTH_AMT", CommonUtil.toString(invOthAmt));
	}

	public String getInvOthUnit() {
		return invOthUnit;
	}

	public void setInvOthUnit(String invOthUnit) throws Exception {
		this.invOthUnit = invOthUnit;
		setValueFromAccessor("INV_OTH_UNIT", invOthUnit);
	}

	public double getInvPrtAmt() {
		return invPrtAmt;
	}

	public void setInvPrtAmt(double invPrtAmt) throws Exception {
		this.invPrtAmt = invPrtAmt;
		setValueFromAccessor("INV_PRT_AMT", CommonUtil.toString(invPrtAmt));
	}

	public String getInvPrtUnit() {
		return invPrtUnit;
	}

	public void setInvPrtUnit(String invPrtUnit) throws Exception {
		this.invPrtUnit = invPrtUnit;
		setValueFromAccessor("INV_PRT_UNIT", invPrtUnit);
	}

	public double getInvRateAmt() {
		return invRateAmt;
	}

	public void setInvRateAmt(double invRateAmt) throws Exception {
		this.invRateAmt = invRateAmt;
		setValueFromAccessor("INV_RATE_AMT", CommonUtil.toString(invRateAmt));
	}

	public String getInvRateUnit() {
		return invRateUnit;
	}

	public void setInvRateUnit(String invRateUnit) throws Exception {
		this.invRateUnit = invRateUnit;
		setValueFromAccessor("INV_RATE_UNIT", invRateUnit);
	}

	public Date getLafhaRevDate() {
		return lafhaRevDate;
	}

	public void setLafhaRevDate(Date lafhaRevDate) throws Exception {
		this.lafhaRevDate = lafhaRevDate;
		setValueFromAccessor("LAFHA_REV_DATE", CommonUtil.toString(lafhaRevDate));
	}

	public String getLafhaYN() {
		return lafhaYN;
	}

	public void setLafhaYN(String lafhaYN) throws Exception {
		this.lafhaYN = lafhaYN;
		setValueFromAccessor("LAFHA_Y_N", lafhaYN);
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

	public String getMaxLafha() {
		return maxLafha;
	}

	public void setMaxLafha(String maxLafha) throws Exception {
		this.maxLafha = maxLafha;
		setValueFromAccessor("MAX_LAFHA", maxLafha);
	}

	public String getNewAsgYN() {
		return newAsgYN;
	}

	public void setNewAsgYN(String newAsgYN) throws Exception {
		this.newAsgYN = newAsgYN;
		setValueFromAccessor("NEW_ASG_Y_N", newAsgYN);
	}

	public String getNewBillOrgYN() {
		return newBillOrgYN;
	}

	public void setNewBillOrgYN(String newBillOrgYN) throws Exception {
		this.newBillOrgYN = newBillOrgYN;
		setValueFromAccessor("NEW_BILL_ORG_Y_N", newBillOrgYN);
	}

	public String getNewProcYN() {
		return newProcYN;
	}

	public void setNewProcYN(String newProcYN) throws Exception {
		this.newProcYN = newProcYN;
		setValueFromAccessor("NEW_PROC_Y_N", newProcYN);
	}

	public String getNextActionCreated() {
		return nextActionCreated;
	}

	public void setNextActionCreated(String nextActionCreated) throws Exception {
		this.nextActionCreated = nextActionCreated;
		setValueFromAccessor("NEXT_ACTION_CREATED", nextActionCreated);
	}

	public double getOrgId() {
		return orgId;
	}

	public void setOrgId(double orgId) throws Exception {
		this.orgId = orgId;
		setValueFromAccessor("ORG_ID", CommonUtil.toString(orgId));
	}

	public String getPayCycle() {
		return payCycle;
	}

	public void setPayCycle(String payCycle) throws Exception {
		this.payCycle = payCycle;
		setValueFromAccessor("PAY_CYCLE", payCycle);
	}

	public String getPosMgtFeeAmt() {
		return posMgtFeeAmt;
	}

	public void setPosMgtFeeAmt(String posMgtFeeAmt) throws Exception {
		this.posMgtFeeAmt = posMgtFeeAmt;
		setValueFromAccessor("POS_MGT_FEE_AMT", posMgtFeeAmt);
	}

	public String getPosMgtFeeUnit() {
		return posMgtFeeUnit;
	}

	public void setPosMgtFeeUnit(String posMgtFeeUnit) throws Exception {
		this.posMgtFeeUnit = posMgtFeeUnit;
		setValueFromAccessor("POS_MGT_FEE_UNIT", posMgtFeeUnit);
	}

	public String getPosOthAmt() {
		return posOthAmt;
	}

	public void setPosOthAmt(String posOthAmt) throws Exception {
		this.posOthAmt = posOthAmt;
		setValueFromAccessor("POS_OTH_AMT", posOthAmt);
	}

	public String getPosOthUnit() {
		return posOthUnit;
	}

	public void setPosOthUnit(String posOthUnit) throws Exception {
		this.posOthUnit = posOthUnit;
		setValueFromAccessor("POS_OTH_UNIT", posOthUnit);
	}

	public String getPosPrtAmt() {
		return posPrtAmt;
	}

	public void setPosPrtAmt(String posPrtAmt) throws Exception {
		this.posPrtAmt = posPrtAmt;
		setValueFromAccessor("POS_PRT_AMT", posPrtAmt);
	}

	public String getPosPrtUnit() {
		return posPrtUnit;
	}

	public void setPosPrtUnit(String posPrtUnit) throws Exception {
		this.posPrtUnit = posPrtUnit;
		setValueFromAccessor("POS_PRT_UNIT", posPrtUnit);
	}

	public String getPosRateAmt() {
		return posRateAmt;
	}

	public void setPosRateAmt(String posRateAmt) throws Exception {
		this.posRateAmt = posRateAmt;
		setValueFromAccessor("POS_RATE_AMT", posRateAmt);
	}

	public String getPosRateUnit() {
		return posRateUnit;
	}

	public void setPosRateUnit(String posRateUnit) throws Exception {
		this.posRateUnit = posRateUnit;
		setValueFromAccessor("POS_RATE_UNIT", posRateUnit);
	}

	public double getPrtOrgId() {
		return prtOrgId;
	}

	public void setPrtOrgId(double prtOrgId) throws Exception {
		this.prtOrgId = prtOrgId;
		setValueFromAccessor("PRT_ORG_ID", CommonUtil.toString(prtOrgId));
	}

	public String getSponLevel() {
		return sponLevel;
	}

	public void setSponLevel(String sponLevel) throws Exception {
		this.sponLevel = sponLevel;
		setValueFromAccessor("SPON_LEVEL", sponLevel);
	}

	public String getTimesheetCycle() {
		return timesheetCycle;
	}

	public void setTimesheetCycle(String timesheetCycle) throws Exception {
		this.timesheetCycle = timesheetCycle;
		setValueFromAccessor("TIMESHEET_CYCLE", timesheetCycle);
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

		str += "perciNirId : "+perciNirId+"\n";
		str += "asgId : "+asgId+"\n";
		str += "asgComments : "+asgComments+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "ciGstAmt : "+ciGstAmt+"\n";
		str += "ciOthersAmt : "+ciOthersAmt+"\n";
		str += "ciPayrollTaxAmt : "+ciPayrollTaxAmt+"\n";
		str += "ciRateAmt : "+ciRateAmt+"\n";
		str += "comments : "+comments+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "existingProcYN : "+existingProcYN+"\n";
		str += "extDateChnagedYN : "+extDateChnagedYN+"\n";
		str += "extDateYN : "+extDateYN+"\n";
		str += "invoiceCycle : "+invoiceCycle+"\n";
		str += "invGstAmt : "+invGstAmt+"\n";
		str += "invGstUnit : "+invGstUnit+"\n";
		str += "invMgtFeeAmt : "+invMgtFeeAmt+"\n";
		str += "invMgtFeeUnit : "+invMgtFeeUnit+"\n";
		str += "invOthAmt : "+invOthAmt+"\n";
		str += "invOthUnit : "+invOthUnit+"\n";
		str += "invPrtAmt : "+invPrtAmt+"\n";
		str += "invPrtUnit : "+invPrtUnit+"\n";
		str += "invRateAmt : "+invRateAmt+"\n";
		str += "invRateUnit : "+invRateUnit+"\n";
		str += "lafhaRevDate : "+lafhaRevDate+"\n";
		str += "lafhaYN : "+lafhaYN+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "maxLafha : "+maxLafha+"\n";
		str += "newAsgYN : "+newAsgYN+"\n";
		str += "newBillOrgYN : "+newBillOrgYN+"\n";
		str += "newProcYN : "+newProcYN+"\n";
		str += "nextActionCreated : "+nextActionCreated+"\n";
		str += "orgId : "+orgId+"\n";
		str += "payCycle : "+payCycle+"\n";
		str += "posMgtFeeAmt : "+posMgtFeeAmt+"\n";
		str += "posMgtFeeUnit : "+posMgtFeeUnit+"\n";
		str += "posOthAmt : "+posOthAmt+"\n";
		str += "posOthUnit : "+posOthUnit+"\n";
		str += "posPrtAmt : "+posPrtAmt+"\n";
		str += "posPrtUnit : "+posPrtUnit+"\n";
		str += "posRateAmt : "+posRateAmt+"\n";
		str += "posRateUnit : "+posRateUnit+"\n";
		str += "prtOrgId : "+prtOrgId+"\n";
		str += "sponLevel : "+sponLevel+"\n";
		str += "timesheetCycle : "+timesheetCycle+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"perciNirId\" value=\""+perciNirId+"\">";
		str += "<column name=\"asgId\" value=\""+asgId+"\">";
		str += "<column name=\"asgComments\" value=\""+asgComments+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"ciGstAmt\" value=\""+ciGstAmt+"\">";
		str += "<column name=\"ciOthersAmt\" value=\""+ciOthersAmt+"\">";
		str += "<column name=\"ciPayrollTaxAmt\" value=\""+ciPayrollTaxAmt+"\">";
		str += "<column name=\"ciRateAmt\" value=\""+ciRateAmt+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"existingProcYN\" value=\""+existingProcYN+"\">";
		str += "<column name=\"extDateChnagedYN\" value=\""+extDateChnagedYN+"\">";
		str += "<column name=\"extDateYN\" value=\""+extDateYN+"\">";
		str += "<column name=\"invoiceCycle\" value=\""+invoiceCycle+"\">";
		str += "<column name=\"invGstAmt\" value=\""+invGstAmt+"\">";
		str += "<column name=\"invGstUnit\" value=\""+invGstUnit+"\">";
		str += "<column name=\"invMgtFeeAmt\" value=\""+invMgtFeeAmt+"\">";
		str += "<column name=\"invMgtFeeUnit\" value=\""+invMgtFeeUnit+"\">";
		str += "<column name=\"invOthAmt\" value=\""+invOthAmt+"\">";
		str += "<column name=\"invOthUnit\" value=\""+invOthUnit+"\">";
		str += "<column name=\"invPrtAmt\" value=\""+invPrtAmt+"\">";
		str += "<column name=\"invPrtUnit\" value=\""+invPrtUnit+"\">";
		str += "<column name=\"invRateAmt\" value=\""+invRateAmt+"\">";
		str += "<column name=\"invRateUnit\" value=\""+invRateUnit+"\">";
		str += "<column name=\"lafhaRevDate\" value=\""+lafhaRevDate+"\">";
		str += "<column name=\"lafhaYN\" value=\""+lafhaYN+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"maxLafha\" value=\""+maxLafha+"\">";
		str += "<column name=\"newAsgYN\" value=\""+newAsgYN+"\">";
		str += "<column name=\"newBillOrgYN\" value=\""+newBillOrgYN+"\">";
		str += "<column name=\"newProcYN\" value=\""+newProcYN+"\">";
		str += "<column name=\"nextActionCreated\" value=\""+nextActionCreated+"\">";
		str += "<column name=\"orgId\" value=\""+orgId+"\">";
		str += "<column name=\"payCycle\" value=\""+payCycle+"\">";
		str += "<column name=\"posMgtFeeAmt\" value=\""+posMgtFeeAmt+"\">";
		str += "<column name=\"posMgtFeeUnit\" value=\""+posMgtFeeUnit+"\">";
		str += "<column name=\"posOthAmt\" value=\""+posOthAmt+"\">";
		str += "<column name=\"posOthUnit\" value=\""+posOthUnit+"\">";
		str += "<column name=\"posPrtAmt\" value=\""+posPrtAmt+"\">";
		str += "<column name=\"posPrtUnit\" value=\""+posPrtUnit+"\">";
		str += "<column name=\"posRateAmt\" value=\""+posRateAmt+"\">";
		str += "<column name=\"posRateUnit\" value=\""+posRateUnit+"\">";
		str += "<column name=\"prtOrgId\" value=\""+prtOrgId+"\">";
		str += "<column name=\"sponLevel\" value=\""+sponLevel+"\">";
		str += "<column name=\"timesheetCycle\" value=\""+timesheetCycle+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"perciNirId\":\""+perciNirId+"\", ";
		str += "\"asgId\":\""+asgId+"\", ";
		str += "\"asgComments\":\""+asgComments+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"ciGstAmt\":\""+ciGstAmt+"\", ";
		str += "\"ciOthersAmt\":\""+ciOthersAmt+"\", ";
		str += "\"ciPayrollTaxAmt\":\""+ciPayrollTaxAmt+"\", ";
		str += "\"ciRateAmt\":\""+ciRateAmt+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"existingProcYN\":\""+existingProcYN+"\", ";
		str += "\"extDateChnagedYN\":\""+extDateChnagedYN+"\", ";
		str += "\"extDateYN\":\""+extDateYN+"\", ";
		str += "\"invoiceCycle\":\""+invoiceCycle+"\", ";
		str += "\"invGstAmt\":\""+invGstAmt+"\", ";
		str += "\"invGstUnit\":\""+invGstUnit+"\", ";
		str += "\"invMgtFeeAmt\":\""+invMgtFeeAmt+"\", ";
		str += "\"invMgtFeeUnit\":\""+invMgtFeeUnit+"\", ";
		str += "\"invOthAmt\":\""+invOthAmt+"\", ";
		str += "\"invOthUnit\":\""+invOthUnit+"\", ";
		str += "\"invPrtAmt\":\""+invPrtAmt+"\", ";
		str += "\"invPrtUnit\":\""+invPrtUnit+"\", ";
		str += "\"invRateAmt\":\""+invRateAmt+"\", ";
		str += "\"invRateUnit\":\""+invRateUnit+"\", ";
		str += "\"lafhaRevDate\":\""+lafhaRevDate+"\", ";
		str += "\"lafhaYN\":\""+lafhaYN+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"maxLafha\":\""+maxLafha+"\", ";
		str += "\"newAsgYN\":\""+newAsgYN+"\", ";
		str += "\"newBillOrgYN\":\""+newBillOrgYN+"\", ";
		str += "\"newProcYN\":\""+newProcYN+"\", ";
		str += "\"nextActionCreated\":\""+nextActionCreated+"\", ";
		str += "\"orgId\":\""+orgId+"\", ";
		str += "\"payCycle\":\""+payCycle+"\", ";
		str += "\"posMgtFeeAmt\":\""+posMgtFeeAmt+"\", ";
		str += "\"posMgtFeeUnit\":\""+posMgtFeeUnit+"\", ";
		str += "\"posOthAmt\":\""+posOthAmt+"\", ";
		str += "\"posOthUnit\":\""+posOthUnit+"\", ";
		str += "\"posPrtAmt\":\""+posPrtAmt+"\", ";
		str += "\"posPrtUnit\":\""+posPrtUnit+"\", ";
		str += "\"posRateAmt\":\""+posRateAmt+"\", ";
		str += "\"posRateUnit\":\""+posRateUnit+"\", ";
		str += "\"prtOrgId\":\""+prtOrgId+"\", ";
		str += "\"sponLevel\":\""+sponLevel+"\", ";
		str += "\"timesheetCycle\":\""+timesheetCycle+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}