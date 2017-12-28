package net.wly.pro.blog.service;

import java.util.Map;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.R;
import net.wly.pro.blog.entity.BlogCategoryEntity;

/**
 * 分类表
 *
 * @author TL
 * @email 275012086@qq.com
 * @url 
 * @date 2017年12月28日 下午4:44:22
 */
public interface BlogCategoryService {

	Page<BlogCategoryEntity> listBlogCategory(Map<String, Object> params);
	
	R saveBlogCategory(BlogCategoryEntity blogCategory);
	
	R getBlogCategoryById(Long id);
	
	R updateBlogCategory(BlogCategoryEntity blogCategory);
	
	R batchRemove(Long[] id);
	
}
