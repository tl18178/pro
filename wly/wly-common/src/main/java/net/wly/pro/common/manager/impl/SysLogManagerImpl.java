package net.wly.pro.common.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.wly.pro.common.dao.SysLogMapper;
import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.Query;
import net.wly.pro.common.entity.SysLogEntity;
import net.wly.pro.common.manager.SysLogManager;

/**
 * 系统日志
 *
 */
@Component("sysLogManager")
public class SysLogManagerImpl implements SysLogManager {

	@Autowired
	private SysLogMapper sysLogMapper;
	
	@Override
	public void saveLog(SysLogEntity log) {
		sysLogMapper.save(log);
	}

	@Override
	public List<SysLogEntity> listLog(Page<SysLogEntity> page, Query query) {
		return sysLogMapper.listForPage(page, query);
	}

	@Override
	public int batchRemove(Long[] id) {
		return sysLogMapper.batchRemove(id);
	}

	@Override
	public int batchRemoveAll() {
		return sysLogMapper.batchRemoveAll();
	}

}
