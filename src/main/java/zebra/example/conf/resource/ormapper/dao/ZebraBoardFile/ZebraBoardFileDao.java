package zebra.example.conf.resource.ormapper.dao.ZebraBoardFile;

import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.example.conf.resource.ormapper.dto.oracle.ZebraBoard;
import zebra.example.conf.resource.ormapper.dto.oracle.ZebraBoardFile;

public interface ZebraBoardFileDao extends IDao {
	/**
	 * Insert new ZebraBoardFile record
	 * @param zebraBoard(ZebraBoard with all properties set)
	 * @param fileDataSet(RequestFileDataSet - generated by framework)
	 * @param isSaveFileFlag
	 * @return int
	 * @throws Exception
	 */
	public int insert(ZebraBoard zebraBoard, DataSet fileDataSet, String isSaveFileFlag) throws Exception;
	/**
	 * Update ZebraBoardFile record(Insert new file record and delete file records with fileIds)
	 * @param zebraBoard(ZebraBoard with all properties set)
	 * @param fileDataSet(RequestFileDataSet - generated by framework)
	 * @param isSaveFileFlag
	 * @param fileIds
	 * @return int
	 * @throws Exception
	 */
	public int update(ZebraBoard zebraBoard, DataSet fileDataSet, String isSaveFileFlag, String[] fileIds) throws Exception;
	/**
	 * Delete ZebraBoardFile record by FileId array
	 * @param fileIds
	 * @return int
	 * @throws Exception
	 */
	public int delete(String[] fileIds) throws Exception;
	/**
	 * Delete ZebraBoardFile record by a FileId
	 * @param fileId
	 * @return
	 * @throws Exception
	 */
	public int delete(String fileId) throws Exception;
	/**
	 * Delete ZebraBoardFile record by a ArticleId
	 * @param articleId
	 * @return int
	 * @throws Exception
	 */
	public int deleteByArticleId(String articleId) throws Exception;
	/**
	 * Get ZebraBoardFile list DataSet by ArticleId
	 * @param articleId
	 * @return DataSet
	 * @throws Exception
	 */
	public DataSet getBoardFileListDataSetByArticleId(String articleId) throws Exception;
	/**
	 * Get ZebraBoardFile by FileId
	 * @param fileId
	 * @return ZebraBoardFile
	 * @throws Exception
	 */
	public ZebraBoardFile getBoardFileById(String fileId) throws Exception;
}