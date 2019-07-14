/**************************************************************************************************
 * Framework Generated DTO Source
 * - ONLINE_WISI - 
 *************************************************************************************************/
package project.conf.resource.ormapper.dto.oracle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import zebra.data.DataSet;
import zebra.util.CommonUtil;
import project.common.extend.BaseDto;

@SuppressWarnings("unused")
public class OnlineWisi extends BaseDto implements Serializable {
	/**
	 * Columns
	 */
	private double wisiId;
	private String WISI_ID;
	private double createdBy;
	private String CREATED_BY;
	private Date creationDate;
	private String CREATION_DATE;
	private double lastUpdatedBy;
	private String LAST_UPDATED_BY;
	private Date lastUpdateDate;
	private String LAST_UPDATE_DATE;
	private double userTfId;
	private String USER_TF_ID;
	private String acceptance;
	private String ACCEPTANCE;
	private Date acceptanceDate;
	private String ACCEPTANCE_DATE;
	private String applianceSafety;
	private String APPLIANCE_SAFETY;
	private String electricalEquipments;
	private String ELECTRICAL_EQUIPMENTS;
	private String emergencyContacts;
	private String EMERGENCY_CONTACTS;
	private String evacuationProc;
	private String EVACUATION_PROC;
	private String fireExtinguisher;
	private String FIRE_EXTINGUISHER;
	private String firstAid;
	private String FIRST_AID;
	private String floorCoverings;
	private String FLOOR_COVERINGS;
	private String floorWalkways;
	private String FLOOR_WALKWAYS;
	private String furnitureCond;
	private String FURNITURE_COND;
	private String heatingCooling;
	private String HEATING_COOLING;
	private String hygienePrivacy;
	private String HYGIENE_PRIVACY;
	private String introManager;
	private String INTRO_MANAGER;
	private String kitchenMeals;
	private String KITCHEN_MEALS;
	private String lighting;
	private String LIGHTING;
	private String mobileId;
	private String MOBILE_ID;
	private String ohsConcerns;
	private String OHS_CONCERNS;
	private String ohsIncidentReport;
	private String OHS_INCIDENT_REPORT;
	private String ohsOwnSafety;
	private String OHS_OWN_SAFETY;
	private String ohsPolicies;
	private String OHS_POLICIES;
	private String ohsResponsibilities;
	private String OHS_RESPONSIBILITIES;
	private String permanentHazards;
	private String PERMANENT_HAZARDS;
	private String smokeDetector;
	private String SMOKE_DETECTOR;
	private String userIp;
	private String USER_IP;
	private String ventilation;
	private String VENTILATION;
	private String wfh;
	private String WFH;
	private String wfhCommMeans;
	private String WFH_COMM_MEANS;
	private String wfhLength;
	private String WFH_LENGTH;
	private String wfhMajority;
	private String WFH_MAJORITY;
	private String wfhSafety;
	private String WFH_SAFETY;
	private String workplaceAddress;
	private String WORKPLACE_ADDRESS;
	private String workplaceReporting;
	private String WORKPLACE_REPORTING;
	private String workspaceInduction;
	private String WORKSPACE_INDUCTION;
	private String workDuties;
	private String WORK_DUTIES;
	private String insertUserName;
	private String INSERT_USER_NAME;
	private String updateUserName;
	private String UPDATE_USER_NAME;

	/**
	 * Constructor
	 */
	@SuppressWarnings("rawtypes")
	public OnlineWisi() throws Exception {
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
		setFrwVarPrimaryKey("WISI_ID");
		setFrwVarDateColumn("CREATION_DATE,LAST_UPDATE_DATE,ACCEPTANCE_DATE");
		setFrwVarNumberColumn("WISI_ID,CREATED_BY,LAST_UPDATED_BY,USER_TF_ID");
		setFrwVarClobColumn("");
		setFrwVarDefaultColumn("");
		setFrwVarDefaultValue("");
		setDefaultValue();
	}

