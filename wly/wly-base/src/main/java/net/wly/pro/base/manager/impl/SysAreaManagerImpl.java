package net.wly.pro.base.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.wly.pro.base.dao.SysAreaMapper;
import net.wly.pro.base.entity.SysAreaEntity;
import net.wly.pro.base.manager.SysAreaManager;
import net.wly.pro.common.entity.Query;
import net.wly.pro.common.utils.CommonUtils;

/**
 * 行政区域
 *
 */
@Component("sysAreaManager")
public class SysAreaManagerImpl implements SysAreaManager {

	@Autowired
	private SysAreaMapper sysAreaMapper;
	
	@Override
	public List<SysAreaEntity> listAreaByParentCode(Query query) {
		return sysAreaMapper.listAreaByParentCode(query);
	}

	@Override
	public int saveArea(SysAreaEntity area) {
		return sysAreaMapper.save(area);
	}

	@Override
	public SysAreaEntity getAreaById(Long areaId) {
		return sysAreaMapper.getObjectById(areaId);
	}

	@Override
	public int updateArea(SysAreaEntity area) {
		return sysAreaMapper.update(area);
	}

	@Override
	public int batchRemoveArea(Long[] id) {
		return sysAreaMapper.batchRemove(id);
	}

	@Override
	public boolean hasChildren(Long[] id) {
		for(Long typeId : id) {
			int count = sysAreaMapper.countAreaChildren(typeId);
			if(CommonUtils.isIntThanZero(count)) {
				return true;
			}
		}
		return false;
	}
	
}
