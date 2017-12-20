package net.wly.pro.quartz.service;

import java.util.Map;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.R;
import net.wly.pro.quartz.entity.QuartzJobLogEntity;

/**
 * 定时任务日志
 *
 */
public interface QuartzJobLogService {

	Page<QuartzJobLogEntity> listForPage(Map<String, Object> params);
	
	R batchRemove(Long[] id);
	
	R batchRemoveAll();
	
}
