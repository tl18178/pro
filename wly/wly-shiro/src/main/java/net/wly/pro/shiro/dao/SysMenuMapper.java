package net.wly.pro.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.shiro.entity.SysMenuEntity;

/**
 * 系统菜单dao
 *
 */
@MapperScan
public interface SysMenuMapper extends BaseMapper<SysMenuEntity> {
	
	List<SysMenuEntity> listParentId(Long parentId);
	
	List<SysMenuEntity> listNotButton();
	
	List<String> listUserPerms(Long userId);
	
	int countMenuChildren(Long parentId);

}