	/**
	 * Accessors
	 */
	public double getWisiId() {
		return wisiId;
	}

	public void setWisiId(double wisiId) throws Exception {
		this.wisiId = wisiId;
		setValueFromAccessor("WISI_ID", CommonUtil.toString(wisiId));
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

	public double getUserTfId() {
		return userTfId;
	}

	public void setUserTfId(double userTfId) throws Exception {
		this.userTfId = userTfId;
		setValueFromAccessor("USER_TF_ID", CommonUtil.toString(userTfId));
	}

	public String getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(String acceptance) throws Exception {
		this.acceptance = acceptance;
		setValueFromAccessor("ACCEPTANCE", acceptance);
	}

	public Date getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(Date acceptanceDate) throws Exception {
		this.acceptanceDate = acceptanceDate;
		setValueFromAccessor("ACCEPTANCE_DATE", CommonUtil.toString(acceptanceDate));
	}

	public String getApplianceSafety() {
		return applianceSafety;
	}

	public void setApplianceSafety(String applianceSafety) throws Exception {
		this.applianceSafety = applianceSafety;
		setValueFromAccessor("APPLIANCE_SAFETY", applianceSafety);
	}

	public String getElectricalEquipments() {
		return electricalEquipments;
	}

	public void setElectricalEquipments(String electricalEquipments) throws Exception {
		this.electricalEquipments = electricalEquipments;
		setValueFromAccessor("ELECTRICAL_EQUIPMENTS", electricalEquipments);
	}

	public String getEmergencyContacts() {
		return emergencyContacts;
	}

	public void setEmergencyContacts(String emergencyContacts) throws Exception {
		this.emergencyContacts = emergencyContacts;
		setValueFromAccessor("EMERGENCY_CONTACTS", emergencyContacts);
	}

	public String getEvacuationProc() {
		return evacuationProc;
	}

	public void setEvacuationProc(String evacuationProc) throws Exception {
		this.evacuationProc = evacuationProc;
		setValueFromAccessor("EVACUATION_PROC", evacuationProc);
	}

	public String getFireExtinguisher() {
		return fireExtinguisher;
	}

	public void setFireExtinguisher(String fireExtinguisher) throws Exception {
		this.fireExtinguisher = fireExtinguisher;
		setValueFromAccessor("FIRE_EXTINGUISHER", fireExtinguisher);
	}

	public String getFirstAid() {
		return firstAid;
	}

	public void setFirstAid(String firstAid) throws Exception {
		this.firstAid = firstAid;
		setValueFromAccessor("FIRST_AID", firstAid);
	}

	public String getFloorCoverings() {
		return floorCoverings;
	}

	public void setFloorCoverings(String floorCoverings) throws Exception {
		this.floorCoverings = floorCoverings;
		setValueFromAccessor("FLOOR_COVERINGS", floorCoverings);
	}

	public String getFloorWalkways() {
		return floorWalkways;
	}

	public void setFloorWalkways(String floorWalkways) throws Exception {
		this.floorWalkways = floorWalkways;
		setValueFromAccessor("FLOOR_WALKWAYS", floorWalkways);
	}

	public String getFurnitureCond() {
		return furnitureCond;
	}

	public void setFurnitureCond(String furnitureCond) throws Exception {
		this.furnitureCond = furnitureCond;
		setValueFromAccessor("FURNITURE_COND", furnitureCond);
	}

	public String getHeatingCooling() {
		return heatingCooling;
	}

	public void setHeatingCooling(String heatingCooling) throws Exception {
		this.heatingCooling = heatingCooling;
		setValueFromAccessor("HEATING_COOLING", heatingCooling);
	}

	public String getHygienePrivacy() {
		return hygienePrivacy;
	}

	public void setHygienePrivacy(String hygienePrivacy) throws Exception {
		this.hygienePrivacy = hygienePrivacy;
		setValueFromAccessor("HYGIENE_PRIVACY", hygienePrivacy);
	}

	public String getIntroManager() {
		return introManager;
	}

	public void setIntroManager(String introManager) throws Exception {
		this.introManager = introManager;
		setValueFromAccessor("INTRO_MANAGER", introManager);
	}

	public String getKitchenMeals() {
		return kitchenMeals;
	}

	public void setKitchenMeals(String kitchenMeals) throws Exception {
		this.kitchenMeals = kitchenMeals;
		setValueFromAccessor("KITCHEN_MEALS", kitchenMeals);
	}

	public String getLighting() {
		return lighting;
	}

	public void setLighting(String lighting) throws Exception {
		this.lighting = lighting;
		setValueFromAccessor("LIGHTING", lighting);
	}

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) throws Exception {
		this.mobileId = mobileId;
		setValueFromAccessor("MOBILE_ID", mobileId);
	}

