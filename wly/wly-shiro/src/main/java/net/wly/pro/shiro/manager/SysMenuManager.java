package net.wly.pro.shiro.manager;

import java.util.List;

import net.wly.pro.common.entity.Query;
import net.wly.pro.shiro.entity.SysMenuEntity;

/**
 * 系统菜单
 *
 */
public interface SysMenuManager {
	
	List<SysMenuEntity> listUserMenu(Long userId);
	
	List<SysMenuEntity> listParentId(Long parentId, List<Long> menuIdList);
	
	List<SysMenuEntity> listMenu(Query search);
	
	List<SysMenuEntity> listNotButton();
	
	int saveMenu(SysMenuEntity menu);

	SysMenuEntity getMenuById(Long id);
	
	int updateMenu(SysMenuEntity menu);
	
	int batchRemove(Long[] id);
	
	boolean hasChildren(Long[] id);
	
}
