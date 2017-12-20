package net.wly.pro.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.shiro.entity.SysRoleEntity;

/**
 * 系统角色
 *
 */
@MapperScan
public interface SysRoleMapper extends BaseMapper<SysRoleEntity> {
	
	List<String> listUserRoles(Long userId);
	
}
