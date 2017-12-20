package net.wly.pro.base.service;

import java.util.List;

import net.wly.pro.base.entity.SysMacroEntity;
import net.wly.pro.common.entity.R;

/**
 * 通用字典
 *
 */
public interface SysMacroService {

	List<SysMacroEntity> listMacro();
	
	List<SysMacroEntity> listNotMacro();
	
	R saveMacro(SysMacroEntity macro);
	
	R getObjectById(Long id);
	
	R updateMacro(SysMacroEntity macro);
	
	R batchRemove(Long[] id);
	
}