	public String getOhsConcerns() {
		return ohsConcerns;
	}

	public void setOhsConcerns(String ohsConcerns) throws Exception {
		this.ohsConcerns = ohsConcerns;
		setValueFromAccessor("OHS_CONCERNS", ohsConcerns);
	}

	public String getOhsIncidentReport() {
		return ohsIncidentReport;
	}

	public void setOhsIncidentReport(String ohsIncidentReport) throws Exception {
		this.ohsIncidentReport = ohsIncidentReport;
		setValueFromAccessor("OHS_INCIDENT_REPORT", ohsIncidentReport);
	}

	public String getOhsOwnSafety() {
		return ohsOwnSafety;
	}

	public void setOhsOwnSafety(String ohsOwnSafety) throws Exception {
		this.ohsOwnSafety = ohsOwnSafety;
		setValueFromAccessor("OHS_OWN_SAFETY", ohsOwnSafety);
	}

	public String getOhsPolicies() {
		return ohsPolicies;
	}

	public void setOhsPolicies(String ohsPolicies) throws Exception {
		this.ohsPolicies = ohsPolicies;
		setValueFromAccessor("OHS_POLICIES", ohsPolicies);
	}

	public String getOhsResponsibilities() {
		return ohsResponsibilities;
	}

	public void setOhsResponsibilities(String ohsResponsibilities) throws Exception {
		this.ohsResponsibilities = ohsResponsibilities;
		setValueFromAccessor("OHS_RESPONSIBILITIES", ohsResponsibilities);
	}

	public String getPermanentHazards() {
		return permanentHazards;
	}

	public void setPermanentHazards(String permanentHazards) throws Exception {
		this.permanentHazards = permanentHazards;
		setValueFromAccessor("PERMANENT_HAZARDS", permanentHazards);
	}

	public String getSmokeDetector() {
		return smokeDetector;
	}

	public void setSmokeDetector(String smokeDetector) throws Exception {
		this.smokeDetector = smokeDetector;
		setValueFromAccessor("SMOKE_DETECTOR", smokeDetector);
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) throws Exception {
		this.userIp = userIp;
		setValueFromAccessor("USER_IP", userIp);
	}

	public String getVentilation() {
		return ventilation;
	}

	public void setVentilation(String ventilation) throws Exception {
		this.ventilation = ventilation;
		setValueFromAccessor("VENTILATION", ventilation);
	}

	public String getWfh() {
		return wfh;
	}

	public void setWfh(String wfh) throws Exception {
		this.wfh = wfh;
		setValueFromAccessor("WFH", wfh);
	}

	public String getWfhCommMeans() {
		return wfhCommMeans;
	}

	public void setWfhCommMeans(String wfhCommMeans) throws Exception {
		this.wfhCommMeans = wfhCommMeans;
		setValueFromAccessor("WFH_COMM_MEANS", wfhCommMeans);
	}

	public String getWfhLength() {
		return wfhLength;
	}

