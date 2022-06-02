package project.conf.resource.ormapper.dao.SysUser;

import project.conf.resource.ormapper.dto.oracle.SysUser;
import zebra.base.Dto;
import zebra.base.IDao;
import zebra.data.DataSet;
import zebra.data.ParamEntity;
import zebra.data.QueryAdvisor;

public interface SysUserDao extends IDao {
	/**
	 * Insert new user record
	 */
	public int insert(Dto dto) throws Exception;
	/**
	 * Update SysUser
	 */
	public int update(String userId, Dto dto) throws Exception;
	/**
	 * Reset SysUser Password
	 */
	public int resetPassword(String userId) throws Exception;
	/**
	 * Encrypt Password by UserId
	 */
	public int encryptPassword(String userId) throws Exception;
	/**
	 * Update AuthGroupId column only by AuthGroupIds array to given code
	 */
	public int updateAuthGroupIdByAuthGroupIds(String authGroupIds[], String toCode) throws Exception;
	/**
	 * Update AuthGroupId column only by AuthGroupIds array to given code
	 */
	public int updateAuthGroupIdByAuthGroupId(String authGroupId, String toCode) throws Exception;
	/**
	 * Update SysUser by UserIds array by a given SysUser object
	 */
	public int updateByUserIds(String userIds[], SysUser sysUser) throws Exception;
	/**
	 * Delete SysUser record by Id array
	 */
	public int delete(String[] userIds) throws Exception;
	/**
	 * Delete SysUser record by Id
	 */
	public int delete(String userId) throws Exception;
	/**
	 * Get SysUser list DataSet with a given LoginId only
	 */
	public DataSet getUserInfoDataSetByLoginId(String loginId) throws Exception;
	/**
	 * Get SysUser list DataSet with a given LoginId and Email
	 */
	public DataSet getUserInfoDataSetByLoginIdAndEmail(String loginId, String email) throws Exception;
	/**
	 * Get SysUser list DataSet by Search Criteria in QueryAdvisor
	 */
	public DataSet getUserDataSetBySearchCriteria(QueryAdvisor queryAdvisor) throws Exception;
	/**
	 * Get User Name Column only by the condition in QueryAdvisor - for AutoCompletion
	 */
	public DataSet getUserNameDataSetForAutoCompletion(QueryAdvisor queryAdvisor) throws Exception;
	/**
	 * Initialise passsword for the user
	 */
	public int initialisePassword(ParamEntity paramEntity, Dto dto) throws Exception;
	/**
	 * Get SysUser object with a given LoginId
	 */
	public SysUser getUserByLoginId(String loginId) throws Exception;
	/**
	 * Get SysUser object with a given UserId
	 */
	public SysUser getUserByUserId(String userId) throws Exception;
	/**
	 * Get SysUser object with given LoginId and Password - Normal login process
	 */
	public SysUser getUserByLoginIdAndPassword(String loginId, String password) throws Exception;
}