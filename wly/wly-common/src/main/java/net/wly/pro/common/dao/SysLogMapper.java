package net.wly.pro.common.dao;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.entity.SysLogEntity;

/**
 * 系统日志 
 *
 */
@MapperScan
public interface SysLogMapper extends BaseMapper<SysLogEntity> {

	int batchRemoveAll();
	
}
