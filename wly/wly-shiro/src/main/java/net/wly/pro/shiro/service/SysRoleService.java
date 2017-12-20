package net.wly.pro.shiro.service;

import java.util.Map;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.R;
import net.wly.pro.shiro.entity.SysRoleEntity;

/**
 * 系统角色
 *
 */
public interface SysRoleService {

	Page<SysRoleEntity> listRole(Map<String, Object> params);
	
	R saveRole(SysRoleEntity role);
	
	R getRoleById(Long id);
	
	R updateRole(SysRoleEntity role);
	
	R batchRemove(Long[] id);
	
	R listRole();
	
	R updateRoleOptAuthorization(SysRoleEntity role);
	
	R updateRoleDataAuthorization(SysRoleEntity role);
	
}
