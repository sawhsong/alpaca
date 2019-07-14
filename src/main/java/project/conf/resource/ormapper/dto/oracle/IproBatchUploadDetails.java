/**************************************************************************************************
 * Framework Generated DTO Source
 * - IPRO_BATCH_UPLOAD_DETAILS - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class IproBatchUploadDetails extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double detailsId;
	private String DETAILS_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double headerId;
	private String HEADER_ID;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdatedDate;
	private String LAST_UPDATED_DATE;
	private String address;
	private String ADDRESS;
	private String award;
	private String AWARD;
	private String awardApplicable;
	private String AWARD_APPLICABLE;
	private String awardClass;
	private String AWARD_CLASS;
	private String clientName;
	private String CLIENT_NAME;
	private String clientRelevantInfo;
	private String CLIENT_RELEVANT_INFO;
	private String comments;
	private String COMMENTS;
	private String contractEndDate;
	private String CONTRACT_END_DATE;
	private String contractStartDate;
	private String CONTRACT_START_DATE;
	private Date dob;
	private String DOB;
	private String email;
	private String EMAIL;
	private String enduserRelevantInfo;
	private String ENDUSER_RELEVANT_INFO;
	private String endCustomerName;
	private String END_CUSTOMER_NAME;
	private String firstName;
	private String FIRST_NAME;
	private String ignored;
	private String IGNORED;
	private String invSpecInf;
	private String INV_SPEC_INF;
	private String mgtFee;
	private String MGT_FEE;
	private String overseasTravel;
	private String OVERSEAS_TRAVEL;
	private String payrollTax;
	private String PAYROLL_TAX;
	private String pdfRecord;
	private String PDF_RECORD;
	private double personNumber;
	private String PERSON_NUMBER;
	private String personType;
	private String PERSON_TYPE;
	private String phone;
	private String PHONE;
	private String phoneMobile;
	private String PHONE_MOBILE;
	private String positionTitle;
	private String POSITION_TITLE;
	private String postcode;
	private String POSTCODE;
	private String rateIncSuper;
	private String RATE_INC_SUPER;
	private String rateUnit;
	private String RATE_UNIT;
	private String repEmail;
	private String REP_EMAIL;
	private String repMgrName;
	private String REP_MGR_NAME;
	private String repMgrPhone;
	private String REP_MGR_PHONE;
	private String secEmail;
	private String SEC_EMAIL;
	private String secMgrName;
	private String SEC_MGR_NAME;
	private String secMgrPhone;
	private String SEC_MGR_PHONE;
	private String state;
	private String STATE;
	private String suburb;
	private String SUBURB;
	private String surname;
	private String SURNAME;
	private String terminationNotice;
	private String TERMINATION_NOTICE;
	private String totalBillable;
	private String TOTAL_BILLABLE;
	private String transformed;
	private String TRANSFORMED;
	private String wicCode;
	private String WIC_CODE;
	private String wicIndRate;
	private String WIC_IND_RATE;
	private String workCover;
	private String WORK_COVER;
	private String workEnd;
	private String WORK_END;
	private String workPostcode;
	private String WORK_POSTCODE;
	private String workStart;
	private String WORK_START;
	private String workState;
	private String WORK_STATE;
	private String workStAddress;
	private String WORK_ST_ADDRESS;
	private String workSuburb;
	private String WORK_SUBURB;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public IproBatchUploadDetails() throws Exception {
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
		setFrwVarPrimaryKey("DETAILS_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATED_DATE,DOB");
		setFrwVarNumberColumn("DETAILS_ID,CREATED_BY,HEADER_ID,LAST_UPDATED_BY,PERSON_NUMBER");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(double detailsId) throws Exception {
		this.detailsId = detailsId;
		setValueFromAccessor("DETAILS_ID", CommonUtil.toString(detailsId));
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

	public double getHeaderId() {
		return headerId;
	}

	public void setHeaderId(double headerId) throws Exception {
		this.headerId = headerId;
		setValueFromAccessor("HEADER_ID", CommonUtil.toString(headerId));
	}

	public double getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(double lastUpdatedBy) throws Exception {
		this.lastUpdatedBy = lastUpdatedBy;
		setValueFromAccessor("LAST_UPDATED_BY", CommonUtil.toString(lastUpdatedBy));
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) throws Exception {
		this.lastUpdatedDate = lastUpdatedDate;
		setValueFromAccessor("LAST_UPDATED_DATE", CommonUtil.toString(lastUpdatedDate));
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws Exception {
		this.address = address;
		setValueFromAccessor("ADDRESS", address);
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) throws Exception {
		this.award = award;
		setValueFromAccessor("AWARD", award);
	}

	public String getAwardApplicable() {
		return awardApplicable;
	}

	public void setAwardApplicable(String awardApplicable) throws Exception {
		this.awardApplicable = awardApplicable;
		setValueFromAccessor("AWARD_APPLICABLE", awardApplicable);
	}

	public String getAwardClass() {
		return awardClass;
	}

	public void setAwardClass(String awardClass) throws Exception {
		this.awardClass = awardClass;
		setValueFromAccessor("AWARD_CLASS", awardClass);
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) throws Exception {
		this.clientName = clientName;
		setValueFromAccessor("CLIENT_NAME", clientName);
	}

	public String getClientRelevantInfo() {
		return clientRelevantInfo;
	}

	public void setClientRelevantInfo(String clientRelevantInfo) throws Exception {
		this.clientRelevantInfo = clientRelevantInfo;
		setValueFromAccessor("CLIENT_RELEVANT_INFO", clientRelevantInfo);
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) throws Exception {
		this.comments = comments;
		setValueFromAccessor("COMMENTS", comments);
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) throws Exception {
		this.contractEndDate = contractEndDate;
		setValueFromAccessor("CONTRACT_END_DATE", contractEndDate);
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) throws Exception {
		this.contractStartDate = contractStartDate;
		setValueFromAccessor("CONTRACT_START_DATE", contractStartDate);
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) throws Exception {
		this.dob = dob;
		setValueFromAccessor("DOB", CommonUtil.toString(dob));
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		this.email = email;
		setValueFromAccessor("EMAIL", email);
	}

	public String getEnduserRelevantInfo() {
		return enduserRelevantInfo;
	}

	public void setEnduserRelevantInfo(String enduserRelevantInfo) throws Exception {
		this.enduserRelevantInfo = enduserRelevantInfo;
		setValueFromAccessor("ENDUSER_RELEVANT_INFO", enduserRelevantInfo);
	}

	public String getEndCustomerName() {
		return endCustomerName;
	}

	public void setEndCustomerName(String endCustomerName) throws Exception {
		this.endCustomerName = endCustomerName;
		setValueFromAccessor("END_CUSTOMER_NAME", endCustomerName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		this.firstName = firstName;
		setValueFromAccessor("FIRST_NAME", firstName);
	}

	public String getIgnored() {
		return ignored;
	}

	public void setIgnored(String ignored) throws Exception {
		this.ignored = ignored;
		setValueFromAccessor("IGNORED", ignored);
	}

	public String getInvSpecInf() {
		return invSpecInf;
	}

	public void setInvSpecInf(String invSpecInf) throws Exception {
		this.invSpecInf = invSpecInf;
		setValueFromAccessor("INV_SPEC_INF", invSpecInf);
	}

	public String getMgtFee() {
		return mgtFee;
	}

	public void setMgtFee(String mgtFee) throws Exception {
		this.mgtFee = mgtFee;
		setValueFromAccessor("MGT_FEE", mgtFee);
	}

	public String getOverseasTravel() {
		return overseasTravel;
	}

	public void setOverseasTravel(String overseasTravel) throws Exception {
		this.overseasTravel = overseasTravel;
		setValueFromAccessor("OVERSEAS_TRAVEL", overseasTravel);
	}

	public String getPayrollTax() {
		return payrollTax;
	}

	public void setPayrollTax(String payrollTax) throws Exception {
		this.payrollTax = payrollTax;
		setValueFromAccessor("PAYROLL_TAX", payrollTax);
	}

	public String getPdfRecord() {
		return pdfRecord;
	}

	public void setPdfRecord(String pdfRecord) throws Exception {
		this.pdfRecord = pdfRecord;
		setValueFromAccessor("PDF_RECORD", pdfRecord);
	}

	public double getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(double personNumber) throws Exception {
		this.personNumber = personNumber;
		setValueFromAccessor("PERSON_NUMBER", CommonUtil.toString(personNumber));
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) throws Exception {
		this.personType = personType;
		setValueFromAccessor("PERSON_TYPE", personType);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws Exception {
		this.phone = phone;
		setValueFromAccessor("PHONE", phone);
	}

	public String getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(String phoneMobile) throws Exception {
		this.phoneMobile = phoneMobile;
		setValueFromAccessor("PHONE_MOBILE", phoneMobile);
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) throws Exception {
		this.positionTitle = positionTitle;
		setValueFromAccessor("POSITION_TITLE", positionTitle);
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) throws Exception {
		this.postcode = postcode;
		setValueFromAccessor("POSTCODE", postcode);
	}

	public String getRateIncSuper() {
		return rateIncSuper;
	}

	public void setRateIncSuper(String rateIncSuper) throws Exception {
		this.rateIncSuper = rateIncSuper;
		setValueFromAccessor("RATE_INC_SUPER", rateIncSuper);
	}

	public String getRateUnit() {
		return rateUnit;
	}

	public void setRateUnit(String rateUnit) throws Exception {
		this.rateUnit = rateUnit;
		setValueFromAccessor("RATE_UNIT", rateUnit);
	}

	public String getRepEmail() {
		return repEmail;
	}

	public void setRepEmail(String repEmail) throws Exception {
		this.repEmail = repEmail;
		setValueFromAccessor("REP_EMAIL", repEmail);
	}

	public String getRepMgrName() {
		return repMgrName;
	}

	public void setRepMgrName(String repMgrName) throws Exception {
		this.repMgrName = repMgrName;
		setValueFromAccessor("REP_MGR_NAME", repMgrName);
	}

	public String getRepMgrPhone() {
		return repMgrPhone;
	}

	public void setRepMgrPhone(String repMgrPhone) throws Exception {
		this.repMgrPhone = repMgrPhone;
		setValueFromAccessor("REP_MGR_PHONE", repMgrPhone);
	}

	public String getSecEmail() {
		return secEmail;
	}

	public void setSecEmail(String secEmail) throws Exception {
		this.secEmail = secEmail;
		setValueFromAccessor("SEC_EMAIL", secEmail);
	}

	public String getSecMgrName() {
		return secMgrName;
	}

	public void setSecMgrName(String secMgrName) throws Exception {
		this.secMgrName = secMgrName;
		setValueFromAccessor("SEC_MGR_NAME", secMgrName);
	}

	public String getSecMgrPhone() {
		return secMgrPhone;
	}

	public void setSecMgrPhone(String secMgrPhone) throws Exception {
		this.secMgrPhone = secMgrPhone;
		setValueFromAccessor("SEC_MGR_PHONE", secMgrPhone);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) throws Exception {
		this.state = state;
		setValueFromAccessor("STATE", state);
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) throws Exception {
		this.suburb = suburb;
		setValueFromAccessor("SUBURB", suburb);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		this.surname = surname;
		setValueFromAccessor("SURNAME", surname);
	}

	public String getTerminationNotice() {
		return terminationNotice;
	}

	public void setTerminationNotice(String terminationNotice) throws Exception {
		this.terminationNotice = terminationNotice;
		setValueFromAccessor("TERMINATION_NOTICE", terminationNotice);
	}

	public String getTotalBillable() {
		return totalBillable;
	}

	public void setTotalBillable(String totalBillable) throws Exception {
		this.totalBillable = totalBillable;
		setValueFromAccessor("TOTAL_BILLABLE", totalBillable);
	}

	public String getTransformed() {
		return transformed;
	}

	public void setTransformed(String transformed) throws Exception {
		this.transformed = transformed;
		setValueFromAccessor("TRANSFORMED", transformed);
	}

	public String getWicCode() {
		return wicCode;
	}

	public void setWicCode(String wicCode) throws Exception {
		this.wicCode = wicCode;
		setValueFromAccessor("WIC_CODE", wicCode);
	}

	public String getWicIndRate() {
		return wicIndRate;
	}

	public void setWicIndRate(String wicIndRate) throws Exception {
		this.wicIndRate = wicIndRate;
		setValueFromAccessor("WIC_IND_RATE", wicIndRate);
	}

	public String getWorkCover() {
		return workCover;
	}

	public void setWorkCover(String workCover) throws Exception {
		this.workCover = workCover;
		setValueFromAccessor("WORK_COVER", workCover);
	}

	public String getWorkEnd() {
		return workEnd;
	}

	public void setWorkEnd(String workEnd) throws Exception {
		this.workEnd = workEnd;
		setValueFromAccessor("WORK_END", workEnd);
	}

	public String getWorkPostcode() {
		return workPostcode;
	}

	public void setWorkPostcode(String workPostcode) throws Exception {
		this.workPostcode = workPostcode;
		setValueFromAccessor("WORK_POSTCODE", workPostcode);
	}

	public String getWorkStart() {
		return workStart;
	}

	public void setWorkStart(String workStart) throws Exception {
		this.workStart = workStart;
		setValueFromAccessor("WORK_START", workStart);
	}

	public String getWorkState() {
		return workState;
	}

	public void setWorkState(String workState) throws Exception {
		this.workState = workState;
		setValueFromAccessor("WORK_STATE", workState);
	}

	public String getWorkStAddress() {
		return workStAddress;
	}

	public void setWorkStAddress(String workStAddress) throws Exception {
		this.workStAddress = workStAddress;
		setValueFromAccessor("WORK_ST_ADDRESS", workStAddress);
	}

	public String getWorkSuburb() {
		return workSuburb;
	}

	public void setWorkSuburb(String workSuburb) throws Exception {
		this.workSuburb = workSuburb;
		setValueFromAccessor("WORK_SUBURB", workSuburb);
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

		str += "detailsId : "+detailsId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "headerId : "+headerId+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdatedDate : "+lastUpdatedDate+"\n";
		str += "address : "+address+"\n";
		str += "award : "+award+"\n";
		str += "awardApplicable : "+awardApplicable+"\n";
		str += "awardClass : "+awardClass+"\n";
		str += "clientName : "+clientName+"\n";
		str += "clientRelevantInfo : "+clientRelevantInfo+"\n";
		str += "comments : "+comments+"\n";
		str += "contractEndDate : "+contractEndDate+"\n";
		str += "contractStartDate : "+contractStartDate+"\n";
		str += "dob : "+dob+"\n";
		str += "email : "+email+"\n";
		str += "enduserRelevantInfo : "+enduserRelevantInfo+"\n";
		str += "endCustomerName : "+endCustomerName+"\n";
		str += "firstName : "+firstName+"\n";
		str += "ignored : "+ignored+"\n";
		str += "invSpecInf : "+invSpecInf+"\n";
		str += "mgtFee : "+mgtFee+"\n";
		str += "overseasTravel : "+overseasTravel+"\n";
		str += "payrollTax : "+payrollTax+"\n";
		str += "pdfRecord : "+pdfRecord+"\n";
		str += "personNumber : "+personNumber+"\n";
		str += "personType : "+personType+"\n";
		str += "phone : "+phone+"\n";
		str += "phoneMobile : "+phoneMobile+"\n";
		str += "positionTitle : "+positionTitle+"\n";
		str += "postcode : "+postcode+"\n";
		str += "rateIncSuper : "+rateIncSuper+"\n";
		str += "rateUnit : "+rateUnit+"\n";
		str += "repEmail : "+repEmail+"\n";
		str += "repMgrName : "+repMgrName+"\n";
		str += "repMgrPhone : "+repMgrPhone+"\n";
		str += "secEmail : "+secEmail+"\n";
		str += "secMgrName : "+secMgrName+"\n";
		str += "secMgrPhone : "+secMgrPhone+"\n";
		str += "state : "+state+"\n";
		str += "suburb : "+suburb+"\n";
		str += "surname : "+surname+"\n";
		str += "terminationNotice : "+terminationNotice+"\n";
		str += "totalBillable : "+totalBillable+"\n";
		str += "transformed : "+transformed+"\n";
		str += "wicCode : "+wicCode+"\n";
		str += "wicIndRate : "+wicIndRate+"\n";
		str += "workCover : "+workCover+"\n";
		str += "workEnd : "+workEnd+"\n";
		str += "workPostcode : "+workPostcode+"\n";
		str += "workStart : "+workStart+"\n";
		str += "workState : "+workState+"\n";
		str += "workStAddress : "+workStAddress+"\n";
		str += "workSuburb : "+workSuburb+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"detailsId\" value=\""+detailsId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"headerId\" value=\""+headerId+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdatedDate\" value=\""+lastUpdatedDate+"\">";
		str += "<column name=\"address\" value=\""+address+"\">";
		str += "<column name=\"award\" value=\""+award+"\">";
		str += "<column name=\"awardApplicable\" value=\""+awardApplicable+"\">";
		str += "<column name=\"awardClass\" value=\""+awardClass+"\">";
		str += "<column name=\"clientName\" value=\""+clientName+"\">";
		str += "<column name=\"clientRelevantInfo\" value=\""+clientRelevantInfo+"\">";
		str += "<column name=\"comments\" value=\""+comments+"\">";
		str += "<column name=\"contractEndDate\" value=\""+contractEndDate+"\">";
		str += "<column name=\"contractStartDate\" value=\""+contractStartDate+"\">";
		str += "<column name=\"dob\" value=\""+dob+"\">";
		str += "<column name=\"email\" value=\""+email+"\">";
		str += "<column name=\"enduserRelevantInfo\" value=\""+enduserRelevantInfo+"\">";
		str += "<column name=\"endCustomerName\" value=\""+endCustomerName+"\">";
		str += "<column name=\"firstName\" value=\""+firstName+"\">";
		str += "<column name=\"ignored\" value=\""+ignored+"\">";
		str += "<column name=\"invSpecInf\" value=\""+invSpecInf+"\">";
		str += "<column name=\"mgtFee\" value=\""+mgtFee+"\">";
		str += "<column name=\"overseasTravel\" value=\""+overseasTravel+"\">";
		str += "<column name=\"payrollTax\" value=\""+payrollTax+"\">";
		str += "<column name=\"pdfRecord\" value=\""+pdfRecord+"\">";
		str += "<column name=\"personNumber\" value=\""+personNumber+"\">";
		str += "<column name=\"personType\" value=\""+personType+"\">";
		str += "<column name=\"phone\" value=\""+phone+"\">";
		str += "<column name=\"phoneMobile\" value=\""+phoneMobile+"\">";
		str += "<column name=\"positionTitle\" value=\""+positionTitle+"\">";
		str += "<column name=\"postcode\" value=\""+postcode+"\">";
		str += "<column name=\"rateIncSuper\" value=\""+rateIncSuper+"\">";
		str += "<column name=\"rateUnit\" value=\""+rateUnit+"\">";
		str += "<column name=\"repEmail\" value=\""+repEmail+"\">";
		str += "<column name=\"repMgrName\" value=\""+repMgrName+"\">";
		str += "<column name=\"repMgrPhone\" value=\""+repMgrPhone+"\">";
		str += "<column name=\"secEmail\" value=\""+secEmail+"\">";
		str += "<column name=\"secMgrName\" value=\""+secMgrName+"\">";
		str += "<column name=\"secMgrPhone\" value=\""+secMgrPhone+"\">";
		str += "<column name=\"state\" value=\""+state+"\">";
		str += "<column name=\"suburb\" value=\""+suburb+"\">";
		str += "<column name=\"surname\" value=\""+surname+"\">";
		str += "<column name=\"terminationNotice\" value=\""+terminationNotice+"\">";
		str += "<column name=\"totalBillable\" value=\""+totalBillable+"\">";
		str += "<column name=\"transformed\" value=\""+transformed+"\">";
		str += "<column name=\"wicCode\" value=\""+wicCode+"\">";
		str += "<column name=\"wicIndRate\" value=\""+wicIndRate+"\">";
		str += "<column name=\"workCover\" value=\""+workCover+"\">";
		str += "<column name=\"workEnd\" value=\""+workEnd+"\">";
		str += "<column name=\"workPostcode\" value=\""+workPostcode+"\">";
		str += "<column name=\"workStart\" value=\""+workStart+"\">";
		str += "<column name=\"workState\" value=\""+workState+"\">";
		str += "<column name=\"workStAddress\" value=\""+workStAddress+"\">";
		str += "<column name=\"workSuburb\" value=\""+workSuburb+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"detailsId\":\""+detailsId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"headerId\":\""+headerId+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdatedDate\":\""+lastUpdatedDate+"\", ";
		str += "\"address\":\""+address+"\", ";
		str += "\"award\":\""+award+"\", ";
		str += "\"awardApplicable\":\""+awardApplicable+"\", ";
		str += "\"awardClass\":\""+awardClass+"\", ";
		str += "\"clientName\":\""+clientName+"\", ";
		str += "\"clientRelevantInfo\":\""+clientRelevantInfo+"\", ";
		str += "\"comments\":\""+comments+"\", ";
		str += "\"contractEndDate\":\""+contractEndDate+"\", ";
		str += "\"contractStartDate\":\""+contractStartDate+"\", ";
		str += "\"dob\":\""+dob+"\", ";
		str += "\"email\":\""+email+"\", ";
		str += "\"enduserRelevantInfo\":\""+enduserRelevantInfo+"\", ";
		str += "\"endCustomerName\":\""+endCustomerName+"\", ";
		str += "\"firstName\":\""+firstName+"\", ";
		str += "\"ignored\":\""+ignored+"\", ";
		str += "\"invSpecInf\":\""+invSpecInf+"\", ";
		str += "\"mgtFee\":\""+mgtFee+"\", ";
		str += "\"overseasTravel\":\""+overseasTravel+"\", ";
		str += "\"payrollTax\":\""+payrollTax+"\", ";
		str += "\"pdfRecord\":\""+pdfRecord+"\", ";
		str += "\"personNumber\":\""+personNumber+"\", ";
		str += "\"personType\":\""+personType+"\", ";
		str += "\"phone\":\""+phone+"\", ";
		str += "\"phoneMobile\":\""+phoneMobile+"\", ";
		str += "\"positionTitle\":\""+positionTitle+"\", ";
		str += "\"postcode\":\""+postcode+"\", ";
		str += "\"rateIncSuper\":\""+rateIncSuper+"\", ";
		str += "\"rateUnit\":\""+rateUnit+"\", ";
		str += "\"repEmail\":\""+repEmail+"\", ";
		str += "\"repMgrName\":\""+repMgrName+"\", ";
		str += "\"repMgrPhone\":\""+repMgrPhone+"\", ";
		str += "\"secEmail\":\""+secEmail+"\", ";
		str += "\"secMgrName\":\""+secMgrName+"\", ";
		str += "\"secMgrPhone\":\""+secMgrPhone+"\", ";
		str += "\"state\":\""+state+"\", ";
		str += "\"suburb\":\""+suburb+"\", ";
		str += "\"surname\":\""+surname+"\", ";
		str += "\"terminationNotice\":\""+terminationNotice+"\", ";
		str += "\"totalBillable\":\""+totalBillable+"\", ";
		str += "\"transformed\":\""+transformed+"\", ";
		str += "\"wicCode\":\""+wicCode+"\", ";
		str += "\"wicIndRate\":\""+wicIndRate+"\", ";
		str += "\"workCover\":\""+workCover+"\", ";
		str += "\"workEnd\":\""+workEnd+"\", ";
		str += "\"workPostcode\":\""+workPostcode+"\", ";
		str += "\"workStart\":\""+workStart+"\", ";
		str += "\"workState\":\""+workState+"\", ";
		str += "\"workStAddress\":\""+workStAddress+"\", ";
		str += "\"workSuburb\":\""+workSuburb+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}