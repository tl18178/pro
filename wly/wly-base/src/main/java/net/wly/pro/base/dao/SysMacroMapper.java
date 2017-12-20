package net.wly.pro.base.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.base.entity.SysMacroEntity;
import net.wly.pro.common.dao.BaseMapper;

/**
 * 通用字典
 *
 */
@MapperScan
public interface SysMacroMapper extends BaseMapper<SysMacroEntity> {

	List<SysMacroEntity> listNotMacro();

	int countMacroChildren(Long typeId);

}
