/**************************************************************************************************
 * Framework Generated DTO Source
 * - STP_DETAIL - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class StpDetail extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double stpDetailId;
	private String STP_DETAIL_ID;
	private double personId;
	private String PERSON_ID;
	private double terminationPaymentDetailId;
	private String TERMINATION_PAYMENT_DETAIL_ID;
	private double componentAlPost17Aug1993;
	private String COMPONENT_AL_POST_17_AUG_1993;
	private double componentAlPre18Aug1993;
	private String COMPONENT_AL_PRE_18_AUG_1993;
	private double componentLlPost17Aug1993;
	private String COMPONENT_LL_POST_17_AUG_1993;
	private double componentLlPre18Aug1993;
	private String COMPONENT_LL_PRE_18_AUG_1993;
	private double componentLslPost17Aug1993;
	private String COMPONENT_LSL_POST_17_AUG_1993;
	private double componentLslPre16Aug1978;
	private String COMPONENT_LSL_PRE_16_AUG_1978;
	private double componentLslRange7893;
	private String COMPONENT_LSL_RANGE_78_93;
	private double lumpSumA;
	private String LUMP_SUM_A;
	private double lumpSumB;
	private String LUMP_SUM_B;
	private double lumpSumD;
	private String LUMP_SUM_D;
	private double lumpSumE;
	private String LUMP_SUM_E;
	private double paymentAdvanceLoan;
	private String PAYMENT_ADVANCE_LOAN;
	private double paymentBonafideTaxFree;
	private String PAYMENT_BONAFIDE_TAX_FREE;
	private double paymentCompensationInjury;
	private String PAYMENT_COMPENSATION_INJURY;
	private double paymentLongServiceLeave;
	private String PAYMENT_LONG_SERVICE_LEAVE;
	private double paymentRestraintTrade;
	private String PAYMENT_RESTRAINT_TRADE;
	private double paymentSalaryWages;
	private String PAYMENT_SALARY_WAGES;
	private double paymentUnusedAnnualLeave;
	private String PAYMENT_UNUSED_ANNUAL_LEAVE;
	private double paymentUnusedLeaveLoading;
	private String PAYMENT_UNUSED_LEAVE_LOADING;
	private String terminationType;
	private String TERMINATION_TYPE;
	private double weeklyNormalPay;
	private String WEEKLY_NORMAL_PAY;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public StpDetail() throws Exception {
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
		setFrwVarPrimaryKey("STP_DETAIL_ID");
		setFrwVarDateColumn("");
		setFrwVarNumberColumn("STP_DETAIL_ID,PERSON_ID,TERMINATION_PAYMENT_DETAIL_ID,COMPONENT_AL_POST_17_AUG_1993,COMPONENT_AL_PRE_18_AUG_1993,COMPONENT_LL_POST_17_AUG_1993,COMPONENT_LL_PRE_18_AUG_1993,COMPONENT_LSL_POST_17_AUG_1993,COMPONENT_LSL_PRE_16_AUG_1978,COMPONENT_LSL_RANGE_78_93,LUMP_SUM_A,LUMP_SUM_B,LUMP_SUM_D,LUMP_SUM_E,PAYMENT_ADVANCE_LOAN,PAYMENT_BONAFIDE_TAX_FREE,PAYMENT_COMPENSATION_INJURY,PAYMENT_LONG_SERVICE_LEAVE,PAYMENT_RESTRAINT_TRADE,PAYMENT_SALARY_WAGES,PAYMENT_UNUSED_ANNUAL_LEAVE,PAYMENT_UNUSED_LEAVE_LOADING,WEEKLY_NORMAL_PAY");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getStpDetailId() {
		return stpDetailId;
	}

	public void setStpDetailId(double stpDetailId) throws Exception {
		this.stpDetailId = stpDetailId;
		setValueFromAccessor("STP_DETAIL_ID", CommonUtil.toString(stpDetailId));
	}

	public double getPersonId() {
		return personId;
	}

	public void setPersonId(double personId) throws Exception {
		this.personId = personId;
		setValueFromAccessor("PERSON_ID", CommonUtil.toString(personId));
	}

	public double getTerminationPaymentDetailId() {
		return terminationPaymentDetailId;
	}

	public void setTerminationPaymentDetailId(double terminationPaymentDetailId) throws Exception {
		this.terminationPaymentDetailId = terminationPaymentDetailId;
		setValueFromAccessor("TERMINATION_PAYMENT_DETAIL_ID", CommonUtil.toString(terminationPaymentDetailId));
	}

	public double getComponentAlPost17Aug1993() {
		return componentAlPost17Aug1993;
	}

	public void setComponentAlPost17Aug1993(double componentAlPost17Aug1993) throws Exception {
		this.componentAlPost17Aug1993 = componentAlPost17Aug1993;
		setValueFromAccessor("COMPONENT_AL_POST_17_AUG_1993", CommonUtil.toString(componentAlPost17Aug1993));
	}

	public double getComponentAlPre18Aug1993() {
		return componentAlPre18Aug1993;
	}

	public void setComponentAlPre18Aug1993(double componentAlPre18Aug1993) throws Exception {
		this.componentAlPre18Aug1993 = componentAlPre18Aug1993;
		setValueFromAccessor("COMPONENT_AL_PRE_18_AUG_1993", CommonUtil.toString(componentAlPre18Aug1993));
	}

	public double getComponentLlPost17Aug1993() {
		return componentLlPost17Aug1993;
	}

	public void setComponentLlPost17Aug1993(double componentLlPost17Aug1993) throws Exception {
		this.componentLlPost17Aug1993 = componentLlPost17Aug1993;
		setValueFromAccessor("COMPONENT_LL_POST_17_AUG_1993", CommonUtil.toString(componentLlPost17Aug1993));
	}

	public double getComponentLlPre18Aug1993() {
		return componentLlPre18Aug1993;
	}

	public void setComponentLlPre18Aug1993(double componentLlPre18Aug1993) throws Exception {
		this.componentLlPre18Aug1993 = componentLlPre18Aug1993;
		setValueFromAccessor("COMPONENT_LL_PRE_18_AUG_1993", CommonUtil.toString(componentLlPre18Aug1993));
	}

	public double getComponentLslPost17Aug1993() {
		return componentLslPost17Aug1993;
	}

	public void setComponentLslPost17Aug1993(double componentLslPost17Aug1993) throws Exception {
		this.componentLslPost17Aug1993 = componentLslPost17Aug1993;
		setValueFromAccessor("COMPONENT_LSL_POST_17_AUG_1993", CommonUtil.toString(componentLslPost17Aug1993));
	}

	public double getComponentLslPre16Aug1978() {
		return componentLslPre16Aug1978;
	}

	public void setComponentLslPre16Aug1978(double componentLslPre16Aug1978) throws Exception {
		this.componentLslPre16Aug1978 = componentLslPre16Aug1978;
		setValueFromAccessor("COMPONENT_LSL_PRE_16_AUG_1978", CommonUtil.toString(componentLslPre16Aug1978));
	}

	public double getComponentLslRange7893() {
		return componentLslRange7893;
	}

	public void setComponentLslRange7893(double componentLslRange7893) throws Exception {
		this.componentLslRange7893 = componentLslRange7893;
		setValueFromAccessor("COMPONENT_LSL_RANGE_78_93", CommonUtil.toString(componentLslRange7893));
	}

	public double getLumpSumA() {
		return lumpSumA;
	}

	public void setLumpSumA(double lumpSumA) throws Exception {
		this.lumpSumA = lumpSumA;
		setValueFromAccessor("LUMP_SUM_A", CommonUtil.toString(lumpSumA));
	}

	public double getLumpSumB() {
		return lumpSumB;
	}

	public void setLumpSumB(double lumpSumB) throws Exception {
		this.lumpSumB = lumpSumB;
		setValueFromAccessor("LUMP_SUM_B", CommonUtil.toString(lumpSumB));
	}

	public double getLumpSumD() {
		return lumpSumD;
	}

	public void setLumpSumD(double lumpSumD) throws Exception {
		this.lumpSumD = lumpSumD;
		setValueFromAccessor("LUMP_SUM_D", CommonUtil.toString(lumpSumD));
	}

	public double getLumpSumE() {
		return lumpSumE;
	}

	public void setLumpSumE(double lumpSumE) throws Exception {
		this.lumpSumE = lumpSumE;
		setValueFromAccessor("LUMP_SUM_E", CommonUtil.toString(lumpSumE));
	}

	public double getPaymentAdvanceLoan() {
		return paymentAdvanceLoan;
	}

	public void setPaymentAdvanceLoan(double paymentAdvanceLoan) throws Exception {
		this.paymentAdvanceLoan = paymentAdvanceLoan;
		setValueFromAccessor("PAYMENT_ADVANCE_LOAN", CommonUtil.toString(paymentAdvanceLoan));
	}

	public double getPaymentBonafideTaxFree() {
		return paymentBonafideTaxFree;
	}

	public void setPaymentBonafideTaxFree(double paymentBonafideTaxFree) throws Exception {
		this.paymentBonafideTaxFree = paymentBonafideTaxFree;
		setValueFromAccessor("PAYMENT_BONAFIDE_TAX_FREE", CommonUtil.toString(paymentBonafideTaxFree));
	}

	public double getPaymentCompensationInjury() {
		return paymentCompensationInjury;
	}

	public void setPaymentCompensationInjury(double paymentCompensationInjury) throws Exception {
		this.paymentCompensationInjury = paymentCompensationInjury;
		setValueFromAccessor("PAYMENT_COMPENSATION_INJURY", CommonUtil.toString(paymentCompensationInjury));
	}

	public double getPaymentLongServiceLeave() {
		return paymentLongServiceLeave;
	}

	public void setPaymentLongServiceLeave(double paymentLongServiceLeave) throws Exception {
		this.paymentLongServiceLeave = paymentLongServiceLeave;
		setValueFromAccessor("PAYMENT_LONG_SERVICE_LEAVE", CommonUtil.toString(paymentLongServiceLeave));
	}

	public double getPaymentRestraintTrade() {
		return paymentRestraintTrade;
	}

	public void setPaymentRestraintTrade(double paymentRestraintTrade) throws Exception {
		this.paymentRestraintTrade = paymentRestraintTrade;
		setValueFromAccessor("PAYMENT_RESTRAINT_TRADE", CommonUtil.toString(paymentRestraintTrade));
	}

	public double getPaymentSalaryWages() {
		return paymentSalaryWages;
	}

	public void setPaymentSalaryWages(double paymentSalaryWages) throws Exception {
		this.paymentSalaryWages = paymentSalaryWages;
		setValueFromAccessor("PAYMENT_SALARY_WAGES", CommonUtil.toString(paymentSalaryWages));
	}

	public double getPaymentUnusedAnnualLeave() {
		return paymentUnusedAnnualLeave;
	}

	public void setPaymentUnusedAnnualLeave(double paymentUnusedAnnualLeave) throws Exception {
		this.paymentUnusedAnnualLeave = paymentUnusedAnnualLeave;
		setValueFromAccessor("PAYMENT_UNUSED_ANNUAL_LEAVE", CommonUtil.toString(paymentUnusedAnnualLeave));
	}

	public double getPaymentUnusedLeaveLoading() {
		return paymentUnusedLeaveLoading;
	}

	public void setPaymentUnusedLeaveLoading(double paymentUnusedLeaveLoading) throws Exception {
		this.paymentUnusedLeaveLoading = paymentUnusedLeaveLoading;
		setValueFromAccessor("PAYMENT_UNUSED_LEAVE_LOADING", CommonUtil.toString(paymentUnusedLeaveLoading));
	}

	public String getTerminationType() {
		return terminationType;
	}

	public void setTerminationType(String terminationType) throws Exception {
		this.terminationType = terminationType;
		setValueFromAccessor("TERMINATION_TYPE", terminationType);
	}

	public double getWeeklyNormalPay() {
		return weeklyNormalPay;
	}

	public void setWeeklyNormalPay(double weeklyNormalPay) throws Exception {
		this.weeklyNormalPay = weeklyNormalPay;
		setValueFromAccessor("WEEKLY_NORMAL_PAY", CommonUtil.toString(weeklyNormalPay));
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

		str += "stpDetailId : "+stpDetailId+"\n";
		str += "personId : "+personId+"\n";
		str += "terminationPaymentDetailId : "+terminationPaymentDetailId+"\n";
		str += "componentAlPost17Aug1993 : "+componentAlPost17Aug1993+"\n";
		str += "componentAlPre18Aug1993 : "+componentAlPre18Aug1993+"\n";
		str += "componentLlPost17Aug1993 : "+componentLlPost17Aug1993+"\n";
		str += "componentLlPre18Aug1993 : "+componentLlPre18Aug1993+"\n";
		str += "componentLslPost17Aug1993 : "+componentLslPost17Aug1993+"\n";
		str += "componentLslPre16Aug1978 : "+componentLslPre16Aug1978+"\n";
		str += "componentLslRange7893 : "+componentLslRange7893+"\n";
		str += "lumpSumA : "+lumpSumA+"\n";
		str += "lumpSumB : "+lumpSumB+"\n";
		str += "lumpSumD : "+lumpSumD+"\n";
		str += "lumpSumE : "+lumpSumE+"\n";
		str += "paymentAdvanceLoan : "+paymentAdvanceLoan+"\n";
		str += "paymentBonafideTaxFree : "+paymentBonafideTaxFree+"\n";
		str += "paymentCompensationInjury : "+paymentCompensationInjury+"\n";
		str += "paymentLongServiceLeave : "+paymentLongServiceLeave+"\n";
		str += "paymentRestraintTrade : "+paymentRestraintTrade+"\n";
		str += "paymentSalaryWages : "+paymentSalaryWages+"\n";
		str += "paymentUnusedAnnualLeave : "+paymentUnusedAnnualLeave+"\n";
		str += "paymentUnusedLeaveLoading : "+paymentUnusedLeaveLoading+"\n";
		str += "terminationType : "+terminationType+"\n";
		str += "weeklyNormalPay : "+weeklyNormalPay+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"stpDetailId\" value=\""+stpDetailId+"\">";
		str += "<column name=\"personId\" value=\""+personId+"\">";
		str += "<column name=\"terminationPaymentDetailId\" value=\""+terminationPaymentDetailId+"\">";
		str += "<column name=\"componentAlPost17Aug1993\" value=\""+componentAlPost17Aug1993+"\">";
		str += "<column name=\"componentAlPre18Aug1993\" value=\""+componentAlPre18Aug1993+"\">";
		str += "<column name=\"componentLlPost17Aug1993\" value=\""+componentLlPost17Aug1993+"\">";
		str += "<column name=\"componentLlPre18Aug1993\" value=\""+componentLlPre18Aug1993+"\">";
		str += "<column name=\"componentLslPost17Aug1993\" value=\""+componentLslPost17Aug1993+"\">";
		str += "<column name=\"componentLslPre16Aug1978\" value=\""+componentLslPre16Aug1978+"\">";
		str += "<column name=\"componentLslRange7893\" value=\""+componentLslRange7893+"\">";
		str += "<column name=\"lumpSumA\" value=\""+lumpSumA+"\">";
		str += "<column name=\"lumpSumB\" value=\""+lumpSumB+"\">";
		str += "<column name=\"lumpSumD\" value=\""+lumpSumD+"\">";
		str += "<column name=\"lumpSumE\" value=\""+lumpSumE+"\">";
		str += "<column name=\"paymentAdvanceLoan\" value=\""+paymentAdvanceLoan+"\">";
		str += "<column name=\"paymentBonafideTaxFree\" value=\""+paymentBonafideTaxFree+"\">";
		str += "<column name=\"paymentCompensationInjury\" value=\""+paymentCompensationInjury+"\">";
		str += "<column name=\"paymentLongServiceLeave\" value=\""+paymentLongServiceLeave+"\">";
		str += "<column name=\"paymentRestraintTrade\" value=\""+paymentRestraintTrade+"\">";
		str += "<column name=\"paymentSalaryWages\" value=\""+paymentSalaryWages+"\">";
		str += "<column name=\"paymentUnusedAnnualLeave\" value=\""+paymentUnusedAnnualLeave+"\">";
		str += "<column name=\"paymentUnusedLeaveLoading\" value=\""+paymentUnusedLeaveLoading+"\">";
		str += "<column name=\"terminationType\" value=\""+terminationType+"\">";
		str += "<column name=\"weeklyNormalPay\" value=\""+weeklyNormalPay+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"stpDetailId\":\""+stpDetailId+"\", ";
		str += "\"personId\":\""+personId+"\", ";
		str += "\"terminationPaymentDetailId\":\""+terminationPaymentDetailId+"\", ";
		str += "\"componentAlPost17Aug1993\":\""+componentAlPost17Aug1993+"\", ";
		str += "\"componentAlPre18Aug1993\":\""+componentAlPre18Aug1993+"\", ";
		str += "\"componentLlPost17Aug1993\":\""+componentLlPost17Aug1993+"\", ";
		str += "\"componentLlPre18Aug1993\":\""+componentLlPre18Aug1993+"\", ";
		str += "\"componentLslPost17Aug1993\":\""+componentLslPost17Aug1993+"\", ";
		str += "\"componentLslPre16Aug1978\":\""+componentLslPre16Aug1978+"\", ";
		str += "\"componentLslRange7893\":\""+componentLslRange7893+"\", ";
		str += "\"lumpSumA\":\""+lumpSumA+"\", ";
		str += "\"lumpSumB\":\""+lumpSumB+"\", ";
		str += "\"lumpSumD\":\""+lumpSumD+"\", ";
		str += "\"lumpSumE\":\""+lumpSumE+"\", ";
		str += "\"paymentAdvanceLoan\":\""+paymentAdvanceLoan+"\", ";
		str += "\"paymentBonafideTaxFree\":\""+paymentBonafideTaxFree+"\", ";
		str += "\"paymentCompensationInjury\":\""+paymentCompensationInjury+"\", ";
		str += "\"paymentLongServiceLeave\":\""+paymentLongServiceLeave+"\", ";
		str += "\"paymentRestraintTrade\":\""+paymentRestraintTrade+"\", ";
		str += "\"paymentSalaryWages\":\""+paymentSalaryWages+"\", ";
		str += "\"paymentUnusedAnnualLeave\":\""+paymentUnusedAnnualLeave+"\", ";
		str += "\"paymentUnusedLeaveLoading\":\""+paymentUnusedLeaveLoading+"\", ";
		str += "\"terminationType\":\""+terminationType+"\", ";
		str += "\"weeklyNormalPay\":\""+weeklyNormalPay+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}