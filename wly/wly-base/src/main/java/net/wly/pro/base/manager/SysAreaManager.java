package net.wly.pro.base.manager;

import java.util.List;

import net.wly.pro.base.entity.SysAreaEntity;
import net.wly.pro.common.entity.Query;

/**
 * 行政区域
 *
 */
public interface SysAreaManager {

	List<SysAreaEntity> listAreaByParentCode(Query query);
	
	int saveArea(SysAreaEntity area);
	
	SysAreaEntity getAreaById(Long areaId);
	
	int updateArea(SysAreaEntity area);
	
	int batchRemoveArea(Long[] id);
	
	boolean hasChildren(Long[] id);
	
}
