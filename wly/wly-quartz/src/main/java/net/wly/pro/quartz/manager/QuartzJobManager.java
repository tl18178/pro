package net.wly.pro.quartz.manager;

import java.util.List;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.Query;
import net.wly.pro.quartz.entity.QuartzJobEntity;

/**
 * 定时任务
 *
 */
public interface QuartzJobManager {

	List<QuartzJobEntity> listForPage(Page<QuartzJobEntity> page, Query query);
	
	List<QuartzJobEntity> listNormalJob();
	
	int saveQuartzJob(QuartzJobEntity job);
	
	QuartzJobEntity getQuartzJobById(Long jobId);
	
	int updateQuartzJob(QuartzJobEntity job);
	
	int batchRemoveQuartzJob(Long[] id);
	
	int batchUpdate(Long[] jobId, Integer status);
	
}