	public void setWfhLength(String wfhLength) throws Exception {
		this.wfhLength = wfhLength;
		setValueFromAccessor("WFH_LENGTH", wfhLength);
	}

	public String getWfhMajority() {
		return wfhMajority;
	}

	public void setWfhMajority(String wfhMajority) throws Exception {
		this.wfhMajority = wfhMajority;
		setValueFromAccessor("WFH_MAJORITY", wfhMajority);
	}

	public String getWfhSafety() {
		return wfhSafety;
	}

	public void setWfhSafety(String wfhSafety) throws Exception {
		this.wfhSafety = wfhSafety;
		setValueFromAccessor("WFH_SAFETY", wfhSafety);
	}

	public String getWorkplaceAddress() {
		return workplaceAddress;
	}

	public void setWorkplaceAddress(String workplaceAddress) throws Exception {
		this.workplaceAddress = workplaceAddress;
		setValueFromAccessor("WORKPLACE_ADDRESS", workplaceAddress);
	}

	public String getWorkplaceReporting() {
		return workplaceReporting;
	}

	public void setWorkplaceReporting(String workplaceReporting) throws Exception {
		this.workplaceReporting = workplaceReporting;
		setValueFromAccessor("WORKPLACE_REPORTING", workplaceReporting);
	}

	public String getWorkspaceInduction() {
		return workspaceInduction;
	}

	public void setWorkspaceInduction(String workspaceInduction) throws Exception {
		this.workspaceInduction = workspaceInduction;
		setValueFromAccessor("WORKSPACE_INDUCTION", workspaceInduction);
	}

	public String getWorkDuties() {
		return workDuties;
	}

	public void setWorkDuties(String workDuties) throws Exception {
		this.workDuties = workDuties;
		setValueFromAccessor("WORK_DUTIES", workDuties);
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

		str += "wisiId : "+wisiId+"\n";
		str += "createdBy : "+createdBy+"\n";
		str += "creationDate : "+creationDate+"\n";
		str += "lastUpdatedBy : "+lastUpdatedBy+"\n";
		str += "lastUpdateDate : "+lastUpdateDate+"\n";
		str += "userTfId : "+userTfId+"\n";
		str += "acceptance : "+acceptance+"\n";
		str += "acceptanceDate : "+acceptanceDate+"\n";
		str += "applianceSafety : "+applianceSafety+"\n";
		str += "electricalEquipments : "+electricalEquipments+"\n";
		str += "emergencyContacts : "+emergencyContacts+"\n";
		str += "evacuationProc : "+evacuationProc+"\n";
		str += "fireExtinguisher : "+fireExtinguisher+"\n";
		str += "firstAid : "+firstAid+"\n";
		str += "floorCoverings : "+floorCoverings+"\n";
		str += "floorWalkways : "+floorWalkways+"\n";
		str += "furnitureCond : "+furnitureCond+"\n";
		str += "heatingCooling : "+heatingCooling+"\n";
		str += "hygienePrivacy : "+hygienePrivacy+"\n";
		str += "introManager : "+introManager+"\n";
		str += "kitchenMeals : "+kitchenMeals+"\n";
		str += "lighting : "+lighting+"\n";
		str += "mobileId : "+mobileId+"\n";
		str += "ohsConcerns : "+ohsConcerns+"\n";
		str += "ohsIncidentReport : "+ohsIncidentReport+"\n";
		str += "ohsOwnSafety : "+ohsOwnSafety+"\n";
		str += "ohsPolicies : "+ohsPolicies+"\n";
		str += "ohsResponsibilities : "+ohsResponsibilities+"\n";
		str += "permanentHazards : "+permanentHazards+"\n";
		str += "smokeDetector : "+smokeDetector+"\n";
		str += "userIp : "+userIp+"\n";
		str += "ventilation : "+ventilation+"\n";
		str += "wfh : "+wfh+"\n";
		str += "wfhCommMeans : "+wfhCommMeans+"\n";
		str += "wfhLength : "+wfhLength+"\n";
		str += "wfhMajority : "+wfhMajority+"\n";
		str += "wfhSafety : "+wfhSafety+"\n";
		str += "workplaceAddress : "+workplaceAddress+"\n";
		str += "workplaceReporting : "+workplaceReporting+"\n";
		str += "workspaceInduction : "+workspaceInduction+"\n";
		str += "workDuties : "+workDuties+"\n";
		str += "insertUserName : "+insertUserName+"\n";
		str += "updateUserName : "+updateUserName+"\n";

		return str;
	}

