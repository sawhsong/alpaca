/**************************************************************************************************
 * project
 * Description - Sys9898 - Monitor Databse Session
 *	- Generated by Source Generator
 *************************************************************************************************/
package project.app.sys.sys9898;

import zebra.data.ParamEntity;

public interface Sys9898Biz {
	public ParamEntity getDefault(ParamEntity paramEntity) throws Exception;
	public ParamEntity doSearch(ParamEntity paramEntity) throws Exception;
	public ParamEntity getSql(ParamEntity paramEntity) throws Exception;
	public ParamEntity getSqlText(ParamEntity paramEntity) throws Exception;
	public ParamEntity exeKillSessions(ParamEntity paramEntity) throws Exception;
}