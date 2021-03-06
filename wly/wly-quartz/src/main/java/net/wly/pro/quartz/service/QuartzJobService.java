package net.wly.pro.quartz.service;

import java.util.Map;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.R;
import net.wly.pro.quartz.entity.QuartzJobEntity;

/**
 * 定时任务
 *
 */
public interface QuartzJobService {
	
	Page<QuartzJobEntity> list(Map<String, Object> params);
	
	R saveQuartzJob(QuartzJobEntity job);
	
	R getQuartzJobById(Long jobId);
	
	R updateQuartzJob(QuartzJobEntity job);
	
	R batchRemoveQuartzJob(Long[] id);
	
	R run(Long[] id);
	
	R pause(Long[] id);
	
	R resume(Long[] id);
	
}
