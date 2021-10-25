/**************************************************************************************************
 * project
 * Description - Sys0406 - User
 *	- Generated by Source Generator
 *************************************************************************************************/
package project.app.sys.sys0406;

import zebra.data.ParamEntity;

public interface Sys0406Biz {
	public ParamEntity getDefault(ParamEntity paramEntity) throws Exception;
	public ParamEntity getList(ParamEntity paramEntity) throws Exception;
	public ParamEntity getDetail(ParamEntity paramEntity) throws Exception;
	public ParamEntity getInsert(ParamEntity paramEntity) throws Exception;
	public ParamEntity getUpdate(ParamEntity paramEntity) throws Exception;
	public ParamEntity getActionContextMenu(ParamEntity paramEntity) throws Exception;
	public ParamEntity exeInsert(ParamEntity paramEntity) throws Exception;
	public ParamEntity exeUpdate(ParamEntity paramEntity) throws Exception;
	public ParamEntity exeDelete(ParamEntity paramEntity) throws Exception;
	public ParamEntity exeActionContextMenu(ParamEntity paramEntity) throws Exception;
	public ParamEntity exeExport(ParamEntity paramEntity) throws Exception;
	public ParamEntity getAuthorityGroup(ParamEntity paramEntity) throws Exception;
	public ParamEntity hasAuthKey(ParamEntity paramEntity) throws Exception;
	public ParamEntity getAuthenticationSecretKey(ParamEntity paramEntity) throws Exception;
}