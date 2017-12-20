package net.wly.pro.generator.service;

import java.util.Map;

import net.wly.pro.common.entity.Page;
import net.wly.pro.generator.entity.GeneratorParamEntity;
import net.wly.pro.generator.entity.TableEntity;

/**
 * 代码生成器
 *
 */
public interface SysGeneratorService {

	Page<TableEntity> listTable(Map<String, Object> params);
	
	byte[] generator(GeneratorParamEntity params);
	
}
