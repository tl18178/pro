package net.wly.pro.common.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.Query;
import net.wly.pro.common.entity.R;
import net.wly.pro.common.entity.SysLogEntity;
import net.wly.pro.common.manager.SysLogManager;
import net.wly.pro.common.service.SysLogService;
import net.wly.pro.common.utils.CommonUtils;

/**
 * 系统日志
 *
 */
@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {

	@Autowired
	private SysLogManager sysLogManager;
	
	@Override
	public Page<SysLogEntity> listLog(Map<String, Object> params) {
		Query query = new Query(params);
		Page<SysLogEntity> page = new Page<>(query);
		sysLogManager.listLog(page, query);
		return page;
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = sysLogManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

	@Override
	public R batchRemoveAll() {
		int count = sysLogManager.batchRemoveAll();
		return CommonUtils.msg(count);
	}

}
