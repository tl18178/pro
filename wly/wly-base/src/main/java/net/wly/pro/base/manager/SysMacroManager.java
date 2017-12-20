package net.wly.pro.base.manager;

import java.util.List;

import net.wly.pro.base.entity.SysMacroEntity;

/**
 * 通用字典
 *
 */
public interface SysMacroManager {

	List<SysMacroEntity> listMacro();
	
	List<SysMacroEntity> listNotMacro();
	
	int saveMacro(SysMacroEntity macro);
	
	SysMacroEntity getObjectById(Long id);
	
	int updateMacro(SysMacroEntity macro);
	
	int batchRemove(Long[] id);
	
	boolean hasChildren(Long[] id);
	
}
