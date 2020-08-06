package project.common.schedule;

import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import project.common.module.commoncode.CommonCodeManager;
import project.conf.resource.ormapper.dao.SysBoard.SysBoardDao;
import project.conf.resource.ormapper.dto.oracle.SysBoard;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class BoardArticleCreationJob extends QuartzJobBean {
	private Logger logger = LogManager.getLogger(BoardArticleCreationJob.class);
	private SysBoardDao sysBoardDao;

	public void setSysBoardDao(SysBoardDao sysBoardDao) {
		this.sysBoardDao = sysBoardDao;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		addBoard(context);
	}

	@SuppressWarnings("rawtypes")
	private void addBoard(JobExecutionContext context) {
		String uid = CommonUtil.uid();
		String contents = "";

		try {
			SysBoard sysBoard = new SysBoard();

			contents += "BoardArticleCreationJob System generated article - "+CommonUtil.getSysdate("yyyy-MM-dd HH:mm:ss")+"\n";
			contents += "context.getFireInstanceId() : "+context.getFireInstanceId()+"\n";
			contents += "context.getJobRunTime() : "+CommonUtil.toString(context.getJobRunTime()/1000, "#,##0.00")+"\n";
			contents += "context.getRefireCount() : "+context.getRefireCount()+"\n";
			contents += "context.getFireTime() : "+CommonUtil.toString(context.getFireTime(), ConfigUtil.getProperty("format.dateTime.java"))+"\n";
			contents += "context.getPreviousFireTime() : "+CommonUtil.toString(context.getPreviousFireTime(), ConfigUtil.getProperty("format.dateTime.java"))+"\n";
			contents += "context.getNextFireTime() : "+CommonUtil.toString(context.getNextFireTime(), ConfigUtil.getProperty("format.dateTime.java"))+"\n";

			sysBoard.setArticleId(uid);
			if (CommonUtil.toInt(CommonUtil.substring(uid, uid.length()-3)) % 2 == 0) {
				sysBoard.setBoardType(CommonCodeManager.getCodeByConstants("BOARD_TYPE_NOTICE"));
			} else {
				JobDetail jobDetail = context.getJobDetail();
				JobDataMap jobDataMap = jobDetail.getJobDataMap();

				sysBoard.setBoardType(CommonCodeManager.getCodeByConstants("BOARD_TYPE_FREE"));

				contents += "jobDetail.getDescription() : "+jobDetail.getDescription()+"\n";
				for (Iterator keys = jobDataMap.keySet().iterator(); keys.hasNext();) {
					String key = (String)keys.next();
					contents += "jobDataMap("+key+") : "+jobDataMap.get(key)+"\n";
				}
			}
			sysBoard.setWriterId("0");
			sysBoard.setWriterName("BoardArticleCreationJob");
			sysBoard.setWriterEmail(ConfigUtil.getProperty("mail.default.from"));
			sysBoard.setWriterIpAddress("127.0.0.1");
			sysBoard.setArticleSubject("BoardArticleCreationJob System generated article - "+CommonUtil.getSysdate("yyyy-MM-dd HH:mm:ss"));
			sysBoard.setArticleContents(contents);
			sysBoard.setInsertUserId("0");
			sysBoard.setInsertDate(CommonUtil.toDate(CommonUtil.getSysdate()));
			sysBoard.setParentArticleId("-1");

			sysBoardDao.insert(sysBoard);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
	}
}