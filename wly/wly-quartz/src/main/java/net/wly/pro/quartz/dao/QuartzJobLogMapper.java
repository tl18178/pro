package net.wly.pro.quartz.dao;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.quartz.entity.QuartzJobLogEntity;

/**
 * 定时任务日志
 *
 */
@MapperScan
public interface QuartzJobLogMapper extends BaseMapper<QuartzJobLogEntity> {

	int batchRemoveAll();
	
}
