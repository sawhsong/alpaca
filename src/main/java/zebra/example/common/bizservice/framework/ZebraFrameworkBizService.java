package zebra.example.common.bizservice.framework;

import zebra.data.DataSet;

public interface ZebraFrameworkBizService {
	/*!
	 * DTO Generator
	 */
	public boolean generateDto(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateHibernateDtoConfig(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateMybatisDtoMapper(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateMybatisDtoMapperXml(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateDao(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateHDaoImpl(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateDaoImpl(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateDaoMapper(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateDaoSpringConfig(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateHibernateQuery(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public boolean generateMybatisQuery(String systemType, DataSet requestDataSet, DataSet tableInfoDataSet) throws Exception;
	public void deleteDto(String dtoName) throws Exception;
	public void deleteHibernateDtoConfig(String dtoName) throws Exception;
	public void deleteMybatisDtoMapper(String dtoName) throws Exception;
	public void deleteMybatisDtoMapperXml(String dtoName) throws Exception;
	public void deleteDao(String dtoName) throws Exception;
	public void deleteHDaoImpl(String dtoName) throws Exception;
	public void deleteDaoImpl(String dtoName) throws Exception;
	public void deleteDaoMapper(String dtoName) throws Exception;
	public void deleteDaoPackage(String dtoName) throws Exception;
	public void deleteHibernateQuery(String dtoName) throws Exception;
	public void deleteMybatisQuery(String dtoName) throws Exception;
	public void deleteDaoSpringConfig(String dtoName) throws Exception;

	/*!
	 * Source Generator
	 */
	public boolean createJavaAction(DataSet requestDataSet) throws Exception;
	public boolean createJavaBiz(DataSet requestDataSet) throws Exception;
	public boolean createJavaBizImpl(DataSet requestDataSet) throws Exception;
	public boolean createJspList(DataSet requestDataSet) throws Exception;
	public boolean createJspDetail(DataSet requestDataSet) throws Exception;
	public boolean createJspEdit(DataSet requestDataSet) throws Exception;
	public boolean createJspInsert(DataSet requestDataSet) throws Exception;
	public boolean createJspUpdate(DataSet requestDataSet) throws Exception;
	public boolean createConfSpring(DataSet requestDataSet) throws Exception;
	public boolean createConfStruts(DataSet requestDataSet) throws Exception;
	public boolean createMessageFile(DataSet requestDataSet) throws Exception;

	/*!
	 * Table Creation Script
	 */
	public DataSet getScriptFileDataSet(DataSet requestDataSet) throws Exception;
	public DataSet getScriptFileDetailDataSet(String fileName) throws Exception;
	public int generateScriptFile(DataSet requestDataSet, DataSet tableDetailDataSet) throws Exception;
	public int updateScriptFile(DataSet requestDataSet, DataSet tableDetailDataSet) throws Exception;
	public int deleteTableCreationScriptFile(String fileName) throws Exception;
	public int deleteTableCreationScriptFiles(String fileNames[]) throws Exception;

	/*!
	 * Data Migration
	 */
	public int generateDDLScriptFileForDataMigration(String sourceDb, String targetDb, String tableName) throws Exception;
	public int createTableForDataMigration(String sourceDb, String targetDb, String tableName) throws Exception;
	public int insertDataForDataMigration(String sourceDb, String targetDb, String tableName) throws Exception;

	/*!
	 * Common for this service
	 */
}