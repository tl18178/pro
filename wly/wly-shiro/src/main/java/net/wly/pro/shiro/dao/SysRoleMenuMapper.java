package net.wly.pro.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.shiro.entity.SysRoleMenuEntity;

/**
 * 系统角色与菜单关系
 *
 */
@MapperScan
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenuEntity> {

	int batchRemoveByMenuId(Long[] id);
	
	int batchRemoveByRoleId(Long[] id);
	
	List<Long> listMenuId(Long id);
	
}
