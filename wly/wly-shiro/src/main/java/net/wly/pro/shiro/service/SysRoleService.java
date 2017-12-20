package net.wly.pro.shiro.service;

import java.util.Map;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.R;
import net.wly.pro.shiro.entity.SysRoleEntity;

/**
 * 系统角色
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月12日 上午12:40:42
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
