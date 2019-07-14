/**************************************************************************************************
 * Framework Generated DTO Source
 * - STP_PAYEE - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class StpPayee extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String abnId;
	private String ABN_ID;
	private String allowanceTypeC;
	private String ALLOWANCE_TYPE_C;
	private String birthD;
	private String BIRTH_D;
	private String birthM;
	private String BIRTH_M;
	private String birthY;
	private String BIRTH_Y;
	private double businessGroupId;
	private String BUSINESS_GROUP_ID;
	private double communityDevProja;
	private String COMMUNITY_DEV_PROJA;
	private String countryC;
	private String COUNTRY_C;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double deductionA;
	private String DEDUCTION_A;
	private String dedTypeC;
	private String DED_TYPE_C;
	private String electronicMail;
	private String ELECTRONIC_MAIL;
	private double empContriSuperGurantee;
	private String EMP_CONTRI_SUPER_GURANTEE;
	private String empEndD;
	private String EMP_END_D;
	private double empReportableA;
	private String EMP_REPORTABLE_A;
	private String empStartD;
	private String EMP_START_D;
	private String endD;
	private String END_D;
	private double etpTaxWhA;
	private String ETP_TAX_WH_A;
	private String etpTypeC;
	private String ETP_TYPE_C;
	private double exemptForeignInc;
	private String EXEMPT_FOREIGN_INC;
	private double exemptIncomeFringeBenefits;
	private String EXEMPT_INCOME_FRINGE_BENEFITS;
	private String familyName;
	private String FAMILY_NAME;
	private String financialSuppScheme;
	private String FINANCIAL_SUPP_SCHEME;
	private String givenName;
	private String GIVEN_NAME;
	private double grossA;
	private String GROSS_A;
	private double indNonBusinessAllowancea;
	private String IND_NON_BUSINESS_ALLOWANCEA;
	private double jdpaForeignWh;
	private String JDPA_FOREIGN_WH;
	private double jdpaGrossA;
	private String JDPA_GROSS_A;
	private double jdpaTaxWh;
	private String JDPA_TAX_WH;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double lhapGrossa;
	private String LHAP_GROSSA;
	private double lhapTaxWh;
	private String LHAP_TAX_WH;
	private String line1T;
	private String LINE1_T;
	private String line2T;
	private String LINE2_T;
	private String loanRepayI;
	private String LOAN_REPAY_I;
	private String localityName;
	private String LOCALITY_NAME;
	private String longServicePay;
	private String LONG_SERVICE_PAY;
	private String lumpa;
	private String LUMPA;
	private double lumpAa;
	private String LUMP_AA;
	private String lumpAc;
	private String LUMP_AC;
	private double lumpBa;
	private String LUMP_BA;
	private double lumpDa;
	private String LUMP_DA;
	private double lumpEa;
	private String LUMP_EA;
	private double ordinaryTimeEarnings;
	private String ORDINARY_TIME_EARNINGS;
	private String otherAllowancetypeDe;
	private String OTHER_ALLOWANCETYPE_DE;
	private String otherGivenName;
	private String OTHER_GIVEN_NAME;
	private String payarrangePaymentBasis;
	private String PAYARRANGE_PAYMENT_BASIS;
	private double payeeId;
	private String PAYEE_ID;
	private double payerId;
	private String PAYER_ID;
	private Date paymentEffectiveD;
	private String PAYMENT_EFFECTIVE_D;
	private String paymentTypeForTax;
	private String PAYMENT_TYPE_FOR_TAX;
	private String payrollEventFinali;
	private String PAYROLL_EVENT_FINALI;
	private String payrollId;
	private String PAYROLL_ID;
	private String payArrangeTerminationC;
	private String PAY_ARRANGE_TERMINATION_C;
	private String postCode;
	private String POST_CODE;
	private double ptfrForeignWhA;
	private String PTFR_FOREIGN_WH_A;
	private double ptfrGrossA;
	private String PTFR_GROSS_A;
	private double ptfrTaxWh;
	private String PTFR_TAX_WH;
	private String rtpPersonStatusC;
	private String RTP_PERSON_STATUS_C;
	private double sbrpGrossA;
	private String SBRP_GROSS_A;
	private double sbrpTaxWh;
	private String SBRP_TAX_WH;
	private String signatureD;
	private String SIGNATURE_D;
	private String startD;
	private String START_D;
	private String statementAcceptedI;
	private String STATEMENT_ACCEPTED_I;
	private String stateTerritory;
	private String STATE_TERRITORY;
	private double superEmpTermTax;
	private String SUPER_EMP_TERM_TAX;
	private double superTaxFreeComp;
	private String SUPER_TAX_FREE_COMP;
	private double taxIncomeFringeBenefits;
	private String TAX_INCOME_FRINGE_BENEFITS;
	private String taxOffsetClaim;
	private String TAX_OFFSET_CLAIM;
	private double taxWithehldA;
	private String TAX_WITHEHLD_A;
	private String telephoneMinimal;
	private String TELEPHONE_MINIMAL;
	private String tfnId;
	private String TFN_ID;
	private double voluntaryGrossA;
	private String VOLUNTARY_GROSS_A;
	private double voluntaryTaxWh;
	private String VOLUNTARY_TAX_WH;
	private double whmGrossa;
	private String WHM_GROSSA;
	private double whmTaxWha;
	private String WHM_TAX_WHA;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public StpPayee() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,PAYMENT_EFFECTIVE_D");
		setFrwVarNumberColumn("BUSINESS_GROUP_ID,COMMUNITY_DEV_PROJA,CREATED_BY,DEDUCTION_A,EMP_CONTRI_SUPER_GURANTEE,EMP_REPORTABLE_A,ETP_TAX_WH_A,EXEMPT_FOREIGN_INC,EXEMPT_INCOME_FRINGE_BENEFITS,GROSS_A,IND_NON_BUSINESS_ALLOWANCEA,JDPA_FOREIGN_WH,JDPA_GROSS_A,JDPA_TAX_WH,LAST_UPDATED_BY,LHAP_GROSSA,LHAP_TAX_WH,LUMP_AA,LUMP_BA,LUMP_DA,LUMP_EA,ORDINARY_TIME_EARNINGS,PAYEE_ID,PAYER_ID,PTFR_FOREIGN_WH_A,PTFR_GROSS_A,PTFR_TAX_WH,SBRP_GROSS_A,SBRP_TAX_WH,SUPER_EMP_TERM_TAX,SUPER_TAX_FREE_COMP,TAX_INCOME_FRINGE_BENEFITS,TAX_WITHEHLD_A,VOLUNTARY_GROSS_A,VOLUNTARY_TAX_WH,WHM_GROSSA,WHM_TAX_WHA");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getAbnId() {
		return abnId;
	}

	public void setAbnId(String abnId) throws Exception {
		this.abnId = abnId;
		setValueFromAccessor("ABN_ID", abnId);
	}

	public String getAllowanceTypeC() {
		return allowanceTypeC;
	}

	public void setAllowanceTypeC(String allowanceTypeC) throws Exception {
		this.allowanceTypeC = allowanceTypeC;
		setValueFromAccessor("ALLOWANCE_TYPE_C", allowanceTypeC);
	}

	public String getBirthD() {
		return birthD;
	}

	public void setBirthD(String birthD) throws Exception {
		this.birthD = birthD;
		setValueFromAccessor("BIRTH_D", birthD);
	}

	public String getBirthM() {
		return birthM;
	}

	public void setBirthM(String birthM) throws Exception {
		this.birthM = birthM;
		setValueFromAccessor("BIRTH_M", birthM);
	}

	public String getBirthY() {
		return birthY;
	}

	public void setBirthY(String birthY) throws Exception {
		this.birthY = birthY;
		setValueFromAccessor("BIRTH_Y", birthY);
	}

	public double getBusinessGroupId() {
		return businessGroupId;
	}

	public void setBusinessGroupId(double businessGroupId) throws Exception {
		this.businessGroupId = businessGroupId;
		setValueFromAccessor("BUSINESS_GROUP_ID", CommonUtil.toString(businessGroupId));
	}

	public double getCommunityDevProja() {
		return communityDevProja;
	}

	public void setCommunityDevProja(double communityDevProja) throws Exception {
		this.communityDevProja = communityDevProja;
		setValueFromAccessor("COMMUNITY_DEV_PROJA", CommonUtil.toString(communityDevProja));
	}

	public String getCountryC() {
		return countryC;
	}

	public void setCountryC(String countryC) throws Exception {
		this.countryC = countryC;
		setValueFromAccessor("COUNTRY_C", countryC);
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

	public double getDeductionA() {
		return deductionA;
	}

	public void setDeductionA(double deductionA) throws Exception {
		this.deductionA = deductionA;
		setValueFromAccessor("DEDUCTION_A", CommonUtil.toString(deductionA));
	}

	public String getDedTypeC() {
		return dedTypeC;
	}

	public void setDedTypeC(String dedTypeC) throws Exception {
		this.dedTypeC = dedTypeC;
		setValueFromAccessor("DED_TYPE_C", dedTypeC);
	}

	public String getElectronicMail() {
		return electronicMail;
	}

	public void setElectronicMail(String electronicMail) throws Exception {
		this.electronicMail = electronicMail;
		setValueFromAccessor("ELECTRONIC_MAIL", electronicMail);
	}

	public double getEmpContriSuperGurantee() {
		return empContriSuperGurantee;
	}

	public void setEmpContriSuperGurantee(double empContriSuperGurantee) throws Exception {
		this.empContriSuperGurantee = empContriSuperGurantee;
		setValueFromAccessor("EMP_CONTRI_SUPER_GURANTEE", CommonUtil.toString(empContriSuperGurantee));
	}

	public String getEmpEndD() {
		return empEndD;
	}

	public void setEmpEndD(String empEndD) throws Exception {
		this.empEndD = empEndD;
		setValueFromAccessor("EMP_END_D", empEndD);
	}

	public double getEmpReportableA() {
		return empReportableA;
	}

	public void setEmpReportableA(double empReportableA) throws Exception {
		this.empReportableA = empReportableA;
		setValueFromAccessor("EMP_REPORTABLE_A", CommonUtil.toString(empReportableA));
	}

	public String getEmpStartD() {
		return empStartD;
	}

	public void setEmpStartD(String empStartD) throws Exception {
		this.empStartD = empStartD;
		setValueFromAccessor("EMP_START_D", empStartD);
	}

	public String getEndD() {
		return endD;
	}

	public void setEndD(String endD) throws Exception {
		this.endD = endD;
		setValueFromAccessor("END_D", endD);
	}

	public double getEtpTaxWhA() {
		return etpTaxWhA;
	}

	public void setEtpTaxWhA(double etpTaxWhA) throws Exception {
		this.etpTaxWhA = etpTaxWhA;
		setValueFromAccessor("ETP_TAX_WH_A", CommonUtil.toString(etpTaxWhA));
	}

	public String getEtpTypeC() {
		return etpTypeC;
	}

	public void setEtpTypeC(String etpTypeC) throws Exception {
		this.etpTypeC = etpTypeC;
		setValueFromAccessor("ETP_TYPE_C", etpTypeC);
	}

	public double getExemptForeignInc() {
		return exemptForeignInc;
	}

	public void setExemptForeignInc(double exemptForeignInc) throws Exception {
		this.exemptForeignInc = exemptForeignInc;
		setValueFromAccessor("EXEMPT_FOREIGN_INC", CommonUtil.toString(exemptForeignInc));
	}

	public double getExemptIncomeFringeBenefits() {
		return exemptIncomeFringeBenefits;
	}

	public void setExemptIncomeFringeBenefits(double exemptIncomeFringeBenefits) throws Exception {
		this.exemptIncomeFringeBenefits = exemptIncomeFringeBenefits;
		setValueFromAccessor("EXEMPT_INCOME_FRINGE_BENEFITS", CommonUtil.toString(exemptIncomeFringeBenefits));
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) throws Exception {
		this.familyName = familyName;
		setValueFromAccessor("FAMILY_NAME", familyName);
	}

	public String getFinancialSuppScheme() {
		return financialSuppScheme;
	}

	public void setFinancialSuppScheme(String financialSuppScheme) throws Exception {
		this.financialSuppScheme = financialSuppScheme;
		setValueFromAccessor("FINANCIAL_SUPP_SCHEME", financialSuppScheme);
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) throws Exception {
		this.givenName = givenName;
		setValueFromAccessor("GIVEN_NAME", givenName);
	}

	public double getGrossA() {
		return grossA;
	}

	public void setGrossA(double grossA) throws Exception {
		this.grossA = grossA;
		setValueFromAccessor("GROSS_A", CommonUtil.toString(grossA));
	}

	public double getIndNonBusinessAllowancea() {
		return indNonBusinessAllowancea;
	}

	public void setIndNonBusinessAllowancea(double indNonBusinessAllowancea) throws Exception {
		this.indNonBusinessAllowancea = indNonBusinessAllowancea;
		setValueFromAccessor("IND_NON_BUSINESS_ALLOWANCEA", CommonUtil.toString(indNonBusinessAllowancea));
	}

	public double getJdpaForeignWh() {
		return jdpaForeignWh;
	}

	public void setJdpaForeignWh(double jdpaForeignWh) throws Exception {
		this.jdpaForeignWh = jdpaForeignWh;
		setValueFromAccessor("JDPA_FOREIGN_WH", CommonUtil.toString(jdpaForeignWh));
	}

	public double getJdpaGrossA() {
		return jdpaGrossA;
	}

	public void setJdpaGrossA(double jdpaGrossA) throws Exception {
		this.jdpaGrossA = jdpaGrossA;
		setValueFromAccessor("JDPA_GROSS_A", CommonUtil.toString(jdpaGrossA));
	}

	public double getJdpaTaxWh() {
		return jdpaTaxWh;
	}

	public void setJdpaTaxWh(double jdpaTaxWh) throws Exception {
		this.jdpaTaxWh = jdpaTaxWh;
		setValueFromAccessor("JDPA_TAX_WH", CommonUtil.toString(jdpaTaxWh));
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

	public double getLhapGrossa() {
		return lhapGrossa;
	}

	public void setLhapGrossa(double lhapGrossa) throws Exception {
		this.lhapGrossa = lhapGrossa;
		setValueFromAccessor("LHAP_GROSSA", CommonUtil.toString(lhapGrossa));
	}

	public double getLhapTaxWh() {
		return lhapTaxWh;
	}

	public void setLhapTaxWh(double lhapTaxWh) throws Exception {
		this.lhapTaxWh = lhapTaxWh;
		setValueFromAccessor("LHAP_TAX_WH", CommonUtil.toString(lhapTaxWh));
	}

	public String getLine1T() {
		return line1T;
	}

	public void setLine1T(String line1T) throws Exception {
		this.line1T = line1T;
		setValueFromAccessor("LINE1_T", line1T);
	}

	public String getLine2T() {
		return line2T;
	}

	public void setLine2T(String line2T) throws Exception {
		this.line2T = line2T;
		setValueFromAccessor("LINE2_T", line2T);
	}

	public String getLoanRepayI() {
		return loanRepayI;
	}

	public void setLoanRepayI(String loanRepayI) throws Exception {
		this.loanRepayI = loanRepayI;
		setValueFromAccessor("LOAN_REPAY_I", loanRepayI);
	}

	public String getLocalityName() {
		return localityName;
	}

	public void setLocalityName(String localityName) throws Exception {
		this.localityName = localityName;
		setValueFromAccessor("LOCALITY_NAME", localityName);
	}

	public String getLongServicePay() {
		return longServicePay;
	}

	public void setLongServicePay(String longServicePay) throws Exception {
		this.longServicePay = longServicePay;
		setValueFromAccessor("LONG_SERVICE_PAY", longServicePay);
	}

	public String getLumpa() {
		return lumpa;
	}

	public void setLumpa(String lumpa) throws Exception {
		this.lumpa = lumpa;
		setValueFromAccessor("LUMPA", lumpa);
	}

	public double getLumpAa() {
		return lumpAa;
	}

	public void setLumpAa(double lumpAa) throws Exception {
		this.lumpAa = lumpAa;
		setValueFromAccessor("LUMP_AA", CommonUtil.toString(lumpAa));
	}

	public String getLumpAc() {
		return lumpAc;
	}

	public void setLumpAc(String lumpAc) throws Exception {
		this.lumpAc = lumpAc;
		setValueFromAccessor("LUMP_AC", lumpAc);
	}

	public double getLumpBa() {
		return lumpBa;
	}

	public void setLumpBa(double lumpBa) throws Exception {
		this.lumpBa = lumpBa;
		setValueFromAccessor("LUMP_BA", CommonUtil.toString(lumpBa));
	}

	public double getLumpDa() {
		return lumpDa;
	}

	public void setLumpDa(double lumpDa) throws Exception {
		this.lumpDa = lumpDa;
		setValueFromAccessor("LUMP_DA", CommonUtil.toString(lumpDa));
	}

	public double getLumpEa() {
		return lumpEa;
	}

	public void setLumpEa(double lumpEa) throws Exception {
		this.lumpEa = lumpEa;
		setValueFromAccessor("LUMP_EA", CommonUtil.toString(lumpEa));
	}

	public double getOrdinaryTimeEarnings() {
		return ordinaryTimeEarnings;
	}

	public void setOrdinaryTimeEarnings(double ordinaryTimeEarnings) throws Exception {
		this.ordinaryTimeEarnings = ordinaryTimeEarnings;
		setValueFromAccessor("ORDINARY_TIME_EARNINGS", CommonUtil.toString(ordinaryTimeEarnings));
	}

	public String getOtherAllowancetypeDe() {
		return otherAllowancetypeDe;
	}

	public void setOtherAllowancetypeDe(String otherAllowancetypeDe) throws Exception {
		this.otherAllowancetypeDe = otherAllowancetypeDe;
		setValueFromAccessor("OTHER_ALLOWANCETYPE_DE", otherAllowancetypeDe);
	}

	public String getOtherGivenName() {
		return otherGivenName;
	}

	public void setOtherGivenName(String otherGivenName) throws Exception {
		this.otherGivenName = otherGivenName;
		setValueFromAccessor("OTHER_GIVEN_NAME", otherGivenName);
	}

	public String getPayarrangePaymentBasis() {
		return payarrangePaymentBasis;
	}

	public void setPayarrangePaymentBasis(String payarrangePaymentBasis) throws Exception {
		this.payarrangePaymentBasis = payarrangePaymentBasis;
		setValueFromAccessor("PAYARRANGE_PAYMENT_BASIS", payarrangePaymentBasis);
	}

	public double getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(double payeeId) throws Exception {
		this.payeeId = payeeId;
		setValueFromAccessor("PAYEE_ID", CommonUtil.toString(payeeId));
	}

	public double getPayerId() {
		return payerId;
	}

	public void setPayerId(double payerId) throws Exception {
		this.payerId = payerId;
		setValueFromAccessor("PAYER_ID", CommonUtil.toString(payerId));
	}

	public Date getPaymentEffectiveD() {
		return paymentEffectiveD;
	}

	public void setPaymentEffectiveD(Date paymentEffectiveD) throws Exception {
		this.paymentEffectiveD = paymentEffectiveD;
		setValueFromAccessor("PAYMENT_EFFECTIVE_D", CommonUtil.toString(paymentEffectiveD));
	}

	public String getPaymentTypeForTax() {
		return paymentTypeForTax;
	}

	public void setPaymentTypeForTax(String paymentTypeForTax) throws Exception {
		this.paymentTypeForTax = paymentTypeForTax;
		setValueFromAccessor("PAYMENT_TYPE_FOR_TAX", paymentTypeForTax);
	}

	public String getPayrollEventFinali() {
		return payrollEventFinali;
	}

	public void setPayrollEventFinali(String payrollEventFinali) throws Exception {
		this.payrollEventFinali = payrollEventFinali;
		setValueFromAccessor("PAYROLL_EVENT_FINALI", payrollEventFinali);
	}

	public String getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(String payrollId) throws Exception {
		this.payrollId = payrollId;
		setValueFromAccessor("PAYROLL_ID", payrollId);
	}

	public String getPayArrangeTerminationC() {
		return payArrangeTerminationC;
	}

	public void setPayArrangeTerminationC(String payArrangeTerminationC) throws Exception {
		this.payArrangeTerminationC = payArrangeTerminationC;
		setValueFromAccessor("PAY_ARRANGE_TERMINATION_C", payArrangeTerminationC);
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) throws Exception {
		this.postCode = postCode;
		setValueFromAccessor("POST_CODE", postCode);
	}

	public double getPtfrForeignWhA() {
		return ptfrForeignWhA;
	}

	public void setPtfrForeignWhA(double ptfrForeignWhA) throws Exception {
		this.ptfrForeignWhA = ptfrForeignWhA;
		setValueFromAccessor("PTFR_FOREIGN_WH_A", CommonUtil.toString(ptfrForeignWhA));
	}

	public double getPtfrGrossA() {
		return ptfrGrossA;
	}

	public void setPtfrGrossA(double ptfrGrossA) throws Exception {
		this.ptfrGrossA = ptfrGrossA;
		setValueFromAccessor("PTFR_GROSS_A", CommonUtil.toString(ptfrGrossA));
	}

	public double getPtfrTaxWh() {
		return ptfrTaxWh;
	}

	public void setPtfrTaxWh(double ptfrTaxWh) throws Exception {
		this.ptfrTaxWh = ptfrTaxWh;
		setValueFromAccessor("PTFR_TAX_WH", CommonUtil.toString(ptfrTaxWh));
	}

	public String getRtpPersonStatusC() {
		return rtpPersonStatusC;
	}

	public void setRtpPersonStatusC(String rtpPersonStatusC) throws Exception {
		this.rtpPersonStatusC = rtpPersonStatusC;
		setValueFromAccessor("RTP_PERSON_STATUS_C", rtpPersonStatusC);
	}

	public double getSbrpGrossA() {
		return sbrpGrossA;
	}

	public void setSbrpGrossA(double sbrpGrossA) throws Exception {
		this.sbrpGrossA = sbrpGrossA;
		setValueFromAccessor("SBRP_GROSS_A", CommonUtil.toString(sbrpGrossA));
	}

	public double getSbrpTaxWh() {
		return sbrpTaxWh;
	}

	public void setSbrpTaxWh(double sbrpTaxWh) throws Exception {
		this.sbrpTaxWh = sbrpTaxWh;
		setValueFromAccessor("SBRP_TAX_WH", CommonUtil.toString(sbrpTaxWh));
	}

	public String getSignatureD() {
		return signatureD;
	}

	public void setSignatureD(String signatureD) throws Exception {
		this.signatureD = signatureD;
		setValueFromAccessor("SIGNATURE_D", signatureD);
	}

	public String getStartD() {
		return startD;
	}

	public void setStartD(String startD) throws Exception {
		this.startD = startD;
		setValueFromAccessor("START_D", startD);
	}

	public String getStatementAcceptedI() {
		return statementAcceptedI;
	}

	public void setStatementAcceptedI(String statementAcceptedI) throws Exception {
		this.statementAcceptedI = statementAcceptedI;
		setValueFromAccessor("STATEMENT_ACCEPTED_I", statementAcceptedI);
	}

	public String getStateTerritory() {
		return stateTerritory;
	}

	public void setStateTerritory(String stateTerritory) throws Exception {
		this.stateTerritory = stateTerritory;
		setValueFromAccessor("STATE_TERRITORY", stateTerritory);
	}

	public double getSuperEmpTermTax() {
		return superEmpTermTax;
	}

	public void setSuperEmpTermTax(double superEmpTermTax) throws Exception {
		this.superEmpTermTax = superEmpTermTax;
		setValueFromAccessor("SUPER_EMP_TERM_TAX", CommonUtil.toString(superEmpTermTax));
	}

	public double getSuperTaxFreeComp() {
		return superTaxFreeComp;
	}

	public void setSuperTaxFreeComp(double superTaxFreeComp) throws Exception {
		this.superTaxFreeComp = superTaxFreeComp;
		setValueFromAccessor("SUPER_TAX_FREE_COMP", CommonUtil.toString(superTaxFreeComp));
	}

	public double getTaxIncomeFringeBenefits() {
		return taxIncomeFringeBenefits;
	}

	public void setTaxIncomeFringeBenefits(double taxIncomeFringeBenefits) throws Exception {
		this.taxIncomeFringeBenefits = taxIncomeFringeBenefits;
		setValueFromAccessor("TAX_INCOME_FRINGE_BENEFITS", CommonUtil.toString(taxIncomeFringeBenefits));
	}

	public String getTaxOffsetClaim() {
		return taxOffsetClaim;
	}

	public void setTaxOffsetClaim(String taxOffsetClaim) throws Exception {
		this.taxOffsetClaim = taxOffsetClaim;
		setValueFromAccessor("TAX_OFFSET_CLAIM", taxOffsetClaim);
	}

	public double getTaxWithehldA() {
		return taxWithehldA;
	}

	public void setTaxWithehldA(double taxWithehldA) throws Exception {
		this.taxWithehldA = taxWithehldA;
		setValueFromAccessor("TAX_WITHEHLD_A", CommonUtil.toString(taxWithehldA));
	}

	public String getTelephoneMinimal() {
		return telephoneMinimal;
	}

	public void setTelephoneMinimal(String telephoneMinimal) throws Exception {
		this.telephoneMinimal = telephoneMinimal;
		setValueFromAccessor("TELEPHONE_MINIMAL", telephoneMinimal);
	}

	public String getTfnId() {
		return tfnId;
	}

	public void setTfnId(String tfnId) throws Exception {
		this.tfnId = tfnId;
		setValueFromAccessor("TFN_ID", tfnId);
	}

	public double getVoluntaryGrossA() {
		return voluntaryGrossA;
	}

	public void setVoluntaryGrossA(double voluntaryGrossA) throws Exception {
		this.voluntaryGrossA = voluntaryGrossA;
		setValueFromAccessor("VOLUNTARY_GROSS_A", CommonUtil.toString(voluntaryGrossA));
	}

	public double getVoluntaryTaxWh() {
		return voluntaryTaxWh;
	}

	public void setVoluntaryTaxWh(double voluntaryTaxWh) throws Exception {
		this.voluntaryTaxWh = voluntaryTaxWh;
		setValueFromAccessor("VOLUNTARY_TAX_WH", CommonUtil.toString(voluntaryTaxWh));
	}

	public double getWhmGrossa() {
		return whmGrossa;
	}

	public void setWhmGrossa(double whmGrossa) throws Exception {
		this.whmGrossa = whmGrossa;
		setValueFromAccessor("WHM_GROSSA", CommonUtil.toString(whmGrossa));
	}

	public double getWhmTaxWha() {
		return whmTaxWha;
	}

	public void setWhmTaxWha(double whmTaxWha) throws Exception {
		this.whmTaxWha = whmTaxWha;
		setValueFromAccessor("WHM_TAX_WHA", CommonUtil.toString(whmTaxWha));
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

		str += "abnId : "+abnId+"\n";
		str += "allowanceTypeC : "+allowanceTypeC+"\n";
		str += "birthD : "+birthD+"\n";
		str += "birthM : "+birthM+"\n";
		str += "birthY : "+birthY+"\n";
		str += "businessGroupId : "+businessGroupId+"\n";
		str += "communityDevProja : "+communityDevProja+"\n";
		str += "countryC : "+countryC+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "deductionA : "+deductionA+"\n";
		str += "dedTypeC : "+dedTypeC+"\n";
		str += "electronicMail : "+electronicMail+"\n";
		str += "empContriSuperGurantee : "+empContriSuperGurantee+"\n";
		str += "empEndD : "+empEndD+"\n";
		str += "empReportableA : "+empReportableA+"\n";
		str += "empStartD : "+empStartD+"\n";
		str += "endD : "+endD+"\n";
		str += "etpTaxWhA : "+etpTaxWhA+"\n";
		str += "etpTypeC : "+etpTypeC+"\n";
		str += "exemptForeignInc : "+exemptForeignInc+"\n";
		str += "exemptIncomeFringeBenefits : "+exemptIncomeFringeBenefits+"\n";
		str += "familyName : "+familyName+"\n";
		str += "financialSuppScheme : "+financialSuppScheme+"\n";
		str += "givenName : "+givenName+"\n";
		str += "grossA : "+grossA+"\n";
		str += "indNonBusinessAllowancea : "+indNonBusinessAllowancea+"\n";
		str += "jdpaForeignWh : "+jdpaForeignWh+"\n";
		str += "jdpaGrossA : "+jdpaGrossA+"\n";
		str += "jdpaTaxWh : "+jdpaTaxWh+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "lhapGrossa : "+lhapGrossa+"\n";
		str += "lhapTaxWh : "+lhapTaxWh+"\n";
		str += "line1T : "+line1T+"\n";
		str += "line2T : "+line2T+"\n";
		str += "loanRepayI : "+loanRepayI+"\n";
		str += "localityName : "+localityName+"\n";
		str += "longServicePay : "+longServicePay+"\n";
		str += "lumpa : "+lumpa+"\n";
		str += "lumpAa : "+lumpAa+"\n";
		str += "lumpAc : "+lumpAc+"\n";
		str += "lumpBa : "+lumpBa+"\n";
		str += "lumpDa : "+lumpDa+"\n";
		str += "lumpEa : "+lumpEa+"\n";
		str += "ordinaryTimeEarnings : "+ordinaryTimeEarnings+"\n";
		str += "otherAllowancetypeDe : "+otherAllowancetypeDe+"\n";
		str += "otherGivenName : "+otherGivenName+"\n";
		str += "payarrangePaymentBasis : "+payarrangePaymentBasis+"\n";
		str += "payeeId : "+payeeId+"\n";
		str += "payerId : "+payerId+"\n";
		str += "paymentEffectiveD : "+paymentEffectiveD+"\n";
		str += "paymentTypeForTax : "+paymentTypeForTax+"\n";
		str += "payrollEventFinali : "+payrollEventFinali+"\n";
		str += "payrollId : "+payrollId+"\n";
		str += "payArrangeTerminationC : "+payArrangeTerminationC+"\n";
		str += "postCode : "+postCode+"\n";
		str += "ptfrForeignWhA : "+ptfrForeignWhA+"\n";
		str += "ptfrGrossA : "+ptfrGrossA+"\n";
		str += "ptfrTaxWh : "+ptfrTaxWh+"\n";
		str += "rtpPersonStatusC : "+rtpPersonStatusC+"\n";
		str += "sbrpGrossA : "+sbrpGrossA+"\n";
		str += "sbrpTaxWh : "+sbrpTaxWh+"\n";
		str += "signatureD : "+signatureD+"\n";
		str += "startD : "+startD+"\n";
		str += "statementAcceptedI : "+statementAcceptedI+"\n";
		str += "stateTerritory : "+stateTerritory+"\n";
		str += "superEmpTermTax : "+superEmpTermTax+"\n";
		str += "superTaxFreeComp : "+superTaxFreeComp+"\n";
		str += "taxIncomeFringeBenefits : "+taxIncomeFringeBenefits+"\n";
		str += "taxOffsetClaim : "+taxOffsetClaim+"\n";
		str += "taxWithehldA : "+taxWithehldA+"\n";
		str += "telephoneMinimal : "+telephoneMinimal+"\n";
		str += "tfnId : "+tfnId+"\n";
		str += "voluntaryGrossA : "+voluntaryGrossA+"\n";
		str += "voluntaryTaxWh : "+voluntaryTaxWh+"\n";
		str += "whmGrossa : "+whmGrossa+"\n";
		str += "whmTaxWha : "+whmTaxWha+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"abnId\" value=\""+abnId+"\">";
		str += "<column name=\"allowanceTypeC\" value=\""+allowanceTypeC+"\">";
		str += "<column name=\"birthD\" value=\""+birthD+"\">";
		str += "<column name=\"birthM\" value=\""+birthM+"\">";
		str += "<column name=\"birthY\" value=\""+birthY+"\">";
		str += "<column name=\"businessGroupId\" value=\""+businessGroupId+"\">";
		str += "<column name=\"communityDevProja\" value=\""+communityDevProja+"\">";
		str += "<column name=\"countryC\" value=\""+countryC+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"deductionA\" value=\""+deductionA+"\">";
		str += "<column name=\"dedTypeC\" value=\""+dedTypeC+"\">";
		str += "<column name=\"electronicMail\" value=\""+electronicMail+"\">";
		str += "<column name=\"empContriSuperGurantee\" value=\""+empContriSuperGurantee+"\">";
		str += "<column name=\"empEndD\" value=\""+empEndD+"\">";
		str += "<column name=\"empReportableA\" value=\""+empReportableA+"\">";
		str += "<column name=\"empStartD\" value=\""+empStartD+"\">";
		str += "<column name=\"endD\" value=\""+endD+"\">";
		str += "<column name=\"etpTaxWhA\" value=\""+etpTaxWhA+"\">";
		str += "<column name=\"etpTypeC\" value=\""+etpTypeC+"\">";
		str += "<column name=\"exemptForeignInc\" value=\""+exemptForeignInc+"\">";
		str += "<column name=\"exemptIncomeFringeBenefits\" value=\""+exemptIncomeFringeBenefits+"\">";
		str += "<column name=\"familyName\" value=\""+familyName+"\">";
		str += "<column name=\"financialSuppScheme\" value=\""+financialSuppScheme+"\">";
		str += "<column name=\"givenName\" value=\""+givenName+"\">";
		str += "<column name=\"grossA\" value=\""+grossA+"\">";
		str += "<column name=\"indNonBusinessAllowancea\" value=\""+indNonBusinessAllowancea+"\">";
		str += "<column name=\"jdpaForeignWh\" value=\""+jdpaForeignWh+"\">";
		str += "<column name=\"jdpaGrossA\" value=\""+jdpaGrossA+"\">";
		str += "<column name=\"jdpaTaxWh\" value=\""+jdpaTaxWh+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"lhapGrossa\" value=\""+lhapGrossa+"\">";
		str += "<column name=\"lhapTaxWh\" value=\""+lhapTaxWh+"\">";
		str += "<column name=\"line1T\" value=\""+line1T+"\">";
		str += "<column name=\"line2T\" value=\""+line2T+"\">";
		str += "<column name=\"loanRepayI\" value=\""+loanRepayI+"\">";
		str += "<column name=\"localityName\" value=\""+localityName+"\">";
		str += "<column name=\"longServicePay\" value=\""+longServicePay+"\">";
		str += "<column name=\"lumpa\" value=\""+lumpa+"\">";
		str += "<column name=\"lumpAa\" value=\""+lumpAa+"\">";
		str += "<column name=\"lumpAc\" value=\""+lumpAc+"\">";
		str += "<column name=\"lumpBa\" value=\""+lumpBa+"\">";
		str += "<column name=\"lumpDa\" value=\""+lumpDa+"\">";
		str += "<column name=\"lumpEa\" value=\""+lumpEa+"\">";
		str += "<column name=\"ordinaryTimeEarnings\" value=\""+ordinaryTimeEarnings+"\">";
		str += "<column name=\"otherAllowancetypeDe\" value=\""+otherAllowancetypeDe+"\">";
		str += "<column name=\"otherGivenName\" value=\""+otherGivenName+"\">";
		str += "<column name=\"payarrangePaymentBasis\" value=\""+payarrangePaymentBasis+"\">";
		str += "<column name=\"payeeId\" value=\""+payeeId+"\">";
		str += "<column name=\"payerId\" value=\""+payerId+"\">";
		str += "<column name=\"paymentEffectiveD\" value=\""+paymentEffectiveD+"\">";
		str += "<column name=\"paymentTypeForTax\" value=\""+paymentTypeForTax+"\">";
		str += "<column name=\"payrollEventFinali\" value=\""+payrollEventFinali+"\">";
		str += "<column name=\"payrollId\" value=\""+payrollId+"\">";
		str += "<column name=\"payArrangeTerminationC\" value=\""+payArrangeTerminationC+"\">";
		str += "<column name=\"postCode\" value=\""+postCode+"\">";
		str += "<column name=\"ptfrForeignWhA\" value=\""+ptfrForeignWhA+"\">";
		str += "<column name=\"ptfrGrossA\" value=\""+ptfrGrossA+"\">";
		str += "<column name=\"ptfrTaxWh\" value=\""+ptfrTaxWh+"\">";
		str += "<column name=\"rtpPersonStatusC\" value=\""+rtpPersonStatusC+"\">";
		str += "<column name=\"sbrpGrossA\" value=\""+sbrpGrossA+"\">";
		str += "<column name=\"sbrpTaxWh\" value=\""+sbrpTaxWh+"\">";
		str += "<column name=\"signatureD\" value=\""+signatureD+"\">";
		str += "<column name=\"startD\" value=\""+startD+"\">";
		str += "<column name=\"statementAcceptedI\" value=\""+statementAcceptedI+"\">";
		str += "<column name=\"stateTerritory\" value=\""+stateTerritory+"\">";
		str += "<column name=\"superEmpTermTax\" value=\""+superEmpTermTax+"\">";
		str += "<column name=\"superTaxFreeComp\" value=\""+superTaxFreeComp+"\">";
		str += "<column name=\"taxIncomeFringeBenefits\" value=\""+taxIncomeFringeBenefits+"\">";
		str += "<column name=\"taxOffsetClaim\" value=\""+taxOffsetClaim+"\">";
		str += "<column name=\"taxWithehldA\" value=\""+taxWithehldA+"\">";
		str += "<column name=\"telephoneMinimal\" value=\""+telephoneMinimal+"\">";
		str += "<column name=\"tfnId\" value=\""+tfnId+"\">";
		str += "<column name=\"voluntaryGrossA\" value=\""+voluntaryGrossA+"\">";
		str += "<column name=\"voluntaryTaxWh\" value=\""+voluntaryTaxWh+"\">";
		str += "<column name=\"whmGrossa\" value=\""+whmGrossa+"\">";
		str += "<column name=\"whmTaxWha\" value=\""+whmTaxWha+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"abnId\":\""+abnId+"\", ";
		str += "\"allowanceTypeC\":\""+allowanceTypeC+"\", ";
		str += "\"birthD\":\""+birthD+"\", ";
		str += "\"birthM\":\""+birthM+"\", ";
		str += "\"birthY\":\""+birthY+"\", ";
		str += "\"businessGroupId\":\""+businessGroupId+"\", ";
		str += "\"communityDevProja\":\""+communityDevProja+"\", ";
		str += "\"countryC\":\""+countryC+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"deductionA\":\""+deductionA+"\", ";
		str += "\"dedTypeC\":\""+dedTypeC+"\", ";
		str += "\"electronicMail\":\""+electronicMail+"\", ";
		str += "\"empContriSuperGurantee\":\""+empContriSuperGurantee+"\", ";
		str += "\"empEndD\":\""+empEndD+"\", ";
		str += "\"empReportableA\":\""+empReportableA+"\", ";
		str += "\"empStartD\":\""+empStartD+"\", ";
		str += "\"endD\":\""+endD+"\", ";
		str += "\"etpTaxWhA\":\""+etpTaxWhA+"\", ";
		str += "\"etpTypeC\":\""+etpTypeC+"\", ";
		str += "\"exemptForeignInc\":\""+exemptForeignInc+"\", ";
		str += "\"exemptIncomeFringeBenefits\":\""+exemptIncomeFringeBenefits+"\", ";
		str += "\"familyName\":\""+familyName+"\", ";
		str += "\"financialSuppScheme\":\""+financialSuppScheme+"\", ";
		str += "\"givenName\":\""+givenName+"\", ";
		str += "\"grossA\":\""+grossA+"\", ";
		str += "\"indNonBusinessAllowancea\":\""+indNonBusinessAllowancea+"\", ";
		str += "\"jdpaForeignWh\":\""+jdpaForeignWh+"\", ";
		str += "\"jdpaGrossA\":\""+jdpaGrossA+"\", ";
		str += "\"jdpaTaxWh\":\""+jdpaTaxWh+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"lhapGrossa\":\""+lhapGrossa+"\", ";
		str += "\"lhapTaxWh\":\""+lhapTaxWh+"\", ";
		str += "\"line1T\":\""+line1T+"\", ";
		str += "\"line2T\":\""+line2T+"\", ";
		str += "\"loanRepayI\":\""+loanRepayI+"\", ";
		str += "\"localityName\":\""+localityName+"\", ";
		str += "\"longServicePay\":\""+longServicePay+"\", ";
		str += "\"lumpa\":\""+lumpa+"\", ";
		str += "\"lumpAa\":\""+lumpAa+"\", ";
		str += "\"lumpAc\":\""+lumpAc+"\", ";
		str += "\"lumpBa\":\""+lumpBa+"\", ";
		str += "\"lumpDa\":\""+lumpDa+"\", ";
		str += "\"lumpEa\":\""+lumpEa+"\", ";
		str += "\"ordinaryTimeEarnings\":\""+ordinaryTimeEarnings+"\", ";
		str += "\"otherAllowancetypeDe\":\""+otherAllowancetypeDe+"\", ";
		str += "\"otherGivenName\":\""+otherGivenName+"\", ";
		str += "\"payarrangePaymentBasis\":\""+payarrangePaymentBasis+"\", ";
		str += "\"payeeId\":\""+payeeId+"\", ";
		str += "\"payerId\":\""+payerId+"\", ";
		str += "\"paymentEffectiveD\":\""+paymentEffectiveD+"\", ";
		str += "\"paymentTypeForTax\":\""+paymentTypeForTax+"\", ";
		str += "\"payrollEventFinali\":\""+payrollEventFinali+"\", ";
		str += "\"payrollId\":\""+payrollId+"\", ";
		str += "\"payArrangeTerminationC\":\""+payArrangeTerminationC+"\", ";
		str += "\"postCode\":\""+postCode+"\", ";
		str += "\"ptfrForeignWhA\":\""+ptfrForeignWhA+"\", ";
		str += "\"ptfrGrossA\":\""+ptfrGrossA+"\", ";
		str += "\"ptfrTaxWh\":\""+ptfrTaxWh+"\", ";
		str += "\"rtpPersonStatusC\":\""+rtpPersonStatusC+"\", ";
		str += "\"sbrpGrossA\":\""+sbrpGrossA+"\", ";
		str += "\"sbrpTaxWh\":\""+sbrpTaxWh+"\", ";
		str += "\"signatureD\":\""+signatureD+"\", ";
		str += "\"startD\":\""+startD+"\", ";
		str += "\"statementAcceptedI\":\""+statementAcceptedI+"\", ";
		str += "\"stateTerritory\":\""+stateTerritory+"\", ";
		str += "\"superEmpTermTax\":\""+superEmpTermTax+"\", ";
		str += "\"superTaxFreeComp\":\""+superTaxFreeComp+"\", ";
		str += "\"taxIncomeFringeBenefits\":\""+taxIncomeFringeBenefits+"\", ";
		str += "\"taxOffsetClaim\":\""+taxOffsetClaim+"\", ";
		str += "\"taxWithehldA\":\""+taxWithehldA+"\", ";
		str += "\"telephoneMinimal\":\""+telephoneMinimal+"\", ";
		str += "\"tfnId\":\""+tfnId+"\", ";
		str += "\"voluntaryGrossA\":\""+voluntaryGrossA+"\", ";
		str += "\"voluntaryTaxWh\":\""+voluntaryTaxWh+"\", ";
		str += "\"whmGrossa\":\""+whmGrossa+"\", ";
		str += "\"whmTaxWha\":\""+whmTaxWha+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}