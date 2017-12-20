package net.wly.pro.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.shiro.entity.SysUserRoleEntity;

/**
 * 用户与角色关系
 *
 */
@MapperScan
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleEntity> {

	List<Long> listUserRoleId(Long userId);
	
	int batchRemoveByUserId(Long[] id);
	
	int batchRemoveByRoleId(Long[] id);
	
}