	/**
	 * toXmlString
	 */
	public String toXmlString() {
		String str = "";

		str += "<column name=\"wisiId\" value=\""+wisiId+"\">";
		str += "<column name=\"createdBy\" value=\""+createdBy+"\">";
		str += "<column name=\"creationDate\" value=\""+creationDate+"\">";
		str += "<column name=\"lastUpdatedBy\" value=\""+lastUpdatedBy+"\">";
		str += "<column name=\"lastUpdateDate\" value=\""+lastUpdateDate+"\">";
		str += "<column name=\"userTfId\" value=\""+userTfId+"\">";
		str += "<column name=\"acceptance\" value=\""+acceptance+"\">";
		str += "<column name=\"acceptanceDate\" value=\""+acceptanceDate+"\">";
		str += "<column name=\"applianceSafety\" value=\""+applianceSafety+"\">";
		str += "<column name=\"electricalEquipments\" value=\""+electricalEquipments+"\">";
		str += "<column name=\"emergencyContacts\" value=\""+emergencyContacts+"\">";
		str += "<column name=\"evacuationProc\" value=\""+evacuationProc+"\">";
		str += "<column name=\"fireExtinguisher\" value=\""+fireExtinguisher+"\">";
		str += "<column name=\"firstAid\" value=\""+firstAid+"\">";
		str += "<column name=\"floorCoverings\" value=\""+floorCoverings+"\">";
		str += "<column name=\"floorWalkways\" value=\""+floorWalkways+"\">";
		str += "<column name=\"furnitureCond\" value=\""+furnitureCond+"\">";
		str += "<column name=\"heatingCooling\" value=\""+heatingCooling+"\">";
		str += "<column name=\"hygienePrivacy\" value=\""+hygienePrivacy+"\">";
		str += "<column name=\"introManager\" value=\""+introManager+"\">";
		str += "<column name=\"kitchenMeals\" value=\""+kitchenMeals+"\">";
		str += "<column name=\"lighting\" value=\""+lighting+"\">";
		str += "<column name=\"mobileId\" value=\""+mobileId+"\">";
		str += "<column name=\"ohsConcerns\" value=\""+ohsConcerns+"\">";
		str += "<column name=\"ohsIncidentReport\" value=\""+ohsIncidentReport+"\">";
		str += "<column name=\"ohsOwnSafety\" value=\""+ohsOwnSafety+"\">";
		str += "<column name=\"ohsPolicies\" value=\""+ohsPolicies+"\">";
		str += "<column name=\"ohsResponsibilities\" value=\""+ohsResponsibilities+"\">";
		str += "<column name=\"permanentHazards\" value=\""+permanentHazards+"\">";
		str += "<column name=\"smokeDetector\" value=\""+smokeDetector+"\">";
		str += "<column name=\"userIp\" value=\""+userIp+"\">";
		str += "<column name=\"ventilation\" value=\""+ventilation+"\">";
		str += "<column name=\"wfh\" value=\""+wfh+"\">";
		str += "<column name=\"wfhCommMeans\" value=\""+wfhCommMeans+"\">";
		str += "<column name=\"wfhLength\" value=\""+wfhLength+"\">";
		str += "<column name=\"wfhMajority\" value=\""+wfhMajority+"\">";
		str += "<column name=\"wfhSafety\" value=\""+wfhSafety+"\">";
		str += "<column name=\"workplaceAddress\" value=\""+workplaceAddress+"\">";
		str += "<column name=\"workplaceReporting\" value=\""+workplaceReporting+"\">";
		str += "<column name=\"workspaceInduction\" value=\""+workspaceInduction+"\">";
		str += "<column name=\"workDuties\" value=\""+workDuties+"\">";
		str += "<column name=\"insertUserName\" value=\""+insertUserName+"\">";
		str += "<column name=\"updateUserName\" value=\""+updateUserName+"\">";

		return str;
	}

