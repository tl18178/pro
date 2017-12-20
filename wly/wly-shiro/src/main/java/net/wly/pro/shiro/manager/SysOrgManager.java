package net.wly.pro.shiro.manager;

import java.util.List;

import net.wly.pro.shiro.entity.SysOrgEntity;

/**
 * 组织机构
 *
 */
public interface SysOrgManager {

	List<SysOrgEntity> listOrg();
	
	int saveOrg(SysOrgEntity org);
	
	SysOrgEntity getOrg(Long orgId);
	
	int updateOrg(SysOrgEntity org);
	
	int bactchRemoveOrg(Long[] id);
	
	boolean hasChildren(Long[] id);
	
}
