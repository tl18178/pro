package net.wly.pro.blog.dao;

import org.mybatis.spring.annotation.MapperScan;

import net.wly.pro.common.dao.BaseMapper;
import net.wly.pro.blog.entity.BlogCategoryEntity;

/**
 * 分类表
 *
 * @author TL
 * @email 275012086@qq.com
 * @url 
 * @date 2017年12月28日 下午4:44:22
 */
@MapperScan
public interface BlogCategoryMapper extends BaseMapper<BlogCategoryEntity> {
	
}
