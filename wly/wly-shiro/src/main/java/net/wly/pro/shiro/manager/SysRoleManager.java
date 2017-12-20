package net.wly.pro.shiro.manager;

import java.util.List;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.Query;
import net.wly.pro.shiro.entity.SysRoleEntity;

/**
 * 系统角色
 *
 */
public interface SysRoleManager {

	List<SysRoleEntity> listRole(Page<SysRoleEntity> page, Query search);
	
	int saveRole(SysRoleEntity role);
	
	SysRoleEntity getRoleById(Long id);
	
	int updateRole(SysRoleEntity role);
	
	int batchRemove(Long[] id);
	
	List<SysRoleEntity> listRole();
	
	int updateRoleOptAuthorization(SysRoleEntity role);
	
	int updateRoleDataAuthorization(SysRoleEntity role);
	
}
