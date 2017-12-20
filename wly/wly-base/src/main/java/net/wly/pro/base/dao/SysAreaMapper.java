package net.wly.pro.base.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.base.entity.SysAreaEntity;
import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.common.entity.Query;

/**
 * 行政区域
 *
 */
@MapperScan
public interface SysAreaMapper extends BaseMapper<SysAreaEntity> {

	List<SysAreaEntity> listAreaByParentCode(Query query);

	int countAreaChildren(Long areaId);

}
