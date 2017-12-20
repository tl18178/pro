package net.wly.pro.shiro.dao;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.shiro.entity.SysOrgEntity;

/**
 * 组织架构
 *
 */
@MapperScan
public interface SysOrgMapper extends BaseMapper<SysOrgEntity> {

	int countOrgChildren(Long parentId);
	
}
