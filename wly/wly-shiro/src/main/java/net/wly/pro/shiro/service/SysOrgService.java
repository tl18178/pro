package net.wly.pro.shiro.service;

import java.util.List;

import net.wly.pro.common.entity.R;
import net.wly.pro.shiro.entity.SysOrgEntity;

/**
 * 组织机构
 *
 */
public interface SysOrgService {

	List<SysOrgEntity> listOrg();
	
	List<SysOrgEntity> listOrgTree();
	
	R saveOrg(SysOrgEntity org);
	
	R getOrg(Long orgId);
	
	R updateOrg(SysOrgEntity org);
	
	R bactchRemoveOrg(Long[] id);
	
}
