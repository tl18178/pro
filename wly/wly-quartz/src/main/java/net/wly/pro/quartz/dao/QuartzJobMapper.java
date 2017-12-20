package net.wly.pro.quartz.dao;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.quartz.entity.QuartzJobEntity;

/**
 * 定时任务
 *
 */
@MapperScan
public interface QuartzJobMapper extends BaseMapper<QuartzJobEntity> {

}
