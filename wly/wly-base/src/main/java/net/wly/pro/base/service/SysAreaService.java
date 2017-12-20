package net.wly.pro.base.service;

import java.util.List;
import java.util.Map;

import net.wly.pro.base.entity.SysAreaEntity;
import net.wly.pro.common.entity.R;

/**
 * 行政区域
 *
 */
public interface SysAreaService {

	List<SysAreaEntity> listAreaByParentCode(String areaCode);
	
	R listAreaByParentCode(Map<String, Object> params);
	
	R saveArea(SysAreaEntity area);
	
	R getAreaById(Long areaId);
	
	R updateArea(SysAreaEntity area);
	
	R batchRemoveArea(Long[] id);
	
}