	/**
	 * toJsonString
	 */
	public String toJsonString() {
		String str = "";

		str += "\"wisiId\":\""+wisiId+"\", ";
		str += "\"createdBy\":\""+createdBy+"\", ";
		str += "\"creationDate\":\""+creationDate+"\", ";
		str += "\"lastUpdatedBy\":\""+lastUpdatedBy+"\", ";
		str += "\"lastUpdateDate\":\""+lastUpdateDate+"\", ";
		str += "\"userTfId\":\""+userTfId+"\", ";
		str += "\"acceptance\":\""+acceptance+"\", ";
		str += "\"acceptanceDate\":\""+acceptanceDate+"\", ";
		str += "\"applianceSafety\":\""+applianceSafety+"\", ";
		str += "\"electricalEquipments\":\""+electricalEquipments+"\", ";
		str += "\"emergencyContacts\":\""+emergencyContacts+"\", ";
		str += "\"evacuationProc\":\""+evacuationProc+"\", ";
		str += "\"fireExtinguisher\":\""+fireExtinguisher+"\", ";
		str += "\"firstAid\":\""+firstAid+"\", ";
		str += "\"floorCoverings\":\""+floorCoverings+"\", ";
		str += "\"floorWalkways\":\""+floorWalkways+"\", ";
		str += "\"furnitureCond\":\""+furnitureCond+"\", ";
		str += "\"heatingCooling\":\""+heatingCooling+"\", ";
		str += "\"hygienePrivacy\":\""+hygienePrivacy+"\", ";
		str += "\"introManager\":\""+introManager+"\", ";
		str += "\"kitchenMeals\":\""+kitchenMeals+"\", ";
		str += "\"lighting\":\""+lighting+"\", ";
		str += "\"mobileId\":\""+mobileId+"\", ";
		str += "\"ohsConcerns\":\""+ohsConcerns+"\", ";
		str += "\"ohsIncidentReport\":\""+ohsIncidentReport+"\", ";
		str += "\"ohsOwnSafety\":\""+ohsOwnSafety+"\", ";
		str += "\"ohsPolicies\":\""+ohsPolicies+"\", ";
		str += "\"ohsResponsibilities\":\""+ohsResponsibilities+"\", ";
		str += "\"permanentHazards\":\""+permanentHazards+"\", ";
		str += "\"smokeDetector\":\""+smokeDetector+"\", ";
		str += "\"userIp\":\""+userIp+"\", ";
		str += "\"ventilation\":\""+ventilation+"\", ";
		str += "\"wfh\":\""+wfh+"\", ";
		str += "\"wfhCommMeans\":\""+wfhCommMeans+"\", ";
		str += "\"wfhLength\":\""+wfhLength+"\", ";
		str += "\"wfhMajority\":\""+wfhMajority+"\", ";
		str += "\"wfhSafety\":\""+wfhSafety+"\", ";
		str += "\"workplaceAddress\":\""+workplaceAddress+"\", ";
		str += "\"workplaceReporting\":\""+workplaceReporting+"\", ";
		str += "\"workspaceInduction\":\""+workspaceInduction+"\", ";
		str += "\"workDuties\":\""+workDuties+"\", ";
		str += "\"insertUserName\":\""+insertUserName+"\", ";
		str += "\"updateUserName\":\""+updateUserName+"\"";

		return str;
	}
}