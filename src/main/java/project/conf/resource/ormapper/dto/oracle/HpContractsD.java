/**************************************************************************************************
 * Framework Generated DTO Source
 * - HP_CONTRACTS_D - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class HpContractsD extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private String clientCompany;
	private String CLIENT_COMPANY;
	private String contractActive;
	private String CONTRACT_ACTIVE;
	private double contractId;
	private String CONTRACT_ID;
	private String contractSigned;
	private String CONTRACT_SIGNED;
	private String contractType;
	private String CONTRACT_TYPE;
	private String contractVerified;
	private String CONTRACT_VERIFIED;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private Date curAgreementEndDate;
	private String CUR_AGREEMENT_END_DATE;
	private Date curAgreementStartDate;
	private String CUR_AGREEMENT_START_DATE;
	private String directorGurantee;
	private String DIRECTOR_GURANTEE;
	private String eboInvoicing;
	private String EBO_INVOICING;
	private String empEngagementType;
	private String EMP_ENGAGEMENT_TYPE;
	private String engagingEntity;
	private String ENGAGING_ENTITY;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private String lateFee;
	private String LATE_FEE;
	private String margin;
	private String MARGIN;
	private double organisationId;
	private String ORGANISATION_ID;
	private Date orgAgreementDate;
	private String ORG_AGREEMENT_DATE;
	private String paymentTerms;
	private String PAYMENT_TERMS;
	private String payrollFinance;
	private String PAYROLL_FINANCE;
	private String remarks;
	private String REMARKS;
	private String serviceType;
	private String SERVICE_TYPE;
	private String stateOfJurisdiction;
	private String STATE_OF_JURISDICTION;
	private String terminationNotice;
	private String TERMINATION_NOTICE;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public HpContractsD() throws Exception {
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
		setFrwVarDateColumn("CREATION_DATE,CUR_AGREEMENT_END_DATE,CUR_AGREEMENT_START_DATE,LAST_UPDATE_DATE,ORG_AGREEMENT_DATE");
		setFrwVarNumberColumn("CONTRACT_ID,CREATED_BY,LAST_UPDATED_BY,ORGANISATION_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public String getClientCompany() {
		return clientCompany;
	}

	public void setClientCompany(String clientCompany) throws Exception {
		this.clientCompany = clientCompany;
		setValueFromAccessor("CLIENT_COMPANY", clientCompany);
	}

	public String getContractActive() {
		return contractActive;
	}

	public void setContractActive(String contractActive) throws Exception {
		this.contractActive = contractActive;
		setValueFromAccessor("CONTRACT_ACTIVE", contractActive);
	}

	public double getContractId() {
		return contractId;
	}

	public void setContractId(double contractId) throws Exception {
		this.contractId = contractId;
		setValueFromAccessor("CONTRACT_ID", CommonUtil.toString(contractId));
	}

	public String getContractSigned() {
		return contractSigned;
	}

	public void setContractSigned(String contractSigned) throws Exception {
		this.contractSigned = contractSigned;
		setValueFromAccessor("CONTRACT_SIGNED", contractSigned);
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) throws Exception {
		this.contractType = contractType;
		setValueFromAccessor("CONTRACT_TYPE", contractType);
	}

	public String getContractVerified() {
		return contractVerified;
	}

	public void setContractVerified(String contractVerified) throws Exception {
		this.contractVerified = contractVerified;
		setValueFromAccessor("CONTRACT_VERIFIED", contractVerified);
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

	public Date getCurAgreementEndDate() {
		return curAgreementEndDate;
	}

	public void setCurAgreementEndDate(Date curAgreementEndDate) throws Exception {
		this.curAgreementEndDate = curAgreementEndDate;
		setValueFromAccessor("CUR_AGREEMENT_END_DATE", CommonUtil.toString(curAgreementEndDate));
	}

	public Date getCurAgreementStartDate() {
		return curAgreementStartDate;
	}

	public void setCurAgreementStartDate(Date curAgreementStartDate) throws Exception {
		this.curAgreementStartDate = curAgreementStartDate;
		setValueFromAccessor("CUR_AGREEMENT_START_DATE", CommonUtil.toString(curAgreementStartDate));
	}

	public String getDirectorGurantee() {
		return directorGurantee;
	}

	public void setDirectorGurantee(String directorGurantee) throws Exception {
		this.directorGurantee = directorGurantee;
		setValueFromAccessor("DIRECTOR_GURANTEE", directorGurantee);
	}

	public String getEboInvoicing() {
		return eboInvoicing;
	}

	public void setEboInvoicing(String eboInvoicing) throws Exception {
		this.eboInvoicing = eboInvoicing;
		setValueFromAccessor("EBO_INVOICING", eboInvoicing);
	}

	public String getEmpEngagementType() {
		return empEngagementType;
	}

	public void setEmpEngagementType(String empEngagementType) throws Exception {
		this.empEngagementType = empEngagementType;
		setValueFromAccessor("EMP_ENGAGEMENT_TYPE", empEngagementType);
	}

	public String getEngagingEntity() {
		return engagingEntity;
	}

	public void setEngagingEntity(String engagingEntity) throws Exception {
		this.engagingEntity = engagingEntity;
		setValueFromAccessor("ENGAGING_ENTITY", engagingEntity);
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

	public String getLateFee() {
		return lateFee;
	}

	public void setLateFee(String lateFee) throws Exception {
		this.lateFee = lateFee;
		setValueFromAccessor("LATE_FEE", lateFee);
	}

	public String getMargin() {
		return margin;
	}

	public void setMargin(String margin) throws Exception {
		this.margin = margin;
		setValueFromAccessor("MARGIN", margin);
	}

	public double getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(double organisationId) throws Exception {
		this.organisationId = organisationId;
		setValueFromAccessor("ORGANISATION_ID", CommonUtil.toString(organisationId));
	}

	public Date getOrgAgreementDate() {
		return orgAgreementDate;
	}

	public void setOrgAgreementDate(Date orgAgreementDate) throws Exception {
		this.orgAgreementDate = orgAgreementDate;
		setValueFromAccessor("ORG_AGREEMENT_DATE", CommonUtil.toString(orgAgreementDate));
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) throws Exception {
		this.paymentTerms = paymentTerms;
		setValueFromAccessor("PAYMENT_TERMS", paymentTerms);
	}

	public String getPayrollFinance() {
		return payrollFinance;
	}

	public void setPayrollFinance(String payrollFinance) throws Exception {
		this.payrollFinance = payrollFinance;
		setValueFromAccessor("PAYROLL_FINANCE", payrollFinance);
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) throws Exception {
		this.remarks = remarks;
		setValueFromAccessor("REMARKS", remarks);
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) throws Exception {
		this.serviceType = serviceType;
		setValueFromAccessor("SERVICE_TYPE", serviceType);
	}

	public String getStateOfJurisdiction() {
		return stateOfJurisdiction;
	}

	public void setStateOfJurisdiction(String stateOfJurisdiction) throws Exception {
		this.stateOfJurisdiction = stateOfJurisdiction;
		setValueFromAccessor("STATE_OF_JURISDICTION", stateOfJurisdiction);
	}

	public String getTerminationNotice() {
		return terminationNotice;
	}

	public void setTerminationNotice(String terminationNotice) throws Exception {
		this.terminationNotice = terminationNotice;
		setValueFromAccessor("TERMINATION_NOTICE", terminationNotice);
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

		str += "clientCompany : "+clientCompany+"\n";
		str += "contractActive : "+contractActive+"\n";
		str += "contractId : "+contractId+"\n";
		str += "contractSigned : "+contractSigned+"\n";
		str += "contractType : "+contractType+"\n";
		str += "contractVerified : "+contractVerified+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "curAgreementEndDate : "+curAgreementEndDate+"\n";
		str += "curAgreementStartDate : "+curAgreementStartDate+"\n";
		str += "directorGurantee : "+directorGurantee+"\n";
		str += "eboInvoicing : "+eboInvoicing+"\n";
		str += "empEngagementType : "+empEngagementType+"\n";
		str += "engagingEntity : "+engagingEntity+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "lateFee : "+lateFee+"\n";
		str += "margin : "+margin+"\n";
		str += "organisationId : "+organisationId+"\n";
		str += "orgAgreementDate : "+orgAgreementDate+"\n";
		str += "paymentTerms : "+paymentTerms+"\n";
		str += "payrollFinance : "+payrollFinance+"\n";
		str += "remarks : "+remarks+"\n";
		str += "serviceType : "+serviceType+"\n";
		str += "stateOfJurisdiction : "+stateOfJurisdiction+"\n";
		str += "terminationNotice : "+terminationNotice+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"clientCompany\" value=\""+clientCompany+"\">";
		str += "<column name=\"contractActive\" value=\""+contractActive+"\">";
		str += "<column name=\"contractId\" value=\""+contractId+"\">";
		str += "<column name=\"contractSigned\" value=\""+contractSigned+"\">";
		str += "<column name=\"contractType\" value=\""+contractType+"\">";
		str += "<column name=\"contractVerified\" value=\""+contractVerified+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"curAgreementEndDate\" value=\""+curAgreementEndDate+"\">";
		str += "<column name=\"curAgreementStartDate\" value=\""+curAgreementStartDate+"\">";
		str += "<column name=\"directorGurantee\" value=\""+directorGurantee+"\">";
		str += "<column name=\"eboInvoicing\" value=\""+eboInvoicing+"\">";
		str += "<column name=\"empEngagementType\" value=\""+empEngagementType+"\">";
		str += "<column name=\"engagingEntity\" value=\""+engagingEntity+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"lateFee\" value=\""+lateFee+"\">";
		str += "<column name=\"margin\" value=\""+margin+"\">";
		str += "<column name=\"organisationId\" value=\""+organisationId+"\">";
		str += "<column name=\"orgAgreementDate\" value=\""+orgAgreementDate+"\">";
		str += "<column name=\"paymentTerms\" value=\""+paymentTerms+"\">";
		str += "<column name=\"payrollFinance\" value=\""+payrollFinance+"\">";
		str += "<column name=\"remarks\" value=\""+remarks+"\">";
		str += "<column name=\"serviceType\" value=\""+serviceType+"\">";
		str += "<column name=\"stateOfJurisdiction\" value=\""+stateOfJurisdiction+"\">";
		str += "<column name=\"terminationNotice\" value=\""+terminationNotice+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"clientCompany\":\""+clientCompany+"\", ";
		str += "\"contractActive\":\""+contractActive+"\", ";
		str += "\"contractId\":\""+contractId+"\", ";
		str += "\"contractSigned\":\""+contractSigned+"\", ";
		str += "\"contractType\":\""+contractType+"\", ";
		str += "\"contractVerified\":\""+contractVerified+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"curAgreementEndDate\":\""+curAgreementEndDate+"\", ";
		str += "\"curAgreementStartDate\":\""+curAgreementStartDate+"\", ";
		str += "\"directorGurantee\":\""+directorGurantee+"\", ";
		str += "\"eboInvoicing\":\""+eboInvoicing+"\", ";
		str += "\"empEngagementType\":\""+empEngagementType+"\", ";
		str += "\"engagingEntity\":\""+engagingEntity+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"lateFee\":\""+lateFee+"\", ";
		str += "\"margin\":\""+margin+"\", ";
		str += "\"organisationId\":\""+organisationId+"\", ";
		str += "\"orgAgreementDate\":\""+orgAgreementDate+"\", ";
		str += "\"paymentTerms\":\""+paymentTerms+"\", ";
		str += "\"payrollFinance\":\""+payrollFinance+"\", ";
		str += "\"remarks\":\""+remarks+"\", ";
		str += "\"serviceType\":\""+serviceType+"\", ";
		str += "\"stateOfJurisdiction\":\""+stateOfJurisdiction+"\", ";
		str += "\"terminationNotice\":\""+terminationNotice+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}